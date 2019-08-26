package com.codingwithmitch.kotlinrecyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getDataFromAssets()
    }


    fun getDataFromAssets(): String?{
        var json: String? = null
        try{
            val inputStream: InputStream = assets.open("data.json")
            val buffer = ByteArray(inputStream.available())
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer)
        }catch (e: IOException){
            e.printStackTrace()
        }
        println("data.json: ${json}")
        return json
    }
}























