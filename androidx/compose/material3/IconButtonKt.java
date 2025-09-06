package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.IconButtonTokens;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001Ab\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u000FH\u0007\u00A2\u0006\u0002\u0010\u0010\u001Ap\u0010\u0011\u001A\u00020\u00012\u0006\u0010\u0012\u001A\u00020\u00072\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u00152\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u000FH\u0007\u00A2\u0006\u0002\u0010\u0016\u001Ab\u0010\u0017\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u000FH\u0007\u00A2\u0006\u0002\u0010\u0010\u001Ap\u0010\u0018\u001A\u00020\u00012\u0006\u0010\u0012\u001A\u00020\u00072\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u00152\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u000FH\u0007\u00A2\u0006\u0002\u0010\u0016\u001AX\u0010\u0019\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u000FH\u0007\u00A2\u0006\u0002\u0010\u001A\u001Af\u0010\u001B\u001A\u00020\u00012\u0006\u0010\u0012\u001A\u00020\u00072\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\u00152\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u000FH\u0007\u00A2\u0006\u0002\u0010\u001C\u001An\u0010\u001D\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u000FH\u0007\u00A2\u0006\u0002\u0010 \u001A|\u0010!\u001A\u00020\u00012\u0006\u0010\u0012\u001A\u00020\u00072\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u00152\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u000FH\u0007\u00A2\u0006\u0002\u0010\"\u00A8\u0006#"}, d2 = {"FilledIconButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/IconButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledIconToggleButton", "checked", "onCheckedChange", "Lkotlin/Function1;", "Landroidx/compose/material3/IconToggleButtonColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledTonalIconButton", "FilledTonalIconToggleButton", "IconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconButton", "border", "Landroidx/compose/foundation/BorderStroke;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1292:1\n71#2:1293\n71#2:1333\n71#3:1294\n69#3,5:1295\n74#3:1328\n78#3:1332\n71#3:1334\n69#3,5:1335\n74#3:1368\n78#3:1372\n78#4,6:1300\n85#4,4:1315\n89#4,2:1325\n93#4:1331\n78#4,6:1340\n85#4,4:1355\n89#4,2:1365\n93#4:1371\n368#5,9:1306\n377#5:1327\n378#5,2:1329\n368#5,9:1346\n377#5:1367\n378#5,2:1369\n4032#6,6:1319\n4032#6,6:1359\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt\n*L\n105#1:1293\n171#1:1333\n90#1:1294\n90#1:1295,5\n90#1:1328\n90#1:1332\n155#1:1334\n155#1:1335,5\n155#1:1368\n155#1:1372\n90#1:1300,6\n90#1:1315,4\n90#1:1325,2\n90#1:1331\n155#1:1340,6\n155#1:1355,4\n155#1:1365,2\n155#1:1371\n90#1:1306,9\n90#1:1327\n90#1:1329,2\n155#1:1346,9\n155#1:1367\n155#1:1369,2\n90#1:1319,6\n155#1:1359,6\n*E\n"})
public final class IconButtonKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FilledIconButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, @Nullable IconButtonColors iconButtonColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        IconButtonColors iconButtonColors2;
        Shape shape2;
        boolean z2;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource2;
        IconButtonColors iconButtonColors3;
        Shape shape3;
        Modifier modifier2;
        int v4;
        IconButtonColors iconButtonColors1;
        int v3;
        Shape shape1;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x5F0DA61B);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
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
                iconButtonColors1 = iconButtonColors0;
                v4 = composer1.changed(iconButtonColors1) ? 0x4000 : 0x2000;
            }
            else {
                iconButtonColors1 = iconButtonColors0;
                v4 = 0x2000;
            }
            v2 |= v4;
        }
        else {
            iconButtonColors1 = iconButtonColors0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    z1 = true;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                    shape1 = IconButtonDefaults.INSTANCE.getFilledShape(composer1, 6);
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    iconButtonColors1 = IconButtonDefaults.INSTANCE.filledIconButtonColors(composer1, 6);
                }
                shape3 = shape1;
                iconButtonColors3 = iconButtonColors1;
                mutableInteractionSource2 = (v1 & 0x20) == 0 ? mutableInteractionSource0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                shape3 = shape1;
                iconButtonColors3 = iconButtonColors1;
                mutableInteractionSource2 = mutableInteractionSource0;
            }
            z2 = z1;
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5F0DA61B, v2, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:222)");
            }
            SurfaceKt.Surface-o_FOJdg(function00, SemanticsModifierKt.semantics$default(modifier2, false, wa.w, 1, null), z2, shape3, iconButtonColors3.containerColor-vNxB06k$material3_release(z2), iconButtonColors3.contentColor-vNxB06k$material3_release(z2), 0.0f, 0.0f, null, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(0xA2FAC4F0, true, new xa(function20), composer1, 54), composer1, v2 & 8078 | v2 << 12 & 0x70000000, 6, 0x1C0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            shape2 = shape3;
            iconButtonColors2 = iconButtonColors3;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            shape2 = shape1;
            iconButtonColors2 = iconButtonColors1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ya(function00, modifier1, z2, shape2, iconButtonColors2, mutableInteractionSource1, function20, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FilledIconToggleButton(boolean z, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z1, @Nullable Shape shape0, @Nullable IconToggleButtonColors iconToggleButtonColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        IconToggleButtonColors iconToggleButtonColors1;
        Shape shape1;
        boolean z3;
        Modifier modifier1;
        boolean z4;
        int v3;
        MutableInteractionSource mutableInteractionSource2;
        IconToggleButtonColors iconToggleButtonColors2;
        Shape shape2;
        Modifier modifier2;
        IconToggleButtonColors iconToggleButtonColors3;
        Shape shape3;
        boolean z2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x9A2F19A0);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z2 = z1;
        }
        else if((v & 0xC00) == 0) {
            z2 = z1;
            v2 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v & 0x6000) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changed(shape0) ? 0x2000 : 0x4000);
        }
        if((0x30000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(iconToggleButtonColors0) ? 0x10000 : 0x20000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x180000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v2) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 8) != 0) {
                    z2 = true;
                }
                if((v1 & 16) == 0) {
                    shape3 = shape0;
                }
                else {
                    shape3 = IconButtonDefaults.INSTANCE.getFilledShape(composer1, 6);
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) == 0) {
                    iconToggleButtonColors3 = iconToggleButtonColors0;
                }
                else {
                    iconToggleButtonColors3 = IconButtonDefaults.INSTANCE.filledIconToggleButtonColors(composer1, 6);
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) == 0) {
                    shape2 = shape3;
                    iconToggleButtonColors2 = iconToggleButtonColors3;
                    z4 = z2;
                    mutableInteractionSource2 = mutableInteractionSource0;
                    v3 = v2;
                }
                else {
                    v3 = v2;
                    shape2 = shape3;
                    mutableInteractionSource2 = null;
                    iconToggleButtonColors2 = iconToggleButtonColors3;
                    z4 = z2;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                shape2 = shape0;
                iconToggleButtonColors2 = iconToggleButtonColors0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v3 = v2;
                z4 = z2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9A2F19A0, v3, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:354)");
            }
            int v4 = v3 >> 9 & 14 | v3 << 3 & 0x70 | v3 >> 9 & 0x380;
            SurfaceKt.Surface-d85dljk(z, function10, SemanticsModifierKt.semantics$default(modifier2, false, za.w, 1, null), z4, shape2, ((Color)iconToggleButtonColors2.containerColor$material3_release(z4, z, composer1, v4).getValue()).unbox-impl(), ((Color)iconToggleButtonColors2.contentColor$material3_release(z4, z, composer1, v4).getValue()).unbox-impl(), 0.0f, 0.0f, null, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1235871670, true, new ab(function20), composer1, 54), composer1, 0xFC7E & v3, v3 >> 18 & 14 | 0x30, 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape1 = shape2;
            mutableInteractionSource1 = mutableInteractionSource2;
            iconToggleButtonColors1 = iconToggleButtonColors2;
            z3 = z4;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z3 = z2;
            shape1 = shape0;
            iconToggleButtonColors1 = iconToggleButtonColors0;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new bb(z, function10, modifier1, z3, shape1, iconToggleButtonColors1, mutableInteractionSource1, function20, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FilledTonalIconButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, @Nullable IconButtonColors iconButtonColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        IconButtonColors iconButtonColors2;
        Shape shape2;
        boolean z2;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource2;
        IconButtonColors iconButtonColors3;
        Shape shape3;
        Modifier modifier2;
        int v4;
        IconButtonColors iconButtonColors1;
        int v3;
        Shape shape1;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xD1460F19);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
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
                iconButtonColors1 = iconButtonColors0;
                v4 = composer1.changed(iconButtonColors1) ? 0x4000 : 0x2000;
            }
            else {
                iconButtonColors1 = iconButtonColors0;
                v4 = 0x2000;
            }
            v2 |= v4;
        }
        else {
            iconButtonColors1 = iconButtonColors0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    z1 = true;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                    shape1 = IconButtonDefaults.INSTANCE.getFilledShape(composer1, 6);
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    iconButtonColors1 = IconButtonDefaults.INSTANCE.filledTonalIconButtonColors(composer1, 6);
                }
                shape3 = shape1;
                iconButtonColors3 = iconButtonColors1;
                mutableInteractionSource2 = (v1 & 0x20) == 0 ? mutableInteractionSource0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                shape3 = shape1;
                iconButtonColors3 = iconButtonColors1;
                mutableInteractionSource2 = mutableInteractionSource0;
            }
            z2 = z1;
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD1460F19, v2, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:289)");
            }
            SurfaceKt.Surface-o_FOJdg(function00, SemanticsModifierKt.semantics$default(modifier2, false, cb.w, 1, null), z2, shape3, iconButtonColors3.containerColor-vNxB06k$material3_release(z2), iconButtonColors3.contentColor-vNxB06k$material3_release(z2), 0.0f, 0.0f, null, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(0x9653ED64, true, new db(function20), composer1, 54), composer1, v2 & 8078 | v2 << 12 & 0x70000000, 6, 0x1C0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            shape2 = shape3;
            iconButtonColors2 = iconButtonColors3;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            shape2 = shape1;
            iconButtonColors2 = iconButtonColors1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ya(function00, modifier1, z2, shape2, iconButtonColors2, mutableInteractionSource1, function20, v, v1, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FilledTonalIconToggleButton(boolean z, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z1, @Nullable Shape shape0, @Nullable IconToggleButtonColors iconToggleButtonColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        IconToggleButtonColors iconToggleButtonColors1;
        Shape shape1;
        boolean z3;
        Modifier modifier1;
        boolean z4;
        int v3;
        MutableInteractionSource mutableInteractionSource2;
        IconToggleButtonColors iconToggleButtonColors2;
        Shape shape2;
        Modifier modifier2;
        IconToggleButtonColors iconToggleButtonColors3;
        Shape shape3;
        boolean z2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1676089246);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z2 = z1;
        }
        else if((v & 0xC00) == 0) {
            z2 = z1;
            v2 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v & 0x6000) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changed(shape0) ? 0x2000 : 0x4000);
        }
        if((0x30000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(iconToggleButtonColors0) ? 0x10000 : 0x20000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x180000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v2) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 8) != 0) {
                    z2 = true;
                }
                if((v1 & 16) == 0) {
                    shape3 = shape0;
                }
                else {
                    shape3 = IconButtonDefaults.INSTANCE.getFilledShape(composer1, 6);
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) == 0) {
                    iconToggleButtonColors3 = iconToggleButtonColors0;
                }
                else {
                    iconToggleButtonColors3 = IconButtonDefaults.INSTANCE.filledTonalIconToggleButtonColors(composer1, 6);
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) == 0) {
                    shape2 = shape3;
                    iconToggleButtonColors2 = iconToggleButtonColors3;
                    z4 = z2;
                    mutableInteractionSource2 = mutableInteractionSource0;
                    v3 = v2;
                }
                else {
                    v3 = v2;
                    shape2 = shape3;
                    mutableInteractionSource2 = null;
                    iconToggleButtonColors2 = iconToggleButtonColors3;
                    z4 = z2;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                shape2 = shape0;
                iconToggleButtonColors2 = iconToggleButtonColors0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v3 = v2;
                z4 = z2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1676089246, v3, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:425)");
            }
            int v4 = v3 >> 9 & 14 | v3 << 3 & 0x70 | v3 >> 9 & 0x380;
            SurfaceKt.Surface-d85dljk(z, function10, SemanticsModifierKt.semantics$default(modifier2, false, eb.w, 1, null), z4, shape2, ((Color)iconToggleButtonColors2.containerColor$material3_release(z4, z, composer1, v4).getValue()).unbox-impl(), ((Color)iconToggleButtonColors2.contentColor$material3_release(z4, z, composer1, v4).getValue()).unbox-impl(), 0.0f, 0.0f, null, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-58218680, true, new fb(function20), composer1, 54), composer1, 0xFC7E & v3, v3 >> 18 & 14 | 0x30, 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape1 = shape2;
            mutableInteractionSource1 = mutableInteractionSource2;
            iconToggleButtonColors1 = iconToggleButtonColors2;
            z3 = z4;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z3 = z2;
            shape1 = shape0;
            iconToggleButtonColors1 = iconToggleButtonColors0;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new bb(z, function10, modifier1, z3, shape1, iconToggleButtonColors1, mutableInteractionSource1, function20, v, v1, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void IconButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable IconButtonColors iconButtonColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        IconButtonColors iconButtonColors2;
        boolean z2;
        IconButtonColors iconButtonColors3;
        boolean z3;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        int v4;
        int v3;
        IconButtonColors iconButtonColors1;
        boolean z1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xBBE0CA0E);
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
                iconButtonColors1 = iconButtonColors0;
                v3 = composer1.changed(iconButtonColors1) ? 0x800 : 0x400;
            }
            else {
                iconButtonColors1 = iconButtonColors0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            iconButtonColors1 = iconButtonColors0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) != 74898 || !composer1.getSkipping()) {
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
                    iconButtonColors1 = IconButtonDefaults.INSTANCE.iconButtonColors(composer1, 6);
                }
                if((v1 & 16) == 0) {
                label_72:
                    z3 = z1;
                    iconButtonColors3 = iconButtonColors1;
                    mutableInteractionSource2 = mutableInteractionSource0;
                    v4 = v2;
                    modifier2 = modifier1;
                }
                else {
                    v4 = v2;
                    mutableInteractionSource2 = null;
                    modifier2 = modifier1;
                    z3 = z1;
                    iconButtonColors3 = iconButtonColors1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                goto label_72;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBBE0CA0E, v4, -1, "androidx.compose.material3.IconButton (IconButton.kt:88)");
            }
            Modifier modifier3 = ClickableKt.clickable-O2vRcR0$default(BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), 0.0f), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), composer1, 6)), iconButtonColors3.containerColor-vNxB06k$material3_release(z3), null, 2, null), mutableInteractionSource2, RippleKt.rippleOrFallbackImplementation-9IZ8Weo(false, 0.0f, 0L, composer1, 54, 4), z3, null, Role.box-impl(0), function00, 8, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(iconButtonColors3.contentColor-vNxB06k$material3_release(z3))), function20, composer1, ProvidedValue.$stable | v4 >> 12 & 0x70);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            iconButtonColors2 = iconButtonColors3;
            z2 = z3;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            z2 = z1;
            iconButtonColors2 = iconButtonColors1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i3(function00, modifier1, z2, iconButtonColors2, mutableInteractionSource1, function20, v, v1, 2));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void IconToggleButton(boolean z, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z1, @Nullable IconToggleButtonColors iconToggleButtonColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        IconToggleButtonColors iconToggleButtonColors2;
        boolean z3;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource2;
        IconToggleButtonColors iconToggleButtonColors3;
        boolean z4;
        Modifier modifier2;
        int v4;
        int v3;
        IconToggleButtonColors iconToggleButtonColors1;
        boolean z2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x2947A793);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z2 = z1;
        }
        else if((v & 0xC00) == 0) {
            z2 = z1;
            v2 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                iconToggleButtonColors1 = iconToggleButtonColors0;
                v3 = composer1.changed(iconToggleButtonColors1) ? 0x4000 : 0x2000;
            }
            else {
                iconToggleButtonColors1 = iconToggleButtonColors0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            iconToggleButtonColors1 = iconToggleButtonColors0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 8) != 0) {
                    z2 = true;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    iconToggleButtonColors1 = IconButtonDefaults.INSTANCE.iconToggleButtonColors(composer1, 6);
                }
                if((v1 & 0x20) == 0) {
                    modifier2 = modifier3;
                    z4 = z2;
                    iconToggleButtonColors3 = iconToggleButtonColors1;
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                else {
                    modifier2 = modifier3;
                    mutableInteractionSource2 = null;
                    z4 = z2;
                    iconToggleButtonColors3 = iconToggleButtonColors1;
                }
                v4 = v2;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                v4 = v2;
                modifier2 = modifier0;
                z4 = z2;
                iconToggleButtonColors3 = iconToggleButtonColors1;
                mutableInteractionSource2 = mutableInteractionSource0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2947A793, v4, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:153)");
            }
            int v5 = v4 >> 9 & 14 | v4 << 3 & 0x70 | v4 >> 6 & 0x380;
            Modifier modifier4 = ToggleableKt.toggleable-O2vRcR0(BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), 0.0f), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), composer1, 6)), ((Color)iconToggleButtonColors3.containerColor$material3_release(z4, z, composer1, v5).getValue()).unbox-impl(), null, 2, null), z, mutableInteractionSource2, RippleKt.rippleOrFallbackImplementation-9IZ8Weo(false, 0.0f, 0L, composer1, 54, 4), z4, Role.box-impl(1), function10);
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
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(((Color)iconToggleButtonColors3.contentColor$material3_release(z4, z, composer1, v5).getValue()).unbox-impl())), function20, composer1, ProvidedValue.$stable | v4 >> 15 & 0x70);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z4;
            iconToggleButtonColors2 = iconToggleButtonColors3;
            modifier1 = modifier2;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z3 = z2;
            iconToggleButtonColors2 = iconToggleButtonColors1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gb(z, function10, modifier1, z3, iconToggleButtonColors2, mutableInteractionSource1, function20, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OutlinedIconButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, @Nullable IconButtonColors iconButtonColors0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        BorderStroke borderStroke2;
        IconButtonColors iconButtonColors2;
        Shape shape2;
        boolean z2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke4;
        Shape shape3;
        int v5;
        BorderStroke borderStroke1;
        int v4;
        IconButtonColors iconButtonColors1;
        int v3;
        Shape shape1;
        boolean z1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-1746603025);
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
                iconButtonColors1 = iconButtonColors0;
                v4 = composer1.changed(iconButtonColors1) ? 0x4000 : 0x2000;
            }
            else {
                iconButtonColors1 = iconButtonColors0;
                v4 = 0x2000;
            }
            v2 |= v4;
        }
        else {
            iconButtonColors1 = iconButtonColors0;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                borderStroke1 = borderStroke0;
                v5 = composer1.changed(borderStroke1) ? 0x20000 : 0x10000;
            }
            else {
                borderStroke1 = borderStroke0;
                v5 = 0x10000;
            }
            v2 |= v5;
        }
        else {
            borderStroke1 = borderStroke0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x180000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
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
                    shape1 = IconButtonDefaults.INSTANCE.getOutlinedShape(composer1, 6);
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    iconButtonColors1 = IconButtonDefaults.INSTANCE.outlinedIconButtonColors(composer1, 6);
                }
                if((v1 & 0x20) != 0) {
                    BorderStroke borderStroke3 = IconButtonDefaults.INSTANCE.outlinedIconButtonBorder(z1, composer1, v2 >> 6 & 14 | 0x30);
                    v2 &= 0xFFF8FFFF;
                    borderStroke1 = borderStroke3;
                }
                if((v1 & 0x40) == 0) {
                label_110:
                    shape3 = shape1;
                    borderStroke4 = borderStroke1;
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                else {
                    shape3 = shape1;
                    borderStroke4 = borderStroke1;
                    mutableInteractionSource2 = null;
                }
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
                goto label_110;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1746603025, v2, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:497)");
            }
            SurfaceKt.Surface-o_FOJdg(function00, SemanticsModifierKt.semantics$default(modifier1, false, hb.w, 1, null), z1, shape3, iconButtonColors1.containerColor-vNxB06k$material3_release(z1), iconButtonColors1.contentColor-vNxB06k$material3_release(z1), 0.0f, 0.0f, borderStroke4, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(0x22B5B07A, true, new ib(function20), composer1, 54), composer1, v2 & 8078 | 0xE000000 & v2 << 9 | v2 << 9 & 0x70000000, 6, 0xC0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier1;
            z2 = z1;
            iconButtonColors2 = iconButtonColors1;
            mutableInteractionSource1 = mutableInteractionSource2;
            borderStroke2 = borderStroke4;
            shape2 = shape3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            z2 = z1;
            shape2 = shape1;
            iconButtonColors2 = iconButtonColors1;
            borderStroke2 = borderStroke1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w2(function00, modifier2, z2, shape2, iconButtonColors2, borderStroke2, mutableInteractionSource1, function20, v, v1, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OutlinedIconToggleButton(boolean z, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z1, @Nullable Shape shape0, @Nullable IconToggleButtonColors iconToggleButtonColors0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        Modifier modifier1;
        BorderStroke borderStroke2;
        IconToggleButtonColors iconToggleButtonColors2;
        Shape shape2;
        boolean z3;
        Modifier modifier2;
        BorderStroke borderStroke3;
        Shape shape3;
        boolean z4;
        int v6;
        MutableInteractionSource mutableInteractionSource2;
        int v5;
        BorderStroke borderStroke1;
        int v4;
        IconToggleButtonColors iconToggleButtonColors1;
        int v3;
        Shape shape1;
        boolean z2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1470292106);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z2 = z1;
        }
        else if((v & 0xC00) == 0) {
            z2 = z1;
            v2 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x4000 : 0x2000;
            }
            else {
                shape1 = shape0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                iconToggleButtonColors1 = iconToggleButtonColors0;
                v4 = composer1.changed(iconToggleButtonColors1) ? 0x20000 : 0x10000;
            }
            else {
                iconToggleButtonColors1 = iconToggleButtonColors0;
                v4 = 0x10000;
            }
            v2 |= v4;
        }
        else {
            iconToggleButtonColors1 = iconToggleButtonColors0;
        }
        if((0x180000 & v) == 0) {
            if((v1 & 0x40) == 0) {
                borderStroke1 = borderStroke0;
                v5 = composer1.changed(borderStroke1) ? 0x100000 : 0x80000;
            }
            else {
                borderStroke1 = borderStroke0;
                v5 = 0x80000;
            }
            v2 |= v5;
        }
        else {
            borderStroke1 = borderStroke0;
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
            v2 |= (composer1.changedInstance(function20) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v2) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 8) != 0) {
                    z2 = true;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    shape1 = IconButtonDefaults.INSTANCE.getOutlinedShape(composer1, 6);
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                    iconToggleButtonColors1 = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonColors(composer1, 6);
                }
                if((v1 & 0x40) != 0) {
                    BorderStroke borderStroke4 = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonBorder(z2, z, composer1, v2 >> 9 & 14 | 0x180 | v2 << 3 & 0x70);
                    v2 &= 0xFFC7FFFF;
                    borderStroke1 = borderStroke4;
                }
                if((v1 & 0x80) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    v6 = v2;
                    shape3 = shape1;
                    borderStroke3 = borderStroke1;
                }
                else {
                    v6 = v2;
                    shape3 = shape1;
                    borderStroke3 = borderStroke1;
                    mutableInteractionSource2 = null;
                }
                modifier2 = modifier3;
                z4 = z2;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                mutableInteractionSource2 = mutableInteractionSource0;
                v6 = v2;
                z4 = z2;
                shape3 = shape1;
                borderStroke3 = borderStroke1;
                modifier2 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1470292106, v6, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:561)");
            }
            int v7 = v6 >> 9 & 14 | v6 << 3 & 0x70 | v6 >> 9 & 0x380;
            SurfaceKt.Surface-d85dljk(z, function10, SemanticsModifierKt.semantics$default(modifier2, false, jb.w, 1, null), z4, shape3, ((Color)iconToggleButtonColors1.containerColor$material3_release(z4, z, composer1, v7).getValue()).unbox-impl(), ((Color)iconToggleButtonColors1.contentColor$material3_release(z4, z, composer1, v7).getValue()).unbox-impl(), 0.0f, 0.0f, borderStroke3, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(0x47FB63B4, true, new kb(function20), composer1, 54), composer1, 0xFC7E & v6 | 0x70000000 & v6 << 9, v6 >> 21 & 14 | 0x30, 0x180);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape2 = shape3;
            borderStroke2 = borderStroke3;
            mutableInteractionSource1 = mutableInteractionSource2;
            iconToggleButtonColors2 = iconToggleButtonColors1;
            z3 = z4;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            z3 = z2;
            shape2 = shape1;
            iconToggleButtonColors2 = iconToggleButtonColors1;
            borderStroke2 = borderStroke1;
            modifier1 = modifier0;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new lb(z, function10, modifier1, z3, shape2, iconToggleButtonColors2, borderStroke2, mutableInteractionSource1, function20, v, v1));
        }
    }
}

