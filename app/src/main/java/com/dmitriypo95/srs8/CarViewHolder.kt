package com.dmitriypo95.srs8

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(car: Car) {
        val brandTextView:TextView = itemView.findViewById(R.id.brand_text_view)
        val colorTextView:TextView = itemView.findViewById(R.id.color_text_view)
        val speedTextView:TextView = itemView.findViewById(R.id.speed_text_view)

        brandTextView.text = car.brand
        colorTextView.text = car.color
        speedTextView.text = "${car.maxSpeed} km/h"
    }
}