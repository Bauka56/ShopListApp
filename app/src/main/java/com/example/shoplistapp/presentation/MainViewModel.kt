package com.example.shoplistapp.presentation

import androidx.lifecycle.ViewModel
import com.example.shoplistapp.data.ShopListRepositoryImpl
import com.example.shoplistapp.domain.DeleteShopItemUseCase
import com.example.shoplistapp.domain.EditShopItemUseCase
import com.example.shoplistapp.domain.GetShopListUseCase
import com.example.shoplistapp.domain.ShopItem

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)


    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun editEnableState(shopItem:ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}