package com.tutorial.recyclerviewkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.EditText
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rescyclerView : RecyclerView
    private var list : ArrayList <Cafe> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rescyclerView = findViewById(R.id.recyclerView)
        rescyclerView.setHasFixedSize(true)
        list.addAll(CafeData.listData)


        init()
    }
    fun init (){

        rescyclerView.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListAdapter (list)
        rescyclerView.adapter = listAdapter
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater)
    {

        Log.d(TAG,"onCreateOptionMenu")
        inflater.inflate(R.menu.menu_search,menu) // search view

        val item : MenuItem = menu.findItem(R.id.search)
        searchView = item.actionView as SearchView
        item.setOnActionExpandListener(object : MenuItem.OnActionExpandListener{
            override fun onMenuItemActionExpand(item: MenuItem?): Boolean {
                toolbar.setBackgroundColor(Color.WHITE)
                (searchView.findViewById<EditText>(androidx.appcompat.R.id.search_src_text)
                    .setHintTextColor(Color.BLACK))
                return true
            }

            override fun onMenuItemActionCollapse(item: MenuItem?): Boolean {
                toolbar.setBackgroundColor(resources.getColor(R.color.colorPrimary))
                searchView.setQuery("",false)
                return true
            }

        })
        searchView.queryHint = "Search .."
        searchView.maxWidth = Int.MAX_VALUE
        searchName(searchView)
        return super.onCreateOptionsMenu(menu, inflater)

    }

    private fun searchName(searchView: SearchView) {// set name to search

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                listAdapter.filter.filter(newText) //merubah query list recycler view
                return true
            }
        })

    }


    override fun onContextItemSelected(item: MenuItem): Boolean
    {
        if (item.itemId == R.id.search)
        {
            return true
        }
        return super.onContextItemSelected(item)
    }

}
