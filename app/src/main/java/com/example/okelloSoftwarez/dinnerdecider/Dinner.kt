package com.okelloSoftwarez.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.okelloSoftwarez.dinnerdecider.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class Dinner : AppCompatActivity() {
    private val foodlist = arrayListOf("Chinesse","Hamburger","pololo","Pizza","Barros Pizza")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decinebtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodlist.count())
            selectedFoodTest.text = foodlist[randomFood]
        }
        addfoodbtn.setOnClickListener {
            val newFood = addfoodtxt.text.toString()
            foodlist.add(newFood)
            addfoodtxt.text.clear()
        }
    }
}
