package com.example.jeff_skillrill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jeff_skillrill.periodone.Event_one_adapter
import com.example.jeff_skillrill.periodone.Event_one_data
import java.util.ArrayList
import java.util.Locale

class period_3 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private var mList = ArrayList<Event_one_data>()
    private lateinit var adapter: Event_one_adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_period3)

        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.searchView)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = Event_one_adapter(mList)
        recyclerView.adapter = adapter

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })
    }

    private fun filterList(query: String?) {

        if (query != null) {
            val filteredList = ArrayList<Event_one_data>()
            for (i in mList) {
                if (i.title.lowercase(Locale.ROOT).contains(query)) {
                    filteredList.add(i)
                }
            }

            if (filteredList.isEmpty()) {
                Toast.makeText(this, "No Data found", Toast.LENGTH_SHORT).show()
            } else {
                adapter.setFilteredList(filteredList)
            }
        }
    }

    private fun addDataToList() {
        mList.add(
            Event_one_data(
                "1543 - Andries van Wesel,",
                R.drawable.topic_demo,
                "Andreas Vesalius nomi bilan mashhur bo'lib, inson tanasining tuzilishi haqida o'zining etti kitobini tugatdi. Bu anatomiya bo'yicha inson tanasining o'rganishga asoslangan birinchi ishdir"
            )
        )

        mList.add(
            Event_one_data(
                "1543 - Nikolay Kopernik",
                R.drawable.topic_demo,
                "Nikolay Kopernikning \"Osmon jismlarining inqiloblari haqida\" kitobi nashr etildi. Bu astronomiyaga oid birinchi ish bo‘lib, sayyoralarning, jumladan, Yerning Quyosh atrofidagi harakati uchun analitik asos yaratadi."
            )
        )

        mList.add(
            Event_one_data(
                "1556 - Shoh Akbar",
                R.drawable.topic_demo,
                "Akbar Shimoliy Hindiston, Pokiston va Afg'onistondagi Mug'allar imperiyasining hukmdori bo'ladi. U diniy bag'rikenglikni ta'minlash orqali Hindistonda katta birlikni o'rnatadi va uni dunyoning buyuk kuchlaridan biriga aylantiradi."
            )
        )
        mList.add(
            Event_one_data(
                "1564 - Buyuk davr boshlanishi",
                R.drawable.topic_demo,
                "Ingliz yozuvchilari Kristofer Marlo va Uilyam Shekspir tug'ilgan."
            )
        )
        mList.add(
            Event_one_data(
                "1588 - Qirolicha Yelizaveta I",
                R.drawable.topic_demo,
                "Angliya qirolichasi Yelizaveta I ingliz flotini ispan Armadasining bosqinini qaytarish uchun yuboradi. Ingliz dengiz flotining muvaffaqiyati Buyuk Britaniyaning yirik dengiz kuchlari maqomining boshlanishini ko'rsatadi."
            )
        )

        mList.add(
            Event_one_data(
                "1592 - Galileo Galiley",
                R.drawable.topic_demo,
                "Galileo Galiley Padua universitetining matematika professori etib tayinlandi. U erda bo'lganida u jismlarning harakatlari bo'yicha tajribalar o'tkazadi."
            )
        )
        mList.add(
            Event_one_data(
                "1603 - Kabuki Teatri",
                R.drawable.topic_demo,
                "Kabuki teatri Yaponiyada keng shuhrat qozondi."
            )
        )

        mList.add(
            Event_one_data(
                "1605 - Don Kixot",
                R.drawable.topic_demo,
                "Migel de Servantesning \"Don Kixot\" asarining birinchi qismi nashr etildi."
            )
        )

        mList.add(
            Event_one_data(
                "1608 - Teleskop",
                R.drawable.topic_demo,
                "Birinchi teleskoplar Gollandiyada qurilgan. Galiley ushbu asboblarni model sifatida ishlatib, keyingi yili o'zining birinchi teleskopini quradi"
            )
        )
        mList.add(
            Event_one_data(
                "1609 - Koinotga birinchi qadam",
                R.drawable.topic_demo,
                "Yoxannes Keplerning \"Yangi astronomiya\" kitobi nashr etildi. Unda Kepler Mars orbitasi aylana emas, balki elliptik ekanligini ko‘rsatadi."

            )
        )

        mList.add(
            Event_one_data(
                "1637 - Rene Dekart",
                R.drawable.topic_demo,
                "Rene Dekartning \"Usul to'g'risida\" kitobi nashr etildi. Dekartning ratsionalizm falsafasiga ko'ra, tabiat qonunlarini aql bilan xulosa qilish mumkin."

            )
        )

        mList.add(
            Event_one_data(
                "1644 - Xitoy",
                R.drawable.topic_demo,
                "Xitoyda Ch'ing yoki Manchu sulolasi o'rnatildi. Xitoy dunyodagi eng gullab-yashnagan davlatga aylanadi, keyin 1911 yilda Ch'ing sulolasi Xitoy Respublikasi bilan almashtirilgunga qadar tanazzulga yuz tutadi."

            )
        )

        mList.add(
            Event_one_data(
                "1655 - Yan Vermeer",
                R.drawable.topic_demo,
                "Gollandiyalik rassom Yan Vermeerning birinchi rasmlari aynan shu davrda yaratilgan. Vermeerning rasmlari kundalik vaziyatlarda o'rta va ishchi sinf odamlarini tasvirlaydi."

            )
        )
        mList.add(
            Event_one_data(
                "1669 - Niklaus Steno",
                R.drawable.topic_demo,
                "Daniyalik geolog Niklaus Steno kristallarning tuzilishini to'g'ri aniqlaydi va fotoalbomlarni organik qoldiqlar sifatida aniqlaydi."

            )
        )

        mList.add(
            Event_one_data(
                "1678 - Kristian Gyuygens",
                R.drawable.topic_demo,
                "Kristian Gyuygens o'zining \"Nur to'g'risida\" risolasining asosiy qismini yakunlaydi, unda u bugungi kunda Gyuygens printsipi sifatida tanilgan ikkilamchi to'lqinlar modelini taqdim etadi. Tugallangan kitob 12 yildan keyin nashr etiladi"

            )
        )

        mList.add(
            Event_one_data(
                "1687 - Isaak Nyutonning",
                R.drawable.topic_demo,
                "Isaak Nyutonning \"Tabiiy falsafaning matematik asoslari\" asari nashr etildi. Ushbu keng qamrovli ishida Nyuton mexanikaning yagona modelini muntazam ravishda taqdim etadi."
            )
        )
        mList.add(
            Event_one_data(
                "1698 - Ashanti imperiyasi",
                R.drawable.topic_demo,
                "Afrika qirolliklarining oxirgisi bo'lgan Ashanti imperiyasi hozirgi Gana hududida paydo bo'ladi. Ashantining kuchli markazlashgan hukumati va samarali byurokratiyasi ularga mintaqani qariyb ikki asr davomida nazorat qilish imkonini beradi."
            )
        )
        mList.add(
            Event_one_data(
                "1712 - Tomas Nyukomen",
                R.drawable.topic_demo,
                "Tomas Nyukomen birinchi amaliy bug' mashinasini ixtiro qildi. 50 yildan ortiq vaqt o'tgach, Jeyms Vatt Newcomen dvigatelini sezilarli darajada yaxshilaydi."
            )
        )
        mList.add(
            Event_one_data(
                "1715 - Ts'ao Xsueh-ch'in",
                R.drawable.topic_demo,
                "Xitoy yozuvchisi Ts'ao Xsueh-ch'in tug'ilgan. Unga va boshqa yozuvchiga tegishli \"Qizil palataning orzusi\" kitobi keng tarqalgan\n" + "bugungi kunda eng buyuk xitoy romani sifatida qabul qilinadi."
            )
        )
        mList.add(
            Event_one_data(
                "1721 - Iogann Sebastyan Bax",
                R.drawable.topic_demo,
                "Iogann Sebastyan Bax oltita Brandenburg kontsertini yakunlaydi."
            )
        )
        mList.add(
            Event_one_data(
                "1735 - Jon Xarrison",
                R.drawable.topic_demo,
                "Jon Xarrison navigatorlarga kemaning uzunligini aniq aniqlash imkonini beradigan to'rtta xronometrdan birinchisini quradi."
            )
        )
        mList.add(
            Event_one_data(
                "1738 - Nodirshoh",
                R.drawable.topic_demo,
                "Nodirshoh boshchiligida Mo‘g‘ullar imperiyasi tanazzul bosqichiga kirgach, Fors imperiyasi Hindistonga tarqaladi."
            )
        )
        mList.add(
            Event_one_data(
                "1738 - Daniel Bernoulli",
                R.drawable.topic_demo,
                "Daniel Bernoullining suyuqliklarning mexanik harakati bo'yicha tadqiqotlarini o'z ichiga olgan \"Gidrodinamika\" nashr etildi."
            )
        )
        mList.add(
            Event_one_data(
                "1747 - Mixail V. Lomonosov",
                R.drawable.topic_demo,
                "Issiqlik suyuqlikdir, degan ma'qullangan g'oyadan farqli o'laroq, rus kimyogari Mixail V. Lomonosov o'zining issiqlik harakat natijasidir degan gipotezasini e'lon qiladi. Bir necha yil o'tgach, Lomonosov massa va energiyaning saqlanish qonunlarini ishlab chiqdi"
            )
        )
        mList.add(
            Event_one_data(
                "1752 - Benjamin Franklin",
                R.drawable.topic_demo,
                "Benjamin Franklin chaqmoqning elektr zaryadidan iborat ekanligini ko'rsatadigan xavfli \"kite experimen\" ni amalga oshiradi. U elektrni musbat va manfiy zaryadga ega deb ta'riflab, asr boshida o'tkazilgan elektr tokining birinchi tadqiqotlariga asoslanadi."
            )
        )

        mList.add(
            Event_one_data(
                "1756 - Etti yillik urush",
                R.drawable.topic_demo,
                "Etti yillik urush boshlanadi. Britaniyalik general Jeyms Vulf 1758 yilda Kanadadagi Fort-Luisburg shahrini egallashga rahbarlik qiladi."
            )
        )
        mList.add(
            Event_one_data(
                "1770 - Antoine Laurent Lavoisier",
                R.drawable.topic_demo,
                "Antoine Laurent Lavoisier kimyoviy reaktsiyalar, xususan, oksidlanish va yonish bo'yicha tadqiqotlarini boshlaydi."
            )
        )

        mList.add(
            Event_one_data(
                "1772 - Uilyam Xerschel",
                R.drawable.topic_demo,
                "Astronom Uilyam Xerschelning singlisi Karolin Xerschel Angliyadagi ukasi bilan birga keladi. U o'sha davrning eng to'liq yulduzlar katalogini tuzadi va bizning galaktikamizda bir nechta tumanliklarni - porlayotgan gaz hududlarini topadi."
            )
        )

        mList.add(
            Event_one_data(
                "1775 - Amerika",
                R.drawable.topic_demo,
                "Amerika inqilobi boshlanadi."
            )
        )
        mList.add(
            Event_one_data(
                "1785 - Charlz Augustin de Coulomb",
                R.drawable.topic_demo,
                "Charlz Augustin de Coulomb elektr kuchi uchun teskari kvadrat qonunini muntazam va qat'iy isbotlaydigan tajribalar natijalarini nashr etadi. Qonun Daniel Bernulli, Jozef Pristli va Genri Kavendish kabi boshqa olimlar tomonidan 30 yildan ortiq vaqt davomida taklif qilingan."
            )
        )




    }
}