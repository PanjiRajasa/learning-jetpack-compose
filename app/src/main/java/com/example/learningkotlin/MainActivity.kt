package com.example.learningkotlin


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningkotlin.ui.theme.LearningKotlinTheme
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.foundation.verticalScroll

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningKotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Halo(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Halo(modifier: Modifier = Modifier) {
    Column {
        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally) {

            /* Column 1 */
            Column(modifier = Modifier
                .align(Alignment.Start)) {
                Surface(modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                    color = Color.LightGray) {

                    Text(text = "Hello")
                }
            }

            /*Column 2*/
            Column(modifier = Modifier
                .padding(top = 10.dp)
                .align(Alignment.CenterHorizontally)) {
                Surface(modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                    color = Color.Blue) {
                    Text(text = "Hola",
                        color = Color.White)
                }
            }

            /* Column 3 */
            Column(modifier = Modifier
                .padding(top = 10.dp)
                .align(Alignment.End)) {
                Surface(modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                    color = Color.Yellow) {
                    Text(text = "Whatsupp bro",
                        color = Color.Gray)
                }
            }

            /* Column 3 */
            Column(modifier = Modifier
                .padding(top = 10.dp)
                .align(AbsoluteAlignment.Left)) {
                Surface(modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                    color = Color.Cyan) {
                    Text(text = "Hmmm",
                        color = Color.Gray)
                }
            }

            /* Column 4 */
            Column(modifier = Modifier
                .padding(top = 10.dp)
                .align(AbsoluteAlignment.Right)) {
                Surface(modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                    color = Color.Magenta) {
                    Text(text = "Waduh",
                        color = Color.Gray)
                }
            }


        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        /*Parent layout (column/row => horizontalAlignment/verticalArrangement)
        * Child layout (column/row => Modifier = modifier.Align(Alignment.value)) */
        // verticalScroll => Allow vertical scroll if contents is overflow, the argument is (rememberScrollState())

        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally) {

            /* Column 1 */
            Column(modifier = Modifier
                .align(Alignment.Start)) {
                Surface(modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                    color = Color.LightGray) {

                    Text(text = "Hello")
                }
            }

            /*Column 2*/
            Column(modifier = Modifier
                .padding(top = 10.dp)
                .align(Alignment.CenterHorizontally)) {
                Surface(modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                    color = Color.Blue) {
                    Text(text = "Hola",
                        color = Color.White)
                }
            }

            /* Column 3 */
            Column(modifier = Modifier
                .padding(top = 10.dp)
                .align(Alignment.End)) {
                Surface(modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                    color = Color.Yellow) {
                    Text(text = "What'supp bro",
                        color = Color.Gray)
                }
            }

            //on working
//            /* Column 3 */
//            Column(modifier = Modifier
//                .padding(top = 10.dp)
//                .align(AbsoluteAlignment.Left)) {
//                Surface(modifier = Modifier
//                    .width(200.dp)
//                    .height(200.dp),
//                    color = Color.Cyan) {
//                    Text(text = "Hmmm",
//                        color = Color.Gray)
//                }
//            }

//            /* Column 4 */
//            Column(modifier = Modifier
//                .padding(top = 10.dp)
//                .align(AbsoluteAlignment.Right)) {
//                Surface(modifier = Modifier
//                    .width(200.dp)
//                    .height(200.dp),
//                    color = Color.Magenta) {
//                    Text(text = "Waduh",
//                        color = Color.Gray)
//                }
//            }
//
//            /* Column 5 */
//            Column(modifier = Modifier
//                .padding(top = 10.dp)
//                .align(Alignment.CenterHorizontally)) {
//                Surface(modifier = Modifier
//                    .width(200.dp)
//                    .height(200.dp),
//                    color = Color.Magenta) {
//                    Text(text = "Waduh",
//                        color = Color.Gray)
//                }
//            }
        }

    }
