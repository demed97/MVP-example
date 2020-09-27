package com.android.dan.mvp_example.ui

import androidx.lifecycle.LiveData
import com.android.dan.mvp_example.entities.Quote


interface IQuotePresenter {

    fun insert(quote: Quote)

    fun update(quote: Quote)

    fun delete(quote: Quote)

    fun deleteAllQuotes()

    fun getAllQuotes(): LiveData<List<Quote>>

    fun loadQuotes()
}
