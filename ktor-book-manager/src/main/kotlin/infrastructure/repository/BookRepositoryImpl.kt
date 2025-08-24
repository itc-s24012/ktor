package jp.ac.it_college.std.s24012.kotlin.ktor.book.manager.infrastructure.repository

import jp.ac.it_college.std.s24012.kotlin.ktor.book.manager.domain.model.Book
import jp.ac.it_college.std.s24012.kotlin.ktor.book.manager.domain.model.BookWithRental
import jp.ac.it_college.std.s24012.kotlin.ktor.book.manager.domain.model.RentalWithUser
import jp.ac.it_college.std.s24012.kotlin.ktor.book.manager.domain.model.User
import jp.ac.it_college.std.s24012.kotlin.ktor.book.manager.domain.repository.BookRepository
import jp.ac.it_college.std.s24012.kotlin.ktor.book.manager.infrastructure.database.entity.BookWithRentalLogEntity

class BookRepositoryImpl : BookRepository {
    override fun findAllWithRental(): List<BookWithRental> {
        return BookWithRentalLogEntity.all().map(::toModel)
    }

    private fun toModel(entity : BookWithRentalLogEntity): BookWithRental = entity.run {
        BookWithRental(
            Book(
                id = id.value,
                title = title,
                author = author,
                releaseDate = releaseDate,
            ),
            rental = currentLog?.run {
                RentalWithUser(
                    id = id.value,
                    user = User(user.id.value,user.name),
                    rentalDatetime = rentalDatetime,
                    returnDeadline = returnDeadline,
                )
            }
        )
    }
}