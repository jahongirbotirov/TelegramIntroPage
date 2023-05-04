package com.example.telegramintropager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.telegramintropager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listOfPageModel = listOf<PageDataModel>(
            PageDataModel(R.drawable.telegram,"Telegram","The world's fastest messaging app. It is free and secure"),
            PageDataModel(R.drawable.fast,"Fast","Telegram delivers messages fastest than any other application"),
            PageDataModel(R.drawable.free,"Free","Telegram is free forever. No ads. No subscription fees."),
            PageDataModel(R.drawable.secure,"Secure", "Telegram keeps your messages safe from hacker attacks."),
            PageDataModel(R.drawable.powerful,"Powerful","Telegram has no limits on the size of your chats and media."),
            PageDataModel(R.drawable.cloud_based,"Cloud-Based","Telegram lets you acces your messages from multiple devices."),
            PageDataModel(R.drawable.private_icon,"Private","Telegram messages are heavily encryted and can self-destruct.")
        )

        val pageadapter = CustomPagerAdapter(this,listOfPageModel)
        binding.tgmIntroPager.adapter = pageadapter

        TabLayoutMediator(binding.tabScrole,binding.tgmIntroPager){tab,position->

        }.attach()

    }
}