package androidx.compose.material3;

import androidx.activity.g0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001AT\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022#\b\u0002\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\u000B\u0010\f\u001A{\u0010\u0019\u001A\u00020\u000F2\u0006\u0010\r\u001A\u00020\n2\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\u0002¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0015\u001A\u00020\u00032\b\b\u0002\u0010\u0016\u001A\u00020\u00032\b\b\u0002\u0010\u0017\u001A\u00020\u00032\u001C\u0010\u0018\u001A\u0018\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\u0002¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxValue;", "initialValue", "Lkotlin/Function1;", "", "confirmValueChange", "", "Lkotlin/ParameterName;", "name", "totalDistance", "positionalThreshold", "Landroidx/compose/material3/SwipeToDismissBoxState;", "rememberSwipeToDismissBoxState", "(Landroidx/compose/material3/SwipeToDismissBoxValue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SwipeToDismissBoxState;", "state", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "backgroundContent", "Landroidx/compose/ui/Modifier;", "modifier", "enableDismissFromStartToEnd", "enableDismissFromEndToStart", "gesturesEnabled", "content", "SwipeToDismissBox", "(Landroidx/compose/material3/SwipeToDismissBoxState;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ZZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,266:1\n77#2:267\n77#2:274\n1223#3,6:268\n1223#3,6:351\n71#4:275\n68#4,6:276\n74#4:310\n78#4:400\n78#5,6:282\n85#5,4:297\n89#5,2:307\n78#5,6:318\n85#5,4:333\n89#5,2:343\n93#5:349\n78#5,6:364\n85#5,4:379\n89#5,2:389\n93#5:395\n93#5:399\n368#6,9:288\n377#6:309\n368#6,9:324\n377#6:345\n378#6,2:347\n368#6,9:370\n377#6:391\n378#6,2:393\n378#6,2:397\n4032#7,6:301\n4032#7,6:337\n4032#7,6:383\n98#8:311\n95#8,6:312\n101#8:346\n105#8:350\n98#8:357\n95#8,6:358\n101#8:392\n105#8:396\n148#9:401\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxKt\n*L\n188#1:267\n226#1:274\n196#1:268,6\n240#1:351,6\n228#1:275\n228#1:276,6\n228#1:310\n228#1:400\n228#1:282,6\n228#1:297,4\n228#1:307,2\n236#1:318,6\n236#1:333,4\n236#1:343,2\n236#1:349\n237#1:364,6\n237#1:379,4\n237#1:389,2\n237#1:395\n228#1:399\n228#1:288,9\n228#1:309\n236#1:324,9\n236#1:345\n236#1:347,2\n237#1:370,9\n237#1:391\n237#1:393,2\n228#1:397,2\n228#1:301,6\n236#1:337,6\n237#1:383,6\n236#1:311\n236#1:312,6\n236#1:346\n236#1:350\n237#1:357\n237#1:358,6\n237#1:392\n237#1:396\n265#1:401\n*E\n"})
public final class SwipeToDismissBoxKt {
    public static final float a;

