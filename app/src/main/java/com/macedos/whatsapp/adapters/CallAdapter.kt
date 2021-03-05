package com.macedos.whatsapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.macedos.whatsapp.R
import com.macedos.whatsapp.model.CallsContact

class CallAdapter(private val callsList: MutableList<CallsContact>) : RecyclerView.Adapter<CallAdapter.CallHolder>(){

    class CallHolder(view:View):RecyclerView.ViewHolder(view){
        val imageContactsCall: ImageView = view.findViewById(R.id.image_contact_call)
        val nameContactsCall: TextView = view.findViewById(R.id.txt_name_call)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallAdapter.CallHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_calls,parent,false)
        return CallHolder(view)
    }

    override fun onBindViewHolder(holder: CallAdapter.CallHolder, position: Int) {
       callsList[position].image?.let{
           holder.imageContactsCall.setImageBitmap(it)
       }

        holder.nameContactsCall.text = callsList[position].name
    }

    override fun getItemCount(): Int {
        return callsList.size
    }
}