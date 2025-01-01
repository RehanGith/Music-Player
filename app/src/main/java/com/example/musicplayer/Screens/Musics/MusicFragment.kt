package com.example.musicplayer.Screens.Musics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.musicplayer.R
import com.example.musicplayer.databinding.FragmentFolderBinding
import com.example.musicplayer.databinding.FragmentMusicBinding

class MusicFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentMusicBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_music
        , container, false)

        return binding.root
    }
}