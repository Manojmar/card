package com.example.ticket

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ticket.databinding.CartcardBinding

class Adapter(var data:List<Modal>): RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(val cartcardBinding: CartcardBinding): RecyclerView.ViewHolder(cartcardBinding.root) {
        fun bind(data: Modal){
            cartcardBinding.dataa=data
            cartcardBinding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(CartcardBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])

        holder.itemView.setOnClickListener {
                holder.itemView.context.startActivity(Intent(holder.itemView.context,Login::class.java))
            }
        }

    override fun getItemCount(): Int {
        return data.size
    }
    }