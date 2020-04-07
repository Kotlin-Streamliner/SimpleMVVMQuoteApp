package com.thisisstreamliner.quoteappmvvm.utilities

import com.thisisstreamliner.quoteappmvvm.data.FakeDatabase
import com.thisisstreamliner.quoteappmvvm.data.QuoteRepository
import com.thisisstreamliner.quoteappmvvm.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQutesViewModelFactory() : QuotesViewModelFactory {
        val quotesRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quotesRepository)
    }
}