package com.example.telegramintropager

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomPagerAdapter(fragment: FragmentActivity, val pageList: List<PageDataModel>): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return pageList.size
    }

    override fun createFragment(position: Int): Fragment {
        return PagerFragment().apply {
            arguments = Bundle().apply {
                val item = pageList[position]
                putInt("image", item.imageId)
                putString("title", item.title)
                putString("description", item.description)
            }
        }
    }
}