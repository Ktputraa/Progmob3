package com.travelands.pemesanantiket.splashscreenn

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import com.travelands.pemesanantiket.R
import com.travelands.pemesanantiket.view.history.HistoryActivity
import com.travelands.pemesanantiket.view.main.MainActivity
import kotlinx.android.synthetic.main.activity_history.*

class SplashScreenActivity : AppCompatActivity() {

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

    private val SPLASH_TIME: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        setStatusBar()
        setToolbar()
        Handler().postDelayed({
            startActivity(Intent (this, MainActivity::class.java))
finish()
        }, SPLASH_TIME)

    }
}



