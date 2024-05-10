package com.koiyae.quandrantp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.koiyae.quandrantp.ui.theme.QuandrantPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuandrantPTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {padding ->
                    Quadrants(
                        modifier = Modifier.padding(padding)
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrants(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(modifier = Modifier.weight(1f)) {
            Columns(
                title = stringResource(R.string.title_1),
                description = stringResource(R.string.text_1),
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFEADDFF))
            )
            Columns(
                title = stringResource(R.string.title_2),
                description = stringResource(R.string.text_2),
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFD0BCFF))
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            Columns(
                title = stringResource(R.string.title_3),
                description = stringResource(R.string.text_3),
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFB69DF8))
            )
            Columns(
                title = stringResource(R.string.title_4),
                description = stringResource(R.string.text_4),
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0XFFF6EDFF))
            )
        }

    }
}

@Composable
private fun Columns(
    title: String,
    description: String,
    modifier: Modifier = Modifier,
){
    Column(
        modifier = modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                bottom = 16.dp
            )
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuandrantPTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) {padding ->
            Quadrants(
                modifier = Modifier.padding(padding)
            )
        }
    }
}