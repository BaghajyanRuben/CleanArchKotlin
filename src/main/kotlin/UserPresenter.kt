class UserPresenter(userUseCase: UserUseCase) {

    private val userCase : UserUseCase = userUseCase


    fun showAllUsers(userCount: Int) {

    }

    fun getUser(id: Int) : UserEntity{
        return userCase.getUser(id)
    }

    fun printUser(id: Int){
        println(userCase.getUser(id))
    }
}