package androidx.appcompat.view.menu;

import android.view.MenuItem;
import dd.x;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.completable.CompletableTimeout;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public e(int v, Object object0, Object object1, Object object2, Object object3) {
        this.a = v;
        this.e = object0;
        this.b = object1;
        this.c = object2;
        this.d = object3;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            if(((AtomicBoolean)this.b).compareAndSet(false, true)) {
                ((CompositeDisposable)this.c).clear();
                CompletableTimeout completableTimeout0 = (CompletableTimeout)this.e;
                CompletableSource completableSource0 = completableTimeout0.e;
                if(completableSource0 == null) {
                    TimeoutException timeoutException0 = new TimeoutException(ExceptionHelper.timeoutMessage(completableTimeout0.b, completableTimeout0.c));
                    ((CompletableObserver)this.d).onError(timeoutException0);
                    return;
                }
                completableSource0.subscribe(new x(this));
            }
            return;
        }
        g g0 = (g)this.b;
        if(g0 != null) {
            ((h)((f)this.e).b).A = true;
            g0.b.close(false);
            ((h)((f)this.e).b).A = false;
        }
        MenuItem menuItem0 = (MenuItem)this.c;
        if(menuItem0.isEnabled() && menuItem0.hasSubMenu()) {
            ((MenuBuilder)this.d).performItemAction(menuItem0, 4);
        }
    }
}

