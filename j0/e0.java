package j0;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.OffsetProvider;

public final class e0 implements OffsetProvider {
    public final int a;
    public final TextFieldSelectionState b;

    public e0(TextFieldSelectionState textFieldSelectionState0, int v) {
        this.a = v;
        this.b = textFieldSelectionState0;
        super();
    }

    @Override  // androidx.compose.foundation.text.selection.OffsetProvider
    public final long provide-F1C5BW0() {
        switch(this.a) {
            case 0: {
                return this.b.getCursorHandleState$foundation_release(true).getPosition-F1C5BW0();
            }
            case 1: {
                return this.b.getSelectionHandleState$foundation_release(true, true).getPosition-F1C5BW0();
            }
            default: {
                return this.b.getSelectionHandleState$foundation_release(false, true).getPosition-F1C5BW0();
            }
        }
    }
}

