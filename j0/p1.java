package j0;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p1 extends Lambda implements Function1 {
    public final int w;
    public final LegacyTextFieldState x;

    public p1(LegacyTextFieldState legacyTextFieldState0, int v) {
        this.w = v;
        this.x = legacyTextFieldState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                TextLayoutResultProxy textLayoutResultProxy0 = this.x.getLayoutResult();
                if(textLayoutResultProxy0 != null) {
                    textLayoutResultProxy0.setDecorationBoxCoordinates(((LayoutCoordinates)object0));
                }
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.setInTouchMode(((Boolean)object0).booleanValue());
                return Unit.INSTANCE;
            }
            case 2: {
                LegacyTextFieldState legacyTextFieldState0 = this.x;
                if(legacyTextFieldState0.getLayoutResult() != null) {
                    TextLayoutResultProxy textLayoutResultProxy1 = legacyTextFieldState0.getLayoutResult();
                    Intrinsics.checkNotNull(textLayoutResultProxy1);
                    ((List)object0).add(textLayoutResultProxy1.getValue());
                    return true;
                }
                return false;
            }
            default: {
                this.x.r.runAction-KlQnJC8(((ImeAction)object0).unbox-impl());
                return Unit.INSTANCE;
            }
        }
    }
}

