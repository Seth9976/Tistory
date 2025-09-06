package com.kakao.kandinsky.designsystem.common;

import aa.a;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.j6;
import androidx.compose.material3.o9;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import ca.t1;
import ca.u1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A/\u0010\u0007\u001A\u00020\u00052\b\b\u0001\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001A7\u0010\u000B\u001A\u00020\u00052\b\b\u0001\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t2\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000B\u0010\f\"\u0017\u0010\u0012\u001A\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"", "iconResource", "", "title", "Lkotlin/Function0;", "", "onClick", "MenuIconTextButton", "(ILjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "selected", "MenuIconTextToggleButton", "(ILjava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getMenuButtonWidth", "()F", "MenuButtonWidth", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMenuButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuButton.kt\ncom/kakao/kandinsky/designsystem/common/MenuButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,78:1\n1223#2,6:79\n77#3:85\n85#4:86\n81#4,7:87\n88#4:122\n92#4:132\n78#5,6:94\n85#5,4:109\n89#5,2:119\n93#5:131\n368#6,9:100\n377#6:121\n378#6,2:129\n4032#7,6:113\n148#8:123\n148#8:126\n148#8:133\n148#8:134\n708#9:124\n696#9:125\n708#9:127\n696#9:128\n*S KotlinDebug\n*F\n+ 1 MenuButton.kt\ncom/kakao/kandinsky/designsystem/common/MenuButtonKt\n*L\n46#1:79,6\n62#1:85\n64#1:86\n64#1:87,7\n64#1:122\n64#1:132\n64#1:94,6\n64#1:109,4\n64#1:119,2\n64#1:131\n64#1:100,9\n64#1:121\n64#1:129,2\n64#1:113,6\n68#1:123\n71#1:126\n17#1:133\n18#1:134\n69#1:124\n69#1:125\n75#1:127\n75#1:128\n*E\n"})
public final class MenuButtonKt {
    public static final float a;
    public static final float b;

    static {
        MenuButtonKt.a = 50.0f;
        MenuButtonKt.b = 48.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void MenuIconTextButton(@DrawableRes int v, @NotNull String s, @NotNull Function0 function00, @Nullable Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(0x21AF580E);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x21AF580E, v2, -1, "com.kakao.kandinsky.designsystem.common.MenuIconTextButton (MenuButton.kt:24)");
            }
            KDButtonKt.KDIconButton(function00, SizeKt.size-VpY3zN4(Modifier.Companion, MenuButtonKt.a, MenuButtonKt.b), false, KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, 0L, 0L, 0L, 0L, composer1, 0x30180, 27), null, ComposableLambdaKt.rememberComposableLambda(-749985404, true, new u1(v, s, 0), composer1, 54), composer1, v2 >> 6 & 14 | 0x30030, 20);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j6(v, s, function00, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void MenuIconTextToggleButton(@DrawableRes int v, @NotNull String s, boolean z, @NotNull Function0 function00, @Nullable Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(-766424906);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-766424906, v2, -1, "com.kakao.kandinsky.designsystem.common.MenuIconTextToggleButton (MenuButton.kt:42)");
            }
            composer1.startReplaceGroup(0xCD1A6B04);
            a a0 = composer1.rememberedValue();
            if((v2 & 0x1C00) == 0x800 || a0 == Composer.Companion.getEmpty()) {
                a0 = new a(function00, 10);
                composer1.updateRememberedValue(a0);
            }
            composer1.endReplaceGroup();
            Modifier modifier0 = SizeKt.size-VpY3zN4(Modifier.Companion, MenuButtonKt.a, MenuButtonKt.b);
            long v3 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getPrimary-0d7_KjU();
            KDButtonKt.KDIconToggleButton(z, a0, modifier0, false, KDButtonDefaults.INSTANCE.toggleButtonColors-dPtIKUs(0.0f, 0L, 0L, 0L, 0L, 0L, v3, composer1, 0xC00180, 59), null, ComposableLambdaKt.rememberComposableLambda(0x28D2A021, true, new u1(v, s, 1), composer1, 54), composer1, v2 >> 6 & 14 | 0x180180, 40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o9(s, z, function00, v, v1));
        }
    }

    public static final void access$DefaultIconTextContent(int v, String s, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(460068839);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(460068839, v2, -1, "com.kakao.kandinsky.designsystem.common.DefaultIconTextContent (MenuButton.kt:60)");
            }
            long v3 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
            Companion modifier$Companion0 = Modifier.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composer1, 54);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                androidx.room.a.t(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            Painter painter0 = PainterResources_androidKt.painterResource(v, composer1, v2 & 14);
            Modifier modifier1 = SizeKt.size-3ABfNKs(modifier$Companion0, 28.0f);
            composer1.startReplaceGroup(1122067041);
            int v5 = Long.compare(v3, 16L);
            long v6 = v5 == 0 ? MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getSecondary-0d7_KjU() : v3;
            composer1.endReplaceGroup();
            IconKt.Icon-ww6aTOc(painter0, null, modifier1, v6, composer1, 440, 0);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 3.0f), composer1, 6);
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getBodySmall();
            composer1.startReplaceGroup(0x42E1634F);
            long v7 = v5 == 0 ? MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnSurface-0d7_KjU() : v3;
            composer1.endReplaceGroup();
            TextKt.Text--4IGK_g(s, null, v7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, v2 >> 3 & 14, 0, 0xFFFA);
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
            scopeUpdateScope0.updateScope(new t1(v, s, v1));
        }
    }

    public static final float getMenuButtonWidth() [...] // 潜在的解密器
}

