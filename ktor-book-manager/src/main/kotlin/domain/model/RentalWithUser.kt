package jp.ac.it_college.std.s24011.kotlin.ktor.book.manager.domain.model

import kotlinx.datetime.LocalDateTime

data class RentalWithUser(
    val id: Long,
    val user: User,
    val rentalDatetime: LocalDateTime,
    val returnDeadline: LocalDateTime
){
    val userID: Long
        get() = user.id
}
