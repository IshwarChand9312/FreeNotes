package com.example.freenotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.SearchView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {


    lateinit var drawerLayout : DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        drawerLayout = findViewById(R.id.drawerLayout)

        val navController = this.findNavController(R.id.NavHostFragment)

        NavigationUI.setupActionBarWithNavController(this,navController,drawerLayout)
        NavigationUI.setupWithNavController(findViewById<NavigationView>(R.id.navView),navController)


    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.NavHostFragment)
        return  NavigationUI.navigateUp(navController,drawerLayout) || super.onSupportNavigateUp()
    }

}