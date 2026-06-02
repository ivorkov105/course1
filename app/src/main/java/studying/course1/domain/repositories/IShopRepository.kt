package studying.course1.domain.repositories

import studying.course1.domain.models.ShopItem

interface IShopRepository {
	suspend fun addShopItem(shopItem: ShopItem)
	suspend fun getShopItem(): ShopItem
	suspend fun updateShopItem(shopItem: ShopItem): ShopItem
	suspend fun deleteShopItem(shopItem: ShopItem)
	suspend fun addShopItems(shopItems: List<ShopItem>)
	suspend fun getShopItems(): List<ShopItem>
	suspend fun updateShopItems(shopItems: List<ShopItem>): List<ShopItem>
	suspend fun deleteShopItems(shopItems: List<ShopItem>)
}