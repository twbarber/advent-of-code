package me.twbarber.advent

import java.io.File
import java.io.InputStreamReader

object ResourceLoader {

    fun loadAsText(file: String): String {
        val fileStream = File(javaClass.classLoader.getResource(file).file)
        val fileReader: InputStreamReader? = fileStream.reader()
        return fileReader?.readText() ?: "File Not Found"
    }

}
