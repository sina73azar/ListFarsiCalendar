package com.sina.taghvimlib

import net.time4j.PlainDate
import net.time4j.SystemClock
import net.time4j.calendar.PersianCalendar

public class TaghvimFarsi {
    companion object{
        public fun getToday(): PersianCalendar {
            val today: PlainDate = SystemClock.inLocalView().today()
            return today.transform(PersianCalendar::class.java)
        }
    }

}