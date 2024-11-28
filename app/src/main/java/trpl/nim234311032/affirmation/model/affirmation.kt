package trpl.nim234311032.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import trpl.nim234311032.affirmation.R
import trpl.nim234311032.affirmations.model.Affirmation

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(R.string.affirmation1, R.drawable.download__2_),
            Affirmation(R.string.affirmation2, R.drawable.jett_29),
            Affirmation(R.string.affirmation3, R.drawable.breach_29),
            Affirmation(R.string.affirmation4, R.drawable.brimstone_29),
            Affirmation(R.string.affirmation5, R.drawable.viper_29),
            Affirmation(R.string.affirmation6, R.drawable.sova_29),
            Affirmation(R.string.affirmation7, R.drawable.sage__half_),
            Affirmation(R.string.affirmation8, R.drawable.cypher_29),
            Affirmation(R.string.affirmation9, R.drawable.phoenix_29),
            Affirmation(R.string.affirmation10, R.drawable.raze_29)
        )
    }
}
