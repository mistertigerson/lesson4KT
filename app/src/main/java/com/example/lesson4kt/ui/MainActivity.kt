package com.example.lesson4kt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.lesson4kt.MainViewModel
import com.example.lesson4kt.adapters.ViewPagerAdapter
import com.example.lesson4kt.databinding.ActivityMainBinding
import com.example.lesson4kt.ui.fragments.FirstFragment
import com.example.lesson4kt.ui.fragments.SecondFragment
import com.example.lesson4kt.ui.fragments.ThirdFragment

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val fragments = arrayListOf<Fragment>(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment()
        )
        val adapter = ViewPagerAdapter(this)
        adapter.addFragments(fragments)
        viewBinding.myViewPager.adapter = adapter

    }
}