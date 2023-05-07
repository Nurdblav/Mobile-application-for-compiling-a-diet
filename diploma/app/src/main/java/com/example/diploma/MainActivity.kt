package com.example.diploma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var dishList: ArrayList<Dish> = ArrayList()
    lateinit var breakfastListView: ListView
    lateinit var lunchListView: ListView
    lateinit var dinnerListView: ListView
    var dishAdapter: DishListsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        dishList.add(Dish( "Манная каша на клюквенном соке", 200, 112.7, 1.9, 4.6, 17.1))
        dishList.add(Dish( "Гренки острые", 100, 269.3, 15.4, 13.2, 23.6))
        dishList.add(Dish("Какао с молоком", 200, 102.8, 2.9, 2.9, 17.2))

        dishList.add(Dish("Борщ",300, 57.7, 3.8, 2.9, 4.3))
        dishList.add(Dish("Котлеты по-гречески",300, 178.1, 6.4, 6.7, 24.6))
        dishList.add(Dish( "Салат \"Весна\"", 200, 90.3, 3.5, 7.4, 3.1))

        dishList.add(Dish("Салат из редиски со метаной", 200, 106.4, 2.6, 9.3, 4.1))
        dishList.add(Dish("Куриное филе, фаршированное грибами", 200, 226.2, 13.4, 18.2, 0.5))

        dishAdapter = DishListsAdapter(this, dishList.slice(0..2) as ArrayList<Dish>)
        breakfastListView = findViewById(R.id.breakfastDishListView)
        breakfastListView.adapter = dishAdapter

        dishAdapter = DishListsAdapter(this, dishList.slice(3..5) as ArrayList<Dish>)
        lunchListView = findViewById(R.id.lunchDishListView)
        lunchListView.adapter = dishAdapter

        dishAdapter = DishListsAdapter(this, dishList.slice(6..7) as ArrayList<Dish>)
        dinnerListView = findViewById(R.id.dinnerDishListView)
        dinnerListView.adapter = dishAdapter

    }
}