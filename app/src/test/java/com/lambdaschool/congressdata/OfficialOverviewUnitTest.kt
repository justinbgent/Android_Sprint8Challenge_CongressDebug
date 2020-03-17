package com.lambdaschool.congressdata

import com.lambdaschool.congressdataapiaccess.CongresspersonOverview
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import kotlin.test.assertEquals

class OfficialOverviewUnitTest {

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
    private val congressPersonOverview = mock(CongresspersonOverview::class.java)


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

        `when`(congressPersonOverview.party).thenReturn("Educational")

        val officialOverview = OfficialOverview(congressPersonOverview)

        assertEquals(officialOverview.party, expected)
    }

    @Test
    fun testStateUsingSecondConstructor(){
        val expected = state

        `when`(congressPersonOverview.state).thenReturn("HW")

        val officialOverview = OfficialOverview(congressPersonOverview)

        assertEquals(officialOverview.state, expected)
    }

    @Test
    fun testDisplayNameUsingSecondConstructor(){
        val expected = displayName

        `when`(congressPersonOverview.firstName).thenReturn("Test")
        `when`(congressPersonOverview.middleName).thenReturn("T")
        `when`(congressPersonOverview.lastName).thenReturn("Testing")

        val officialOverview = OfficialOverview(congressPersonOverview)

        assertEquals(officialOverview.displayName, expected)
    }

    @Test
    fun testIdUsingSecondConstructor(){
        val expected = id

        `when`(congressPersonOverview.id).thenReturn("Test")

        val officialOverview = OfficialOverview(congressPersonOverview)

        assertEquals(officialOverview.id, expected)
    }
}