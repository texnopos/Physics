package uz.texnopos.physics.data.model.theme

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "themes")
data class Themes(

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "number")
    var number: Int,

    @ColumnInfo(name = "page")
    var page: Int,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int
    )