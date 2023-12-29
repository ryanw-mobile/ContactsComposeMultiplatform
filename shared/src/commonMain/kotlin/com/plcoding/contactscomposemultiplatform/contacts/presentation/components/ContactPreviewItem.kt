package com.plcoding.contactscomposemultiplatform.contacts.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.plcoding.contactscomposemultiplatform.contacts.domain.Contact

@Composable
fun ContactPreviewItem(
    modifier: Modifier = Modifier,
    contact: Contact,
    onClick: () -> Unit,
) {
    Column(
        modifier = modifier.clickable(onClick = onClick),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ContactPhoto(
            contact = contact,
            modifier = Modifier.size(50.dp),
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = contact.firstName,
        )
    }
}
