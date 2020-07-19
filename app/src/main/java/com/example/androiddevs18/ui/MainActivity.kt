package com.example.androiddevs18.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.androiddevs18.R
import kotlinx.android.synthetic.main.activity_news.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_news)
		bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())

	}
}