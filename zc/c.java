package zc;

import android.os.Handler;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class c implements Disposable, Runnable {
    public final Handler a;
    public final Runnable b;
    public volatile boolean c;

    public c(Handler handler0, Runnable runnable0) {
        this.a = handler0;
        this.b = runnable0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.a.removeCallbacks(this);
        this.c = true;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c;
    }

    @Override
    public final void run() {
        try {
            this.b.run();
        }
        catch(Throwable throwable0) {
            RxJavaPlugins.onError(throwable0);
        }
    }
}

