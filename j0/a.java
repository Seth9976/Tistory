package j0;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final long w;
    public final Modifier x;

    public a(Modifier modifier0, long v) {
        this.w = v;
        this.x = modifier0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9D712E02, v, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:64)");
        }
        long v1 = this.w;
        if(Long.compare(v1, 0x7FC000007FC00000L) == 0) {
            ((Composer)object0).startReplaceGroup(0x6D07A484);
            AndroidCursorHandle_androidKt.access$DefaultCursorHandle(this.x, ((Composer)object0), 0, 0);
        }
        else {
            ((Composer)object0).startReplaceGroup(1828881000);
            Modifier modifier0 = SizeKt.requiredSizeIn-qDBjuR0$default(this.x, DpSize.getWidth-D9Ej5fM(v1), DpSize.getHeight-D9Ej5fM(v1), 0.0f, 0.0f, 12, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopCenter(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
            CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
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
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                androidx.room.a.t(v2, composer0, v2, function20);
            }
            Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
            AndroidCursorHandle_androidKt.access$DefaultCursorHandle(null, ((Composer)object0), 0, 1);
            ((Composer)object0).endNode();
        }
        ((Composer)object0).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

