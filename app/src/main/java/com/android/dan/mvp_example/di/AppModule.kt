package com.android.dan.mvp_example.di

import androidx.room.Room
import androidx.room.RoomDatabase
import com.android.dan.mvp_example.data.database.AppDatabase
import com.android.dan.mvp_example.interactor.IQuoteInteractor
import com.android.dan.mvp_example.interactor.QuoteInteractor
import com.android.dan.mvp_example.repository.IQuoteRepository
import com.android.dan.mvp_example.repository.QuoteRepository
import com.android.dan.mvp_example.ui.QuotePresenter
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { Room.databaseBuilder(get(), AppDatabase::class.java, "quotes_database").build() }

    single { get<AppDatabase>().quoteDao() }

    single<IQuoteRepository> { QuoteRepository(get()) }

    single<IQuoteInteractor> { QuoteInteractor(get()) }

    viewModel { QuotePresenter(get()) }
}