package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.ViewCompat;

@RestrictTo({Scope.LIBRARY_GROUP})
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public boolean d;
    public boolean e;
    public boolean f;
    public static final int[] g;

    static {
        CheckableImageButton.g = new int[]{0x10100A0};
    }

    public CheckableImageButton(Context context0) {
        this(context0, null);
    }

    public CheckableImageButton(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.e = true;
        this.f = true;
        ViewCompat.setAccessibilityDelegate(this, new b(this, 0));
    }

    public boolean isCheckable() {
        return this.e;
    }

    @Override  // android.widget.Checkable
    public boolean isChecked() {
        return this.d;
    }

    public boolean isPressable() {
        return this.f;
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.ImageView
    public int[] onCreateDrawableState(int v) {
        return this.d ? View.mergeDrawableStates(super.onCreateDrawableState(v + 1), CheckableImageButton.g) : super.onCreateDrawableState(v);
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof c)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((c)parcelable0).getSuperState());
        this.setChecked(((c)parcelable0).b);
    }

    @Override  // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new c(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.b = this.d;
        return parcelable0;
    }

    public void setCheckable(boolean z) {
        if(this.e != z) {
            this.e = z;
            this.sendAccessibilityEvent(0);
        }
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        if(this.e && this.d != z) {
            this.d = z;
            this.refreshDrawableState();
            this.sendAccessibilityEvent(0x800);
        }
    }

    public void setPressable(boolean z) {
        this.f = z;
    }

    @Override  // android.view.View
    public void setPressed(boolean z) {
        if(this.f) {
            super.setPressed(z);
        }
    }

    @Override  // android.widget.Checkable
    public void toggle() {
        this.setChecked(!this.d);
    }
}

