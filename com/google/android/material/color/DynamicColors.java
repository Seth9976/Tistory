package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.os.BuildCompat;
import com.google.android.material.R.attr;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.SchemeContent;
import com.google.android.material.resources.MaterialAttributes;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DynamicColors {
    interface DeviceSupportCondition {
        boolean isSupported();
    }

    public interface OnAppliedCallback {
        void onApplied(@NonNull Activity arg1);
    }

    public interface Precondition {
        boolean shouldApplyDynamicColors(@NonNull Activity arg1, @StyleRes int arg2);
    }

    public static final int[] a;
    public static final Map b;
    public static final Map c;

    static {
        DynamicColors.a = new int[]{attr.dynamicColorThemeOverlay};
        k k0 = new k();  // 初始化器: Ljava/lang/Object;-><init>()V
        l l0 = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
        HashMap hashMap0 = new HashMap();
        hashMap0.put("fcnt", k0);
        hashMap0.put("google", k0);
        hashMap0.put("hmd global", k0);
        hashMap0.put("infinix", k0);
        hashMap0.put("infinix mobility limited", k0);
        hashMap0.put("itel", k0);
        hashMap0.put("kyocera", k0);
        hashMap0.put("lenovo", k0);
        hashMap0.put("lge", k0);
        hashMap0.put("meizu", k0);
        hashMap0.put("motorola", k0);
        hashMap0.put("nothing", k0);
        hashMap0.put("oneplus", k0);
        hashMap0.put("oppo", k0);
        hashMap0.put("realme", k0);
        hashMap0.put("robolectric", k0);
        hashMap0.put("samsung", l0);
        hashMap0.put("sharp", k0);
        hashMap0.put("shift", k0);
        hashMap0.put("sony", k0);
        hashMap0.put("tcl", k0);
        hashMap0.put("tecno", k0);
        hashMap0.put("tecno mobile limited", k0);
        hashMap0.put("vivo", k0);
        hashMap0.put("wingtech", k0);
        hashMap0.put("xiaomi", k0);
        DynamicColors.b = Collections.unmodifiableMap(hashMap0);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("asus", k0);
        hashMap1.put("jio", k0);
        DynamicColors.c = Collections.unmodifiableMap(hashMap1);
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity0) {
        DynamicColors.applyToActivityIfAvailable(activity0);
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity0, @StyleRes int v) {
        DynamicColors.applyToActivityIfAvailable(activity0, new Builder().setThemeOverlay(v).build());
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity0, @NonNull Precondition dynamicColors$Precondition0) {
        DynamicColors.applyToActivityIfAvailable(activity0, new Builder().setPrecondition(dynamicColors$Precondition0).build());
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application0) {
        DynamicColors.applyToActivitiesIfAvailable(application0, new Builder().build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application0, @StyleRes int v) {
        DynamicColors.applyToActivitiesIfAvailable(application0, new Builder().setThemeOverlay(v).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application0, @StyleRes int v, @NonNull Precondition dynamicColors$Precondition0) {
        DynamicColors.applyToActivitiesIfAvailable(application0, new Builder().setThemeOverlay(v).setPrecondition(dynamicColors$Precondition0).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application0, @NonNull Precondition dynamicColors$Precondition0) {
        DynamicColors.applyToActivitiesIfAvailable(application0, new Builder().setPrecondition(dynamicColors$Precondition0).build());
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application0, @NonNull DynamicColorsOptions dynamicColorsOptions0) {
        application0.registerActivityLifecycleCallbacks(new m(dynamicColorsOptions0));
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity0) {
        DynamicColors.applyToActivityIfAvailable(activity0, new Builder().build());
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity0, @NonNull DynamicColorsOptions dynamicColorsOptions0) {
        int v = 0;
        if(!DynamicColors.isDynamicColorAvailable()) {
            return;
        }
        if(dynamicColorsOptions0.getContentBasedSeedColor() == null) {
            if(dynamicColorsOptions0.getThemeOverlay() == 0) {
                TypedArray typedArray0 = activity0.obtainStyledAttributes(DynamicColors.a);
                v = typedArray0.getResourceId(0, 0);
                typedArray0.recycle();
            }
            else {
                v = dynamicColorsOptions0.getThemeOverlay();
            }
        }
        if(dynamicColorsOptions0.getPrecondition().shouldApplyDynamicColors(activity0, v)) {
            if(dynamicColorsOptions0.getContentBasedSeedColor() == null) {
                ThemeUtils.applyThemeOverlay(activity0, v);
            }
            else {
                Hct hct0 = Hct.fromInt(((int)dynamicColorsOptions0.getContentBasedSeedColor()));
                boolean z = MaterialAttributes.resolveBoolean(activity0, attr.isLightTheme, true);
                UiModeManager uiModeManager0 = (UiModeManager)activity0.getSystemService("uimode");
                SchemeContent schemeContent0 = new SchemeContent(hct0, !z, ((double)(uiModeManager0 == null || Build.VERSION.SDK_INT < 34 ? 0.0f : uiModeManager0.getContrast())));
                ColorResourcesOverride colorResourcesOverride0 = ColorResourcesOverride.getInstance();
                if(colorResourcesOverride0 == null) {
                    return;
                }
                if(!colorResourcesOverride0.applyIfPossible(activity0, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent0))) {
                    return;
                }
            }
            dynamicColorsOptions0.getOnAppliedCallback().onApplied(activity0);
        }
    }

    @SuppressLint({"DefaultLocale"})
    @ChecksSdkIntAtLeast(api = 0x1F)
    public static boolean isDynamicColorAvailable() {
        if(Build.VERSION.SDK_INT < 0x1F) {
            return false;
        }
        if(BuildCompat.isAtLeastT()) {
            return true;
        }
        Locale locale0 = Locale.ROOT;
        DeviceSupportCondition dynamicColors$DeviceSupportCondition0 = (DeviceSupportCondition)DynamicColors.b.get(Build.MANUFACTURER.toLowerCase(locale0));
        if(dynamicColors$DeviceSupportCondition0 == null) {
            dynamicColors$DeviceSupportCondition0 = (DeviceSupportCondition)DynamicColors.c.get(Build.BRAND.toLowerCase(locale0));
        }
        return dynamicColors$DeviceSupportCondition0 != null && dynamicColors$DeviceSupportCondition0.isSupported();
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context0) {
        return DynamicColors.wrapContextIfAvailable(context0, 0);
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context0, @StyleRes int v) {
        return DynamicColors.wrapContextIfAvailable(context0, new Builder().setThemeOverlay(v).build());
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context0, @NonNull DynamicColorsOptions dynamicColorsOptions0) {
        if(!DynamicColors.isDynamicColorAvailable()) {
            return context0;
        }
        int v = dynamicColorsOptions0.getThemeOverlay();
        if(v == 0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(DynamicColors.a);
            int v1 = typedArray0.getResourceId(0, 0);
            typedArray0.recycle();
            v = v1;
        }
        if(v == 0) {
            return context0;
        }
        if(dynamicColorsOptions0.getContentBasedSeedColor() != null) {
            Hct hct0 = Hct.fromInt(((int)dynamicColorsOptions0.getContentBasedSeedColor()));
            boolean z = MaterialAttributes.resolveBoolean(context0, attr.isLightTheme, true);
            UiModeManager uiModeManager0 = (UiModeManager)context0.getSystemService("uimode");
            SchemeContent schemeContent0 = new SchemeContent(hct0, !z, ((double)(uiModeManager0 == null || Build.VERSION.SDK_INT < 34 ? 0.0f : uiModeManager0.getContrast())));
            ColorResourcesOverride colorResourcesOverride0 = ColorResourcesOverride.getInstance();
            if(colorResourcesOverride0 != null) {
                return colorResourcesOverride0.wrapContextIfPossible(context0, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent0));
            }
        }
        return new ContextThemeWrapper(context0, v);
    }
}

