package androidx.window.layout;

import android.app.Activity;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;

public final class b implements Consumer {
    public final Activity a;
    public final ReentrantLock b;
    public WindowLayoutInfo c;
    public final LinkedHashSet d;

    public b(Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        super();
        this.a = activity0;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }

    public final void a(androidx.core.util.Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "listener");
        ReentrantLock reentrantLock0 = this.b;
        reentrantLock0.lock();
        try {
            WindowLayoutInfo windowLayoutInfo0 = this.c;
            if(windowLayoutInfo0 != null) {
                consumer0.accept(windowLayoutInfo0);
            }
            this.d.add(consumer0);
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Override
    public final void accept(Object object0) {
        Intrinsics.checkNotNullParameter(((androidx.window.extensions.layout.WindowLayoutInfo)object0), "value");
        ReentrantLock reentrantLock0 = this.b;
        reentrantLock0.lock();
        try {
            this.c = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.a, ((androidx.window.extensions.layout.WindowLayoutInfo)object0));
            for(Object object1: this.d) {
                ((androidx.core.util.Consumer)object1).accept(this.c);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    public final boolean b() {
        return this.d.isEmpty();
    }

    public final void c(androidx.core.util.Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "listener");
        this.b.lock();
        try {
            this.d.remove(consumer0);
        }
        finally {
            this.b.unlock();
        }
    }
}

