package com.example.appvestirna

import android.content.ContentValues
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fourth.*
import kotlinx.android.synthetic.main.activity_main.*

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        var helper = MyDBHelper(applicationContext)
        var db = helper.readableDatabase
        var rs = db.rawQuery("SELECT * FROM USERS", null)

        val spatny=MediaPlayer.create(this,R.raw.velky)

        if(rs.moveToNext()){
            Toast.makeText(applicationContext,rs.getString(1), Toast.LENGTH_LONG).show()
        }

        btnOdeslat.setOnClickListener {
            spatny.start()

            var cv= ContentValues()
            cv.put("UNAME",etName.text.toString())
            cv.put("PWD",etHod.text.toString())
            db.insert("USERS",null,cv)

            etName.setText("")
            etHod.setText("")
            etName.requestFocus()
        }
        btnzpet3.setOnClickListener {
            finish()
        }
    }
}