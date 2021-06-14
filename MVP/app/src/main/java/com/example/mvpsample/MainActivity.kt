package com.example.mvpsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SendDataContract.View {

    val presenter = Calculate()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.setView(this)
        btn_click.setOnClickListener {
            presenter.sendData(et_text.text.toString())
        }
    }

    override fun setText(result: Int) {
        tv_text.text = result.toString()
    }
}