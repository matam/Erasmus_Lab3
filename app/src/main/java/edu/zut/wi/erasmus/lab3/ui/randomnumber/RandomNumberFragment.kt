package edu.zut.wi.erasmus.lab3.ui.randomnumber

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import edu.zut.wi.erasmus.lab3.R
import edu.zut.wi.erasmus.lab3.databinding.FragmentRandomnumberBinding

class RandomNumberFragment  : Fragment() {

    private lateinit var randomNumberViewModel: RandomNumberViewModel
    private lateinit var binding: FragmentRandomnumberBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_randomnumber,
            container,
            false
        )
        randomNumberViewModel =
            ViewModelProvider(this).get(RandomNumberViewModel::class.java)
        //val root = inflater.inflate(R.layout.fragment_randomnumber, container, false)
        val randomNumberText: TextView = binding.root.findViewById(R.id.randomNumberText)
        randomNumberViewModel.text.observe(viewLifecycleOwner, Observer {
            randomNumberText.text = it
        })
        binding.viewModel=randomNumberViewModel
        return binding.root
    }
}