package com.kakao.tistory.presentation.common;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000B\u001A\u00020\b8G¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0011\u0010\r\u001A\u00020\b8G¢\u0006\u0006\u001A\u0004\b\f\u0010\nR\u0011\u0010\u000F\u001A\u00020\b8G¢\u0006\u0006\u001A\u0004\b\u000E\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/common/TistoryWindowInsets;", "", "", "a", "I", "getSafeInsetsCompat", "()I", "safeInsetsCompat", "Landroidx/compose/foundation/layout/WindowInsets;", "getBottom", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "bottom", "getTop", "top", "getModalBottom", "modalBottom", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TistoryWindowInsets {
    public static final int $stable;
    @NotNull
    public static final TistoryWindowInsets INSTANCE;
    public static final int a;

    static {
        TistoryWindowInsets.INSTANCE = new TistoryWindowInsets();
        TistoryWindowInsets.a = 0x8F;
    }

    @Composable
    @JvmName(name = "getBottom")
    @NotNull
    public final WindowInsets getBottom(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(-405508758);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-405508758, v, -1, "com.kakao.tistory.presentation.common.TistoryWindowInsets.<get-bottom> (TistoryWindowInsets.kt:18)");
        }
        WindowInsets windowInsets0 = WindowInsetsKt.only-bOOhFvg(WindowInsets_androidKt.getSystemBars(WindowInsets.Companion, composer0, 8), 0x20);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return windowInsets0;
    }

    @Composable
    @JvmName(name = "getModalBottom")
    @NotNull
    public final WindowInsets getModalBottom(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(-1377100254);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1377100254, v, -1, "com.kakao.tistory.presentation.common.TistoryWindowInsets.<get-modalBottom> (TistoryWindowInsets.kt:26)");
        }
        WindowInsets windowInsets0 = WindowInsetsKt.only-bOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composer0, 8), 0x20);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return windowInsets0;
    }

    public final int getSafeInsetsCompat() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getTop")
    @NotNull
    public final WindowInsets getTop(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x58C43D02);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x58C43D02, v, -1, "com.kakao.tistory.presentation.common.TistoryWindowInsets.<get-top> (TistoryWindowInsets.kt:22)");
        }
        WindowInsets windowInsets0 = WindowInsetsKt.only-bOOhFvg(WindowInsets_androidKt.getSystemBars(WindowInsets.Companion, composer0, 8), 16);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return windowInsets0;
    }
}

