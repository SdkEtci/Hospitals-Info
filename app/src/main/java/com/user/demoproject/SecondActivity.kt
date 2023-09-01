package com.user.demoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent= intent
        val selectedHospitalName= intent.getStringExtra("hospitalName")
        val selectedHospitalAddress= intent.getStringExtra("hospitalAddress")
        textView.text= selectedHospitalName
        textView2.text= selectedHospitalAddress

        val selectedHospital= SingletonClass.selectedHospital
        val selectedImage = selectedHospital.image
        imageView.setImageBitmap(selectedImage)
    }
}