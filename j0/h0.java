package j0;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function0 {
    public final int w;
    public final TextFieldSelectionState x;

    public h0(TextFieldSelectionState textFieldSelectionState0, int v) {
        this.w = v;
        this.x = textFieldSelectionState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return this.x.getCursorHandleState$foundation_release(false);
            }
            case 1: {
                return this.x.getSelectionHandleState$foundation_release(false, false);
            }
            case 2: {
                return this.x.getSelectionHandleState$foundation_release(true, false);
            }
            case 3: {
                return this.x.a.getVisualText();
            }
            default: {
                this.x.clearHandleDragging();
                return Unit.INSTANCE;
            }
        }
    }
}

