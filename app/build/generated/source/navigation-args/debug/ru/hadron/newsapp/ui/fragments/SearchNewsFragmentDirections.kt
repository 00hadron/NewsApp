package ru.hadron.newsapp.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import ru.hadron.newsapp.R

class SearchNewsFragmentDirections private constructor() {
  companion object {
    fun actionSearchNewsFragmentToArticleFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_searchNewsFragment_to_articleFragment)
  }
}
