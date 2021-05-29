package com.example.myapplication.models

data class questao(
    var questao: String,
    var res1: String,
    var res2: String,
    var res3: String,
    var res4: String

    ) {
        companion object{
            fun getAll(): List<questao>{
                return listOf(
                    questao("Quem descobriu o Brasil", "São Pedro", "Minha mãe",
                        "Pedro Alvares Cabral", "Thailes de Milleto")
//                    questao("Quem pintou Monalisa", "Leonardo da Vinci", "Minha mãe",
//                        "Pedro Alvares Cabral", "Thailes de Milleto"),
//                    questao("Quem pediu esse trabalho final", "São Pedro", "Minha mãe",
//                        "Pedro Alvares Cabral", "O professor mais legal")

                )
            }

        }
}