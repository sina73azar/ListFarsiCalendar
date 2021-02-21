package com.sina.taghvimlib

import net.time4j.PlainDate
import net.time4j.SystemClock
import net.time4j.calendar.PersianCalendar

open class TaghvimFarsi {
    companion object{
        fun getToday(): PersianCalendar {
            val today: PlainDate = SystemClock.inLocalView().today()
            return today.transform(PersianCalendar::class.java)
        }
    }
//
//    fun getMonthlyCal(persianCalendar: PersianCalendar):List<PersianCalendar>{
//        //return a list containing 29 or 30 or 31 PersianCalendar objects
//        val monthLength=getLengthPersianMonth(persianCalendar.month.value,isYearKabise(persianCalendar.year))
//        val tempList = mutableListOf<PersianCalendar>()
//        for (i in 1..monthLength) {
//            tempList.add(PersianCalendar.of(persianCalendar.year, persianCalendar.month, i))
//        }
//        return tempList
//    }
}