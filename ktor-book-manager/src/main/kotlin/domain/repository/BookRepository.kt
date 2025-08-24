package jp.ac.it_college.std.s24011.kotlin.ktor.book.manager.domain.repository

import jp.ac.it_college.std.s24011.kotlin.ktor.book.manager.domain.model.BookWithRental

interface BookRepository {
    fun findAllWithRental(): List<BookWithRental>
}