package id.ac.ittelkompwt.recyclerview_live

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvLatihan: RecyclerView
    private var list: ArrayList<DataLatihan> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvLatihan = findViewById(R.id.rv_datakurv)
        rvLatihan.setHasFixedSize(true)
        list.addAll(IsiDataLatihan.listDataku)
        deklarasiRecyclerView()
    }
    private fun deklarasiRecyclerView(){
        rvLatihan.layoutManager = LinearLayoutManager(this)
        val adapterKu = AdapterDataKu(list)
        rvLatihan.adapter = adapterKu
    }
}