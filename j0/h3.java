package j0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable.2.wrappedScrollableState.1.1;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import fg.c;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class h3 extends Lambda implements Function3 {
    public final TextFieldScrollerPosition w;
    public final boolean x;
    public final MutableInteractionSource y;

    public h3(TextFieldScrollerPosition textFieldScrollerPosition0, MutableInteractionSource mutableInteractionSource0, boolean z) {
        this.w = textFieldScrollerPosition0;
        this.x = z;
        this.y = mutableInteractionSource0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier0 = (Modifier)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(0x3001DC2A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3001DC2A, v, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
        }
        boolean z = ((Composer)object1).consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        TextFieldScrollerPosition textFieldScrollerPosition0 = this.w;
        boolean z1 = textFieldScrollerPosition0.getOrientation() == Orientation.Vertical || !z;
        boolean z2 = ((Composer)object1).changed(textFieldScrollerPosition0);
        c c0 = ((Composer)object1).rememberedValue();
        if(z2 || c0 == Composer.Companion.getEmpty()) {
            c0 = new c(textFieldScrollerPosition0, 11);
            ((Composer)object1).updateRememberedValue(c0);
        }
        ScrollableState scrollableState0 = ScrollableStateKt.rememberScrollableState(c0, ((Composer)object1), 0);
        boolean z3 = ((Composer)object1).changed(scrollableState0);
        boolean z4 = ((Composer)object1).changed(textFieldScrollerPosition0);
        TextFieldScrollKt.textFieldScrollable.2.wrappedScrollableState.1.1 textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$10 = ((Composer)object1).rememberedValue();
        if(z3 || z4 || textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$10 == Composer.Companion.getEmpty()) {
            textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$10 = new TextFieldScrollKt.textFieldScrollable.2.wrappedScrollableState.1.1(scrollableState0, textFieldScrollerPosition0);
            ((Composer)object1).updateRememberedValue(textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$10);
        }
        Orientation orientation0 = textFieldScrollerPosition0.getOrientation();
        boolean z5 = this.x && textFieldScrollerPosition0.getMaximum() != 0.0f;
        Modifier modifier1 = ScrollableKt.scrollable$default(Modifier.Companion, textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$10, orientation0, z5, z1, null, this.y, 16, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier1;
    }
}

