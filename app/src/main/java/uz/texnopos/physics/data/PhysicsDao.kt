package uz.texnopos.physics.data

import androidx.room.Dao
import androidx.room.Query
import uz.texnopos.physics.data.model.theme.Themes

@Dao
interface PhysicsDao {

    @Query("SELECT * FROM themes")
    fun getAllThemes(): List<Themes>

}