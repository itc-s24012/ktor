package jp.ac.it_college.std.s24012.kotlin.ktor.book.manager.domain.model

data class BookWithRental(
    val book: Book,
    val rental: RentalWithUser?
){
    val isRental: Boolean
        get() = rental != null
}
