package com.kg.calconmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kg.calconmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val viewModel = CountViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnIncrement.setOnClickListener{
                val recentCount = increment(tvCount.text.toString())
                tvCount.text = recentCount
            }
            btnDecrement.setOnClickListener{
                val recentCount = decrement(tvCount.text.toString())
                tvCount.text = recentCount
            }
        }
    }
    fun increment(count: String): String {
        return viewModel.getIncremented(count)
    }

    fun decrement(count: String): String {
        return viewModel.getDecremented(count)
    }
}