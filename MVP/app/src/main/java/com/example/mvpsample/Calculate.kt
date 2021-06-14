package com.example.mvpsample

class Calculate: SendDataContract.Presenter {

    private lateinit var view: SendDataContract.View

    override fun setView(view: SendDataContract.View) {
        this.view = view
    }

    override fun sendData(data: String) {
        view.setText(data.toInt() * 2)
    }
}