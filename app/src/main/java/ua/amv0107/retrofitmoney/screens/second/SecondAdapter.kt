package ua.amv0107.retrofitmoney.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_modey_layout.view.*
import ua.amv0107.retrofitmoney.R
import ua.amv0107.retrofitmoney.model.beznal.BeznalItem


class SecondAdapter: RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {
    var listSecond = emptyList<BeznalItem>()

    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondAdapter.SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_modey_layout,
            parent,
            false
        )
        return SecondAdapter.SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondAdapter.SecondViewHolder, position: Int) {
        holder.itemView.item_name.text = listSecond[position].ccy
        holder.itemView.item_buy.text = listSecond[position].buy
        holder.itemView.item_sale.text = listSecond[position].sale
    }

    override fun getItemCount(): Int {
        return  listSecond.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<BeznalItem>){
        listSecond = list
        notifyDataSetChanged()
    }
}