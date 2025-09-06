package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001Jß\u0001\u0010!\u001A\u00020 2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u00062\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0003\u0010\u000E\u001A\u00020\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\b\u0003\u0010\u0011\u001A\u00020\u00062\b\b\u0003\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0014\u001A\u00020\u00122\b\b\u0002\u0010\u0015\u001A\u00020\u00062\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0018\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00062\b\b\u0002\u0010\u001A\u001A\u00020\u00062\b\b\u0002\u0010\u001B\u001A\u00020\u00062\b\b\u0002\u0010\u001C\u001A\u00020\u00062\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001D2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001D¢\u0006\u0004\b!\u0010\"J\u001D\u0010$\u001A\u00020\u00162\u0006\u0010#\u001A\u00020 2\u0006\u0010\u0018\u001A\u00020\u0016¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory;", "", "", "text", "Landroid/text/TextPaint;", "paint", "", "width", "start", "end", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "Landroid/text/StaticLayout;", "create", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;IIILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)Landroid/text/StaticLayout;", "layout", "isFallbackLineSpacingEnabled", "(Landroid/text/StaticLayout;Z)Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class StaticLayoutFactory {
    public static final int $stable = 8;
    @NotNull
    public static final StaticLayoutFactory INSTANCE;
    public static final l a;

    static {
        StaticLayoutFactory.INSTANCE = new StaticLayoutFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
        StaticLayoutFactory.a = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final StaticLayout create(@NotNull CharSequence charSequence0, @NotNull TextPaint textPaint0, int v, int v1, int v2, @NotNull TextDirectionHeuristic textDirectionHeuristic0, @NotNull Layout.Alignment layout$Alignment0, @IntRange(from = 0L) int v3, @Nullable TextUtils.TruncateAt textUtils$TruncateAt0, @IntRange(from = 0L) int v4, @FloatRange(from = 0.0) float f, float f1, int v5, boolean z, boolean z1, int v6, int v7, int v8, int v9, @Nullable int[] arr_v, @Nullable int[] arr_v1) {
        q q0 = new q(charSequence0, textPaint0, v1, v2, v, textDirectionHeuristic0, layout$Alignment0, v3, textUtils$TruncateAt0, v4, f, f1, v5, z, z1, v6, v7, v8, v9, arr_v, arr_v1);
        return StaticLayoutFactory.a.create(q0);
    }

    public static StaticLayout create$default(StaticLayoutFactory staticLayoutFactory0, CharSequence charSequence0, TextPaint textPaint0, int v, int v1, int v2, TextDirectionHeuristic textDirectionHeuristic0, Layout.Alignment layout$Alignment0, int v3, TextUtils.TruncateAt textUtils$TruncateAt0, int v4, float f, float f1, int v5, boolean z, boolean z1, int v6, int v7, int v8, int v9, int[] arr_v, int[] arr_v1, int v10, Object object0) {
        int v11 = (v10 & 8) == 0 ? v1 : 0;
        int v12 = (v10 & 16) == 0 ? v2 : charSequence0.length();
        TextDirectionHeuristic textDirectionHeuristic1 = (v10 & 0x20) == 0 ? textDirectionHeuristic0 : LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release();
        Layout.Alignment layout$Alignment1 = (v10 & 0x40) == 0 ? layout$Alignment0 : LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release();
        int v13 = (v10 & 0x80) == 0 ? v3 : 0x7FFFFFFF;
        TextUtils.TruncateAt textUtils$TruncateAt1 = (v10 & 0x100) == 0 ? textUtils$TruncateAt0 : null;
        int v14 = (v10 & 0x200) == 0 ? v4 : v;
        float f2 = (v10 & 0x400) == 0 ? f : 1.0f;
        float f3 = (v10 & 0x800) == 0 ? f1 : 0.0f;
        int v15 = (v10 & 0x1000) == 0 ? v5 : 0;
        boolean z2 = (v10 & 0x2000) == 0 ? z : false;
        boolean z3 = (v10 & 0x4000) == 0 ? z1 : true;
        int v16 = (0x8000 & v10) == 0 ? v6 : 0;
        int v17 = (0x10000 & v10) == 0 ? v7 : 0;
        int v18 = (0x20000 & v10) == 0 ? v8 : 0;
        int v19 = (0x40000 & v10) == 0 ? v9 : 0;
        int[] arr_v2 = (0x80000 & v10) == 0 ? arr_v : null;
        return (v10 & 0x100000) == 0 ? staticLayoutFactory0.create(charSequence0, textPaint0, v, v11, v12, textDirectionHeuristic1, layout$Alignment1, v13, textUtils$TruncateAt1, v14, f2, f3, v15, z2, z3, v16, v17, v18, v19, arr_v2, arr_v1) : staticLayoutFactory0.create(charSequence0, textPaint0, v, v11, v12, textDirectionHeuristic1, layout$Alignment1, v13, textUtils$TruncateAt1, v14, f2, f3, v15, z2, z3, v16, v17, v18, v19, arr_v2, null);
    }

    public final boolean isFallbackLineSpacingEnabled(@NotNull StaticLayout staticLayout0, boolean z) {
        return StaticLayoutFactory.a.isFallbackLineSpacingEnabled(staticLayout0, z);
    }
}

