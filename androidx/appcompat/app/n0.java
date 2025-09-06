package androidx.appcompat.app;

import com.bumptech.glide.util.Util;
import java.util.concurrent.Executor;

public final class n0 implements Executor {
    public final int a;

    public n0(int v) {
        this.a = v;
        super();
    }

    @Override
    public final void execute(Runnable runnable0) {
        switch(this.a) {
            case 0: {
                new Thread(runnable0).start();
                return;
            }
            case 1: {
                runnable0.run();
                return;
            }
            case 2: {
                Util.postOnUiThread(runnable0);
                return;
            }
            default: {
                runnable0.run();
            }
        }
    }
}

