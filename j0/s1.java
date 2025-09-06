package j0;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.text.p;

public final class s1 extends Lambda implements Function3 {
    public final Object A;
    public final Object B;
    public final int w;
    public final boolean x;
    public final Object y;
    public final Object z;

    public s1(Object object0, boolean z, Object object1, Object object2, Object object3, int v) {
        this.w = v;
        this.y = object0;
        this.x = z;
        this.z = object1;
        this.A = object2;
        this.B = object3;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            int v = ((Number)object2).intValue();
            if((v & 6) == 0) {
                v |= (((Composer)object1).changed(((ContextMenuColors)object0)) ? 4 : 2);
            }
            if((v & 19) == 18 && ((Composer)object1).getSkipping()) {
                ((Composer)object1).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF9F600C, v, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:275)");
            }
            Object object3 = ((Function2)this.y).invoke(((Composer)object1), 0);
            if(p.isBlank(((String)object3))) {
                throw new IllegalStateException("Label must not be blank");
            }
            ContextMenuUi_androidKt.ContextMenuItem(((String)object3), this.x, ((ContextMenuColors)object0), ((Modifier)this.z), ((Function3)this.A), ((Function0)this.B), ((Composer)object1), v << 6 & 0x380, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object0).intValue();
        int v2 = ((Number)object1).intValue();
        boolean z = ((Boolean)object2).booleanValue();
        OffsetMapping offsetMapping0 = (OffsetMapping)this.y;
        if(!z) {
            v1 = offsetMapping0.transformedToOriginal(v1);
        }
        if(!z) {
            v2 = offsetMapping0.transformedToOriginal(v2);
        }
        if(this.x) {
            TextFieldValue textFieldValue0 = (TextFieldValue)this.z;
            if(v1 != TextRange.getStart-impl(textFieldValue0.getSelection-d9O1mEE()) || v2 != TextRange.getEnd-impl(textFieldValue0.getSelection-d9O1mEE())) {
                TextFieldSelectionManager textFieldSelectionManager0 = (TextFieldSelectionManager)this.A;
                if(Math.min(v1, v2) >= 0 && Math.max(v1, v2) <= textFieldValue0.getAnnotatedString().length()) {
                    if(z || v1 == v2) {
                        textFieldSelectionManager0.exitSelectionMode$foundation_release();
                    }
                    else {
                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager0, false, 1, null);
                    }
                    TextFieldValue textFieldValue1 = new TextFieldValue(textFieldValue0.getAnnotatedString(), TextRangeKt.TextRange(v1, v2), null, 4, null);
                    ((LegacyTextFieldState)this.B).getOnValueChange().invoke(textFieldValue1);
                    return true;
                }
                textFieldSelectionManager0.exitSelectionMode$foundation_release();
            }
        }
        return false;
    }
}

