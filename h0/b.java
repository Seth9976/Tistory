package h0;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function3 {
    public final boolean w;
    public final boolean x;
    public final Role y;
    public final Function0 z;

    public b(boolean z, boolean z1, Role role0, Function0 function00) {
        this.w = z;
        this.x = z1;
        this.y = role0;
        this.z = function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        MutableInteractionSource mutableInteractionSource0;
        Modifier modifier0 = (Modifier)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(0x815D0778);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x815D0778, v, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:76)");
        }
        Object object3 = ((Composer)object1).consume(IndicationKt.getLocalIndication());
        if(((Indication)object3) instanceof IndicationNodeFactory) {
            ((Composer)object1).startReplaceGroup(0xABD28DCE);
            ((Composer)object1).endReplaceGroup();
            mutableInteractionSource0 = null;
        }
        else {
            ((Composer)object1).startReplaceGroup(0xABD43393);
            MutableInteractionSource mutableInteractionSource1 = ((Composer)object1).rememberedValue();
            if(mutableInteractionSource1 == Composer.Companion.getEmpty()) {
                mutableInteractionSource1 = InteractionSourceKt.MutableInteractionSource();
                ((Composer)object1).updateRememberedValue(mutableInteractionSource1);
            }
            mutableInteractionSource0 = mutableInteractionSource1;
            ((Composer)object1).endReplaceGroup();
        }
        Modifier modifier1 = SelectableKt.selectable-O2vRcR0(Modifier.Companion, this.w, mutableInteractionSource0, ((Indication)object3), this.x, this.y, this.z);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier1;
    }
}

