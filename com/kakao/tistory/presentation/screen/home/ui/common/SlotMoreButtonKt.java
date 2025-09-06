package com.kakao.tistory.presentation.screen.home.ui.common;

import a;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.preview.Preview;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import com.kakao.tistory.presentation.widget.common.RoundButtonKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u000F\u0010\u0003\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001A?\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00000\u000BH\u0007¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"", "SlotMoreButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "SlotMoreButtonLoadingPreview", "Landroidx/compose/ui/Modifier;", "modifier", "", "current", "max", "Lcom/kakao/tistory/presentation/screen/home/ui/common/SlotMoreButtonColor;", "buttonColor", "Lkotlin/Function0;", "onClick", "SlotMoreButton", "(Landroidx/compose/ui/Modifier;IILcom/kakao/tistory/presentation/screen/home/ui/common/SlotMoreButtonColor;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotMoreButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotMoreButton.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotMoreButtonKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,163:1\n85#2:164\n81#2,7:165\n88#2:200\n92#2:204\n85#2:205\n81#2,7:206\n88#2:241\n92#2:245\n78#3,6:172\n85#3,4:187\n89#3,2:197\n93#3:203\n78#3,6:213\n85#3,4:228\n89#3,2:238\n93#3:244\n368#4,9:178\n377#4:199\n378#4,2:201\n368#4,9:219\n377#4:240\n378#4,2:242\n4032#5,6:191\n4032#5,6:232\n77#6:246\n148#7:247\n158#7:248\n148#7:249\n*S KotlinDebug\n*F\n+ 1 SlotMoreButton.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotMoreButtonKt\n*L\n34#1:164\n34#1:165,7\n34#1:200\n34#1:204\n60#1:205\n60#1:206,7\n60#1:241\n60#1:245\n34#1:172,6\n34#1:187,4\n34#1:197,2\n34#1:203\n60#1:213,6\n60#1:228,4\n60#1:238,2\n60#1:244\n34#1:178,9\n34#1:199\n34#1:201,2\n60#1:219,9\n60#1:240\n60#1:242,2\n34#1:191,6\n60#1:232,6\n108#1:246\n125#1:247\n126#1:248\n126#1:249\n*E\n"})
public final class SlotMoreButtonKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SlotMoreButton(@Nullable Modifier modifier0, int v, int v1, @NotNull SlotMoreButtonColor slotMoreButtonColor0, @NotNull Function0 function00, @Nullable Composer composer0, int v2, int v3) {
        Modifier modifier1;
        int v4;
        Intrinsics.checkNotNullParameter(slotMoreButtonColor0, "buttonColor");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(575519603);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(slotMoreButtonColor0) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v4) != 9362 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(575519603, v4, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotMoreButton (SlotMoreButton.kt:106)");
            }
            boolean z = ((Boolean)composer1.consume(SlotContainerKt.getLocalLoadingState())).booleanValue();
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape(100);
            Modifier modifier3 = PlaceHolderKt.placeholder(ClipKt.clip(SizeKt.wrapContentSize$default(modifier2, null, false, 3, null), roundedCornerShape0), composer1, 0);
            modifier1 = modifier2;
            RoundButtonKt.RoundButton(function00, null, new ButtonColors(0L, slotMoreButtonColor0.getContentColor-0d7_KjU(), 0L, 0L, slotMoreButtonColor0.getMaxTextColor-0d7_KjU(), 0L, 44, null), modifier3, BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, slotMoreButtonColor0.getBorderColor-0d7_KjU()), null, v1 > 1 && !z, null, PaddingKt.PaddingValues-YgX7TsA(20.0f, 7.5f), ComposableLambdaKt.rememberComposableLambda(-1412581041, true, new a1(v1, v, slotMoreButtonColor0), composer1, 54), composer1, v4 >> 12 & 14 | 0x30000000, 0xA2);
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
            scopeUpdateScope0.updateScope(new b1(modifier1, v, v1, slotMoreButtonColor0, function00, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true, widthDp = 375)
    public static final void SlotMoreButtonLoadingPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1651334074);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1651334074, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotMoreButtonLoadingPreview (SlotMoreButton.kt:83)");
            }
            CompositionLocalKt.CompositionLocalProvider(SlotContainerKt.getLocalLoadingState().provides(Boolean.TRUE), ComposableSingletons.SlotMoreButtonKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f1(v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true, widthDp = 375)
    public static final void SlotMoreButtonPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x15940A50);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x15940A50, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotMoreButtonPreview (SlotMoreButton.kt:32)");
            }
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
                d.a(v1, composer1, v1, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            SlotMoreButtonColor slotMoreButtonColor0 = new SlotMoreButtonColor(Color.copy-wmQWz5c$default(0L, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null);
            SlotMoreButtonKt.SlotMoreButton(null, 1, 2, slotMoreButtonColor0, g1.a, composer1, 28080, 1);
            SlotMoreButtonKt.SlotMoreButton(null, 1, 1, slotMoreButtonColor0, h1.a, composer1, 28080, 1);
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
            scopeUpdateScope0.updateScope(new i1(v));
        }
    }

    public static final void access$SlotMoreButtonDisabledPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1567106100);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1567106100, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotMoreButtonDisabledPreview (SlotMoreButton.kt:57)");
            }
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
                d.a(v1, composer1, v1, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            SlotMoreButtonColor slotMoreButtonColor0 = new SlotMoreButtonColor(Color.copy-wmQWz5c$default(0L, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null);
            SlotMoreButtonKt.SlotMoreButton(null, 1, 2, slotMoreButtonColor0, c1.a, composer1, 28080, 1);
            SlotMoreButtonKt.SlotMoreButton(null, 1, 1, slotMoreButtonColor0, d1.a, composer1, 28080, 1);
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
            scopeUpdateScope0.updateScope(new e1(v));
        }
    }
}

