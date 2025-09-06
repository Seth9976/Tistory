package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.activity.ComponentDialog;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.KeyEventDispatcher.Component;
import androidx.core.view.KeyEventDispatcher;

public class AppCompatDialog extends ComponentDialog implements AppCompatCallback {
    public AppCompatDelegate d;
    public final Component e;

    public AppCompatDialog(@NonNull Context context0) {
        this(context0, 0);
    }

    public AppCompatDialog(@NonNull Context context0, int v) {
        int v1;
        if(v == 0) {
            TypedValue typedValue0 = new TypedValue();
            context0.getTheme().resolveAttribute(attr.dialogTheme, typedValue0, true);
            v1 = typedValue0.resourceId;
        }
        else {
            v1 = v;
        }
        super(context0, v1);
        this.e = (KeyEvent keyEvent0) -> super.dispatchKeyEvent(keyEvent0);
        AppCompatDelegate appCompatDelegate0 = this.getDelegate();
        if(v == 0) {
            TypedValue typedValue1 = new TypedValue();
            context0.getTheme().resolveAttribute(attr.dialogTheme, typedValue1, true);
            v = typedValue1.resourceId;
        }
        appCompatDelegate0.setTheme(v);
        appCompatDelegate0.onCreate(null);
    }

    public AppCompatDialog(@NonNull Context context0, boolean z, @Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        super(context0);
        this.e = (KeyEvent keyEvent0) -> super.dispatchKeyEvent(keyEvent0);
        this.setCancelable(z);
        this.setOnCancelListener(dialogInterface$OnCancelListener0);
    }

    @Override  // androidx.activity.ComponentDialog
    public void addContentView(@NonNull View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.getDelegate().addContentView(view0, viewGroup$LayoutParams0);
    }

    // 检测为 Lambda 实现
    public final boolean c(KeyEvent keyEvent0) [...]

    @Override  // android.app.Dialog
    public void dismiss() {
        super.dismiss();
        this.getDelegate().onDestroy();
    }

    @Override  // android.app.Dialog
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        View view0 = this.getWindow().getDecorView();
        return KeyEventDispatcher.dispatchKeyEvent(this.e, view0, this, keyEvent0);
    }

    @Override  // android.app.Dialog
    @Nullable
    public View findViewById(@IdRes int v) {
        return this.getDelegate().findViewById(v);
    }

    @NonNull
    public AppCompatDelegate getDelegate() {
        if(this.d == null) {
            this.d = AppCompatDelegate.create(this, this);
        }
        return this.d;
    }

    public ActionBar getSupportActionBar() {
        return this.getDelegate().getSupportActionBar();
    }

    @Override  // android.app.Dialog
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        this.getDelegate().invalidateOptionsMenu();
    }

    @Override  // androidx.activity.ComponentDialog
    public void onCreate(Bundle bundle0) {
        this.getDelegate().installViewFactory();
        super.onCreate(bundle0);
        this.getDelegate().onCreate(bundle0);
    }

    @Override  // androidx.activity.ComponentDialog
    public void onStop() {
        super.onStop();
        this.getDelegate().onStop();
    }

    @Override  // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(ActionMode actionMode0) {
    }

    @Override  // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(ActionMode actionMode0) {
    }

    @Override  // androidx.appcompat.app.AppCompatCallback
    @Nullable
    public ActionMode onWindowStartingSupportActionMode(Callback actionMode$Callback0) {
        return null;
    }

    @Override  // androidx.activity.ComponentDialog
    public void setContentView(@LayoutRes int v) {
        this.getDelegate().setContentView(v);
    }

    @Override  // androidx.activity.ComponentDialog
    public void setContentView(@NonNull View view0) {
        this.getDelegate().setContentView(view0);
    }

    @Override  // androidx.activity.ComponentDialog
    public void setContentView(@NonNull View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.getDelegate().setContentView(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Dialog
    public void setTitle(int v) {
        super.setTitle(v);
        this.getDelegate().setTitle(this.getContext().getString(v));
    }

    @Override  // android.app.Dialog
    public void setTitle(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        this.getDelegate().setTitle(charSequence0);
    }

    public boolean supportRequestWindowFeature(int v) {
        return this.getDelegate().requestWindowFeature(v);
    }
}

