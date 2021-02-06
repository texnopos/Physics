package uz.texnopos.physics.di

import androidx.room.Room
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import uz.texnopos.physics.data.PhysicsDatabase
import uz.texnopos.physics.ui.theme.ThemesViewModel

val dataModule = module{
    single{
        Room.databaseBuilder(androidContext(),
        PhysicsDatabase::class.java,
        "database.db")
            .createFromAsset("database.db")
            .build()
    }
    single{get<PhysicsDatabase>().physicsDao()}

}

val viewModelModule = module{
    viewModel { ThemesViewModel(get()) }
}

val adapterModule = module{

}