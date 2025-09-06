package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.text.selection.y;
import androidx.compose.material3.c0;
import androidx.compose.material3.z;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.b1;
import p0.g0;
import p0.h0;
import p0.j0;
import p0.k0;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u008C\u0001\u0010\u0014\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0015\b\u0002\u0010\b\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00022\u001E\b\u0002\u0010\f\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001A\u0084\u0001\u0010\u0014\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0015\b\u0002\u0010\b\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00022\u001E\b\u0002\u0010\f\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001Aj\u0010\u0014\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0018\u001A\u00020\u00172\u001C\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\u000BH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001Ab\u0010\u0014\u001A\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0018\u001A\u00020\u00172\u001C\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\u000BH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001Av\u0010\"\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0018\u001A\u00020\u00172\u001C\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\u000BH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!\u001An\u0010\"\u001A\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0018\u001A\u00020\u00172\u001C\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\u000BH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$\u001A \u0010(\u001A\u00020%2\u0006\u0010&\u001A\u00020%2\u0006\u0010\'\u001A\u00020%H\u0080\b\u00A2\u0006\u0004\b(\u0010)\u001A3\u0010-\u001A\u000E\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0,2\u0006\u0010*\u001A\u00020%2\u0006\u0010\'\u001A\u00020%2\u0006\u0010+\u001A\u00020%H\u0000\u00A2\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006/"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "actions", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "TopAppBar-Rx1qByU", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar", "TopAppBar-xWeB9-s", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "content", "TopAppBar-afqeVBk", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TopAppBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "cutoutShape", "BottomAppBar-DanWW-k", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "BottomAppBar-Y1yfwus", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "cutoutRadius", "verticalOffset", "calculateCutoutCircleYIntercept", "(FF)F", "controlPointX", "radius", "Lkotlin/Pair;", "calculateRoundedEdgeIntercept", "(FFF)Lkotlin/Pair;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,758:1\n606#1:761\n606#1:762\n606#1:763\n606#1:764\n606#1:765\n606#1:766\n74#2:759\n74#2:760\n154#3:767\n154#3:768\n154#3:769\n154#3:771\n154#3:773\n154#3:774\n154#3:775\n58#4:770\n58#4:772\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n632#1:761\n664#1:762\n665#1:763\n667#1:764\n674#1:765\n675#1:766\n343#1:759\n411#1:760\n743#1:767\n745#1:768\n747#1:769\n750#1:771\n753#1:773\n755#1:774\n757#1:775\n747#1:770\n750#1:772\n*E\n"})
public final class AppBarKt {
    public static final float a;
    public static final float b;
    public static final Modifier c;
    public static final Modifier d;
    public static final float e;
    public static final float f;
    public static final WindowInsets g;

