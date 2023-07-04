package com.travelands.pemesanantiket.listhotel

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.travelands.pemesanantiket.R
import com.travelands.pemesanantiket.dashboardiklan.IklanActivity
import com.travelands.pemesanantiket.hotelrekomendasi.BaliActivity
import com.travelands.pemesanantiket.hotelrekomendasi.BandungActivity
import com.travelands.pemesanantiket.hotelrekomendasi.JakartaActivity
import com.travelands.pemesanantiket.hotelrekomendasi.SurabayaActivity
import com.travelands.pemesanantiket.view.history.HistoryActivity
import com.travelands.pemesanantiket.view.main.MainActivity
import kotlinx.android.synthetic.main.activity_history.*
import kotlinx.android.synthetic.main.activity_iklan.*
import kotlinx.android.synthetic.main.activity_listhotel.*

class listhotel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listhotel)
        setStatusBar()
        setToolbar()

        btntoiklan.setOnClickListener { v: View? ->
            val intent = Intent(this@listhotel, IklanActivity::class.java)
            startActivity(intent)
        }

        listjakarta.setOnClickListener { v: View? ->
            val intent = Intent(this@listhotel, JakartaActivity::class.java)
            startActivity(intent)
        }
        listbandung.setOnClickListener { v: View? ->
            val intent = Intent(this@listhotel, BandungActivity::class.java)
            startActivity(intent)
        }
        listbali.setOnClickListener { v: View? ->
            val intent = Intent(this@listhotel, BaliActivity::class.java)
            startActivity(intent)
        }
        listsurabaya.setOnClickListener { v: View? ->
            val intent = Intent(this@listhotel, SurabayaActivity::class.java)
            startActivity(intent)
        }
    }

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
    }

