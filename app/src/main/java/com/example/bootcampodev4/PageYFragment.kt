package com.example.bootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.bootcampodev4.databinding.FragmentMainBinding
import com.example.bootcampodev4.databinding.FragmentPageABinding
import com.example.bootcampodev4.databinding.FragmentPageYBinding


class PageYFragment : Fragment() {

    private lateinit var binding: FragmentPageYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPageYBinding.inflate(inflater,  container, false)

        return binding.root
    }

}