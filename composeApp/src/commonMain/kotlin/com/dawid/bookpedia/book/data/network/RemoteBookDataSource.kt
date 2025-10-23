package com.dawid.bookpedia.book.data.network

import com.dawid.bookpedia.book.data.dto.BookWorkDto
import com.dawid.bookpedia.book.data.dto.SearchResponseDto
import com.dawid.bookpedia.core.domain.DataError
import com.dawid.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}