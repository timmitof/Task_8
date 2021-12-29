package com.timmitof.videoapplication.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.timmitof.videoapplication.Constants
import com.timmitof.videoapplication.R
import com.timmitof.videoapplication.adapters.CategoryAdapter
import com.timmitof.videoapplication.adapters.VideoAdapter

class VideoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_video, container, false)

        val currentCategory = requireArguments().getInt("CATEGORY")

        var filteredArray = Constants.videos.filter { it.videoId == currentCategory } as ArrayList

        Log.d("ASDSA", filteredArray.toString())

        val recyclerView = view.findViewById<RecyclerView>(R.id.video_recyclerview)
        recyclerView.adapter = VideoAdapter(filteredArray)

        return view
    }
}