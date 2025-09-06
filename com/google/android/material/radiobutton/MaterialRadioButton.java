package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialRadioButton extends AppCompatRadioButton {
    public ColorStateList e;
    public boolean f;
    public static final int g;
    public static final int[][] h;

    static {
        MaterialRadioButton.g = style.Widget_MaterialComponents_CompoundButton_RadioButton;
        MaterialRadioButton.h = new int[][]{new int[]{0x101009E, 0x10100A0}, new int[]{0x101009E, 0xFEFEFF60}, new int[]{0xFEFEFF62, 0x10100A0}, new int[]{0xFEFEFF62, 0xFEFEFF60}};
    }

    public MaterialRadioButton(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialRadioButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.radioButtonStyle);
    }

    public MaterialRadioButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, MaterialRadioButton.g), attributeSet0, v);
        Context context1 = this.getContext();
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.MaterialRadioButton, v, MaterialRadioButton.g, new int[0]);
        if(typedArray0.hasValue(styleable.MaterialRadioButton_buttonTint)) {
            CompoundButtonCompat.setButtonTintList(this, MaterialResources.getColorStateList(context1, typedArray0, styleable.MaterialRadioButton_buttonTint));
        }
        this.f = typedArray0.getBoolean(styleable.MaterialRadioButton_useMaterialThemeColors, false);
        typedArray0.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if(this.e == null) {
            int v = MaterialColors.getColor(this, attr.colorControlActivated);
            int v1 = MaterialColors.getColor(this, attr.colorOnSurface);
            int v2 = MaterialColors.getColor(this, attr.colorSurface);
            int[] arr_v = {MaterialColors.layer(v2, v, 1.0f), MaterialColors.layer(v2, v1, 0.54f), MaterialColors.layer(v2, v1, 0.38f), MaterialColors.layer(v2, v1, 0.38f)};
            this.e = new ColorStateList(MaterialRadioButton.h, arr_v);
        }
        return this.e;
    }

    public boolean isUseMaterialThemeColors() {
        return this.f;
    }

    @Override  // android.widget.TextView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.f && CompoundButtonCompat.getButtonTintList(this) == null) {
            this.setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if(z) {
            CompoundButtonCompat.setButtonTintList(this, this.getMaterialThemeColorsTintList());
            return;
        }
        CompoundButtonCompat.setButtonTintList(this, null);
    }
}

