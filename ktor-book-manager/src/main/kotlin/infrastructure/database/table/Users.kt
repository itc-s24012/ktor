package jp.ac.it_college.std.s24011.kotlin.ktor.book.manager.infrastructure.database.table

import jp.ac.it_college.std.s24011.kotlin.ktor.book.manager.domain.types.RoleType
import org.jetbrains.exposed.v1.core.dao.id.LongIdTable

object Users : LongIdTable("users") {
    val email = varchar("email", 256).uniqueIndex()
    val password = varchar("password", 128)
    val name = varchar("name", 32)
    val roleType = enumeration<RoleType>("Role_Type")
}