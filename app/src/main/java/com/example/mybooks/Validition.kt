package com.example.mybooks

import androidx.compose.runtime.*
import java.time.LocalDate
import java.util.*

@Composable
fun Validition(){}


fun validateInputs(title: String, autor: String, isbn: String, year: String): Boolean {
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    if (title.isEmpty() || autor.isEmpty() || year.isEmpty() || isbn.isEmpty()) {
        return false
    }

    if (year.toIntOrNull() == null || year.toInt() > currentYear) {
        return false
    }

    val isbnPattern = """^\d{1,5}-\d{1,7}-\d{1,6}-\d{1}$"""
    if (!isbn.matches(isbnPattern.toRegex())) {
        return false
    }

    return true
}
/*
fun Validition(){}


    // Funktion zur Validierung des Buchtitels und des Autors/Autorin
    fun validateTitleAndAuthor(titel: String, autor: String): Boolean {
        return titel.isNotBlank() && autor.isNotBlank()
    }

    // Funktion zur Validierung des Datums der Erstveröffentlichung
    fun validateYear(year: Int): Boolean {
        // Validierung der Erstveröffentlichung
        val currentYear = LocalDate.now().year
        return year in 0..currentYear
    }

    // Funktion zur Validierung der ISBN
    fun validateISBN(isbn: String): Boolean {
        // Validierung der ISBN
        val isbnRegex = Regex("^\\d{1,5}-\\d{1,7}-\\d{1,6}-\\d{1}\$")
        if (!isbn.matches(isbnRegex)) {
            return false
        }

        // Entferne alle "-" aus der ISBN
        val cleanISBN = isbn.replace("-", "")

        // Validierung der Prüfziffer
        val pruefziffer = cleanISBN.last().toString().toInt()
        val sum = cleanISBN.dropLast(1)
            .mapIndexed { index, char ->
                val digit = char.toString().toInt()
                if (index % 2 == 0) digit else digit * 3
            }
            .sum()

        val checksum = (10 - sum % 10) % 10
        return pruefziffer == checksum
    }

    // Funktion zum Überprüfen aller Validierungen
@Composable
    fun validateBuchData(titel: String, autor: String, year: Int, isbn: String): Boolean {
        var validationErrorMessage by remember { mutableStateOf("") }

        val isTitleValid = validateTitleAndAuthor(titel, autor)
        val isYearValid = validateYear(year)
        val isISBNValid = validateISBN(isbn)
        validationErrorMessage = when {
            !isTitleValid -> "Titel darf nicht leer sein."
            !isYearValid -> "Ungültiges Jahr der Erstveröffentlichung."
            !isISBNValid -> "Ungültige ISBN."
            else -> ""
        }

        return isTitleValid && isYearValid && isISBNValid
    }
*/
