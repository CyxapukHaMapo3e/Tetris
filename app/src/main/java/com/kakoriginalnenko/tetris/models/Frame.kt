package com.kakoriginalnenko.tetris.models

import com.kakoriginalnenko.tetris.helper.array2dOfByte

/*
Свойство width задает необходимую ширину генерируемого фрейма. Свойство дата содержит
список элементов массива в пространстве значений ByteArray.
 */

class Frame(private val width: Int) {
    val data: ArrayList<ByteArray> = ArrayList()

    /*
    addRow обрабатывает строку, преобразуя каждый отдельный символ строки в байтовое представление, и добавляет
    байтовое представдление в байтовый массив, после чего байтовый массив добавляется в список данных.
     */
    fun addRow(byteStr: String): Frame {
        val row = ByteArray(byteStr.length)

        for(index in byteStr.indices){
            row[index] = "${byteStr[index]}".toByte()
        }
        data.add(row)
        return this
    }

    fun as2dByteArray(): Array<ByteArray>{
        val bytes = array2dOfByte(data.size,width)
        return data.toArray(bytes)
    }
}