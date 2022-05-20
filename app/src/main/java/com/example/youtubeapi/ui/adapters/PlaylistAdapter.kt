package com.example.youtubeapi.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeapi.R
import com.example.youtubeapi.databinding.PlaylistItemBinding
import com.example.youtubeapi.extension.loadImage
import com.example.youtubeapi.models.Items
import com.example.youtubeapi.models.Playlist

class PlaylistAdapter(private val list: List<Items>,private val onClick:ClickOnPlaylist) : RecyclerView.Adapter<PlaylistAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: PlaylistItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun onBind(playlist: Items){
            binding.playlistTitle.text = playlist.snippet?.title
            binding.playlistCountVideos.text = playlist.contentDetails?.itemCount.toString() + " " + itemView.context.getString(
                            R.string.video_series)
            binding.playlistPhoto.loadImage(
                playlist.snippet?.thumbnails?.high?.url.toString()
            )
            binding.root.setOnClickListener {
                onClick
                onClick.onClick(playlist.id, playlist.contentDetails?.itemCount!!)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            PlaylistItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
     return list.size
    }

    interface ClickOnPlaylist {
        fun onClick(id: String?, position: Int)
    }
}