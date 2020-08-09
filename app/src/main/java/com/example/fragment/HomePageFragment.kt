package com.example.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.jsonapi.network.ApiClient
import com.example.model.Article
import com.example.model.PostsModel
import com.example.recycler.adapter.ListhAdapter
import com.example.singeactivitymvvm.R
import com.example.singeactivitymvvm.databinding.FragmentHomePageBinding
import kotlinx.android.synthetic.main.fragment_home_page.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomePageFragment : Fragment(R.layout.fragment_home_page) {

    private var recyclerAdapter: ListhAdapter? = null
    private var listRecycle: List<Article>? = null
    lateinit var binding: FragmentHomePageBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomePageBinding.bind(view.rootView)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.progressBar.visibility = View.VISIBLE
        binding.recycler.visibility = View.GONE
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
                    if (response.isSuccessful) {
                        binding.progressBar.visibility = View.GONE
                        binding.recycler.visibility = View.VISIBLE
                        //Log.d("TAG", "onResponse:${response.isSuccessful} ")
                        response.body()?.let {
                            recyclerAdapter = ListhAdapter(it.articles)
                            recycler.adapter = recyclerAdapter

                        }
                    }

                }
            })
    }
}

//http://newsapi.org/v2/top-headlines?country=tr&apiKey=3731ae5c419e41faa755f7a7d174fe60