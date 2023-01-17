package com.example.tabswithviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.example.tabswithviewpager.databinding.ActivityMainBinding
import com.example.tabswithviewpager.tabs.AssetFragment
import com.example.tabswithviewpager.tabs.InvestmentFragment
import com.example.tabswithviewpager.tabs.LiabilitiesFragment
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var pager: ViewPager // creating object of ViewPager
    private lateinit var tab: TabLayout  // creating object of TabLayout
    private lateinit var bar: Toolbar    // creating object of ToolBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)
        bar = findViewById(R.id.toolbar)

        setSupportActionBar(bar)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(AssetFragment(), "Assets")
        adapter.addFragment(LiabilitiesFragment(), "Liabilities")
        adapter.addFragment(InvestmentFragment(), "Investment ")

        pager.adapter = adapter

        tab.setupWithViewPager(pager)
    }
}