package p0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ChipColors;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j2 extends Lambda implements Function2 {
    public final Function2 w;
    public final ChipColors x;
    public final boolean y;
    public final Function3 z;

    public j2(Function2 function20, ChipColors chipColors0, boolean z, Function3 function30) {
        this.w = function20;
        this.x = chipColors0;
        this.y = z;
        this.z = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBC930C80, v, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:114)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.defaultMinSize-VpY3zN4$default(modifier$Companion0, 0.0f, 32.0f, 1, null);
        Function2 function20 = this.w;
        Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(modifier0, (function20 == null ? 12.0f : 0.0f), 0.0f, 12.0f, 0.0f, 10, null);
        composer0.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer0, 54);
        composer0.startReplaceableGroup(-1323940314);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier1);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function21);
        }
        r0.a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        composer0.startReplaceableGroup(0x7C435B01);
        if(function20 != null) {
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 4.0f), composer0, 6);
            State state0 = this.x.leadingIconContentColor(this.y, composer0, 0);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(((Color)state0.getValue()).unbox-impl())), ContentAlphaKt.getLocalContentAlpha().provides(Color.getAlpha-impl(((Color)state0.getValue()).unbox-impl()))}, function20, composer0, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 8.0f), composer0, 6);
        }
        composer0.endReplaceableGroup();
        this.z.invoke(rowScopeInstance0, composer0, 6);
        composer0.endReplaceableGroup();
        composer0.endNode();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

