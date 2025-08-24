package jp.ac.it_college.std.s24011.kotlin.ktor.book.manager.domain.model

import jp.ac.it_college.std.s24011.kotlin.ktor.book.manager.domain.types.RoleType

data class UserPrincipal(
    val id: Long,
    val email: String,
    val password: String,
    val name: String,
    val roleType: RoleType,
)
