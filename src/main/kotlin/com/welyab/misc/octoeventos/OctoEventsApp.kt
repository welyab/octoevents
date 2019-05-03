package com.welyab.misc.octoeventos

import com.welyab.misc.octoeventos.data.repository.EventRepository
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder
import org.jetbrains.exposed.sql.Database

/**
 */
fun main(args: Array<String>) {
    Database.connect(
        "jdbc:mysql://192.168.50.69:3306/octoevents",
        "com.mysql.cj.jdbc.Driver",
        "root",
        "root"
    )
    val app = Javalin.create().start(7000)
    app.get("/"){ctx -> ctx.result("It's work!")}
    app.routes{
        ApiBuilder.post("/github/event") {ctx ->
            EventRepository().save(ctx.body())
        }
    }
}
