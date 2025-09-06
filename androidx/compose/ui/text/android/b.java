package androidx.compose.ui.text.android;

import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.activity.n;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class b {
    @DoNotInline
    @JvmStatic
    @NotNull
    public static final BoringLayout a(@NotNull CharSequence charSequence0, @NotNull TextPaint textPaint0, int v, @NotNull Layout.Alignment layout$Alignment0, float f, float f1, @NotNull BoringLayout.Metrics boringLayout$Metrics0, boolean z, boolean z1, @Nullable TextUtils.TruncateAt textUtils$TruncateAt0, int v1) {
        return n.j(charSequence0, textPaint0, v, layout$Alignment0, f, f1, boringLayout$Metrics0, z, z1, textUtils$TruncateAt0, v1);
    }

    @DoNotInline
    @JvmStatic
    @Nullable
    public static final BoringLayout.Metrics b(@NotNull CharSequence charSequence0, @NotNull TextPaint textPaint0, @NotNull TextDirectionHeuristic textDirectionHeuristic0) {
        return n.i(charSequence0, textPaint0, textDirectionHeuristic0);
    }

    @DoNotInline
    @JvmStatic
    public static final boolean c(@NotNull BoringLayout boringLayout0) {
        return boringLayout0.isFallbackLineSpacingEnabled();
    }
}

