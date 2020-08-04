package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import com.example.singeactivitymvvm.R

class RegisterFragment : Fragment(), View.OnClickListener {

    var navController: NavController? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.rgstd_btn -> {
                navController?.navigate(R.id.action_homePageFragment_to_detailFragment)
            }
        }
    }
}