package com.win.ft_home.ui.home

import com.win.ft_home.api.RequestCenter
import com.win.ft_home.model.home.Banner
import com.win.ft_home.model.home.DataFeed
import com.win.lib_net.net.BaseRepository
import com.win.lib_net.net.RetrofitClient
import com.win.lib_net.model.NetResult

/**
 * Create by andy on 2020-05-18
 */
class HomeRepository(private val service: RetrofitClient) : BaseRepository() {

    suspend fun getBanner(): NetResult<List<Banner>> {
        return callRequest(call = { requestBanner() })
    }

    suspend fun getHomeList(count: Int): NetResult<DataFeed> {
        return callRequest(call = { requestHomeList(count) })
    }

    private suspend fun requestBanner() =
        handleResponse(service.create(RequestCenter::class.java).getBanner())

    private suspend fun requestHomeList(count: Int) =
        handleResponse(
            service.create(RequestCenter::class.java).getHomeList(count)
        )


}