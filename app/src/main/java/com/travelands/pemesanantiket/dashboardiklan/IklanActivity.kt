package com.travelands.pemesanantiket.dashboardiklan

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.travelands.pemesanantiket.R
import com.travelands.pemesanantiket.listhotel.listhotel
import com.travelands.pemesanantiket.login.LoginActivity
import com.travelands.pemesanantiket.view.history.HistoryActivity
import com.travelands.pemesanantiket.view.main.MainActivity
import kotlinx.android.synthetic.main.activity_history.*
import kotlinx.android.synthetic.main.activity_history.toolbar
import kotlinx.android.synthetic.main.activity_iklan.*
import kotlinx.android.synthetic.main.activity_input_data.*
import kotlinx.android.synthetic.main.activity_main.*

class IklanActivity : AppCompatActivity() {
    private fun setToolbar() {
        setSupportActionBar(toolbar)
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setDisplayShowTitleEnabled(false)
        }
    }

    private fun setStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
        if (Build.VERSION.SDK_INT >= 21) {
            HistoryActivity.setWindowFlag(
                this,
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                false
            )
            window.statusBarColor = Color.TRANSPARENT
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iklan)
        setStatusBar()
        setToolbar()

        kembali.setOnClickListener { v: View? ->
            val intent = Intent(this@IklanActivity, MainActivity::class.java)
            startActivity(intent)
        }

        iklanhotel.setOnClickListener { v: View? ->
            val intent = Intent(this@IklanActivity, listhotel::class.java)
            startActivity(intent)
        }

    }

}
