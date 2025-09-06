package androidx.compose.material;

import androidx.compose.material3.lp;
import androidx.compose.material3.sf;
import androidx.compose.material3.t5;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.room.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a5;
import p0.a6;
import p0.ac;
import p0.dc;
import p0.r;
import p0.x4;
import p0.z4;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\u001A\u0092\u0001\u0010\f\u001A\u00020\u00032\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0015\b\u0002\u0010\u0005\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0006\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u000B\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "icon", "secondaryText", "", "singleLineSecondaryText", "overlineText", "trailing", "text", "ListItem", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,436:1\n79#2,11:437\n92#2:468\n79#2,11:475\n92#2:506\n456#3,8:448\n464#3,6:462\n456#3,8:486\n464#3,6:500\n3737#4,6:456\n3737#4,6:494\n1116#5,6:469\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n*L\n356#1:437,11\n356#1:468\n398#1:475,11\n398#1:506\n356#1:448,8\n356#1:462,6\n398#1:486,8\n398#1:500,6\n356#1:456,6\n398#1:494,6\n398#1:469,6\n*E\n"})
public final class ListItemKt {
    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][_][_]]")
    public static final void ListItem(@Nullable Modifier modifier0, @Nullable Function2 function20, @Nullable Function2 function21, boolean z, @Nullable Function2 function22, @Nullable Function2 function23, @NotNull Function2 function24, @Nullable Composer composer0, int v, int v1) {
        Function2 function29;
        boolean z1;
        Function2 function28;
        Function2 function27;
        Modifier modifier1;
        Function2 function211;
        Function2 function26;
        Function2 function25;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xE51F74B7);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            function25 = function20;
        }
        else if((v & 0x70) == 0) {
            function25 = function20;
            v2 |= (composer1.changedInstance(function25) ? 0x20 : 16);
        }
        else {
            function25 = function20;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function26 = function22;
        }
        else if((0xE000 & v) == 0) {
            function26 = function22;
            v2 |= (composer1.changedInstance(function26) ? 0x4000 : 0x2000);
        }
        else {
            function26 = function22;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changedInstance(function23) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changedInstance(function24) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            Function2 function210 = null;
            if((v1 & 2) != 0) {
                function25 = null;
            }
            function28 = (v1 & 4) == 0 ? function21 : null;
            boolean z2 = (v1 & 8) == 0 ? z : true;
            if((v1 & 16) != 0) {
                function26 = null;
            }
            if((v1 & 0x20) == 0) {
                function210 = function23;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE51F74B7, v2, -1, "androidx.compose.material.ListItem (ListItem.kt:83)");
            }
            Typography typography0 = MaterialTheme.INSTANCE.getTypography(composer1, 6);
            ComposableLambda composableLambda0 = ListItemKt.a(typography0.getSubtitle1(), ContentAlpha.INSTANCE.getHigh(composer1, 6), function24);
            Intrinsics.checkNotNull(composableLambda0);
            ComposableLambda composableLambda1 = ListItemKt.a(typography0.getBody2(), ContentAlpha.INSTANCE.getMedium(composer1, 6), function28);
            ComposableLambda composableLambda2 = ListItemKt.a(typography0.getOverline(), ContentAlpha.INSTANCE.getHigh(composer1, 6), function26);
            ComposableLambda composableLambda3 = ListItemKt.a(typography0.getCaption(), ContentAlpha.INSTANCE.getHigh(composer1, 6), function210);
            Modifier modifier3 = SemanticsModifierKt.semantics(modifier2, true, r.H);
            if(composableLambda1 != null || composableLambda2 != null) {
                function211 = function26;
                if((composableLambda2 != null || !z2) && composableLambda1 != null) {
                    composer1.startReplaceableGroup(-210280033);
                    ac.a.a(modifier3, function25, composableLambda0, composableLambda1, composableLambda2, composableLambda3, composer1, v2 & 0x70 | 0x180000);
                }
                else {
                    composer1.startReplaceableGroup(-210280247);
                    dc.a.a(modifier3, function25, composableLambda0, composableLambda1, composableLambda2, composableLambda3, composer1, v2 & 0x70 | 0x180000);
                }
            }
            else {
                composer1.startReplaceableGroup(0xF3776004);
                function211 = function26;
                a6.a.a(modifier3, function25, composableLambda0, composableLambda3, composer1, v2 & 0x70 | 0x6000);
            }
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function27 = function210;
            z1 = z2;
            function29 = function211;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function27 = function23;
            function28 = function21;
            z1 = z;
            function29 = function26;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t5(modifier1, function25, function28, z1, function29, function27, function24, v, v1));
        }
    }

    // 去混淆评级： 中等(50)
    public static final ComposableLambda a(TextStyle textStyle0, float f, Function2 function20) {
        return function20 == null ? null : ComposableLambdaKt.composableLambdaInstance(-830176860, true, new a5(f, textStyle0, new LineHeightStyle(-1.0f, 17, null), function20));
    }

    public static final void access$BaselinesOffsetColumn(List list0, Modifier modifier0, Function2 function20, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x61395931);
        if((v1 & 2) != 0) {
            modifier0 = Modifier.Companion;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x61395931, v, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:354)");
        }
        x4 x40 = new x4(list0);
        composer1.startReplaceableGroup(-1323940314);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier0);
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
        Updater.set-impl(composer1, x40, composeUiNode$Companion0.getSetMeasurePolicy());
        Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
        Function2 function21 = composeUiNode$Companion0.getSetCompositeKeyHash();
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            a.t(v2, composer1, v2, function21);
        }
        r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
        function20.invoke(composer1, ((int)(((v >> 6 & 14 | v & 0x70) << 9 & 0x1C00 | 6) >> 9 & 14)));
        composer1.endReplaceableGroup();
        composer1.endNode();
        composer1.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(list0, modifier0, function20, v, v1, 13));
        }
    }

    public static final void access$OffsetToBaselineOrCenter-Kz89ssw(float f, Modifier modifier0, Function2 function20, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xC0A898B3);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC0A898B3, v2, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:396)");
            }
            composer1.startReplaceableGroup(-1616626060);
            boolean z = composer1.changed(f);
            z4 z40 = composer1.rememberedValue();
            if(z || z40 == Composer.Companion.getEmpty()) {
                z40 = new z4(f);
                composer1.updateRememberedValue(z40);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(-1323940314);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier0);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, z40, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function21);
            }
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function20.invoke(composer1, ((int)(((v2 >> 6 & 14 | v2 & 0x70) << 9 & 0x1C00 | 6) >> 9 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new lp(f, modifier0, function20, v, v1));
        }
    }
}

