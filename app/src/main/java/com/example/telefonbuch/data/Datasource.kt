package com.example.telefonbuch.data

import com.example.telefonbuch.data.model.Kontakt

class Datasource {
    fun getKontakt(): MutableList<Kontakt> {
        return mutableListOf(
            Kontakt("Denise", 5553404),
            Kontakt("Ali", 18012345),
            Kontakt("Torben", 89445590),
            Kontakt("Bijan", 45998890),
            Kontakt("Matthan", 657887),
            Kontakt("Ranjiv", 7663883),
            Kontakt("Martin", 239009),
            Kontakt("Piotr", 2333948),
            Kontakt("Mama", 32323232),
            Kontakt("Papa", 1223234),
            Kontakt("Buddy", 23343434),
            Kontakt("Mona", 4454532),
            Kontakt("Franzi", 2322313),
            Kontakt("Nasrin", 98349343),
            Kontakt("René", 475937493)
        )
    }
}