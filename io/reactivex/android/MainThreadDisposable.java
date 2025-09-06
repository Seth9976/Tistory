package io.reactivex.android;

import android.os.Looper;
import androidx.appcompat.widget.a;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class MainThreadDisposable implements Disposable {
    public final AtomicBoolean a;

    public MainThreadDisposable() {
        this.a = new AtomicBoolean();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a.compareAndSet(false, true)) {
            if(Looper.myLooper() == Looper.getMainLooper()) {
                this.onDispose();
                return;
            }
            AndroidSchedulers.mainThread().scheduleDirect(new a(this, 22));
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.a.get();
    }

    public abstract void onDispose();

    public static void verifyMainThread() {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Expected to be called on the main thread but was jeb-dexdec-sb-st-2107");
        }
    }
}

