package com.lambdaschool.congressdata

import com.lambdaschool.congressdataapiaccess.CongresspersonOverview
import org.mockito.Mockito

object OfficialOverviewUnitTestBase {
    // Setup second constructor object
    val officialOverview2ndConstructor = returnOfficialOverviewWithSecondConstructor()

    private val congressPersonOverview = Mockito.mock(CongresspersonOverview::class.java)

    private fun buildOverviewWithSecondConstructor(){
        Mockito.`when`(congressPersonOverview.firstName).thenReturn("Test")
        Mockito.`when`(congressPersonOverview.middleName).thenReturn("T")
        Mockito.`when`(congressPersonOverview.lastName).thenReturn("Testing")
        Mockito.`when`(congressPersonOverview.party).thenReturn("Educational")
        Mockito.`when`(congressPersonOverview.state).thenReturn("HW")
        Mockito.`when`(congressPersonOverview.id).thenReturn("Test")
    }

    private fun returnOfficialOverviewWithSecondConstructor(): OfficialOverview{
        buildOverviewWithSecondConstructor()
        return OfficialOverview(congressPersonOverview)
    }
}