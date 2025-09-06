package com.kakao.kandinsky.designsystem.common;

import androidx.annotation.StringRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import ca.a;
import ca.b;
import ca.c;
import ca.d;
import ca.e;
import ca.f;
import ca.g;
import ca.h;
import com.kakao.kandinsky.core.designsystem.R.string;
import com.kakao.kandinsky.designsystem.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001A?\u0010\u0007\u001A\u00020\u00042\b\b\u0001\u0010\u0001\u001A\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u00002\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "titleResId", "messageResId", "Lkotlin/Function0;", "", "onCancel", "onConfirm", "CommonDialog", "(IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommonDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonDialog.kt\ncom/kakao/kandinsky/designsystem/common/CommonDialogKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,138:1\n148#2:139\n148#2:140\n158#2:177\n158#2:254\n85#3:141\n82#3,6:142\n88#3:176\n92#3:301\n78#4,6:148\n85#4,4:163\n89#4,2:173\n78#4,6:186\n85#4,4:201\n89#4,2:211\n78#4,6:221\n85#4,4:236\n89#4,2:246\n93#4:252\n78#4,6:261\n85#4,4:276\n89#4,2:286\n93#4:292\n93#4:296\n93#4:300\n368#5,9:154\n377#5:175\n368#5,9:192\n377#5:213\n368#5,9:227\n377#5:248\n378#5,2:250\n368#5,9:267\n377#5:288\n378#5,2:290\n378#5,2:294\n378#5,2:298\n4032#6,6:167\n4032#6,6:205\n4032#6,6:240\n4032#6,6:280\n98#7:178\n94#7,7:179\n101#7:214\n105#7:297\n71#8:215\n69#8,5:216\n74#8:249\n78#8:253\n71#8:255\n69#8,5:256\n74#8:289\n78#8:293\n*S KotlinDebug\n*F\n+ 1 CommonDialog.kt\ncom/kakao/kandinsky/designsystem/common/CommonDialogKt\n*L\n94#1:139\n95#1:140\n97#1:177\n117#1:254\n91#1:141\n91#1:142,6\n91#1:176\n91#1:301\n91#1:148,6\n91#1:163,4\n91#1:173,2\n99#1:186,6\n99#1:201,4\n99#1:211,2\n100#1:221,6\n100#1:236,4\n100#1:246,2\n100#1:252\n121#1:261,6\n121#1:276,4\n121#1:286,2\n121#1:292\n99#1:296\n91#1:300\n91#1:154,9\n91#1:175\n99#1:192,9\n99#1:213\n100#1:227,9\n100#1:248\n100#1:250,2\n121#1:267,9\n121#1:288\n121#1:290,2\n99#1:294,2\n91#1:298,2\n91#1:167,6\n99#1:205,6\n100#1:240,6\n121#1:280,6\n99#1:178\n99#1:179,7\n99#1:214\n99#1:297\n100#1:215\n100#1:216,5\n100#1:249\n100#1:253\n121#1:255\n121#1:256,5\n121#1:289\n121#1:293\n*E\n"})
public final class CommonDialogKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommonDialog(@StringRes int v, @StringRes int v1, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable Composer composer0, int v2) {
        Intrinsics.checkNotNullParameter(function00, "onCancel");
        Intrinsics.checkNotNullParameter(function01, "onConfirm");
        Composer composer1 = composer0.startRestartGroup(0x53294FD2);
        int v3 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function01) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x53294FD2, v3, -1, "com.kakao.kandinsky.designsystem.common.CommonDialog (CommonDialog.kt:41)");
            }
            CommonDialogKt.a(StringResources_androidKt.stringResource(v, composer1, v3 & 14), StringResources_androidKt.stringResource(v1, composer1, v3 >> 3 & 14), function00, function01, composer1, v3 & 0x1F80, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, v1, function00, function01, v2));
        }
    }

    public static final void a(String s, String s1, Function0 function00, Function0 function01, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(602190380);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            if((v1 & 4) != 0) {
                function00 = b.w;
            }
            if((v1 & 8) != 0) {
                function01 = c.w;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(602190380, v2, -1, "com.kakao.kandinsky.designsystem.common.CommonDialog (CommonDialog.kt:56)");
            }
            AndroidDialog_androidKt.Dialog(function00, null, ComposableLambdaKt.rememberComposableLambda(0x4EF51935, true, new d(s, function00, function01, s1), composer1, 54), composer1, v2 >> 6 & 14 | 0x180, 2);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(s, s1, function00, function01, v, v1, 2));
        }
    }

    public static final void access$CommonDialog(String s, String s1, Function0 function00, Function0 function01, Composer composer0, int v, int v1) {
        CommonDialogKt.a(s, s1, function00, function01, composer0, v, v1);
    }

    public static final void access$DialogButtons(Function0 function00, Function0 function01, Composer composer0, int v, int v1) {
        Function0 function03;
        Function0 function02;
        int v2;
        Composer composer1 = composer0.startRestartGroup(56081782);
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
            Function0 function04 = (v1 & 1) == 0 ? function00 : e.w;
            Function0 function05 = (v1 & 2) == 0 ? function01 : f.w;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(56081782, v2, -1, "com.kakao.kandinsky.designsystem.common.DialogButtons (CommonDialog.kt:89)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.height-3ABfNKs(PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 0.0f, 30.0f, 0.0f, 0.0f, 13, null), 52.0f);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function06 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function06);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                androidx.room.a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            long v4 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnSurface-0d7_KjU();
            int v5 = MaterialTheme.$stable;
            MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
            DividerKt.Divider-9IZ8Weo(null, 0.5f, v4, composer1, 0x30, 1);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            Function0 function07 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function07);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                androidx.room.a.t(v6, composer1, v6, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            Modifier modifier3 = ClickableKt.clickable-XHw0xAI$default(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), 0.0f, 1, null), false, null, Role.box-impl(0), function04, 3, null);
            MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Function2 function22 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                androidx.room.a.t(v7, composer1, v7, function22);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            String s = StringResources_androidKt.stringResource(string.dialog_cancel, composer1, 0);
            TextStyle textStyle0 = materialTheme0.getTypography(composer1, v5).getHeadlineLarge();
            TextKt.Text--4IGK_g(s, null, materialTheme0.getColorScheme(composer1, v5).getOnTertiaryContainer-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0, 0, 0xFFFA);
            composer1.endNode();
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.width-3ABfNKs(SizeKt.fillMaxHeight$default(modifier$Companion0, 0.0f, 1, null), 0.5f), materialTheme0.getColorScheme(composer1, v5).getOnSurface-0d7_KjU(), null, 2, null), composer1, 0);
            Modifier modifier5 = ClickableKt.clickable-XHw0xAI$default(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), 0.0f, 1, null), false, null, Role.box-impl(0), function05, 3, null);
            MeasurePolicy measurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v8 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
            Function0 function09 = composeUiNode$Companion0.getConstructor();
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
            Function2 function23 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap3);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v8)) {
                androidx.room.a.t(v8, composer1, v8, function23);
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            String s1 = StringResources_androidKt.stringResource(string.dialog_confirm, composer1, 0);
            TextStyle textStyle1 = materialTheme0.getTypography(composer1, v5).getHeadlineLarge();
            FontWeight fontWeight0 = FontWeight.Companion.getBold();
            TextKt.Text--4IGK_g(s1, null, materialTheme0.getColorScheme(composer1, v5).getOnTertiaryContainer-0d7_KjU(), 0L, null, fontWeight0, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle1, composer1, 0x30000, 0, 0xFFDA);
            composer1.endNode();
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function02 = function04;
            function03 = function05;
        }
        else {
            composer1.skipToGroupEnd();
            function02 = function00;
            function03 = function01;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(v, v1, function02, function03, 0));
        }
    }

    public static final void access$PreviewCommonDialog(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xFEFF646A);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFEFF646A, v, -1, "com.kakao.kandinsky.designsystem.common.PreviewCommonDialog (CommonDialog.kt:26)");
            }
            ThemeKt.KandinskyTheme(ComposableSingletons.CommonDialogKt.INSTANCE.getLambda-1$designsystem_release(), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(v, 0));
        }
    }
}

