package com.macedos.whatsapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.macedos.whatsapp.CallsFragment
import com.macedos.whatsapp.ContactsFragment
import com.macedos.whatsapp.StatusFragment

class PagerAdapter(fragment: FragmentManager) :FragmentPagerAdapter(fragment) {

    override fun getCount(): Int {
        return 3
    }

    //Relação entre ITEM/POSIÇÃO a FRAGMENT a ser exibida
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> ContactsFragment()
            1 -> StatusFragment()
            2 -> CallsFragment()
            else -> ContactsFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Conversas"
            1 -> "Status"
            2 -> "Chamadas"
            else -> super.getPageTitle(position)
        }
    }

}