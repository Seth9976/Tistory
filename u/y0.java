package u;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class y0 extends Lambda implements Function3 {
    public final Function0 A;
    public final Function0 B;
    public final Function0 C;
    public final boolean w;
    public final String x;
    public final Role y;
    public final String z;

    public y0(boolean z, String s, Role role0, Function0 function00, Function0 function01, Function0 function02, String s1) {
        this.w = z;
        this.x = s;
        this.y = role0;
        this.z = s1;
        this.A = function00;
        this.B = function01;
        this.C = function02;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        MutableInteractionSource mutableInteractionSource0;
        Modifier modifier0 = (Modifier)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(0x755F393B);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x755F393B, v, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)");
        }
        Object object3 = ((Composer)object1).consume(IndicationKt.getLocalIndication());
        if(((Indication)object3) instanceof IndicationNodeFactory) {
            ((Composer)object1).startReplaceGroup(0x99103A7D);
            ((Composer)object1).endReplaceGroup();
            mutableInteractionSource0 = null;
        }
        else {
            ((Composer)object1).startReplaceGroup(0x9911E042);
            MutableInteractionSource mutableInteractionSource1 = ((Composer)object1).rememberedValue();
            if(mutableInteractionSource1 == Composer.Companion.getEmpty()) {
                mutableInteractionSource1 = InteractionSourceKt.MutableInteractionSource();
                ((Composer)object1).updateRememberedValue(mutableInteractionSource1);
            }
            mutableInteractionSource0 = mutableInteractionSource1;
            ((Composer)object1).endReplaceGroup();
        }
        Modifier modifier1 = ClickableKt.combinedClickable-XVZzFYc(Modifier.Companion, mutableInteractionSource0, ((Indication)object3), this.w, this.x, this.y, this.z, this.A, this.B, this.C);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier1;
    }
}

