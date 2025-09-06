package androidx.compose.ui.text.android;

public final class i {
    public final TextLayout a;
    public int b;
    public float c;

    public i(TextLayout textLayout0) {
        this.a = textLayout0;
        this.b = -1;
    }

    public final float a(boolean z, boolean z1, boolean z2, int v) {
        boolean z3;
        int v1 = 1;
        TextLayout textLayout0 = this.a;
        if(z) {
            int v2 = LayoutCompat_androidKt.getLineForOffset(textLayout0.getLayout(), v, true);
            z3 = v != textLayout0.getLineStart(v2) && v != textLayout0.getLineEnd(v2) ? false : true;
        }
        else {
            z3 = false;
        }
        if(!z2) {
            v1 = z3 ? 2 : 3;
        }
        else if(z3) {
            v1 = 0;
        }
        int v3 = v * 4 + v1;
        if(this.b == v3) {
            return this.c;
        }
        float f = z2 ? textLayout0.getPrimaryHorizontal(v, z) : textLayout0.getSecondaryHorizontal(v, z);
        if(z1) {
            this.b = v3;
            this.c = f;
        }
        return f;
    }
}

