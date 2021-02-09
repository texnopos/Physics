package uz.texnopos.physics.data

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.texnopos.physics.data.model.sentense.Gapler
import uz.texnopos.physics.data.model.theme.Themes

@Database(entities = [Themes::class, Gapler::class], version = 1, exportSchema = false)
abstract class PhysicsDatabase : RoomDatabase(){
    abstract fun physicsDao(): PhysicsDao
}