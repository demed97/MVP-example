package com.android.dan.mvp_example.interactor

import com.android.dan.mvp_example.entities.Quote
import com.android.dan.mvp_example.repository.IQuoteRepository
import io.reactivex.Observable

class QuoteInteractor(private val iQuoteRepository: IQuoteRepository) :
    IQuoteInteractor {

    override fun insert(quote: Quote) {
        iQuoteRepository.insert(quote)
    }

    override fun update(quote: Quote) {
        iQuoteRepository.update(quote)
    }

    override fun delete(quote: Quote) {
        iQuoteRepository.delete(quote)
    }

    override fun deleteAllQuotes() {
        iQuoteRepository.deleteAllQuotes()
    }

    override fun getAllQuotes(): Observable<List<Quote>> {
        return iQuoteRepository.getAllQuotes()
    }
}