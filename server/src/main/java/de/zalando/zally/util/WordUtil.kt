package de.zalando.zally.util

import de.zalando.zally.external.jbossdna.Inflector
import java.util.HashSet

object WordUtil {
    private val INFLECTOR = Inflector()
    private val PLURAL_WHITELIST = HashSet(listOf("vat"))

    fun isPlural(word: String): Boolean {
        if (PLURAL_WHITELIST.contains(word)) {
            return true
        }
        return INFLECTOR.pluralize(word) == word
    }
}
