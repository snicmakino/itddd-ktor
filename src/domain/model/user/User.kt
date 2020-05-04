package jp.snicmakino.domain.model.user

import java.util.*

class User {
    private val id: UserId
    private var name: UserName

    constructor(name: UserName) {
        id = UserId(UUID.randomUUID().toString())
        this.name = name
    }

    constructor(id: UserId, name: UserName) {
        this.id = id
        this.name = name
    }

    fun changeName(name: UserName) {
        this.name = name
    }
}
