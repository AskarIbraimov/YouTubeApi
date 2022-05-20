package com.example.youtubeapi.ui.playlist


import android.content.Intent
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.youtubeapi.`object`.Constants
import com.example.youtubeapi.base.BaseActivity
import com.example.youtubeapi.databinding.PlaylistactivityBinding
import com.example.youtubeapi.ui.adapters.PlaylistAdapter
import com.example.youtubeapi.ui.playlistDetails.PlaylistDetailActivity

class PlayListActivity : BaseActivity<PlaylistViewModel,PlaylistactivityBinding>() {

    override fun initView() {
        super.initView()
        viewModel = ViewModelProvider(this).get(PlaylistViewModel::class.java)
    }

    override fun initViewModel() {
        super.initViewModel()
        viewModel.getPlayList().observe(this) {
            binding.rvPlaylist.adapter =
                PlaylistAdapter(it.items!!, object : PlaylistAdapter.ClickOnPlaylist {
                    override fun onClick(id: String?, position: Int) {
                        Intent(this@PlayListActivity, PlaylistDetailActivity::class.java).apply {
                            putExtra(Constants.NAME, id)
                            putExtra(Constants.COUNT, position)
                            startActivity(this)
                        }
                    }
                })


        }
    }
        override fun inflateVB(inflater: LayoutInflater): PlaylistactivityBinding {
            return PlaylistactivityBinding.inflate(inflater)
        }

}
