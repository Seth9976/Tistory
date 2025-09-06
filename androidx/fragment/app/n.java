package androidx.fragment.app;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;

public final class n implements DialogInterface.OnCancelListener {
    public final DialogFragment a;

    public n(DialogFragment dialogFragment0) {
        this.a = dialogFragment0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        DialogFragment dialogFragment0 = this.a;
        if(dialogFragment0.mDialog != null) {
            dialogFragment0.onCancel(dialogFragment0.mDialog);
        }
    }
}

