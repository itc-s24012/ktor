package jp.ac.it_college.std.s24011.kotlin.ktor.book.manager.domain.model

import kotlinx.datetime.LocalDateTime

data class RentalInfo(
    val id: Long,
    val book: Book,
    val user: User,
    val remtalDatetime: LocalDateTime,
    val returnDeadline: LocalDateTime,
    val returnDatetime: LocalDateTime,
)
