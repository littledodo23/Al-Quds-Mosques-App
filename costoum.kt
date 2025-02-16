package com.example.user.algudsmosques

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.iteam.view.*

class costoum(context: Context, private  val objects: Array<  String>) : ArrayAdapter<String>(context, R.layout.iteam, objects) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view= LayoutInflater.from(context).inflate(R.layout.iteam,parent,false)
        view.textView.text=objects!![position]
        return view

    }
}