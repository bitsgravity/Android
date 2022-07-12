package com.bits.android

import android.app.Application
import com.bits.android.root.network.Api
import com.bits.android.root.network.NetworkInterceptor
import com.bits.android.root.preference.PreferenceProvider
import com.bits.android.ui.home.HomeRepository
import com.bits.android.ui.home.HomeViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class AndroidApplication : Application(), KodeinAware {

    companion object{
        lateinit var kodeinDI : Kodein
    }

    override fun onCreate() {
        super.onCreate()
        val kodein by kodein(this.applicationContext)
        kodeinDI = kodein
    }

    override val kodein = Kodein.lazy {
        import(androidXModule(this@AndroidApplication))

        bind() from singleton { PreferenceProvider(instance()) }

        bind() from singleton { Api(instance()) }
        bind() from singleton { NetworkInterceptor(instance()) }

        bind() from provider { HomeViewModelFactory(instance()) }
        bind() from singleton { HomeRepository(instance(), instance()) }
    }
}