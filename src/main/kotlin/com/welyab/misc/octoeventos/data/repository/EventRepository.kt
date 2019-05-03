package com.welyab.misc.octoeventos.data.repository

import com.welyab.misc.octoeventos.data.model.Event
import org.jetbrains.exposed.sql.transactions.transaction

object EventRepository : {

    fun save(payload : String) {
        transaction {
            val event = Event(payload)
            println(event)
        }
    }
}
