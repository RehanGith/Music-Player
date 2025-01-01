package com.example.musicplayer

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.musicplayer.Screens.Folder.FolderFragment
import com.example.musicplayer.Screens.Musics.MusicFragment
import com.example.musicplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setTheme(R.style.coolPinkTheme)
        setFragment(MusicFragment())
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        toggle = ActionBarDrawerToggle(this@MainActivity, binding.drawerLayout, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.feedbackNav -> Toast.makeText(this, "Feedback Nav selected", Toast.LENGTH_SHORT).show()
                R.id.sortOrderNav-> Toast.makeText(this, "Sort order Nav selected", Toast.LENGTH_SHORT).show()
                R.id.aboutNav -> Toast.makeText(this, "About Nav selected", Toast.LENGTH_SHORT).show()
                R.id.themesNav -> Toast.makeText(this, "themes Nav selected", Toast.LENGTH_SHORT).show()
                R.id.exitNav -> Toast.makeText(this, "Exit Nav selected", Toast.LENGTH_SHORT).show()
            }
            return@setNavigationItemSelectedListener true
        }
        binding.buttomNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.allMusics -> setFragment(MusicFragment())
                R.id.allFolders -> setFragment(FolderFragment())
            }
            return@setOnItemSelectedListener true
        }
    }
    private fun setFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentView, fragment)
        transaction.disallowAddToBackStack()
        transaction.commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}