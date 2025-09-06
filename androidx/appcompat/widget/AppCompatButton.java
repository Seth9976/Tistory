package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatButton extends Button implements EmojiCompatConfigurationView, TintableBackgroundView, AutoSizeableTextView, TintableCompoundDrawablesView {
    public final y a;
    public final b1 b;
    public e0 c;

    public AppCompatButton(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.buttonStyle);
    }

    public AppCompatButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.wrap(context0), attributeSet0, v);
        ThemeUtils.checkAppCompatTheme(this, this.getContext());
        y y0 = new y(this);
        this.a = y0;
        y0.d(attributeSet0, v);
        b1 b10 = new b1(this);
        this.b = b10;
        b10.f(attributeSet0, v);
        b10.b();
        this.getEmojiTextViewHelper().a(attributeSet0, v);
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

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if(ViewUtils.b) {
            return super.getAutoSizeMaxTextSize();
        }
        return this.b == null ? -1 : Math.round(this.b.i.e);
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if(ViewUtils.b) {
            return super.getAutoSizeMinTextSize();
        }
        return this.b == null ? -1 : Math.round(this.b.i.d);
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if(ViewUtils.b) {
            return super.getAutoSizeStepGranularity();
        }
        return this.b == null ? -1 : Math.round(this.b.i.c);
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if(ViewUtils.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        return this.b == null ? new int[0] : this.b.i.f;
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if(ViewUtils.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        return this.b == null ? 0 : this.b.i.a;
    }

    @Override  // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @NonNull
    private e0 getEmojiTextViewHelper() {
        if(this.c == null) {
            this.c = new e0(this);
        }
        return this.c;
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
        return this.getEmojiTextViewHelper().b.isEnabled();
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("android.widget.Button");
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("android.widget.Button");
    }

    @Override  // android.widget.TextView
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        b1 b10 = this.b;
        if(b10 != null && !ViewUtils.b) {
            b10.i.a();
        }
    }

    @Override  // android.widget.TextView
    public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        super.onTextChanged(charSequence0, v, v1, v2);
        b1 b10 = this.b;
        if(b10 != null && !ViewUtils.b) {
            k1 k10 = b10.i;
            if(k10.f()) {
                k10.a();
            }
        }
    }

    @Override  // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.getEmojiTextViewHelper().b(z);
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int v, int v1, int v2, int v3) throws IllegalArgumentException {
        if(ViewUtils.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
            return;
        }
        b1 b10 = this.b;
        if(b10 != null) {
            b10.h(v, v1, v2, v3);
        }
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] arr_v, int v) throws IllegalArgumentException {
        if(ViewUtils.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
            return;
        }
        b1 b10 = this.b;
        if(b10 != null) {
            b10.i(arr_v, v);
        }
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int v) {
        if(ViewUtils.b) {
            super.setAutoSizeTextTypeWithDefaults(v);
            return;
        }
        b1 b10 = this.b;
        if(b10 != null) {
            b10.j(v);
        }
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
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, actionMode$Callback0));
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().c(z);
    }

    @Override  // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] arr_inputFilter) {
        super.setFilters(this.getEmojiTextViewHelper().b.getFilters(arr_inputFilter));
    }

    public void setSupportAllCaps(boolean z) {
        b1 b10 = this.b;
        if(b10 != null) {
            b10.a.setAllCaps(z);
        }
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

    @Override  // android.widget.TextView
    public void setTextSize(int v, float f) {
        if(ViewUtils.b) {
            super.setTextSize(v, f);
            return;
        }
        b1 b10 = this.b;
        if(b10 != null) {
            k1 k10 = b10.i;
            if(!k10.f()) {
                k10.g(f, v);
            }
        }
    }
}

