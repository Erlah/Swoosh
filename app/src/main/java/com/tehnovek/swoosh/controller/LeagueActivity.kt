package com.tehnovek.swoosh.controller

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.tehnovek.swoosh.Model.Player
import com.tehnovek.swoosh.R
import com.tehnovek.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")


    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "womens"
    }

    fun onCoedClicked(view: View) {
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        player.league = "co-ed"
    }

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)



        skillFinishBtn.setOnClickListener {
            if (!player.league.isEmpty()) {
                val skillActivity = Intent(this, SkillActivity::class.java)
                skillActivity.putExtra(EXTRA_PLAYER, player)
                startActivity(skillActivity)
            } else Toast.makeText(this, "Please select league", Toast.LENGTH_SHORT).show()
        }
    }
}
