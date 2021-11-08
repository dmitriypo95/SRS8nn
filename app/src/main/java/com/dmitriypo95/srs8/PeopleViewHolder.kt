package com.dmitriypo95.srs8

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PeopleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val contactInfoTextView: TextView = itemView.findViewById(R.id.contact_text_view)

    fun bindMan(man: People.Man) {
        contactInfoTextView.text = "Номер телефона${man.phoneNumber}"
    }

    fun bindWoman(woman: People.Woman) {
        contactInfoTextView.text = "Email ${woman.email}"

    }

    fun bind(human: People.Human) {
        val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        val ageTextView: TextView = itemView.findViewById(R.id.age_text_view)
        nameTextView.text = human.name
        ageTextView.text = "${human.age} лет"
        when (human) {
            is People.Man -> bindMan(human)
            is People.Woman -> bindWoman(human)
        }
    }
}