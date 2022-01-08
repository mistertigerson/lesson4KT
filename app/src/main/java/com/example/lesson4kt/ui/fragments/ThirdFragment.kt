package com.example.lesson4kt.ui.fragments

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.lesson4kt.MainViewModel
import com.example.lesson4kt.R
import com.example.lesson4kt.databinding.FragmentSecondBinding
import com.example.lesson4kt.databinding.FragmentThirdBinding

class ThirdFragment : Fragment(R.layout.fragment_third) {

    private lateinit var viewBinding: FragmentThirdBinding
    private lateinit var viewModel: MainViewModel
    private val list = mutableListOf<String>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentThirdBinding.inflate(layoutInflater)
        return viewBinding.root

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        viewModel.counterTwo.observe(viewLifecycleOwner, {
           list.add(it.toString())
            viewBinding.textTv.text = list.toString()
            Log.e(TAG, "onViewCreaaaated: $it")
        })
    }
}