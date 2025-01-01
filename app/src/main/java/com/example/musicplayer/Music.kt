package com.example.musicplayer

import android.net.Uri

data class Music(val id: String,val title: String,val folderName: String,
    val duration: Long, val artUri: Uri, val path: String)
