package studying.course1.data.repositories

import studying.course1.domain.models.ShopItemModel
import studying.course1.domain.repositories.IShopRepository

class ShopRepositoryImpl: IShopRepository {

	override suspend fun addShopItem(shopItemModel: ShopItemModel) {
		TODO("Not yet implemented")
	}

	override suspend fun getShopItem(): ShopItemModel {
		TODO("Not yet implemented")
	}

	override suspend fun updateShopItem(shopItemModel: ShopItemModel): ShopItemModel {
		TODO("Not yet implemented")
	}

	override suspend fun deleteShopItem(shopItemModel: ShopItemModel) {
		TODO("Not yet implemented")
	}

	override suspend fun addShopItems(shopItemModels: List<ShopItemModel>) {
		TODO("Not yet implemented")
	}

	override suspend fun getShopItems(): List<ShopItemModel> {
		TODO("Not yet implemented")
	}

	override suspend fun updateShopItems(shopItemModels: List<ShopItemModel>): List<ShopItemModel> {
		TODO("Not yet implemented")
	}

	override suspend fun deleteShopItems(shopItemModels: List<ShopItemModel>) {
		TODO("Not yet implemented")
	}
}