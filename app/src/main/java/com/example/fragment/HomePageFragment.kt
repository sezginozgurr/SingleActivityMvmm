package com.example.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.jsonapi.network.ApiClient
import com.example.recycler.model.PostsModel
import com.example.singeactivitymvvm.R
import com.example.singeactivitymvvm.databinding.FragmentHomePageBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomePageFragment : Fragment(R.layout.fragment_home_page) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentHomePageBinding.bind(view)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        ApiClient.getClient().listPost()
            .enqueue(object : Callback<PostsModel> {
                override fun onFailure(call: Call<PostsModel>, t: Throwable) {
                    Log.d("TAG", "onResponseFail: ${t.message} ")
                    Log.d("TAG", "onResponseFail: ${t.localizedMessage} ")
                    Log.d("TAG", "onResponseFail: ${t.cause} ")
                }

                override fun onResponse(
                    call: Call<PostsModel>,
                    response: Response<PostsModel>
                ) {
                    Log.d("TAG", "onResponse:${response.isSuccessful} ")
                }
            })
    }
}

//http://newsapi.org/v2/top-headlines?country=tr&apiKey=3731ae5c419e41faa755f7a7d174fe60