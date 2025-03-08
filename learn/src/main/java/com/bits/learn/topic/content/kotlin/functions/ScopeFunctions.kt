package com.bits.learn.topic.content.kotlin.functions

fun main(){
    let()
    run()
    with()
    apply()
    also()
}

data class Person(
    var name: String? = null,
    var isAdult: Boolean? = null,
    var weight: Double? = null, //In kilograms (Ex: 70 KG)
    var height: Double? = null //In meters (Ex: 1.75 Meters)
)

/***************************************
                LET
****************************************
Null safety & Transformations

Practical Use Cases / Real World Examples
-----------------------------------------
[Intents ]
Helpful while using intents with safe null check
//    val intent: Intent? = getIntent()
//    intent?.let { // Execute only if `intent` is not null
//        val data = it.getStringExtra("EXTRA_DATA")
//        showToast("Received data: $data")
//    }
****************************************/
fun let() {
    val person = Person(
        name = "John"
    )
    person.name?.let { //Will enter block since name is assigned above and not null
        println("Name is $it")
    }
    person.isAdult?.let { //Wont enter this block because isAdult is null and not initialized
        println("Above 18 Years of Age : $it")
    }
}

/***************************************
                RUN
****************************************
[Used mainly for Calculations]
[Return the result of last statement in block]

Practical Use Cases / Real World Examples
------------------------------------------
[App Database]
Creating a database instance and returning it
to a variable by executing final build statement
Returns the final database instance
val database = Room.databaseBuilder(
                      applicationContext,
                      AppDatabase::class.java,
                      "my_database"
                    ).run {
                      allowMainThreadQueries() // Normally not recommended
                      fallbackToDestructiveMigration()
                      build()
                  }

[Mathematical Geometry - Circumference of a circle]
[Mathematical Geometry - Area of a rectangle]
****************************************/
fun run() {
    val person = Person(
        name = "John",
        weight = 78.0,
        height = 1.75
    )
    val bodyMassIndex = person.run {
        println("Calculating BMI...")
        weight!! / (height!! * height!!)
    }
    println("Body Mass Index : $bodyMassIndex")
}

/**************************************
                WITH
 ***************************************
        Highlights / Key Points
----------------------------------------
[Improves Readability]
[Avoids repeated reference]

Practical Use Cases / Real World Examples
------------------------------------------
[Shared Preferences]
//    val sharedPrefs = getSharedPreferences("UserPrefs", MODE_PRIVATE)
//    with(sharedPrefs.edit()) {
//        putString("username", "JohnDoe")
//        putBoolean("isLoggedIn", true)
//        apply()
//    }
 ***************************************/
fun with() {
    val person = Person(
        name = "John",
        isAdult = false
    )
    with(person){
        println("Name is $name")
        println("Above 18 Years of Age : $isAdult")
    }
}

/**************************************
                APPLY
 **************************************
[Assigning more details after initialization]
Object configuration with more details

//    val recyclerView = findViewById<RecyclerView>(R.id.recyclerView).apply {
//        layoutManager = LinearLayoutManager(context)
//        adapter = MyAdapter(listOfItems)
//        setHasFixedSize(true)
//    }
 ***************************************/
fun apply() {
    val person = Person(
        name = "John"
    )
    person.apply {
        isAdult = true
    }
    println("Above 18 Years of Age : ${person.isAdult}")
}

/**************************************
                ALSO
 ***************************************
[Logging, Debugging, Validation] Performing side effects

//    val response = apiService.getUserDetails().also {
//        Log.d("API_RESPONSE", "Received: $it")
//    }
 ***************************************/
fun also() {
    val person = Person(
        name = "John",
        isAdult = false
    )
    person.also {
        println("Updating John details...")
        println("Name : ${it.name}")
        println("isAdult : ${it.isAdult}")
    }
}