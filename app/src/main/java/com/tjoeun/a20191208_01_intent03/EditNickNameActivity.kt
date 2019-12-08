package com.tjoeun.a20191208_01_intent03

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*
import java.nio.channels.InterruptedByTimeoutException
import java.sql.ResultSet

class EditNickNameActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        nickNameCancelBtn.setOnClickListener {
            finish() //현재 액티비티를 종료시킴
        }

        nickNameOkBtn.setOnClickListener {
            val InputNickName = inputNickNameEdt.text.toString()
            val NicknameIntent = Intent()

            NicknameIntent.putExtra("nickname",InputNickName)
            setResult(Activity.RESULT_OK,NicknameIntent)
            finish()
        }
    }
}
