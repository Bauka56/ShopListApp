package com.example.shoplistapp.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    // Добавление item
    fun addShopItem(shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)
    }
}