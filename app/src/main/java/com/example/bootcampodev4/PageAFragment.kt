package com.example.bootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.bootcampodev4.databinding.FragmentMainBinding
import com.example.bootcampodev4.databinding.FragmentPageABinding


class PageAFragment : Fragment() {

    private lateinit var binding: FragmentPageABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPageABinding.inflate(inflater,  container, false)

        binding.pageB.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.pageAtoPageB)
        }

        return binding.root
    }

}