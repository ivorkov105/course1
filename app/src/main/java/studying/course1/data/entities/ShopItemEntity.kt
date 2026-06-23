package studying.course1.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shop_items")
data class ShopItemEntity(
	@PrimaryKey(autoGenerate = true) val id: Int?,
	@ColumnInfo(name = "name") val name: String?,
	@ColumnInfo(name = "description") val description: String?,
	@ColumnInfo(name = "count") val count: Int?,
	@ColumnInfo(name = "measure_unit") val measureUnit: String?
)
