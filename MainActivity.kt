package com.example.poly.polystudentinfo_ant

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.DialogInterface
import android.content.Intent
import android.os.Build
import android.support.v7.app.AlertDialog


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton.setOnClickListener {
            if(emailText.text.toString().equals("way@yahoo.com")&&
                    passText.text.toString().equals("1234")){
                //Link to Page 2
                var intent = Intent(this,SubActivity::class.java)
                var student=Student("Wayroad","0846096241","https://img00.deviantart.net/4131/i/2011/266/6/1/kamen_rider_555_by_idioticlogy-d4aot3x.jpg")
                //นำ intent ทั้งหมดที่มีส่งไปยังหน้าถัดไปด้วย
                intent.putExtra("student",student)

                startActivity(intent)
            }else{
                //dialog
                val builder: AlertDialog.Builder
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    builder = AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert)
                } else {
                    builder = AlertDialog.Builder(this)
                }
                builder.setTitle("Login Failed")
                        .setMessage("Please try again?")
                        //android.R.string.yes สามารถเปลี่ยนไปตามภาษาของแต่ละประเทศ
                        .setPositiveButton(android.R.string.yes, DialogInterface.OnClickListener { dialog, which ->
                            // continue with delete
                        })
                       /* .setNegativeButton(android.R.string.no, DialogInterface.OnClickListener { dialog, which ->
                            // do nothing
                        })*/
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show()
            }
        }
    }
}
