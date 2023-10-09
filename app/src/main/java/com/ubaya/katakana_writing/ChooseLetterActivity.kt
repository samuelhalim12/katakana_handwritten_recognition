package com.ubaya.katakana_writing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choose_letter.*

class ChooseLetterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_letter)
        buttonChooseA.setOnClickListener() {
                // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ア")
            intent.putExtra("explanation", "ア (a) - アイスクリーム (aisukuriimu) - ice cream")
            startActivity(intent)
        }
        buttonChooseI.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "イ")
            intent.putExtra("explanation", "イ (i) - イギリス (igirisu) - England")
            startActivity(intent)
        }
        buttonChooseU.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ウ")
            intent.putExtra("explanation", "ウ (u) - ウォーター (wootaa) - water")
            startActivity(intent)
        }
        buttonChooseE.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "エ")
            intent.putExtra("explanation", "エ (e) - エスカレーター (esukareetaa) - escalator")
            startActivity(intent)
        }
        buttonChooseO.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "オ")
            intent.putExtra("explanation", "オ (o) - オレンジ (orenji) - orange")
            startActivity(intent)
        }
        buttonChooseKa.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "カ")
            intent.putExtra("explanation", "カ (ka) - カメラ (kamera) - camera")
            startActivity(intent)
        }
        buttonChooseKi.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "キ")
            intent.putExtra("explanation", "キ (ki) - キャンディー (kyandii) - candy")
            startActivity(intent)
        }
        buttonChooseKu.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ク")
            intent.putExtra("explanation", "ク (ku) - クッキー (kukkii) - cookie")
            startActivity(intent)
        }
        buttonChooseKe.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ケ")
            intent.putExtra("explanation", "ケ (ke) - ケーキ (keeki) - cake")
            startActivity(intent)
        }
        buttonChooseKo.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "コ")
            intent.putExtra("explanation", "コ (ko) - コーヒー (koohii) - coffee")
            startActivity(intent)
        }
        buttonChooseSa.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "サ")
            intent.putExtra("explanation", "サ (sa) - サラダ (sarada) - salad")
            startActivity(intent)
        }
        buttonChooseShi.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "シ")
            intent.putExtra("explanation", "シ (shi) - シャンプー (shampuu) - shampoo")
            startActivity(intent)
        }
        buttonChooseSu.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ス")
            intent.putExtra("explanation", "ス (su) - スーパー (suupaa) - supermarket")
            startActivity(intent)
        }
        buttonChooseSe.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "セ")
            intent.putExtra("explanation", "セ (se) - セーター (seetaa) - sweater")
            startActivity(intent)
        }
        buttonChooseSo.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ソ")
            intent.putExtra("explanation", "ソ (so) - ソファー (sofaa) - sofa")
            startActivity(intent)
        }
        buttonChooseTa.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "タ")
            intent.putExtra("explanation", "タ (ta) - タクシー (takushii) - taxi")
            startActivity(intent)
        }
        buttonChooseChi.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "チ")
            intent.putExtra("explanation", "チ (chi) - チーズ (chiizu) - cheese")
            startActivity(intent)
        }
        buttonChooseTsu.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ツ")
            intent.putExtra("explanation", "ツ (tsu) - ツナ (tsuna) - tuna")
            startActivity(intent)
        }
        buttonChooseTe.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "テ")
            intent.putExtra("explanation", "テ (te) - テレビ (terebi) - television")
            startActivity(intent)
        }
        buttonChooseTo.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ト")
            intent.putExtra("explanation", "ト (to) - トースト (toosuto) - toast")
            startActivity(intent)
        }
        buttonChooseNa.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ナ")
            intent.putExtra("explanation", "ナ (na) - ナイフ (naifu) - knife")
            startActivity(intent)
        }
        buttonChooseNi.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ニ")
            intent.putExtra("explanation", "ニ (ni) - ニュース (nyuusu) - news")
            startActivity(intent)
        }
        buttonChooseNu.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ヌ")
            intent.putExtra("explanation", "ヌ (nu) - ヌードル (nuudoru) - noodle")
            startActivity(intent)
        }
        buttonChooseNe.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ネ")
            intent.putExtra("explanation", "ネ (ne) - ネックレス (nekkuresu) - necklace")
            startActivity(intent)
        }
        buttonChooseNo.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ノ")
            intent.putExtra("explanation", "ノ (no) - ノート (nooto) - notebook")
            startActivity(intent)
        }
        buttonChooseHa.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ハ")
            intent.putExtra("explanation", "ハ (ha) - ハンバーガー (hanbaagaa) - hamburger")
            startActivity(intent)
        }
        buttonChooseHi.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ヒ")
            intent.putExtra("explanation", "ヒ (hi) - ヒーター (hiitaa) - heater")
            startActivity(intent)
        }
        buttonChooseFu.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "フ")
            intent.putExtra("explanation", "フ (fu) - フォーク (fooku) - fork")
            startActivity(intent)
        }
        buttonChooseHe.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ヘ")
            intent.putExtra("explanation", "ヘ (he) - ヘアスタイル (heasutairu) - hairstyle")
            startActivity(intent)
        }
        buttonChooseHo.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ホ")
            intent.putExtra("explanation", "ホ (ho) - ホテル (hoteru) - hotel")
            startActivity(intent)
        }
        buttonChooseMa.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "マ")
            intent.putExtra("explanation", "マ (ma) - マスク (masuku) - mask")
            startActivity(intent)
        }
        buttonChooseMi.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ミ")
            intent.putExtra("explanation", "ミ (mi) - ミルク (miruku) - milk")
            startActivity(intent)
        }
        buttonChooseMu.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ム")
            intent.putExtra("explanation", "ム (mu) - ムード (muudo) - mood")
            startActivity(intent)
        }
        buttonChooseMe.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "メ")
            intent.putExtra("explanation", "メ (me) - メガネ (megane) - glasses")
            startActivity(intent)
        }
        buttonChooseMo.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "モ")
            intent.putExtra("explanation", "モ (mo) - モバイル (mobairu) - mobile phone")
            startActivity(intent)
        }
        buttonChooseYa.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ヤ")
            intent.putExtra("explanation", "ヤ (ya) - ヤード (yaado) - yard")
            startActivity(intent)
        }
        buttonChooseYu.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ユ")
            intent.putExtra("explanation", "ユ (yu) - ユーモア (yuumoa) - humor")
            startActivity(intent)
        }
        buttonChooseYo.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ヨ")
            intent.putExtra("explanation", "ヨ (yo) - ヨーロッパ (yooroppa) - Europe")
            startActivity(intent)
        }
        buttonChooseRa.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ラ")
            intent.putExtra("explanation", "ラ (ra) - ラジオ (rajio) - radio")
            startActivity(intent)
        }
        buttonChooseRi.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "リ")
            intent.putExtra("explanation", "リ (ri) - リモコン (rimokon) - remote control")
            startActivity(intent)
        }
        buttonChooseRu.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ル")
            intent.putExtra("explanation", "ル (ru) - ルーム (ruumu) - room")
            startActivity(intent)
        }
        buttonChooseRe.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "レ")
            intent.putExtra("explanation", "レ (re) - レストラン (resutoran) - restaurant")
            startActivity(intent)
        }
        buttonChooseRo.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ロ")
            intent.putExtra("explanation", "ロ (ro) - ロボット (robotto) - robot")
            startActivity(intent)
        }
        buttonChooseWa.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ワ")
            intent.putExtra("explanation", "ワ (wa) - ワイン (wain) - wine")
            startActivity(intent)
        }
        buttonChooseWo.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ヲ")
            intent.putExtra("explanation", "ヲ (wo) - ヲタク (otaku) - geek")
            startActivity(intent)
        }
        buttonChooseN.setOnClickListener() {
            // Do some work here
            val intent = Intent(this, KatakanaInfoActivity::class.java)
            intent.putExtra("letter", "ン")
            intent.putExtra("explanation", "ン (n) - サンドイッチ (sandoicchi) - sandwich")
            startActivity(intent)
        }
    }
}