package com.example.thriftbay.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.thriftbay.R
import com.example.thriftbay.viewmodel.AuthViewModel

@Composable
fun AuthScreen(modifier: Modifier = Modifier, navController: NavHostController) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter =  painterResource(id = R.drawable.banner),
            contentDescription = "Banner",
            modifier =  Modifier.fillMaxWidth()
                .height(300.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Start you shopping journey now",
            style = TextStyle(
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "best ecom platform with best prices",
            style = TextStyle(
                textAlign = TextAlign.Center
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {navController.navigate("login")},
            modifier = Modifier.fillMaxWidth()
                .height(60.dp)
        ) {
            Text(text ="Login", fontSize = 22.sp)
        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(onClick = {navController.navigate("signup")},
            modifier = Modifier.fillMaxWidth()
                .height(60.dp)
        ) {
            Text(text ="Signup", fontSize = 22.sp)
        }
    }
}