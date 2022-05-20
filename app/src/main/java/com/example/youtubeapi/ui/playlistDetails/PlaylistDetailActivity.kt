package com.example.youtubeapi.ui.playlistDetails

import android.view.LayoutInflater
import android.widget.Toast
import com.example.youtubeapi.`object`.Constants
import com.example.youtubeapi.base.BaseActivity
import com.example.youtubeapi.databinding.ActivityPlaylistDetailBinding
import com.example.youtubeapi.ui.playlist.PlaylistViewModel

class PlaylistDetailActivity : BaseActivity<PlaylistViewModel, ActivityPlaylistDetailBinding>() {

    override fun initView() {
        super.initView()
        Toast.makeText(
            this, intent.getStringExtra(Constants.NAME), Toast.LENGTH_SHORT
        ).show()
    }

    override fun inflateVB(inflater: LayoutInflater): ActivityPlaylistDetailBinding {
        return ActivityPlaylistDetailBinding.inflate(inflater)
    }

}