    static {
        SwipeToDismissBoxKt.a = 125.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SwipeToDismissBox(@NotNull SwipeToDismissBoxState swipeToDismissBoxState0, @NotNull Function3 function30, @Nullable Modifier modifier0, boolean z, boolean z1, boolean z2, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        boolean z8;
        boolean z7;
        boolean z6;
        Companion modifier$Companion1;
        boolean z5;
        boolean z4;
        boolean z3;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xE80128AD);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(swipeToDismissBoxState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z3 = z;
        }
        else if((v & 0xC00) == 0) {
            z3 = z;
            v2 |= (composer1.changed(z3) ? 0x800 : 0x400);
        }
        else {
            z3 = z;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            z4 = z1;
        }
        else if((v & 0x6000) == 0) {
            z4 = z1;
            v2 |= (composer1.changed(z4) ? 0x4000 : 0x2000);
        }
        else {
            z4 = z1;
        }
        if((v1 & 0x20) == 0) {
            z5 = z2;
            if((v & 0x30000) == 0) {
                v2 |= (composer1.changed(z5) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            z5 = z2;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function31) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 4) == 0 ? modifier1 : Modifier.Companion;
            if((v1 & 8) != 0) {
                z3 = true;
            }
            if((v1 & 16) != 0) {
                z4 = true;
            }
            if((v1 & 0x20) != 0) {
                z5 = true;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE80128AD, v2, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:224)");
            }
            boolean z9 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            Orientation orientation0 = Orientation.Horizontal;
            Modifier modifier3 = AnchoredDraggableKt.anchoredDraggable$default(modifier2, swipeToDismissBoxState0.getAnchoredDraggableState$material3_release(), orientation0, z5 && swipeToDismissBoxState0.getCurrentValue() == SwipeToDismissBoxValue.Settled, false, null, 24, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), true);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier5 = BoxScopeInstance.INSTANCE.matchParentSize(modifier$Companion0);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
            Arrangement arrangement0 = Arrangement.INSTANCE;
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting()) {
                modifier$Companion1 = modifier$Companion0;
                a.t(v4, composer1, v4, function21);
            }
            else {
                modifier$Companion1 = modifier$Companion0;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    a.t(v4, composer1, v4, function21);
                }
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            function30.invoke(rowScopeInstance0, composer1, ((int)((v2 << 6 & 0x1C00) >> 6 & 0x70 | 6)));
            composer1.endNode();
            AnchoredDraggableState anchoredDraggableState0 = swipeToDismissBoxState0.getAnchoredDraggableState$material3_release();
            boolean z10 = composer1.changed(z9);
            rm rm0 = composer1.rememberedValue();
            if((z10 | (v2 & 0x1C00) == 0x800 | ((0xE000 & v2) == 0x4000 ? 1 : 0) | ((v2 & 14) == 4 ? 1 : 0)) != 0 || rm0 == Composer.Companion.getEmpty()) {
                rm0 = new rm(swipeToDismissBoxState0, z3, z9, z4);
                composer1.updateRememberedValue(rm0);
            }
            Modifier modifier7 = AnchoredDraggableKt.draggableAnchors(modifier$Companion1, anchoredDraggableState0, orientation0, rm0);
            MeasurePolicy measurePolicy2 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier8 = ComposedModifierKt.materializeModifier(composer1, modifier7);
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function22);
            }
            Updater.set-impl(composer1, modifier8, composeUiNode$Companion0.getSetModifier());
            function31.invoke(rowScopeInstance0, composer1, ((int)((v2 >> 9 & 0x1C00) >> 6 & 0x70 | 6)));
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z6 = z5;
            z7 = z3;
            z8 = z4;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            z6 = z5;
            z7 = z3;
            z8 = z4;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sm(swipeToDismissBoxState0, function30, modifier1, z7, z8, z6, function31, v, v1));
        }
    }

    public static final float access$getDismissVelocityThreshold$p() [...] // 潜在的解密器

    @Composable
    @NotNull
    public static final SwipeToDismissBoxState rememberSwipeToDismissBoxState(@Nullable SwipeToDismissBoxValue swipeToDismissBoxValue0, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Composer composer0, int v, int v1) {
        SwipeToDismissBoxValue swipeToDismissBoxValue1 = (v1 & 1) == 0 ? swipeToDismissBoxValue0 : SwipeToDismissBoxValue.Settled;
        Function1 function12 = (v1 & 2) == 0 ? function10 : tm.w;
        Function1 function13 = (v1 & 4) == 0 ? function11 : SwipeToDismissBoxDefaults.INSTANCE.getPositionalThreshold(composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF1513801, v, -1, "androidx.compose.material3.rememberSwipeToDismissBoxState (SwipeToDismissBox.kt:186)");
        }
        Object object0 = composer0.consume(CompositionLocalsKt.getLocalDensity());
        int v2 = 0;
        Saver saver0 = SwipeToDismissBoxState.Companion.Saver(function12, function13, ((Density)object0));
        boolean z = (6 ^ v & 14) > 4 && composer0.changed(swipeToDismissBoxValue1) || (v & 6) == 4;
        boolean z1 = composer0.changed(((Density)object0));
        int v3 = ((v & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(function12)) && (v & 0x30) != 0x20 ? 0 : 1;
        if((v & 0x380 ^ 0x180) > 0x100 && composer0.changed(function13) || (v & 0x180) == 0x100) {
            v2 = 1;
        }
        g0 g00 = composer0.rememberedValue();
        if((z | z1 | v3 | v2) != 0 || g00 == Composer.Companion.getEmpty()) {
            g00 = new g0(4, swipeToDismissBoxValue1, ((Density)object0), function12, function13);
            composer0.updateRememberedValue(g00);
        }
        SwipeToDismissBoxState swipeToDismissBoxState0 = (SwipeToDismissBoxState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, g00, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return swipeToDismissBoxState0;
    }
}

