package androidx.appcompat.widget;

import android.widget.TextView;
import androidx.annotation.DoNotInline;

public abstract class z0 {
    @DoNotInline
    public static int a(TextView textView0) {
        return textView0.getAutoSizeStepGranularity();
    }

    @DoNotInline
    public static void b(TextView textView0, int v, int v1, int v2, int v3) {
        textView0.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
    }

    @DoNotInline
    public static void c(TextView textView0, int[] arr_v, int v) {
        textView0.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
    }

    @DoNotInline
    public static boolean d(TextView textView0, String s) {
        return textView0.setFontVariationSettings(s);
    }
}

