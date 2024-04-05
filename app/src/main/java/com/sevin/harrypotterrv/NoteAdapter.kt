package com.sevin.harrypotterrv


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteAdapter(private val mContext:Context, private val personList:List<Note>)
    :RecyclerView.Adapter<NoteAdapter.CardTasarimNesneTutucu>(){

    inner class CardTasarimNesneTutucu(view:View):RecyclerView.ViewHolder(view) {
        var imageView:ImageView
        var textname: TextView
        var textViewMessage: TextView
        var time:TextView

        init {
            imageView = view.findViewById(R.id.imageView)
            textname =  view.findViewById(R.id.textname)
            textViewMessage = view.findViewById(R.id.textViewMessage)
            time = view.findViewById(R.id.time)
        }

    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_personel_tasarim,parent,false)
        return CardTasarimNesneTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimNesneTutucu, position: Int) {
        val person = personList[position]

        holder.textname.text = person.person_name
        holder.textViewMessage.text = person.mesg        // edit(person.mesg)
        holder.time.text=person.time


        holder.imageView.setImageResource(
            mContext.resources.getIdentifier(person.photo_ad,"drawable",mContext.packageName))


    }

//    fun edit(chacter:String):String {
//        return ""
//
//    }


}