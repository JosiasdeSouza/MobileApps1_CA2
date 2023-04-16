package com.example.cinema.Adapter
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cinema.*
import com.example.cinema.R
import com.example.cinema.cine.Film


class AdapterFilm(private val context: Context, private val film: MutableList<Film>): RecyclerView.Adapter<AdapterFilm.FilmViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val itemList = LayoutInflater.from(context).inflate(R.layout.film, parent, false)
        val holder = FilmViewHolder(itemList)
        return holder

    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {


        holder.image.setImageResource(film[position].image)
        holder.title.text = (film[position].title)

// intent putExtra
        holder.image.setOnClickListener {
            val itemList = film[position].image
            val intent = when (itemList) {
                R.drawable.creed3 -> Intent(context, Creed3::class.java)
                R.drawable.dungeon -> Intent(context, Dungeons::class.java)
                R.drawable.popes -> Intent(context, Popes::class.java)
                R.drawable.johnwick4 -> Intent(context, JohnWick::class.java)
                else -> null
            }

            intent?.apply {
                putExtra(itemList)
                putExtra(holder.title.text.toString())
                context.startActivity(this)
            }
        }
    }

    private fun putExtra(itemList: Any) {

    }

    override fun getItemCount(): Int = film.size




    inner class FilmViewHolder(itemList: View) : RecyclerView.ViewHolder(itemList) {
        val image: ImageView = itemList.findViewById(R.id.film_title)
        val title: TextView = itemList.findViewById(R.id.film_image)
    }
}
