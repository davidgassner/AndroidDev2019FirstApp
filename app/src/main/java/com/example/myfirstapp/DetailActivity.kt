package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

        Log.i("Intents", "Action = ${intent.action}")

        val lastPart = intent.data?.lastPathSegment
        if (lastPart!!.equals("view")) {
            val monsterId = intent.data?.getQueryParameter("id")
            Log.i("Intents", "Query parameter = $monsterId")
        }

        val extraId = intent.extras!!.getInt("monsterId")
        Log.i("Intents", "Extra value = $extraId")

        monsterImage.setImageResource(extraId)
    }

}
