package ru.startandroid.develop.preferencescode

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    /** Called when the activity is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val mi: MenuItem = menu.add(0, 1, 0, "Preferences")
        mi.setIntent(Intent(this, PrefActivity::class.java))
        return super.onCreateOptionsMenu(menu)
    }
}