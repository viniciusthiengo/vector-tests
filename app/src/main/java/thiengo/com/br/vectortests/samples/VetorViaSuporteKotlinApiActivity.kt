package thiengo.com.br.vectortests.samples

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_carregamento_via_kotlin_api.*
import thiengo.com.br.vectortests.R

class VetorViaSuporteKotlinApiActivity : AppCompatActivity() {

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_vetor_via_suporte_kotlin_api )

        iv_vector_sample.setImageResource(
            R.drawable.ic_baseline_sports_esports
        )

        /*
         * Para utilizar o código abaixo, então
         * comente o setImageResource() acima.
         * */
        /*iv_vector_sample.setImageDrawable(
            ResourcesCompat.getDrawable(
                resources,
                R.drawable.ic_baseline_sports_esports,
                null
            )
        )*/

        iv_vector_sample.setColorFilter(
            Color.MAGENTA,
            PorterDuff.Mode.SRC_IN
        )
    }
}