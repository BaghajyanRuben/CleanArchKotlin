interface UserRepository {
    fun getUser(id: Int): UserEntity
}