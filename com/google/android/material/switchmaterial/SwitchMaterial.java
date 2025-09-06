package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class SwitchMaterial extends SwitchCompat {
    public final ElevationOverlayProvider T;
    public ColorStateList U;
    public ColorStateList V;
    public boolean W;
    public static final int a0;
    public static final int[][] b0;

    static {
        SwitchMaterial.a0 = style.Widget_MaterialComponents_CompoundButton_Switch;
        SwitchMaterial.b0 = new int[][]{new int[]{0x101009E, 0x10100A0}, new int[]{0x101009E, 0xFEFEFF60}, new int[]{0xFEFEFF62, 0x10100A0}, new int[]{0xFEFEFF62, 0xFEFEFF60}};
    }

    public SwitchMaterial(@NonNull Context context0) {
        this(context0, null);
    }

    public SwitchMaterial(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.switchStyle);
    }

    public SwitchMaterial(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, SwitchMaterial.a0), attributeSet0, v);
        Context context1 = this.getContext();
        this.T = new ElevationOverlayProvider(context1);
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.SwitchMaterial, v, SwitchMaterial.a0, new int[0]);
        this.W = typedArray0.getBoolean(styleable.SwitchMaterial_useMaterialThemeColors, false);
        typedArray0.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if(this.U == null) {
            int v = MaterialColors.getColor(this, attr.colorSurface);
            int v1 = MaterialColors.getColor(this, attr.colorControlActivated);
            float f = this.getResources().getDimension(dimen.mtrl_switch_thumb_elevation);
            ElevationOverlayProvider elevationOverlayProvider0 = this.T;
            if(elevationOverlayProvider0.isThemeElevationOverlayEnabled()) {
                f += ViewUtils.getParentAbsoluteElevation(this);
            }
            int v2 = elevationOverlayProvider0.compositeOverlayIfNeeded(v, f);
            int[] arr_v = {MaterialColors.layer(v, v1, 1.0f), v2, MaterialColors.layer(v, v1, 0.38f), v2};
            this.U = new ColorStateList(SwitchMaterial.b0, arr_v);
        }
        return this.U;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if(this.V == null) {
            int v = MaterialColors.getColor(this, attr.colorSurface);
            int v1 = MaterialColors.getColor(this, attr.colorControlActivated);
            int v2 = MaterialColors.getColor(this, attr.colorOnSurface);
            int[] arr_v = {MaterialColors.layer(v, v1, 0.54f), MaterialColors.layer(v, v2, 0.32f), MaterialColors.layer(v, v1, 0.12f), MaterialColors.layer(v, v2, 0.12f)};
            this.V = new ColorStateList(SwitchMaterial.b0, arr_v);
        }
        return this.V;
    }

    public boolean isUseMaterialThemeColors() {
        return this.W;
    }

    @Override  // android.widget.TextView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.W && this.getThumbTintList() == null) {
            this.setThumbTintList(this.getMaterialThemeColorsThumbTintList());
        }
        if(this.W && this.getTrackTintList() == null) {
            this.setTrackTintList(this.getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.W = z;
        if(z) {
            this.setThumbTintList(this.getMaterialThemeColorsThumbTintList());
            this.setTrackTintList(this.getMaterialThemeColorsTrackTintList());
            return;
        }
        this.setThumbTintList(null);
        this.setTrackTintList(null);
    }
}

