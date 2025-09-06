package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0099\u0001\u0010\u0013\u001A\u00020\u00032\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0015\b\u0002\u0010\u0005\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0006\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u000B2\b\b\u0002\u0010\u000F\u001A\u00020\u000B2\u0011\u0010\u0010\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001Aj\u0010\u0013\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u0016\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u000B2\b\b\u0002\u0010\u000F\u001A\u00020\u000BH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "action", "dismissAction", "", "actionOnNewLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "actionContentColor", "dismissActionContentColor", "content", "Snackbar-eQBnUkQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Snackbar", "Landroidx/compose/material3/SnackbarData;", "snackbarData", "actionColor", "Snackbar-sDKtq54", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,450:1\n148#2:451\n148#2:528\n148#2:614\n148#2:772\n148#2:773\n148#2:774\n148#2:775\n148#2:776\n148#2:777\n148#2:778\n148#2:779\n85#3:452\n82#3,6:453\n88#3:487\n92#3:613\n78#4,6:459\n85#4,4:474\n89#4,2:484\n78#4,6:495\n85#4,4:510\n89#4,2:520\n93#4:526\n78#4,6:536\n85#4,4:551\n89#4,2:561\n78#4,6:573\n85#4,4:588\n89#4,2:598\n93#4:604\n93#4:608\n93#4:612\n78#4,6:621\n85#4,4:636\n89#4,2:646\n78#4,6:656\n85#4,4:671\n89#4,2:681\n93#4:687\n78#4,6:696\n85#4,4:711\n89#4,2:721\n93#4:727\n78#4,6:736\n85#4,4:751\n89#4,2:761\n93#4:767\n93#4:771\n368#5,9:465\n377#5:486\n368#5,9:501\n377#5:522\n378#5,2:524\n368#5,9:542\n377#5:563\n368#5,9:579\n377#5:600\n378#5,2:602\n378#5,2:606\n378#5,2:610\n368#5,9:627\n377#5:648\n368#5,9:662\n377#5:683\n378#5,2:685\n368#5,9:702\n377#5:723\n378#5,2:725\n368#5,9:742\n377#5:763\n378#5,2:765\n378#5,2:769\n4032#6,6:478\n4032#6,6:514\n4032#6,6:555\n4032#6,6:592\n4032#6,6:640\n4032#6,6:675\n4032#6,6:715\n4032#6,6:755\n71#7:488\n68#7,6:489\n74#7:523\n78#7:527\n71#7:529\n68#7,6:530\n74#7:564\n78#7:609\n71#7:649\n68#7,6:650\n74#7:684\n78#7:688\n71#7:689\n68#7,6:690\n74#7:724\n78#7:728\n71#7:729\n68#7,6:730\n74#7:764\n78#7:768\n98#8:565\n94#8,7:566\n101#8:601\n105#8:605\n1223#9,6:615\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n*L\n243#1:451\n282#1:528\n337#1:614\n442#1:772\n443#1:773\n444#1:774\n445#1:775\n446#1:776\n447#1:777\n448#1:778\n449#1:779\n265#1:452\n265#1:453,6\n265#1:487\n265#1:613\n265#1:459,6\n265#1:474,4\n265#1:484,2\n273#1:495,6\n273#1:510,4\n273#1:520,2\n273#1:526\n280#1:536,6\n280#1:551,4\n280#1:561,2\n284#1:573,6\n284#1:588,4\n284#1:598,2\n284#1:604\n280#1:608\n265#1:612\n313#1:621,6\n313#1:636,4\n313#1:646,2\n315#1:656,6\n315#1:671,4\n315#1:681,2\n315#1:687\n317#1:696,6\n317#1:711,4\n317#1:721,2\n317#1:727\n326#1:736,6\n326#1:751,4\n326#1:761,2\n326#1:767\n313#1:771\n265#1:465,9\n265#1:486\n273#1:501,9\n273#1:522\n273#1:524,2\n280#1:542,9\n280#1:563\n284#1:579,9\n284#1:600\n284#1:602,2\n280#1:606,2\n265#1:610,2\n313#1:627,9\n313#1:648\n315#1:662,9\n315#1:683\n315#1:685,2\n317#1:702,9\n317#1:723\n317#1:725,2\n326#1:742,9\n326#1:763\n326#1:765,2\n313#1:769,2\n265#1:478,6\n273#1:514,6\n280#1:555,6\n284#1:592,6\n313#1:640,6\n315#1:675,6\n317#1:715,6\n326#1:755,6\n273#1:488\n273#1:489,6\n273#1:523\n273#1:527\n280#1:529\n280#1:530,6\n280#1:564\n280#1:609\n315#1:649\n315#1:650,6\n315#1:684\n315#1:688\n317#1:689\n317#1:690,6\n317#1:724\n317#1:728\n326#1:729\n326#1:730,6\n326#1:764\n326#1:768\n284#1:565\n284#1:566,7\n284#1:601\n284#1:605\n339#1:615,6\n*E\n"})
public final class SnackbarKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;

    static {
        SnackbarKt.a = 600.0f;
        SnackbarKt.b = 30.0f;
        SnackbarKt.c = 16.0f;
        SnackbarKt.d = 8.0f;
        SnackbarKt.e = 2.0f;
        SnackbarKt.f = 6.0f;
        SnackbarKt.g = 8.0f;
        SnackbarKt.h = 12.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Snackbar-eQBnUkQ(@Nullable Modifier modifier0, @Nullable Function2 function20, @Nullable Function2 function21, boolean z, @Nullable Shape shape0, long v, long v1, long v2, long v3, @NotNull Function2 function22, @Nullable Composer composer0, int v4, int v5) {
        long v12;
        long v11;
        long v10;
        Function2 function24;
        Shape shape1;
        boolean z1;
        Modifier modifier1;
        Function2 function25;
        long v14;
        long v13;
        Shape shape2;
        boolean z2;
        Modifier modifier2;
        long v9;
        int v8;
        long v7;
        Function2 function23;
        int v6;
        Composer composer1 = composer0.startRestartGroup(0xB6575B65);
        if((v5 & 1) == 0) {
            v6 = (v4 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v4 : v4;
        }
        else {
            v6 = v4 | 6;
        }
        if((v5 & 2) != 0) {
            v6 |= 0x30;
            function23 = function20;
        }
        else if((v4 & 0x30) == 0) {
            function23 = function20;
            v6 |= (composer1.changedInstance(function23) ? 0x20 : 16);
        }
        else {
            function23 = function20;
        }
        if((v5 & 4) != 0) {
            v6 |= 0x180;
        }
        else if((v4 & 0x180) == 0) {
            v6 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v5 & 8) != 0) {
            v6 |= 0xC00;
        }
        else if((v4 & 0xC00) == 0) {
            v6 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v4 & 0x6000) == 0) {
            v6 |= ((v5 & 16) != 0 || !composer1.changed(shape0) ? 0x2000 : 0x4000);
        }
        if((0x30000 & v4) == 0) {
            if((v5 & 0x20) == 0) {
                v7 = v;
                v8 = composer1.changed(v7) ? 0x20000 : 0x10000;
            }
            else {
                v7 = v;
                v8 = 0x10000;
            }
            v6 |= v8;
        }
        else {
            v7 = v;
        }
        if((v4 & 0x180000) == 0) {
            v6 |= ((v5 & 0x40) != 0 || !composer1.changed(v1) ? 0x80000 : 0x100000);
        }
        if((v4 & 0xC00000) == 0) {
            v6 |= ((v5 & 0x80) != 0 || !composer1.changed(v2) ? 0x400000 : 0x800000);
        }
        if((0x6000000 & v4) == 0) {
            v9 = v3;
            v6 |= ((v5 & 0x100) != 0 || !composer1.changed(v9) ? 0x2000000 : 0x4000000);
        }
        else {
            v9 = v3;
        }
        if((v5 & 0x200) != 0) {
            v6 |= 0x30000000;
        }
        else if((v4 & 0x30000000) == 0) {
            v6 |= (composer1.changedInstance(function22) ? 0x20000000 : 0x10000000);
        }
        if((v6 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v4 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v5 & 1) == 0 ? modifier0 : Modifier.Companion;
                function25 = null;
                if((v5 & 2) != 0) {
                    function23 = null;
                }
                if((v5 & 4) == 0) {
                    function25 = function21;
                }
                z2 = (v5 & 8) == 0 ? z : false;
                if((v5 & 16) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = SnackbarDefaults.INSTANCE.getShape(composer1, 6);
                    v6 &= 0xFFFF1FFF;
                }
                if((v5 & 0x20) != 0) {
                    v7 = SnackbarDefaults.INSTANCE.getColor(composer1, 6);
                    v6 &= 0xFFF8FFFF;
                }
                if((v5 & 0x40) == 0) {
                    v13 = v1;
                }
                else {
                    v13 = SnackbarDefaults.INSTANCE.getContentColor(composer1, 6);
                    v6 &= 0xFFC7FFFF;
                }
                if((v5 & 0x80) == 0) {
                    v14 = v2;
                }
                else {
                    v14 = SnackbarDefaults.INSTANCE.getActionContentColor(composer1, 6);
                    v6 &= 0xFE3FFFFF;
                }
                if((v5 & 0x100) != 0) {
                    v6 &= 0xF1FFFFFF;
                    v9 = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composer1, 6);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v5 & 16) != 0) {
                    v6 &= 0xFFFF1FFF;
                }
                if((v5 & 0x20) != 0) {
                    v6 &= 0xFFF8FFFF;
                }
                if((v5 & 0x40) != 0) {
                    v6 &= 0xFFC7FFFF;
                }
                if((v5 & 0x80) != 0) {
                    v6 &= 0xFE3FFFFF;
                }
                if((v5 & 0x100) != 0) {
                    v6 &= 0xF1FFFFFF;
                }
                modifier2 = modifier0;
                z2 = z;
                shape2 = shape0;
                v13 = v1;
                v14 = v2;
                function25 = function21;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB6575B65, v6, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:113)");
            }
            SurfaceKt.Surface-T9BRK9s(modifier2, shape2, v7, v13, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(0x92F18D2A, true, new fm(z2, function23, function22, function25, v14, v9), composer1, 54), composer1, v6 >> 9 & 0x1C00 | (v6 & 14 | 0xC30000 | v6 >> 9 & 0x70 | v6 >> 9 & 0x380), 80);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function24 = function25;
            modifier1 = modifier2;
            shape1 = shape2;
            z1 = z2;
            v11 = v13;
            v10 = v9;
            v12 = v14;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            shape1 = shape0;
            function24 = function21;
            v10 = v9;
            v11 = v1;
            v12 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gm(modifier1, function23, function24, z1, shape1, v7, v11, v12, v10, function22, v4, v5));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Snackbar-sDKtq54(@NotNull SnackbarData snackbarData0, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, long v, long v1, long v2, long v3, long v4, @Nullable Composer composer0, int v5, int v6) {
        long v16;
        long v15;
        Shape shape1;
        boolean z1;
        long v14;
        long v13;
        long v12;
        ComposableLambda composableLambda0;
        long v19;
        long v17;
        Shape shape2;
        boolean z2;
        Modifier modifier2;
        long v18;
        int v11;
        long v10;
        int v9;
        long v8;
        Modifier modifier1;
        int v7;
        Composer composer1 = composer0.startRestartGroup(0x105E641F);
        if((v6 & 1) == 0) {
            v7 = (v5 & 6) == 0 ? (composer1.changed(snackbarData0) ? 4 : 2) | v5 : v5;
        }
        else {
            v7 = v5 | 6;
        }
        if((v6 & 2) != 0) {
            v7 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v5 & 0x30) == 0) {
            modifier1 = modifier0;
            v7 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v6 & 4) != 0) {
            v7 |= 0x180;
        }
        else if((v5 & 0x180) == 0) {
            v7 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v5 & 0xC00) == 0) {
            v7 |= ((v6 & 8) != 0 || !composer1.changed(shape0) ? 0x400 : 0x800);
        }
        if((v5 & 0x6000) == 0) {
            if((v6 & 16) == 0) {
                v8 = v;
                v9 = composer1.changed(v8) ? 0x4000 : 0x2000;
            }
            else {
                v8 = v;
                v9 = 0x2000;
            }
            v7 |= v9;
        }
        else {
            v8 = v;
        }
        if((0x30000 & v5) == 0) {
            if((v6 & 0x20) == 0) {
                v10 = v1;
                v11 = composer1.changed(v10) ? 0x20000 : 0x10000;
            }
            else {
                v10 = v1;
                v11 = 0x10000;
            }
            v7 |= v11;
        }
        else {
            v10 = v1;
        }
        if((0x180000 & v5) == 0) {
            v7 |= ((v6 & 0x40) != 0 || !composer1.changed(v2) ? 0x80000 : 0x100000);
        }
        if((v5 & 0xC00000) == 0) {
            v7 |= ((v6 & 0x80) != 0 || !composer1.changed(v3) ? 0x400000 : 0x800000);
        }
        if((0x6000000 & v5) == 0) {
            v7 |= ((v6 & 0x100) != 0 || !composer1.changed(v4) ? 0x2000000 : 0x4000000);
        }
        if((0x2492493 & v7) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v5 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v6 & 2) == 0 ? modifier1 : Modifier.Companion;
                z2 = (v6 & 4) == 0 ? z : false;
                if((v6 & 8) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = SnackbarDefaults.INSTANCE.getShape(composer1, 6);
                    v7 &= 0xFFFFE3FF;
                }
                if((v6 & 16) == 0) {
                    v15 = v8;
                }
                else {
                    v15 = SnackbarDefaults.INSTANCE.getColor(composer1, 6);
                    v7 &= 0xFFFF1FFF;
                }
                if((v6 & 0x20) == 0) {
                    v16 = v10;
                }
                else {
                    v16 = SnackbarDefaults.INSTANCE.getContentColor(composer1, 6);
                    v7 &= 0xFFF8FFFF;
                }
                if((v6 & 0x40) == 0) {
                    v17 = v2;
                }
                else {
                    v17 = SnackbarDefaults.INSTANCE.getActionColor(composer1, 6);
                    v7 &= 0xFFC7FFFF;
                }
                if((v6 & 0x80) == 0) {
                    v18 = v3;
                }
                else {
                    v18 = SnackbarDefaults.INSTANCE.getActionContentColor(composer1, 6);
                    v7 &= 0xFE3FFFFF;
                }
                if((v6 & 0x100) == 0) {
                    v14 = v4;
                    v13 = v18;
                }
                else {
                    v7 &= 0xF1FFFFFF;
                    v13 = v18;
                    v14 = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composer1, 6);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v6 & 8) != 0) {
                    v7 &= 0xFFFFE3FF;
                }
                if((v6 & 16) != 0) {
                    v7 &= 0xFFFF1FFF;
                }
                if((v6 & 0x20) != 0) {
                    v7 &= 0xFFF8FFFF;
                }
                if((v6 & 0x40) != 0) {
                    v7 &= 0xFFC7FFFF;
                }
                if((v6 & 0x80) != 0) {
                    v7 &= 0xFE3FFFFF;
                }
                if((v6 & 0x100) != 0) {
                    v7 &= 0xF1FFFFFF;
                }
                v13 = v3;
                v14 = v4;
                modifier2 = modifier1;
                z2 = z;
                shape2 = shape0;
                v15 = v8;
                v16 = v10;
                v17 = v2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x105E641F, v7, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:211)");
            }
            String s = snackbarData0.getVisuals().getActionLabel();
            composer1.startReplaceGroup(0x5D103B12);
            if(s == null) {
                v19 = v17;
                composableLambda0 = null;
            }
            else {
                v19 = v17;
                composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xADD89A81, true, new m2(v17, snackbarData0, s, 1), composer1, 54);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x5D107184);
            ComposableLambda composableLambda1 = snackbarData0.getVisuals().getWithDismissAction() ? ComposableLambdaKt.rememberComposableLambda(0x93F5674F, true, new hm(snackbarData0, 1), composer1, 54) : null;
            composer1.endReplaceGroup();
            SnackbarKt.Snackbar-eQBnUkQ(PaddingKt.padding-3ABfNKs(modifier2, 12.0f), composableLambda0, composableLambda1, z2, shape2, v15, v16, v13, v14, ComposableLambdaKt.rememberComposableLambda(0xB4846F7A, true, new hm(snackbarData0, 0), composer1, 54), composer1, v7 << 3 & 0x380000 | (v7 << 3 & 0x1C00 | 0x30000000 | 0xE000 & v7 << 3 | 0x70000 & v7 << 3) | 0x1C00000 & v7 | v7 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v12 = v19;
            z1 = z2;
            shape1 = shape2;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            v12 = v2;
            v13 = v3;
            v14 = v4;
            z1 = z;
            shape1 = shape0;
            v15 = v8;
            v16 = v10;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new im(snackbarData0, modifier1, z1, shape1, v15, v16, v12, v13, v14, v5, v6));
        }
    }

    public static final void access$NewLineButtonSnackbar-kKq0p4A(Function2 function20, Function2 function21, Function2 function22, TextStyle textStyle0, long v, long v1, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(0xB093B6D7);
        int v3 = (v2 & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (composer1.changed(textStyle0) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v3 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v3 |= (composer1.changed(v1) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB093B6D7, v3, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:263)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.widthIn-VpY3zN4$default(modifier$Companion0, 0.0f, SnackbarKt.a, 1, null), 0.0f, 1, null), SnackbarKt.c, 0.0f, 0.0f, SnackbarKt.e, 6, null);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function23);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
            Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(AlignmentLineKt.paddingFromBaseline-VpY3zN4(modifier$Companion0, SnackbarKt.b, SnackbarKt.h), 0.0f, 0.0f, SnackbarKt.d, 0.0f, 11, null);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            float f = SnackbarKt.d;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
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
            Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function24);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v3 & 14)));
            composer1.endNode();
            Modifier modifier4 = PaddingKt.padding-qDBjuR0$default(columnScopeInstance0.align(modifier$Companion0, alignment$Companion0.getEnd()), 0.0f, 0.0f, (function22 == null ? f : 0.0f), 0.0f, 11, null);
            MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            Function0 function02 = composeUiNode$Companion0.getConstructor();
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
            Function2 function25 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                a.t(v6, composer1, v6, function25);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            MeasurePolicy measurePolicy3 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function26 = a.r(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap3);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                a.t(v7, composer1, v7, function26);
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(v)), TextKt.getLocalTextStyle().provides(textStyle0)}, function21, composer1, v3 & 0x70 | ProvidedValue.$stable);
            composer1.startReplaceGroup(0x24DF22F5);
            if(function22 != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(v1)), function22, composer1, 8 | v3 >> 3 & 0x70);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new cm(function20, function21, function22, textStyle0, v, v1, v2, 0));
        }
    }

    public static final void access$OneRowSnackbar-kKq0p4A(Function2 function20, Function2 function21, Function2 function22, TextStyle textStyle0, long v, long v1, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(-903235475);
        int v3 = (v2 & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (composer1.changed(textStyle0) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v3 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v3 |= (composer1.changed(v1) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903235475, v3, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:308)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, SnackbarKt.c, 0.0f, (function22 == null ? SnackbarKt.d : 0.0f), 0.0f, 10, null);
            s3 s30 = composer1.rememberedValue();
            if(s30 == Composer.Companion.getEmpty()) {
                s30 = new s3(3);
                composer1.updateRememberedValue(s30);
            }
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, s30, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function23);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Modifier modifier2 = PaddingKt.padding-VpY3zN4$default(LayoutIdKt.layoutId(modifier$Companion0, "text"), 0.0f, SnackbarKt.f, 1, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Function0 function01 = composeUiNode$Companion0.getConstructor();
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
            Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function24);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v3 & 14)));
            composer1.endNode();
            composer1.startReplaceGroup(-904778058);
            if(function21 != null) {
                Modifier modifier4 = LayoutIdKt.layoutId(modifier$Companion0, "action");
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
                int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
                Function0 function02 = composeUiNode$Companion0.getConstructor();
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
                Function2 function25 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                    a.t(v6, composer1, v6, function25);
                }
                Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(v)), TextKt.getLocalTextStyle().provides(textStyle0)}, function21, composer1, ProvidedValue.$stable | v3 & 0x70);
                composer1.endNode();
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(-904766579);
            if(function22 != null) {
                Modifier modifier6 = LayoutIdKt.layoutId(modifier$Companion0, "dismissAction");
                MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
                int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
                Function0 function03 = composeUiNode$Companion0.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function03);
                }
                else {
                    composer1.useNode();
                }
                Function2 function26 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap3);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                    a.t(v7, composer1, v7, function26);
                }
                Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(v1)), function22, composer1, v3 >> 3 & 0x70 | ProvidedValue.$stable);
                composer1.endNode();
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new cm(function20, function21, function22, textStyle0, v, v1, v2, 1));
        }
    }

    public static final float access$getContainerMaxWidth$p() [...] // 潜在的解密器

    public static final float access$getHeightToFirstLine$p() [...] // 潜在的解密器

    public static final float access$getTextEndExtraSpacing$p() [...] // 潜在的解密器
}

