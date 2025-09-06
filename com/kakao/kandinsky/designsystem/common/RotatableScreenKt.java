package com.kakao.kandinsky.designsystem.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import ca.q;
import ca.y1;
import ca.z1;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001Ap\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\b\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000BH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0011"}, d2 = {"RotatableScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "boundPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "updatePreviewBounds", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "toolbarContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBackground", "Landroidx/compose/ui/graphics/Color;", "bottomBarContent", "RotatableScreen-FHprtrg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRotatableScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotatableScreen.kt\ncom/kakao/kandinsky/designsystem/common/RotatableScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,55:1\n1223#2,3:56\n1226#2,3:60\n1223#2,6:63\n1#3:59\n77#4:69\n85#5:70\n82#5,6:71\n88#5:105\n85#5:106\n82#5,6:107\n88#5:141\n92#5:145\n92#5:149\n85#5:150\n82#5,6:151\n88#5:185\n92#5:269\n78#6,6:77\n85#6,4:92\n89#6,2:102\n78#6,6:113\n85#6,4:128\n89#6,2:138\n93#6:144\n93#6:148\n78#6,6:157\n85#6,4:172\n89#6,2:182\n78#6,6:193\n85#6,4:208\n89#6,2:218\n78#6,6:229\n85#6,4:244\n89#6,2:254\n93#6:260\n93#6:264\n93#6:268\n368#7,9:83\n377#7:104\n368#7,9:119\n377#7:140\n378#7,2:142\n378#7,2:146\n368#7,9:163\n377#7:184\n368#7,9:199\n377#7:220\n368#7,9:235\n377#7:256\n378#7,2:258\n378#7,2:262\n378#7,2:266\n4032#8,6:96\n4032#8,6:132\n4032#8,6:176\n4032#8,6:212\n4032#8,6:248\n98#9:186\n95#9,6:187\n101#9:221\n98#9:222\n95#9,6:223\n101#9:257\n105#9:261\n105#9:265\n*S KotlinDebug\n*F\n+ 1 RotatableScreen.kt\ncom/kakao/kandinsky/designsystem/common/RotatableScreenKt\n*L\n31#1:56,3\n31#1:60,3\n32#1:63,6\n34#1:69\n35#1:70\n35#1:71,6\n35#1:105\n38#1:106\n38#1:107,6\n38#1:141\n38#1:145\n35#1:149\n43#1:150\n43#1:151,6\n43#1:185\n43#1:269\n35#1:77,6\n35#1:92,4\n35#1:102,2\n38#1:113,6\n38#1:128,4\n38#1:138,2\n38#1:144\n35#1:148\n43#1:157,6\n43#1:172,4\n43#1:182,2\n45#1:193,6\n45#1:208,4\n45#1:218,2\n48#1:229,6\n48#1:244,4\n48#1:254,2\n48#1:260\n45#1:264\n43#1:268\n35#1:83,9\n35#1:104\n38#1:119,9\n38#1:140\n38#1:142,2\n35#1:146,2\n43#1:163,9\n43#1:184\n45#1:199,9\n45#1:220\n48#1:235,9\n48#1:256\n48#1:258,2\n45#1:262,2\n43#1:266,2\n35#1:96,6\n38#1:132,6\n43#1:176,6\n45#1:212,6\n48#1:248,6\n45#1:186\n45#1:187,6\n45#1:221\n48#1:222\n48#1:223,6\n48#1:257\n48#1:261\n45#1:265\n*E\n"})
public final class RotatableScreenKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void RotatableScreen-FHprtrg(@Nullable Modifier modifier0, @Nullable PaddingValues paddingValues0, @Nullable Function1 function10, @Nullable Function2 function20, long v, @NotNull Function2 function21, @Nullable Composer composer0, int v1, int v2) {
        long v6;
        Function2 function23;
        Function1 function12;
        PaddingValues paddingValues2;
        Modifier modifier1;
        Function2 function210;
        Function2 function26;
        Modifier modifier2;
        int v5;
        long v4;
        Function2 function22;
        Function1 function11;
        PaddingValues paddingValues1;
        int v3;
        Intrinsics.checkNotNullParameter(function21, "bottomBarContent");
        Composer composer1 = composer0.startRestartGroup(-831940644);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            paddingValues1 = paddingValues0;
        }
        else if((v1 & 0x70) == 0) {
            paddingValues1 = paddingValues0;
            v3 |= (composer1.changed(paddingValues1) ? 0x20 : 16);
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            function11 = function10;
        }
        else if((v1 & 0x380) == 0) {
            function11 = function10;
            v3 |= (composer1.changedInstance(function11) ? 0x100 : 0x80);
        }
        else {
            function11 = function10;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            function22 = function20;
        }
        else if((v1 & 0x1C00) == 0) {
            function22 = function20;
            v3 |= (composer1.changedInstance(function22) ? 0x800 : 0x400);
        }
        else {
            function22 = function20;
        }
        if((0xE000 & v1) == 0) {
            if((v2 & 16) == 0) {
                v4 = v;
                v5 = composer1.changed(v4) ? 0x4000 : 0x2000;
            }
            else {
                v4 = v;
                v5 = 0x2000;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v3) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 2) != 0) {
                    paddingValues1 = PaddingKt.PaddingValues-YgX7TsA$default(0.0f, 0.0f, 3, null);
                }
                if((v2 & 4) != 0) {
                    function11 = y1.w;
                }
                if((v2 & 8) != 0) {
                    function22 = null;
                }
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                    v4 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getSurface-0d7_KjU();
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-831940644, v3, -1, "com.kakao.kandinsky.designsystem.common.RotatableScreen (RotatableScreen.kt:29)");
            }
            composer1.startReplaceGroup(0x2B986F47);
            Function2 function24 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(function24 == composer$Companion0.getEmpty()) {
                function24 = function22 == null ? null : MovableContentKt.movableContentOf(function22);
                composer1.updateRememberedValue(function24);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x2B986F99);
            Function2 function25 = composer1.rememberedValue();
            if((v3 & 0x70000) == 0x20000 || function25 == composer$Companion0.getEmpty()) {
                function25 = MovableContentKt.movableContentOf(function21);
                composer1.updateRememberedValue(function25);
            }
            composer1.endReplaceGroup();
            if(composer1.consume(OrientationKt.getLocalOrientation()) == Orientation.Portrait) {
                composer1.startReplaceGroup(0x2B987020);
                Modifier modifier3 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                Arrangement arrangement0 = Arrangement.INSTANCE;
                androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
                MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
                int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                function26 = function22;
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
                Function2 function27 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
                if(composer1.getInserting()) {
                    modifier1 = modifier2;
                    a.t(v7, composer1, v7, function27);
                }
                else {
                    modifier1 = modifier2;
                    if(!Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                        a.t(v7, composer1, v7, function27);
                    }
                }
                Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
                ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
                composer1.startReplaceGroup(-1776662903);
                if(function24 != null) {
                    function24.invoke(composer1, 6);
                }
                composer1.endReplaceGroup();
                PreviewSpacerKt.PreviewSpacer(columnScopeInstance0, paddingValues1, function11, composer1, 6 | v3 & 0x70 | v3 & 0x380, 0);
                Modifier modifier5 = PointerInteropFilter_androidKt.pointerInteropFilter$default(BackgroundKt.background-bw27NRU$default(Modifier.Companion, v4, null, 2, null), null, q.C, 1, null);
                MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
                int v8 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
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
                Function2 function28 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v8)) {
                    a.t(v8, composer1, v8, function28);
                }
                function25.invoke(composer1, r0.a.l(composeUiNode$Companion0, composer1, modifier6, 0));
            }
            else {
                modifier1 = modifier2;
                function26 = function22;
                composer1.startReplaceGroup(731410803);
                Modifier modifier7 = SizeKt.fillMaxSize$default(modifier1, 0.0f, 1, null);
                Arrangement arrangement1 = Arrangement.INSTANCE;
                androidx.compose.ui.Alignment.Companion alignment$Companion1 = Alignment.Companion;
                MeasurePolicy measurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement1.getTop(), alignment$Companion1.getStart(), composer1, 0);
                int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier8 = ComposedModifierKt.materializeModifier(composer1, modifier7);
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
                Function0 function02 = composeUiNode$Companion1.getConstructor();
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
                Function2 function29 = a.r(composeUiNode$Companion1, composer1, measurePolicy2, composer1, compositionLocalMap2);
                if(composer1.getInserting()) {
                    function210 = function25;
                    a.t(v9, composer1, v9, function29);
                }
                else {
                    function210 = function25;
                    if(!Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                        a.t(v9, composer1, v9, function29);
                    }
                }
                r0.a.z(composeUiNode$Companion1, composer1, modifier8, composer1, 0x961A47DC);
                if(function24 != null) {
                    function24.invoke(composer1, 6);
                }
                composer1.endReplaceGroup();
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                Modifier modifier9 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
                MeasurePolicy measurePolicy3 = RowKt.rowMeasurePolicy(arrangement1.getStart(), alignment$Companion1.getTop(), composer1, 0);
                int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier10 = ComposedModifierKt.materializeModifier(composer1, modifier9);
                Function0 function03 = composeUiNode$Companion1.getConstructor();
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
                Function2 function211 = a.r(composeUiNode$Companion1, composer1, measurePolicy3, composer1, compositionLocalMap3);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
                    a.t(v10, composer1, v10, function211);
                }
                Updater.set-impl(composer1, modifier10, composeUiNode$Companion1.getSetModifier());
                PreviewSpacerKt.PreviewSpacer(RowScopeInstance.INSTANCE, paddingValues1, function11, composer1, v3 & 0x380 | (6 | v3 & 0x70), 0);
                Modifier modifier11 = PointerInteropFilter_androidKt.pointerInteropFilter$default(BackgroundKt.background-bw27NRU$default(modifier$Companion0, v4, null, 2, null), null, q.D, 1, null);
                MeasurePolicy measurePolicy4 = RowKt.rowMeasurePolicy(arrangement1.getStart(), alignment$Companion1.getTop(), composer1, 0);
                int v11 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap4 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier12 = ComposedModifierKt.materializeModifier(composer1, modifier11);
                Function0 function04 = composeUiNode$Companion1.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function04);
                }
                else {
                    composer1.useNode();
                }
                Function2 function212 = a.r(composeUiNode$Companion1, composer1, measurePolicy4, composer1, compositionLocalMap4);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v11)) {
                    a.t(v11, composer1, v11, function212);
                }
                function210.invoke(composer1, r0.a.l(composeUiNode$Companion1, composer1, modifier12, 0));
                composer1.endNode();
            }
            composer1.endNode();
            composer1.endNode();
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            paddingValues2 = paddingValues1;
            function12 = function11;
            v6 = v4;
            function23 = function26;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            paddingValues2 = paddingValues1;
            function12 = function11;
            function23 = function22;
            v6 = v4;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z1(modifier1, paddingValues2, function12, function23, v6, function21, v1, v2));
        }
    }
}

