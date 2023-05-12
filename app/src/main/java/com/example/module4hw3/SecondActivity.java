package com.example.module4hw3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Fish> fishes = new ArrayList<Fish>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list_animal);

        FishAdapter adapter = new FishAdapter(this, fishes);

        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){
        fishes.add(new Fish("Сирихта","длина животных составляет около 16 см, вес редко превышает 160 г. Отличительной особенностью обезьян являются огромные, круглой формы, выпуклые глаза.",
                R.drawable.fish1,"Численность средняя"));
        fishes.add(new Fish("Плакса"," данный вид млекопитающих занесен в Красную книгу. Название обезьяны получили благодаря своим уникальным протяжным звукам, которые они издают.",
                R.drawable.fish2,"Численность большая (есть даже огненные)"));
        fishes.add(new Fish("Фави","обезьяны вырастают до 36 см, в то время как хвост их составляет около 70 см. Маленькие бурого цвета приматы с черными конечностями.",
                R.drawable.fish3,"Численность большая"));
        fishes.add(new Fish("Гусар","обезьяны с белыми носами и мощными, острыми клыками. Животные обладают длинноногим телом и удлиненной мордочкой.",
                R.drawable.fish4,"Численность большая"));
        fishes.add(new Fish("Борнейский орангутан","приматы могут вырастать до 140 см и весить около 180 кг. Обезьяны имеют короткие ноги, крупное тело и руки, свисающие ниже колен.",
                R.drawable.fish5,"Численность большая"));
    }
}