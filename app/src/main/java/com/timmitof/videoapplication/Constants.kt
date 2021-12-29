package com.timmitof.videoapplication

import com.timmitof.videoapplication.models.Category
import com.timmitof.videoapplication.models.Video

open class Constants {
    companion object {
        val categories = arrayListOf(
            Category(Categories.Comedy.ordinal, R.string.comedy),
            Category(Categories.Anime.ordinal, R.string.anime),
            Category(Categories.Drama.ordinal, R.string.drama),
            Category(Categories.Melodrama.ordinal, R.string.melodrama),
            Category(Categories.Action.ordinal, R.string.action),
            Category(Categories.Horror.ordinal, R.string.horror),
            Category(Categories.Cartoon.ordinal, R.string.cartoon),

//            Category(Categories.Comedy, "Comedy"),
//            Category(Categories.Anime, "Anime"),
//            Category(Categories.Drama, "Drama"),
//            Category(Categories.Melodrama, "Melodrama"),
//            Category(Categories.Action, "Action"),
//            Category(Categories.Horror, "Horror"),
//            Category(Categories.Cartoon, "Cartoon"),
        )

        val videos = arrayListOf(
            Video(Categories.Comedy.ordinal, "Comedy", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Comedy.ordinal, "Comedy", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Comedy.ordinal, "Comedy", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),

            Video(Categories.Anime.ordinal, "Anime", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Anime.ordinal, "Anime", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Anime.ordinal, "Anime", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),

            Video(Categories.Cartoon.ordinal, "Cartoon", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Cartoon.ordinal, "Cartoon", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Cartoon.ordinal, "Cartoon", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),

            Video(Categories.Horror.ordinal, "Horror", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Horror.ordinal, "Horror", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Horror.ordinal, "Horror", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),

            Video(Categories.Drama.ordinal, "Drama", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Drama.ordinal, "Drama", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Drama.ordinal, "Drama", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),

            Video(Categories.Melodrama.ordinal, "Melodrama", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Melodrama.ordinal, "Melodrama", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Melodrama.ordinal, "Melodrama", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),

            Video(Categories.Action.ordinal, "Action", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Action.ordinal, "Action", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
            Video(Categories.Action.ordinal, "Action", "Описание", "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"),
        )
    }
}

enum class Categories(value: Int) {
    Comedy(1),
    Anime(2),
    Drama(3),
    Melodrama(4),
    Action(5),
    Horror(6),
    Cartoon(7)
}
