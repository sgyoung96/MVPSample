package com.example.viewpresenterapp

interface ChangeTextContract {
    interface View {
        fun setData(data: String)
    }
    interface Presenter {
        fun setView(view: View)
    }
}