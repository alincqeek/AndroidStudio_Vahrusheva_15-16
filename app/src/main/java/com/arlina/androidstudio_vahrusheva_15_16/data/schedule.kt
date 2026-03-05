package com.arlina.androidstudio_vahrusheva_15_16.data

import kotlin.String

data class schedule(
    val id: String,
    val name: String,
    val professor: String,
    val dayOfWeek: String,
    val time: String,
    val room: String
)


val sampleSchedule = listOf(
    schedule(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        dayOfWeek = "Понедельник",
        time = "09:00 - 10:30",
        room = "101"
    ),
    schedule(
        id = "2",
        name = "Английский язык",
        professor = "Пенькова О.В",
        dayOfWeek = "Понедельник",
        time = "10:45 - 12:15",
        room = "202"
    ),
    schedule(
        id = "3",
        name = "Системное программирование",
        professor = "Токаев Т.И",
        dayOfWeek = "Понедельник",
        time = "13:00 - 14:30",
        room = "303"
    ),
    schedule(
        id = "4",
        name = "Физ культура",
        professor = "Магомедов С.К",
        dayOfWeek = "Вторник",
        time = "09:00 - 10:30",
        room = "Спортзал"
    ),
    schedule(
        id = "5",
        name = "Менеджмент в профессиональной деятельности",
        professor = "Запорожская С.А",
        dayOfWeek = "Вторник",
        time = "10:45 - 12:15",
        room = "204"
    ),
    schedule(
        id = "6",
        name = "Разработка программных модулей",
        professor = "Донскова Д.А.",
        dayOfWeek = "Вторник",
        time = "13:00 - 14:30",
        room = "305"
    ),
    schedule(
        id = "7",
        name = "Математическое моделирование",
        professor = "Трошина О.В",
        dayOfWeek = "Среда",
        time = "09:00 - 10:30",
        room = "102"
    ),
    schedule(
        id = "8",
        name = "Инструментальные средства разработки ПО",
        professor = "Леонтьев Д.А.",
        dayOfWeek = "Среда",
        time = "10:45 - 12:15",
        room = "201"
    ),
    schedule(
        id = "9",
        name = "Обеспечение качества функционирования сетей",
        professor = "Ушакова М.А",
        dayOfWeek = "Среда",
        time = "13:00 - 14:30",
        room = "303"
    ),
    schedule(
        id = "10",
        name = "Управление проектами",
        professor = "Трошина О.В",
        dayOfWeek = "Четверг",
        time = "09:00 - 10:30",
        room = "102"
    ),
    schedule(
        id = "11",
        name = "Системное программирование",
        professor = "Токаев Т.И",
        dayOfWeek = "Четверг",
        time = "10:45 - 12:15",
        room = "303"
    ),
    schedule(
        id = "12",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        dayOfWeek = "Четверг",
        time = "13:00 - 14:30",
        room = "101"
    ),
    schedule(
        id = "13",
        name = "Физ культура",
        professor = "Магомедов С.К",
        dayOfWeek = "Пятница",
        time = "09:00 - 10:30",
        room = "Спортзал"
    ),
    schedule(
        id = "14",
        name = "Английский язык",
        professor = "Пенькова О.В",
        dayOfWeek = "Пятница",
        time = "10:45 - 12:15",
        room = "202"
    ),
    schedule(
        id = "15",
        name = "Математическое моделирование",
        professor = "Трошина О.В",
        dayOfWeek = "Пятница",
        time = "13:00 - 14:30",
        room = "102"
    )
)