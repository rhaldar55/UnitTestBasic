package com.rh.phili11

object RegistrationUtil{

    private val existingusers = listOf("peter", "carl")
    /*
    * the input is not valid if...
    * ...the username/password is empty
    * ...the username is already taken
    * ...the confirm password is not the same as the real password
    * ...the password contains less than 2 digit
    * */

    fun validateRegistrationInput(
        username : String,
        password: String,
        confirmPassword : String
    ) : Boolean{

        if (username.isEmpty() || password.isEmpty()){
            return  false
        }

        if (username in existingusers ){
            return false
        }

        if (password!=confirmPassword){
            return false
        }

        if (password.count(){ it.isDigit()} < 2){
            return false
        }

        return true
    }
}