package com.example.thriftbay.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.thriftbay.components.BannerView
import com.example.thriftbay.components.HeaderView

@Composable
fun HomePage(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
            .padding(16.dp)
    ) {
        HeaderView(modifier)
        Spacer(modifier= Modifier.height(10.dp))
        BannerView(modifier= Modifier.height(200.dp))
    }
}