    static {
        AppBarKt.a = 56.0f;
        AppBarKt.b = 4.0f;
        AppBarKt.c = SizeKt.width-3ABfNKs(Modifier.Companion, 12.0f);
        AppBarKt.d = SizeKt.width-3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), 68.0f);
        AppBarKt.e = 8.0f;
        AppBarKt.f = 4.0f;
        AppBarKt.g = WindowInsetsKt.WindowInsets-a9UjIt4$default(0.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BottomAppBar-DanWW-k(@NotNull WindowInsets windowInsets0, @Nullable Modifier modifier0, long v, long v1, @Nullable Shape shape0, float f, @Nullable PaddingValues paddingValues0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        PaddingValues paddingValues1;
        float f2;
        Shape shape2;
        long v10;
        long v9;
        Modifier modifier2;
        Shape shape3;
        PaddingValues paddingValues2;
        float f3;
        int v11;
        float f1;
        Shape shape1;
        int v8;
        long v7;
        int v6;
        long v5;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x16CEE727);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(windowInsets0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v2 & 0x70) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 0x380) == 0) {
            if((v3 & 4) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x100 : 0x80;
            }
            else {
                v5 = v;
                v6 = 0x80;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x1C00) == 0) {
            if((v3 & 8) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x800 : 0x400;
            }
            else {
                v7 = v1;
                v8 = 0x400;
            }
            v4 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            shape1 = shape0;
        }
        else if((0xE000 & v2) == 0) {
            shape1 = shape0;
            v4 |= (composer1.changed(shape1) ? 0x4000 : 0x2000);
        }
        else {
            shape1 = shape0;
        }
        if((v3 & 0x20) == 0) {
            f1 = f;
            if((v2 & 0x70000) == 0) {
                v4 |= (composer1.changed(f1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v4 |= 0x30000;
            f1 = f;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.changed(paddingValues0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x16DB6DB) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v3 & 4) != 0) {
                    v5 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composer1, 6));
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v7 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 6 & 14);
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    shape1 = null;
                }
                if((v3 & 0x20) != 0) {
                    f1 = 8.0f;
                }
                if((v3 & 0x40) == 0) {
                label_101:
                    v11 = v4;
                    shape3 = shape1;
                    f3 = f1;
                    paddingValues2 = paddingValues0;
                }
                else {
                    v11 = v4;
                    f3 = f1;
                    paddingValues2 = AppBarDefaults.INSTANCE.getContentPadding();
                    shape3 = shape1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                goto label_101;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x16CEE727, v11, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:341)");
            }
            FabPlacement fabPlacement0 = (FabPlacement)composer1.consume(ScaffoldKt.getLocalFabPlacement());
            Shape shape4 = shape3 == null || fabPlacement0 == null || !fabPlacement0.isDocked() ? RectangleShapeKt.getRectangleShape() : new b1(shape3, fabPlacement0);
            AppBarKt.a(v5, v7, f3, paddingValues2, shape4, windowInsets0, modifier1, function30, composer1, v11 >> 6 & 0x7E | v11 >> 9 & 0x380 | v11 >> 9 & 0x1C00 | 0x70000 & v11 << 15 | v11 << 15 & 0x380000 | v11 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape2 = shape3;
            f2 = f3;
            paddingValues1 = paddingValues2;
            modifier2 = modifier1;
            v9 = v5;
            v10 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            v9 = v5;
            v10 = v7;
            shape2 = shape1;
            f2 = f1;
            paddingValues1 = paddingValues0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(windowInsets0, modifier2, v9, v10, shape2, f2, paddingValues1, function30, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BottomAppBar-Y1yfwus(@Nullable Modifier modifier0, long v, long v1, @Nullable Shape shape0, float f, @Nullable PaddingValues paddingValues0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        Modifier modifier1;
        Modifier modifier2;
        Shape shape2;
        PaddingValues paddingValues2;
        float f2;
        int v10;
        PaddingValues paddingValues1;
        float f1;
        Shape shape1;
        int v8;
        long v7;
        int v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x9D894253);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v2 & 0x70) == 0) {
            if((v3 & 2) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x20 : 16;
            }
            else {
                v5 = v;
                v6 = 16;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x380) == 0) {
            if((v3 & 4) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x100 : 0x80;
            }
            else {
                v7 = v1;
                v8 = 0x80;
            }
            v4 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            shape1 = shape0;
        }
        else if((v2 & 0x1C00) == 0) {
            shape1 = shape0;
            v4 |= (composer1.changed(shape1) ? 0x800 : 0x400);
        }
        else {
            shape1 = shape0;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            f1 = f;
        }
        else if((0xE000 & v2) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        else {
            f1 = f;
        }
        if((v3 & 0x20) == 0) {
            paddingValues1 = paddingValues0;
            if((v2 & 0x70000) == 0) {
                v4 |= (composer1.changed(paddingValues1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v4 |= 0x30000;
            paddingValues1 = paddingValues0;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                    v5 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composer1, 6));
                }
                if((v3 & 4) != 0) {
                    long v9 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 3 & 14);
                    v4 &= -897;
                    v7 = v9;
                }
                if((v3 & 8) != 0) {
                    shape1 = null;
                }
                if((v3 & 16) != 0) {
                    f1 = 8.0f;
                }
                if((v3 & 0x20) == 0) {
                label_95:
                    v10 = v4;
                    shape2 = shape1;
                    f2 = f1;
                    paddingValues2 = paddingValues1;
                }
                else {
                    v10 = v4;
                    f2 = f1;
                    paddingValues2 = AppBarDefaults.INSTANCE.getContentPadding();
                    shape2 = shape1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                modifier2 = modifier0;
                goto label_95;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9D894253, v10, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:409)");
            }
            FabPlacement fabPlacement0 = (FabPlacement)composer1.consume(ScaffoldKt.getLocalFabPlacement());
            Shape shape3 = shape2 == null || fabPlacement0 == null || !fabPlacement0.isDocked() ? RectangleShapeKt.getRectangleShape() : new b1(shape2, fabPlacement0);
            AppBarKt.a(v5, v7, f2, paddingValues2, shape3, AppBarKt.g, modifier2, function30, composer1, v10 >> 3 & 0x70 | (v10 >> 3 & 14 | 0x30000) | v10 >> 6 & 0x380 | v10 >> 6 & 0x1C00 | v10 << 18 & 0x380000 | v10 << 3 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape1 = shape2;
            f1 = f2;
            paddingValues1 = paddingValues2;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(modifier1, v5, v7, shape1, f1, paddingValues1, function30, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TopAppBar-HsRjFd4(@Nullable Modifier modifier0, long v, long v1, float f, @Nullable PaddingValues paddingValues0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        PaddingValues paddingValues2;
        float f2;
        Modifier modifier2;
        PaddingValues paddingValues1;
        float f1;
        int v8;
        long v7;
        int v6;
        long v5;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(1897058582);
        if((v3 & 1) != 0) {
            v4 = v2 | 6;
            modifier1 = modifier0;
        }
        else if((v2 & 14) == 0) {
            modifier1 = modifier0;
            v4 = (composer1.changed(modifier1) ? 4 : 2) | v2;
        }
        else {
            modifier1 = modifier0;
            v4 = v2;
        }
        if((v2 & 0x70) == 0) {
            if((v3 & 2) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x20 : 16;
            }
            else {
                v5 = v;
                v6 = 16;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x380) == 0) {
            if((v3 & 4) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x100 : 0x80;
            }
            else {
                v7 = v1;
                v8 = 0x80;
            }
            v4 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            f1 = f;
        }
        else if((v2 & 0x1C00) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x800 : 0x400);
        }
        else {
            f1 = f;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            paddingValues1 = paddingValues0;
        }
        else if((0xE000 & v2) == 0) {
            paddingValues1 = paddingValues0;
            v4 |= (composer1.changed(paddingValues1) ? 0x4000 : 0x2000);
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((0x70000 & v2) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v4) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 1) == 0 ? modifier1 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                    v5 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composer1, 6));
                }
                if((v3 & 4) != 0) {
                    long v9 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 3 & 14);
                    v4 &= -897;
                    v7 = v9;
                }
                if((v3 & 8) != 0) {
                    f1 = 4.0f;
                }
                if((v3 & 16) == 0) {
                    f2 = f1;
                    paddingValues2 = paddingValues1;
                }
                else {
                    paddingValues2 = AppBarDefaults.INSTANCE.getContentPadding();
                    f2 = f1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                modifier2 = modifier1;
                f2 = f1;
                paddingValues2 = paddingValues1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1897058582, v4, -1, "androidx.compose.material.TopAppBar (AppBar.kt:274)");
            }
            AppBarKt.a(v5, v7, f2, paddingValues2, RectangleShapeKt.getRectangleShape(), AppBarKt.g, modifier2, function30, composer1, v4 >> 3 & 0x1C00 | (v4 >> 3 & 14 | 0x36000 | v4 >> 3 & 0x70 | v4 >> 3 & 0x380) | v4 << 18 & 0x380000 | v4 << 6 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
            paddingValues1 = paddingValues2;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k0(modifier1, v5, v7, f1, paddingValues1, function30, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TopAppBar-Rx1qByU(@NotNull Function2 function20, @NotNull WindowInsets windowInsets0, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function3 function30, long v, long v1, float f, @Nullable Composer composer0, int v2, int v3) {
        float f1;
        long v7;
        long v6;
        Function3 function32;
        Function2 function23;
        Modifier modifier2;
        float f2;
        long v8;
        long v5;
        Function3 function31;
        Function2 function22;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-763778507);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(windowInsets0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v2 & 0x380) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            function22 = function21;
        }
        else if((v2 & 0x1C00) == 0) {
            function22 = function21;
            v4 |= (composer1.changedInstance(function22) ? 0x800 : 0x400);
        }
        else {
            function22 = function21;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            function31 = function30;
        }
        else if((0xE000 & v2) == 0) {
            function31 = function30;
            v4 |= (composer1.changedInstance(function31) ? 0x4000 : 0x2000);
        }
        else {
            function31 = function30;
        }
        if((v2 & 0x70000) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(v) ? 0x10000 : 0x20000);
        }
        if((v2 & 0x380000) == 0) {
            v5 = v1;
            v4 |= ((v3 & 0x40) != 0 || !composer1.changed(v5) ? 0x80000 : 0x100000);
        }
        else {
            v5 = v1;
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v4 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x16DB6DB) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v3 & 8) != 0) {
                    function22 = null;
                }
                if((v3 & 16) != 0) {
                    function31 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-1$material_release();
                }
                if((v3 & 0x20) == 0) {
                    v8 = v;
                }
                else {
                    v4 &= 0xFFF8FFFF;
                    v8 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composer1, 6));
                }
                if((v3 & 0x40) != 0) {
                    v5 = ColorsKt.contentColorFor-ek8zF_U(v8, composer1, v4 >> 15 & 14);
                    v4 &= 0xFFC7FFFF;
                }
                f2 = (v3 & 0x80) == 0 ? f : 4.0f;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                v8 = v;
                f2 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-763778507, v4, -1, "androidx.compose.material.TopAppBar (AppBar.kt:93)");
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(composer1, 0x6E3FF187, true, new j0(function22, function20, function31));
            AppBarKt.a(v8, v5, f2, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), windowInsets0, modifier1, composableLambda0, composer1, v4 >> 15 & 0x380 | (v4 >> 15 & 14 | 0xC06C00 | v4 >> 15 & 0x70) | 0x70000 & v4 << 12 | v4 << 12 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier1;
            v7 = v8;
            function23 = function22;
            function32 = function31;
            v6 = v5;
            f1 = f2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            function23 = function22;
            function32 = function31;
            v6 = v5;
            v7 = v;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(function20, windowInsets0, modifier2, function23, function32, v7, v6, f1, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TopAppBar-afqeVBk(@NotNull WindowInsets windowInsets0, @Nullable Modifier modifier0, long v, long v1, float f, @Nullable PaddingValues paddingValues0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        PaddingValues paddingValues1;
        float f2;
        long v10;
        long v9;
        Modifier modifier2;
        PaddingValues paddingValues2;
        float f3;
        float f1;
        int v8;
        long v7;
        int v6;
        long v5;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x34AD2C8E);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(windowInsets0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v2 & 0x70) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 0x380) == 0) {
            if((v3 & 4) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x100 : 0x80;
            }
            else {
                v5 = v;
                v6 = 0x80;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x1C00) == 0) {
            if((v3 & 8) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x800 : 0x400;
            }
            else {
                v7 = v1;
                v8 = 0x400;
            }
            v4 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            f1 = f;
        }
        else if((0xE000 & v2) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        else {
            f1 = f;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.changed(paddingValues0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v3 & 4) != 0) {
                    v5 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composer1, 6));
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v7 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 6 & 14);
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    f1 = 4.0f;
                }
                if((v3 & 0x20) == 0) {
                    f3 = f1;
                    paddingValues2 = paddingValues0;
                }
                else {
                    paddingValues2 = AppBarDefaults.INSTANCE.getContentPadding();
                    f3 = f1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                f3 = f1;
                paddingValues2 = paddingValues0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x34AD2C8E, v4, -1, "androidx.compose.material.TopAppBar (AppBar.kt:227)");
            }
            AppBarKt.a(v5, v7, f3, paddingValues2, RectangleShapeKt.getRectangleShape(), windowInsets0, modifier1, function30, composer1, v4 >> 6 & 0x1C00 | (v4 >> 6 & 14 | 0x6000 | v4 >> 6 & 0x70 | v4 >> 6 & 0x380) | 0x70000 & v4 << 15 | v4 << 15 & 0x380000 | v4 << 3 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v9 = v5;
            f2 = f3;
            paddingValues1 = paddingValues2;
            modifier2 = modifier1;
            v10 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            v9 = v5;
            v10 = v7;
            f2 = f1;
            paddingValues1 = paddingValues0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c0(windowInsets0, modifier2, v9, v10, f2, paddingValues1, function30, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TopAppBar-xWeB9-s(@NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function3 function30, long v, long v1, float f, @Nullable Composer composer0, int v2, int v3) {
        long v10;
        long v9;
        float f1;
        Function3 function32;
        Function2 function23;
        Modifier modifier2;
        float f2;
        int v11;
        int v8;
        long v7;
        int v6;
        long v5;
        Function3 function31;
        Function2 function22;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x838F7DD5);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v2 & 0x70) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            function22 = function21;
        }
        else if((v2 & 0x380) == 0) {
            function22 = function21;
            v4 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        else {
            function22 = function21;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            function31 = function30;
        }
        else if((v2 & 0x1C00) == 0) {
            function31 = function30;
            v4 |= (composer1.changedInstance(function31) ? 0x800 : 0x400);
        }
        else {
            function31 = function30;
        }
        if((v2 & 0xE000) == 0) {
            if((v3 & 16) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x4000 : 0x2000;
            }
            else {
                v5 = v;
                v6 = 0x2000;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x70000) == 0) {
            if((v3 & 0x20) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x20000 : 0x10000;
            }
            else {
                v7 = v1;
                v8 = 0x10000;
            }
            v4 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.changed(f) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v3 & 4) != 0) {
                    function22 = null;
                }
                if((v3 & 8) != 0) {
                    function31 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-2$material_release();
                }
                if((v3 & 16) != 0) {
                    v5 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composer1, 6));
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v7 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 12 & 14);
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) == 0) {
                    v11 = v4;
                    f2 = f;
                }
                else {
                    f2 = 4.0f;
                    v11 = v4;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                v11 = v4;
                f2 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x838F7DD5, v11, -1, "androidx.compose.material.TopAppBar (AppBar.kt:175)");
            }
            AppBarKt.TopAppBar-Rx1qByU(function20, AppBarKt.g, modifier1, function22, function31, v5, v7, f2, composer1, v11 & 14 | 0x30 | v11 << 3 & 0x380 | v11 << 3 & 0x1C00 | 0xE000 & v11 << 3 | 0x70000 & v11 << 3 | v11 << 3 & 0x380000 | v11 << 3 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function32 = function31;
            f1 = f2;
            modifier2 = modifier1;
            v9 = v5;
            function23 = function22;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            function23 = function22;
            function32 = function31;
            f1 = f;
            v9 = v5;
        }
        v10 = v7;
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(function20, modifier2, function23, function32, v9, v10, f1, v2, v3));
        }
    }

    public static final void a(long v, long v1, float f, PaddingValues paddingValues0, Shape shape0, WindowInsets windowInsets0, Modifier modifier0, Function3 function30, Composer composer0, int v2, int v3) {
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xD58806DE);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(paddingValues0) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v4 |= (composer1.changed(shape0) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.changed(windowInsets0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((0x1C00000 & v2) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v4) != 4793490 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 0x40) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD58806DE, v4, -1, "androidx.compose.material.AppBar (AppBar.kt:719)");
            }
            SurfaceKt.Surface-F-jzlyU(modifier2, shape0, v, v1, null, f, ComposableLambdaKt.composableLambda(composer1, 0xCB64A1A, true, new y(windowInsets0, paddingValues0, 4, function30)), composer1, v4 >> 18 & 14 | 0x180000 | v4 >> 9 & 0x70 | v4 << 6 & 0x380 | v4 << 6 & 0x1C00 | v4 << 9 & 0x70000, 16);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(v, v1, f, paddingValues0, shape0, windowInsets0, modifier1, function30, v2, v3));
        }
    }

    public static final float access$getAppBarHorizontalPadding$p() [...] // 潜在的解密器

    public static final float access$getBottomAppBarCutoutOffset$p() [...] // 潜在的解密器

    public static final float access$getBottomAppBarRoundedEdgeRadius$p() [...] // 潜在的解密器

    public static final float calculateCutoutCircleYIntercept(float f, float f1) {
        return -((float)Math.sqrt(f * f - f1 * f1));
    }

    @NotNull
    public static final Pair calculateRoundedEdgeIntercept(float f, float f1, float f2) {
        Float float3;
        Float float2;
        Pair pair0;
        Float float1;
        Float float0;
        float f3 = f1 * f1;
        float f4 = f2 * f2;
        float f5 = f * f + f3;
        float f6 = f * f4;
        double f7 = (double)((f5 - f4) * (f3 * f4));
        float f8 = (f6 - ((float)Math.sqrt(f7))) / f5;
        float f9 = (f6 + ((float)Math.sqrt(f7))) / f5;
        float f10 = (float)Math.sqrt(f4 - f8 * f8);
        float f11 = (float)Math.sqrt(f4 - f9 * f9);
        if(f1 > 0.0f) {
            if(f10 > f11) {
                float0 = f8;
                float1 = f10;
            }
            else {
                float0 = f9;
                float1 = f11;
            }
            pair0 = TuplesKt.to(float0, float1);
        }
        else {
            if(f10 < f11) {
                float2 = f8;
                float3 = f10;
            }
            else {
                float2 = f9;
                float3 = f11;
            }
            pair0 = TuplesKt.to(float2, float3);
        }
        float f12 = ((Number)pair0.component1()).floatValue();
        float f13 = ((Number)pair0.component2()).floatValue();
        if(f12 < f) {
            f13 = -f13;
        }
        return TuplesKt.to(f12, f13);
    }
}

