package com.rizaki.ch3challengebinar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rizaki.ch3challengebinar.databinding.ItemViewBinding

class AbjadAdapter(private val list: ArrayList<AbjadModel>) :
    RecyclerView.Adapter<AbjadAdapter.CardViewHolder>() {

    var onItemClicked: OnItemClickCallback?= null

    class CardViewHolder(private val binding: ItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(list: AbjadModel, onItemClicked: OnItemClickCallback){
            binding.TombolText.text = list.abjad
            binding.TombolText.setOnClickListener {
                onItemClicked.onItemClicked(list.kata)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        onItemClicked?.let { holder.bind(list[position], it) }
    }

    fun setOnClickCallback (onItemClicked: OnItemClickCallback){
        this.onItemClicked=onItemClicked
    }

    override fun getItemCount()=list.size

}

