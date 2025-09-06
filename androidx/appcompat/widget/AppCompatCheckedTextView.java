package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CheckedTextViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCheckedTextView;
import androidx.core.widget.TintableCompoundDrawablesView;
import g.b;

public class AppCompatCheckedTextView extends CheckedTextView implements EmojiCompatConfigurationView, TintableBackgroundView, TintableCheckedTextView, TintableCompoundDrawablesView {
    public final z a;
    public final y b;
    public final b1 c;
    public e0 d;

    public AppCompatCheckedTextView(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatCheckedTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.wrap(context0), attributeSet0, v);
        ThemeUtils.checkAppCompatTheme(this, this.getContext());
        b1 b10 = new b1(this);
        this.c = b10;
        b10.f(attributeSet0, v);
        b10.b();
        y y0 = new y(this);
        this.b = y0;
        y0.d(attributeSet0, v);
        this.a = new z(this);
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(this.getContext(), attributeSet0, styleable.CheckedTextView, v, 0);
        ViewCompat.saveAttributeDataForStyleable(this, this.getContext(), styleable.CheckedTextView, attributeSet0, tintTypedArray0.getWrappedTypeArray(), v, 0);
        try {
            if(tintTypedArray0.hasValue(styleable.CheckedTextView_checkMarkCompat)) {
                int v2 = tintTypedArray0.getResourceId(styleable.CheckedTextView_checkMarkCompat, 0);
                if(v2 != 0) {
                    try {
                        this.setCheckMarkDrawable(AppCompatResources.getDrawable(this.getContext(), v2));
                        goto label_22;
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                }
                goto label_18;
            }
            else {
            label_18:
                if(tintTypedArray0.hasValue(styleable.CheckedTextView_android_checkMark)) {
                    int v3 = tintTypedArray0.getResourceId(styleable.CheckedTextView_android_checkMark, 0);
                    if(v3 != 0) {
                        this.setCheckMarkDrawable(AppCompatResources.getDrawable(this.getContext(), v3));
                    }
                }
            }
        label_22:
            if(tintTypedArray0.hasValue(styleable.CheckedTextView_checkMarkTint)) {
                CheckedTextViewCompat.setCheckMarkTintList(this, tintTypedArray0.getColorStateList(styleable.CheckedTextView_checkMarkTint));
            }
            if(tintTypedArray0.hasValue(styleable.CheckedTextView_checkMarkTintMode)) {
                CheckedTextViewCompat.setCheckMarkTintMode(this, DrawableUtils.parseTintMode(tintTypedArray0.getInt(styleable.CheckedTextView_checkMarkTintMode, -1), null));
            }
        }
        finally {
            tintTypedArray0.recycle();
        }
        this.getEmojiTextViewHelper().a(attributeSet0, v);
    }

    @Override  // android.widget.CheckedTextView
    public void drawableStateChanged() {
        super.drawableStateChanged();
        b1 b10 = this.c;
        if(b10 != null) {
            b10.b();
        }
        y y0 = this.b;
        if(y0 != null) {
            y0.a();
        }
        z z0 = this.a;
        if(z0 != null) {
            z0.a();
        }
    }

    @Override  // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
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

    @Override  // androidx.core.widget.TintableCheckedTextView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCheckMarkTintList() {
        return this.a == null ? null : this.a.b;
    }

    @Override  // androidx.core.widget.TintableCheckedTextView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        b.v(inputConnection0, editorInfo0, this);
        return inputConnection0;
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

    @Override  // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int v) {
        this.setCheckMarkDrawable(AppCompatResources.getDrawable(this.getContext(), v));
    }

    @Override  // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable0) {
        super.setCheckMarkDrawable(drawable0);
        z z0 = this.a;
        if(z0 != null) {
            if(z0.f) {
                z0.f = false;
                return;
            }
            z0.f = true;
            z0.a();
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

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, actionMode$Callback0));
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().c(z);
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

    @Override  // androidx.core.widget.TintableCheckedTextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList0) {
        z z0 = this.a;
        if(z0 != null) {
            z0.b = colorStateList0;
            z0.d = true;
            z0.a();
        }
    }

    @Override  // androidx.core.widget.TintableCheckedTextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        z z0 = this.a;
        if(z0 != null) {
            z0.c = porterDuff$Mode0;
            z0.e = true;
            z0.a();
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

    @Override  // android.widget.TextView
    public void setTextAppearance(@NonNull Context context0, int v) {
        super.setTextAppearance(context0, v);
        b1 b10 = this.c;
        if(b10 != null) {
            b10.g(context0, v);
        }
    }
}

