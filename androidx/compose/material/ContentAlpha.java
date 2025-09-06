package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001R\u0011\u0010\u0005\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0004R\u0011\u0010\t\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Landroidx/compose/material/ContentAlpha;", "", "", "getHigh", "(Landroidx/compose/runtime/Composer;I)F", "high", "getMedium", "medium", "getDisabled", "disabled", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContentAlpha.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,133:1\n74#2:134\n*S KotlinDebug\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n*L\n78#1:134\n*E\n"})
public final class ContentAlpha {
    public static final int $stable;
    @NotNull
    public static final ContentAlpha INSTANCE;

    static {
        ContentAlpha.INSTANCE = new ContentAlpha();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static float a(float f, float f1, Composer composer0, int v) {
        composer0.startReplaceableGroup(-1528360391);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1528360391, v, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:76)");
        }
        long v1 = ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        if(!MaterialTheme.INSTANCE.getColors(composer0, 6).isLight()) {
            if(((double)ColorKt.luminance-8_81llA(v1)) >= 0.5) {
                f = f1;
            }
        }
        else if(((double)ColorKt.luminance-8_81llA(v1)) <= 0.5) {
            f = f1;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return f;
    }

    @Composable
    @JvmName(name = "getDisabled")
    public final float getDisabled(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x2506827F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2506827F, v, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:57)");
        }
        float f = ContentAlpha.a(0.38f, 0.38f, composer0, v << 6 & 0x380 | 54);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return f;
    }

    @Composable
    @JvmName(name = "getHigh")
    public final float getHigh(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x258041BF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x258041BF, v, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:35)");
        }
        float f = ContentAlpha.a(1.0f, 0.87f, composer0, v << 6 & 0x380 | 54);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return f;
    }

    @Composable
    @JvmName(name = "getMedium")
    public final float getMedium(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x7727281F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7727281F, v, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:46)");
        }
        float f = ContentAlpha.a(0.74f, 0.6f, composer0, v << 6 & 0x380 | 54);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return f;
    }
}

