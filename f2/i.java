package f2;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;

public final class i {
    public final SemanticsNode a;
    public final int b;
    public final IntRect c;
    public final LayoutCoordinates d;

    public i(SemanticsNode semanticsNode0, int v, IntRect intRect0, LayoutCoordinates layoutCoordinates0) {
        this.a = semanticsNode0;
        this.b = v;
        this.c = intRect0;
        this.d = layoutCoordinates0;
    }

    @Override
    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.a + ", depth=" + this.b + ", viewportBoundsInWindow=" + this.c + ", coordinates=" + this.d + ')';
    }
}

