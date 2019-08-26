package com.codingwithmitch.kotlinrecyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codingwithmitch.kotlinrecyclerviewexample.models.BlogPost
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = convertJsonToBlogPosts(JSONArray(getDataFromAssets()))
    }



    fun convertJsonToBlogPosts(jsonArray: JSONArray): ArrayList<BlogPost>{
        val list = ArrayList<BlogPost>()
        for(i in 0 until jsonArray.length()){
            list.add(
                BlogPost(
                    (jsonArray[i] as JSONObject)["title"] as String,
                    (jsonArray[i] as JSONObject)["body"] as String,
                    (jsonArray[i] as JSONObject)["image"] as String,
                    (jsonArray[i] as JSONObject)["username"] as String
                    )
            )
        }
        return list
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
//        println("data.json: ${json}")
        return json
    }
}























