package team449.frc.scoutingappbase.helpers

import android.util.Log
import team449.frc.scoutingappbase.StaticResources
import java.io.File
import java.io.IOException


fun writeToFile(filename: String, data: String) {
    try {
        File(StaticResources.filesDir, filename).writeText(data)
    } catch (e: IOException) {
        e.printStackTrace()
        Log.e("writeToFile", "IOException while writing $filename")
    }
}

fun readFromFile(filename: String): String? =
    try {
        File(StaticResources.filesDir, filename).readText()
    } catch (e: IOException) {
        e.printStackTrace()
        Log.e("readFromFile", "IOException while reading $filename")
        null
    }


fun clearFile(filename: String) {
    writeToFile(filename,"")
}