package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList
import kotlin.math.max

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val b = 10;//定义一个不可变的Int值
    val c: Int = 5
    var d: Int = 0
    lateinit var e: String//lateinit表示这个值不会为空
    var f: String = "lll"
    var a = "ll";//定义一个可变的String
    var list=ArrayList<String>()
    val bean:Bean=Gson().fromJson("{\n" +
            "    \"oenId\": 1,\n" +
            "    \"app_user_id\": 35,\n" +
            "    \"token\": \"NWQ0NmMzNTJhZTg2NGRmZmEzMDNjOTU3MGE1MjhlNTY=\",\n" +
            "    \"device\": \"iOS\",\n" +
            "    \"version\": \"1.0.10\"\n" +
            "}",Bean::class.java)
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.text_text ->

                Toast.makeText(this, "dianj", Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sum = max1(10, 5)

        text_text.setOnClickListener(this)
        Log.d("test", sum.toString())

        val los = getLos("lol")
        Log.d("getLoss",los.toString())


        Is(2)
        list.add("rr")
        list.add("rrwww")
        list.add("rrww")
        list.add("rrwwwww")
        for (i in 0 until  list.size){//遍历列表
            Log.d("list",list[i].toString())
        }
        val maxBy = list.maxBy { it.length }//获取长度最长的条目

        Log.d("----------",maxBy)
        Log.d("bean",bean.version)
    }

    fun max(a: Int, b: Int): Int? {
        return max(a, b)
    }

    fun max1(a: Int, b: Int): Int = if (a > b) a else b

    fun getLos(name:String?):Int=when(name){
        "lol"->5
        "l"->8
        else->0
    }

    fun  Is(num:Number){
        when(num){
            is Int->   Log.d("is",getLos(null).toString())
            is Double->Log.d("is","double")
        }
    }

}
