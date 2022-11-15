package com.bits.android.modules.injection

import android.content.Context
import com.bits.android.data.local.database.AppDatabase
import com.bits.android.data.local.database.daos.PersonsDao
import com.bits.android.data.network.utils.NetworkInterceptor
import com.bits.android.data.network.api.Api
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return AppDatabase.invoke(appContext)
    }

    @Provides
    fun providePersonsDao(appDatabase: AppDatabase): PersonsDao {
        return appDatabase.getPersonsDao()
    }

    @Provides
    fun provideApi(networkInterceptor: NetworkInterceptor) : Api {
        return Api.invoke(networkInterceptor)
    }
}