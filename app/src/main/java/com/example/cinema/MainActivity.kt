package com.example.cinema

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cinema.Adapter.AdapterFilm
import com.example.cinema.cine.Film

class MainActivity : AppCompatActivity() {
    private fun Film( s: String, drawable: Int, any: Any) {

    }





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val recyclerViewcinema = findViewById<RecyclerView>(R.id.recyclerView_cinema)
        recyclerViewcinema.layoutManager = LinearLayoutManager(this)
        recyclerViewcinema.setHasFixedSize(true)


        val itemlist: MutableList<Film> = mutableListOf()
        val adapterFilm = AdapterFilm(this, itemlist)
        recyclerViewcinema.adapter = adapterFilm

        val film1 = Film(
            "Creed III",
            R.drawable.creed3
        )
        itemlist.add(film1)

        val film2 = Film(
            "Dungeons & Dragons",
            R.drawable.dungeon
        )
        itemlist.add(film2)

        val film3 = Film(
            "The Pope's Exorcist",
            R.drawable.popes
        )
        itemlist.add(film3)

        val film4 = Film(
            "John Wick: Chapter 4",
            R.drawable.johnwick4
        )
        itemlist.add(film4)

    }
}




