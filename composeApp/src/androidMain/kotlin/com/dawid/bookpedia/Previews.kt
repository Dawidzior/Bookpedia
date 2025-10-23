package com.dawid.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.dawid.bookpedia.book.domain.Book
import com.dawid.bookpedia.book.presentation.book_list.BookListScreen
import com.dawid.bookpedia.book.presentation.book_list.BookListState
import com.dawid.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview
@Composable
private fun BookSearchbarPreview() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        BookSearchBar(
            "",
            {},
            onImeSearch = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}


@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {}
    )
}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "http://test.com",
        authors = listOf("Author"),
        description = "Description $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.75454,
        ratingCount = 7,
        numPages = 100,
        numEditions = 2,
    )
}