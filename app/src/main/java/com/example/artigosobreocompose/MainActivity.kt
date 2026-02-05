package com.example.artigosobreocompose

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artigosobreocompose.ui.theme.ArtigoSobreOComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtigoSobreOComposeTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(title = stringResource(R.string.titleTutorial), introduction = stringResource(R.string.textIntroduction), description = stringResource(R.string.textDescription) )
                }
            }
        }
    }
}

@Composable
fun GreetingText(title: String, introduction: String, description: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        fontSize = 24.sp,
        modifier = modifier
            .padding(10.dp, 10.dp)
    )

    Text(
        text = introduction,
        fontSize = 18.sp,
        textAlign = TextAlign.Justify,
        modifier = modifier
            .padding(10.dp, 10.dp)
    )

    Text(
        text = description,
        fontSize = 18.sp,
        textAlign = TextAlign.Justify,
        modifier = modifier
            .padding(10.dp, 16.dp)
    )
}


@Composable
fun GreetingImage(title: String, introduction: String, description: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.composebackground)
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image (
            painter = image,
            contentDescription = null
        )

        GreetingText(
            title = title,
            introduction = introduction,
            description = description,
            modifier = Modifier
        )
    }




}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtigoSobreOComposeTheme {
        GreetingImage(stringResource(R.string.titleTutorial), introduction = stringResource(R.string.textIntroduction),
            stringResource(R.string.textDescription)
        )
    }
}