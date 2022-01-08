package com.example.lesson4kt.ui.fragments

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lesson4kt.MainViewModel
import com.example.lesson4kt.R
import com.example.lesson4kt.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var viewBinding: FragmentSecondBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentSecondBinding.inflate(layoutInflater)
        return viewBinding.root

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        viewModel.counter.observe(viewLifecycleOwner, {
            viewBinding.textBtn.text = it.toString()

        })
    }
}