package com.tehnovek.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.tehnovek.swoosh.Utilities.EXTRA_LEAGUE
import com.tehnovek.swoosh.R
import com.tehnovek.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var selectedSkill = ""

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        selectedSkill = "beginner"
    }

    fun onBallerClicked(view: View) {
        begginerSkillBtn.isChecked = false
        selectedSkill = "baller"
    }

    fun onFinishClicked(view: View) {
        if (selectedSkill.isNotEmpty()) {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,selectedSkill)
            startActivity(finishActivity)
        } else Toast.makeText(this, "Please select your skil.", Toast.LENGTH_SHORT).show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
