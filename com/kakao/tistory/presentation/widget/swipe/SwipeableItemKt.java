package com.kakao.tistory.presentation.widget.swipe;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import d;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u001Ao\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072!\u0010\b\u001A\u001D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\t2 \b\u0002\u0010\u000E\u001A\u001A\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001Aa\u0010\u0014\u001A\u00020\u00012\b\b\u0002\u0010\u0015\u001A\u00020\u00162\b\b\u0002\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u00032\b\u0010\u001A\u001A\u0004\u0018\u00010\u001B2\u0014\b\u0002\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\u00010\u001D¢\u0006\u0002\b\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001F\u001A\r\u0010 \u001A\u00020!H\u0007¢\u0006\u0002\u0010\"\u001A\u0019\u0010#\u001A\u00020\u00162\n\b\u0002\u0010$\u001A\u0004\u0018\u00010%H\u0001¢\u0006\u0002\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\'²\u0006\n\u0010(\u001A\u00020\nX\u008A\u008E\u0002"}, d2 = {"AnchorItems", "", "enabled", "", "height", "Landroidx/compose/ui/unit/Dp;", "alignment", "Landroidx/compose/ui/Alignment;", "onSizeChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "width", "content", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "AnchorItems-EUb7tLY", "(ZFLandroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SwipeableItem", "swipeState", "Lcom/kakao/tistory/presentation/widget/swipe/CommonSwipeState;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "swipeEnabled", "anchorsProvider", "Lcom/kakao/tistory/presentation/widget/swipe/SwipeAnchors;", "onUpdateSwipeIndex", "Lkotlin/Function0;", "SwipeableItem-OadGlvw", "(Lcom/kakao/tistory/presentation/widget/swipe/CommonSwipeState;JZLcom/kakao/tistory/presentation/widget/swipe/SwipeAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "rememberCommonSwipeGroupState", "Lcom/kakao/tistory/presentation/widget/swipe/CommonSwipeGroupState;", "(Landroidx/compose/runtime/Composer;I)Lcom/kakao/tistory/presentation/widget/swipe/CommonSwipeGroupState;", "rememberCommonSwipeState", "key", "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Lcom/kakao/tistory/presentation/widget/swipe/CommonSwipeState;", "presentation_prodRelease", "contentHeight"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwipeableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableItem.kt\ncom/kakao/tistory/presentation/widget/swipe/SwipeableItemKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,239:1\n488#2:240\n487#2,4:241\n491#2,2:248\n495#2:254\n1223#3,3:245\n1226#3,3:251\n1223#3,6:255\n1223#3,6:296\n1223#3,6:304\n1223#3,6:311\n1223#3,6:317\n1223#3,6:323\n1223#3,6:329\n1223#3,6:335\n1223#3,6:420\n1223#3,6:470\n1223#3,6:476\n487#4:250\n71#5:261\n69#5,5:262\n74#5:295\n71#5:341\n68#5,6:342\n74#5:376\n78#5:380\n78#5:384\n71#5:385\n69#5,5:386\n74#5:419\n78#5:469\n78#6,6:267\n85#6,4:282\n89#6,2:292\n78#6,6:348\n85#6,4:363\n89#6,2:373\n93#6:379\n93#6:383\n78#6,6:391\n85#6,4:406\n89#6,2:416\n78#6,6:433\n85#6,4:448\n89#6,2:458\n93#6:464\n93#6:468\n368#7,9:273\n377#7:294\n368#7,9:354\n377#7:375\n378#7,2:377\n378#7,2:381\n368#7,9:397\n377#7:418\n368#7,9:439\n377#7:460\n378#7,2:462\n378#7,2:466\n4032#8,6:286\n4032#8,6:367\n4032#8,6:410\n4032#8,6:452\n77#9:302\n77#9:310\n1#10:303\n98#11:426\n95#11,6:427\n101#11:461\n105#11:465\n81#12:482\n107#12,2:483\n*S KotlinDebug\n*F\n+ 1 SwipeableItem.kt\ncom/kakao/tistory/presentation/widget/swipe/SwipeableItemKt\n*L\n29#1:240\n29#1:241,4\n29#1:248,2\n29#1:254\n29#1:245,3\n29#1:251,3\n31#1:255,6\n50#1:296,6\n56#1:304,6\n65#1:311,6\n71#1:317,6\n72#1:323,6\n77#1:329,6\n79#1:335,6\n106#1:420,6\n129#1:470,6\n159#1:476,6\n29#1:250\n43#1:261\n43#1:262,5\n43#1:295\n70#1:341\n70#1:342,6\n70#1:376\n70#1:380\n43#1:384\n97#1:385\n97#1:386,5\n97#1:419\n97#1:469\n43#1:267,6\n43#1:282,4\n43#1:292,2\n70#1:348,6\n70#1:363,4\n70#1:373,2\n70#1:379\n43#1:383\n97#1:391,6\n97#1:406,4\n97#1:416,2\n103#1:433,6\n103#1:448,4\n103#1:458,2\n103#1:464\n97#1:468\n43#1:273,9\n43#1:294\n70#1:354,9\n70#1:375\n70#1:377,2\n43#1:381,2\n97#1:397,9\n97#1:418\n103#1:439,9\n103#1:460\n103#1:462,2\n97#1:466,2\n43#1:286,6\n70#1:367,6\n97#1:410,6\n103#1:452,6\n54#1:302\n63#1:310\n103#1:426\n103#1:427,6\n103#1:461\n103#1:465\n50#1:482\n50#1:483,2\n*E\n"})
public final class SwipeableItemKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void AnchorItems-EUb7tLY(boolean z, float f, @NotNull Alignment alignment0, @NotNull Function1 function10, @Nullable Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Function3 function31;
        int v2;
        Intrinsics.checkNotNullParameter(alignment0, "alignment");
        Intrinsics.checkNotNullParameter(function10, "onSizeChanged");
        Composer composer1 = composer0.startRestartGroup(0x15930BC1);
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
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(alignment0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function31 = function30;
        }
        else if((0xE000 & v) == 0) {
            function31 = function30;
            v2 |= (composer1.changedInstance(function31) ? 0x4000 : 0x2000);
        }
        else {
            function31 = function30;
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            if((v1 & 16) != 0) {
                function31 = null;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x15930BC1, v2, -1, "com.kakao.tistory.presentation.widget.swipe.AnchorItems (SwipeableItem.kt:94)");
            }
            if(function31 != null) {
                Companion modifier$Companion0 = Modifier.Companion;
                Modifier modifier0 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), f);
                MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment0, false);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
                Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    d.a(v3, composer1, v3, function20);
                }
                Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
                Modifier modifier2 = SizeKt.fillMaxHeight$default(modifier$Companion0, 0.0f, 1, null);
                composer1.startReplaceGroup(0xC8C810B1);
                l l0 = composer1.rememberedValue();
                if((((v2 & 0x1C00) == 0x800 ? 1 : 0) | ((v2 & 14) == 4 ? 1 : 0)) != 0 || l0 == Composer.Companion.getEmpty()) {
                    l0 = new l(function10, z);
                    composer1.updateRememberedValue(l0);
                }
                composer1.endReplaceGroup();
                Modifier modifier3 = LayoutModifierKt.layout(modifier2, l0);
                MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
                int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
                Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    d.a(v4, composer1, v4, function21);
                }
                Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
                function31.invoke(RowScopeInstance.INSTANCE, composer1, ((int)(v2 >> 9 & 0x70 | 6)));
                composer1.endNode();
                composer1.endNode();
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(z, f, alignment0, function10, function31, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SwipeableItem-OadGlvw(@Nullable CommonSwipeState commonSwipeState0, long v, boolean z, @Nullable SwipeAnchors swipeAnchors0, @Nullable Function1 function10, @NotNull Function2 function20, @Nullable Composer composer0, int v1, int v2) {
        Function1 function11;
        long v5;
        int v6;
        Function1 function12;
        int v4;
        int v3;
        CommonSwipeState commonSwipeState1;
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0xCFE8EEA8);
        if((v1 & 14) == 0) {
            if((v2 & 1) == 0) {
                commonSwipeState1 = commonSwipeState0;
                v3 = composer1.changed(commonSwipeState1) ? 4 : 2;
            }
            else {
                commonSwipeState1 = commonSwipeState0;
                v3 = 2;
            }
            v4 = v3 | v1;
        }
        else {
            commonSwipeState1 = commonSwipeState0;
            v4 = v1;
        }
        if((v2 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v4 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 |= (composer1.changed(swipeAnchors0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x5B6DB) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 1) != 0) {
                    commonSwipeState1 = SwipeableItemKt.rememberCommonSwipeState(null, composer1, 0, 1);
                    v4 &= -15;
                }
                function12 = (v2 & 16) == 0 ? function10 : n.a;
                v6 = v4;
                v5 = (v2 & 2) == 0 ? v : 0xFF88888800000000L;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 1) != 0) {
                    v4 &= -15;
                }
                function12 = function10;
                v6 = v4;
                v5 = v;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCFE8EEA8, v6, -1, "com.kakao.tistory.presentation.widget.swipe.SwipeableItem (SwipeableItem.kt:27)");
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = androidx.room.a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            Boolean boolean0 = Boolean.valueOf(z);
            composer1.startReplaceGroup(0x93C8E8A6);
            int v7 = v6 & 14 ^ 6;
            int v8 = (v7 <= 4 || !composer1.changed(commonSwipeState1)) && (v6 & 6) != 4 ? 0 : 1;
            o o0 = composer1.rememberedValue();
            if((v8 | ((v6 & 0x380) == 0x100 ? 1 : 0)) != 0 || o0 == composer$Companion0.getEmpty()) {
                o0 = new o(z, commonSwipeState1, null);
                composer1.updateRememberedValue(o0);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolean0, o0, composer1, v6 >> 6 & 14 | 0x40);
            DraggableState draggableState0 = DraggableKt.rememberDraggableState(new x(coroutineScope0, commonSwipeState1), composer1, 0);
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = BackgroundKt.background-bw27NRU$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), null, false, 3, null), v5, null, 2, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                d.a(v9, composer1, v9, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            composer1.startReplaceGroup(-1802402444);
            MutableState mutableState0 = composer1.rememberedValue();
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            boolean z1 = commonSwipeState1.getDragDirection() == DragDirection.Start;
            float f = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toDp-u2uoSUM(((Number)mutableState0.getValue()).intValue());
            Alignment alignment0 = alignment$Companion0.getCenterStart();
            composer1.startReplaceGroup(-1802394702);
            boolean z2 = v7 > 4 && composer1.changed(commonSwipeState1) || (v6 & 6) == 4;
            p p0 = composer1.rememberedValue();
            if(z2 || p0 == composer$Companion0.getEmpty()) {
                p0 = new p(commonSwipeState1);
                composer1.updateRememberedValue(p0);
            }
            composer1.endReplaceGroup();
            boolean z3 = true;
            SwipeableItemKt.AnchorItems-EUb7tLY(z1, f, alignment0, p0, (swipeAnchors0 == null ? null : swipeAnchors0.getStart()), composer1, 0x180, 0);
            boolean z4 = commonSwipeState1.getDragDirection() == DragDirection.End;
            float f1 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toDp-u2uoSUM(((Number)mutableState0.getValue()).intValue());
            Alignment alignment1 = alignment$Companion0.getCenterEnd();
            composer1.startReplaceGroup(-1802383760);
            boolean z5 = v7 > 4 && composer1.changed(commonSwipeState1) || (v6 & 6) == 4;
            q q0 = composer1.rememberedValue();
            if(z5 || q0 == composer$Companion0.getEmpty()) {
                q0 = new q(commonSwipeState1);
                composer1.updateRememberedValue(q0);
            }
            composer1.endReplaceGroup();
            SwipeableItemKt.AnchorItems-EUb7tLY(z4, f1, alignment1, q0, (swipeAnchors0 == null ? null : swipeAnchors0.getEnd()), composer1, 0x180, 0);
            composer1.startReplaceGroup(0x9491E505);
            boolean z6 = v7 > 4 && composer1.changed(commonSwipeState1) || (v6 & 6) == 4;
            r r0 = composer1.rememberedValue();
            if(z6 || r0 == composer$Companion0.getEmpty()) {
                r0 = new r(commonSwipeState1);
                composer1.updateRememberedValue(r0);
            }
            composer1.endReplaceGroup();
            Modifier modifier2 = GraphicsLayerModifierKt.graphicsLayer(modifier$Companion0, r0);
            composer1.startReplaceGroup(-1802375569);
            s s0 = composer1.rememberedValue();
            if(s0 == composer$Companion0.getEmpty()) {
                s0 = new s(mutableState0);
                composer1.updateRememberedValue(s0);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = OnRemeasuredModifierKt.onSizeChanged(modifier2, s0);
            Orientation orientation0 = Orientation.Horizontal;
            composer1.startReplaceGroup(0x949207F6);
            t t0 = composer1.rememberedValue();
            if((v6 & 0xE000) == 0x4000 || t0 == composer$Companion0.getEmpty()) {
                t0 = new t(function12, null);
                composer1.updateRememberedValue(t0);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(-1802366413);
            if((v7 <= 4 || !composer1.changed(commonSwipeState1)) && (v6 & 6) != 4) {
                z3 = false;
            }
            u u0 = composer1.rememberedValue();
            if(z3 || u0 == composer$Companion0.getEmpty()) {
                u0 = new u(commonSwipeState1, null);
                composer1.updateRememberedValue(u0);
            }
            composer1.endReplaceGroup();
            Modifier modifier4 = DraggableKt.draggable$default(modifier3, draggableState0, orientation0, swipeAnchors0 != null, null, false, t0, u0, false, 0x98, null);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
            Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
                d.a(v10, composer1, v10, function22);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v6 >> 15 & 14)));
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function11 = function12;
        }
        else {
            composer1.skipToGroupEnd();
            v5 = v;
            function11 = function10;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(commonSwipeState1, v5, z, swipeAnchors0, function11, function20, v1, v2));
        }
    }

    public static final void access$SwipeableItem_OadGlvw$lambda$13$lambda$3(MutableState mutableState0, int v) {
        mutableState0.setValue(v);
    }

    @Composable
    @NotNull
    public static final CommonSwipeGroupState rememberCommonSwipeGroupState(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0xF8224BA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF8224BA, v, -1, "com.kakao.tistory.presentation.widget.swipe.rememberCommonSwipeGroupState (SwipeableItem.kt:127)");
        }
        composer0.startReplaceGroup(0xD09AA4D4);
        CommonSwipeGroupState commonSwipeGroupState0 = composer0.rememberedValue();
        if(commonSwipeGroupState0 == Composer.Companion.getEmpty()) {
            commonSwipeGroupState0 = new CommonSwipeGroupState();
            composer0.updateRememberedValue(commonSwipeGroupState0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return commonSwipeGroupState0;
    }

    @Composable
    @NotNull
    public static final CommonSwipeState rememberCommonSwipeState(@Nullable Object object0, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceGroup(0x501CC6AA);
        if((v1 & 1) != 0) {
            object0 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x501CC6AA, v, -1, "com.kakao.tistory.presentation.widget.swipe.rememberCommonSwipeState (SwipeableItem.kt:157)");
        }
        composer0.startReplaceGroup(0x8A960C6F);
        boolean z = composer0.changed(object0);
        CommonSwipeState commonSwipeState0 = composer0.rememberedValue();
        if(z || commonSwipeState0 == Composer.Companion.getEmpty()) {
            commonSwipeState0 = new CommonSwipeState();
            composer0.updateRememberedValue(commonSwipeState0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return commonSwipeState0;
    }
}

