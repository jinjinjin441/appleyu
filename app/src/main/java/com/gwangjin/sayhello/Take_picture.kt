package com.gwangjin.sayhello

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.takepicture.*

class Take_picture : AppCompatActivity() {

    val TAG = "Take_picture"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.takepicture)

        var count_picture = 0

        takeonePicture.setOnClickListener {
            count_picture += 1
            Log.d(TAG, "$count_picture 회 촬영하였습니다")
            counterofpic.setText("$count_picture / 10회 촬영하였습니다.")
            if (count_picture == 8){
                counterofpic.setText("촬영을 완료하였습니다.")
                takeonePicture.setText("편집하기")
//                takeonePicture.setOnClickListener{
//                    Log.d(TAG, "move to takePicture page")
//                    startActivity(Intent(this@Take_picture,Edit_picture::class.java))
//                }
            }
        }


    }
}