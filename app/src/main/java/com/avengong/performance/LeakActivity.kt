package com.avengong.performance

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.avengong.performance.databinding.ActivityLeakBinding
import java.lang.reflect.Array
import java.util.ArrayList

class LeakActivity :AppCompatActivity(){
    private lateinit var binding: ActivityLeakBinding
    val TAG="Performance-Android"
    // 不会被销毁
    var container=ArrayList<ByteArray>()
    companion object{
        const val allocate_size=30*1024*1024 //30M
        // 不会被销毁
        var activityContainer=ArrayList<Activity>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_leak)
        binding= ActivityLeakBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvLeak.text = "aaaa"
        // 512 m的 ，

        try {
            for ( i in 0..9){
                var aa=ByteArray(allocate_size)
                container.add(aa)
            }
        }catch (e:Exception){
            // 不能捕捉oom
            println("$TAG Exception-catch OOM !!: ${e.message}")
        }
        catch (e:Throwable){
            // 可以捕捉
            println("$TAG Throwable-catch OOM !!: ${e.message}")
        }

        activityContainer.add(this)
    }


}