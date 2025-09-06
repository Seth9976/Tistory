package androidx.compose.material;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.foundation.text.selection.s;
import androidx.compose.material3.m2;
import androidx.compose.material3.zj;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.b;
import p0.e9;
import p0.f9;
import p0.g9;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001Ax\u0010\u0012\u001A\u00020\u00032\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0015\b\u0002\u0010\u0005\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\n2\b\b\u0002\u0010\u000E\u001A\u00020\r2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001A`\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\n2\b\b\u0002\u0010\u0015\u001A\u00020\n2\b\b\u0002\u0010\u000E\u001A\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "action", "", "actionOnNewLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "content", "Snackbar-7zSek6w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Snackbar", "Landroidx/compose/material/SnackbarData;", "snackbarData", "actionColor", "Snackbar-sPrSdHI", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,366:1\n154#2:367\n154#2:368\n154#2:369\n154#2:683\n154#2:684\n154#2:685\n154#2:686\n154#2:687\n154#2:688\n154#2:689\n154#2:690\n154#2:691\n76#3,14:370\n79#3,11:407\n92#3:439\n92#3:444\n79#3,11:451\n79#3,11:486\n92#3:518\n79#3,11:526\n92#3:558\n92#3:563\n79#3,11:571\n79#3,11:605\n92#3:637\n79#3,11:645\n92#3:677\n92#3:682\n456#4,8:384\n464#4,3:398\n456#4,8:418\n464#4,3:432\n467#4,3:436\n467#4,3:441\n456#4,8:462\n464#4,3:476\n456#4,8:497\n464#4,3:511\n467#4,3:515\n456#4,8:537\n464#4,3:551\n467#4,3:555\n467#4,3:560\n456#4,8:582\n464#4,3:596\n456#4,8:616\n464#4,3:630\n467#4,3:634\n456#4,8:656\n464#4,3:670\n467#4,3:674\n467#4,3:679\n3737#5,6:392\n3737#5,6:426\n3737#5,6:470\n3737#5,6:505\n3737#5,6:545\n3737#5,6:590\n3737#5,6:624\n3737#5,6:664\n68#6,6:401\n74#6:435\n78#6:440\n68#6,6:480\n74#6:514\n78#6:519\n68#6,6:520\n74#6:554\n78#6:559\n68#6,6:599\n74#6:633\n78#6:638\n68#6,6:639\n74#6:673\n78#6:678\n74#7,6:445\n80#7:479\n84#7:564\n1116#8,6:565\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n*L\n89#1:367\n161#1:368\n176#1:369\n357#1:683\n358#1:684\n359#1:685\n360#1:686\n361#1:687\n362#1:688\n363#1:689\n364#1:690\n365#1:691\n238#1:370,14\n239#1:407,11\n239#1:439\n238#1:444\n276#1:451,11\n284#1:486,11\n284#1:518\n288#1:526,11\n288#1:558\n276#1:563\n299#1:571,11\n301#1:605,11\n301#1:637\n302#1:645,11\n302#1:677\n299#1:682\n238#1:384,8\n238#1:398,3\n239#1:418,8\n239#1:432,3\n239#1:436,3\n238#1:441,3\n276#1:462,8\n276#1:476,3\n284#1:497,8\n284#1:511,3\n284#1:515,3\n288#1:537,8\n288#1:551,3\n288#1:555,3\n276#1:560,3\n299#1:582,8\n299#1:596,3\n301#1:616,8\n301#1:630,3\n301#1:634,3\n302#1:656,8\n302#1:670,3\n302#1:674,3\n299#1:679,3\n238#1:392,6\n239#1:426,6\n276#1:470,6\n284#1:505,6\n288#1:545,6\n299#1:590,6\n301#1:624,6\n302#1:664,6\n239#1:401,6\n239#1:435\n239#1:440\n284#1:480,6\n284#1:514\n284#1:519\n288#1:520,6\n288#1:554\n288#1:559\n301#1:599,6\n301#1:633\n301#1:638\n302#1:639,6\n302#1:673\n302#1:678\n276#1:445,6\n276#1:479\n276#1:564\n308#1:565,6\n*E\n"})
public final class SnackbarKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;

    static {
        SnackbarKt.a = 30.0f;
        SnackbarKt.b = 16.0f;
        SnackbarKt.c = 8.0f;
        SnackbarKt.d = 2.0f;
        SnackbarKt.e = 6.0f;
        SnackbarKt.f = 8.0f;
        SnackbarKt.g = 12.0f;
        SnackbarKt.h = 48.0f;
        SnackbarKt.i = 68.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Snackbar-7zSek6w(@Nullable Modifier modifier0, @Nullable Function2 function20, boolean z, @Nullable Shape shape0, long v, long v1, float f, @NotNull Function2 function21, @Nullable Composer composer0, int v2, int v3) {
        float f1;
        long v8;
        Shape shape1;
        boolean z1;
        Modifier modifier1;
        float f2;
        Shape shape2;
        boolean z2;
        Modifier modifier2;
        long v7;
        int v6;
        long v5;
        Function2 function22;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-558258760);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            function22 = function20;
        }
        else if((v2 & 0x70) == 0) {
            function22 = function20;
            v4 |= (composer1.changedInstance(function22) ? 0x20 : 16);
        }
        else {
            function22 = function20;
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v4 |= ((v3 & 8) != 0 || !composer1.changed(shape0) ? 0x400 : 0x800);
        }
        if((0xE000 & v2) == 0) {
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
            v7 = v1;
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(v7) ? 0x10000 : 0x20000);
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
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((0x1C00000 & v2) == 0) {
            v4 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v4) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    function22 = null;
                }
                z2 = (v3 & 4) == 0 ? z : false;
                if((v3 & 8) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getSmall();
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v5 = SnackbarDefaults.INSTANCE.getBackgroundColor(composer1, 6);
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v7 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                    v4 &= 0xFFF8FFFF;
                }
                f2 = (v3 & 0x40) == 0 ? f : 6.0f;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                z2 = z;
                shape2 = shape0;
                f2 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-558258760, v4, -1, "androidx.compose.material.Snackbar (Snackbar.kt:90)");
            }
            SurfaceKt.Surface-F-jzlyU(modifier2, shape2, v5, v7, null, f2, ComposableLambdaKt.composableLambda(composer1, -2084221700, true, new e9(function22, function21, z2, 2)), composer1, v4 & 14 | 0x180000 | v4 >> 6 & 0x70 | v4 >> 6 & 0x380 | v4 >> 6 & 0x1C00 | v4 >> 3 & 0x70000, 16);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape1 = shape2;
            z1 = z2;
            modifier1 = modifier2;
            f1 = f2;
            v8 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            shape1 = shape0;
            v8 = v7;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f9(modifier1, function22, z1, shape1, v5, v8, f1, function21, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Snackbar-sPrSdHI(@NotNull SnackbarData snackbarData0, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, long v, long v1, long v2, float f, @Nullable Composer composer0, int v3, int v4) {
        long v10;
        long v9;
        long v8;
        Shape shape1;
        boolean z1;
        float f1;
        Modifier modifier1;
        float f2;
        Modifier modifier2;
        long v12;
        long v11;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xF6AD9CE);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.changed(snackbarData0) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v5 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v3 & 0x1C00) == 0) {
            v5 |= ((v4 & 8) != 0 || !composer1.changed(shape0) ? 0x400 : 0x800);
        }
        if((v3 & 0xE000) == 0) {
            v5 |= ((v4 & 16) != 0 || !composer1.changed(v) ? 0x2000 : 0x4000);
        }
        if((v3 & 0x70000) == 0) {
            if((v4 & 0x20) == 0) {
                v6 = v1;
                v7 = composer1.changed(v6) ? 0x20000 : 0x10000;
            }
            else {
                v6 = v1;
                v7 = 0x10000;
            }
            v5 |= v7;
        }
        else {
            v6 = v1;
        }
        if((v3 & 0x380000) == 0) {
            v5 |= ((v4 & 0x40) != 0 || !composer1.changed(v2) ? 0x80000 : 0x100000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0x1C00000) == 0) {
            v5 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((v5 & 0x16DB6DB) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                z1 = (v4 & 4) == 0 ? z : false;
                if((v4 & 8) == 0) {
                    shape1 = shape0;
                }
                else {
                    shape1 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getSmall();
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) == 0) {
                    v11 = v;
                }
                else {
                    v11 = SnackbarDefaults.INSTANCE.getBackgroundColor(composer1, 6);
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x20) != 0) {
                    v6 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                    v5 &= 0xFFF8FFFF;
                }
                if((v4 & 0x40) == 0) {
                    v12 = v2;
                }
                else {
                    v12 = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composer1, 6);
                    v5 &= 0xFFC7FFFF;
                }
                f2 = (v4 & 0x80) == 0 ? f : 6.0f;
                v8 = v12;
                v9 = v6;
                v10 = v11;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x20) != 0) {
                    v5 &= 0xFFF8FFFF;
                }
                if((v4 & 0x40) != 0) {
                    v5 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                f2 = f;
                z1 = z;
                shape1 = shape0;
                v8 = v2;
                v9 = v6;
                v10 = v;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF6AD9CE, v5, -1, "androidx.compose.material.Snackbar (Snackbar.kt:161)");
            }
            String s = snackbarData0.getActionLabel();
            ComposableLambda composableLambda0 = s == null ? null : ComposableLambdaKt.composableLambda(composer1, 0x6DE142B0, true, new m2(v8, snackbarData0, s, 2));
            SnackbarKt.Snackbar-7zSek6w(PaddingKt.padding-3ABfNKs(modifier2, 12.0f), composableLambda0, z1, shape1, v10, v9, f2, ComposableLambdaKt.composableLambda(composer1, 0xF0648CE7, true, new b1(snackbarData0, 13)), composer1, v5 & 0x380 | 0xC00000 | v5 & 0x1C00 | 0xE000 & v5 | 0x70000 & v5 | v5 >> 3 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            f1 = f2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            f1 = f;
            z1 = z;
            shape1 = shape0;
            v8 = v2;
            v9 = v6;
            v10 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g9(snackbarData0, modifier1, z1, shape1, v10, v9, v8, f1, v3, v4));
        }
    }

    public static final void access$NewLineButtonSnackbar(Function2 function20, Function2 function21, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1229075900);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229075900, v1, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:274)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
            float f = SnackbarKt.c;
            Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(modifier0, SnackbarKt.b, 0.0f, f, SnackbarKt.d, 2, null);
            composer1.startReplaceableGroup(0xE32F0E82);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer1, 0);
            composer1.startReplaceableGroup(-1323940314);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier1);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function22);
            }
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
            Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(AlignmentLineKt.paddingFromBaseline-VpY3zN4(modifier$Companion0, SnackbarKt.a, SnackbarKt.g), 0.0f, 0.0f, f, 0.0f, 11, null);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy1 = r0.a.i(alignment$Companion0, false, composer1, 0, -1323940314);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.modifierMaterializerOf(modifier2);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function23);
            }
            r0.a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function20.invoke(composer1, ((int)(v1 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            Modifier modifier3 = columnScopeInstance0.align(modifier$Companion0, alignment$Companion0.getEnd());
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy2 = r0.a.i(alignment$Companion0, false, composer1, 0, -1323940314);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            Function3 function32 = LayoutKt.modifierMaterializerOf(modifier3);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function24);
            }
            r0.a.w(0, function32, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function21.invoke(composer1, ((int)(v1 >> 3 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new zj(function20, function21, v, 2));
        }
    }

    public static final void access$OneRowSnackbar(Function2 function20, Function2 function21, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xE01F65EE);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE01F65EE, v1, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:295)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, SnackbarKt.b, 0.0f, SnackbarKt.c, 0.0f, 10, null);
            composer1.startReplaceableGroup(0x9AE2BF4D);
            boolean z = composer1.changed("action");
            boolean z1 = composer1.changed("text");
            b b0 = composer1.rememberedValue();
            if(z || z1 || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(3);
                composer1.updateRememberedValue(b0);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(-1323940314);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier0);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, b0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function22);
            }
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            Modifier modifier1 = PaddingKt.padding-VpY3zN4$default(LayoutIdKt.layoutId(modifier$Companion0, "text"), 0.0f, SnackbarKt.e, 1, null);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = r0.a.i(alignment$Companion0, false, composer1, 0, -1323940314);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.modifierMaterializerOf(modifier1);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function23);
            }
            r0.a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function20.invoke(composer1, ((int)(v1 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            Modifier modifier2 = LayoutIdKt.layoutId(modifier$Companion0, "action");
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy1 = r0.a.i(alignment$Companion0, false, composer1, 0, -1323940314);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            Function3 function32 = LayoutKt.modifierMaterializerOf(modifier2);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function24);
            }
            r0.a.w(0, function32, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function21.invoke(composer1, ((int)(v1 >> 3 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new zj(function20, function21, v, 3));
        }
    }

    public static final void access$TextOnlySnackbar(Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x36AE61C7);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x36AE61C7, v1, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:236)");
            }
            b b0 = b.d;
            composer1.startReplaceableGroup(-1323940314);
            Companion modifier$Companion0 = Modifier.Companion;
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier$Companion0);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Updater.set-impl(composer1, b0, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Function2 function21 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function21);
            }
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            Modifier modifier0 = PaddingKt.padding-VpY3zN4(modifier$Companion0, SnackbarKt.b, SnackbarKt.e);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = r0.a.i(Alignment.Companion, false, composer1, 0, -1323940314);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.modifierMaterializerOf(modifier0);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function22);
            }
            r0.a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function20.invoke(composer1, ((int)(v1 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(v, 5, function20));
        }
    }

    public static final float access$getHeightToFirstLine$p() [...] // 潜在的解密器

    public static final float access$getSnackbarMinHeightOneLine$p() [...] // 潜在的解密器

    public static final float access$getSnackbarMinHeightTwoLines$p() [...] // 潜在的解密器

    public static final float access$getTextEndExtraSpacing$p() [...] // 潜在的解密器
}

