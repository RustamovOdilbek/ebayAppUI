package com.example.ebaykotlinvaz.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.ebaykotlinvaz.FirstListner
import com.example.ebaykotlinvaz.R
import com.example.ebaykotlinvaz.fragment.BlankFragment

class MainActivity : AppCompatActivity() {
    lateinit var params: ViewGroup.LayoutParams

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ft = supportFragmentManager.beginTransaction()
        ft.add(R.id.fragment, BlankFragment(), "dc").commit()

    }

   public fun setLinearHeight() {
        //Get screen width programmatically

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        var heighPixel = displayMetrics.heightPixels

        //Change pixel to dp
        val heighInDp: Int = heighPixel / resources.displayMetrics.density.toInt()

        //Set layout width programmatically
        params.height = heighInDp
       
    }



}