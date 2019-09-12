package com.example.TechChallenge.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.TechChallenge.R
import com.example.TechChallenge.adapter.DataListAdapter
import com.example.TechChallenge.request.RequestData
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataList.layoutManager = LinearLayoutManager(this)

        doAsync {
            val titleList = RequestData().execute()

            uiThread {
                dataList.adapter = DataListAdapter(titleList)
            }
        }
    }
}
