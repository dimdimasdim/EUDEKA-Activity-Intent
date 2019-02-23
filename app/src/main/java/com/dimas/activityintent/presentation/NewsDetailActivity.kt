package com.dimas.activityintent.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.LinkMovementMethod
import android.view.MenuItem
import com.dimas.activityintent.R
import com.dimas.activityintent.data.News
import com.dimas.activityintent.utils.BundleKeys
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class NewsDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportActionBar?.title = getString(R.string.title_news_detail)

        /*
        di detail news activity akan mengambil bundle data yang telah dikirimkan lewat intent data
         */

        val news = intent.getParcelableExtra <News>(BundleKeys.KEY_NEW)

        tvTitle.text = news.judul
        tvDate.text = news.tanggal
        tvSource.text = news.sumber
        tvWriter.text = news.penulis
        tvDesc.text = news.deskripsi
        Picasso.get().load(news.img).into(imgeNews)
        tvSource.movementMethod = LinkMovementMethod.getInstance()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

}
