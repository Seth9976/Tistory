package androidx.activity;

import android.graphics.text.LineBreakConfig.Builder;
import android.icu.text.DateFormat.HourCycle;
import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a0;

public abstract class n {
    public static DateFormat.HourCycle B() {
        return DateFormat.HourCycle.HOUR_CYCLE_12;
    }

    public static DateFormat.HourCycle C() {
        return DateFormat.HourCycle.HOUR_CYCLE_23;
    }

    public static DateFormat.HourCycle D() {
        return DateFormat.HourCycle.HOUR_CYCLE_24;
    }

    public static int b(DateFormat.HourCycle dateFormat$HourCycle0) [...] // 潜在的解密器

    public static LineBreakConfig.Builder e() {
        return new LineBreakConfig.Builder();
    }

    public static DateFormat.HourCycle h() {
        return DateFormat.HourCycle.HOUR_CYCLE_11;
    }

    public static BoringLayout.Metrics i(CharSequence charSequence0, TextPaint textPaint0, TextDirectionHeuristic textDirectionHeuristic0) {
        return BoringLayout.isBoring(charSequence0, textPaint0, textDirectionHeuristic0, true, null);
    }

    public static BoringLayout j(CharSequence charSequence0, TextPaint textPaint0, int v, Layout.Alignment layout$Alignment0, float f, float f1, BoringLayout.Metrics boringLayout$Metrics0, boolean z, boolean z1, TextUtils.TruncateAt textUtils$TruncateAt0, int v1) {
        return new BoringLayout(charSequence0, textPaint0, v, layout$Alignment0, f, f1, boringLayout$Metrics0, z, textUtils$TruncateAt0, v1, z1);
    }

    public static OnBackInvokedCallback l(Object object0) [...] // Inlined contents

    public static OnBackInvokedDispatcher p(Object object0) [...] // Inlined contents

    public static void v(OnBackInvokedDispatcher onBackInvokedDispatcher0, a0 a00) {
        onBackInvokedDispatcher0.registerOnBackInvokedCallback(1000000, a00);
    }
}

