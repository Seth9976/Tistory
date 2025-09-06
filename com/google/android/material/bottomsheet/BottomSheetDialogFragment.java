package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public boolean z;

    public BottomSheetDialogFragment() {
    }

    @SuppressLint({"ValidFragment"})
    public BottomSheetDialogFragment(@LayoutRes int v) {
        super(v);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if(!this.j(false)) {
            super.dismiss();
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if(!this.j(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    public final void i() {
        if(this.z) {
            super.dismissAllowingStateLoss();
            return;
        }
        super.dismiss();
    }

    public final boolean j(boolean z) {
        Dialog dialog0 = this.getDialog();
        if(dialog0 instanceof BottomSheetDialog) {
            BottomSheetBehavior bottomSheetBehavior0 = ((BottomSheetDialog)dialog0).getBehavior();
            if(bottomSheetBehavior0.isHideable() && ((BottomSheetDialog)dialog0).getDismissWithAnimation()) {
                this.z = z;
                if(bottomSheetBehavior0.getState() == 5) {
                    this.i();
                    return true;
                }
                if(this.getDialog() instanceof BottomSheetDialog) {
                    BottomSheetDialog bottomSheetDialog0 = (BottomSheetDialog)this.getDialog();
                    bottomSheetDialog0.f.removeBottomSheetCallback(bottomSheetDialog0.q);
                }
                bottomSheetBehavior0.addBottomSheetCallback(new e(this));
                bottomSheetBehavior0.setState(5);
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.appcompat.app.AppCompatDialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle0) {
        return new BottomSheetDialog(this.getContext(), this.getTheme());
    }
}

