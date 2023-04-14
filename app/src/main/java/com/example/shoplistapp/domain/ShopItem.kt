package com.example.shoplistapp.domain

data class ShopItem(
    var name: String,
    var company: String,
    var count: Int,
    var enabled: Boolean,
    var id: Int = UNDEFINED_ID
){

    companion object{

        const val UNDEFINED_ID = -1
    }
}
