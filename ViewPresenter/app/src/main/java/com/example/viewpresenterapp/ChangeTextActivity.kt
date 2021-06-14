package com.example.viewpresenterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class ChangeTextActivity : AppCompatActivity(), ChangeTextContract.View {

    lateinit var presenter: ChangeTextPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = ChangeTextPresenter()
        presenter.setView(this)

        btn_click.setOnClickListener {
            presenter.sendData(et_text.text.toString())
        }
    }

    override fun setData(data: String) {
        tv_text.text = data
    }
}


/*

1. View 의 데이터를 Presenter 로 넘긴다.
2. Presenter 에서 데이터를 가공한다.
3. 가공한 데이터를 다시 View 로 던진다.
4. 전달받은 데이터를 화면에 출력한다.

  준비물 : View, Presenter, Interface(Google 가이드 참고)
화면 구상 : EditText 의 입력값을 Button 클릭시 TextView 로 전달한다.

[View]
presenter 객체 생성. button 클릭 시 presenter.함수 호출, 동시에 데이터 전달
[Presenter]
presenter.함수에서 받은 데이터를 가공, 다시 view 로 데이터를 전달
[View]
presenter.함수에서 호출한 view.함수에서 매개변수를 textView 에 세팅

***
fun setView (view 를 넘김!)
***
Interface Contract {
    Interface View {
    }
    Interface Presenter {
    }
}

 */