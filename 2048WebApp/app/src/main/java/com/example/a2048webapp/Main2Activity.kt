package com.example.a2048webapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val background = object : Thread(){
            override fun run() {
                try {
                    sleep(3500)

                    val intent = Intent(baseContext, NewGame::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
                finally {
                    finish()
                }
            }
        }
        background.start()
    }
}
