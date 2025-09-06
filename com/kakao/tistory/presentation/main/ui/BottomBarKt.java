package com.kakao.tistory.presentation.main.ui;

import androidx.annotation.DrawableRes;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001AJ\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000BH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001A{\u0010\u000E\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00010\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u0015\u001A\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0017\u001A\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00142\u001E\b\u0002\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000B2\b\b\u0002\u0010\u0005\u001A\u00020\u0006H\u0007¢\u0006\u0002\u0010\u001B\u001A\u009F\u0001\u0010\u001C\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u001D\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u00142\u0011\u0010\u001F\u001A\r\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\n2\u0013\b\u0002\u0010 \u001A\r\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\n2\u001E\b\u0002\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000BH\u0007¢\u0006\u0002\u0010!\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\""}, d2 = {"BottomBar", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "dividerColor", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BottomBar-6xbWgXg", "(JJLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomBarIconItem", "selected", "", "onClick", "Lkotlin/Function0;", "onClickLabel", "", "iconRes", "", "selectedIconRes", "iconLabel", "badge", "Landroidx/compose/foundation/layout/BoxScope;", "(ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBarItem", "onLongClick", "onLongClickLabel", "icon", "selectedIcon", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBottomBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomBar.kt\ncom/kakao/tistory/presentation/main/ui/BottomBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,130:1\n77#2:131\n1223#3,6:132\n71#4:138\n69#4,5:139\n74#4:172\n78#4:176\n78#5,6:144\n85#5,4:159\n89#5,2:169\n93#5:175\n368#6,9:150\n377#6:171\n378#6,2:173\n4032#7,6:163\n*S KotlinDebug\n*F\n+ 1 BottomBar.kt\ncom/kakao/tistory/presentation/main/ui/BottomBarKt\n*L\n64#1:131\n79#1:132,6\n65#1:138\n65#1:139,5\n65#1:172\n65#1:176\n65#1:144,6\n65#1:159,4\n65#1:169,2\n65#1:175\n65#1:150,9\n65#1:171\n65#1:173,2\n65#1:163,6\n*E\n"})
public final class BottomBarKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BottomBar-6xbWgXg(long v, long v1, @Nullable Modifier modifier0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        Modifier modifier1;
        int v4;
        Intrinsics.checkNotNullParameter(function30, "content");
        Composer composer1 = composer0.startRestartGroup(0xF27FA8D3);
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
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v4 & 5851) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF27FA8D3, v4, -1, "com.kakao.tistory.presentation.main.ui.BottomBar (BottomBar.kt:30)");
            }
            SurfaceKt.Surface-F-jzlyU(null, null, v, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(0xA0791617, true, new a(v1, modifier1, function30), composer1, 54), composer1, v4 << 6 & 0x380 | 0x180000, 59);
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
            scopeUpdateScope0.updateScope(new b(v, v1, modifier1, function30, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BottomBarIconItem(boolean z, @NotNull Function0 function00, @Nullable String s, @DrawableRes @Nullable Integer integer0, @DrawableRes @Nullable Integer integer1, @Nullable String s1, @Nullable Function3 function30, @Nullable Modifier modifier0, @Nullable Composer composer0, int v, int v1) {
        Function3 function31;
        Modifier modifier1;
        String s2;
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(0x809B1179);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(integer0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(integer1) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changed(s1) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x380000 & v) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((0x1C00000 & v) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x16DB6DB) != 4793490 || !composer1.getSkipping()) {
            String s3 = (v1 & 0x20) == 0 ? s1 : null;
            Function3 function32 = (v1 & 0x40) == 0 ? function30 : ComposableSingletons.BottomBarKt.INSTANCE.getLambda-2$presentation_prodRelease();
            Modifier modifier2 = (v1 & 0x80) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x809B1179, v2, -1, "com.kakao.tistory.presentation.main.ui.BottomBarIconItem (BottomBar.kt:101)");
            }
            BottomBarKt.BottomBarItem(z, function00, modifier2, s, null, null, ComposableLambdaKt.rememberComposableLambda(0x1CBF240F, true, new c(integer0, s3), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0xF2CB0B50, true, new d(integer1, s3), composer1, 54), function32, composer1, v2 & 14 | 0xD80000 | v2 & 0x70 | v2 >> 15 & 0x380 | v2 << 3 & 0x1C00 | v2 << 6 & 0xE000000, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function31 = function32;
            modifier1 = modifier2;
            s2 = s3;
        }
        else {
            composer1.skipToGroupEnd();
            s2 = s1;
            modifier1 = modifier0;
            function31 = function30;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e(z, function00, s, integer0, integer1, s2, function31, modifier1, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BottomBarItem(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable String s, @Nullable Function0 function01, @Nullable String s1, @NotNull Function2 function20, @Nullable Function2 function21, @Nullable Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Function2 function22;
        String s3;
        Function0 function03;
        Function3 function31;
        String s2;
        Modifier modifier1;
        Function2 function23;
        Function0 function04;
        int v3;
        Function3 function32;
        String s5;
        String s4;
        Modifier modifier2;
        Function2 function24;
        Function0 function02;
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Intrinsics.checkNotNullParameter(function20, "icon");
        Composer composer1 = composer0.startRestartGroup(1716308146);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(s) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function02 = function01;
        }
        else if((0xE000 & v) == 0) {
            function02 = function01;
            v2 |= (composer1.changedInstance(function02) ? 0x4000 : 0x2000);
        }
        else {
            function02 = function01;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changed(s1) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((v & 0x1C00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changedInstance(function21) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0xB6DB6DB) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 16) != 0) {
                    function02 = null;
                }
                if((v1 & 0x80) == 0) {
                    v3 = v2;
                    function24 = function21;
                }
                else {
                    v3 = v2 & 0xFE3FFFFF;
                    function24 = function20;
                }
                function32 = (v1 & 0x100) == 0 ? function30 : ComposableSingletons.BottomBarKt.INSTANCE.getLambda-1$presentation_prodRelease();
                modifier2 = modifier3;
                s4 = (v1 & 8) == 0 ? s : null;
                s5 = (v1 & 0x20) == 0 ? s1 : null;
                function04 = function02;
                function23 = function24;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                modifier2 = modifier0;
                s4 = s;
                s5 = s1;
                function32 = function30;
                v3 = v2;
                function04 = function02;
                function23 = function21;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1716308146, v3, -1, "com.kakao.tistory.presentation.main.ui.BottomBarItem (BottomBar.kt:62)");
            }
            f f0 = function04 == null ? null : new f(((HapticFeedback)composer1.consume(CompositionLocalsKt.getLocalHapticFeedback())), function04);
            Modifier modifier4 = ClickableKt.combinedClickable-cJG_KMw$default(modifier2, false, s4, Role.box-impl(4), s5, f0, null, function00, 33, null);
            composer1.startReplaceGroup(0xF4001324);
            g g0 = composer1.rememberedValue();
            if((v3 & 14) == 4 || g0 == Composer.Companion.getEmpty()) {
                g0 = new g(z);
                composer1.updateRememberedValue(g0);
            }
            composer1.endReplaceGroup();
            Modifier modifier5 = SemanticsModifierKt.semantics$default(modifier4, false, g0, 1, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function05 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function05);
            }
            else {
                composer1.useNode();
            }
            Function2 function25 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function25);
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            CrossfadeKt.Crossfade(Boolean.valueOf(z), null, null, " icon", ComposableLambdaKt.rememberComposableLambda(0xB07D0F8D, true, new h(function23, function20), composer1, 54), composer1, v3 & 14 | 0x6C00, 6);
            function32.invoke(BoxScopeInstance.INSTANCE, composer1, ((int)(v3 >> 21 & 0x70 | 6)));
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function31 = function32;
            function22 = function23;
            function03 = function04;
            s2 = s4;
            s3 = s5;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            s2 = s;
            function31 = function30;
            function03 = function02;
            s3 = s1;
            function22 = function21;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(z, function00, modifier1, s2, function03, s3, function20, function22, function31, v, v1));
        }
    }
}

