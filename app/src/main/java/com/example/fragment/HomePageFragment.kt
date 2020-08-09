package com.example.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.jsonapi.network.Constant
import com.example.jsonapi.network.PostService
import com.example.recycler.adapter.ListAdapter
import com.example.recycler.model.ListModel
import com.example.singeactivitymvvm.R
import com.example.singeactivitymvvm.databinding.FragmentHomePageBinding
import kotlinx.android.synthetic.main.fragment_home_page.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HomePageFragment : Fragment(R.layout.fragment_home_page) {


    private var recyclerAdapter: ListAdapter? = null
    private var fragmentMainBinding: FragmentHomePageBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentHomePageBinding.bind(view)
        fragmentMainBinding = binding

        // ApiClient.getClient()?.create(PostService::class.java)?.listPost()
        val retrofit =
            Retrofit.Builder()
                .baseUrl(Constant.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val service = retrofit.create(PostService::class.java)
        val call = service.listPost()

        call.enqueue(object : Callback<List<ListModel>> {
            override fun onFailure(call: Call<List<ListModel>>, t: Throwable) {
                Log.e("tag", t.message.toString())
            }

            override fun onResponse(
                call: Call<List<ListModel>>,
                response: Response<List<ListModel>>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        recyclerAdapter = ListAdapter(it)
                        recycler.adapter = recyclerAdapter

                    }
                }
            }

        })

    }

}

//http://newsapi.org/v2/top-headlines?country=tr&apiKey=3731ae5c419e41faa755f7a7d174fe60