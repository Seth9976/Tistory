package f8;

import com.google.android.material.textfield.b;

public final class d extends l {
    public final int e;

    public d(b b0, int v) {
        this.e = v;
        super(b0);
    }

    @Override  // f8.l
    public void r() {
        if(this.e != 0) {
            return;
        }
        this.b.o = null;
        this.b.g.setOnLongClickListener(null);
        g.b.E(this.b.g, null);
    }
}

