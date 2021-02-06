package uz.texnopos.physics.ui.theme

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.physics.R
import uz.texnopos.physics.core.BaseAdapter
import uz.texnopos.physics.core.extention.inflate
import uz.texnopos.physics.data.model.theme.Themes
import uz.texnopos.physics.databinding.ItemThemesBinding

class ThemesAdapter: BaseAdapter<Themes, ThemesAdapter.ThemesViewHolder>(R.layout.item_themes) {

    inner class ThemesViewHolder(private val binding: ItemThemesBinding): RecyclerView.ViewHolder(binding.root){
        fun populateModel(model: Themes){
            binding.theme.text = model.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThemesViewHolder {
        val itemView = parent.inflate(R.layout.item_themes)
        val binding = ItemThemesBinding.bind(itemView)
        return ThemesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ThemesViewHolder, position: Int) {
        holder.populateModel(models[position])
    }
}