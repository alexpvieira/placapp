package com.example.placapp.ui.score

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.placapp.R
import kotlinx.android.synthetic.main.activity_score.*

class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        tvEventName.text = intent.getStringExtra("event_name")
        tvHome.text = intent.getStringExtra("home_team_name")
        tvAway.text = intent.getStringExtra("away_team_name")

        btGoalHome.setOnClickListener {

        }

        btGoalAway.setOnClickListener {
            
        }
    }
}
