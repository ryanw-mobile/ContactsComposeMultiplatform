package com.plcoding.contactscomposemultiplatform.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.asComposeImageBitmap
import org.jetbrains.skia.Image
import org.jetbrains.skia.Bitmap

@Composable
actual fun rememberBitmapFromBytes(bytes: ByteArray?): ImageBitmap? {
    return remember(bytes) {
        bytes?.let {
            Bitmap.makeFromImage(
                Image.makeFromEncoded(it)
            ).asComposeImageBitmap()
        }
    }
}
