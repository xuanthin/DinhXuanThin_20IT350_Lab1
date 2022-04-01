package com.example.vidunhom11_2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCong.setOnClickListener{
            var so1: Double = (etNumber1.text.toString()).toDouble()
            var so2: Double = (etNumber2.text.toString()).toDouble()
            val ketqua: Double = so1 + so2
            txtketqua.text = ketqua.toString()
        }
        btnTru.setOnClickListener{
            var so1: Double = (etNumber1.text.toString()).toDouble()
            var so2: Double = (etNumber2.text.toString()).toDouble()
            val ketqua: Double = so1 - so2
            txtketqua.text = ketqua.toString()
        }
        btnNhan.setOnClickListener{
            var so1: Double = (etNumber1.text.toString()).toDouble()
            var so2: Double = (etNumber2.text.toString()).toDouble()
            val ketqua: Double = so1 * so2
            txtketqua.text = ketqua.toString()
        }
        btnChia.setOnClickListener{
            var so1: Double = (etNumber1.text.toString()).toDouble()
            var so2: Double = (etNumber2.text.toString()).toDouble()
            val ketqua: Double = so1 / so2
            txtketqua.text = ketqua.toString()
        }
    }
}