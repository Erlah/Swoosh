package com.tehnovek.swoosh

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "womens"
    }

    fun onCoedClicked(view: View) {
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        selectedLeague = "coed"
    }

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)



        leagueNextBtn.setOnClickListener {
            if (selectedLeague.isNotEmpty()) {
                val skillActivity = Intent(this, SkillActivity::class.java)
                skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
                startActivity(skillActivity)
            } else Toast.makeText(this, "Please select league", Toast.LENGTH_SHORT).show()
        }
    }
}
