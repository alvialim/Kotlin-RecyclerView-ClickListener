package alimalvi.`in`.kotlinrecyclerview_itemclick

import alimalvi.`in`.kotlinrecyclerview_itemclick.Adapter.KotlinRecyclerAdapter
import alimalvi.`in`.kotlinrecyclerview_itemclick.DataModel.Users
import alimalvi.`in`.kotlinrecyclerview_itemclick.Utils.RecyclerItemClickListener
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arraylist= ArrayList<Users>()
        arraylist.add(Users("Alim","Android Developer"))
        arraylist.add(Users("Vasim","Kotlin Developer"))
        arraylist.add(Users("Shahid","PHP Developer"))
        arraylist.add(Users("Salman","Java Developer"))
        arraylist.add(Users("Jabir","IOS Developer"))
        arraylist.add(Users("Mohsin",".NET Developer"))
        setupRecyclerView(arraylist)


        recyclerView.addOnItemTouchListener(
                RecyclerItemClickListener(applicationContext,
                        RecyclerItemClickListener.OnItemClickListener { view, position ->
                        Toast.makeText(applicationContext,arraylist[position].name,Toast.LENGTH_LONG).show()
        }))

    }
    private fun setupRecyclerView(arrayList: ArrayList<Users>){
        val adapter= KotlinRecyclerAdapter(applicationContext,arrayList)
        recyclerView.adapter=adapter
        recyclerView.layoutManager= LinearLayoutManager(this)
    }
}
