package studying.course1.data.mappers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import studying.course1.data.entities.ShopItemEntity
import studying.course1.domain.models.ShopItemModel

class ShopItemMappersTest {

	companion object {
		private val shopItemEntity1: ShopItemEntity = ShopItemEntity(
			id = 1,
			name = "Bread",
			description = "Just a bread",
			count = 4,
			measureUnit = "loaves"
		)

		private val shopItemModel1: ShopItemModel = ShopItemModel(
			id = 1,
			name = "Bread",
			description = "Just a bread",
			count = 4,
			measureUnit = "loaves"
		)

		private val shopItemEntity2: ShopItemEntity = ShopItemEntity(
			id = 2,
			name = "Phone",
			description = "Xiaomi Pro Turbo Max",
			count = 1,
			measureUnit = "phone"
		)

		private val shopItemModel2: ShopItemModel = ShopItemModel(
			id = 2,
			name = "Phone",
			description = "Xiaomi Pro Turbo Max",
			count = 1,
			measureUnit = "phone"
		)

		@JvmStatic
		fun provideModels() = listOf(Pair(shopItemEntity1, shopItemModel1), Pair(shopItemEntity2, shopItemModel2))
	}

	@ParameterizedTest
	@MethodSource("provideModels")
	fun `map shop item entity to model`(modelPair: Pair<ShopItemEntity, ShopItemModel>) {
		assertEquals(modelPair.first.toModel(), modelPair.second)
	}

	@ParameterizedTest
	@MethodSource("provideModels")
	fun `map shop item model to entity`(modelPair: Pair<ShopItemEntity, ShopItemModel>) {
		assertEquals(modelPair.second.toEntity(), modelPair.first)
	}
}