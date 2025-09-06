package o0;

import androidx.compose.foundation.text.modifiers.SelectionController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final int w;
    public final SelectionController x;

    public a(SelectionController selectionController0, int v) {
        this.w = v;
        this.x = selectionController0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return this.x.d.getLayoutCoordinates();
            }
            case 1: {
                return this.x.d.getLayoutCoordinates();
            }
            default: {
                return this.x.d.getTextLayoutResult();
            }
        }
    }
}

