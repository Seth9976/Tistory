package com.kakao.tistory.presentation.widget.swipe;

import a;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A%\u0010\u0000\u001A\u00020\u00012\b\b\u0001\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"CommonAnchorView", "", "resId", "", "onClick", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommonAnchorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonAnchorView.kt\ncom/kakao/tistory/presentation/widget/swipe/CommonAnchorViewKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,43:1\n1223#2,6:44\n1223#2,6:87\n148#3:50\n148#3:86\n71#4:51\n69#4,5:52\n74#4:85\n78#4:96\n78#5,6:57\n85#5,4:72\n89#5,2:82\n93#5:95\n368#6,9:63\n377#6:84\n378#6,2:93\n4032#7,6:76\n*S KotlinDebug\n*F\n+ 1 CommonAnchorView.kt\ncom/kakao/tistory/presentation/widget/swipe/CommonAnchorViewKt\n*L\n22#1:44,6\n37#1:87,6\n28#1:50\n33#1:86\n23#1:51\n23#1:52,5\n23#1:85\n23#1:96\n23#1:57,6\n23#1:72,4\n23#1:82,2\n23#1:95\n23#1:63,9\n23#1:84\n23#1:93,2\n23#1:76,6\n*E\n"})
public final class CommonAnchorViewKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommonAnchorView(@DrawableRes int v, @NotNull Function0 function00, @Nullable Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(0x9EFEC77B);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9EFEC77B, v2, -1, "com.kakao.tistory.presentation.widget.swipe.CommonAnchorView (CommonAnchorView.kt:20)");
            }
            composer1.startReplaceGroup(-145892100);
            MutableInteractionSource mutableInteractionSource0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableInteractionSource0 == composer$Companion0.getEmpty()) {
                mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
                composer1.updateRememberedValue(mutableInteractionSource0);
            }
            composer1.endReplaceGroup();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = IndicationKt.indication(SizeKt.wrapContentSize$default(modifier$Companion0, null, false, 3, null), mutableInteractionSource0, RippleKt.ripple-H2RKhps$default(false, 30.0f, 0L, 4, null));
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Modifier modifier2 = SizeKt.size-3ABfNKs(modifier$Companion0, 48.0f);
            composer1.startReplaceGroup(0xD30A08C1);
            com.kakao.tistory.presentation.widget.swipe.a a0 = composer1.rememberedValue();
            if((v2 & 0x70) == 0x20 || a0 == composer$Companion0.getEmpty()) {
                a0 = new com.kakao.tistory.presentation.widget.swipe.a(function00);
                composer1.updateRememberedValue(a0);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = ClickableKt.clickable-O2vRcR0$default(modifier2, mutableInteractionSource0, null, false, null, null, a0, 28, null);
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(v, composer1, v2 & 14), null, modifier3, 0L, composer1, 0xC38, 0);
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
            scopeUpdateScope0.updateScope(new b(v, function00, v1));
        }
    }
}

