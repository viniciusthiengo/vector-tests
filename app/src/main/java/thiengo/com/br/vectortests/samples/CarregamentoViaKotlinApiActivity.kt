package thiengo.com.br.vectortests.samples

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_carregamento_via_kotlin_api.*
import thiengo.com.br.vectortests.R

class CarregamentoViaKotlinApiActivity : AppCompatActivity() {

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_carregamento_via_kotlin_api )

        iv_vector_sample.setImageDrawable(
            resources.getDrawable(
                R.drawable.ic_baseline_sports_esports,
                null
            )
        )

        iv_vector_sample.setColorFilter(
            Color.BLUE,
            PorterDuff.Mode.SRC_IN
        )
    }
}