package com.example.viewpresenterapp

class ChangeTextPresenter: ChangeTextContract.Presenter {

    private lateinit var view: ChangeTextContract.View

    override fun setView(view: ChangeTextContract.View) {
        this.view = view
    }

    fun sendData(data: String) {
        view.setData(data)
    }
}