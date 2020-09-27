package com.android.dan.mvp_example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.android.dan.mvp_example.R
import com.android.dan.mvp_example.entities.Quote
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val quotePresenter: QuotePresenter by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeUI()
    }

    private fun initializeUI() {
        quotePresenter.getAllQuotes().observe(this, Observer<List<Quote>> { quotes ->
            val stringBuilder = StringBuilder()
            quotes.forEach { quote ->
                stringBuilder.append("$quote\n\n")
            }
            textView_quotes.text = stringBuilder.toString()
        })

        button_add_quote.setOnClickListener {
            val quote = Quote(
                null,
                editText_quote.text.toString(),
                editText_author.text.toString()
            )
            quotePresenter.insert(quote)
            editText_quote.setText("")
            editText_author.setText("")
        }

        button_delete_quote.setOnClickListener {
            quotePresenter.deleteAllQuotes()
        }
    }
}