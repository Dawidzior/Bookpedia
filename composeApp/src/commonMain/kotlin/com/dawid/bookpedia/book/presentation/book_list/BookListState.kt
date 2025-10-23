package com.dawid.bookpedia.book.presentation.book_list

import com.dawid.bookpedia.book.domain.Book
import com.dawid.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "",
    val searchResults: List<Book> = emptyList(),
    val favouriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)