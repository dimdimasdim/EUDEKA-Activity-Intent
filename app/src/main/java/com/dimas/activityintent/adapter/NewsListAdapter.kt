package com.dimas.activityintent.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dimas.activityintent.R
import com.dimas.activityintent.data.News
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_news.view.*

class NewsListAdapter(private val context: Context, private val news: MutableList<News>, private val listener :
    (News) -> Unit) :
    RecyclerView.Adapter<NewsListAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder =
        NewsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_news, parent, false))

    override fun getItemCount(): Int = news.size

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) = holder.bind(news[position])


    inner class NewsViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(data: News) {
            with(view) {
                tvTitle.text = data.judul
                tvDate.text = data.tanggal
                Picasso.get()
                    .load(data.img)
                    .into(imgeNews)
            }

            view.setOnClickListener {
                listener(data)
            }
        }
    }

}
