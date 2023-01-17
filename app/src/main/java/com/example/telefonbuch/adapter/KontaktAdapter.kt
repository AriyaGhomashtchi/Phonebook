package com.example.telefonbuch.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telefonbuch.R
import com.example.telefonbuch.data.model.Kontakt


class KontaktAdapter(
    private val dataset: List<Kontakt>
) : RecyclerView.Adapter<KontaktAdapter.ViewHolder>() {

    // IDEE EINES VIEWHOLDERS
    // der ViewHolder weiß welche Teile des Layouts beim Recycling angepasst werden
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    val name = view.findViewById<TextView>(R.id.kontakt_name)
    val nummer = view.findViewById<TextView>(R.id.kontakt_nummer)

    }

    // ERSTELLEN DES VIEWHOLDERS
    // hier werden neue ViewHolder erstellt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.kontakt_item, parent, false)

        return ViewHolder(adapterLayout)
    }

    // BEFÜLLEN DES VIEWHOLDERS
    // hier findet der Recyclingprozess statt
    // die vom ViewHolder bereitgestellten Parameter werden verändert
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val kontakt = dataset[position]

        holder.name.text = kontakt.name
        holder.nummer.text = kontakt.nummer.toString()

    }

    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}