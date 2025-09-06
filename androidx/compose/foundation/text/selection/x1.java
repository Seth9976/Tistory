package androidx.compose.foundation.text.selection;

import aa.m;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class x1 extends Lambda implements Function3 {
    public final TextFieldSelectionManager w;

    public x1(TextFieldSelectionManager textFieldSelectionManager0) {
        this.w = textFieldSelectionManager0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(1980580247);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1980580247, v, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:48)");
        }
        Density density0 = (Density)((Composer)object1).consume(CompositionLocalsKt.getLocalDensity());
        MutableState mutableState0 = ((Composer)object1).rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(IntSize.box-impl(0L), null, 2, null);
            ((Composer)object1).updateRememberedValue(mutableState0);
        }
        TextFieldSelectionManager textFieldSelectionManager0 = this.w;
        boolean z = ((Composer)object1).changedInstance(textFieldSelectionManager0);
        m m0 = ((Composer)object1).rememberedValue();
        if(z || m0 == composer$Companion0.getEmpty()) {
            m0 = new m(2, textFieldSelectionManager0, mutableState0);
            ((Composer)object1).updateRememberedValue(m0);
        }
        boolean z1 = ((Composer)object1).changed(density0);
        w1 w10 = ((Composer)object1).rememberedValue();
        if(z1 || w10 == composer$Companion0.getEmpty()) {
            w10 = new w1(density0, mutableState0);
            ((Composer)object1).updateRememberedValue(w10);
        }
        Modifier modifier0 = SelectionMagnifierKt.animatedSelectionMagnifier(((Modifier)object0), m0, w10);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier0;
    }
}

