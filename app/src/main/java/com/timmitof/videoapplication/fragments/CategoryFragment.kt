package com.timmitof.videoapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.timmitof.videoapplication.Constants
import com.timmitof.videoapplication.R
import com.timmitof.videoapplication.adapters.CategoryAdapter

class CategoryFragment : Fragment() {
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_category, container, false)

        recyclerView = view.findViewById(R.id.category_recyclerview)
        recyclerView.adapter = CategoryAdapter(Constants.categories, requireActivity())

        return view
    }
}