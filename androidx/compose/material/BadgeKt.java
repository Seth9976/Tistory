package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.e1;
import androidx.compose.material3.f1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u001AU\u0010\t\u001A\u00020\u00022\u001C\u0010\u0005\u001A\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u001C\u0010\b\u001A\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001AR\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2 \b\u0002\u0010\b\u001A\u001A\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\"\u001A\u0010\u0017\u001A\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u001A\u0010\u001A\u001A\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001A\u0004\b\u0019\u0010\u0016\"\u001A\u0010\u001D\u001A\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u0014\u001A\u0004\b\u001C\u0010\u0016\"\u001A\u0010 \u001A\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u0014\u001A\u0004\b\u001F\u0010\u0016\"\u001A\u0010#\u001A\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0014\u001A\u0004\b\"\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006$"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "badge", "Landroidx/compose/ui/Modifier;", "modifier", "content", "BadgedBox", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/RowScope;", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Badge", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getBadgeRadius", "()F", "BadgeRadius", "b", "getBadgeWithContentRadius", "BadgeWithContentRadius", "d", "getBadgeWithContentHorizontalPadding", "BadgeWithContentHorizontalPadding", "e", "getBadgeWithContentHorizontalOffset", "BadgeWithContentHorizontalOffset", "f", "getBadgeHorizontalOffset", "BadgeHorizontalOffset", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,188:1\n79#2,11:189\n79#2,11:222\n92#2:254\n79#2,11:262\n92#2:294\n92#2:299\n79#2,11:303\n92#2:335\n456#3,8:200\n464#3,3:214\n456#3,8:233\n464#3,3:247\n467#3,3:251\n456#3,8:273\n464#3,3:287\n467#3,3:291\n467#3,3:296\n456#3,8:314\n464#3,3:328\n467#3,3:332\n3737#4,6:208\n3737#4,6:241\n3737#4,6:281\n3737#4,6:322\n69#5,5:217\n74#5:250\n78#5:255\n68#5,6:256\n74#5:290\n78#5:295\n92#6:300\n64#6:341\n64#6:343\n91#7,2:301\n93#7:331\n97#7:336\n154#8:337\n154#8:338\n154#8:339\n154#8:340\n154#8:342\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n*L\n65#1:189,11\n67#1:222,11\n67#1:254\n72#1:262,11\n72#1:294\n65#1:299\n141#1:303,11\n141#1:335\n65#1:200,8\n65#1:214,3\n67#1:233,8\n67#1:247,3\n67#1:251,3\n72#1:273,8\n72#1:287,3\n72#1:291,3\n65#1:296,3\n141#1:314,8\n141#1:328,3\n141#1:332,3\n65#1:208,6\n67#1:241,6\n72#1:281,6\n141#1:322,6\n67#1:217,5\n67#1:250\n67#1:255\n72#1:256,6\n72#1:290\n72#1:295\n143#1:300\n183#1:341\n187#1:343\n141#1:301,2\n141#1:331\n141#1:336\n170#1:337\n173#1:338\n179#1:339\n183#1:340\n187#1:342\n*E\n"})
public final class BadgeKt {
    public static final float a;
    public static final float b;
    public static final long c;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
        BadgeKt.a = 4.0f;
        BadgeKt.b = 8.0f;
        BadgeKt.c = 0x141200000L;
        BadgeKt.d = 4.0f;
        BadgeKt.e = -6.0f;
        BadgeKt.f = -4.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Badge-eopBjH0(@Nullable Modifier modifier0, long v, long v1, @Nullable Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        Modifier modifier1;
        Function3 function31;
        long v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x438F99D6);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v2 & 0x70) == 0) {
            v5 = v;
            v4 |= ((v3 & 2) != 0 || !composer1.changed(v5) ? 16 : 0x20);
        }
        else {
            v5 = v;
        }
        if((v2 & 0x380) == 0) {
            v6 = v1;
            v4 |= ((v3 & 4) != 0 || !composer1.changed(v6) ? 0x80 : 0x100);
        }
        else {
            v6 = v1;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            function31 = function30;
        }
        else if((v2 & 0x1C00) == 0) {
            function31 = function30;
            v4 |= (composer1.changedInstance(function31) ? 0x800 : 0x400);
        }
        else {
            function31 = function30;
        }
        if((v4 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v5 = MaterialTheme.INSTANCE.getColors(composer1, 6).getError-0d7_KjU();
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v6 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 3 & 14);
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    function31 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                modifier1 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x438F99D6, v4, -1, "androidx.compose.material.Badge (Badge.kt:135)");
            }
            float f = function31 == null ? BadgeKt.a : BadgeKt.b;
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(f);
            Modifier modifier2 = PaddingKt.padding-VpY3zN4$default(ClipKt.clip(BackgroundKt.background-bw27NRU(SizeKt.defaultMinSize-VpY3zN4(modifier1, f * 2.0f, f * 2.0f), v5, roundedCornerShape0), roundedCornerShape0), BadgeKt.d, 0.0f, 2, null);
            composer1.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), composer1, 54);
            composer1.startReplaceableGroup(-1323940314);
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function32 = LayoutKt.modifierMaterializerOf(modifier2);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                a.t(v7, composer1, v7, function20);
            }
            r0.a.w(0, function32, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            composer1.startReplaceableGroup(0x1F169779);
            if(function31 != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(v6)), ComposableLambdaKt.composableLambda(composer1, 0x6A5DB695, true, new e1(function31, rowScopeInstance0, 2)), composer1, ProvidedValue.$stable | 0x30);
            }
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
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
            scopeUpdateScope0.updateScope(new f1(modifier1, v5, v6, function31, v2, v3, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BadgedBox(@NotNull Function3 function30, @Nullable Modifier modifier0, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x333F9658);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changedInstance(function31) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x333F9658, v2, -1, "androidx.compose.material.BadgedBox (Badge.kt:63)");
            }
            b b0 = b.c;
            composer1.startReplaceableGroup(-1323940314);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function32 = LayoutKt.modifierMaterializerOf(modifier1);
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
            Updater.set-impl(composer1, b0, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            r0.a.w(0, function32, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier2 = LayoutIdKt.layoutId(modifier$Companion0, "anchor");
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = BoxKt.rememberBoxMeasurePolicy(alignment$Companion0.getCenter(), false, composer1, 6);
            composer1.startReplaceableGroup(-1323940314);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            Function3 function33 = LayoutKt.modifierMaterializerOf(modifier2);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function21);
            }
            r0.a.w(0, function33, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            function31.invoke(boxScopeInstance0, composer1, ((int)((v2 << 3 & 0x1C00 | 54) >> 6 & 0x70 | 6)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            Modifier modifier3 = LayoutIdKt.layoutId(modifier$Companion0, "badge");
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy1 = r0.a.i(alignment$Companion0, false, composer1, 0, -1323940314);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            Function3 function34 = LayoutKt.modifierMaterializerOf(modifier3);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function22);
            }
            r0.a.w(0, function34, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function30.invoke(boxScopeInstance0, composer1, ((int)(6 | (v2 << 9 & 0x1C00 | 6) >> 6 & 0x70)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
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
            scopeUpdateScope0.updateScope(new j1(function30, modifier1, function31, v, v1, 1));
        }
    }

    public static final long access$getBadgeContentFontSize$p() [...] // 潜在的解密器

    public static final float getBadgeHorizontalOffset() [...] // 潜在的解密器

    public static final float getBadgeRadius() [...] // 潜在的解密器

    public static final float getBadgeWithContentHorizontalOffset() [...] // 潜在的解密器

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeKt.d;
    }

    public static final float getBadgeWithContentRadius() {
        return BadgeKt.b;
    }
}

