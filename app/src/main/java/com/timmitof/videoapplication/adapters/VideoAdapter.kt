package com.timmitof.videoapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.VideoView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.timmitof.videoapplication.Constants
import com.timmitof.videoapplication.R
import com.timmitof.videoapplication.models.Video

class VideoAdapter(private val array: ArrayList<Video>) :
    RecyclerView.Adapter<VideoAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val video = view.findViewById<VideoView>(R.id.video_view)
        val name = view.findViewById<TextView>(R.id.name_video)
        val description = view.findViewById<TextView>(R.id.description_video)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_video, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]

        holder.name.text = item.name
        holder.description.text = item.description
        holder.video.setVideoPath(item.url)

    }

    override fun getItemCount(): Int {
        return array.size
    }
}

