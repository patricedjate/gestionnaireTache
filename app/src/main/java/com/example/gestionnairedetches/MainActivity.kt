package com.example.gestionnairedetches

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.absolutePadding

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gestionnairedetches.ui.theme.GestionnaireDeTâchesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestionnaireDeTâchesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()
                        ) { innerPadding ->
                    CheckImage(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CheckText( modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.padding(0.dp,300.dp,0.dp,0.dp)
    ){
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(0.dp,24.dp,8.dp,0.dp)
                .align(alignment = Alignment.CenterHorizontally)


            )
        Text(
            text = "Nice work!",
                    modifier = Modifier
                    .padding(0.dp,16.dp,0.dp,0.dp)
                .align(alignment = Alignment.CenterHorizontally)


        )
    }
    }

@Composable
fun CheckImage(modifier : Modifier = Modifier){
    val image = painterResource(R.drawable.ic_task_completed)
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Image( painter = image,
            contentDescription = null,
            modifier = Modifier
            )
        CheckText()
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GestionnaireDeTâchesTheme {

    }
}