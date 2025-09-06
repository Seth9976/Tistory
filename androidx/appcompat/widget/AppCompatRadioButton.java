package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundButton;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatRadioButton extends RadioButton implements EmojiCompatConfigurationView, TintableBackgroundView, TintableCompoundButton, TintableCompoundDrawablesView {
    public final a0 a;
    public final y b;
    public final b1 c;
    public e0 d;

    public AppCompatRadioButton(Context context0) {
        this(context0, null);
    }

    public AppCompatRadioButton(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.wrap(context0), attributeSet0, v);
        ThemeUtils.checkAppCompatTheme(this, this.getContext());
        a0 a00 = new a0(this);
        this.a = a00;
        a00.b(attributeSet0, v);
        y y0 = new y(this);
        this.b = y0;
        y0.d(attributeSet0, v);
        b1 b10 = new b1(this);
        this.c = b10;
        b10.f(attributeSet0, v);
        this.getEmojiTextViewHelper().a(attributeSet0, v);
    }

    @Override  // android.widget.CompoundButton
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y y0 = this.b;
        if(y0 != null) {
            y0.a();
        }
        b1 b10 = this.c;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.CompoundButton
    public int getCompoundPaddingLeft() {
        int v = super.getCompoundPaddingLeft();
        a0 a00 = this.a;
        if(a00 != null) {
            a00.getClass();
        }
        return v;
    }

    @NonNull
    private e0 getEmojiTextViewHelper() {
        if(this.d == null) {
            this.d = new e0(this);
        }
        return this.d;
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        return this.b == null ? null : this.b.b();
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.b == null ? null : this.b.c();
    }

    @Override  // androidx.core.widget.TintableCompoundButton
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        return this.a == null ? null : this.a.b;
    }

    @Override  // androidx.core.widget.TintableCompoundButton
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        return this.a == null ? null : this.a.c;
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return this.getEmojiTextViewHelper().b.isEnabled();
    }

    @Override  // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.getEmojiTextViewHelper().b(z);
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        y y0 = this.b;
        if(y0 != null) {
            y0.e();
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(@DrawableRes int v) {
        super.setBackgroundResource(v);
        y y0 = this.b;
        if(y0 != null) {
            y0.f(v);
        }
    }

    @Override  // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int v) {
        this.setButtonDrawable(AppCompatResources.getDrawable(this.getContext(), v));
    }

    @Override  // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable0) {
        super.setButtonDrawable(drawable0);
        a0 a00 = this.a;
        if(a00 != null) {
            if(a00.f) {
                a00.f = false;
                return;
            }
            a00.f = true;
            a00.a();
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        b1 b10 = this.c;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        b1 b10 = this.c;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().c(z);
    }

    @Override  // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] arr_inputFilter) {
        super.setFilters(this.getEmojiTextViewHelper().b.getFilters(arr_inputFilter));
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        y y0 = this.b;
        if(y0 != null) {
            y0.h(colorStateList0);
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        y y0 = this.b;
        if(y0 != null) {
            y0.i(porterDuff$Mode0);
        }
    }

    @Override  // androidx.core.widget.TintableCompoundButton
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList0) {
        a0 a00 = this.a;
        if(a00 != null) {
            a00.b = colorStateList0;
            a00.d = true;
            a00.a();
        }
    }

    @Override  // androidx.core.widget.TintableCompoundButton
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        a0 a00 = this.a;
        if(a00 != null) {
            a00.c = porterDuff$Mode0;
            a00.e = true;
            a00.a();
        }
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList0) {
        this.c.k(colorStateList0);
        this.c.b();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.c.l(porterDuff$Mode0);
        this.c.b();
    }
}

