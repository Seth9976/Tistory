package q;

import android.os.Bundle;

public final class b implements Runnable {
    public final int a;
    public final String b;
    public final Bundle c;
    public final d d;

    public b(d d0, String s, Bundle bundle0, int v) {
        this.a = v;
        this.d = d0;
        this.b = s;
        this.c = bundle0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            this.d.b.onPostMessage(this.b, this.c);
            return;
        }
        this.d.b.extraCallback(this.b, this.c);
    }
}

