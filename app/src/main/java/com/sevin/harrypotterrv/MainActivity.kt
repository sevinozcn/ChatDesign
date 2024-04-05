package com.sevin.harrypotterrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.Menu
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.sevin.harrypotterrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var personArrayList:ArrayList<Note>
    private lateinit var adapter: NoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.title = "Message"
        binding.toolbar.setLogo(R.drawable.logo)
        binding.toolbar.setTitleTextColor(resources.getColor(R.color.white))
        setSupportActionBar(binding.toolbar)

        val toggle = ActionBarDrawerToggle(this,binding.drawer,binding.toolbar,0,0)
        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()



        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = LinearLayoutManager(this)

        val p1 = Note(1,"harry","Harry Potter","It is not right to dive into the world of dreams ...","09.35")
        val p2 = Note(2,"hermione","Hermione Lemon","I hope you are satisfied. We could all be killed...","10.54")
        val p3 = Note(3,"ron","Ron Weasley","It's wonderful... but scarry.","12.07")
        val p4 = Note(4,"dumbledore","Albus Dumledore","Music is magic beyond anything we do here.","13.08")
        val p5 = Note(5,"sirus_black","Sirius Black","I want to commit the murder for which...","15.17")
        val p6 = Note(6,"draco","Draco Malfoy","Are you studying ballet,Potter?","15.59")
        val p7 = Note(7,"rubeus_hagrid","Rubeus Hagrid","Yer a wizard Harry.","18.03")
        val p8 = Note(8,"voldemort","Lord Voldemort","If you had somewhere,go you wouldn't be here!","22.00")
        val p9 = Note(9,"mcgonagall","Minerva Mcgonagall","Happiness can be found, even in the darkest...","22.22")
        val p10 = Note(10,"snape","Severus Snape","Obviously","23.49")
        val p11 = Note(11,"doby","Dobby","Dobby is free.","00.19")

        personArrayList = ArrayList<Note>()
        personArrayList.add(p1)
        personArrayList.add(p2)
        personArrayList.add(p3)
        personArrayList.add(p4)
        personArrayList.add(p5)
        personArrayList.add(p6)
        personArrayList.add(p7)
        personArrayList.add(p8)
        personArrayList.add(p9)
        personArrayList.add(p10)
        personArrayList.add(p11)

        adapter = NoteAdapter(this,personArrayList)
        binding.rv.adapter = adapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return true
    }


}