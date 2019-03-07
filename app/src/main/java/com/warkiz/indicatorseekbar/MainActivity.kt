package com.warkiz.indicatorseekbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar.setIndicatorTextFormat("€\${PROGRESS}")
        val tickPositions = floatArrayOf(70.00f, 210.00f, 260.00f, 420.00f, 620.00f, 1000.00f).toList()
        seekBar.setTickPositions(tickPositions)
        seekBar.setProgress(210f)

        seekBar2.setIndicatorTextFormat("€\${PROGRESS}")
        val newTickPositions = floatArrayOf(0f, 5000f).toList()
        val newTickPositions2 = floatArrayOf(0f, 500f, 1500f).toList()
        val newTickPositions3 = floatArrayOf(200.00f, 600.00f, 3000.00f).toList()
        seekBar2.setTickPositions(newTickPositions3)
        seekBar2.setProgress(210f)

        seekBar.addOnProgressChangeListener {
            Log.d("TEST_SEEK_BAR", "Stop $it")

            val rand = (0..2).random()
            when (rand) {
                0 -> seekBar2.setTickPositions(newTickPositions)
                1 -> seekBar2.setTickPositions(newTickPositions2)
                else -> seekBar2.setTickPositions(newTickPositions3)
            }

        }
    }
}
