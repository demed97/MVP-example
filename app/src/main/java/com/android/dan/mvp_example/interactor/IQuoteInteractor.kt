package com.android.dan.mvp_example.interactor

import com.android.dan.mvp_example.entities.Quote
import io.reactivex.Observable

interface IQuoteInteractor {

    fun insert(quote: Quote)

    fun update(quote: Quote)

    fun delete(quote: Quote)

    fun deleteAllQuotes()

    fun getAllQuotes(): Observable<List<Quote>>
}