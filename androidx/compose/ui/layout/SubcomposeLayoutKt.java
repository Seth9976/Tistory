package androidx.compose.ui.layout;

import androidx.compose.foundation.text.selection.t;
import androidx.compose.material3.sf;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A8\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u001D\u0010\u0007\u001A\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001A@\u0010\t\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u001D\u0010\u0007\u001A\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\r\u001A\u0015\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "measurePolicy", "", "SubcomposeLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "state", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "maxSlotsToRetainForReuse", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "SubcomposeSlotReusePolicy", "(I)Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1013:1\n1223#2,6:1014\n1223#2,6:1037\n289#3,9:1020\n298#3,2:1035\n4032#4,6:1029\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n*L\n81#1:1014,6\n131#1:1037,6\n118#1:1020,9\n118#1:1035,2\n127#1:1029,6\n*E\n"})
public final class SubcomposeLayoutKt {
    public static final SubcomposeLayoutKt.ReusedSlotId.1 a;

    static {
        SubcomposeLayoutKt.a = new SubcomposeLayoutKt.ReusedSlotId.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SubcomposeLayout(@Nullable Modifier modifier0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xB29CB430);
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
        if((v2 & 19) != 18 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB29CB430, v2, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:78)");
            }
            SubcomposeLayoutState subcomposeLayoutState0 = composer1.rememberedValue();
            if(subcomposeLayoutState0 == Composer.Companion.getEmpty()) {
                subcomposeLayoutState0 = new SubcomposeLayoutState();
                composer1.updateRememberedValue(subcomposeLayoutState0);
            }
            SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState0, modifier0, function20, composer1, v2 << 3 & 0x3F0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t(modifier0, function20, v, v1, 3));
        }
    }

    @Composable
    @UiComposable
    public static final void SubcomposeLayout(@NotNull SubcomposeLayoutState subcomposeLayoutState0, @Nullable Modifier modifier0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xE17BA7B9);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(subcomposeLayoutState0) ? 4 : 2) | v : v;
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
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE17BA7B9, v2, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:112)");
            }
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionContext compositionContext0 = ComposablesKt.rememberCompositionContext(composer1, 0);
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
            Updater.set-impl(composer1, subcomposeLayoutState0, subcomposeLayoutState0.getSetRoot$ui_release());
            Updater.set-impl(composer1, compositionContext0, subcomposeLayoutState0.getSetCompositionContext$ui_release());
            Updater.set-impl(composer1, function20, subcomposeLayoutState0.getSetMeasurePolicy$ui_release());
            Updater.set-impl(composer1, compositionLocalMap0, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.set-impl(composer1, modifier1, ComposeUiNode.Companion.getSetModifier());
            Function2 function21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function21);
            }
            composer1.endNode();
            if(composer1.getSkipping()) {
                composer1.startReplaceGroup(-26502501);
            }
            else {
                composer1.startReplaceGroup(-26580342);
                boolean z = composer1.changedInstance(subcomposeLayoutState0);
                w1.a a0 = composer1.rememberedValue();
                if(z || a0 == Composer.Companion.getEmpty()) {
                    a0 = new w1.a(subcomposeLayoutState0, 9);
                    composer1.updateRememberedValue(a0);
                }
                EffectsKt.SideEffect(a0, composer1, 0);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(subcomposeLayoutState0, modifier0, function20, v, v1, 22));
        }
    }

    @NotNull
    public static final SubcomposeSlotReusePolicy SubcomposeSlotReusePolicy(int v) {
        return new c(v);
    }

    public static final SubcomposeLayoutKt.ReusedSlotId.1 access$getReusedSlotId$p() {
        return SubcomposeLayoutKt.a;
    }
}

