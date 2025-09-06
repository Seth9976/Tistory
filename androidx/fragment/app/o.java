package androidx.fragment.app;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;

public final class o implements DialogInterface.OnDismissListener {
    public final DialogFragment a;

    public o(DialogFragment dialogFragment0) {
        this.a = dialogFragment0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        DialogFragment dialogFragment0 = this.a;
        if(dialogFragment0.mDialog != null) {
            dialogFragment0.onDismiss(dialogFragment0.mDialog);
        }
    }
}

