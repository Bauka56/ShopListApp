package com.example.shoplistapp.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    //Изменение item

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}