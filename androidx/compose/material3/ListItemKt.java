package androidx.compose.material3;

import androidx.annotation.VisibleForTesting;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.room.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\u001A©\u0001\u0010\u0011\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0015\b\u0002\u0010\u0006\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0007\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\b\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\" \u0010\u0018\u001A\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0014\u0010\u0015\" \u0010\u001C\u001A\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u0012\u0004\b\u001B\u0010\u0017\u001A\u0004\b\u001A\u0010\u0015\" \u0010 \u001A\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001D\u0010\u0013\u0012\u0004\b\u001F\u0010\u0017\u001A\u0004\b\u001E\u0010\u0015\" \u0010$\u001A\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0013\u0012\u0004\b#\u0010\u0017\u001A\u0004\b\"\u0010\u0015\" \u0010(\u001A\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0013\u0012\u0004\b\'\u0010\u0017\u001A\u0004\b&\u0010\u0015\" \u0010,\u001A\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b)\u0010\u0013\u0012\u0004\b+\u0010\u0017\u001A\u0004\b*\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006-"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "headlineContent", "Landroidx/compose/ui/Modifier;", "modifier", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "Landroidx/compose/material3/ListItemColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "ListItem-HXNGIdc", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "ListItem", "a", "F", "getListItemVerticalPadding", "()F", "getListItemVerticalPadding$annotations", "()V", "ListItemVerticalPadding", "b", "getListItemThreeLineVerticalPadding", "getListItemThreeLineVerticalPadding$annotations", "ListItemThreeLineVerticalPadding", "c", "getListItemStartPadding", "getListItemStartPadding$annotations", "ListItemStartPadding", "d", "getListItemEndPadding", "getListItemEndPadding$annotations", "ListItemEndPadding", "e", "getLeadingContentEndPadding", "getLeadingContentEndPadding$annotations", "LeadingContentEndPadding", "f", "getTrailingContentStartPadding", "getTrailingContentStartPadding$annotations", "TrailingContentStartPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,730:1\n1223#2,6:731\n1223#2,6:745\n170#3:737\n168#3,7:738\n78#3,6:751\n85#3,4:766\n89#3,2:776\n93#3:781\n176#3:782\n368#4,9:757\n377#4,3:778\n4032#5,6:770\n148#6:783\n148#6:784\n148#6:785\n148#6:786\n148#6:787\n148#6:788\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n*L\n182#1:731,6\n183#1:745,6\n183#1:737\n183#1:738,7\n183#1:751,6\n183#1:766,4\n183#1:776,2\n183#1:781\n183#1:782\n183#1:757,9\n183#1:778,3\n183#1:770,6\n697#1:783\n699#1:784\n701#1:785\n703#1:786\n707#1:787\n711#1:788\n*E\n"})
public final class ListItemKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
        ListItemKt.a = 8.0f;
        ListItemKt.b = 12.0f;
        ListItemKt.c = 16.0f;
        ListItemKt.d = 16.0f;
        ListItemKt.e = 16.0f;
        ListItemKt.f = 16.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ListItem-HXNGIdc(@NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable ListItemColors listItemColors0, float f, float f1, @Nullable Composer composer0, int v, int v1) {
        float f3;
        Function2 function29;
        Function2 function28;
        ListItemColors listItemColors1;
        Function2 function27;
        Modifier modifier1;
        Function2 function215;
        ComposableLambda composableLambda4;
        Function2 function214;
        ComposableLambda composableLambda3;
        Function2 function213;
        ComposableLambda composableLambda2;
        Function2 function212;
        ListItemColors listItemColors2;
        float f5;
        Function2 function211;
        int v5;
        float f4;
        Function2 function210;
        Modifier modifier2;
        ListItemColors listItemColors3;
        int v7;
        int v6;
        float f2;
        int v4;
        int v3;
        Function2 function26;
        Function2 function25;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x9DC9F98D);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
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
            function25 = function21;
        }
        else if((v & 0x180) == 0) {
            function25 = function21;
            v2 |= (composer1.changedInstance(function25) ? 0x100 : 0x80);
        }
        else {
            function25 = function21;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function26 = function22;
        }
        else if((v & 0xC00) == 0) {
            function26 = function22;
            v2 |= (composer1.changedInstance(function26) ? 0x800 : 0x400);
        }
        else {
            function26 = function22;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function23) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changedInstance(function24) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(listItemColors0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
            v3 = v1 & 0x80;
        }
        else if((v & 0xC00000) == 0) {
            v3 = v1 & 0x80;
            v2 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        else {
            v3 = v1 & 0x80;
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
            v4 = v1 & 0x100;
            f2 = f1;
        }
        else if((v & 0x6000000) == 0) {
            v4 = v1 & 0x100;
            f2 = f1;
            v2 |= (composer1.changed(f2) ? 0x4000000 : 0x2000000);
        }
        else {
            v4 = v1 & 0x100;
            f2 = f1;
        }
        if((v2 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            ComposableLambda composableLambda0 = null;
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    function25 = null;
                }
                if((v1 & 8) != 0) {
                    function26 = null;
                }
                function211 = (v1 & 16) == 0 ? function23 : null;
                function210 = (v1 & 0x20) == 0 ? function24 : null;
                if((v1 & 0x40) == 0) {
                    v6 = v3;
                    v7 = v4;
                    listItemColors3 = listItemColors0;
                }
                else {
                    v6 = v3;
                    v7 = v4;
                    listItemColors3 = ListItemDefaults.INSTANCE.colors-J08w3-E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0x30000000, 0x1FF);
                    v2 &= 0xFFC7FFFF;
                }
                f4 = v6 == 0 ? f : 0.0f;
                f5 = v7 == 0 ? f1 : 0.0f;
                v5 = v2;
                listItemColors2 = listItemColors3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                function210 = function24;
                f4 = f;
                v5 = v2;
                function211 = function23;
                f5 = f2;
                listItemColors2 = listItemColors0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9DC9F98D, v5, -1, "androidx.compose.material3.ListItem (ListItem.kt:103)");
            }
            ComposableLambda composableLambda1 = ComposableLambdaKt.rememberComposableLambda(0xE7F6E615, true, new cc(listItemColors2, function20, 0), composer1, 54);
            composer1.startReplaceGroup(0x61CF38FC);
            if(function26 == null) {
                function212 = null;
                composableLambda2 = null;
            }
            else {
                function212 = function26;
                composableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1020860251, true, new cc(listItemColors2, function26, 2), composer1, 54);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x61CF60F4);
            if(function25 == null) {
                function213 = null;
                composableLambda3 = null;
            }
            else {
                function213 = function25;
                composableLambda3 = ComposableLambdaKt.rememberComposableLambda(0xD26F8D70, true, new cc(listItemColors2, function25, 1), composer1, 54);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(1640990750);
            if(function211 == null) {
                function214 = null;
                composableLambda4 = null;
            }
            else {
                function214 = function211;
                composableLambda4 = ComposableLambdaKt.rememberComposableLambda(1400509200, true, new dc(listItemColors2, function211), composer1, 54);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(1641004177);
            if(function210 == null) {
                function215 = null;
            }
            else {
                function215 = function210;
                composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x5A23F69C, true, new ec(listItemColors2, function210), composer1, 54);
            }
            composer1.endReplaceGroup();
            SurfaceKt.Surface-T9BRK9s(SemanticsModifierKt.semantics(Modifier.Companion, true, a5.N).then(modifier2), ListItemDefaults.INSTANCE.getShape(composer1, 6), listItemColors2.containerColor-0d7_KjU$material3_release(), listItemColors2.headlineColor-vNxB06k$material3_release(true), f4, f5, null, ComposableLambdaKt.rememberComposableLambda(1502590376, true, new bc(composableLambda4, composableLambda0, composableLambda1, composableLambda3, composableLambda2, 0), composer1, 54), composer1, 0xE000 & v5 >> 9 | 0xC00000 | v5 >> 9 & 0x70000, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function28 = function212;
            f3 = f4;
            f2 = f5;
            function25 = function213;
            function29 = function214;
            function27 = function215;
            listItemColors1 = listItemColors2;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function27 = function24;
            listItemColors1 = listItemColors0;
            function28 = function26;
            function29 = function23;
            f3 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i0(function20, modifier1, function25, function28, function29, function27, listItemColors1, f3, f2, v, v1));
        }
    }

    public static final void access$ListItemLayout(Function2 function20, Function2 function21, Function2 function22, Function2 function23, Function2 function24, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2052297037);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changedInstance(function23) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changedInstance(function24) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052297037, v1, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:180)");
            }
            mc mc0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mc0 == composer$Companion0.getEmpty()) {
                mc0 = new mc();  // 初始化器: Ljava/lang/Object;-><init>()V
                composer1.updateRememberedValue(mc0);
            }
            List list0 = CollectionsKt__CollectionsKt.listOf(new Function2[]{function22, (function23 == null ? ComposableSingletons.ListItemKt.INSTANCE.getLambda-1$material3_release() : function23), (function24 == null ? ComposableSingletons.ListItemKt.INSTANCE.getLambda-2$material3_release() : function24), (function20 == null ? ComposableSingletons.ListItemKt.INSTANCE.getLambda-3$material3_release() : function20), (function21 == null ? ComposableSingletons.ListItemKt.INSTANCE.getLambda-4$material3_release() : function21)});
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Function2 function25 = LayoutKt.combineAsVirtualLayouts(list0);
            MeasurePolicy measurePolicy0 = composer1.rememberedValue();
            if(measurePolicy0 == composer$Companion0.getEmpty()) {
                measurePolicy0 = MultiContentMeasurePolicyKt.createMeasurePolicy(mc0);
                composer1.updateRememberedValue(measurePolicy0);
            }
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            Function2 function26 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function26);
            }
            if(r0.a.B(function25, composer1, r0.a.l(composeUiNode$Companion0, composer1, modifier0, 0))) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new fc(function20, function21, function22, function23, function24, v, 0));
        }
    }

    public static final void access$ProvideTextStyleFromToken-3J-VO9M(long v, TypographyKeyTokens typographyKeyTokens0, Function2 function20, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x4396F9B3);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changed(typographyKeyTokens0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4396F9B3, v2, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:657)");
            }
            ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(v, TypographyKt.getValue(typographyKeyTokens0, composer1, v2 >> 3 & 14), function20, composer1, v2 & 910);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gc(v, typographyKeyTokens0, function20, v1, 0));
        }
    }

    // 去混淆评级： 低(25)
    public static final int access$calculateHeight-N4Jib3Y(IntrinsicMeasureScope intrinsicMeasureScope0, int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7) {
        switch(v5) {
            case 1: {
                return c.coerceAtMost(Math.max(Math.max(Constraints.getMinHeight-impl(v7), intrinsicMeasureScope0.roundToPx-0680j_4(0.0f)), Math.max(v, Math.max(v2 + v3 + v4, v1)) + v6), Constraints.getMaxHeight-impl(v7));
            }
            case 2: {
                return c.coerceAtMost(Math.max(Math.max(Constraints.getMinHeight-impl(v7), intrinsicMeasureScope0.roundToPx-0680j_4(0.0f)), Math.max(v, Math.max(v2 + v3 + v4, v1)) + v6), Constraints.getMaxHeight-impl(v7));
            }
            default: {
                return c.coerceAtMost(Math.max(Math.max(Constraints.getMinHeight-impl(v7), intrinsicMeasureScope0.roundToPx-0680j_4(0.0f)), Math.max(v, Math.max(v2 + v3 + v4, v1)) + v6), Constraints.getMaxHeight-impl(v7));
            }
        }
    }

    // 去混淆评级： 低(20)
    public static final int access$calculateWidth-yeHjK3Y(IntrinsicMeasureScope intrinsicMeasureScope0, int v, int v1, int v2, int v3, int v4, int v5, long v6) {
        return Constraints.getHasBoundedWidth-impl(v6) ? Constraints.getMaxWidth-impl(v6) : v5 + v + Math.max(v2, Math.max(v3, v4)) + v1;
    }

    // 去混淆评级： 低(20)
    public static final boolean access$isSupportingMultilineHeuristic(Density density0, int v) {
        return v > density0.roundToPx--R2X_6o(0x141F00000L);
    }

    public static final MeasureResult access$place(MeasureScope measureScope0, int v, int v1, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z, int v2, int v3, int v4) {
        return MeasureScope.layout$default(measureScope0, v, v1, null, new hc(placeable0, placeable1, v2, z, v4, placeable2, placeable3, placeable4, v1, v, v3), 4, null);
    }

    public static final int access$subtractConstraintSafely(int v, int v1) {
        return v == 0x7FFFFFFF ? 0x7FFFFFFF : v - v1;
    }

    // 去混淆评级： 低(30)
    public static final float access$verticalPadding-yh95HIg(int v) {
        return v == 3 ? ListItemKt.b : ListItemKt.a;
    }

    public static final float getLeadingContentEndPadding() [...] // 潜在的解密器

    @VisibleForTesting
    public static void getLeadingContentEndPadding$annotations() {
    }

    public static final float getListItemEndPadding() [...] // 潜在的解密器

    @VisibleForTesting
    public static void getListItemEndPadding$annotations() {
    }

    public static final float getListItemStartPadding() [...] // 潜在的解密器

    @VisibleForTesting
    public static void getListItemStartPadding$annotations() {
    }

    public static final float getListItemThreeLineVerticalPadding() {
        return ListItemKt.b;
    }

    @VisibleForTesting
    public static void getListItemThreeLineVerticalPadding$annotations() {
    }

    public static final float getListItemVerticalPadding() {
        return ListItemKt.a;
    }

    @VisibleForTesting
    public static void getListItemVerticalPadding$annotations() {
    }

    public static final float getTrailingContentStartPadding() [...] // 潜在的解密器

    @VisibleForTesting
    public static void getTrailingContentStartPadding$annotations() {
    }
}

