package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R.attr;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

public class ElevationOverlayProvider {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public static final int f;

    static {
        ElevationOverlayProvider.f = 5;
    }

    public ElevationOverlayProvider(@NonNull Context context0) {
        this(MaterialAttributes.resolveBoolean(context0, attr.elevationOverlayEnabled, false), MaterialColors.getColor(context0, attr.elevationOverlayColor, 0), MaterialColors.getColor(context0, attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context0, attr.colorSurface, 0), context0.getResources().getDisplayMetrics().density);
    }

    public ElevationOverlayProvider(boolean z, @ColorInt int v, @ColorInt int v1, @ColorInt int v2, float f) {
        this.a = z;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = f;
    }

    public int calculateOverlayAlpha(float f) {
        return Math.round(this.calculateOverlayAlphaFraction(f) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f) {
        return this.e <= 0.0f || f <= 0.0f ? 0.0f : Math.min((((float)Math.log1p(f / this.e)) * 4.5f + 2.0f) / 100.0f, 1.0f);
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int v, float f) {
        float f1 = this.calculateOverlayAlphaFraction(f);
        int v1 = Color.alpha(v);
        int v2 = MaterialColors.layer(ColorUtils.setAlphaComponent(v, 0xFF), this.b, f1);
        if(f1 > 0.0f) {
            int v3 = this.c;
            if(v3 != 0) {
                v2 = MaterialColors.layer(v2, ColorUtils.setAlphaComponent(v3, ElevationOverlayProvider.f));
            }
        }
        return ColorUtils.setAlphaComponent(v2, v1);
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int v, float f, @NonNull View view0) {
        return this.compositeOverlay(v, this.getParentAbsoluteElevation(view0) + f);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int v, float f) {
        return !this.a || ColorUtils.setAlphaComponent(v, 0xFF) != this.d ? v : this.compositeOverlay(v, f);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int v, float f, @NonNull View view0) {
        return this.compositeOverlayIfNeeded(v, this.getParentAbsoluteElevation(view0) + f);
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f) {
        return this.compositeOverlayIfNeeded(this.d, f);
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f, @NonNull View view0) {
        return this.compositeOverlayWithThemeSurfaceColorIfNeeded(this.getParentAbsoluteElevation(view0) + f);
    }

    public float getParentAbsoluteElevation(@NonNull View view0) {
        return ViewUtils.getParentAbsoluteElevation(view0);
    }

    @ColorInt
    public int getThemeElevationOverlayColor() {
        return this.b;
    }

    @ColorInt
    public int getThemeSurfaceColor() {
        return this.d;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.a;
    }
}

