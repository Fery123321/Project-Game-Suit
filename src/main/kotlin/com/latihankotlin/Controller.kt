package com.latihankotlin

//Class Controller dengan property yang access modifiernya private
//Encapsulation = property result hanya bisa diakses di class Controller tidak bisa diakses diluar class Controller
class Controller(private val result: CallBack){

    //Function untuk algoritmanya
    fun hitung(player1: String, player2: String){
        //Condition = when
        when {
            player1 == "batu" && player2 == "gunting" ||
                    player1 == "gunting" && player2 == "kertas" ||
                    player1 == "kertas" && player2 == "batu" -> {
                result.showResult("\n"+"""Hasil:
                    |Pemain 1 MENANG!""".trimMargin())
            }
            player2 == "batu" && player1 == "gunting" ||
                    player2 == "gunting" && player1 == "kertas" ||
                    player2 == "kertas" && player1 == "batu" -> {
                result.showResult("\n"+"""Hasil:
                    |Pemain 2 MENANG!""".trimMargin())
            }
            player1 == "batu" && player2 == "batu" ||
                    player1 == "gunting" && player2 == "gunting" ||
                    player1 == "kertas" && player2 == "kertas"-> {
                result.showResult("\n"+"""Hasil:
                    |DRAW!""".trimMargin())
            }
            else -> System.err.println("[ERROR] Hanya dapat menginput batu/gunting/kertas!\n")

        }
    }

    //type data primitive boolean
    //function untuk looping menggunakan while
    fun yesNo():Boolean {
        print("\nLanjutkan(yes/no)? ")
        var pilihan = readLine()

        while (pilihan != "yes" && pilihan != "no"){
            System.err.println("[ERROR] Anda hanya dapat memasukan yes atau no!\n")
            print("\nLanjutkan(yes/no)? ")
            pilihan = readLine()
        }

        return pilihan == "yes"
    }
}