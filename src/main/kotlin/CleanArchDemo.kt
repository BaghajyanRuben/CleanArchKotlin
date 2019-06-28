fun main(){
    val userPresenter = UserPresenter(UserUseCase(UserRepositoryImpl()))

    userPresenter.printUser(1)
    userPresenter.printUser(2)
    userPresenter.printUser(3)

}