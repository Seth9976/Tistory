package p0;

import androidx.compose.ui.graphics.ColorProducer;

public final class wb implements ColorProducer {
    public final int a;
    public final long b;

    public wb(long v, int v1) {
        this.a = v1;
        this.b = v;
        super();
    }

    @Override  // androidx.compose.ui.graphics.ColorProducer
    public final long invoke-0d7_KjU() {
        return this.b;
    }
}

