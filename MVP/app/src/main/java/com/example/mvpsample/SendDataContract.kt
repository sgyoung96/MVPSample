package com.example.mvpsample

interface SendDataContract {

    interface View {
        fun setText(result: Int)
    }

    interface Presenter {
        fun setView(view: View)
        fun sendData(data: String)
    }
}