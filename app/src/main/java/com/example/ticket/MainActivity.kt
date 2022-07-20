package com.example.ticket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ticket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var modal:ArrayList<Modal>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        modal=ArrayList()
        modal.add(Modal("MAA-DXB-FRA","25jul,2022(6:30 PM)to 05Aug,2022(11:00 AM)","Passenger","2Adults,2Children","Total Services","4Services","you Will earn 65 coins","₹ 5,520"))
        mainBinding.recuy.adapter=Adapter(modal)

    }
}