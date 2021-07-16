package com.androidstudio.tapapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidstudio.tapapplication.adapter.ViewPageAdapter
import com.androidstudio.tapapplication.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabLayout = binding.tabLayout
        val viewPage = binding.viewPage2
        val adapter = ViewPageAdapter(supportFragmentManager, lifecycle)

        viewPage.adapter = adapter
        TabLayoutMediator(tabLayout, viewPage){
            tab, position ->
            when(position) {
                0 -> {
                    tab.text = "first"
                }
                1 -> {
                    tab.text = "second"
                }
                2 -> {
                    tab.text = "third"
                }
            }
        }.attach()
    }
}