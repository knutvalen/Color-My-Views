package no.knutvalen.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.box_one_text).setOnClickListener { makeColored(it) }
        findViewById<View>(R.id.box_two_text).setOnClickListener { makeColored(it) }
        findViewById<View>(R.id.box_three_text).setOnClickListener { makeColored(it) }
        findViewById<View>(R.id.box_four_text).setOnClickListener { makeColored(it) }
        findViewById<View>(R.id.box_five_text).setOnClickListener { makeColored(it) }
        findViewById<View>(R.id.constraint_layout).setOnClickListener { makeColored(it) }
        findViewById<View>(R.id.red_button).setOnClickListener { makeColored(it) }
        findViewById<View>(R.id.yellow_button).setOnClickListener { makeColored(it) }
        findViewById<View>(R.id.green_button).setOnClickListener { makeColored(it) }
    }

    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> findViewById<View>(R.id.box_three_text).setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> findViewById<View>(R.id.box_four_text).setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> findViewById<View>(R.id.box_five_text).setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}