package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.color;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class MaterialColorUtilitiesHelper {
    public static final Map a;

    static {
        MaterialDynamicColors materialDynamicColors0 = new MaterialDynamicColors();
        HashMap hashMap0 = new HashMap();
        hashMap0.put(color.material_personalized_color_primary, materialDynamicColors0.primary());
        hashMap0.put(color.material_personalized_color_on_primary, materialDynamicColors0.onPrimary());
        hashMap0.put(color.material_personalized_color_primary_inverse, materialDynamicColors0.inversePrimary());
        hashMap0.put(color.material_personalized_color_primary_container, materialDynamicColors0.primaryContainer());
        hashMap0.put(color.material_personalized_color_on_primary_container, materialDynamicColors0.onPrimaryContainer());
        hashMap0.put(color.material_personalized_color_secondary, materialDynamicColors0.secondary());
        hashMap0.put(color.material_personalized_color_on_secondary, materialDynamicColors0.onSecondary());
        hashMap0.put(color.material_personalized_color_secondary_container, materialDynamicColors0.secondaryContainer());
        hashMap0.put(color.material_personalized_color_on_secondary_container, materialDynamicColors0.onSecondaryContainer());
        hashMap0.put(color.material_personalized_color_tertiary, materialDynamicColors0.tertiary());
        hashMap0.put(color.material_personalized_color_on_tertiary, materialDynamicColors0.onTertiary());
        hashMap0.put(color.material_personalized_color_tertiary_container, materialDynamicColors0.tertiaryContainer());
        hashMap0.put(color.material_personalized_color_on_tertiary_container, materialDynamicColors0.onTertiaryContainer());
        hashMap0.put(color.material_personalized_color_background, materialDynamicColors0.background());
        hashMap0.put(color.material_personalized_color_on_background, materialDynamicColors0.onBackground());
        hashMap0.put(color.material_personalized_color_surface, materialDynamicColors0.surface());
        hashMap0.put(color.material_personalized_color_on_surface, materialDynamicColors0.onSurface());
        hashMap0.put(color.material_personalized_color_surface_variant, materialDynamicColors0.surfaceVariant());
        hashMap0.put(color.material_personalized_color_on_surface_variant, materialDynamicColors0.onSurfaceVariant());
        hashMap0.put(color.material_personalized_color_surface_inverse, materialDynamicColors0.inverseSurface());
        hashMap0.put(color.material_personalized_color_on_surface_inverse, materialDynamicColors0.inverseOnSurface());
        hashMap0.put(color.material_personalized_color_surface_bright, materialDynamicColors0.surfaceBright());
        hashMap0.put(color.material_personalized_color_surface_dim, materialDynamicColors0.surfaceDim());
        hashMap0.put(color.material_personalized_color_surface_container, materialDynamicColors0.surfaceContainer());
        hashMap0.put(color.material_personalized_color_surface_container_low, materialDynamicColors0.surfaceContainerLow());
        hashMap0.put(color.material_personalized_color_surface_container_high, materialDynamicColors0.surfaceContainerHigh());
        hashMap0.put(color.material_personalized_color_surface_container_lowest, materialDynamicColors0.surfaceContainerLowest());
        hashMap0.put(color.material_personalized_color_surface_container_highest, materialDynamicColors0.surfaceContainerHighest());
        hashMap0.put(color.material_personalized_color_outline, materialDynamicColors0.outline());
        hashMap0.put(color.material_personalized_color_outline_variant, materialDynamicColors0.outlineVariant());
        hashMap0.put(color.material_personalized_color_error, materialDynamicColors0.error());
        hashMap0.put(color.material_personalized_color_on_error, materialDynamicColors0.onError());
        hashMap0.put(color.material_personalized_color_error_container, materialDynamicColors0.errorContainer());
        hashMap0.put(color.material_personalized_color_on_error_container, materialDynamicColors0.onErrorContainer());
        hashMap0.put(color.material_personalized_color_control_activated, materialDynamicColors0.controlActivated());
        hashMap0.put(color.material_personalized_color_control_normal, materialDynamicColors0.controlNormal());
        hashMap0.put(color.material_personalized_color_control_highlight, materialDynamicColors0.controlHighlight());
        hashMap0.put(color.material_personalized_color_text_primary_inverse, materialDynamicColors0.textPrimaryInverse());
        hashMap0.put(color.material_personalized_color_text_secondary_and_tertiary_inverse, materialDynamicColors0.textSecondaryAndTertiaryInverse());
        hashMap0.put(color.material_personalized_color_text_secondary_and_tertiary_inverse_disabled, materialDynamicColors0.textSecondaryAndTertiaryInverseDisabled());
        hashMap0.put(color.material_personalized_color_text_primary_inverse_disable_only, materialDynamicColors0.textPrimaryInverseDisableOnly());
        hashMap0.put(color.material_personalized_color_text_hint_foreground_inverse, materialDynamicColors0.textHintInverse());
        MaterialColorUtilitiesHelper.a = Collections.unmodifiableMap(hashMap0);
    }

    @NonNull
    public static Map createColorResourcesIdsToColorValues(@NonNull DynamicScheme dynamicScheme0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: MaterialColorUtilitiesHelper.a.entrySet()) {
            hashMap0.put(((Integer)((Map.Entry)object0).getKey()), ((DynamicColor)((Map.Entry)object0).getValue()).getArgb(dynamicScheme0));
        }
        return Collections.unmodifiableMap(hashMap0);
    }
}

