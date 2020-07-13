package thiengo.com.br.vectortests

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import thiengo.com.br.vectortests.samples.*

class MainActivity : AppCompatActivity() {

    companion object{
        const val LAYOUT_ID = "layout_id"
    }

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )
    }


    /*
     * Tópico ➙ O porquê das imagens vetoriais
     * */
    fun oPorqueDasImagensVetoriais( view: View ){
        val intent = Intent(
            this,
            OPorqueDasImagensVetoriaisActivity::class.java
        )

        val layoutId = when( view.id ){
            R.id.bt_o_porque_das_imagens_vetoriais_teste_1 ->
                R.layout.activity_o_porque_das_imagens_vetoriais_teste_1
            R.id.bt_o_porque_das_imagens_vetoriais_teste_2 ->
                R.layout.activity_o_porque_das_imagens_vetoriais_teste_2
            R.id.bt_o_porque_das_imagens_vetoriais_teste_3 ->
                R.layout.activity_o_porque_das_imagens_vetoriais_teste_3
            R.id.bt_o_porque_das_imagens_vetoriais_teste_4 ->
                R.layout.activity_o_porque_das_imagens_vetoriais_teste_4
            R.id.bt_o_porque_das_imagens_vetoriais_teste_5 ->
                R.layout.activity_o_porque_das_imagens_vetoriais_teste_5
            else ->
                R.layout.activity_o_porque_das_imagens_vetoriais_teste_6
        }

        intent.putExtra(
            MainActivity.LAYOUT_ID,
            layoutId
        )

        startActivity( intent )
    }


    /*
     * Tópico ➙ O comum: carregamento direto no XML de layout
     * */
    fun oComumCarregamentoDiretoNoXmlDeLayout( view: View ){
        val intent = Intent(
            this,
            OComumCarregamentoDiretoNoXmlDeLayoutActivity::class.java
        )

        startActivity( intent )
    }


    /*
     * Tópico ➙ Carregamento via Kotlin API
     * */
    fun carregamentoViaKotlinApi( view: View ){
        val intent = Intent(
            this,
            CarregamentoViaKotlinApiActivity::class.java
        )

        startActivity( intent )
    }


    /*
     * Tópico ➙ Carregamento direto no XML de layout
     * */
    fun carregamentoDiretoNoXmlDeLayout( view: View ){
        val intent = Intent(
            this,
            CarregamentoDiretoNoXmlDeLayoutActivity::class.java
        )

        startActivity( intent )
    }


    /*
     * Tópico ➙ Vetor via suporte Kotlin API
     * */
    fun vetorViaSuporteKotlinApi( view: View ){
        val intent = Intent(
            this,
            VetorViaSuporteKotlinApiActivity::class.java
        )

        startActivity( intent )
    }


    /*
     * Tópico ➙ Ícones internos de sistema
     * */
    fun iconesInternosDeSistema( view: View ){
        val intent = Intent(
            this,
            IconesInternosDeSistemaActivity::class.java
        )

        startActivity( intent )
    }


    /*
     * Tópico ➙ Ícones internos de sistema
     * */
    fun importacaoDeArquivosExternosSvgEPsd(view: View ){
        val intent = Intent(
            this,
            ImportacaoDeArquivosExternosSvgEPsdActivity::class.java
        )

        startActivity( intent )
    }
}