package com.google.android.gms.common;

import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

public class ErrorDialogFragment extends DialogFragment {
    public Dialog a;
    public DialogInterface.OnCancelListener b;
    public AlertDialog c;

    @NonNull
    public static ErrorDialogFragment newInstance(@NonNull Dialog dialog0) {
        return ErrorDialogFragment.newInstance(dialog0, null);
    }

    @NonNull
    public static ErrorDialogFragment newInstance(@NonNull Dialog dialog0, @Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        ErrorDialogFragment errorDialogFragment0 = new ErrorDialogFragment();
        Dialog dialog1 = (Dialog)Preconditions.checkNotNull(dialog0, "Cannot display null dialog");
        dialog1.setOnCancelListener(null);
        dialog1.setOnDismissListener(null);
        errorDialogFragment0.a = dialog1;
        if(dialogInterface$OnCancelListener0 != null) {
            errorDialogFragment0.b = dialogInterface$OnCancelListener0;
        }
        return errorDialogFragment0;
    }

    @Override  // android.app.DialogFragment
    public void onCancel(@NonNull DialogInterface dialogInterface0) {
        DialogInterface.OnCancelListener dialogInterface$OnCancelListener0 = this.b;
        if(dialogInterface$OnCancelListener0 != null) {
            dialogInterface$OnCancelListener0.onCancel(dialogInterface0);
        }
    }

    @Override  // android.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle0) {
        Dialog dialog0 = this.a;
        if(dialog0 == null) {
            this.setShowsDialog(false);
            if(this.c == null) {
                this.c = new AlertDialog.Builder(((Context)Preconditions.checkNotNull(this.getActivity()))).create();
            }
            return this.c;
        }
        return dialog0;
    }

    @Override  // android.app.DialogFragment
    public void show(@NonNull FragmentManager fragmentManager0, @Nullable String s) {
        super.show(fragmentManager0, s);
    }
}

