package com.avengong.performance.leak

import android.content.Context

// 非静态内部类持有外部类对象的引用，导致的泄漏
class NonStaticInnerClassLeak {
    //    这将会创建一个包含 100000 个 null 值的数组。如果您希望将所有元素初始化为某个特定值，则可以使用 Array(size) { initialValue } 的语法
//    val obj1 = arrayOfNulls<String>(100000)
    val obj2 = Array(100000) { "aa" }
    var objects=ByteArray(80*1024*1024)


   open  class InnerLeak(var context: Context){

       fun leak(){
           SingleInstance.instance.init(context)
       }

    }

}