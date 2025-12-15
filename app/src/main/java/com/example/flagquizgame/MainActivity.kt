package com.example.flagquizgame

import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.example.flagquizgame.databinding.ActivityMainBinding

private const val GAME : String = "GAME_FRAG"
private const val ARCH : String = "ARCH_FRAG"
private var selected : String? = null

class MainActivity : AppCompatActivity() {

    private var lastBackPressedTime : Long = 0
    private val EXIT_INTERVAL : Int = 2000

    private var countries : ArrayList<Country>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onBackPressedDispatcher.addCallback(
            this,
            object : OnBackPressedCallback(true) {

                override fun handleOnBackPressed() {
                    val currentTime = System.currentTimeMillis()

                    if ( (currentTime - lastBackPressedTime ) < EXIT_INTERVAL){
                        finishAffinity()
                    }else {
                        lastBackPressedTime = currentTime
                        Toast.makeText(
                            this@MainActivity,
                            getText(R.string.main_press_back).toString(),
                            Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }
        )

        val spm = SharedPreferencesManager(this)
        countries = spm.getCountriesList()

        if (selected == GAME || selected == null) {
            openGameFragment()
            selected = GAME
            binding.ivGameButton.setColorFilter(getColor(R.color.black))
            binding.ivDiscoverButton.setColorFilter(getColor(R.color.white))
        }

        binding.ivGameButton.setOnClickListener {
            // open game fragment
            if (selected != GAME) {
                openGameFragment()
                selected = GAME
                binding.ivGameButton.setColorFilter(getColor(R.color.black))
                binding.ivDiscoverButton.setColorFilter(getColor(R.color.white))
            }
        }

        binding.ivDiscoverButton.setOnClickListener {
            // open archive fragment
            if (selected != ARCH) {
                openDiscoverFragment()
                selected = ARCH
                binding.ivGameButton.setColorFilter(getColor(R.color.white))
                binding.ivDiscoverButton.setColorFilter(getColor(R.color.black))
            }
        }

    }


    private fun openGameFragment () {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_fragmentLayout, GameFragment())
            .commit()
    }

    private fun openDiscoverFragment () {
        val dFragment = DiscoverFragment()
        val bundle = Bundle()
        bundle.putParcelableArrayList("countries", countries)
        dFragment.arguments = bundle
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_fragmentLayout, dFragment)
            .commit()
    }

}

