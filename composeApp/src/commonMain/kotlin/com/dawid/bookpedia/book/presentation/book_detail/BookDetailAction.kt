package com.dawid.bookpedia.book.presentation.book_detail

import com.dawid.bookpedia.book.domain.Book

sealed interface BookDetailAction {
    data object OnBackClick : BookDetailAction
    data object OnFavouriteClick : BookDetailAction
    data class OnSelectedBookChange(val book: Book) : BookDetailAction
}