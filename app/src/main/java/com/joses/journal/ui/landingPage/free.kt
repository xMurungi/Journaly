package com.joses.journal.ui.landingPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Define calming color palette
val PrimaryCalmGreen = Color(0xFF8BC34A) // A calming, soft green
val DarkerCalmGreen = Color(0xFF689F38) // A slightly darker green for gradient
val BackgroundLight = Color(0xFFF9FBE7) // Very light yellow-green for background
val TextDark = Color(0xFF333333)       // Dark charcoal for main text
val TextMedium = Color(0xFF666666)     // Medium grey for secondary text
val ButtonLight = Color(0xFFFFFDE7)    // Off-white for light buttons
val ButtonDarkText = Color(0xFF424242) // Dark text for light buttons

// Feature card specific colors (can be themed or use similar calming tones)
val FeatureIconBackground1 = Color(0xFFDCEDC8) // Light green for icon background
val FeatureIconTint1 = Color(0xFF8BC34A)     // Matching green for icon tint

val FeatureIconBackground2 = Color(0xFFBBDEFB) // Light blue for icon background
val FeatureIconTint2 = Color(0xFF2196F3)     // Matching blue for icon tint

val FeatureIconBackground3 = Color(0xFFFFCCBC) // Light peach for icon background
val FeatureIconTint3 = Color(0xFFFF5722)     // Matching orange for icon tint


@Composable
fun JournalingWelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundLight) // Calming light background
            .systemBarsPadding(), // Handles insets for status/navigation bars
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Top Section: Logo, Tagline, Main CTA
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 64.dp, bottom = 32.dp, start = 24.dp, end = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // App Logo/Icon
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .padding(12.dp),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Edit, // A pen icon for journaling
                    contentDescription = "Journaling App Logo",
                    tint = PrimaryCalmGreen,
                    modifier = Modifier.size(60.dp)
                )
                // If you have a drawable logo, you can use:
                // Image(painter = painterResource(id = R.drawable.your_logo), contentDescription = "App Logo")
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "JOURNALY",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = TextDark,
                textAlign = TextAlign.Center,
                lineHeight = 48.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Your safe space to think, feel, and grow.",
                fontSize = 20.sp,
                color = TextMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.height(48.dp)) // More breathing space

            // Call to Action Buttons
            Button(
                onClick = {
                    // TODO: Navigate to journaling screen or sign-up flow
                    println("Start Journaling clicked!")
                },
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = PrimaryCalmGreen,
//                    contentColor = Color.White
//                ),
                shape = RoundedCornerShape(28.dp), // More rounded, pill-like
                modifier = Modifier
                    .fillMaxWidth(0.8f) // Wider button
                    .height(56.dp),
                elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 6.dp)
            ) {
                Text(
                    text = "Start Journaling",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    // TODO: Navigate to sign-in screen
                    println("Sign In clicked!")
                },
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = ButtonLight, // Off-white background
//                    contentColor = ButtonDarkText // Dark text
//                ),
                shape = RoundedCornerShape(28.dp),
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(56.dp),
                elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp)
            ) {
                Text(
                    text = "Sign In",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "or",
                fontSize = 16.sp,
                color = TextMedium,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    // TODO: Implement Google sign-in
                    println("Continue with Google clicked!")
                },
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color.White,
//                    contentColor = TextDark
//                ),
                shape = RoundedCornerShape(28.dp),
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(56.dp),
                elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp)
            ) {
                // You'd typically add a Google icon here
                Icon(
                    imageVector = Icons.Default.CheckCircle, // Placeholder icon for Google, replace with actual Google icon if available
                    contentDescription = "Google Icon",
                    tint = TextDark,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Continue with Google",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

        // Onboarding/Feature Highlights (simulating carousel slides)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) // Allows this section to take available space
                .padding(vertical = 16.dp, horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp) // Spacing between feature cards
        ) {
            // Feature 1: Capture your thoughts.
            FeatureCardJournal(
                icon = Icons.Default.Create, // Pen icon
                iconTint = FeatureIconTint1,
                iconBackground = FeatureIconBackground1,
                title = "Capture your thoughts.",
                description = "Easily write down your ideas, feelings, and experiences."
            )

            // Feature 2: Private. Secure. Just for you.
            FeatureCardJournal(
                icon = Icons.Default.Lock, // Lock icon
                iconTint = FeatureIconTint2,
                iconBackground = FeatureIconBackground2,
                title = "Private. Secure. Just for you.",
                description = "Your journal entries are encrypted and only accessible by you."
            )

            // Feature 3: Track your growth over time.
            FeatureCardJournal(
                icon = Icons.Filled.AccountBox, // Book or growth icon
                iconTint = FeatureIconTint3,
                iconBackground = FeatureIconBackground3,
                title = "Track your growth over time.",
                description = "Reflect on your journey and see how you evolve."
            )
        }

        // Footer
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent) // Make footer transparent to blend with background
                .padding(vertical = 24.dp, horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "“Today is a good day to begin.”",
                fontSize = 16.sp,
                color = TextMedium,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Terms",
                    fontSize = 12.sp,
                    color = TextMedium.copy(alpha = 0.7f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = " | ",
                    fontSize = 12.sp,
                    color = TextMedium.copy(alpha = 0.7f)
                )
                Text(
                    text = "Privacy Policy",
                    fontSize = 12.sp,
                    color = TextMedium.copy(alpha = 0.7f),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun FeatureCardJournal(
    icon: ImageVector,
    iconTint: Color,
    iconBackground: Color,
    title: String,
    description: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth(0.9f) // Slightly less than full width for spacing
            .clip(RoundedCornerShape(16.dp)), // Rounded corners
        elevation =  CardDefaults.cardElevation(4.dp), // Shadow
        colors = CardColors(
            containerColor = Color.White,
            contentColor = TextDark,
            disabledContainerColor = Color.White,
            disabledContentColor = Color.White
        )
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(iconBackground)
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null, // Icon is decorative
                    tint = iconTint,
                    modifier = Modifier.size(32.dp)
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = TextDark
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = description,
                    fontSize = 14.sp,
                    color = TextMedium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewJournalingWelcomeScreen() {
    MaterialTheme {
        JournalingWelcomeScreen()
    }
}
