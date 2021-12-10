package com.rh.unittestbasic

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import com.rh.phili11.ResourseComparer
import org.junit.After
import org.junit.Before
import org.junit.Test


class ResourseComparerTest{

    private lateinit var resourseComparer : ResourseComparer

    @Before
    fun setUp() {
        resourseComparer = ResourseComparer()
    }

    @After
    fun tearDown(){
       //close,
        //null
        //GC
    }
    @Test
    fun stringResourse_Same_AsGivenString_ReturnTrue(){
        //resourseComparer = ResourseComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourseComparer.isEqual(context, R.string.app_name, "UnitTestBasic")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourse_NotSame_AsGivenString_ReturnFalse(){
        //resourseComparer = ResourseComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourseComparer.isEqual(context, R.string.app_name, "UnitTestBasic12")
        assertThat(result).isFalse()
    }
}