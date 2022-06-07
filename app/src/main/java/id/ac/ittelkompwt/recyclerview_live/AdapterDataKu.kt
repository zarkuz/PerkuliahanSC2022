package id.ac.ittelkompwt.recyclerview_live

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterDataKu(private  val listData: ArrayList<DataLatihan>): RecyclerView.Adapter<AdapterDataKu.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvNamaku: TextView = itemView.findViewById(R.id.tv_namaku)
        var tvJKku: TextView = itemView.findViewById(R.id.tv_jkku)
        var btnUpdate: ImageButton = itemView.findViewById(R.id.btn_update)
        var btnDelete: ImageButton = itemView.findViewById(R.id.btn_delete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.itemku_layout, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val dataNilai = listData[position]
        holder.tvNamaku.text = dataNilai.namaku
        holder.tvJKku.text = dataNilai.jeniskelaminku
    }

    override fun getItemCount(): Int {
        return listData.size
    }

}