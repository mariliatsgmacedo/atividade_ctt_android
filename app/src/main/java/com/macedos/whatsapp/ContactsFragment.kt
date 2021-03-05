package com.macedos.whatsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.macedos.whatsapp.R
import com.macedos.whatsapp.adapters.ContactsTalksAdapter
import com.macedos.whatsapp.model.Contact

class ContactsFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_contacts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val talkList = mutableListOf<Contact>(
            Contact(null,"Jef", "Quero pão!","00:01 AM"),
            Contact(null,"Mãe", "Quero ir pra pasardága!","09:00 AM"),
            Contact(null,"Pai", "Comprei um carro novo!","15:30 PM"),
        )

        val talksRecycler = view.findViewById<RecyclerView>(R.id.contactsList)

        val contactAdapter = ContactsTalksAdapter(talkList)
        talksRecycler.adapter = contactAdapter
    }
}