package ru.hadron.newsapp.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import ru.hadron.newsapp.R

class BreakingNewsFragmentDirections private constructor() {
  companion object {
    fun actionBreakingNewsFragmentToArticleFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_breakingNewsFragment_to_articleFragment)
  }
}
