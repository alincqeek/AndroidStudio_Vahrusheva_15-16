package com.arlina.androidstudio_vahrusheva_15_16.ui_model

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.arlina.androidstudio_vahrusheva_15_16.data.schedule


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScheduleScreen(
    scheduleList: List<schedule>,
    onNavigateBack: () -> Unit
) {
    var selectedSubject by remember { mutableStateOf<schedule?>(null) }

    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text("Расписание") },
            navigationIcon = {
                IconButton(onClick = onNavigateBack) {
                    Icon(imageVector = androidx.compose.material.icons.Icons.Default.ArrowBack, contentDescription = "Назад")
                }
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        if (selectedSubject != null) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = selectedSubject!!.name, style = MaterialTheme.typography.titleLarge)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Преподаватель: ${selectedSubject!!.professor}")
                    Text(text = "Кабинет: ${selectedSubject!!.room}")
                    Text(text = "День: ${selectedSubject!!.dayOfWeek}")
                    Text(text = "Время: ${selectedSubject!!.time}")
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = { selectedSubject = null }) {
                        Text("Назад к списку")
                    }
                }
            }
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
            ) {
                items(scheduleList) { subject ->
                    SubjectsCard(
                        subject = subject,
                        onClick = { selectedSubject = subject },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun SubjectsCard(
    subject: schedule,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = subject.name, style = MaterialTheme.typography.titleMedium)
            Text(text = "Преподаватель: ${subject.professor}", style = MaterialTheme.typography.bodyMedium)
        }
    }
}