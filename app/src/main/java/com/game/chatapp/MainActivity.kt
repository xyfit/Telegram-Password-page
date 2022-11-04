package com.game.chatapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var editPassword = ""
    private val password = "1234"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<LinearLayout>(R.id.btn_1)
        val btn2 = findViewById<LinearLayout>(R.id.btn_2)
        val btn3 = findViewById<LinearLayout>(R.id.btn_3)
        val btn4 = findViewById<LinearLayout>(R.id.btn_4)
        val btn5 = findViewById<LinearLayout>(R.id.btn_5)
        val btn6 = findViewById<LinearLayout>(R.id.btn_6)
        val btn7 = findViewById<LinearLayout>(R.id.btn_7)
        val btn8 = findViewById<LinearLayout>(R.id.btn_8)
        val btn9 = findViewById<LinearLayout>(R.id.btn_9)
        val btn0 = findViewById<LinearLayout>(R.id.btn_0)
        val checkBtn = findViewById<LinearLayout>(R.id.btn_check)
        val deleteBtn = findViewById<LinearLayout>(R.id.delete_btn)
        val passwordText = findViewById<TextView>(R.id.password_tex)

        btn1.setOnClickListener {
            editPassword += 1
            passwordText.text = editPassword
        }

        btn2.setOnClickListener {
            editPassword += 2
            passwordText.text = editPassword
        }

        btn3.setOnClickListener {
            editPassword += 3
            passwordText.text = editPassword
        }

        btn4.setOnClickListener {
            editPassword += 4
            passwordText.text = editPassword
        }

        btn5.setOnClickListener {
            editPassword += 5
            passwordText.text = editPassword
        }

        btn6.setOnClickListener {
            editPassword += 6
            passwordText.text = editPassword
        }

        btn7.setOnClickListener {
            editPassword += 7
            passwordText.text = editPassword
        }

        btn8.setOnClickListener {
            editPassword += 8
            passwordText.text = editPassword
        }

        btn9.setOnClickListener {
            editPassword += 9
            passwordText.text = editPassword
        }

        btn0.setOnClickListener {
            editPassword += 0
            passwordText.text = editPassword
        }

        checkBtn.setOnClickListener {
            if (editPassword == password){
                Toast.makeText(this, "Ochildi", Toast.LENGTH_SHORT).show()
            }else{
                passwordText.text = null
                editPassword = ""
                Toast.makeText(this, "Noto'ri parol", Toast.LENGTH_SHORT).show()
            }
        }
        deleteBtn.setOnClickListener {
            if (editPassword.isNotBlank()){
                editPassword = editPassword.subSequence(0, editPassword.length-1).toString()
                passwordText.text = editPassword
            }
        }
    }
}