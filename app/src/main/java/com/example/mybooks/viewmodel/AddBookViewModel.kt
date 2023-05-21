package com.example.mybooks.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.mybooks.moduls.Book
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class AddBookViewModel : ViewModel() {
    /*private val _bookList = mutableStateListOf<Book>()
    val bookList: List<Book> get() = _bookList

    private val _sucheingabe = MutableStateFlow("")
    val sucheingabe: StateFlow<String> = _sucheingabe

    fun setSucheingabe(sucheingabe: String) {
        _sucheingabe.value = sucheingabe
    }*/
    private val bookList = mutableListOf<Book>()

    fun addBook(book: Book) {
        bookList.add(book)
    }

    fun removeBook(book: Book) {
        bookList.remove(book)
    }

  /*  fun setBuchGelesen(book: Book, gelesen: Boolean) {
        val index = _bookList.indexOfFirst { it == book }
        if (index != -1) {
            _bookList[index].gelesen = gelesen
        }*/

    fun getAllBooks(): List<Book>{
        return bookList
    }
}


    //private val _addBooks = mutableListOf<Book>() //val?
   // val addBooks: List<Book>
   // get() = _addBooks //muss ich?

    /*private var books = mutableListOf<Book>()
    private val _bookList = MutableStateFlow<List<Book>>(emptyList())
    val buchListe: StateFlow<List<Book>> = _bookList

    fun setBuchGelesen(buch: Book, gelesen: Boolean) {
        // Finde das Buch in der Buchliste
        val index = _bookList.indexOfFirst { it == buch }
        if (index != -1) {
            // Aktualisiere den gelesenen Status des Buches
            _bookList[index].gelesen = gelesen
        }
    }

    fun addBook(book: Book)
    { //if (validateBuchData(titel, autor, year, isbn)) {
        books.add(book)
    }

    fun removeBook(book: Book)
    { books.remove(book)}


    fun getAllBooks(): List<Book>{
        return books
    }
    fun sordBook(book: Book)
    { }

    fun filterBook(){

    }
*/

