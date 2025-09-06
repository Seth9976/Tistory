package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.drawable;
import com.google.android.material.R.id;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashSet;
import t7.a;
import t7.b;

public class MaterialCheckBox extends AppCompatCheckBox {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(@NonNull MaterialCheckBox arg1, int arg2);
    }

    public interface OnErrorChangedListener {
        void onErrorChanged(@NonNull MaterialCheckBox arg1, boolean arg2);
    }

    public static final int[] A = null;
    public static final int[][] B = null;
    public static final int C = 0;
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED;
    public final LinkedHashSet e;
    public final LinkedHashSet f;
    public ColorStateList g;
    public boolean h;
    public boolean i;
    public boolean j;
    public CharSequence k;
    public Drawable l;
    public Drawable m;
    public boolean n;
    public ColorStateList o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public int[] s;
    public boolean t;
    public CharSequence u;
    public CompoundButton.OnCheckedChangeListener v;
    public final AnimatedVectorDrawableCompat w;
    public final a x;
    public static final int y;
    public static final int[] z;

    static {
        MaterialCheckBox.y = style.Widget_MaterialComponents_CompoundButton_CheckBox;
        MaterialCheckBox.z = new int[]{attr.state_indeterminate};
        MaterialCheckBox.A = new int[]{attr.state_error};
        MaterialCheckBox.B = new int[][]{new int[]{0x101009E, attr.state_error}, new int[]{0x101009E, 0x10100A0}, new int[]{0x101009E, 0xFEFEFF60}, new int[]{0xFEFEFF62, 0x10100A0}, new int[]{0xFEFEFF62, 0xFEFEFF60}};
        MaterialCheckBox.C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context0) {
        this(context0, null);
    }

    public MaterialCheckBox(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.checkboxStyle);
    }

    public MaterialCheckBox(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, MaterialCheckBox.y), attributeSet0, v);
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        this.w = AnimatedVectorDrawableCompat.create(this.getContext(), drawable.mtrl_checkbox_button_checked_unchecked);
        this.x = new a(this);
        Context context1 = this.getContext();
        this.l = CompoundButtonCompat.getButtonDrawable(this);
        this.o = this.getSuperButtonTintList();
        this.setSupportButtonTintList(null);
        TintTypedArray tintTypedArray0 = ThemeEnforcement.obtainTintedStyledAttributes(context1, attributeSet0, styleable.MaterialCheckBox, v, MaterialCheckBox.y, new int[0]);
        this.m = tintTypedArray0.getDrawable(styleable.MaterialCheckBox_buttonIcon);
        if(this.l != null && ThemeEnforcement.isMaterial3Theme(context1)) {
            int v1 = tintTypedArray0.getResourceId(styleable.MaterialCheckBox_android_button, 0);
            int v2 = tintTypedArray0.getResourceId(styleable.MaterialCheckBox_buttonCompat, 0);
            if(v1 == MaterialCheckBox.C && v2 == 0) {
                super.setButtonDrawable(null);
                this.l = AppCompatResources.getDrawable(context1, drawable.mtrl_checkbox_button);
                this.n = true;
                if(this.m == null) {
                    this.m = AppCompatResources.getDrawable(context1, drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.p = MaterialResources.getColorStateList(context1, tintTypedArray0, styleable.MaterialCheckBox_buttonIconTint);
        this.q = ViewUtils.parseTintMode(tintTypedArray0.getInt(styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.h = tintTypedArray0.getBoolean(styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.i = tintTypedArray0.getBoolean(styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.j = tintTypedArray0.getBoolean(styleable.MaterialCheckBox_errorShown, false);
        this.k = tintTypedArray0.getText(styleable.MaterialCheckBox_errorAccessibilityLabel);
        if(tintTypedArray0.hasValue(styleable.MaterialCheckBox_checkedState)) {
            this.setCheckedState(tintTypedArray0.getInt(styleable.MaterialCheckBox_checkedState, 0));
        }
        tintTypedArray0.recycle();
        this.a();
    }

    public final void a() {
        this.l = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.l, this.o, CompoundButtonCompat.getButtonTintMode(this));
        this.m = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.m, this.p, this.q);
        if(this.n) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat0 = this.w;
            if(animatedVectorDrawableCompat0 != null) {
                animatedVectorDrawableCompat0.unregisterAnimationCallback(this.x);
                animatedVectorDrawableCompat0.registerAnimationCallback(this.x);
            }
            Drawable drawable0 = this.l;
            if(drawable0 instanceof AnimatedStateListDrawable && animatedVectorDrawableCompat0 != null) {
                ((AnimatedStateListDrawable)drawable0).addTransition(id.checked, id.unchecked, animatedVectorDrawableCompat0, false);
                ((AnimatedStateListDrawable)this.l).addTransition(id.indeterminate, id.unchecked, animatedVectorDrawableCompat0, false);
            }
        }
        Drawable drawable1 = this.l;
        if(drawable1 != null) {
            ColorStateList colorStateList0 = this.o;
            if(colorStateList0 != null) {
                DrawableCompat.setTintList(drawable1, colorStateList0);
            }
        }
        Drawable drawable2 = this.m;
        if(drawable2 != null) {
            ColorStateList colorStateList1 = this.p;
            if(colorStateList1 != null) {
                DrawableCompat.setTintList(drawable2, colorStateList1);
            }
        }
        super.setButtonDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.l, this.m));
        this.refreshDrawableState();
    }

    public void addOnCheckedStateChangedListener(@NonNull OnCheckedStateChangedListener materialCheckBox$OnCheckedStateChangedListener0) {
        this.f.add(materialCheckBox$OnCheckedStateChangedListener0);
    }

    public void addOnErrorChangedListener(@NonNull OnErrorChangedListener materialCheckBox$OnErrorChangedListener0) {
        this.e.add(materialCheckBox$OnErrorChangedListener0);
    }

    public void clearOnCheckedStateChangedListeners() {
        this.f.clear();
    }

    public void clearOnErrorChangedListeners() {
        this.e.clear();
    }

    @Override  // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.l;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.m;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.q;
    }

    @NonNull
    private String getButtonStateDescription() {
        int v = this.r;
        if(v == 1) {
            return this.getResources().getString(string.mtrl_checkbox_state_description_checked);
        }
        return v == 0 ? this.getResources().getString(string.mtrl_checkbox_state_description_unchecked) : this.getResources().getString(string.mtrl_checkbox_state_description_indeterminate);
    }

    @Override  // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.o;
    }

    public int getCheckedState() {
        return this.r;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if(this.g == null) {
            int v = MaterialColors.getColor(this, attr.colorControlActivated);
            int v1 = MaterialColors.getColor(this, attr.colorError);
            int v2 = MaterialColors.getColor(this, attr.colorSurface);
            int v3 = MaterialColors.getColor(this, attr.colorOnSurface);
            int[] arr_v = {MaterialColors.layer(v2, v1, 1.0f), MaterialColors.layer(v2, v, 1.0f), MaterialColors.layer(v2, v3, 0.54f), MaterialColors.layer(v2, v3, 0.38f), MaterialColors.layer(v2, v3, 0.38f)};
            this.g = new ColorStateList(MaterialCheckBox.B, arr_v);
        }
        return this.g;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList0 = this.o;
        if(colorStateList0 != null) {
            return colorStateList0;
        }
        return super.getButtonTintList() == null ? this.getSupportButtonTintList() : super.getButtonTintList();
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.i;
    }

    @Override  // android.widget.CompoundButton
    public boolean isChecked() {
        return this.r == 1;
    }

    public boolean isErrorShown() {
        return this.j;
    }

    public boolean isUseMaterialThemeColors() {
        return this.h;
    }

    @Override  // android.widget.TextView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.h && this.o == null && this.p == null) {
            this.setUseMaterialThemeColors(true);
        }
    }

    @Override  // android.widget.CompoundButton
    public int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 2);
        if(this.getCheckedState() == 2) {
            View.mergeDrawableStates(arr_v, MaterialCheckBox.z);
        }
        if(this.isErrorShown()) {
            View.mergeDrawableStates(arr_v, MaterialCheckBox.A);
        }
        this.s = DrawableUtils.getCheckedState(arr_v);
        return arr_v;
    }

    @Override  // android.widget.CompoundButton
    public void onDraw(Canvas canvas0) {
        if(this.i && TextUtils.isEmpty(this.getText())) {
            Drawable drawable0 = CompoundButtonCompat.getButtonDrawable(this);
            if(drawable0 != null) {
                int v = ViewUtils.isLayoutRtl(this) ? -1 : 1;
                int v1 = (this.getWidth() - drawable0.getIntrinsicWidth()) / 2 * v;
                int v2 = canvas0.save();
                canvas0.translate(((float)v1), 0.0f);
                super.onDraw(canvas0);
                canvas0.restoreToCount(v2);
                if(this.getBackground() != null) {
                    Rect rect0 = drawable0.getBounds();
                    DrawableCompat.setHotspotBounds(this.getBackground(), rect0.left + v1, rect0.top, rect0.right + v1, rect0.bottom);
                }
                return;
            }
        }
        super.onDraw(canvas0);
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@Nullable AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        if(accessibilityNodeInfo0 == null) {
            return;
        }
        if(this.isErrorShown()) {
            accessibilityNodeInfo0.setText(accessibilityNodeInfo0.getText() + ", " + this.k);
        }
    }

    @Override  // android.widget.CompoundButton
    public void onRestoreInstanceState(@Nullable Parcelable parcelable0) {
        if(!(parcelable0 instanceof b)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((b)parcelable0).getSuperState());
        this.setCheckedState(((b)parcelable0).a);
    }

    @Override  // android.widget.CompoundButton
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new b(super.onSaveInstanceState());  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.a = this.getCheckedState();
        return parcelable0;
    }

    public void removeOnCheckedStateChangedListener(@NonNull OnCheckedStateChangedListener materialCheckBox$OnCheckedStateChangedListener0) {
        this.f.remove(materialCheckBox$OnCheckedStateChangedListener0);
    }

    public void removeOnErrorChangedListener(@NonNull OnErrorChangedListener materialCheckBox$OnErrorChangedListener0) {
        this.e.remove(materialCheckBox$OnErrorChangedListener0);
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    public void setButtonDrawable(@DrawableRes int v) {
        this.setButtonDrawable(AppCompatResources.getDrawable(this.getContext(), v));
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    public void setButtonDrawable(@Nullable Drawable drawable0) {
        this.l = drawable0;
        this.n = false;
        this.a();
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable0) {
        this.m = drawable0;
        this.a();
    }

    public void setButtonIconDrawableResource(@DrawableRes int v) {
        this.setButtonIconDrawable(AppCompatResources.getDrawable(this.getContext(), v));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList0) {
        if(this.p == colorStateList0) {
            return;
        }
        this.p = colorStateList0;
        this.a();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode porterDuff$Mode0) {
        if(this.q == porterDuff$Mode0) {
            return;
        }
        this.q = porterDuff$Mode0;
        this.a();
    }

    @Override  // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList0) {
        if(this.o == colorStateList0) {
            return;
        }
        this.o = colorStateList0;
        this.a();
    }

    @Override  // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.setSupportButtonTintMode(porterDuff$Mode0);
        this.a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.i = z;
    }

    @Override  // android.widget.CompoundButton
    public void setChecked(boolean z) {
        this.setCheckedState(((int)z));
    }

    public void setCheckedState(int v) {
        if(this.r != v) {
            this.r = v;
            super.setChecked(v == 1);
            this.refreshDrawableState();
            if(Build.VERSION.SDK_INT >= 30 && this.u == null) {
                super.setStateDescription(this.getButtonStateDescription());
            }
            if(this.t) {
                return;
            }
            this.t = true;
            LinkedHashSet linkedHashSet0 = this.f;
            if(linkedHashSet0 != null) {
                for(Object object0: linkedHashSet0) {
                    ((OnCheckedStateChangedListener)object0).onCheckedStateChangedListener(this, this.r);
                }
            }
            if(this.r != 2) {
                CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0 = this.v;
                if(compoundButton$OnCheckedChangeListener0 != null) {
                    compoundButton$OnCheckedChangeListener0.onCheckedChanged(this, this.isChecked());
                }
            }
            AutofillManager autofillManager0 = (AutofillManager)this.getContext().getSystemService(AutofillManager.class);
            if(autofillManager0 != null) {
                autofillManager0.notifyValueChanged(this);
            }
            this.t = false;
        }
    }

    @Override  // android.widget.TextView
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence0) {
        this.k = charSequence0;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int v) {
        this.setErrorAccessibilityLabel((v == 0 ? null : this.getResources().getText(v)));
    }

    public void setErrorShown(boolean z) {
        if(this.j == z) {
            return;
        }
        this.j = z;
        this.refreshDrawableState();
        for(Object object0: this.e) {
            ((OnErrorChangedListener)object0).onErrorChanged(this, this.j);
        }
    }

    @Override  // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0) {
        this.v = compoundButton$OnCheckedChangeListener0;
    }

    @Override  // android.widget.CompoundButton
    @RequiresApi(30)
    public void setStateDescription(@Nullable CharSequence charSequence0) {
        this.u = charSequence0;
        if(charSequence0 != null) {
            super.setStateDescription(charSequence0);
        }
        else if(Build.VERSION.SDK_INT >= 30) {
            super.setStateDescription(this.getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.h = z;
        if(z) {
            CompoundButtonCompat.setButtonTintList(this, this.getMaterialThemeColorsTintList());
            return;
        }
        CompoundButtonCompat.setButtonTintList(this, null);
    }

    @Override  // android.widget.CompoundButton
    public void toggle() {
        this.setChecked(!this.isChecked());
    }
}

