package com.welyab.misc.octoevents.data.model

import org.jetbrains.exposed.sql.Table

object GithubEventTable : Table("github_event") {
    val id = integer("id").autoIncrement().primaryKey()
    val payload = varchar("payload", length = Int.MAX_VALUE)
}
