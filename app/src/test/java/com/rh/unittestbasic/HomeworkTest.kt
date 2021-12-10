package com.rh.phili11


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest{

    @Test
    fun `braces are set correctly return true`(){
        val result = Homework.checkBraces("(a * b)")
        assertThat(result).isTrue()
    }


    @Test
    fun `braces are set incorrectly return false`(){
        val result = Homework.checkBraces("(a * b))")
        assertThat(result).isFalse()
    }




}