package com.sina.taghvimlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.time4j.PlainDate
import net.time4j.SystemClock
import net.time4j.calendar.PersianCalendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getToday()
    }
    companion object{
        public fun getToday(): PersianCalendar {
            val today: PlainDate = SystemClock.inLocalView().today()
            return today.transform(PersianCalendar::class.java)
        }
    }
}