package uz.texnopos.physics.data.model.sentense

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "gapler")
data class Sentense(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "gap")
    var gap: String,

    @ColumnInfo(name = "lang_id")
    var lang_id: Int
)