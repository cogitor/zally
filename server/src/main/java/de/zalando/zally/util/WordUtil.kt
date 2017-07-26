package de.zalando.zally.util

import de.zalando.zally.external.jbossdna.Inflector
import java.util.HashSet

object WordUtil {
    private val INFLECTOR = Inflector()
    private val PLURAL_WHITELIST = HashSet(listOf("vat",
            "deer", "moose", "bison", "swine", "offspring",
            "aircraft", "spacecraft", "hovercraft", "watercraft", "sailcraft",
            "cod", "haddock", "salmon", "trout", "pike", "shrimp", "bream", "goldfish", "sailfish", "swordfish"
            ))
    fun isPlural(word: String): Boolean {
        if (PLURAL_WHITELIST.contains(word)) {
            return true
        }
        return INFLECTOR.pluralize(word) == word
    }
}
