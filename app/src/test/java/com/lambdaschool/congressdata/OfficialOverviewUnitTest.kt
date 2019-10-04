package com.lambdaschool.congressdata

import com.lambdaschool.congressdataapiaccess.CongresspersonOverview
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import kotlin.test.assertEquals

class OfficialOverviewUnitTest {
    //A000374 Ralph Abraham
    private val firstName = "Test"
    private val middleName = "T"
    private val lastName = "Testing"
    private val party = "Educational"
    private val state = "HW"
    private val id = "Test"
    private val displayName = "Test T Testing"
    private val official = OfficialOverview(firstName,
            middleName,
            lastName,
            party,
            state,
            id)


    @Test
    fun testBuildDisplayName() {
        val expected = displayName

        assertEquals(expected, official.displayName)
    }

    @Test
    fun testPartyValue(){
        val partyExpected = "Educational"

        assertEquals(partyExpected, official.party)
    }

    @Test
    fun testStateValue(){
        val stateExpected = "HW"

        assertEquals(stateExpected, official.state)
    }

    @Test
    fun testIdValue(){
        val idExpected = "Test"

        assertEquals(idExpected, official.id)
    }

    @Test
    fun testPartyUsingSecondConstructor(){
        val expected = party

        assertEquals(OfficialOverviewUnitTestBase.officialOverview2ndConstructor.party, expected)
    }

    @Test
    fun testStateUsingSecondConstructor(){
        val expected = state

        assertEquals(OfficialOverviewUnitTestBase.officialOverview2ndConstructor.state, expected)
    }

    @Test
    fun testDisplayNameUsingSecondConstructor(){
        val expected = displayName

        assertEquals(OfficialOverviewUnitTestBase.officialOverview2ndConstructor.displayName, expected)
    }

    @Test
    fun testIdUsingSecondConstructor(){
        val expected = id

        assertEquals(OfficialOverviewUnitTestBase.officialOverview2ndConstructor.id, expected)
    }
}