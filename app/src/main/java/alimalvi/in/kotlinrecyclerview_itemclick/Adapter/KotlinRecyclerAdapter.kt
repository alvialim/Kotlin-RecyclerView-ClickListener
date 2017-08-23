package alimalvi.`in`.kotlinrecyclerview_itemclick.Adapter

import alimalvi.`in`.kotlinrecyclerview_itemclick.DataModel.Users
import alimalvi.`in`.kotlinrecyclerview_itemclick.R
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by BUGLE1 on 8/23/2017.
 */
class KotlinRecyclerAdapter (private val context: Context, val arrayList: ArrayList<Users>) : RecyclerView.Adapter<KotlinRecyclerAdapter.KotlinViewHolder>() {

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): KotlinViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.inflater_recyclerview_layout,parent,false)
        return KotlinViewHolder(view)
    }

    override fun onBindViewHolder(holder: KotlinViewHolder?, position: Int) {
        holder?.name_textView?.text= arrayList[position].name
        holder?.jobtitle_textView?.text= arrayList[position].jobtitle
    }

    class KotlinViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name_textView=itemView.findViewById<RecyclerView>(R.id.inflater_name_textView) as TextView
        val jobtitle_textView=itemView.findViewById<RecyclerView>(R.id.inflater_jobtitle_textView) as TextView
    }
}