package z1;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function3 {
    public final Modifier w;

    public l(Modifier modifier0) {
        this.w = modifier0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = ((SkippableUpdater)object0).unbox-impl();
        int v = ((Number)object2).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFCAD6AB2, v, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:227)");
        }
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
        Modifier modifier0 = ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(((Composer)object1), this.w);
        composer0.startReplaceableGroup(509942095);
        Updater.set-impl(composer0, modifier0, ComposeUiNode.Companion.getSetModifier());
        Function2 function20 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

