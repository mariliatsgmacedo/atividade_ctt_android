package com.macedos.whatsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.macedos.whatsapp.adapters.CallAdapter
import com.macedos.whatsapp.model.CallsContact

class CallsFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calls,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val callsContact = mutableListOf<CallsContact>(
            CallsContact(null,"Mãe"),
            CallsContact(null,"Pai"),
            CallsContact(null,"Jef")
        )

        val callsList = view.findViewById<RecyclerView>(R.id.calls_contact)
        val callsAdapter = CallAdapter(callsContact)

        callsList.adapter = callsAdapter
    }
}