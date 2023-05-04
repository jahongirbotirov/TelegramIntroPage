package com.example.telegramintropager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.telegramintropager.databinding.ItemPagerBinding

class PagerFragment : Fragment() {

    private var _binding: ItemPagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ItemPagerBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageRes = arguments?.let {
            it.getInt("image")
        }?:R.drawable.telegram
        arguments?.apply {
            binding.imageView.setImageResource(imageRes)
            binding.titleTextView.text = getString("title")
            binding.descriptionTextView.text = getString("description")
        }

    }
}