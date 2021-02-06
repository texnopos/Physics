package uz.texnopos.physics.ui.theme

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import uz.texnopos.physics.data.PhysicsDao
import uz.texnopos.physics.data.model.theme.Themes
import kotlin.coroutines.CoroutineContext

class ThemesViewModel(private val physicsDao: PhysicsDao): ViewModel(), CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    private val _themesList: MutableLiveData<List<Themes>> = MutableLiveData()
    val themeList: LiveData<List<Themes>>
        get() = _themesList

    fun getThemes(){
        launch{
            getThemesListAsync()
        }
    }
    private suspend fun getThemesListAsync(){
        withContext(Dispatchers.IO){
            _themesList.postValue(physicsDao.getAllThemes())
        }
    }

}