package com.tehnovek.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tehnovek.swoosh.Model.Player
import com.tehnovek.swoosh.R
import com.tehnovek.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeagueText.text = "Loocking for a ${player.league} ${player.skill} league near you..."

    }
}
