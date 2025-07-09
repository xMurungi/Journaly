package com.joses.journal.ui.landingPage

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joses.journal.ui.theme.JournalTheme

@Composable
fun LandingPage(
    modifier: Modifier = Modifier,
) {
    LandingPageUi(
        modifier = modifier,
        name = "Joses",
    )
}

@Composable
fun LandingPageUi(
    name: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.padding(10.dp).fillMaxSize()
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Text(
            text = "Welcome to your journaling app",
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JournalTheme {
        LandingPage()
    }
}
