package id.ac.ittelkompwt.recyclerview_live

import android.provider.ContactsContract

object IsiDataLatihan {
    private val cnamaku = arrayOf(
        "joni",
        "jono",
        "jodi",
        "jodo"
    )
    private val cjeniskelaminku = arrayOf(
        "Laki-Laki",
        "Laki-Laki",
        "Laki-Laki",
        "Laki-Laki"
    )
    val listDataku: ArrayList<DataLatihan>
    get() {
        val listDataLatihan = arrayListOf<DataLatihan>()
        for (position in cnamaku.indices){
            val dataKu = DataLatihan()
            dataKu.namaku = cnamaku[position]
            dataKu.jeniskelaminku = cjeniskelaminku[position]
            listDataLatihan.add(dataKu)
        }
        return listDataLatihan
    }
}