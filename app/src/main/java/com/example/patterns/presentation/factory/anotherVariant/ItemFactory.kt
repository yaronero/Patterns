package com.example.patterns.presentation.factory.anotherVariant

class ItemFactory {

    fun createStandardItem(): Item {
        return Item(-1, "", 0)
    }

    fun createItemFromId(id: Int): Item{
        return Item(id, "Name $id", id * 3)
    }
}