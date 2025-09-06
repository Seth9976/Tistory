package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.ArrayRes;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.IntegerRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\u001A\u0017\u0010\u0000\u001A\u00020\u00012\b\b\u0001\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001A\u0017\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001A\u0017\u0010\b\u001A\u00020\t2\b\b\u0001\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\n\u001A\u0017\u0010\u000B\u001A\u00020\u00032\b\b\u0001\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"booleanResource", "", "id", "", "(ILandroidx/compose/runtime/Composer;I)Z", "dimensionResource", "Landroidx/compose/ui/unit/Dp;", "(ILandroidx/compose/runtime/Composer;I)F", "integerArrayResource", "", "(ILandroidx/compose/runtime/Composer;I)[I", "integerResource", "(ILandroidx/compose/runtime/Composer;I)I", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPrimitiveResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,82:1\n77#2:83\n77#2:84\n77#2:85\n77#2:86\n77#2:87\n*S KotlinDebug\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n*L\n38#1:83\n51#1:84\n64#1:85\n77#1:86\n78#1:87\n*E\n"})
public final class PrimitiveResources_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean booleanResource(@BoolRes int v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE63A2F31, v1, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:62)");
        }
        boolean z = ((Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getBoolean(v);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z;
    }

    @Composable
    @ReadOnlyComposable
    public static final float dimensionResource(@DimenRes int v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2FF10657, v1, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:75)");
        }
        Context context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        float f = Dp.constructor-impl(context0.getResources().getDimension(v) / density0.getDensity());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return f;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final int[] integerArrayResource(@ArrayRes int v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFA65CCAA, v1, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:49)");
        }
        int[] arr_v = ((Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getIntArray(v);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return arr_v;
    }

    @Composable
    @ReadOnlyComposable
    public static final int integerResource(@IntegerRes int v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(916701108, v1, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:36)");
        }
        int v2 = ((Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getInteger(v);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v2;
    }
}

