package p0;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class cc extends Lambda implements Function2 {
    public final float w;
    public final ComposableLambda x;

    public cc(float f, ComposableLambda composableLambda0) {
        this.w = f;
        this.x = composableLambda0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9AD9F450, v, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:264)");
        }
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(SizeKt.heightIn-VpY3zN4$default(Modifier.Companion, this.w, 0.0f, 2, null), 0.0f, 0.0f, dc.o, 0.0f, 11, null);
        ((Composer)object0).startReplaceableGroup(0x2BB5B5D7);
        MeasurePolicy measurePolicy0 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getCenter(), false, ((Composer)object0), 6);
        ((Composer)object0).startReplaceableGroup(-1323940314);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier0);
        if(((Composer)object0).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object0).startReusableNode();
        if(((Composer)object0).getInserting()) {
            ((Composer)object0).createNode(function00);
        }
        else {
            ((Composer)object0).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object0));
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        r0.a.w(0, function30, SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(((Composer)object0))), ((Composer)object0), 2058660585);
        this.x.invoke(((Composer)object0), 0);
        ((Composer)object0).endReplaceableGroup();
        ((Composer)object0).endNode();
        ((Composer)object0).endReplaceableGroup();
        ((Composer)object0).endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

