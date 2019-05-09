package com.welyab.misc.octoevents.services

import com.welyab.misc.octoevents.data.model.GithubEventTable
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction

class EventService {

    fun saveEvent(json : String) {
        transaction {
            GithubEventTable.insert {
                it[payload] = json
            }
        }
    }
}
