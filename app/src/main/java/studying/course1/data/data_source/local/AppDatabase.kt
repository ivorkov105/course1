package studying.course1.data.data_source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import studying.course1.data.daos.ShopItemDao
import studying.course1.data.entities.ShopItemEntity

@Database(entities = [ShopItemEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
	abstract fun shopItemDao(): ShopItemDao
}