package com.rizaki.ch3challengebinar

data class AbjadModel(
    val abjad:String,
    val kata: Array<String>,
)
val list = arrayListOf(

    AbjadModel("A", arrayOf("Anggur", "Anak", "Ambigu")),
    AbjadModel("B", arrayOf("Babon", "Babi", "Boba")),
    AbjadModel("C", arrayOf("Cilok", "Cinta", "Camar")),
    AbjadModel("D", arrayOf("Dindin", "Dana", "Demo")),
    AbjadModel("E", arrayOf("Enak", "EIS", "Equador")),
    AbjadModel("F", arrayOf("Fafa", "Fifi", "Fufu")),
    AbjadModel("G", arrayOf("Gendong", "Gigi", "Gagak")),
    AbjadModel("H", arrayOf("Hosting", "Herbal", "Hidung")),
    AbjadModel("I", arrayOf("Ikan", "IKEA", "Interface")),
    AbjadModel("J", arrayOf("Jakarta", "Jombang", "Jambar")),
    AbjadModel("K", arrayOf("Kotlin", "Keanu", "Kikir")),
)
