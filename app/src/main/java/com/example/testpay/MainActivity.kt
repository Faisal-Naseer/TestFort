package com.example.testpay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.payfort.fortpaymentsdk.views.FortCardNumberView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fortCardView = findViewById<FortCardNumberView>(R.id.edtCardNumber)
        fortCardView.isEnabled = true
    }
}