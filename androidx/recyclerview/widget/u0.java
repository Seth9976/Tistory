package androidx.recyclerview.widget;

import android.util.Log;

public final class u0 implements Runnable {
    public final v0 a;

    public u0(v0 v00) {
        this.a = v00;
    }

    @Override
    public final void run() {
        v0 v00 = this.a;
        for(y0 y00 = v00.a.i(); y00 != null; y00 = v00.a.i()) {
            MainThreadCallback threadUtil$MainThreadCallback0 = v00.d;
            switch(y00.b) {
                case 1: {
                    threadUtil$MainThreadCallback0.updateItemCount(y00.c, y00.d);
                    break;
                }
                case 2: {
                    threadUtil$MainThreadCallback0.addTile(y00.c, y00.h);
                    break;
                }
                case 3: {
                    threadUtil$MainThreadCallback0.removeTile(y00.c, y00.d);
                    break;
                }
                default: {
                    Log.e("ThreadUtil", "Unsupported message, what=" + y00.b);
                }
            }
        }
    }
}

