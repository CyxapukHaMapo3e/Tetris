package com.kakoriginalnenko.tetris.helper

/*
Первый аргумент - номер строки создаваемого массива, а второй - номер столбца сгенерированного массива байтов.
Метод array2dOfByte() генерирует и возвращает новый массив с указанными свойствами.
 */

fun array2dOfByte(sizeOuter: Int, sizeInner: Int): Array<ByteArray> = Array(sizeOuter){ByteArray(sizeInner)}

