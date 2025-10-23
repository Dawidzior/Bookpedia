package com.dawid.bookpedia.book.presentation.book_detail

import com.dawid.bookpedia.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavourite: Boolean = false,
    val book: Book? = null
)