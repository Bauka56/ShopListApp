package com.example.shoplistapp.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    // Удаление item

    fun deleteShopItem(shopItem: ShopItem){
        shopListRepository.deleteShopItem(shopItem)
    }
}