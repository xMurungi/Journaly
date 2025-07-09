package com.joses.journal.ui.landingPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Define some custom colors for the gradient and accents
val PrimaryBlue = Color(0xFF3B82F6) // Corresponds to Tailwind blue-600
val DarkerBlue = Color(0xFF4F46E5) // Corresponds to Tailwind indigo-700
val LightBlue = Color(0xFFDBEAFE) // Corresponds to Tailwind blue-100
val AccentBlue = Color(0xFF60A5FA) // Corresponds to Tailwind blue-500
val AccentGreen = Color(0xFF22C55E) // Corresponds to Tailwind green-500
val AccentPurple = Color(0xFFA855F7) // Corresponds to Tailwind purple-500
val Gray800 = Color(0xFF1F2937)
val Gray600 = Color(0xFF4B5563)
val Gray100 = Color(0xFFF3F4F6)

@Composable
fun AppLandingScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Gray100) // Light gray background
            .systemBarsPadding(), // Handles insets for status/navigation bars
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header/Hero Section
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(PrimaryBlue, DarkerBlue)
                    )
                )
                .padding(vertical = 64.dp, horizontal = 16.dp)
                .wrapContentHeight(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // App Logo/Icon
                Box(
                    modifier = Modifier
                        .size(96.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Phone, // A generic Android phone icon
                        contentDescription = "App Logo",
                        tint = PrimaryBlue,
                        modifier = Modifier.size(64.dp)
                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "Welcome to Your Amazing App",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    lineHeight = 38.sp
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Your ultimate solution for boosting productivity and simplifying your life.",
                    fontSize = 18.sp,
                    color = LightBlue,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(32.dp))
                Button(
                    onClick = {
                        // TODO: Implement navigation to main app content
                        println("Get Started button clicked!")
                    },
                    colors = ButtonDefaults.buttonColors(

//                        backgroundColor = Color.White,
//                        contentColor = PrimaryBlue
                    ),
                    shape = RoundedCornerShape(50), // Fully rounded
                    modifier = Modifier
                        .height(56.dp)
                        .padding(horizontal = 32.dp),
                    elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 8.dp)
                ) {
                    Text(
                        text = "Get Started Now!",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 16.dp)
                    )
                }
            }
        }

        // Features Section
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) // Allows this section to grow and take available space
                .padding(vertical = 32.dp, horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "What You'll Love About Our App",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Gray800,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 24.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Column(
                verticalArrangement = Arrangement.spacedBy(24.dp), // Spacing between feature cards
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Feature 1
                FeatureCard(
                    icon = Icons.Default.CheckCircle,
                    iconTint = AccentBlue,
                    iconBackground = LightBlue,
                    title = "Intuitive Interface",
                    description = "Enjoy a user-friendly design that makes navigating the app effortless and enjoyable."
                )

                // Feature 2
                FeatureCard(
                    icon = Icons.Default.Info, // Using a generic info icon, replace if needed
                    iconTint = AccentGreen,
                    iconBackground = Color(0xFFD1FAE5), // Light green
                    title = "Powerful Features",
                    description = "Unlock a suite of robust features designed to cater to all your needs and beyond."
                )

                // Feature 3
                FeatureCard(
                    icon = Icons.Default.Phone, // Using a generic phone icon, replace if needed
                    iconTint = AccentPurple,
                    iconBackground = Color(0xFFF3E8FF), // Light purple
                    title = "Cross-Platform Sync",
                    description = "Seamlessly sync your data across all your devices, never miss a beat."
                )
            }
        }

        // Footer
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Gray800)
                .padding(vertical = 24.dp, horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "© 2025 Your App Name. All rights reserved.",
                fontSize = 12.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Privacy Policy | Terms of Service",
                fontSize = 12.sp,
                color = Color.White.copy(alpha = 0.7f),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun FeatureCard(
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
//        elevation =  4.dp, // Shadow
//        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier.padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
                    .background(iconBackground)
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null, // Icon is decorative
                    tint = iconTint,
                    modifier = Modifier.size(32.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Gray800,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = description,
                fontSize = 16.sp,
                color = Gray600,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAppLandingScreen() {
    MaterialTheme {
        AppLandingScreen()
    }
}
