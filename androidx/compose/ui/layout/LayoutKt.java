package androidx.compose.ui.layout;

import a5.b;
import androidx.compose.material3.sf;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.room.a;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z1.i;
import z1.j;
import z1.k;
import z1.l;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A8\u0010\u0002\u001A\u00020\u00032\u0016\u0010\u0004\u001A\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0087\b¢\u0006\u0002\u0010\f\u001A \u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0087\b¢\u0006\u0002\u0010\r\u001A>\u0010\u0002\u001A\u00020\u00032\u001C\u0010\u000E\u001A\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00070\u000F2\b\b\u0002\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u0010H\u0087\b¢\u0006\u0002\u0010\u0011\u001A7\u0010\u0012\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\t2\u0016\u0010\u0004\u001A\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\u0006\u0010\n\u001A\u00020\u000BH\u0007¢\u0006\u0002\u0010\u0013\u001A;\u0010\u0014\u001A\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\u001C\u0010\u000E\u001A\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00070\u000FH\u0001¢\u0006\u0002\u0010\u0015\u001A3\u0010\u0016\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00030\u0017¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001A2\u0006\u0010\b\u001A\u00020\tH\u0001¢\u0006\u0004\b\u001B\u0010\u001C\u001A3\u0010\u001D\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00030\u0017¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001A2\u0006\u0010\b\u001A\u00020\tH\u0001¢\u0006\u0004\b\u0016\u0010\u001C\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001E"}, d2 = {"LargeDimension", "", "Layout", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "modifier", "Landroidx/compose/ui/Modifier;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "contents", "", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MultiContentMeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "combineAsVirtualLayouts", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "materializerOf", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "Lkotlin/ExtensionFunctionType;", "modifierMaterializerOf", "(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;", "materializerOfWithCompositionLocalInjection", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,426:1\n78#1,6:468\n85#1,4:483\n89#1,2:493\n93#1:498\n368#2,9:427\n377#2,3:442\n289#2,9:445\n298#2,2:460\n368#2,9:474\n377#2,3:495\n368#2,9:499\n377#2,3:514\n4032#3,6:436\n4032#3,6:454\n4032#3,6:487\n4032#3,6:508\n1223#4,6:462\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n171#1:468,6\n171#1:483,4\n171#1:493,2\n171#1:498\n82#1:427,9\n82#1:442,3\n128#1:445,9\n128#1:460,2\n171#1:474,9\n171#1:495,3\n253#1:499,9\n253#1:514,3\n88#1:436,6\n135#1:454,6\n171#1:487,6\n262#1:508,6\n174#1:462,6\n*E\n"})
public final class LayoutKt {
    public static final int LargeDimension = 0x7FFF;

    @Composable
    @UiComposable
    public static final void Layout(@Nullable Modifier modifier0, @NotNull MeasurePolicy measurePolicy0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            modifier0 = Modifier.Companion;
        }
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        Updater.set-impl(composer0, measurePolicy0, composeUiNode$Companion0.getSetMeasurePolicy());
        Updater.set-impl(composer0, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function20);
        }
        composer0.endNode();
    }

    @Composable
    @UiComposable
    public static final void Layout(@NotNull List list0, @Nullable Modifier modifier0, @NotNull MultiContentMeasurePolicy multiContentMeasurePolicy0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            modifier0 = Modifier.Companion;
        }
        Function2 function20 = LayoutKt.combineAsVirtualLayouts(list0);
        boolean z = (v & 0x380 ^ 0x180) > 0x100 && composer0.changed(multiContentMeasurePolicy0) || (v & 0x180) == 0x100;
        MeasurePolicy measurePolicy0 = composer0.rememberedValue();
        if(z || measurePolicy0 == Composer.Companion.getEmpty()) {
            measurePolicy0 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy0);
            composer0.updateRememberedValue(measurePolicy0);
        }
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        Function2 function21 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function21);
        }
        function20.invoke(composer0, r0.a.l(composeUiNode$Companion0, composer0, modifier1, 0));
        composer0.endNode();
    }

    @Composable
    @UiComposable
    public static final void Layout(@NotNull Function2 function20, @Nullable Modifier modifier0, @NotNull MeasurePolicy measurePolicy0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            modifier0 = Modifier.Companion;
        }
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        Function2 function21 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function21);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        b.y(composer0, (v << 6 & 0x380 | 6) >> 6 & 14, function20);
    }

    @Composable
    @UiComposable
    @Deprecated(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    public static final void MultiMeasureLayout(@Nullable Modifier modifier0, @NotNull Function2 function20, @NotNull MeasurePolicy measurePolicy0, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(1949933075);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(measurePolicy0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949933075, v2, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:247)");
            }
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Function0 function00 = LayoutNode.Companion.getConstructor$ui_release();
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
            Updater.set-impl(composer1, measurePolicy0, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.init-impl(composer1, i.x);
            Updater.set-impl(composer1, modifier1, ComposeUiNode.Companion.getSetModifier());
            Function2 function21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function21);
            }
            function20.invoke(composer1, ((int)((v2 << 3 & 0x380 | 6) >> 6 & 14)));
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
            scopeUpdateScope0.updateScope(new sf(modifier0, function20, measurePolicy0, v, v1, 21));
        }
    }

    @PublishedApi
    @NotNull
    public static final Function2 combineAsVirtualLayouts(@NotNull List list0) {
        return ComposableLambdaKt.composableLambdaInstance(0x8B8DA549, true, new j(list0));
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Needed only for backwards compatibility. Do not use.")
    @PublishedApi
    @JvmName(name = "materializerOf")
    @NotNull
    public static final Function3 materializerOf(@NotNull Modifier modifier0) {
        return ComposableLambdaKt.composableLambdaInstance(0xFCAD6AB2, true, new l(modifier0));
    }

    @PublishedApi
    @JvmName(name = "modifierMaterializerOf")
    @NotNull
    public static final Function3 modifierMaterializerOf(@NotNull Modifier modifier0) {
        return ComposableLambdaKt.composableLambdaInstance(0xA173A20C, true, new k(modifier0));
    }
}

