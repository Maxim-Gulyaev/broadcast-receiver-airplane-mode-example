package android.maxim.broadcastreceiverairplanemodeexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val toastText: String? = context?.getString(R.string.toast_text)
        Toast.makeText(context, toastText, Toast.LENGTH_LONG).show()
    }
}