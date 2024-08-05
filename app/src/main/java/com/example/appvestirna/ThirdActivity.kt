package com.example.appvestirna

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_third.*
import kotlin.random.Random

class ThirdActivity : AppCompatActivity() {


    val obrazkykaret= arrayOf(
        R.drawable.pageofrings,
        R.drawable.fiveofrings,
        R.drawable.death,
        R.drawable.eightofrings,
        R.drawable.kingofrings,
        R.drawable.sixofrings,
        R.drawable.thehightpriestess,
        R.drawable.twoofrings
    )

    val predpoved= arrayOf(
        "Tak jaj budoucnost, Hodně vysoko míříš.",
        "Hodně budeš někde.",
        "Vy teďka se z toho všeho se probouzíte, ale ještě jste trošku zaospalí v týhletý době.",
        "Řeknu vám na vaše otázky, můžete položit jenom jednu a odpovim vám jenom tři.",
        "Tady vidim opravdu vy se odstěhujete, protože tady vidim Pes je přítel člověka.",
        "Nespěte!",
        "Je vaše osudy každej jak si udělá.",
        "Vy máte dobrý, nemáte nic.",
        "Vážíš tak kolik tě unese.",
        "Furt jste, spadlo to.",
        "Dneska opět žijeme.",
        "Chcete znovu žít, bojíte se mezi lidma, protože máte černý myšlenky, schováte se...",
        "Odejdeš tam kde žiješ.",
        "Milá zlatá, já už teďka vám žehnám.",
        "Ajéje, to jsem se bála.",
        "Máte velký řešení.",
        "To není normární.",
        "Tady vidim velký špatný.",
        "Todle to všechno se to bouří.",
        "Tady všechno žijeme z huby do huby.",
        "Dneska každej lid je nemocnej.",
        "Mám ráda plno masa a chci pořádný polívky.",
        "Panebože co si počnu.",
        "Přijdou Vánoce a vy opět nebudete mít z nikym sednout ke stolu a dát si toho KAPRA nebo ten ŘÍZEK.",
        "Jáj bože můj polož ten telefon.",
        "Tak ti žehnám.",
        "Hoď tam tu sůl na někoho tam z okna.",
        "Ze sraček můžete vytáhnout se."

    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val ajej=MediaPlayer.create(this,R.raw.j)
        val tel=MediaPlayer.create(this,R.raw.telefon)
        val zehnat=MediaPlayer.create(this,R.raw.zehnam)
        val sul=MediaPlayer.create(this,R.raw.sul)
        val sraci=MediaPlayer.create(this,R.raw.srac)
        val nespi=MediaPlayer.create(this,R.raw.nespat)
        val miri=MediaPlayer.create(this,R.raw.miris)
        val hodne=MediaPlayer.create(this,R.raw.nekde)
        val odejdi=MediaPlayer.create(this,R.raw.odejdes)
        val zaosp=MediaPlayer.create(this,R.raw.zaospali)
        val zij=MediaPlayer.create(this,R.raw.zijeme)
        val vaz=MediaPlayer.create(this,R.raw.vazim)
        val spadlo=MediaPlayer.create(this,R.raw.spadlo)
        val nic=MediaPlayer.create(this,R.raw.nic)
        val bourka=MediaPlayer.create(this,R.raw.bouri)
        val norm=MediaPlayer.create(this,R.raw.normarni)
        val reseni=MediaPlayer.create(this,R.raw.reseni)
        val zlato=MediaPlayer.create(this,R.raw.zlata)
        val mysli=MediaPlayer.create(this,R.raw.myslenky)
        val pes=MediaPlayer.create(this,R.raw.pes)
        val otaz=MediaPlayer.create(this,R.raw.otazky)
        val huba=MediaPlayer.create(this,R.raw.huby)
        val lidi=MediaPlayer.create(this,R.raw.lid)
        val boze=MediaPlayer.create(this,R.raw.paneboze)
        val polivka=MediaPlayer.create(this,R.raw.polivky)
        val vanocni=MediaPlayer.create(this,R.raw.vanoce)
        val osud=MediaPlayer.create(this,R.raw.osudy)
        val velkyspatny=MediaPlayer.create(this,R.raw.velky)

        btnukaz.setOnClickListener {
            val random = Random
            karta.setImageResource(obrazkykaret[random.nextInt(obrazkykaret.size)])
            textView.setText(predpoved[random.nextInt(predpoved.size)])
            if (textView.text == "Ze sraček můžete vytáhnout se.") {
                sraci.start()
            } else if (textView.text == "Ajéje, to jsem se bála.") {
                ajej.start()
            } else if (textView.text == "Jáj bože můj polož ten telefon.") {
                tel.start()
            } else if (textView.text == "Tak ti žehnám.") {
                zehnat.start()
            } else if (textView.text == "Hoď tam tu sůl na někoho tam z okna.") {
                sul.start()
            } else if (textView.text == "Nespěte!") {
                nespi.start()
            } else if (textView.text == "Tak jaj budoucnost, Hodně vysoko míříš.") {
                miri.start()
            } else if (textView.text == "Hodně budeš někde.") {
                hodne.start()
            } else if (textView.text == "Odejdeš tam kde žiješ.") {
                odejdi.start()
            } else if (textView.text == "Vy máte dobrý, nemáte nic.") {
                nic.start()
            } else if (textView.text == "Furt jste, spadlo to.") {
                spadlo.start()
            } else if (textView.text == "Vážíš tak kolik tě unese.") {
                vaz.start()
            } else if (textView.text == "Dneska opět žijeme.") {
                zij.start()
            } else if (textView.text == "Vy teďka se z toho všeho se probouzíte, ale ještě jste trošku zaospalí v týhletý době.") {
                zaosp.start()
            } else if (textView.text == "Todle to všechno se to bouří.") {
                bourka.start()
            } else if (textView.text == "To není normární.") {
                norm.start()
            } else if (textView.text == "Máte velký řešení.") {
                reseni.start()
            } else if (textView.text == "Milá zlatá, já už teďka vám žehnám.") {
                zlato.start()
            } else if (textView.text == "Chcete znovu žít, bojíte se mezi lidma, protože máte černý myšlenky, schováte se...") {
                mysli.start()
            } else if (textView.text == "Tady vidim opravdu vy se odstěhujete, protože tady vidim Pes je přítel člověka.") {
                pes.start()
            } else if (textView.text == "Řeknu vám na vaše otázky, můžete položit jenom jednu a odpovim vám jenom tři.") {
                otaz.start()
            } else if (textView.text == "Tady všechno žijeme z huby do huby.") {
                huba.start()
            } else if (textView.text == "Dneska každej lid je nemocnej.") {
                lidi.start()
            } else if (textView.text == "Panebože co si počnu.") {
                boze.start()
            } else if (textView.text == "Mám ráda plno masa a chci pořádný polívky.") {
                polivka.start()
            } else if (textView.text == "Přijdou Vánoce a vy opět nebudete mít z nikym sednout ke stolu a dát si toho KAPRA nebo ten ŘÍZEK.") {
                vanocni.start()
            } else if (textView.text == "Je vaše osudy každej jak si udělá.") {
                osud.start()
            } else if (textView.text == "Tady vidim velký špatný.") {
                velkyspatny.start()
            }
        }

        btnzpet2.setOnClickListener {
            finish()
        }
    }
}