package com.example.randomUser

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.example.randomUser.databinding.ActivityMainBinding


import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFetchUser.setOnClickListener {
            fetchRandomUser()
        }
    }

    private fun fetchRandomUser() {
        lifecycleScope.launch {
            try {
                val response = RetrofitClient.api.getRandomUser()
                val user = response.results.first()

                val fullName = "${user.name.title} ${user.name.first} ${user.name.last}"
                binding.tvName.text = "Name: ${fullName}"
                binding.gender.text = "Gender: ${user.gender}"
                binding.tvEmail.text = "Email: ${user.email}"
                binding.phoneNumber.text = "Phone: ${user.phone}"

                Glide.with(this@MainActivity)
                    .load(user.picture.large)
                    .into(binding.ivProfile)

            } catch (e: Exception) {
                Log.e("API_ERROR", "Exception: ", e)
            }
        }
    }

}