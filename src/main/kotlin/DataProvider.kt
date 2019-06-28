fun requestUser(id: Int): UserModel {
    return when (id) {
        1 -> NewUser()
        2 -> OnlyName("Name")
        else -> Empty
    }
}