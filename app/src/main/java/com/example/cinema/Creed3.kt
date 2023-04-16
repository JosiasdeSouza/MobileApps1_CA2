package com.example.cinema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Creed3 : AppCompatActivity() {
    private var ticketCount: Int = 0
    private var ticketRemain: Int = 15

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creed3)


        val creed_bt1 = findViewById<TextView>(R.id.creed_bt1)
        creed_bt1.setOnClickListener {
            ticketCount++
            val creed_ticket = findViewById<TextView>(R.id.creed_ticket)
            creed_ticket.text = ticketCount.toString()
            if (ticketRemain > 0) {
                ticketRemain--
                val creed_remain = findViewById<TextView>(R.id.creed_remain)
                creed_remain.text = ticketRemain.toString()
            }


            val creed_bt2 = findViewById<TextView>(R.id.creed_bt2)
            creed_bt2.setOnClickListener {
                if (ticketCount > 0) {
                    ticketCount--
                    val creed_tickets = findViewById<TextView>(R.id.creed_ticket)
                    creed_tickets.text = ticketCount.toString()
                    ticketRemain++
                    val creed_remains = findViewById<TextView>(R.id.creed_remain)
                    creed_remains.text = ticketRemain.toString()
                }
            }
        }
    }

}
