package com.kakao.kandinsky.designsystem.theme;

import android.content.res.Configuration;
import androidx.compose.foundation.text.selection.w0;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import da.a;
import da.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001AQ\u0010\t\u001A\u00020\u0003*\u00020\u00032\u001E\b\u0002\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\u001E\b\u0002\u0010\b\u001A\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\t\u0010\n\"\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00000\u000B8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lcom/kakao/kandinsky/designsystem/theme/Orientation;", "getOrientation", "(Landroidx/compose/runtime/Composer;I)Lcom/kakao/kandinsky/designsystem/theme/Orientation;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "portrait", "landscape", "byOrientation", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalOrientation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalOrientation", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOrientation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Orientation.kt\ncom/kakao/kandinsky/designsystem/theme/OrientationKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,34:1\n77#2:35\n*S KotlinDebug\n*F\n+ 1 Orientation.kt\ncom/kakao/kandinsky/designsystem/theme/OrientationKt\n*L\n16#1:35\n*E\n"})
public final class OrientationKt {
    public static final ProvidableCompositionLocal a;

    static {
        OrientationKt.a = CompositionLocalKt.compositionLocalOf$default(null, a.w, 1, null);
    }

    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final Modifier byOrientation(@NotNull Modifier modifier0, @NotNull Function3 function30, @NotNull Function3 function31) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "portrait");
        Intrinsics.checkNotNullParameter(function31, "landscape");
        return ComposedModifierKt.composed$default(modifier0, null, new w0(5, function30, function31), 1, null);
    }

    public static Modifier byOrientation$default(Modifier modifier0, Function3 function30, Function3 function31, int v, Object object0) {
        if((v & 1) != 0) {
            function30 = b.x;
        }
        if((v & 2) != 0) {
            function31 = b.y;
        }
        return OrientationKt.byOrientation(modifier0, function30, function31);
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalOrientation() {
        return OrientationKt.a;
    }

    @Composable
    @NotNull
    public static final Orientation getOrientation(@Nullable Composer composer0, int v) {
        Orientation orientation0;
        composer0.startReplaceGroup(0x37721C50);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x37721C50, v, -1, "com.kakao.kandinsky.designsystem.theme.getOrientation (Orientation.kt:14)");
        }
        switch(((Configuration)composer0.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation) {
            case 1: {
                orientation0 = Orientation.Portrait;
                break;
            }
            case 2: {
                orientation0 = Orientation.Landscape;
                break;
            }
            default: {
                orientation0 = Orientation.Landscape;
            }
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return orientation0;
    }
}

