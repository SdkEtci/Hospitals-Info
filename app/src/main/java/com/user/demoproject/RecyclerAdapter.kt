package com.user.demoproject

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter( val hospitalList: ArrayList<String>, val hospitalAddresses: ArrayList<String>, val hospitalImages : ArrayList<Bitmap>) : RecyclerView.Adapter<RecyclerAdapter.HospitalVH>() {
    class HospitalVH(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HospitalVH {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return HospitalVH(itemView)
    }

    override fun onBindViewHolder(holder: HospitalVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = hospitalList.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, SecondActivity:: class.java)
            intent.putExtra("hospitalName", hospitalList.get(position))
            intent.putExtra("hospitalAddress", hospitalAddresses.get(position))
            val singleton= SingletonClass.selectedHospital
            singleton.image = hospitalImages.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return hospitalList.size
    }
}