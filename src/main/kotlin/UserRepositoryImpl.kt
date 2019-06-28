class UserRepositoryImpl : UserRepository {

    private fun initUserWithName(name: String): UserEntity {
        return UserEntity(name)
    }

    private fun mapToUserEntity(userMap: Map<String, Any>): UserEntity {
        return UserEntity()
    }

    override fun getUser(id: Int): UserEntity {
        val user = requestUser(id)
        return when (user) {
            is NewUser -> mapToUserEntity(user.userMap)
            is OnlyName -> initUserWithName(user.name)
            else -> UserEntity("Empty", -1)
        }
    }
}