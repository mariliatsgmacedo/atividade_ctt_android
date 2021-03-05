package com.macedos.whatsapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.macedos.whatsapp.R
import com.macedos.whatsapp.model.StatusContact

class StatusAdapter(private val listStatusContact: MutableList<StatusContact>): RecyclerView.Adapter<StatusAdapter.StatusHolder>() {

    class StatusHolder(view: View): RecyclerView.ViewHolder(view){
        val imageContacts: ImageView = view.findViewById(R.id.imageContacts)
        val nameContacts: TextView = view.findViewById(R.id.txtNameContact)
        val messageUpdate: TextView = view.findViewById(R.id.txtMessageUpdate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_status, parent,false)
        return StatusHolder(view)
    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {
        listStatusContact[position].image?.let {
            holder.imageContacts.setImageBitmap(it)
        }

        holder.nameContacts.text = listStatusContact[position].name
        holder.messageUpdate.text = listStatusContact[position].description
    }

    override fun getItemCount(): Int {
        return listStatusContact.size
    }
}