package com.android.dan.mvp_example.repository

import com.android.dan.mvp_example.entities.Quote
import io.reactivex.Observable

interface IQuoteRepository {

    fun insert(quote: Quote)

    fun update(quote: Quote)

    fun delete(quote: Quote)

    fun deleteAllQuotes()

    fun getAllQuotes(): Observable<List<Quote>>
}