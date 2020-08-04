package com.example.recycler.mock

import com.example.recycler.model.ListModel


/**     Code with ❤
╔════════════════════════════╗
║  Created by Özgür Can  ║
╠════════════════════════════╣
║ sezginzgurr@gmail.com ║
╠════════════════════════════╣
║     04/08/2020 - 15:35     ║
╚════════════════════════════╝
 */
object MockList {
    fun getMockList(): List<ListModel> {
        val listmodel = ListModel(
            "https://upload.wikimedia.org/wikipedia/tr/b/b0/Annem_2019.jpg",
            "Film 1",
            "Detail "
        )
        val listmodel1 = ListModel(
            "https://upload.wikimedia.org/wikipedia/tr/b/b0/Annem_2019.jpg",
            "Film 1",
            "Detail "
        )
        val listmodel2 = ListModel(
            "https://upload.wikimedia.org/wikipedia/tr/b/b0/Annem_2019.jpg",
            "Film 1",
            "Detail "
        )
        val modelList: ArrayList<ListModel> = ArrayList()

        modelList.add(listmodel)
        modelList.add(listmodel1)
        modelList.add(listmodel2)
        return modelList
    }
}