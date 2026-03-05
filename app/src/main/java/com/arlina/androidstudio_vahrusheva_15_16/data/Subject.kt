package com.arlina.androidstudio_vahrusheva_15_16.data

data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits: Int,
    val currentGrade: String,
    val description: String
)

val sampleSubjects = listOf(
    Subject(
        id = "1",
        name = "Английский язык",
        professor = "Пенькова О.В",
        credits = 85,
        currentGrade = "Хорошо",
        description = "Изучение английского языка с углубленным изучением профессиональных тем"
    ),
    Subject(
        id = "2",
        name = "Системное программирование",
        professor = "Токаев Т.И",
        credits = 92,
        currentGrade = "Отлично",
        description = "Изучение системного программирования и написание программ на языке Rust"
    ),
    Subject(
        id = "3",
        name = "Физ культура",
        professor = "Магомедов С.К",
        credits = 78,
        currentGrade = "Хорошо",
        description = "Развитие общей физической силы и поддержание физической формы"
    ),
    Subject(
        id = "4",
        name = "Управление проектами",
        professor = "Трошина О.В",
        credits = 88,
        currentGrade = "Хорошо",
        description = "Изучение основ управления проектами и организации командной работы"
    ),
    Subject(
        id = "5",
        name = "Разработка программных модулей",
        professor = "Донскова Д.А.",
        credits = 81,
        currentGrade = "Хорошо",
        description = "Написание программ на языке C# и изучение новых конструкций языка"
    ),
    Subject(
        id = "6",
        name = "Менеджмент в профессиональной деятельности",
        professor = "Запорожская С.А",
        credits = 74,
        currentGrade = "Удовлетворительно",
        description = "Изучение основ менеджмента и организации профессиональной деятельности"
    ),
    Subject(
        id = "7",
        name = "Математическое моделирование",
        professor = "Трошина О.В",
        credits = 90,
        currentGrade = "Отлично",
        description = "Изучение методов математического моделирования и решение задач оптимизации"
    ),
    Subject(
        id = "8",
        name = "Инструментальные средства разработки программного обеспечения",
        professor = "Леонтьев Д.А.",
        credits = 95,
        currentGrade = "Отлично",
        description = "Разработка программного обеспечения с использованием C#, изучение backend и frontend разработки"
    ),
    Subject(
        id = "9",
        name = "Обеспечение качества функционирования компьютерных сетей",
        professor = "Ушакова М.А",
        credits = 83,
        currentGrade = "Хорошо",
        description = "Изучение методов обеспечения качества и стабильности компьютерных сетей"
    ),
    Subject(
        id = "10",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 97,
        currentGrade = "Отлично",
        description = "Разработка Android-приложений на Kotlin с использованием Jetpack Compose и архитектуры MVVM"
    )
)