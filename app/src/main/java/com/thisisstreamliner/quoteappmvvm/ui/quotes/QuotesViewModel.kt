package com.thisisstreamliner.quoteappmvvm.ui.quotes

import androidx.lifecycle.ViewModel
import com.thisisstreamliner.quoteappmvvm.data.Quote
import com.thisisstreamliner.quoteappmvvm.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQutes(quote: Quote) = quoteRepository.addQuote(quote)
}