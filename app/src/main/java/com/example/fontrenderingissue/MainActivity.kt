package com.example.fontrenderingissue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fontrenderingissue.ui.theme.FontrenderingissueTheme

// Font downloaded from https://www.fontshmonts.com/text-fonts/gibson/
// License.txt is included in the assets folder

// This sample should be tested by comparing how the font is rendered
// on a Pixel 5 (correctly) and a Pixel 6 (incorrectly)

val GibsonLight = FontFamily(Font(R.font.gibson_light))

val GibsonLightText = TextStyle(
    fontFamily = GibsonLight,
    fontSize = 16.sp,
    lineHeight = 24.sp
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FontrenderingissueTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Content()
                }
            }
        }
    }
}

@Composable
private fun Content() {
    Column(Modifier.padding(32.dp)) {
        Test(GibsonLightText)
    }
}

@Composable
private fun Test(textStyle: TextStyle) {
    Text(
        text =
        "søstrenes lemon curd og saltede karamel, men De kan let tilføje Deres" +
                " personlige favoritsmage." +
                " \"Eksperimentér gerne med udtrykket ved at tilføje",
        style = textStyle
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FontrenderingissueTheme {
        Content()
    }
}