package com.timmitof.videoapplication.models

//Модель видео
data class Video(
    var videoId: Int,
    var name: String,
    var description: String,
    var url: String
)