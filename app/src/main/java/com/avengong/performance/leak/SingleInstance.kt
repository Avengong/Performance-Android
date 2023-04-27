package com.avengong.performance.leak

import android.content.Context

open class SingleInstance private constructor(){
    var context:Context?=null
    fun init(context: Context) {
        this.context=context

    }

    // 静态内部类写法
//    companion object{
//        fun getInstance():SingleInstance{
//            return Helper.instance
//        }
//    }
//
//    private object Helper{
//        var instance=SingleInstance()
//    }

    // dcl写法
    companion object{
        val instance by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            SingleInstance()
        }
    }


}