package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.base.R.styleable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton extends FrameLayout implements View.OnClickListener {
    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    public int a;
    public int b;
    public View c;
    public View.OnClickListener d;

    public SignInButton(@NonNull Context context0) {
        this(context0, null);
    }

    public SignInButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public SignInButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.d = null;
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.SignInButton, 0, 0);
        try {
            this.a = typedArray0.getInt(styleable.SignInButton_buttonSize, 0);
            this.b = typedArray0.getInt(styleable.SignInButton_colorScheme, 2);
        }
        finally {
            typedArray0.recycle();
        }
        this.setStyle(this.a, this.b);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(@NonNull View view0) {
        View.OnClickListener view$OnClickListener0 = this.d;
        if(view$OnClickListener0 != null && view0 == this.c) {
            view$OnClickListener0.onClick(this);
        }
    }

    public void setColorScheme(int v) {
        this.setStyle(this.a, v);
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.setEnabled(z);
    }

    @Override  // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
        this.d = view$OnClickListener0;
        View view0 = this.c;
        if(view0 != null) {
            view0.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@NonNull Scope[] arr_scope) {
        this.setStyle(this.a, this.b);
    }

    public void setSize(int v) {
        this.setStyle(v, this.b);
    }

    public void setStyle(int v, int v1) {
        this.a = v;
        this.b = v1;
        Context context0 = this.getContext();
        View view0 = this.c;
        if(view0 != null) {
            this.removeView(view0);
        }
        try {
            this.c = zaz.zaa(context0, this.a, this.b);
        }
        catch(RemoteCreatorException unused_ex) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int v2 = this.a;
            int v3 = this.b;
            zaaa zaaa0 = new zaaa(context0, null);
            zaaa0.zaa(context0.getResources(), v2, v3);
            this.c = zaaa0;
        }
        this.addView(this.c);
        this.c.setEnabled(this.isEnabled());
        this.c.setOnClickListener(this);
    }

    @Deprecated
    public void setStyle(int v, int v1, @NonNull Scope[] arr_scope) {
        this.setStyle(v, v1);
    }
}

