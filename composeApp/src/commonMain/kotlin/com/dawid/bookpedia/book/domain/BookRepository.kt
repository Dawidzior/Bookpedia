package com.dawid.bookpedia.book.domain

import com.dawid.bookpedia.core.domain.DataError
import com.dawid.bookpedia.core.domain.EmptyResult
import com.dawid.bookpedia.core.domain.Result
import kotlinx.coroutines.flow.Flow

interface BookRepository {

    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
    suspend fun getBookDescription(bookId: String): Result<String?, DataError.Remote>

    fun getFavouriteBooks(): Flow<List<Book>>
    fun isBookFavourite(id: String): Flow<Boolean>
    suspend fun markAsFavourite(book: Book): EmptyResult<DataError.Local>
    suspend fun deleteFromFavourites(id: String)
}