package com.timmitof.videoapplication.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.timmitof.videoapplication.R
import com.timmitof.videoapplication.fragments.VideoFragment
import com.timmitof.videoapplication.models.Category
import java.util.*

class CategoryAdapter(private val array: ArrayList<Category>, var context: FragmentActivity) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.tv_category)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]
        holder.textView.text = holder.itemView.context.getString(item.name)
        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("CATEGORY", item.categoryId)

            context.supportFragmentManager.beginTransaction()//переход
                .replace(R.id.container, VideoFragment::class.java, bundle)
                .addToBackStack(null)
                .commit()
        }
    }

    override fun getItemCount(): Int {
        return array.size
    }
}