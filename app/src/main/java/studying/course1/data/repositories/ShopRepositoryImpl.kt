package studying.course1.data.repositories

import studying.course1.data.daos.ShopItemDao
import studying.course1.data.mappers.toEntity
import studying.course1.data.mappers.toModel
import studying.course1.domain.models.ShopItemModel
import studying.course1.domain.repositories.IShopRepository
import javax.inject.Inject

class ShopRepositoryImpl @Inject constructor(
	private val shopItemDao: ShopItemDao
) : IShopRepository {

	override suspend fun addShopItem(shopItemModel: ShopItemModel) {
		shopItemDao.addShopItem(shopItemModel.toEntity())
	}

	override suspend fun getShopItem(id: Int): ShopItemModel {
		return shopItemDao.getShopItem(id).toModel()
	}

	override suspend fun updateShopItem(shopItemModel: ShopItemModel): ShopItemModel {
		shopItemDao.updateShopItem(
			id = shopItemModel.id,
			name = shopItemModel.name,
			description = shopItemModel.description,
			count = shopItemModel.count,
			measureUnit = shopItemModel.measureUnit
		)
		return shopItemModel
	}

	override suspend fun deleteShopItem(shopItemModel: ShopItemModel) {
		shopItemDao.deleteShopItem(shopItemModel.id)
	}

	override suspend fun addShopItems(shopItemModels: List<ShopItemModel>) {
		shopItemModels.forEach { shopItemModel ->
			this.addShopItem(shopItemModel)
		}
	}

	override suspend fun getShopItems(): List<ShopItemModel> {
		return shopItemDao.getShopItems().map { it.toModel() }
	}

	override suspend fun updateShopItems(shopItemModels: List<ShopItemModel>): List<ShopItemModel> {
		shopItemModels.forEach { shopItemModel ->
			this.updateShopItem(shopItemModel)
		}
		return shopItemModels
	}

	override suspend fun deleteShopItems(shopItemModels: List<ShopItemModel>) {
		shopItemModels.forEach { shopItemModel ->
			this.deleteShopItem(shopItemModel)
		}
	}
}
