package com.example.lab4

data class Items(
    val name: String,
    val detail: String,
    val icon: Int
)
var ListItems=mutableListOf(
    Items("name1","detail information1",R.drawable.anh1),
    Items("name2","detail information2",R.drawable.anh2),
    Items("name3","detail information3",R.drawable.anh3),
    Items("name4","detail information4",R.drawable.anh4),
)
