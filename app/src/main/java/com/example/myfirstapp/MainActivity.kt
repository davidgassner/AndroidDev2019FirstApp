package com.example.myfirstapp

import android.content.Intent
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
    }

    private fun viewMonsterImage(monsterId: Int) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.setAction(Intent.ACTION_VIEW)
        startActivity(intent)
    }

}
