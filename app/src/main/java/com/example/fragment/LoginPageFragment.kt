package com.example.fragment

import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import com.example.singeactivitymvvm.R

class LoginPageFragment : Fragment(R.layout.fragment_login_page), View.OnClickListener {

    var navController: NavController? = null

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.giris -> {
                navController?.navigate(R.id.action_loginPageFragment_to_homePageFragment)
            }
            R.id.register -> {
                navController?.navigate(R.id.action_loginPageFragment_to_registerFragment)
            }
        }
    }


}