package com.win.ft_home.ui.tree

import com.win.ft_home.api.RequestCenter
import com.win.ft_home.model.tree.TreeData
import com.win.lib_net.model.NetResult
import com.win.lib_net.net.BaseRepository
import com.win.lib_net.net.RetrofitClient

/**
 * Create by andy on 2020-05-21
 */
class TreeRepository(private val service: RetrofitClient) : BaseRepository() {

    suspend fun getTreeList(): NetResult<MutableList<TreeData>> {
        return callRequest(call = { requestTreeList() })
    }

    private suspend fun requestTreeList() =
        handleResponse(service.create(RequestCenter::class.java).getTreeList())

}