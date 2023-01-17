package com.example.telefonbuch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.telefonbuch.adapter.KontaktAdapter
import com.example.telefonbuch.data.Datasource
import com.example.telefonbuch.data.model.Kontakt
import com.example.telefonbuch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var kontaktListe: MutableList<Kontakt>
    private lateinit var kontaktAdapter: KontaktAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val datasource = Datasource()
        kontaktListe = datasource.getKontakt()
        val kontaktAdapter = KontaktAdapter(kontaktListe)
        binding.kontaktRecycler.adapter = kontaktAdapter

        binding.addButton.setOnClickListener{addKontakt(kontaktAdapter)

        print(datasource.getKontakt())
        }
    }

    private fun addKontakt(kontaktAdapter: KontaktAdapter) {
        val name = binding.nameEdit.text.toString()
        val nummer = binding.numberEdit.text.toString().toInt()
        if(!name.isNullOrEmpty()){
            val kontakt = Kontakt(name,nummer)
            kontaktListe.add(kontakt)
            kontaktAdapter.notifyItemInserted(kontaktListe.lastIndex)

        }

    }
}