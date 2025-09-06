package com.kakao.kandinsky.designsystem.common;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.v9;
import androidx.compose.material3.vb;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import ca.a0;
import ca.b0;
import ca.c0;
import ca.d0;
import ca.e0;
import ca.f0;
import ca.g0;
import ca.g;
import ca.h0;
import ca.i0;
import ca.j0;
import ca.k0;
import ca.l0;
import ca.m0;
import ca.s;
import ca.x;
import ca.y;
import ca.z;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\u001A^\u0010\t\u001A\u00020\u00032\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0011\u0010\b\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001A;\u0010\u0010\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u000E\u001A\u00020\u00002\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "isSingleImage", "Lkotlin/Function0;", "", "onClickCancel", "onClickConfirm", "onClickMultipleConfirm", "Landroidx/compose/runtime/Composable;", "centerContent", "CommonFeatureBottomBar", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "text", "enabled", "isSelected", "onClick", "BottomBarFeatureTypeText", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFeatureBottomBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureBottomBar.kt\ncom/kakao/kandinsky/designsystem/common/FeatureBottomBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,185:1\n77#2:186\n77#2:361\n1223#3,6:187\n1223#3,6:355\n71#4:193\n69#4,5:194\n74#4:227\n71#4:228\n68#4,6:229\n74#4:263\n78#4:267\n71#4:268\n68#4,6:269\n74#4:303\n78#4:307\n71#4:308\n68#4,6:309\n74#4:343\n78#4:347\n78#4:351\n78#5,6:199\n85#5,4:214\n89#5,2:224\n78#5,6:235\n85#5,4:250\n89#5,2:260\n93#5:266\n78#5,6:275\n85#5,4:290\n89#5,2:300\n93#5:306\n78#5,6:315\n85#5,4:330\n89#5,2:340\n93#5:346\n93#5:350\n78#5,6:370\n85#5,4:385\n89#5,2:395\n93#5:401\n78#5,6:411\n85#5,4:426\n89#5,2:436\n93#5:442\n368#6,9:205\n377#6:226\n368#6,9:241\n377#6:262\n378#6,2:264\n368#6,9:281\n377#6:302\n378#6,2:304\n368#6,9:321\n377#6:342\n378#6,2:344\n378#6,2:348\n368#6,9:376\n377#6:397\n378#6,2:399\n368#6,9:417\n377#6:438\n378#6,2:440\n4032#7,6:218\n4032#7,6:254\n4032#7,6:294\n4032#7,6:334\n4032#7,6:389\n4032#7,6:430\n148#8:352\n148#8:353\n148#8:354\n98#9:362\n94#9,7:363\n101#9:398\n105#9:402\n85#10:403\n81#10,7:404\n88#10:439\n92#10:443\n*S KotlinDebug\n*F\n+ 1 FeatureBottomBar.kt\ncom/kakao/kandinsky/designsystem/common/FeatureBottomBarKt\n*L\n30#1:186\n175#1:361\n31#1:187,6\n147#1:355,6\n59#1:193\n59#1:194,5\n59#1:227\n76#1:228\n76#1:229,6\n76#1:263\n76#1:267\n83#1:268\n83#1:269,6\n83#1:303\n83#1:307\n86#1:308\n86#1:309,6\n86#1:343\n86#1:347\n59#1:351\n59#1:199,6\n59#1:214,4\n59#1:224,2\n76#1:235,6\n76#1:250,4\n76#1:260,2\n76#1:266\n83#1:275,6\n83#1:290,4\n83#1:300,2\n83#1:306\n86#1:315,6\n86#1:330,4\n86#1:340,2\n86#1:346\n59#1:350\n176#1:370,6\n176#1:385,4\n176#1:395,2\n176#1:401\n180#1:411,6\n180#1:426,4\n180#1:436,2\n180#1:442\n59#1:205,9\n59#1:226\n76#1:241,9\n76#1:262\n76#1:264,2\n83#1:281,9\n83#1:302\n83#1:304,2\n86#1:321,9\n86#1:342\n86#1:344,2\n59#1:348,2\n176#1:376,9\n176#1:397\n176#1:399,2\n180#1:417,9\n180#1:438\n180#1:440,2\n59#1:218,6\n76#1:254,6\n83#1:294,6\n86#1:334,6\n176#1:389,6\n180#1:430,6\n105#1:352\n126#1:353\n145#1:354\n176#1:362\n176#1:363,7\n176#1:398\n176#1:402\n180#1:403\n180#1:404,7\n180#1:439\n180#1:443\n*E\n"})
public final class FeatureBottomBarKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Orientation.values().length];
            try {
                arr_v[Orientation.Portrait.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Orientation.Landscape.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BottomBarFeatureTypeText(@NotNull String s, boolean z, boolean z1, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        Function0 function01;
        boolean z3;
        boolean z2;
        int v2;
        Intrinsics.checkNotNullParameter(s, "text");
        Composer composer1 = composer0.startRestartGroup(0x701E40A);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            z2 = z;
        }
        else if((v & 0x70) == 0) {
            z2 = z;
            v2 |= (composer1.changed(z2) ? 0x20 : 16);
        }
        else {
            z2 = z;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            boolean z4 = (v1 & 2) == 0 ? z2 : true;
            boolean z5 = (v1 & 4) == 0 ? z1 : true;
            Function0 function02 = (v1 & 8) == 0 ? function00 : x.w;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x701E40A, v2, -1, "com.kakao.kandinsky.designsystem.common.BottomBarFeatureTypeText (FeatureBottomBar.kt:102)");
            }
            z3 = z5;
            KDButtonKt.KDButton(function02, PaddingKt.padding-qDBjuR0$default(SizeKt.width-3ABfNKs(Modifier.Companion, 58.0f), 0.0f, 0.0f, 0.0f, 2.0f, 7, null), z4, RoundedCornerShapeKt.RoundedCornerShape(100), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(0x25173181, true, new y(s, z5, z4), composer1, 54), composer1, v2 >> 9 & 14 | 0x6000030 | v2 << 3 & 0x380, 0xF0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z4;
            function01 = function02;
        }
        else {
            composer1.skipToGroupEnd();
            z3 = z1;
            function01 = function00;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(s, z2, z3, function01, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void CommonFeatureBottomBar(boolean z, @Nullable Function0 function00, @Nullable Function0 function01, @Nullable Function0 function02, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        Function0 function06;
        Function0 function05;
        Function0 function04;
        Function0 function03;
        boolean z1;
        int v2;
        Intrinsics.checkNotNullParameter(function20, "centerContent");
        Composer composer1 = composer0.startRestartGroup(985059627);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            z1 = z;
        }
        else if((v & 14) == 0) {
            z1 = z;
            v2 = (composer1.changed(z1) ? 4 : 2) | v;
        }
        else {
            z1 = z;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function03 = function01;
        }
        else if((v & 0x380) == 0) {
            function03 = function01;
            v2 |= (composer1.changedInstance(function03) ? 0x100 : 0x80);
        }
        else {
            function03 = function01;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function04 = function02;
        }
        else if((v & 0x1C00) == 0) {
            function04 = function02;
            v2 |= (composer1.changedInstance(function04) ? 0x800 : 0x400);
        }
        else {
            function04 = function02;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        boolean z2 = false;
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                z1 = false;
            }
            function05 = (v1 & 2) == 0 ? function00 : a0.w;
            Function0 function07 = (v1 & 4) == 0 ? function03 : b0.w;
            if((v1 & 8) != 0) {
                function04 = null;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(985059627, v2, -1, "com.kakao.kandinsky.designsystem.common.CommonFeatureBottomBar (FeatureBottomBar.kt:28)");
            }
            Orientation orientation0 = (Orientation)composer1.consume(OrientationKt.getLocalOrientation());
            composer1.startReplaceGroup(0x28D1E741);
            if((v2 & 0xE000) == 0x4000) {
                z2 = true;
            }
            Function2 function21 = composer1.rememberedValue();
            if(z2 || function21 == Composer.Companion.getEmpty()) {
                function21 = MovableContentKt.movableContentOf(function20);
                composer1.updateRememberedValue(function21);
            }
            composer1.endReplaceGroup();
            function06 = function04;
            FeatureBottomBarKt.a(null, ComposableLambdaKt.rememberComposableLambda(0x5E2FB14, true, new c0(function05, 0), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0xDD1A7473, true, new d0(orientation0, function21), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0xB451EDD2, true, new v9(function07, function04, z1), composer1, 54), composer1, 0xDB0, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function03 = function07;
        }
        else {
            composer1.skipToGroupEnd();
            function05 = function00;
            function06 = function04;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vb(z1, function05, function03, function06, function20, v, v1));
        }
    }

    public static final void a(Modifier modifier0, Function3 function30, Function3 function31, Function3 function32, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x8B602C16);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function31) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function32) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8B602C16, v2, -1, "com.kakao.kandinsky.designsystem.common.FeatureBottomBar (FeatureBottomBar.kt:57)");
            }
            Modifier modifier3 = ClickableKt.clickable-XHw0xAI$default(OrientationKt.byOrientation(modifier2, s.A, s.B), false, null, null, e0.w, 6, null);
            Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier5 = OrientationKt.byOrientation(modifier$Companion0, new f0(boxScopeInstance0), new g0(boxScopeInstance0));
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting()) {
                modifier1 = modifier2;
                a.t(v4, composer1, v4, function21);
            }
            else {
                modifier1 = modifier2;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    a.t(v4, composer1, v4, function21);
                }
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            function30.invoke(boxScopeInstance0, composer1, ((int)((v2 << 6 & 0x1C00) >> 6 & 0x70 | 6)));
            composer1.endNode();
            Modifier modifier7 = boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getCenter());
            MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier8 = ComposedModifierKt.materializeModifier(composer1, modifier7);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function22);
            }
            Updater.set-impl(composer1, modifier8, composeUiNode$Companion0.getSetModifier());
            function31.invoke(boxScopeInstance0, composer1, ((int)((v2 << 3 & 0x1C00) >> 6 & 0x70 | 6)));
            composer1.endNode();
            Modifier modifier9 = OrientationKt.byOrientation(modifier$Companion0, new h0(boxScopeInstance0), new i0(boxScopeInstance0));
            MeasurePolicy measurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier10 = ComposedModifierKt.materializeModifier(composer1, modifier9);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap3);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                a.t(v6, composer1, v6, function23);
            }
            Updater.set-impl(composer1, modifier10, composeUiNode$Companion0.getSetModifier());
            function32.invoke(boxScopeInstance0, composer1, ((int)((v2 & 0x1C00) >> 6 & 0x70 | 6)));
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new androidx.compose.foundation.text.selection.b0(modifier1, function30, function31, function32, v, v1, 3));
        }
    }

    public static final void access$FeatureBottomBar(Modifier modifier0, Function3 function30, Function3 function31, Function3 function32, Composer composer0, int v, int v1) {
        FeatureBottomBarKt.a(modifier0, function30, function31, function32, composer0, v, v1);
    }

    public static final void access$FeatureBottomBarLeftContent(Function0 function00, Composer composer0, int v, int v1) {
        Function0 function01;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-327075534);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            function01 = function00;
        }
        else if((v & 14) == 0) {
            function01 = function00;
            v2 = (composer1.changedInstance(function01) ? 4 : 2) | v;
        }
        else {
            function01 = function00;
            v2 = v;
        }
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            Function0 function02 = (v1 & 1) == 0 ? function01 : j0.w;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-327075534, v2, -1, "com.kakao.kandinsky.designsystem.common.FeatureBottomBarLeftContent (FeatureBottomBar.kt:119)");
            }
            long v3 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU();
            KDButtonColors kDButtonColors0 = KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, 0L, v3, 0L, 0L, composer1, 0x30000, 27);
            KDButtonKt.KDIconButton(function02, SizeKt.size-3ABfNKs(Modifier.Companion, 38.0f), false, kDButtonColors0, null, ComposableSingletons.FeatureBottomBarKt.INSTANCE.getLambda-1$designsystem_release(), composer1, v2 & 14 | 0x30030, 20);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k0(v, v1, 0, function01));
        }
    }

    public static final void access$FeatureBottomBarRightContent(Function0 function00, Function0 function01, Composer composer0, int v, int v1) {
        Function0 function03;
        Function0 function02;
        Function0 function07;
        Function0 function06;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x4A066809);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? v | (composer1.changedInstance(function00) ? 4 : 2) : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            Function0 function04 = (v1 & 1) == 0 ? function00 : l0.w;
            Function0 function05 = (v1 & 2) == 0 ? function01 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4A066809, v2, -1, "com.kakao.kandinsky.designsystem.common.FeatureBottomBarRightContent (FeatureBottomBar.kt:140)");
            }
            long v3 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getPrimary-0d7_KjU();
            KDButtonColors kDButtonColors0 = KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, 0L, v3, 0L, 0L, composer1, 0x30000, 27);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.size-3ABfNKs(modifier$Companion0, 38.0f);
            composer1.startReplaceGroup(0x8A9065CA);
            Function4 function40 = composer1.rememberedValue();
            if(function40 == Composer.Companion.getEmpty()) {
                function40 = MovableContentKt.movableContentOf(ComposableLambdaKt.composableLambdaInstance(0xBD8CCF38, true, new m0(modifier0, kDButtonColors0, 0)));
                composer1.updateRememberedValue(function40);
            }
            composer1.endReplaceGroup();
            switch(WhenMappings.$EnumSwitchMapping$0[((Orientation)composer1.consume(OrientationKt.getLocalOrientation())).ordinal()]) {
                case 1: {
                    function06 = function05;
                    function07 = function04;
                    composer1.startReplaceGroup(0x8A90698E);
                    MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
                    int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                    CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
                    Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
                    androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                    Function0 function08 = composeUiNode$Companion0.getConstructor();
                    if(composer1.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer1.startReusableNode();
                    if(composer1.getInserting()) {
                        composer1.createNode(function08);
                    }
                    else {
                        composer1.useNode();
                    }
                    Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
                    if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                        a.t(v4, composer1, v4, function20);
                    }
                    Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
                    function40.invoke(function07, function06, composer1, ((int)(v2 & 0x70 | (v2 & 14 | 0x180))));
                    composer1.endNode();
                    composer1.endReplaceGroup();
                    break;
                }
                case 2: {
                    composer1.startReplaceGroup(0x8A906A2C);
                    MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer1, 0x30);
                    int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                    CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                    Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
                    androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
                    Function0 function09 = composeUiNode$Companion1.getConstructor();
                    if(composer1.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer1.startReusableNode();
                    if(composer1.getInserting()) {
                        composer1.createNode(function09);
                    }
                    else {
                        composer1.useNode();
                    }
                    Function2 function21 = a.r(composeUiNode$Companion1, composer1, measurePolicy1, composer1, compositionLocalMap1);
                    if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                        a.t(v5, composer1, v5, function21);
                    }
                    Updater.set-impl(composer1, modifier2, composeUiNode$Companion1.getSetModifier());
                    function06 = function05;
                    function07 = function04;
                    function40.invoke(function07, function06, composer1, ((int)(v2 & 0x70 | (v2 & 14 | 0x180))));
                    composer1.endNode();
                    composer1.endReplaceGroup();
                    break;
                }
                default: {
                    composer1.startReplaceGroup(0x8A906AB4);
                    composer1.endReplaceGroup();
                    function06 = function05;
                    function07 = function04;
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function02 = function07;
            function03 = function06;
        }
        else {
            composer1.skipToGroupEnd();
            function02 = function00;
            function03 = function01;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(v, v1, function02, function03, 1));
        }
    }
}

