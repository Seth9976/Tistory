package androidx.appcompat.widget;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;

public final class n0 implements DialogInterface.OnClickListener, SpinnerPopup {
    public AlertDialog a;
    public ListAdapter b;
    public CharSequence c;
    public final AppCompatSpinner d;

    public n0(AppCompatSpinner appCompatSpinner0) {
        this.d = appCompatSpinner0;
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final void dismiss() {
        AlertDialog alertDialog0 = this.a;
        if(alertDialog0 != null) {
            alertDialog0.dismiss();
            this.a = null;
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final Drawable getBackground() {
        return null;
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final CharSequence getHintText() {
        return this.c;
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final int getHorizontalOffset() {
        return 0;
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final int getHorizontalOriginalOffset() {
        return 0;
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final int getVerticalOffset() {
        return 0;
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final boolean isShowing() {
        return this.a == null ? false : this.a.isShowing();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        AppCompatSpinner appCompatSpinner0 = this.d;
        appCompatSpinner0.setSelection(v);
        if(appCompatSpinner0.getOnItemClickListener() != null) {
            appCompatSpinner0.performItemClick(null, v, this.b.getItemId(v));
        }
        this.dismiss();
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final void setAdapter(ListAdapter listAdapter0) {
        this.b = listAdapter0;
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final void setBackgroundDrawable(Drawable drawable0) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final void setHorizontalOffset(int v) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final void setHorizontalOriginalOffset(int v) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final void setPromptText(CharSequence charSequence0) {
        this.c = charSequence0;
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final void setVerticalOffset(int v) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final void show(int v, int v1) {
        if(this.b == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner0 = this.d;
        Builder alertDialog$Builder0 = new Builder(appCompatSpinner0.getPopupContext());
        CharSequence charSequence0 = this.c;
        if(charSequence0 != null) {
            alertDialog$Builder0.setTitle(charSequence0);
        }
        AlertDialog alertDialog0 = alertDialog$Builder0.setSingleChoiceItems(this.b, appCompatSpinner0.getSelectedItemPosition(), this).create();
        this.a = alertDialog0;
        ListView listView0 = alertDialog0.getListView();
        l0.d(listView0, v);
        l0.c(listView0, v1);
        this.a.show();
    }
}

