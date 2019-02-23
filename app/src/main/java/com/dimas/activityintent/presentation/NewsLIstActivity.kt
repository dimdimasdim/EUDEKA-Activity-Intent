package com.dimas.activityintent.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.dimas.activityintent.R
import com.dimas.activityintent.adapter.NewsListAdapter
import com.dimas.activityintent.data.News
import com.dimas.activityintent.utils.BundleKeys
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class NewsLIstActivity : AppCompatActivity() {

    private lateinit var adapter: NewsListAdapter

    private lateinit var news: MutableList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        news = mutableListOf()
        adapter = NewsListAdapter(this, news){
            /*
            Fungsi on click di listener adapter berguna membawa bundle data dengan menggunakan intent
            dimana dalam list news saya menggunaan startAcitity milik anko,
            lalu membawa bundle key data nesw untuk di tampilkan di dalam detail activity
             */
            startActivity<NewsDetailActivity>(BundleKeys.KEY_NEW to it)
        }
        rvListNews.layoutManager = LinearLayoutManager(this)
        rvListNews.adapter = adapter

        news.add(
            News(
                "https://akcdn.detik.net.id/community/media/visual/2019/02/23/bad8aea8-1d25-4bee-8bee-3470292b2c15_169.jpeg?w=780&q=90",
                "Bobol Gawang Empoli, Piatek Samai Bierhoff",
                "Sabtu 23 Februari 2019, 10:30 WIB",
                "Putra Rusdi Kurniawan - detikSport",
                "Jakarta - Krzysztof Piatek kini menyejajarkan dirinya dengan Olivier Bierhoff. Menyusul kontribusinya dalam kemenangan AC Milan atas Empoli 3-0.\n" +
                        "\n" +
                        "Piatek terus menunjukan ketajaman sejak didatangkan oleh Milan musim dingin lalu dari Genoa. Terakhir pesepakbola asal Polandia tersebut mencetak gol pembuka Rossoneri ke gawang Empoli dalam laga di San Siro, Sabtu (23/2/2019) dinihari WIB.\n" +
                        "\n" +
                        "Ini adalah kali keempat secara beruntun Piatek mampu mencetak gol di Liga Italia ketika dimainkan sejak menit awal. Torehan itu membuat dia menyamai pencapaian Bierhoff.\n",
                "https://sport.detik.com/sepakbola/liga-italia/d-4440366/bobol-gawang-empoli-piatek-samai-bierhoff",
                "detikSport")
        )

        news.add(
            News(
                "https://akcdn.detik.net.id/community/media/visual/2019/01/24/0a87b0c8-14ba-4e45-825f-870091db9af8_169.jpeg?w=780&q=90",
                "Suarez Menurun di Februari, Valverde: Sabar Saja",
                "Sabtu 23 Februari 2019, 07:44 WIB",
                "Lucas Aditya - detikSport",
                "Barcelona - Luis Suarez sedang paceklik gol untuk Barcelona di bulan Februari. Pelatih Los Cules Ernesto Valverde tetap bersabar karena yakin dengan kemampuan El Pistolero.\n" +
                        "\n" +
                        "Suarez masih belum membukukan gol untuk Barca dalam lima pertandingan di semua ajang. Performa tak maksimal itu kemudian membuat penyerang Uruguay itu mendapat kritik.\n" +
                        "\n" +
                        "Menatap pertandingan dengan Sevilla di Ramon Sanchez Pizjuan, Sabtu (23/2/2019) malam WIB, Valverde ditanya mengenai apa yang terjadi dengan Suarez.",
                "https://sport.detik.com/sepakbola/liga-spanyol/d-4440274/suarez-menurun-di-februari-valverde-sabar-saja",
                "detikSport")
        )

        news.add(
            News(
                "https://akcdn.detik.net.id/community/media/visual/2019/02/23/8293574f-527d-4b2c-9fbe-eb1e21fced97_169.jpeg?w=780&q=90",
                "The Jakmania Bikin Silvio Escobar Mantap Teken Kontrak di Persija",
                "Sabtu 23 Februari 2019, 10:50 WIB",
                "Amalia Dwi Septi - detikSport",
                "Jakarta - Persija Jakarta resmi mendatangkan Silvio Escobar. Pemain asal Paraguay itu kepincut dengan antusiasme The Jakmania di tiap pertandingan Macan Kemayoran.\n" +
                        "\n" +
                        "Persija mengikat Silvio untuk mengisi kekosongan posisi Marko Simic. Pemain Kroasia itu tengah terbelit kasus pidana di Sydney.\n" +
                        "\n" +
                        "Kerja sama Silvio dan Persija diteken pada Jumat (22/2/2019) malam. Mantan pemain PSM Makassar dan Bali United itu mendapatkan kontrak dengan durasi satu musim.",
                "https://sport.detik.com/sepakbola/liga-indonesia/d-4440381/the-jakmania-bikin-silvio-escobar-mantap-teken-kontrak-di-persija",
                "detikSport")
        )

        adapter.notifyDataSetChanged()
    }
}
