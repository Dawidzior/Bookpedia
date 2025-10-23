package com.dawid.bookpedia.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.dawid.bookpedia.book.data.database.DatabaseFactory
import com.dawid.bookpedia.book.data.database.FavouriteBookDatabase
import com.dawid.bookpedia.book.data.network.KtorRemoteBookDataSource
import com.dawid.bookpedia.book.data.network.RemoteBookDataSource
import com.dawid.bookpedia.book.data.repository.DefaultBookRepository
import com.dawid.bookpedia.book.domain.BookRepository
import com.dawid.bookpedia.book.presentation.SelectedBookViewModel
import com.dawid.bookpedia.book.presentation.book_detail.BookDetailViewModel
import com.dawid.bookpedia.book.presentation.book_list.BookListViewModel
import com.dawid.bookpedia.core.data.HttpClientFactory
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }

    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }

    single { get<FavouriteBookDatabase>().favouriteBookDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}