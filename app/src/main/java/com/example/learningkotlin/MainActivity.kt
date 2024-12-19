package com.example.learningkotlin


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
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
                Surface (color = Color.White)
                {
                    /*Column*/
                    Column(modifier = Modifier
                        .height(500.dp),
                        horizontalAlignment = Alignment.CenterHorizontally) {

                        CustomItem(weight = 3f, color = Color.Magenta)
                        CustomItem(weight = 1f)
                    }

                    Column(modifier = Modifier
                        .height(500.dp).background(Color.White),
                        verticalArrangement = Arrangement.SpaceEvenly) {
                        /* Row */
                        Row(horizontalArrangement = Arrangement.Center) {

                            RowItem(weight = 1f, color = Color.Gray)
                            RowItem(weight = 2f, color = Color.Blue)
                        }

                        /* Row */
                        Row(horizontalArrangement = Arrangement.Center) {

                            RowItem(weight = 1f, color = Color.Gray)
                            RowItem(weight = 2f, color = Color.Green)
                        }
                    }
                }
            }
        }
    }
}




//Bab Column dan Row

//saat membuat function composable jika kita ingin mencantumkan attribute yang hanya dimiliki oleh child column/row => ColumnScrope/RowScope
//parameter Composable => name:dataType = defaultValue (optional)
@Composable
fun ColumnScope.CustomItem(weight: Float, color: Color = Color.Green) {
    Surface(modifier = Modifier
        .width(200.dp)
        .weight(weight),
        color = color) {}
}

@Composable
fun RowScope.RowItem(weight: Float, color: Color = Color.Green) {
    Surface(modifier = Modifier
        .width(50.dp)
        .height(50.dp)
        .weight(weight),
        color = color) {}
}


@Preview(showBackground = true)
@Composable
fun ColumnLearning() {
    /*Parent layout (column/row => horizontalAlignment/verticalArrangement bisa juga horizontalArrangement/verticalAlignment)
    * Child layout (column/row => Modifier = modifier.Align(Alignment.value)) */
    // verticalScroll => Allow vertical scroll if contents is overflow, the argument is (rememberScrollState())

    /*Column*/
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        CustomItem(weight = 3f, color = Color.Magenta)
        CustomItem(weight = 1f)
    }
}

@Preview(showBackground = true)
@Composable
fun RowLearning() {

        /*Column pembungkus*/
    Column(modifier = Modifier
        .height(500.dp).background(Color.White),
        verticalArrangement = Arrangement.SpaceEvenly) {
            /* Row */
            Row(horizontalArrangement = Arrangement.Center) {

                RowItem(weight = 1f, color = Color.Gray)
                RowItem(weight = 2f, color = Color.Blue)
            }

            /* Row */
            Row(horizontalArrangement = Arrangement.Center) {

                RowItem(weight = 1f, color = Color.Gray)
                RowItem(weight = 2f, color = Color.Green)
            }
    }
}