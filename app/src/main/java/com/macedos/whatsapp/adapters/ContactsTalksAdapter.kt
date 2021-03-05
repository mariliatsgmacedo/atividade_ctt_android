package com.macedos.whatsapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.macedos.whatsapp.R
import com.macedos.whatsapp.model.Contact

class ContactsTalksAdapter(private val contactsList: MutableList<Contact>): RecyclerView.Adapter<ContactsTalksAdapter.TalksHolder>() {
    class TalksHolder(view: View) : RecyclerView.ViewHolder(view){
        val contactName: TextView = view.findViewById(R.id.txtStatusContact)
        val lastMessage: TextView = view.findViewById(R.id.txtMessage)
        val hourMessage: TextView = view.findViewById(R.id.txtHour)
        val contactImage: ImageView = view.findViewById(R.id.imageContact)
    }

    fun addContact(newContact: Contact){
        contactsList.add(newContact)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TalksHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact,parent, false)
        return TalksHolder(view)
    }

    override fun onBindViewHolder(holder: TalksHolder, position: Int) {
        contactsList[position].image?.let {
            holder.contactImage.setImageBitmap(it)
        }

        holder.contactName.text = contactsList[position].name
        holder.lastMessage.text = contactsList[position].lastMessage
        holder.hourMessage.text = contactsList[position].hourMessage
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}