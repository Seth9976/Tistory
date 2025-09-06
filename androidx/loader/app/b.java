package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

public final class b extends LoaderManager {
    public final LifecycleOwner a;
    public final k4.b b;
    public static boolean c = false;

    public b(LifecycleOwner lifecycleOwner0, ViewModelStore viewModelStore0) {
        this.a = lifecycleOwner0;
        this.b = (k4.b)new ViewModelProvider(viewModelStore0, k4.b.J0).get(k4.b.class);
    }

    public final Loader a(int v, Bundle bundle0, LoaderCallbacks loaderManager$LoaderCallbacks0, Loader loader0) {
        k4.b b0;
        try {
            b0 = this.b;
            b0.I0 = true;
            Loader loader1 = loaderManager$LoaderCallbacks0.onCreateLoader(v, bundle0);
            if(loader1 != null) {
                if(loader1.getClass().isMemberClass() && !Modifier.isStatic(loader1.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + loader1);
                }
                LoaderManagerImpl.LoaderInfo loaderManagerImpl$LoaderInfo0 = new LoaderManagerImpl.LoaderInfo(v, bundle0, loader1, loader0);
                if(b.c) {
                    Log.v("LoaderManager", "  Created new loader " + loaderManagerImpl$LoaderInfo0);
                }
                b0.H0.put(v, loaderManagerImpl$LoaderInfo0);
                Loader loader2 = loaderManagerImpl$LoaderInfo0.q;
                a a0 = new a(loader2, loaderManager$LoaderCallbacks0);
                LifecycleOwner lifecycleOwner0 = this.a;
                loaderManagerImpl$LoaderInfo0.observe(lifecycleOwner0, a0);
                a a1 = loaderManagerImpl$LoaderInfo0.s;
                if(a1 != null) {
                    loaderManagerImpl$LoaderInfo0.removeObserver(a1);
                }
                loaderManagerImpl$LoaderInfo0.r = lifecycleOwner0;
                loaderManagerImpl$LoaderInfo0.s = a0;
                return loader2;
            }
        }
        finally {
            b0.I0 = false;
        }
        throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
    }

    @Override  // androidx.loader.app.LoaderManager
    public final void destroyLoader(int v) {
        k4.b b0 = this.b;
        if(b0.I0) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if(Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if(b.c) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of " + v);
        }
        LoaderManagerImpl.LoaderInfo loaderManagerImpl$LoaderInfo0 = (LoaderManagerImpl.LoaderInfo)b0.H0.get(v);
        if(loaderManagerImpl$LoaderInfo0 != null) {
            loaderManagerImpl$LoaderInfo0.d(true);
            b0.H0.remove(v);
        }
    }

    @Override  // androidx.loader.app.LoaderManager
    public final void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        SparseArrayCompat sparseArrayCompat0 = this.b.H0;
        if(sparseArrayCompat0.size() > 0) {
            printWriter0.print(s);
            printWriter0.println("Loaders:");
            for(int v = 0; v < sparseArrayCompat0.size(); ++v) {
                LoaderManagerImpl.LoaderInfo loaderManagerImpl$LoaderInfo0 = (LoaderManagerImpl.LoaderInfo)sparseArrayCompat0.valueAt(v);
                printWriter0.print(s);
                printWriter0.print("  #");
                printWriter0.print(sparseArrayCompat0.keyAt(v));
                printWriter0.print(": ");
                printWriter0.println(loaderManagerImpl$LoaderInfo0.toString());
                loaderManagerImpl$LoaderInfo0.dump(s + "    ", fileDescriptor0, printWriter0, arr_s);
            }
        }
    }

    @Override  // androidx.loader.app.LoaderManager
    public final Loader getLoader(int v) {
        k4.b b0 = this.b;
        if(b0.I0) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderManagerImpl.LoaderInfo loaderManagerImpl$LoaderInfo0 = (LoaderManagerImpl.LoaderInfo)b0.H0.get(v);
        return loaderManagerImpl$LoaderInfo0 == null ? null : loaderManagerImpl$LoaderInfo0.q;
    }

    @Override  // androidx.loader.app.LoaderManager
    public final boolean hasRunningLoaders() {
        SparseArrayCompat sparseArrayCompat0 = this.b.H0;
        int v = sparseArrayCompat0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            LoaderManagerImpl.LoaderInfo loaderManagerImpl$LoaderInfo0 = (LoaderManagerImpl.LoaderInfo)sparseArrayCompat0.valueAt(v1);
            if(loaderManagerImpl$LoaderInfo0.hasActiveObservers() && (loaderManagerImpl$LoaderInfo0.s != null && !loaderManagerImpl$LoaderInfo0.s.c)) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.loader.app.LoaderManager
    public final Loader initLoader(int v, Bundle bundle0, LoaderCallbacks loaderManager$LoaderCallbacks0) {
        k4.b b0 = this.b;
        if(b0.I0) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if(Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        LoaderManagerImpl.LoaderInfo loaderManagerImpl$LoaderInfo0 = (LoaderManagerImpl.LoaderInfo)b0.H0.get(v);
        if(b.c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle0);
        }
        if(loaderManagerImpl$LoaderInfo0 == null) {
            return this.a(v, bundle0, loaderManager$LoaderCallbacks0, null);
        }
        if(b.c) {
            Log.v("LoaderManager", "  Re-using existing loader " + loaderManagerImpl$LoaderInfo0);
        }
        Loader loader0 = loaderManagerImpl$LoaderInfo0.q;
        a a0 = new a(loader0, loaderManager$LoaderCallbacks0);
        LifecycleOwner lifecycleOwner0 = this.a;
        loaderManagerImpl$LoaderInfo0.observe(lifecycleOwner0, a0);
        a a1 = loaderManagerImpl$LoaderInfo0.s;
        if(a1 != null) {
            loaderManagerImpl$LoaderInfo0.removeObserver(a1);
        }
        loaderManagerImpl$LoaderInfo0.r = lifecycleOwner0;
        loaderManagerImpl$LoaderInfo0.s = a0;
        return loader0;
    }

    @Override  // androidx.loader.app.LoaderManager
    public final void markForRedelivery() {
        SparseArrayCompat sparseArrayCompat0 = this.b.H0;
        int v = sparseArrayCompat0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((LoaderManagerImpl.LoaderInfo)sparseArrayCompat0.valueAt(v1)).e();
        }
    }

    @Override  // androidx.loader.app.LoaderManager
    public final Loader restartLoader(int v, Bundle bundle0, LoaderCallbacks loaderManager$LoaderCallbacks0) {
        k4.b b0 = this.b;
        if(b0.I0) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if(Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if(b.c) {
            Log.v("LoaderManager", "restartLoader in " + this + ": args=" + bundle0);
        }
        LoaderManagerImpl.LoaderInfo loaderManagerImpl$LoaderInfo0 = (LoaderManagerImpl.LoaderInfo)b0.H0.get(v);
        return loaderManagerImpl$LoaderInfo0 == null ? this.a(v, bundle0, loaderManager$LoaderCallbacks0, null) : this.a(v, bundle0, loaderManager$LoaderCallbacks0, loaderManagerImpl$LoaderInfo0.d(false));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("LoaderManager{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" in ");
        DebugUtils.buildShortClassTag(this.a, stringBuilder0);
        stringBuilder0.append("}}");
        return stringBuilder0.toString();
    }
}

