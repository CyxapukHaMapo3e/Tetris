package com.kakoriginalnenko.tetris.storage

import android.content.Context
import android.content.SharedPreferences

private const val HIGH_SCORE = "HIGH_SCORE"

class AppPreferences(ctx: Context) {

    var data: SharedPreferences = ctx.getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE)

    fun saveHighScore(highScore: Int){
        data.edit().putInt(HIGH_SCORE, highScore).apply()
    }

    fun getHighScore(): Int{
        return data.getInt(HIGH_SCORE, 0)
    }

    fun clearHighScore() {
        data.edit().putInt(HIGH_SCORE,0).apply()
    }
}