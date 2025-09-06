package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0015\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Spacer", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSpacer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,56:1\n124#2,6:57\n131#2,5:72\n136#2:83\n138#2:86\n289#3,9:63\n298#3,2:84\n4032#4,6:77\n*S KotlinDebug\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n*L\n40#1:57,6\n40#1:72,5\n40#1:83\n40#1:86\n40#1:63,9\n40#1:84,2\n40#1:77,6\n*E\n"})
public final class SpacerKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Spacer(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFBA7E6DD, v, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        t t0 = t.c;
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
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
        Updater.set-impl(composer0, t0, composeUiNode$Companion0.getSetMeasurePolicy());
        Updater.set-impl(composer0, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

