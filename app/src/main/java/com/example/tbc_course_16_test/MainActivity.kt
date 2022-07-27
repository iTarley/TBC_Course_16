package com.example.tbc_course_16_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tbc_course_16_test.databinding.ActivityGameBinding
import com.example.tbc_course_16_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //ძალიან ჯართი კოდი არის დაწერილი, დავალება არ არი შესრულებული
        // ჩემთვის იყო ძალიან რთული, რადგან არ ვარ მიჩვეული ამ სახის დავალებისთვის
        // ფრაგმენტებიც ვერ გამოვიყენე იმიტომ, რომ ვერ მივხვდი როგორ ვამუშავო .xml onClick ფრაგმენთში

            binding.button.setOnClickListener {
                if(binding.radio3.isChecked){
                    val intent = Intent(this,GameActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                if(binding.radio4.isChecked){
                    Toast.makeText(this, "ვერ მოვასწარი", Toast.LENGTH_SHORT).show()
                }
                if(binding.radio5.isChecked){
                    Toast.makeText(this, "ვერ მოვასწარი", Toast.LENGTH_SHORT).show()
                }

            }


    }


}