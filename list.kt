package com.example.user.algudsmosques

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list.*

class list : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val n = arrayOf("المسجد الأقصى","جامع عمر بن الخطاب","مسجد الشيخ ريحان","مسجد الشيخ لولو","مسجد عثمان بن عفان ","المسجد اليعقوبي","المسجد العمري")
val adapte=costoum(this,n)
        listView.adapter=adapte
    }
}
