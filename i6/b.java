package i6;

import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.ui.text.input.OffsetMapping;

public final class b implements OffsetMapping {
    public final int a;
    public final int b;
    public final Object c;

    public b() {
        this.c = new b[0x100];
        this.a = 0;
        this.b = 0;
    }

    public b(int v, int v1) {
        this.c = null;
        this.a = v;
        this.b = (v1 & 7) == 0 ? 8 : v1 & 7;
    }

    public b(Object object0, int v, int v1) {
        this.c = object0;
        this.a = v;
        this.b = v1;
        super();
    }

    @Override  // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int v) {
        int v1 = ((OffsetMapping)this.c).originalToTransformed(v);
        if(v >= 0 && v <= this.a) {
            ValidatingOffsetMappingKt.a(v1, this.b, v);
        }
        return v1;
    }

    @Override  // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int v) {
        int v1 = ((OffsetMapping)this.c).transformedToOriginal(v);
        if(v >= 0 && v <= this.b) {
            ValidatingOffsetMappingKt.b(v1, this.a, v);
        }
        return v1;
    }
}

