package com.tehnovek.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tehnovek.swoosh.R
import com.tehnovek.swoosh.Utilities.EXTRA_LEAGUE
import com.tehnovek.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)
        searchLeagueText.text = "Loocking for a $league $skill league near you..."

    }
}
