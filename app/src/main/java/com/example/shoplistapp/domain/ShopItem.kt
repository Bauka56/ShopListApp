package com.example.shoplistapp.domain

data class ShopItem(
    var id: Int,
    var name: String,
    var company: String,
    var count: Int,
    var enabled: Boolean
)
