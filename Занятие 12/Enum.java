package com.pvt;

public enum Enum {
    ЯНВАРЬ("Козерог", "Водолей", 20),
    Февраль("Водолей", "Рыбы", 20),
    Март("Рыбы", "Овен", 22),
    Апрель("Овен", "Телец", 22),
    МАЙ("Телец", "Близнецы", 22),
    ИЮНЬ("Близнецы", "Рак", 22),
    ИЮЛЬ("Рак", "Лев", 22),
    АВГУСТ("Лев", "Дева", 22),
    СЕНТЯБРЬ("Дева", "Весы", 22),
    ОКТЯБРЬ("Весы", "Скорпион", 22),
    НОЯБРЬ("Скорпион", "Стрелец", 21),
    ДЕКАБРЬ("Стрелец", "Козерог", 22);
    public String printZodiac(int birthDay) {
        return birthDay >= day ? zodiac2 : zodiac;
    }

    Enum(String zodiac, String zodiac2, int day) {
        this.zodiac = zodiac;
        this.zodiac2 = zodiac2;
        this.day = day;
    }
    String zodiac;
    String zodiac2;
    int day;

}

