package com.example.recycler.mock

import com.example.recycler.model.ListModel


object MockList {
    fun getMockList(): List<ListModel> {
        val listmodel = ListModel(
            "https://i2.milimaj.com/i/milliyet/75/1200x675/5e6fbf1a5542871cc4474a87.jpg",
            "Cnn Turk",
            "Istanbul da",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. "
        )
        val listmodel1 = ListModel(
            "https://cdn.yenicaggazetesi.com.tr/news/330844.jpg",
            "A Haber",
            "Ankara da",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. "
        )
        val listmodel2 = ListModel(
            "https://icdn.ensonhaber.com/resimler/diger/kok/2019/11/27/muharrem-ince_1949.jpg",
            "Hurriyet",
            "Mugla da",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. "
        )
        val modelList: ArrayList<ListModel> = ArrayList()

        modelList.add(listmodel)
        modelList.add(listmodel1)
        modelList.add(listmodel2)
        return modelList
    }
}