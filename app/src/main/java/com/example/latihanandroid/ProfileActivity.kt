package com.example.latihanandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_sign_in.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btnEdit.setOnClickListener {
            var intent = Intent(this@ProfileActivity, EditProfileActivity::class.java)
            startActivity(intent)
        }
        btnReset.setOnClickListener {
            var intent = Intent(this@ProfileActivity, EditPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}