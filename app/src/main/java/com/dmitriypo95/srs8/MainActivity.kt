package com.dmitriypo95.srs8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userNameList: List<String> =
            listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15")

        val carList: List<Car> = listOf(
            Car("Audi", "Red", 300),
            Car("VG", "Green", 350),
            Car("BMW", "Black", 380)
        )

        val peopleList:List<People.Human> = listOf(
            People.Man("Иван", 22, "+79133936127"),
            People.Woman("Анна", 44, "example@yan.ru")
        )

        val bannerList: List<Banner> = listOf(
            Banner(R.drawable.and1, "Hello"),
            Banner(R.drawable.and1, "Bye"),
            Banner(R.drawable.and1, "Good!")

        )
        val usersRecyclerView: RecyclerView = findViewById(R.id.users_recycler_view)
        usersRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        /*  usersRecyclerView.addItemDecoration(
               DividerItemDecoration(
                   this,
                   DividerItemDecoration.VERTICAL
               )
           )*/
        //usersRecyclerView.adapter = CarAdapter(carList)
        usersRecyclerView.adapter = BannerAdapter(bannerList)

        //usersRecyclerView.adapter = PeopleAdapter(peopleList)

    }
}