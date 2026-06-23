package studying.course1.domain.use_cases

import studying.course1.domain.models.ShopItemModel
import studying.course1.domain.repositories.IShopRepository
import javax.inject.Inject

class DeleteShopItemsUseCase @Inject constructor(
    private val repository: IShopRepository
) {
    suspend operator fun invoke(shopItemModels: List<ShopItemModel>) {
        repository.deleteShopItems(shopItemModels)
    }
}
