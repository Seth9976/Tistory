package c6;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {
    public final int a;

    public b(int v) {
        this.a = v;
        super();
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        switch(this.a) {
            case 0: {
                return new a(runnable0);
            }
            case 1: {
                return new Thread(new com.bumptech.glide.load.engine.a(0, runnable0), "glide-active-resources");
            }
            default: {
                return new Thread(runnable0, "tiara_event_tracking");
            }
        }
    }
}

