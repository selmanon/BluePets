package com.cleancompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cleancompose.R
import com.cleancompose.ui.theme.BluePetsApplicationTheme
import com.cleancompose.ui.tools.DevicePreviews

@Composable
fun NetworkErrorIndicator(message: String, modifier: Modifier) {
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.wifi_off_icon),
                contentDescription = stringResource(
                    id = R.string.content_desc_error
                ),
                contentScale = ContentScale.Fit,
                modifier = modifier
                    .size(dimensionResource(id = R.dimen.icon_size))
            )

            Spacer(modifier.height(4.dp))

            Text(
                text = message,
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center
            )
        }

    }

}

@Preview
@DevicePreviews
@Composable
fun NetworkErrorIndicatorPreview(message: String = "Error network") {
    BluePetsApplicationTheme {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(
                Modifier
                    .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.wifi_off_icon),
                    contentDescription = stringResource(
                        id = R.string.content_desc_error
                    ),
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(dimensionResource(id = R.dimen.icon_size))
                )

                Spacer(Modifier.height(4.dp))

                Text(
                    text = message,
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center
                )
            }

        }
    }
}