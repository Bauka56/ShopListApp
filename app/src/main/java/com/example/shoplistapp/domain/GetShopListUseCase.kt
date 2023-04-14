package com.example.shoplistapp.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    // Получение нашего списка

    fun getShopList(): List<ShopItem>{
        return shopListRepository.getShopList()
    }
}