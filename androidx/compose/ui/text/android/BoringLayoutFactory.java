package androidx.compose.ui.text.android;

import android.os.Build.VERSION;
import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001J\'\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJa\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\b2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u00102\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001A\u00020\u000B¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001A\u001A\u00020\u00102\u0006\u0010\u0019\u001A\u00020\u0016¢\u0006\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/text/android/BoringLayoutFactory;", "", "", "text", "Landroid/text/TextPaint;", "paint", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/BoringLayout$Metrics;", "measure", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;)Landroid/text/BoringLayout$Metrics;", "", "width", "metrics", "Landroid/text/Layout$Alignment;", "alignment", "", "includePadding", "useFallbackLineSpacing", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "Landroid/text/BoringLayout;", "create", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/BoringLayout$Metrics;Landroid/text/Layout$Alignment;ZZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;", "layout", "isFallbackLineSpacingEnabled", "(Landroid/text/BoringLayout;)Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBoringLayoutFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoringLayoutFactory.android.kt\nandroidx/compose/ui/text/android/BoringLayoutFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
public final class BoringLayoutFactory {
    public static final int $stable;
    @NotNull
    public static final BoringLayoutFactory INSTANCE;

    static {
        BoringLayoutFactory.INSTANCE = new BoringLayoutFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final BoringLayout create(@NotNull CharSequence charSequence0, @NotNull TextPaint textPaint0, int v, @NotNull BoringLayout.Metrics boringLayout$Metrics0, @NotNull Layout.Alignment layout$Alignment0, boolean z, boolean z1, @Nullable TextUtils.TruncateAt textUtils$TruncateAt0, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException("negative width");
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("negative ellipsized width");
        }
        return Build.VERSION.SDK_INT < 33 ? c.a(charSequence0, textPaint0, v, layout$Alignment0, 1.0f, 0.0f, boringLayout$Metrics0, z, textUtils$TruncateAt0, v1) : b.a(charSequence0, textPaint0, v, layout$Alignment0, 1.0f, 0.0f, boringLayout$Metrics0, z, z1, textUtils$TruncateAt0, v1);
    }

    public static BoringLayout create$default(BoringLayoutFactory boringLayoutFactory0, CharSequence charSequence0, TextPaint textPaint0, int v, BoringLayout.Metrics boringLayout$Metrics0, Layout.Alignment layout$Alignment0, boolean z, boolean z1, TextUtils.TruncateAt textUtils$TruncateAt0, int v1, int v2, Object object0) {
        Layout.Alignment layout$Alignment1 = (v2 & 16) == 0 ? layout$Alignment0 : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (v2 & 0x20) == 0 ? z : false;
        boolean z3 = (v2 & 0x40) == 0 ? z1 : true;
        TextUtils.TruncateAt textUtils$TruncateAt1 = (v2 & 0x80) == 0 ? textUtils$TruncateAt0 : null;
        return (v2 & 0x100) == 0 ? boringLayoutFactory0.create(charSequence0, textPaint0, v, boringLayout$Metrics0, layout$Alignment1, z2, z3, textUtils$TruncateAt1, v1) : boringLayoutFactory0.create(charSequence0, textPaint0, v, boringLayout$Metrics0, layout$Alignment1, z2, z3, textUtils$TruncateAt1, v);
    }

    public final boolean isFallbackLineSpacingEnabled(@NotNull BoringLayout boringLayout0) {
        return Build.VERSION.SDK_INT < 33 ? false : b.c(boringLayout0);
    }

    @Nullable
    public final BoringLayout.Metrics measure(@NotNull CharSequence charSequence0, @NotNull TextPaint textPaint0, @NotNull TextDirectionHeuristic textDirectionHeuristic0) {
        return Build.VERSION.SDK_INT < 33 ? c.b(charSequence0, textPaint0, textDirectionHeuristic0) : b.b(charSequence0, textPaint0, textDirectionHeuristic0);
    }
}

