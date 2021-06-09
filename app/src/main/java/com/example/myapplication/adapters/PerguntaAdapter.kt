package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.myapplication.R
import com.example.myapplication.database.AppDatabase
import com.example.myapplication.database.daos.QuestaoDAO
import com.example.myapplication.models.questao
import kotlinx.android.synthetic.main.fragment_pergunta.view.*
import kotlinx.android.synthetic.main.item_pergunta.view.*

class PerguntaAdapter(context: Context): RecyclerView.Adapter<PerguntaAdapter.ViewHolder>() {

    private val dao: QuestaoDAO
    private val questoes: MutableList<questao>

    init {
        // Create Db instance
        val db = Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "questao-db"
        )
            .allowMainThreadQueries()
            .build()

        //Get Dao
        dao = db.questaoDao()

        //Get all
        questoes = dao.getAll().toMutableList()
    }

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