package studying.course1.data.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import studying.course1.data.entities.ShopItemEntity

@Dao
interface ShopItemDao {

	@Query("SELECT * FROM shop_items")
	suspend fun getShopItems(): List<ShopItemEntity>

	@Query("SELECT * FROM shop_items WHERE id = :id")
	suspend fun getShopItem(id: Int): ShopItemEntity

	@Delete
	suspend fun deleteShopItem(id: Int?)

	@Delete
	suspend fun deleteShopItems()

	@Update
	suspend fun updateShopItem(id: Int?, name: String?, description: String?, count: Int?, measureUnit: String?)

	@Insert(onConflict = OnConflictStrategy.REPLACE)
	suspend fun addShopItem(shopItemEntity: ShopItemEntity)
}