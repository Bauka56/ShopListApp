package com.example.shoplistapp.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    //Получение по ID наш item

    fun getShopItem(shopItemId: Int): ShopItem{
        return shopListRepository.getShopItem(shopItemId)
    }

}