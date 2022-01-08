package uz.mufassal.mytoaster

import android.content.Context
import android.widget.Toast

object MyLibrary {

    fun show(context: Context, str: String) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
    }

}