package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CompoundButtonCompat;

public final class a0 {
    public final CompoundButton a;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public boolean f;

    public a0(CompoundButton compoundButton0) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.a = compoundButton0;
    }

    public final void a() {
        CompoundButton compoundButton0 = this.a;
        Drawable drawable0 = CompoundButtonCompat.getButtonDrawable(compoundButton0);
        if(drawable0 != null && (this.d || this.e)) {
            Drawable drawable1 = drawable0.mutate();
            if(this.d) {
                DrawableCompat.setTintList(drawable1, this.b);
            }
            if(this.e) {
                DrawableCompat.setTintMode(drawable1, this.c);
            }
            if(drawable1.isStateful()) {
                drawable1.setState(compoundButton0.getDrawableState());
            }
            compoundButton0.setButtonDrawable(drawable1);
        }
    }

    public final void b(AttributeSet attributeSet0, int v) {
        CompoundButton compoundButton0 = this.a;
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(compoundButton0.getContext(), attributeSet0, styleable.CompoundButton, v, 0);
        Context context0 = this.a.getContext();
        ViewCompat.saveAttributeDataForStyleable(this.a, context0, styleable.CompoundButton, attributeSet0, tintTypedArray0.getWrappedTypeArray(), v, 0);
        try {
            if(tintTypedArray0.hasValue(styleable.CompoundButton_buttonCompat)) {
                int v2 = tintTypedArray0.getResourceId(styleable.CompoundButton_buttonCompat, 0);
                if(v2 != 0) {
                    try {
                        compoundButton0.setButtonDrawable(AppCompatResources.getDrawable(compoundButton0.getContext(), v2));
                        goto label_14;
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                }
                goto label_10;
            }
            else {
            label_10:
                if(tintTypedArray0.hasValue(styleable.CompoundButton_android_button)) {
                    int v3 = tintTypedArray0.getResourceId(styleable.CompoundButton_android_button, 0);
                    if(v3 != 0) {
                        compoundButton0.setButtonDrawable(AppCompatResources.getDrawable(compoundButton0.getContext(), v3));
                    }
                }
            }
        label_14:
            if(tintTypedArray0.hasValue(styleable.CompoundButton_buttonTint)) {
                CompoundButtonCompat.setButtonTintList(compoundButton0, tintTypedArray0.getColorStateList(styleable.CompoundButton_buttonTint));
            }
            if(tintTypedArray0.hasValue(styleable.CompoundButton_buttonTintMode)) {
                CompoundButtonCompat.setButtonTintMode(compoundButton0, DrawableUtils.parseTintMode(tintTypedArray0.getInt(styleable.CompoundButton_buttonTintMode, -1), null));
            }
        }
        finally {
            tintTypedArray0.recycle();
        }
    }
}

