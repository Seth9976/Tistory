package androidx.recyclerview.widget;

import a7.b;
import android.util.Log;

public final class w0 implements Runnable {
    public final x0 a;

    public w0(x0 x00) {
        this.a = x00;
    }

    @Override
    public final void run() {
        x0 x00;
        while(true) {
            x00 = this.a;
            y0 y00 = x00.a.i();
            if(y00 == null) {
                break;
            }
            int v = y00.b;
            b b0 = x00.a;
            BackgroundCallback threadUtil$BackgroundCallback0 = x00.e;
            if(v == 1) {
                b0.m(1);
                threadUtil$BackgroundCallback0.refresh(y00.c);
            }
            else {
                switch(v) {
                    case 2: {
                        b0.m(2);
                        b0.m(3);
                        x00.e.updateRange(y00.c, y00.d, y00.e, y00.f, y00.g);
                        break;
                    }
                    case 3: {
                        threadUtil$BackgroundCallback0.loadTile(y00.c, y00.d);
                        break;
                    }
                    default: {
                        if(v == 4) {
                            threadUtil$BackgroundCallback0.recycleTile(y00.h);
                        }
                        else {
                            Log.e("ThreadUtil", "Unsupported message, what=" + y00.b);
                        }
                        break;
                    }
                }
            }
        }
        x00.c.set(false);
    }
}

