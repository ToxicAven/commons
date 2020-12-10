package org.kamiblue.commons.extension

fun <E: Any> MutableCollection<E>.add(e: E?) {
    if (e != null) this.add(e)
}

/**
 * Returns the sum of all values produced by [selector] function applied to each element in the collection.
 */
inline fun <T> Iterable<T>.sumByFloat(selector: (T) -> Float): Float {
    var sum = 0.0f
    for (element in this) {
        sum += selector(element)
    }
    return sum
}