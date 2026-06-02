package studying.course1.domain.repositories

import studying.course1.domain.models.ShopItemModel

interface IShopRepository {
	suspend fun addShopItem(shopItemModel: ShopItemModel)
	suspend fun getShopItem(): ShopItemModel
	suspend fun updateShopItem(shopItemModel: ShopItemModel): ShopItemModel
	suspend fun deleteShopItem(shopItemModel: ShopItemModel)
	suspend fun addShopItems(shopItemModels: List<ShopItemModel>)
	suspend fun getShopItems(): List<ShopItemModel>
	suspend fun updateShopItems(shopItemModels: List<ShopItemModel>): List<ShopItemModel>
	suspend fun deleteShopItems(shopItemModels: List<ShopItemModel>)
}