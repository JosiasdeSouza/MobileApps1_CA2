package com.example.cinema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Popes : AppCompatActivity() {
    private var ticketCount: Int = 0
    private var ticketRemain: Int = 15

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_popes)

            supportActionBar?.hide()

            val popes_bt1 = findViewById<TextView>(R.id.popes_bt1)
            popes_bt1.setOnClickListener {
                ticketCount++
                val popes_ticket = findViewById<TextView>(R.id.popes_ticket)
                popes_ticket.text = ticketCount.toString()
                if (ticketRemain > 0) {
                    ticketRemain--
                    val popes_remain = findViewById<TextView>(R.id.popes_remain)
                    popes_remain.text = ticketRemain.toString()
                }


                val popes_bt2 = findViewById<TextView>(R.id.popes_bt2)
                popes_bt2.setOnClickListener {
                    if (ticketCount > 0) {
                        ticketCount--
                        val popes_tickets = findViewById<TextView>(R.id.popes_ticket)
                        popes_tickets.text = ticketCount.toString()
                        ticketRemain++
                        val popes_remains = findViewById<TextView>(R.id.popes_remain)
                        popes_remains.text = ticketRemain.toString()
                    }
                }
            }
        }
    }
