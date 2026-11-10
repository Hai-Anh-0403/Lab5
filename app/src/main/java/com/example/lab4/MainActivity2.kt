package com.example.lab4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    lateinit var ed_name: EditText
    lateinit var ed_phone: EditText
    lateinit var bt_add: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ed_name = findViewById(R.id.ed_name)
        ed_phone = findViewById(R.id.ed_phone)
        bt_add = findViewById(R.id.bt_add)

        val intent=getIntent()
        val t1=intent.getStringExtra("name")
        val t2=intent.getStringExtra("detail")
        ed_phone.setText(t2)
        ed_name.setText(t1)
        bt_add.setOnClickListener {
            val name = ed_name.text.toString()
            val phone = ed_phone.text.toString()
            ListItems.add(Items(name, phone, R.drawable.anh1))
            finish()
        }
    }
}