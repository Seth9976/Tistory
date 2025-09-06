package p3;

import android.widget.TextView;
import androidx.annotation.DoNotInline;

public abstract class n {
    @DoNotInline
    public static int a(TextView textView0) {
        return textView0.getAutoSizeMaxTextSize();
    }

    @DoNotInline
    public static int b(TextView textView0) {
        return textView0.getAutoSizeMinTextSize();
    }

    @DoNotInline
    public static int c(TextView textView0) {
        return textView0.getAutoSizeStepGranularity();
    }

    @DoNotInline
    public static int[] d(TextView textView0) {
        return textView0.getAutoSizeTextAvailableSizes();
    }

    @DoNotInline
    public static int e(TextView textView0) {
        return textView0.getAutoSizeTextType();
    }

    @DoNotInline
    public static void f(TextView textView0, int v, int v1, int v2, int v3) {
        textView0.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
    }

    @DoNotInline
    public static void g(TextView textView0, int[] arr_v, int v) {
        textView0.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
    }

    @DoNotInline
    public static void h(TextView textView0, int v) {
        textView0.setAutoSizeTextTypeWithDefaults(v);
    }
}

