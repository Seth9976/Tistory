package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.Arrangement.Absolute;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.DpSize;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final long w;
    public final boolean x;
    public final Modifier y;
    public final OffsetProvider z;

    public c(long v, boolean z, Modifier modifier0, OffsetProvider offsetProvider0) {
        this.w = v;
        this.x = z;
        this.y = modifier0;
        this.z = offsetProvider0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAAFA5591, v, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:83)");
        }
        long v1 = this.w;
        OffsetProvider offsetProvider0 = this.z;
        boolean z = this.x;
        if(Long.compare(v1, 0x7FC000007FC00000L) == 0) {
            composer0.startReplaceGroup(0xCE1E6B10);
            boolean z2 = composer0.changedInstance(offsetProvider0);
            b b1 = composer0.rememberedValue();
            if(z2 || b1 == Composer.Companion.getEmpty()) {
                b1 = new b(offsetProvider0, 1);
                composer0.updateRememberedValue(b1);
            }
            AndroidSelectionHandles_androidKt.SelectionHandleIcon(this.y, b1, z, composer0, 0);
        }
        else {
            composer0.startReplaceGroup(0xCE114C68);
            Modifier modifier0 = SizeKt.requiredSizeIn-qDBjuR0$default(this.y, DpSize.getWidth-D9Ej5fM(v1), DpSize.getHeight-D9Ej5fM(v1), 0.0f, 0.0f, 12, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy((z ? Absolute.INSTANCE.getRight() : Absolute.INSTANCE.getLeft()), Alignment.Companion.getTop(), composer0, 0);
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                a.t(v2, composer0, v2, function20);
            }
            Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            boolean z1 = composer0.changedInstance(offsetProvider0);
            b b0 = composer0.rememberedValue();
            if(z1 || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(offsetProvider0, 0);
                composer0.updateRememberedValue(b0);
            }
            AndroidSelectionHandles_androidKt.SelectionHandleIcon(modifier$Companion0, b0, z, composer0, 6);
            composer0.endNode();
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

