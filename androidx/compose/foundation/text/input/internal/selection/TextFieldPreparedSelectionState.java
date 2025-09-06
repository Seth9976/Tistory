package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\r\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "", "<init>", "()V", "", "resetCachedX", "", "a", "F", "getCachedX", "()F", "setCachedX", "(F)V", "cachedX", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldPreparedSelectionState {
    public static final int $stable = 8;
    public float a;

    public TextFieldPreparedSelectionState() {
        this.a = NaNf;
    }

    public final float getCachedX() {
        return this.a;
    }

    public final void resetCachedX() {
        this.a = NaNf;
    }

    public final void setCachedX(float f) {
        this.a = f;
    }
}

