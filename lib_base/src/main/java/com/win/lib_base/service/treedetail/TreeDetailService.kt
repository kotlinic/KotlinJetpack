package com.win.lib_base.service.treedetail

import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider

/**
 * Create by andy on 2020/5/26
 */
interface TreeDetailService : IProvider {

    fun start(context: Context, cid: Int, title: String)

}