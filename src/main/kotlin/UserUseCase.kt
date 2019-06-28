class UserUseCase(val userRepositoryImpl: UserRepositoryImpl) {

    fun getUser(id: Int): UserEntity {
       return userRepositoryImpl.getUser(id)
    }
}