package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundDrawablesView;
import g.b;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements EmojiCompatConfigurationView, TintableBackgroundView, TintableCompoundDrawablesView {
    public final y a;
    public final b1 b;
    public final d0 c;
    public static final int[] d;

    static {
        AppCompatMultiAutoCompleteTextView.d = new int[]{0x1010176};
    }

    public AppCompatMultiAutoCompleteTextView(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatMultiAutoCompleteTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.wrap(context0), attributeSet0, v);
        ThemeUtils.checkAppCompatTheme(this, this.getContext());
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(this.getContext(), attributeSet0, AppCompatMultiAutoCompleteTextView.d, v, 0);
        if(tintTypedArray0.hasValue(0)) {
            this.setDropDownBackgroundDrawable(tintTypedArray0.getDrawable(0));
        }
        tintTypedArray0.recycle();
        y y0 = new y(this);
        this.a = y0;
        y0.d(attributeSet0, v);
        b1 b10 = new b1(this);
        this.b = b10;
        b10.f(attributeSet0, v);
        b10.b();
        d0 d00 = new d0(this);
        this.c = d00;
        d00.b(attributeSet0, v);
        KeyListener keyListener0 = this.getKeyListener();
        if(!(keyListener0 instanceof NumberKeyListener)) {
            boolean z = super.isFocusable();
            boolean z1 = super.isClickable();
            boolean z2 = super.isLongClickable();
            int v1 = super.getInputType();
            KeyListener keyListener1 = d00.a(keyListener0);
            if(keyListener1 != keyListener0) {
                super.setKeyListener(keyListener1);
                super.setRawInputType(v1);
                super.setFocusable(z);
                super.setClickable(z1);
                super.setLongClickable(z2);
            }
        }
    }

    @Override  // android.widget.TextView
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y y0 = this.a;
        if(y0 != null) {
            y0.a();
        }
        b1 b10 = this.b;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        return this.a == null ? null : this.a.b();
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.a == null ? null : this.a.c();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return this.c.b.isEnabled();
    }

    @Override  // android.widget.TextView
    public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        b.v(inputConnection0, editorInfo0, this);
        return this.c.b.onCreateInputConnection(inputConnection0, editorInfo0);
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        y y0 = this.a;
        if(y0 != null) {
            y0.e();
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(@DrawableRes int v) {
        super.setBackgroundResource(v);
        y y0 = this.a;
        if(y0 != null) {
            y0.f(v);
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        b1 b10 = this.b;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        b1 b10 = this.b;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@DrawableRes int v) {
        this.setDropDownBackgroundDrawable(AppCompatResources.getDrawable(this.getContext(), v));
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.c.b.setEnabled(z);
    }

    @Override  // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener0) {
        super.setKeyListener(this.c.a(keyListener0));
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        y y0 = this.a;
        if(y0 != null) {
            y0.h(colorStateList0);
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        y y0 = this.a;
        if(y0 != null) {
            y0.i(porterDuff$Mode0);
        }
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList0) {
        this.b.k(colorStateList0);
        this.b.b();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.b.l(porterDuff$Mode0);
        this.b.b();
    }

    @Override  // android.widget.TextView
    public void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        b1 b10 = this.b;
        if(b10 != null) {
            b10.g(context0, v);
        }
    }
}

