package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.TimeUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ThreadPoolExecutor;
import l4.a;
import l4.d;
import l4.g;

public abstract class AsyncTaskLoader extends Loader {
    public final ThreadPoolExecutor j;
    public volatile a k;
    public volatile a l;
    public long m;
    public long n;
    public Handler o;

    public AsyncTaskLoader(@NonNull Context context0) {
        super(context0);
        this.n = -10000L;
        this.j = g.f;
    }

    public final void a() {
        if(this.l == null && this.k != null) {
            if(this.k.j) {
                this.k.j = false;
                this.o.removeCallbacks(this.k);
            }
            if(Long.compare(this.m, 0L) > 0 && SystemClock.uptimeMillis() < this.n + this.m) {
                this.k.j = true;
                this.o.postAtTime(this.k, this.n + this.m);
                return;
            }
            a a0 = this.k;
            ThreadPoolExecutor threadPoolExecutor0 = this.j;
            if(a0.c != ModernAsyncTask.Status.PENDING) {
                switch(d.a[a0.c.ordinal()]) {
                    case 1: {
                        throw new IllegalStateException("Cannot execute task: the task is already running.");
                    }
                    case 2: {
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                    default: {
                        throw new IllegalStateException("We should never reach this state");
                    }
                }
            }
            a0.c = ModernAsyncTask.Status.RUNNING;
            a0.a.getClass();
            threadPoolExecutor0.execute(a0.b);
        }
    }

    public void cancelLoadInBackground() {
    }

    @Override  // androidx.loader.content.Loader
    @Deprecated
    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        super.dump(s, fileDescriptor0, printWriter0, arr_s);
        if(this.k != null) {
            printWriter0.print(s);
            printWriter0.print("mTask=");
            printWriter0.print(this.k);
            printWriter0.print(" waiting=");
            printWriter0.println(this.k.j);
        }
        if(this.l != null) {
            printWriter0.print(s);
            printWriter0.print("mCancellingTask=");
            printWriter0.print(this.l);
            printWriter0.print(" waiting=");
            printWriter0.println(this.l.j);
        }
        if(this.m != 0L) {
            printWriter0.print(s);
            printWriter0.print("mUpdateThrottle=");
            TimeUtils.formatDuration(this.m, printWriter0);
            printWriter0.print(" mLastLoadCompleteTime=");
            TimeUtils.formatDuration(this.n, SystemClock.uptimeMillis(), printWriter0);
            printWriter0.println();
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.l != null;
    }

    @Nullable
    public abstract Object loadInBackground();

    @Override  // androidx.loader.content.Loader
    public boolean onCancelLoad() {
        if(this.k != null) {
            if(!this.e) {
                this.h = true;
            }
            if(this.l != null) {
                if(this.k.j) {
                    this.k.j = false;
                    this.o.removeCallbacks(this.k);
                }
                this.k = null;
                return false;
            }
            if(this.k.j) {
                this.k.j = false;
                this.o.removeCallbacks(this.k);
                this.k = null;
                return false;
            }
            a a0 = this.k;
            a0.d.set(true);
            boolean z = a0.b.cancel(false);
            if(z) {
                this.l = this.k;
                this.cancelLoadInBackground();
            }
            this.k = null;
            return z;
        }
        return false;
    }

    public void onCanceled(@Nullable Object object0) {
    }

    @Override  // androidx.loader.content.Loader
    public void onForceLoad() {
        super.onForceLoad();
        this.cancelLoad();
        this.k = new a(this);
        this.a();
    }

    @Nullable
    public Object onLoadInBackground() {
        return this.loadInBackground();
    }

    public void setUpdateThrottle(long v) {
        this.m = v;
        if(v != 0L) {
            this.o = new Handler();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void waitForLoader() {
        a a0 = this.k;
        if(a0 != null) {
            try {
                a0.i.await();
            }
            catch(InterruptedException unused_ex) {
            }
        }
    }
}

