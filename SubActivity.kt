package com.example.poly.polystudentinfo_ant

import android.graphics.Bitmap
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*
import android.graphics.BitmapFactory
import java.net.URL
import java.net.URLClassLoader


class SubActivity : AppCompatActivity() {
    lateinit var student:Student
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        var intent = this.intent

        student = intent.extras.getSerializable("student")as Student

        nameText.text=student.name
        telText.text=student.tal
    }
}
