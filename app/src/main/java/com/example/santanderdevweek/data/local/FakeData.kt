package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente( "Caio")
        val cartao = Cartao( "523456678")
        return Conta(
            "224466-9",
            "0456-7",
            "R$ 3.586,90",
            "R$ 7.834,66",
            cliente,
            cartao
        )
    }
}