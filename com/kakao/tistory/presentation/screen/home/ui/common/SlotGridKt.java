package com.kakao.tistory.presentation.screen.home.ui.common;

import a;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.DpKt;
import com.kakao.tistory.presentation.design.ui.list.EntryListKt;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Entry;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u000F\u0010\u0003\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001AC\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u0011\u0010\f\u001A\r\u0012\u0004\u0012\u00020\u00000\n¢\u0006\u0002\b\u000BH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u001AZ\u0010\u001D\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u00112 \b\u0002\u0010\u0016\u001A\u001A\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013¢\u0006\u0002\b\u000B¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u001A\u001A\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001B\u0010\u001C\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001E"}, d2 = {"", "SlotGridLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "SlotGridPreview", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/DpSize;", "separatorSize", "", "verticalItemCount", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "SlotGrid-8HUqYh0", "(Landroidx/compose/ui/Modifier;JILkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SlotGrid", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;", "", "isNew", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "extraContent", "Landroidx/compose/ui/unit/Dp;", "extraContentHeight", "Landroidx/compose/ui/graphics/Color;", "titleColor", "SlotGridItem-xfPyhaw", "(Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;ZLkotlin/jvm/functions/Function3;FJLandroidx/compose/runtime/Composer;II)V", "SlotGridItem", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotGrid.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,184:1\n148#2:185\n148#2:223\n1223#3,6:186\n78#4,6:192\n85#4,4:207\n89#4,2:217\n93#4:222\n368#5,9:198\n377#5,3:219\n4032#6,6:211\n*S KotlinDebug\n*F\n+ 1 SlotGrid.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotGridKt\n*L\n118#1:185\n158#1:223\n122#1:186,6\n122#1:192,6\n122#1:207,4\n122#1:217,2\n122#1:222\n122#1:198,9\n122#1:219,3\n122#1:211,6\n*E\n"})
public final class SlotGridKt {
    public static final SlotGridKt.slotGridItem.1 a;

    static {
        SlotGridKt.a = new SlotGridKt.slotGridItem.1();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SlotGrid-8HUqYh0(@Nullable Modifier modifier0, long v, int v1, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3) {
        Modifier modifier1;
        int v6;
        long v5;
        int v4;
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0x5083F7C9);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            v5 = v;
        }
        else if((v2 & 0x70) == 0) {
            v5 = v;
            v4 |= (composer1.changed(v5) ? 0x20 : 16);
        }
        else {
            v5 = v;
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            v6 = v1;
        }
        else if((v2 & 0x380) == 0) {
            v6 = v1;
            v4 |= (composer1.changed(v6) ? 0x100 : 0x80);
        }
        else {
            v6 = v1;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v4 & 5851) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
            if((v3 & 2) != 0) {
                v5 = DpKt.DpSize-YgX7TsA(0.0f, 0.0f);
            }
            if((v3 & 4) != 0) {
                v6 = 2;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5083F7C9, v4, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotGrid (SlotGrid.kt:120)");
            }
            composer1.startReplaceGroup(0xB795DC5D);
            s0 s00 = composer1.rememberedValue();
            if((((v4 & 0x70) == 0x20 ? 1 : 0) | ((v4 & 0x380) == 0x100 ? 1 : 0)) != 0 || s00 == Composer.Companion.getEmpty()) {
                s00 = new s0(v5, v6);
                composer1.updateRememberedValue(s00);
            }
            composer1.endReplaceGroup();
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, s00, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                d.a(v7, composer1, v7, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(((v4 >> 9 & 14 | v4 << 3 & 0x70) << 6 & 0x380 | 6) >> 6 & 14)));
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
            scopeUpdateScope0.updateScope(new t0(modifier1, v5, v6, function20, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SlotGridItem-xfPyhaw(@NotNull Entry entryListUiState$Entry0, boolean z, @Nullable Function3 function30, float f, long v, @Nullable Composer composer0, int v1, int v2) {
        long v4;
        float f1;
        Function3 function31;
        boolean z1;
        int v3;
        Intrinsics.checkNotNullParameter(entryListUiState$Entry0, "content");
        Composer composer1 = composer0.startRestartGroup(0x589FC0AD);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(entryListUiState$Entry0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            z1 = z;
        }
        else if((v1 & 0x70) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x20 : 16);
        }
        else {
            z1 = z;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changed(f) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v3 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v3) != 9362 || !composer1.getSkipping()) {
            if((v2 & 2) != 0) {
                z1 = false;
            }
            Function3 function32 = (v2 & 4) == 0 ? function30 : null;
            float f2 = (v2 & 8) == 0 ? f : 0.0f;
            v4 = (v2 & 16) == 0 ? v : 0L;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x589FC0AD, v3, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotGridItem (SlotGrid.kt:159)");
            }
            EntryListKt.EntryGridItem-hjhQcyg(entryListUiState$Entry0.getOnClickEntry(), true, ComposableLambdaKt.rememberComposableLambda(0xA9B23CF, true, new u0(entryListUiState$Entry0), composer1, 54), entryListUiState$Entry0.getThumbnail(), 0L, entryListUiState$Entry0.getTitle(), v4, z1, function32, f2, composer1, v3 << 6 & 0x380000 | 0x1B0 | 0x1C00000 & v3 << 18 | 0xE000000 & v3 << 18 | v3 << 18 & 0x70000000, 16);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function31 = function32;
            f1 = f2;
        }
        else {
            composer1.skipToGroupEnd();
            function31 = function30;
            f1 = f;
            v4 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v0(entryListUiState$Entry0, z1, function31, f1, v4, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true, widthDp = 615)
    public static final void SlotGridLoadingPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1591010202);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1591010202, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotGridLoadingPreview (SlotGrid.kt:40)");
            }
            CompositionLocalKt.CompositionLocalProvider(SlotContainerKt.getLocalLoadingState().provides(Boolean.TRUE), ComposableSingletons.SlotGridKt.INSTANCE.getLambda-3$presentation_prodRelease(), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w0(v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true, widthDp = 616)
    public static final void SlotGridPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1016378030);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1016378030, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotGridPreview (SlotGrid.kt:74)");
            }
            CompositionLocalKt.CompositionLocalProvider(SlotContainerKt.getLocalLoadingState().provides(Boolean.FALSE), ComposableSingletons.SlotGridKt.INSTANCE.getLambda-4$presentation_prodRelease(), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x0(v));
        }
    }
}

