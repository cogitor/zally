package de.zalando.zally.util

import org.junit.Test

import de.zalando.zally.util.WordUtil.isPlural
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue

class WordUtilTest {
    @Test
    fun positiveCasePluralized() {
        assertTrue(isPlural("dogs"))
        assertTrue(isPlural("resources"))
        assertTrue(isPlural("payments"))
        assertTrue(isPlural("orders"))
        assertTrue(isPlural("parcels"))
        assertTrue(isPlural("commissions"))
        assertTrue(isPlural("commission_groups"))
        assertTrue(isPlural("articles"))
        assertTrue(isPlural("merchants"))
        assertTrue(isPlural("warehouse-locations"))
        assertTrue(isPlural("sales-channels"))
        assertTrue(isPlural("domains"))
        assertTrue(isPlural("addresses"))
        assertTrue(isPlural("bank-accounts"))
        assertTrue(isPlural("data"))
        assertTrue(isPlural("children"))
    }

    @Test
    fun invariableWordsPluralized() {
        assertTrue(isPlural("sheep"))
        assertTrue(isPlural("deer"))
        assertTrue(isPlural("fish"))
        assertTrue(isPlural("cod"))
        assertTrue(isPlural("salmon"))
        assertTrue(isPlural("information"))
        assertTrue(isPlural("aircraft"))
    }

    @Test
    fun negativeCasePluralized() {
        assertFalse(isPlural("cat"))
        assertFalse(isPlural("resource"))
        assertFalse(isPlural("payment"))
        assertFalse(isPlural("order"))
        assertFalse(isPlural("parcel"))
        assertFalse(isPlural("item"))
        assertFalse(isPlural("commission"))
        assertFalse(isPlural("commission_group"))
        assertFalse(isPlural("article"))
        assertFalse(isPlural("merchant"))
        assertFalse(isPlural("warehouse-location"))
        assertFalse(isPlural("sales-channel"))
        assertFalse(isPlural("domain"))
        assertFalse(isPlural("address"))
        assertFalse(isPlural("bank-account"))
        assertFalse(isPlural("datum"))
        assertFalse(isPlural("child"))

    }

    @Test
    fun specialCasePluralized() {
        assertTrue(isPlural("vat")) //whitelisted
    }
}
