package androidx.compose.ui.text.android;

import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class c {
    @DoNotInline
    @JvmStatic
    @NotNull
    public static final BoringLayout a(@NotNull CharSequence charSequence0, @NotNull TextPaint textPaint0, int v, @NotNull Layout.Alignment layout$Alignment0, float f, float f1, @NotNull BoringLayout.Metrics boringLayout$Metrics0, boolean z, @Nullable TextUtils.TruncateAt textUtils$TruncateAt0, int v1) {
        return new BoringLayout(charSequence0, textPaint0, v, layout$Alignment0, f, f1, boringLayout$Metrics0, z, textUtils$TruncateAt0, v1);
    }

    @DoNotInline
    @JvmStatic
    @Nullable
    public static final BoringLayout.Metrics b(@NotNull CharSequence charSequence0, @NotNull TextPaint textPaint0, @NotNull TextDirectionHeuristic textDirectionHeuristic0) {
        return textDirectionHeuristic0.isRtl(charSequence0, 0, charSequence0.length()) ? null : BoringLayout.isBoring(charSequence0, textPaint0, null);
    }
}

