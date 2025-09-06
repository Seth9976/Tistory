package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u0083\u0001\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013\u00A2\u0006\u0002\b\u0015\u00A2\u0006\u0002\b\u0016H\u0007\u00A2\u0006\u0002\u0010\u0017\u001A_\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013\u00A2\u0006\u0002\b\u0015\u00A2\u0006\u0002\b\u0016H\u0007\u00A2\u0006\u0002\u0010\u0018\u001Aw\u0010\u0019\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013\u00A2\u0006\u0002\b\u0015\u00A2\u0006\u0002\b\u0016H\u0007\u00A2\u0006\u0002\u0010\u001A\u001AS\u0010\u0019\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013\u00A2\u0006\u0002\b\u0015\u00A2\u0006\u0002\b\u0016H\u0007\u00A2\u0006\u0002\u0010\u001B\u001A\u0081\u0001\u0010\u001C\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013\u00A2\u0006\u0002\b\u0015\u00A2\u0006\u0002\b\u0016H\u0007\u00A2\u0006\u0002\u0010\u0017\u001A]\u0010\u001C\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013\u00A2\u0006\u0002\b\u0015\u00A2\u0006\u0002\b\u0016H\u0007\u00A2\u0006\u0002\u0010\u0018\u00A8\u0006\u001D"}, d2 = {"Card", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/CardColors;", "elevation", "Landroidx/compose/material3/CardElevation;", "border", "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedCard", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedCard", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,851:1\n1223#2,6:852\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt\n*L\n150#1:852,6\n*E\n"})
public final class CardKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Card(@Nullable Modifier modifier0, @Nullable Shape shape0, @Nullable CardColors cardColors0, @Nullable CardElevation cardElevation0, @Nullable BorderStroke borderStroke0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        BorderStroke borderStroke1;
        CardElevation cardElevation1;
        Shape shape1;
        Modifier modifier1;
        CardElevation cardElevation2;
        int v4;
        BorderStroke borderStroke2;
        CardColors cardColors2;
        CardElevation cardElevation3;
        int v3;
        CardColors cardColors1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x464F98B1);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.changed(shape0) ? 16 : 0x20);
        }
        if((v & 0x180) == 0) {
            if((v1 & 4) == 0) {
                cardColors1 = cardColors0;
                v3 = composer1.changed(cardColors1) ? 0x100 : 0x80;
            }
            else {
                cardColors1 = cardColors0;
                v3 = 0x80;
            }
            v2 |= v3;
        }
        else {
            cardColors1 = cardColors0;
        }
        if((v & 0xC00) == 0) {
            v2 |= ((v1 & 8) != 0 || !composer1.changed(cardElevation0) ? 0x400 : 0x800);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(borderStroke0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 2) == 0) {
                    shape1 = shape0;
                }
                else {
                    shape1 = CardDefaults.INSTANCE.getShape(composer1, 6);
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 4) == 0) {
                    cardColors2 = cardColors1;
                }
                else {
                    cardColors2 = CardDefaults.INSTANCE.cardColors(composer1, 6);
                    v2 &= -897;
                }
                if((v1 & 8) == 0) {
                    cardElevation3 = cardElevation0;
                }
                else {
                    cardElevation3 = CardDefaults.INSTANCE.cardElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                    v2 &= 0xFFFFE3FF;
                }
                borderStroke2 = (v1 & 16) == 0 ? borderStroke0 : null;
                v4 = v2;
                cardElevation2 = cardElevation3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                modifier1 = modifier0;
                shape1 = shape0;
                cardColors2 = cardColors1;
                borderStroke2 = borderStroke0;
                v4 = v2;
                cardElevation2 = cardElevation0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x464F98B1, v4, -1, "androidx.compose.material3.Card (Card.kt:87)");
            }
            SurfaceKt.Surface-T9BRK9s(modifier1, shape1, cardColors2.containerColor-vNxB06k$material3_release(true), cardColors2.contentColor-vNxB06k$material3_release(true), 0.0f, ((Dp)cardElevation2.shadowElevation$material3_release(true, null, composer1, v4 >> 3 & 0x380 | 54).getValue()).unbox-impl(), borderStroke2, ComposableLambdaKt.rememberComposableLambda(664103990, true, new r2(function30), composer1, 54), composer1, v4 & 14 | 0xC00000 | v4 & 0x70 | 0x380000 & v4 << 6, 16);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            cardColors1 = cardColors2;
            cardElevation1 = cardElevation2;
            borderStroke1 = borderStroke2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            shape1 = shape0;
            cardElevation1 = cardElevation0;
            borderStroke1 = borderStroke0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s2(modifier1, shape1, cardColors1, cardElevation1, borderStroke1, function30, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Card(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, @Nullable CardColors cardColors0, @Nullable CardElevation cardElevation0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        BorderStroke borderStroke1;
        CardElevation cardElevation1;
        CardColors cardColors1;
        Shape shape2;
        boolean z2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource4;
        BorderStroke borderStroke2;
        int v4;
        CardColors cardColors2;
        MutableInteractionSource mutableInteractionSource2;
        int v5;
        int v3;
        Shape shape1;
        boolean z1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x8757EAE0);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x180) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x800 : 0x400;
            }
            else {
                shape1 = shape0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((v & 0x6000) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changed(cardColors0) ? 0x2000 : 0x4000);
        }
        if((0x30000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(cardElevation0) ? 0x10000 : 0x20000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x180000 & v) == 0) {
            v2 |= (composer1.changed(borderStroke0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v2) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 4) != 0) {
                    z1 = true;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                    shape1 = CardDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v1 & 16) == 0) {
                    cardColors2 = cardColors0;
                }
                else {
                    cardColors2 = CardDefaults.INSTANCE.cardColors(composer1, 6);
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) == 0) {
                    v5 = v1 & 0x80;
                    cardElevation1 = cardElevation0;
                }
                else {
                    v5 = v1 & 0x80;
                    cardElevation1 = CardDefaults.INSTANCE.cardElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                    v2 &= 0xFFF8FFFF;
                }
                mutableInteractionSource2 = v5 == 0 ? mutableInteractionSource0 : null;
                v4 = v2;
                borderStroke2 = (v1 & 0x40) == 0 ? borderStroke0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                mutableInteractionSource2 = mutableInteractionSource0;
                cardColors2 = cardColors0;
                cardElevation1 = cardElevation0;
                v4 = v2;
                borderStroke2 = borderStroke0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8757EAE0, v4, -1, "androidx.compose.material3.Card (Card.kt:147)");
            }
            composer1.startReplaceGroup(0x75CF5E8F);
            if(mutableInteractionSource2 == null) {
                MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource3);
                }
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            else {
                mutableInteractionSource4 = mutableInteractionSource2;
            }
            composer1.endReplaceGroup();
            SurfaceKt.Surface-o_FOJdg(function00, modifier1, z1, shape1, cardColors2.containerColor-vNxB06k$material3_release(z1), cardColors2.contentColor-vNxB06k$material3_release(z1), 0.0f, ((Dp)cardElevation1.shadowElevation$material3_release(z1, mutableInteractionSource4, composer1, v4 >> 6 & 14 | v4 >> 9 & 0x380).getValue()).unbox-impl(), borderStroke2, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(0x2E4EDFEB, true, new t2(function30), composer1, 54), composer1, v4 & 0x1FFE | 0xE000000 & v4 << 6, 6, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier1;
            shape2 = shape1;
            mutableInteractionSource1 = mutableInteractionSource2;
            cardColors1 = cardColors2;
            borderStroke1 = borderStroke2;
            z2 = z1;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            z2 = z1;
            shape2 = shape1;
            cardColors1 = cardColors0;
            cardElevation1 = cardElevation0;
            borderStroke1 = borderStroke0;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u2(function00, modifier2, z2, shape2, cardColors1, cardElevation1, borderStroke1, mutableInteractionSource1, function30, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ElevatedCard(@Nullable Modifier modifier0, @Nullable Shape shape0, @Nullable CardColors cardColors0, @Nullable CardElevation cardElevation0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        CardElevation cardElevation1;
        CardColors cardColors1;
        Shape shape1;
        Modifier modifier1;
        int v3;
        int v2;
        Composer composer1 = composer0.startRestartGroup(895940201);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.changed(shape0) ? 16 : 0x20);
        }
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changed(cardColors0) ? 0x80 : 0x100);
        }
        if((v & 0xC00) == 0) {
            v2 |= ((v1 & 8) != 0 || !composer1.changed(cardElevation0) ? 0x400 : 0x800);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 2) == 0) {
                    shape1 = shape0;
                }
                else {
                    shape1 = CardDefaults.INSTANCE.getElevatedShape(composer1, 6);
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 4) == 0) {
                    cardColors1 = cardColors0;
                }
                else {
                    cardColors1 = CardDefaults.INSTANCE.elevatedCardColors(composer1, 6);
                    v2 &= -897;
                }
                if((v1 & 8) == 0) {
                    v3 = v2;
                    cardElevation1 = cardElevation0;
                }
                else {
                    v3 = v2 & 0xFFFFE3FF;
                    cardElevation1 = CardDefaults.INSTANCE.elevatedCardElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                modifier1 = modifier0;
                shape1 = shape0;
                cardColors1 = cardColors0;
                v3 = v2;
                cardElevation1 = cardElevation0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(895940201, v3, -1, "androidx.compose.material3.ElevatedCard (Card.kt:200)");
            }
            CardKt.Card(modifier1, shape1, cardColors1, cardElevation1, null, function30, composer1, v3 & 14 | 0x6000 | v3 & 0x70 | v3 & 0x380 | v3 & 0x1C00 | v3 << 3 & 0x70000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            shape1 = shape0;
            cardColors1 = cardColors0;
            cardElevation1 = cardElevation0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v2(modifier1, shape1, cardColors1, cardElevation1, function30, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ElevatedCard(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, @Nullable CardColors cardColors0, @Nullable CardElevation cardElevation0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        CardElevation cardElevation2;
        Shape shape2;
        boolean z2;
        MutableInteractionSource mutableInteractionSource2;
        CardElevation cardElevation3;
        CardColors cardColors2;
        int v6;
        int v5;
        CardElevation cardElevation1;
        int v4;
        CardColors cardColors1;
        int v3;
        Shape shape1;
        boolean z1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x91AC5208);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x180) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x800 : 0x400;
            }
            else {
                shape1 = shape0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                cardColors1 = cardColors0;
                v4 = composer1.changed(cardColors1) ? 0x4000 : 0x2000;
            }
            else {
                cardColors1 = cardColors0;
                v4 = 0x2000;
            }
            v2 |= v4;
        }
        else {
            cardColors1 = cardColors0;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                cardElevation1 = cardElevation0;
                v5 = composer1.changed(cardElevation1) ? 0x20000 : 0x10000;
            }
            else {
                cardElevation1 = cardElevation0;
                v5 = 0x10000;
            }
            v2 |= v5;
        }
        else {
            cardElevation1 = cardElevation0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v2) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 4) != 0) {
                    z1 = true;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                    shape1 = CardDefaults.INSTANCE.getElevatedShape(composer1, 6);
                }
                if((v1 & 16) == 0) {
                    cardColors2 = cardColors1;
                }
                else {
                    cardColors2 = CardDefaults.INSTANCE.elevatedCardColors(composer1, 6);
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                    cardElevation1 = CardDefaults.INSTANCE.elevatedCardElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                }
                mutableInteractionSource2 = (v1 & 0x40) == 0 ? mutableInteractionSource0 : null;
                v6 = v2;
                cardElevation3 = cardElevation1;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                v6 = v2;
                cardColors2 = cardColors1;
                cardElevation3 = cardElevation1;
                mutableInteractionSource2 = mutableInteractionSource0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x91AC5208, v6, -1, "androidx.compose.material3.ElevatedCard (Card.kt:254)");
            }
            CardKt.Card(function00, modifier1, z1, shape1, cardColors2, cardElevation3, null, mutableInteractionSource2, function30, composer1, v6 & 14 | 0x180000 | v6 & 0x70 | v6 & 0x380 | v6 & 0x1C00 | 0xE000 & v6 | 0x70000 & v6 | 0x1C00000 & v6 << 3 | v6 << 3 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            cardColors1 = cardColors2;
            cardElevation2 = cardElevation3;
            z2 = z1;
            mutableInteractionSource1 = mutableInteractionSource2;
            shape2 = shape1;
        }
        else {
            composer1.skipToGroupEnd();
            z2 = z1;
            shape2 = shape1;
            cardElevation2 = cardElevation1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w2(function00, modifier1, z2, shape2, cardColors1, cardElevation2, mutableInteractionSource1, function30, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OutlinedCard(@Nullable Modifier modifier0, @Nullable Shape shape0, @Nullable CardColors cardColors0, @Nullable CardElevation cardElevation0, @Nullable BorderStroke borderStroke0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        CardElevation cardElevation2;
        CardColors cardColors1;
        Shape shape1;
        Modifier modifier1;
        BorderStroke borderStroke2;
        BorderStroke borderStroke1;
        int v3;
        CardElevation cardElevation1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x2C20A233);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.changed(shape0) ? 16 : 0x20);
        }
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changed(cardColors0) ? 0x80 : 0x100);
        }
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                cardElevation1 = cardElevation0;
                v3 = composer1.changed(cardElevation1) ? 0x800 : 0x400;
            }
            else {
                cardElevation1 = cardElevation0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            cardElevation1 = cardElevation0;
        }
        if((v & 0x6000) == 0) {
            borderStroke1 = borderStroke0;
            v2 |= ((v1 & 16) != 0 || !composer1.changed(borderStroke1) ? 0x2000 : 0x4000);
        }
        else {
            borderStroke1 = borderStroke0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 2) == 0) {
                    shape1 = shape0;
                }
                else {
                    shape1 = CardDefaults.INSTANCE.getOutlinedShape(composer1, 6);
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 4) == 0) {
                    cardColors1 = cardColors0;
                }
                else {
                    cardColors1 = CardDefaults.INSTANCE.outlinedCardColors(composer1, 6);
                    v2 &= -897;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                    cardElevation1 = CardDefaults.INSTANCE.outlinedCardElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                }
                if((v1 & 16) == 0) {
                    borderStroke2 = borderStroke0;
                }
                else {
                    borderStroke2 = CardDefaults.INSTANCE.outlinedCardBorder(false, composer1, 0x30, 1);
                    v2 &= 0xFFFF1FFF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                modifier1 = modifier0;
                shape1 = shape0;
                cardColors1 = cardColors0;
                borderStroke2 = borderStroke1;
            }
            cardElevation2 = cardElevation1;
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2C20A233, v2, -1, "androidx.compose.material3.OutlinedCard (Card.kt:303)");
            }
            CardKt.Card(modifier1, shape1, cardColors1, cardElevation2, borderStroke2, function30, composer1, v2 & 0x7FFFE, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            borderStroke1 = borderStroke2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            shape1 = shape0;
            cardColors1 = cardColors0;
            cardElevation2 = cardElevation1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s2(modifier1, shape1, cardColors1, cardElevation2, borderStroke1, function30, v, v1, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OutlinedCard(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, @Nullable CardColors cardColors0, @Nullable CardElevation cardElevation0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        BorderStroke borderStroke1;
        MutableInteractionSource mutableInteractionSource1;
        CardElevation cardElevation1;
        CardColors cardColors2;
        Shape shape2;
        boolean z2;
        Modifier modifier2;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        CardElevation cardElevation2;
        int v5;
        int v4;
        CardColors cardColors1;
        int v3;
        Shape shape1;
        boolean z1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-727137250);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x180) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x800 : 0x400;
            }
            else {
                shape1 = shape0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                cardColors1 = cardColors0;
                v4 = composer1.changed(cardColors1) ? 0x4000 : 0x2000;
            }
            else {
                cardColors1 = cardColors0;
                v4 = 0x2000;
            }
            v2 |= v4;
        }
        else {
            cardColors1 = cardColors0;
        }
        if((0x30000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(cardElevation0) ? 0x10000 : 0x20000);
        }
        if((0x180000 & v) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(borderStroke0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((0xC00000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 4) != 0) {
                    z1 = true;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                    shape1 = CardDefaults.INSTANCE.getOutlinedShape(composer1, 6);
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    cardColors1 = CardDefaults.INSTANCE.outlinedCardColors(composer1, 6);
                }
                if((v1 & 0x20) == 0) {
                    v5 = v1 & 0x80;
                    cardElevation2 = cardElevation0;
                }
                else {
                    v5 = v1 & 0x80;
                    cardElevation2 = CardDefaults.INSTANCE.outlinedCardElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) == 0) {
                    borderStroke2 = borderStroke0;
                }
                else {
                    borderStroke2 = CardDefaults.INSTANCE.outlinedCardBorder(z1, composer1, v2 >> 6 & 14 | 0x30, 0);
                    v2 &= 0xFFC7FFFF;
                }
                mutableInteractionSource2 = v5 == 0 ? mutableInteractionSource0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                cardElevation2 = cardElevation0;
                mutableInteractionSource2 = mutableInteractionSource0;
                borderStroke2 = borderStroke0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-727137250, v2, -1, "androidx.compose.material3.OutlinedCard (Card.kt:359)");
            }
            CardKt.Card(function00, modifier1, z1, shape1, cardColors1, cardElevation2, borderStroke2, mutableInteractionSource2, function30, composer1, v2 & 0xFFFFFFE, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier1;
            z2 = z1;
            cardColors2 = cardColors1;
            borderStroke1 = borderStroke2;
            cardElevation1 = cardElevation2;
            shape2 = shape1;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            z2 = z1;
            shape2 = shape1;
            cardColors2 = cardColors1;
            cardElevation1 = cardElevation0;
            mutableInteractionSource1 = mutableInteractionSource0;
            borderStroke1 = borderStroke0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u2(function00, modifier2, z2, shape2, cardColors2, cardElevation1, borderStroke1, mutableInteractionSource1, function30, v, v1, 1));
        }
    }
}

