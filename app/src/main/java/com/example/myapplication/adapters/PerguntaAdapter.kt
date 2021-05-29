package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.models.questao
import kotlinx.android.synthetic.main.fragment_pergunta.view.*
import kotlinx.android.synthetic.main.item_pergunta.view.*

class PerguntaAdapter: RecyclerView.Adapter<PerguntaAdapter.ViewHolder>() {
    private val questoes = questao.getAll()

    override fun getItemCount() = questoes.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
    ViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_pergunta, parent, false)
        )


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val questao = questoes[position]
        holder.fillView(questao)


    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun fillView(questao: questao){
            itemView.txPergunta.text = questao.questao
            itemView.rbRes1.text = questao.res1
            itemView.rbRes2.text = questao.res2
            itemView.rbRes3.text = questao.res3
            itemView.rbRes4.text = questao.res4

        }
    }

}