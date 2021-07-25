package com.rmakiyama.kithub.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rmakiyama.kithub.model.Repo
import org.koin.androidx.compose.getViewModel

@Composable
fun HomeScreen() {
    val viewModel: HomeViewModel = getViewModel()
    val state: HomeViewState by viewModel.state.collectAsState(initial = HomeViewState.Empty)
    HomeScreen(
        state = state,
        onAction = { action -> viewModel.dispatch(action = action) },
    )
}

@Composable
private fun HomeScreen(
    state: HomeViewState,
    onAction: (HomeAction) -> Unit,
) {
    Surface(modifier = Modifier.fillMaxSize()) {
        RepositoryList(state.repos)
    }
}

@Composable
private fun RepositoryList(
    list: List<Repo>,
) {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 16.dp,
            vertical = 8.dp,
        ),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(list) { repo ->
            Text(text = repo.name)
        }
    }
}
