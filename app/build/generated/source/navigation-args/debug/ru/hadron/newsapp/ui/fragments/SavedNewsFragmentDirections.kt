package ru.hadron.newsapp.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import ru.hadron.newsapp.R

class SavedNewsFragmentDirections private constructor() {
  companion object {
    fun actionSavedNewsFragmentToArticleFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_savedNewsFragment_to_articleFragment)
  }
}
