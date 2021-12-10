package com.rh.phili11


import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest{

    @Test
    fun `empty username return false`(){
        val result  = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }


    @Test
    fun `valid username and correct repeted password return true`(){
        val result  = RegistrationUtil.validateRegistrationInput(
            "philip",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }


    @Test
    fun `username already exist return false`(){
        val result  = RegistrationUtil.validateRegistrationInput(
            "carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }


    //empty password
    @Test
    fun `empty password return false`(){
        val result  = RegistrationUtil.validateRegistrationInput(
            "carl",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    //password was repeted incorrectly
    @Test
    fun `incorrectly confirmed password return false`(){
        val result  = RegistrationUtil.validateRegistrationInput(
            "carl",
            "123",
            "1233"
        )
        assertThat(result).isFalse()
    }


    //password contains leass than 2 digit
    @Test
    fun `less than 2 digit password return false`(){
        val result  = RegistrationUtil.validateRegistrationInput(
            "carl",
            "12",
            "12"
        )
        assertThat(result).isFalse()
    }



}