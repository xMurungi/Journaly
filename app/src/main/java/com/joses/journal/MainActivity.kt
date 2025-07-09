package com.joses.journal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.joses.journal.ui.landingPage.AppLandingScreen
import com.joses.journal.ui.landingPage.JournalingWelcomeScreen
import com.joses.journal.ui.landingPage.LandingPage
import com.joses.journal.ui.theme.JournalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JournalTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
//                    AppLandingScreen(
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    val pad = innerPadding
                    JournalingWelcomeScreen(
//                        modifier = Modifier.padding(innerPadding)
                    )

//                    LandingPage(
//                        modifier = Modifier.padding(innerPadding)
//                    )
                }
            }
        }
    }
}

