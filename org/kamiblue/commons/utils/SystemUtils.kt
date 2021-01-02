package org.kamiblue.commons.utils

import java.awt.Toolkit
import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.StringSelection

object SystemUtils {

    fun copyToClipboard(text: String) {
        val selection = StringSelection(text)
        val clipboard: Clipboard = Toolkit.getDefaultToolkit().systemClipboard
        clipboard.setContents(selection, selection)
    }

    fun copyFromClipboard(): String? {
        val clipboard: Clipboard = Toolkit.getDefaultToolkit().systemClipboard
        return try {
            clipboard.getData(DataFlavor.stringFlavor)?.toString()
        } catch (e: Exception) {
            null
        }
    }

}