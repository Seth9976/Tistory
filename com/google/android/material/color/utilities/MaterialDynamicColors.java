package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class MaterialDynamicColors {
    public static boolean a(DynamicScheme dynamicScheme0) {
        return dynamicScheme0.variant == Variant.FIDELITY || dynamicScheme0.variant == Variant.CONTENT;
    }

    public static boolean b(DynamicScheme dynamicScheme0) {
        return dynamicScheme0.variant == Variant.MONOCHROME;
    }

    @NonNull
    public DynamicColor background() {
        return new DynamicColor("background", new e(14), new e(15), true, null, null, null, null);
    }

    // 去混淆评级： 低(20)
    public static double c(Hct hct0, DynamicScheme dynamicScheme0) {
        Hct hct1 = hct0.inViewingConditions(ViewingConditions.defaultWithBackgroundLstar((dynamicScheme0.isDark ? 30.0 : 80.0)));
        return !DynamicColor.tonePrefersLightForeground(hct0.getTone()) || DynamicColor.toneAllowsLightForeground(hct1.getTone()) ? DynamicColor.enableLightForeground(hct1.getTone()) : DynamicColor.enableLightForeground(hct0.getTone());
    }

    @NonNull
    public DynamicColor controlActivated() {
        return DynamicColor.fromPalette("control_activated", new d(20), new d(21));
    }

    @NonNull
    public DynamicColor controlHighlight() {
        return new DynamicColor("control_highlight", new e(8), new e(9), false, null, null, null, null, new e(10));
    }

    @NonNull
    public DynamicColor controlNormal() {
        return DynamicColor.fromPalette("control_normal", new d(11), new d(18));
    }

    @NonNull
    public DynamicColor error() {
        return new DynamicColor("error", new b(21), new b(23), true, new g(this, 10), null, new ContrastCurve(3.0, 4.5, 7.0, 11.0), new c(this, 11));
    }

    @NonNull
    public DynamicColor errorContainer() {
        return new DynamicColor("error_container", new d(7), new d(8), true, new g(this, 10), null, new ContrastCurve(1.0, 1.0, 3.0, 7.0), new c(this, 13));
    }

    // 去混淆评级： 低(20)
    @NonNull
    public DynamicColor highestSurface(@NonNull DynamicScheme dynamicScheme0) {
        return dynamicScheme0.isDark ? this.surfaceBright() : this.surfaceDim();
    }

    @NonNull
    public DynamicColor inverseOnSurface() {
        return new DynamicColor("inverse_on_surface", new b(14), new b(15), false, new c(this, 4), null, new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor inversePrimary() {
        return new DynamicColor("inverse_primary", new e(27), new e(28), false, new c(this, 27), null, new ContrastCurve(3.0, 4.5, 7.0, 11.0), null);
    }

    @NonNull
    public DynamicColor inverseSurface() {
        return new DynamicColor("inverse_surface", new d(0), new d(1), false, null, null, null, null);
    }

    @NonNull
    public DynamicColor neutralPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_palette_key_color", new b(9), new b(17));
    }

    @NonNull
    public DynamicColor neutralVariantPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_variant_palette_key_color", new f(16), new f(17));
    }

    @NonNull
    public DynamicColor onBackground() {
        return new DynamicColor("on_background", new e(18), new e(19), false, new c(this, 25), null, new ContrastCurve(3.0, 3.0, 4.5, 7.0), null);
    }

    @NonNull
    public DynamicColor onError() {
        return new DynamicColor("on_error", new f(6), new f(7), false, new g(this, 3), null, new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor onErrorContainer() {
        return new DynamicColor("on_error_container", new d(3), new d(4), false, new c(this, 12), null, new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor onPrimary() {
        return new DynamicColor("on_primary", new e(25), new e(26), false, new c(this, 26), null, new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor onPrimaryContainer() {
        return new DynamicColor("on_primary_container", new f(10), new g(this, 4), false, new g(this, 5), null, new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor onPrimaryFixed() {
        return new DynamicColor("on_primary_fixed", new b(19), new b(20), false, new c(this, 9), new c(this, 10), new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor onPrimaryFixedVariant() {
        return new DynamicColor("on_primary_fixed_variant", new f(2), new f(3), false, new c(this, 29), new g(this, 0), new ContrastCurve(3.0, 4.5, 7.0, 11.0), null);
    }

    @NonNull
    public DynamicColor onSecondary() {
        return new DynamicColor("on_secondary", new b(1), new b(2), false, new c(this, 0), null, new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor onSecondaryContainer() {
        return new DynamicColor("on_secondary_container", new b(18), new c(this, 7), false, new c(this, 8), null, new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor onSecondaryFixed() {
        return new DynamicColor("on_secondary_fixed", new b(12), new b(13), false, new c(this, 2), new c(this, 3), new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor onSecondaryFixedVariant() {
        return new DynamicColor("on_secondary_fixed_variant", new d(15), new d(16), false, new c(this, 16), new c(this, 17), new ContrastCurve(3.0, 4.5, 7.0, 11.0), null);
    }

    @NonNull
    public DynamicColor onSurface() {
        return new DynamicColor("on_surface", new f(13), new f(23), false, new g(this, 10), null, new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor onSurfaceVariant() {
        return new DynamicColor("on_surface_variant", new b(28), new h(1), false, new g(this, 10), null, new ContrastCurve(3.0, 4.5, 7.0, 11.0), null);
    }

    @NonNull
    public DynamicColor onTertiary() {
        return new DynamicColor("on_tertiary", new e(20), new e(29), false, new g(this, 2), null, new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor onTertiaryContainer() {
        return new DynamicColor("on_tertiary_container", new b(16), new c(this, 5), false, new c(this, 6), null, new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor onTertiaryFixed() {
        return new DynamicColor("on_tertiary_fixed", new e(4), new e(5), false, new c(this, 22), new c(this, 23), new ContrastCurve(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public DynamicColor onTertiaryFixedVariant() {
        return new DynamicColor("on_tertiary_fixed_variant", new d(25), new d(26), false, new c(this, 19), new c(this, 20), new ContrastCurve(3.0, 4.5, 7.0, 11.0), null);
    }

    @NonNull
    public DynamicColor outline() {
        return new DynamicColor("outline", new b(7), new b(8), false, new g(this, 10), null, new ContrastCurve(1.5, 3.0, 4.5, 7.0), null);
    }

    @NonNull
    public DynamicColor outlineVariant() {
        return new DynamicColor("outline_variant", new e(21), new e(22), false, new g(this, 10), null, new ContrastCurve(1.0, 1.0, 3.0, 7.0), null);
    }

    @NonNull
    public DynamicColor primary() {
        return new DynamicColor("primary", new d(12), new d(13), true, new g(this, 10), null, new ContrastCurve(3.0, 4.5, 7.0, 11.0), new c(this, 15));
    }

    @NonNull
    public DynamicColor primaryContainer() {
        return new DynamicColor("primary_container", new e(12), new e(13), true, new g(this, 10), null, new ContrastCurve(1.0, 1.0, 3.0, 7.0), new c(this, 24));
    }

    @NonNull
    public DynamicColor primaryFixed() {
        return new DynamicColor("primary_fixed", new f(25), new f(26), true, new g(this, 10), null, new ContrastCurve(1.0, 1.0, 3.0, 7.0), new g(this, 7));
    }

    @NonNull
    public DynamicColor primaryFixedDim() {
        return new DynamicColor("primary_fixed_dim", new f(27), new f(28), true, new g(this, 10), null, new ContrastCurve(1.0, 1.0, 3.0, 7.0), new g(this, 8));
    }

    @NonNull
    public DynamicColor primaryPaletteKeyColor() {
        return DynamicColor.fromPalette("primary_palette_key_color", new d(22), new d(23));
    }

    @NonNull
    public DynamicColor scrim() {
        return new DynamicColor("scrim", new d(14), new f(21), false, null, null, null, null);
    }

    @NonNull
    public DynamicColor secondary() {
        return new DynamicColor("secondary", new b(3), new b(4), true, new g(this, 10), null, new ContrastCurve(3.0, 4.5, 7.0, 11.0), new c(this, 1));
    }

    @NonNull
    public DynamicColor secondaryContainer() {
        return new DynamicColor("secondary_container", new e(1), new e(2), true, new g(this, 10), null, new ContrastCurve(1.0, 1.0, 3.0, 7.0), new c(this, 21));
    }

    @NonNull
    public DynamicColor secondaryFixed() {
        return new DynamicColor("secondary_fixed", new f(0), new f(1), true, new g(this, 10), null, new ContrastCurve(1.0, 1.0, 3.0, 7.0), new c(this, 28));
    }

    @NonNull
    public DynamicColor secondaryFixedDim() {
        return new DynamicColor("secondary_fixed_dim", new f(11), new f(12), true, new g(this, 10), null, new ContrastCurve(1.0, 1.0, 3.0, 7.0), new g(this, 6));
    }

    @NonNull
    public DynamicColor secondaryPaletteKeyColor() {
        return DynamicColor.fromPalette("secondary_palette_key_color", new d(27), new d(28));
    }

    @NonNull
    public DynamicColor shadow() {
        return new DynamicColor("shadow", new f(20), new f(21), false, null, null, null, null);
    }

    @NonNull
    public DynamicColor surface() {
        return new DynamicColor("surface", new b(0), new d(24), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceBright() {
        return new DynamicColor("surface_bright", new e(23), new e(24), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainer() {
        return new DynamicColor("surface_container", new b(26), new b(27), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerHigh() {
        return new DynamicColor("surface_container_high", new e(16), new e(17), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerHighest() {
        return new DynamicColor("surface_container_highest", new f(22), new f(24), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerLow() {
        return new DynamicColor("surface_container_low", new d(29), new e(0), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerLowest() {
        return new DynamicColor("surface_container_lowest", new b(5), new b(6), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceDim() {
        return new DynamicColor("surface_dim", new b(22), new d(2), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceTint() {
        return new DynamicColor("surface_tint", new b(10), new b(11), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceVariant() {
        return new DynamicColor("surface_variant", new f(14), new f(15), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor tertiary() {
        return new DynamicColor("tertiary", new d(17), new d(19), true, new g(this, 10), null, new ContrastCurve(3.0, 4.5, 7.0, 11.0), new c(this, 18));
    }

    @NonNull
    public DynamicColor tertiaryContainer() {
        return new DynamicColor("tertiary_container", new f(29), new h(0), true, new g(this, 10), null, new ContrastCurve(1.0, 1.0, 3.0, 7.0), new g(this, 9));
    }

    @NonNull
    public DynamicColor tertiaryFixed() {
        return new DynamicColor("tertiary_fixed", new d(9), new d(10), true, new g(this, 10), null, new ContrastCurve(1.0, 1.0, 3.0, 7.0), new c(this, 14));
    }

    @NonNull
    public DynamicColor tertiaryFixedDim() {
        return new DynamicColor("tertiary_fixed_dim", new f(4), new f(5), true, new g(this, 10), null, new ContrastCurve(1.0, 1.0, 3.0, 7.0), new g(this, 1));
    }

    @NonNull
    public DynamicColor tertiaryPaletteKeyColor() {
        return DynamicColor.fromPalette("tertiary_palette_key_color", new e(6), new e(7));
    }

    @NonNull
    public DynamicColor textHintInverse() {
        return DynamicColor.fromPalette("text_hint_inverse", new f(18), new f(19));
    }

    @NonNull
    public DynamicColor textPrimaryInverse() {
        return DynamicColor.fromPalette("text_primary_inverse", new b(24), new b(25));
    }

    @NonNull
    public DynamicColor textPrimaryInverseDisableOnly() {
        return DynamicColor.fromPalette("text_primary_inverse_disable_only", new f(8), new f(9));
    }

    @NonNull
    public DynamicColor textSecondaryAndTertiaryInverse() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse", new d(5), new d(6));
    }

    @NonNull
    public DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse_disabled", new e(3), new e(11));
    }
}

