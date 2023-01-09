package com.gwangjin.sayhello

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.editpicture.*

class Edit_picture : AppCompatActivity() {

    val TAG = "Edit_picture"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editpicture)
        var count = 0
        pic1.setOnClickListener{
            count +=1
            pic1.isSelected = pic1.isSelected != true
            complete_btn.setText("$count / 4")
        }
        pic2.setOnClickListener{
            count +=1
            pic2.isSelected = pic2.isSelected != true
            complete_btn.setText("$count / 4")
        }
        pic3.setOnClickListener{
            count +=1
            pic3.isSelected = pic3.isSelected != true
            complete_btn.setText("$count / 4")
        }
        pic4.setOnClickListener{
            count +=1
            pic4.isSelected = pic4.isSelected != true
            complete_btn.setText("$count / 4")
        }

        if(count == 4){

            complete_btn.setText("선택완료")
        }

        complete_btn.setOnClickListener {

        }
    }
}