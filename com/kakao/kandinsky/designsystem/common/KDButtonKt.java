package com.kakao.kandinsky.designsystem.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.gb;
import androidx.compose.material3.i3;
import androidx.compose.material3.y;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.room.a;
import ca.h1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0081\u0001\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001AV\u0010\u0018\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\u0011\u0010\u0012\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u0019\u001Ad\u0010\u001A\u001A\u00020\u00012\u0006\u0010\u001B\u001A\u00020\u00072\u0012\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\u001D2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\u0011\u0010\u0012\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u001E¨\u0006\u001F"}, d2 = {"KDButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Lcom/kakao/kandinsky/designsystem/common/KDButtonColors;", "border", "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Lcom/kakao/kandinsky/designsystem/common/KDButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "KDIconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLcom/kakao/kandinsky/designsystem/common/KDButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "KDIconToggleButton", "checked", "onCheckedChange", "Lcom/kakao/kandinsky/designsystem/common/KDToggleButtonColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLcom/kakao/kandinsky/designsystem/common/KDToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKDButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDButton.kt\ncom/kakao/kandinsky/designsystem/common/KDButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,240:1\n148#2:241\n148#2:254\n148#2:300\n1223#3,6:242\n1223#3,6:248\n1223#3,6:294\n71#4:255\n69#4,5:256\n74#4:289\n78#4:293\n71#4:301\n69#4,5:302\n74#4:335\n78#4:339\n78#5,6:261\n85#5,4:276\n89#5,2:286\n93#5:292\n78#5,6:307\n85#5,4:322\n89#5,2:332\n93#5:338\n368#6,9:267\n377#6:288\n378#6,2:290\n368#6,9:313\n377#6:334\n378#6,2:336\n4032#7,6:280\n4032#7,6:326\n*S KotlinDebug\n*F\n+ 1 KDButton.kt\ncom/kakao/kandinsky/designsystem/common/KDButtonKt\n*L\n29#1:241\n69#1:254\n97#1:300\n30#1:242,6\n64#1:248,6\n92#1:294,6\n67#1:255\n67#1:256,5\n67#1:289\n67#1:293\n95#1:301\n95#1:302,5\n95#1:335\n95#1:339\n67#1:261,6\n67#1:276,4\n67#1:286,2\n67#1:292\n95#1:307,6\n95#1:322,4\n95#1:332,2\n95#1:338\n67#1:267,9\n67#1:288\n67#1:290,2\n95#1:313,9\n95#1:334\n95#1:336,2\n67#1:280,6\n95#1:326,6\n*E\n"})
public final class KDButtonKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void KDButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, @Nullable KDButtonColors kDButtonColors0, @Nullable BorderStroke borderStroke0, @Nullable PaddingValues paddingValues0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        PaddingValues paddingValues1;
        BorderStroke borderStroke1;
        KDButtonColors kDButtonColors2;
        Shape shape1;
        boolean z1;
        Modifier modifier1;
        Modifier modifier2;
        BorderStroke borderStroke2;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        boolean z2;
        KDButtonColors kDButtonColors3;
        int v3;
        KDButtonColors kDButtonColors1;
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Intrinsics.checkNotNullParameter(function30, "content");
        Composer composer1 = composer0.startRestartGroup(0xD6A480BC);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(shape0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            if((v1 & 16) == 0) {
                kDButtonColors1 = kDButtonColors0;
                v3 = composer1.changed(kDButtonColors1) ? 0x4000 : 0x2000;
            }
            else {
                kDButtonColors1 = kDButtonColors0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            kDButtonColors1 = kDButtonColors0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changed(borderStroke0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((0xE000000 & v) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000000 : 0x2000000);
        }
        if((0xB6DB6DB & v2) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                Shape shape3 = (v1 & 8) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
                if((v1 & 16) == 0) {
                    kDButtonColors3 = kDButtonColors1;
                }
                else {
                    kDButtonColors3 = KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, 0L, 0L, 0L, 0L, composer1, 0x30000, 0x1F);
                    v2 &= 0xFFFF1FFF;
                }
                PaddingValues paddingValues3 = (v1 & 0x40) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
                if((v1 & 0x80) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceGroup(0x3281B098);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceGroup();
                    mutableInteractionSource2 = mutableInteractionSource3;
                }
                modifier2 = modifier3;
                z2 = (v1 & 4) == 0 ? z : true;
                shape2 = shape3;
                borderStroke2 = (v1 & 0x20) == 0 ? borderStroke0 : null;
                paddingValues2 = paddingValues3;
                kDButtonColors1 = kDButtonColors3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                z2 = z;
                paddingValues2 = paddingValues0;
                mutableInteractionSource2 = mutableInteractionSource0;
                shape2 = shape0;
                borderStroke2 = borderStroke0;
                modifier2 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD6A480BC, v2, -1, "com.kakao.kandinsky.designsystem.common.KDButton (KDButton.kt:31)");
            }
            int v4 = v2 >> 6 & 14 | v2 >> 9 & 0x70;
            long v5 = ((Color)kDButtonColors1.containerColor$designsystem_release(z2, composer1, v4).getValue()).unbox-impl();
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(((Color)kDButtonColors1.contentColor$designsystem_release(z2, composer1, v4).getValue()).unbox-impl())), ComposableLambdaKt.rememberComposableLambda(0x127C53FC, true, new h1(modifier2, borderStroke2, shape2, v5, mutableInteractionSource2, z2, function00, paddingValues2, function30), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            shape1 = shape2;
            borderStroke1 = borderStroke2;
            paddingValues1 = paddingValues2;
            mutableInteractionSource1 = mutableInteractionSource2;
            kDButtonColors2 = kDButtonColors1;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            shape1 = shape0;
            kDButtonColors2 = kDButtonColors1;
            borderStroke1 = borderStroke0;
            paddingValues1 = paddingValues0;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(function00, modifier1, z1, shape1, kDButtonColors2, borderStroke1, paddingValues1, mutableInteractionSource1, function30, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void KDIconButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable KDButtonColors kDButtonColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        KDButtonColors kDButtonColors2;
        boolean z1;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource2;
        boolean z2;
        Modifier modifier2;
        int v3;
        KDButtonColors kDButtonColors1;
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0xA0C2D9AC);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            if((v1 & 8) == 0) {
                kDButtonColors1 = kDButtonColors0;
                v3 = composer1.changed(kDButtonColors1) ? 0x800 : 0x400;
            }
            else {
                kDButtonColors1 = kDButtonColors0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            kDButtonColors1 = kDButtonColors0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                boolean z3 = (v1 & 4) == 0 ? z : true;
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                    kDButtonColors1 = KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, 0L, 0L, 0L, 0L, composer1, 0x30000, 0x1F);
                }
                if((v1 & 16) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    modifier2 = modifier3;
                    z2 = z3;
                }
                else {
                    composer1.startReplaceGroup(0xD9F0A773);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceGroup();
                    modifier2 = modifier3;
                    z2 = z3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                modifier2 = modifier0;
                z2 = z;
                mutableInteractionSource2 = mutableInteractionSource0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA0C2D9AC, v2, -1, "com.kakao.kandinsky.designsystem.common.KDIconButton (KDButton.kt:65)");
            }
            int v4 = v2 >> 6 & 0x7E;
            Modifier modifier4 = ClickableKt.clickable-O2vRcR0$default(BackgroundKt.background-bw27NRU(SizeKt.defaultMinSize-VpY3zN4$default(modifier2, 40.0f, 0.0f, 2, null), ((Color)kDButtonColors1.containerColor$designsystem_release(z2, composer1, v4).getValue()).unbox-impl(), RoundedCornerShapeKt.getCircleShape()), mutableInteractionSource2, RippleKt.ripple-H2RKhps$default(false, 0.0f, 0L, 6, null), z2, null, Role.box-impl(0), function00, 8, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function21);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(((Color)kDButtonColors1.contentColor$designsystem_release(z2, composer1, v4).getValue()).unbox-impl())), function20, composer1, ProvidedValue.$stable | v2 >> 12 & 0x70);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            z1 = z2;
            kDButtonColors2 = kDButtonColors1;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            kDButtonColors2 = kDButtonColors1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i3(function00, modifier1, z1, kDButtonColors2, mutableInteractionSource1, function20, v, v1, 3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void KDIconToggleButton(boolean z, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z1, @Nullable KDToggleButtonColors kDToggleButtonColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        KDToggleButtonColors kDToggleButtonColors2;
        boolean z2;
        Modifier modifier1;
        Modifier modifier2;
        boolean z3;
        KDToggleButtonColors kDToggleButtonColors3;
        int v4;
        MutableInteractionSource mutableInteractionSource1;
        int v3;
        KDToggleButtonColors kDToggleButtonColors1;
        int v2;
        Intrinsics.checkNotNullParameter(function10, "onCheckedChange");
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0x8F930547);
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
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
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
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            if((v1 & 16) == 0) {
                kDToggleButtonColors1 = kDToggleButtonColors0;
                v3 = composer1.changed(kDToggleButtonColors1) ? 0x4000 : 0x2000;
            }
            else {
                kDToggleButtonColors1 = kDToggleButtonColors0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            kDToggleButtonColors1 = kDToggleButtonColors0;
        }
        if((v1 & 0x20) == 0) {
            mutableInteractionSource1 = mutableInteractionSource0;
            if((0x70000 & v) == 0) {
                v2 |= (composer1.changed(mutableInteractionSource1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x380000 & v) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((0x2DB6DB & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    kDToggleButtonColors1 = KDButtonDefaults.INSTANCE.toggleButtonColors-dPtIKUs(0.0f, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0xC00000, 0x7F);
                }
                if((v1 & 0x20) == 0) {
                    mutableInteractionSource1 = mutableInteractionSource0;
                    v4 = v2;
                    modifier2 = modifier3;
                }
                else {
                    composer1.startReplaceGroup(-1561597730);
                    MutableInteractionSource mutableInteractionSource2 = composer1.rememberedValue();
                    if(mutableInteractionSource2 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource2 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource2);
                    }
                    composer1.endReplaceGroup();
                    v4 = v2;
                    modifier2 = modifier3;
                    mutableInteractionSource1 = mutableInteractionSource2;
                }
                kDToggleButtonColors3 = kDToggleButtonColors1;
                z3 = (v1 & 8) == 0 ? z1 : true;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                v4 = v2;
                kDToggleButtonColors3 = kDToggleButtonColors1;
                z3 = z1;
                modifier2 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8F930547, v4, -1, "com.kakao.kandinsky.designsystem.common.KDIconToggleButton (KDButton.kt:93)");
            }
            int v5 = v4 >> 9 & 14 | v4 << 3 & 0x70 | v4 >> 6 & 0x380;
            Modifier modifier4 = ToggleableKt.toggleable-O2vRcR0(BackgroundKt.background-bw27NRU$default(SizeKt.defaultMinSize-VpY3zN4$default(modifier2, 40.0f, 0.0f, 2, null), ((Color)kDToggleButtonColors3.containerColor$designsystem_release(z3, z, composer1, v5).getValue()).unbox-impl(), null, 2, null), z, mutableInteractionSource1, RippleKt.ripple-H2RKhps$default(false, 0.0f, 0L, 6, null), z3, Role.box-impl(1), function10);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                a.t(v6, composer1, v6, function21);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(((Color)kDToggleButtonColors3.contentColor$designsystem_release(z3, z, composer1, v5).getValue()).unbox-impl())), function20, composer1, ProvidedValue.$stable | v4 >> 15 & 0x70);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            z2 = z3;
            kDToggleButtonColors2 = kDToggleButtonColors3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            kDToggleButtonColors2 = kDToggleButtonColors1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gb(z, function10, modifier1, z2, kDToggleButtonColors2, mutableInteractionSource1, function20, v, v1, 3));
        }
    }
}

