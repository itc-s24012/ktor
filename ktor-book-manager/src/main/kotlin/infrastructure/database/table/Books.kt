package jp.ac.it_college.std.s24011.kotlin.ktor.book.manager.infrastructure.database.table

import org.jetbrains.exposed.v1.core.dao.id.LongIdTable
import org.jetbrains.exposed.v1.datetime.date

object Books : LongIdTable("books"){
    val title = varchar("title", 128)
    val author = varchar("author", 32)
    val releaseDate = date("releaseDate_date")
}