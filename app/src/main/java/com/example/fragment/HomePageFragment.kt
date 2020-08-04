package com.example.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.recycler.adapter.ListAdapter
import com.example.recycler.mock.MockList
import com.example.singeactivitymvvm.R
import com.example.singeactivitymvvm.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment(R.layout.fragment_home_page) {

    private var fragmentMainBinding: FragmentHomePageBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentHomePageBinding.bind(view)
        fragmentMainBinding = binding
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fragmentMainBinding?.recycler?.adapter = ListAdapter(MockList.getMockList())
    }
}