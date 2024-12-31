package com.example.musicplayer.Screens.Folder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.musicplayer.R
import com.example.musicplayer.databinding.FragmentFolderBinding


class FolderFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentFolderBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_folder,
            container, false)

        return binding.root
    }

}