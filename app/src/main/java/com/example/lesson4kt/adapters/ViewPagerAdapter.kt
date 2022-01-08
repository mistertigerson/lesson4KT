package com.example.lesson4kt.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lesson4kt.ui.MainActivity

class ViewPagerAdapter(activity: MainActivity) : FragmentStateAdapter(activity) {

    private var fragments = arrayListOf<Fragment>()

    fun addFragments(list: ArrayList<Fragment>){
        this.fragments = list
    }

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}