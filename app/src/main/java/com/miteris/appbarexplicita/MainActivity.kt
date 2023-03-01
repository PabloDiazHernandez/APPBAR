package com.miteris.appbarexplicita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val tbar = findViewById<Toolbar>(R.id.appbar)
        setSupportActionBar(tbar)
        supportActionBar?.setDisplayShowTitleEnabled(false) */

        val viewPager = findViewById<ViewPager>(R.id.viewpager)
        viewPager.adapter = MiFragmentPagerAdapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.appbartabs)
        tabLayout.tabMode = TabLayout.MODE_SCROLLABLE
        tabLayout.setupWithViewPager(viewPager)


    }
}