package com.macedos.whatsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.macedos.whatsapp.R
import com.macedos.whatsapp.adapters.StatusAdapter
import com.macedos.whatsapp.model.StatusContact

class StatusFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_status,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val statusContact = mutableListOf<StatusContact>(
            StatusContact(null,"Jef", "Ser ou não ser!"),
            StatusContact(null,"Mãe", "Quero ser grande."),
            StatusContact(null,"Pai","Atenção Mundo!")
        )

        val statusList = view.findViewById<RecyclerView>(R.id.statusContact)
        val statusAdapter = StatusAdapter(statusContact)

        statusList.adapter = statusAdapter
    }
}