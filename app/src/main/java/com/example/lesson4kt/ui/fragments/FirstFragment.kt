package com.example.lesson4kt.ui.fragments

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.lesson4kt.MainViewModel
import com.example.lesson4kt.R
import com.example.lesson4kt.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var viewBinding: FragmentFirstBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentFirstBinding.inflate(inflater,container,false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        incrementplus()
        decrementminus()

        viewModel.counter.observe(viewLifecycleOwner, {
            viewBinding.welcome.text = it.toString()
            Log.e(ContentValues.TAG, "onViewCreated: " + it)

        })
    }

    private fun decrementminus() {
        viewBinding.decrementBtn.setOnClickListener(){
            viewModel.decrement()
        }
    }

    private fun incrementplus() {
        viewBinding.incrementBtn.setOnClickListener(){
            viewModel.increment()

        }
    }




}