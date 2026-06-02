package studying.course1.data.mappers

import studying.course1.data.entities.ShopItemEntity
import studying.course1.domain.models.ShopItemModel

fun ShopItemEntity.toModel(): ShopItemModel {
	return ShopItemModel(
		id = id,
		name = name,
		description = description,
		count = count,
		measureUnit = measureUnit
	)
}

fun ShopItemModel.toEntity(): ShopItemEntity {
	return ShopItemEntity(
		id = id,
		name = name,
		description = description,
		count = count,
		measureUnit = measureUnit
	)
}