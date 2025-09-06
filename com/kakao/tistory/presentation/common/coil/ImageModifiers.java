package com.kakao.tistory.presentation.common.coil;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.kakao.tistory.presentation.R.color;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001R\u0011\u0010\u0005\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0004R\u0011\u0010\t\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\b\u0010\u0004R\u0011\u0010\u000B\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\n\u0010\u0004R\u0011\u0010\r\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\f\u0010\u0004¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/common/coil/ImageModifiers;", "", "Landroidx/compose/ui/Modifier;", "getROUNDED_CORNER_3_NO_BORDER", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "ROUNDED_CORNER_3_NO_BORDER", "getROUNDED_CORNER_4_NO_BORDER", "ROUNDED_CORNER_4_NO_BORDER", "getDEFAULT", "DEFAULT", "getROUNDED_CORNER_4", "ROUNDED_CORNER_4", "getROUNDED_CORNER_8", "ROUNDED_CORNER_8", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageModifiers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageModifiers.kt\ncom/kakao/tistory/presentation/common/coil/ImageModifiers\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,35:1\n148#2:36\n148#2:37\n148#2:38\n148#2:39\n148#2:40\n148#2:41\n148#2:42\n148#2:43\n*S KotlinDebug\n*F\n+ 1 ImageModifiers.kt\ncom/kakao/tistory/presentation/common/coil/ImageModifiers\n*L\n15#1:36\n18#1:37\n22#1:38\n23#1:39\n28#1:40\n29#1:41\n33#1:42\n34#1:43\n*E\n"})
public final class ImageModifiers {
    public static final int $stable;
    @NotNull
    public static final ImageModifiers INSTANCE;

    static {
        ImageModifiers.INSTANCE = new ImageModifiers();
    }

    @Composable
    @JvmName(name = "getDEFAULT")
    @NotNull
    public final Modifier getDEFAULT(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x9F902590);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9F902590, v, -1, "com.kakao.tistory.presentation.common.coil.ImageModifiers.<get-DEFAULT> (ImageModifiers.kt:20)");
        }
        long v1 = ColorResources_androidKt.colorResource(color.black_4, composer0, 0);
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(1.0f);
        Modifier modifier0 = ClipKt.clip(BorderKt.border-xT4_qwU(Modifier.Companion, 1.0f, v1, roundedCornerShape0), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(1.0f));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier0;
    }

    @Composable
    @JvmName(name = "getROUNDED_CORNER_3_NO_BORDER")
    @NotNull
    public final Modifier getROUNDED_CORNER_3_NO_BORDER(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(-899044812);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-899044812, v, -1, "com.kakao.tistory.presentation.common.coil.ImageModifiers.<get-ROUNDED_CORNER_3_NO_BORDER> (ImageModifiers.kt:14)");
        }
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(3.0f);
        Modifier modifier0 = ClipKt.clip(Modifier.Companion, roundedCornerShape0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier0;
    }

    @Composable
    @JvmName(name = "getROUNDED_CORNER_4")
    @NotNull
    public final Modifier getROUNDED_CORNER_4(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x340E3E08);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x340E3E08, v, -1, "com.kakao.tistory.presentation.common.coil.ImageModifiers.<get-ROUNDED_CORNER_4> (ImageModifiers.kt:26)");
        }
        long v1 = ColorResources_androidKt.colorResource(color.black_4, composer0, 0);
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(4.0f);
        Modifier modifier0 = ClipKt.clip(BorderKt.border-xT4_qwU(Modifier.Companion, 1.0f, v1, roundedCornerShape0), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(4.0f));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier0;
    }

    @Composable
    @JvmName(name = "getROUNDED_CORNER_4_NO_BORDER")
    @NotNull
    public final Modifier getROUNDED_CORNER_4_NO_BORDER(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x8AE4B532);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8AE4B532, v, -1, "com.kakao.tistory.presentation.common.coil.ImageModifiers.<get-ROUNDED_CORNER_4_NO_BORDER> (ImageModifiers.kt:17)");
        }
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(4.0f);
        Modifier modifier0 = ClipKt.clip(Modifier.Companion, roundedCornerShape0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier0;
    }

    @Composable
    @JvmName(name = "getROUNDED_CORNER_8")
    @NotNull
    public final Modifier getROUNDED_CORNER_8(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0xEAF2AB00);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEAF2AB00, v, -1, "com.kakao.tistory.presentation.common.coil.ImageModifiers.<get-ROUNDED_CORNER_8> (ImageModifiers.kt:31)");
        }
        long v1 = ColorResources_androidKt.colorResource(color.black_4, composer0, 0);
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f);
        Modifier modifier0 = ClipKt.clip(BorderKt.border-xT4_qwU(Modifier.Companion, 1.0f, v1, roundedCornerShape0), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier0;
    }
}

