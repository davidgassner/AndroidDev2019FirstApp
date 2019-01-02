package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        monster01.setOnClickListener{viewMonsterImage(R.drawable.monster01)}
        monster02.setOnClickListener{viewMonsterImage(R.drawable.monster02)}
        monster03.setOnClickListener{viewMonsterImage(R.drawable.monster03)}
        monster04.setOnClickListener{viewMonsterImage(R.drawable.monster04)}
    }

    private fun viewMonsterImage(monsterId: Int) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.setAction(Intent.ACTION_VIEW)

        val uri = Uri.parse("http://com.example.myfirstapp/view?id=$monsterId")
        intent.data = uri

        intent.putExtra("monsterId", monsterId)

        startActivity(intent)
    }

}
