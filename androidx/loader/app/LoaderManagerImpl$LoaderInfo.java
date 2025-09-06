package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.loader.content.Loader.OnLoadCompleteListener;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LoaderManagerImpl.LoaderInfo extends MutableLiveData implements OnLoadCompleteListener {
    public final int o;
    public final Bundle p;
    public final Loader q;
    public LifecycleOwner r;
    public a s;
    public Loader t;

    public LoaderManagerImpl.LoaderInfo(int v, Bundle bundle0, Loader loader0, Loader loader1) {
        this.o = v;
        this.p = bundle0;
        this.q = loader0;
        this.t = loader1;
        loader0.registerListener(v, this);
    }

    public final Loader d(boolean z) {
        if(b.c) {
            Log.v("LoaderManager", "  Destroying: " + this);
        }
        Loader loader0 = this.q;
        loader0.cancelLoad();
        loader0.abandon();
        a a0 = this.s;
        if(a0 != null) {
            this.removeObserver(a0);
            if(z && a0.c) {
                Loader loader1 = a0.a;
                if(b.c) {
                    Log.v("LoaderManager", "  Resetting: " + loader1);
                }
                a0.b.onLoaderReset(loader1);
            }
        }
        loader0.unregisterListener(this);
        if(a0 != null && !a0.c || z) {
            loader0.reset();
            return this.t;
        }
        return loader0;
    }

    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.print(s);
        printWriter0.print("mId=");
        printWriter0.print(this.o);
        printWriter0.print(" mArgs=");
        printWriter0.println(this.p);
        printWriter0.print(s);
        printWriter0.print("mLoader=");
        Loader loader0 = this.q;
        printWriter0.println(loader0);
        loader0.dump(s + "  ", fileDescriptor0, printWriter0, arr_s);
        if(this.s != null) {
            printWriter0.print(s);
            printWriter0.print("mCallbacks=");
            printWriter0.println(this.s);
            a a0 = this.s;
            a0.getClass();
            printWriter0.print(s + "  ");
            printWriter0.print("mDeliveredData=");
            printWriter0.println(a0.c);
        }
        printWriter0.print(s);
        printWriter0.print("mData=");
        printWriter0.println(loader0.dataToString(this.getValue()));
        printWriter0.print(s);
        printWriter0.print("mStarted=");
        printWriter0.println(this.hasActiveObservers());
    }

    public final void e() {
        LifecycleOwner lifecycleOwner0 = this.r;
        a a0 = this.s;
        if(lifecycleOwner0 != null && a0 != null) {
            super.removeObserver(a0);
            this.observe(lifecycleOwner0, a0);
        }
    }

    @Override  // androidx.lifecycle.LiveData
    public void onActive() {
        if(b.c) {
            Log.v("LoaderManager", "  Starting: " + this);
        }
        this.q.startLoading();
    }

    @Override  // androidx.lifecycle.LiveData
    public void onInactive() {
        if(b.c) {
            Log.v("LoaderManager", "  Stopping: " + this);
        }
        this.q.stopLoading();
    }

    @Override  // androidx.loader.content.Loader$OnLoadCompleteListener
    public void onLoadComplete(@NonNull Loader loader0, @Nullable Object object0) {
        if(b.c) {
            Log.v("LoaderManager", "onLoadComplete: " + this);
        }
        if(Looper.myLooper() == Looper.getMainLooper()) {
            this.setValue(object0);
            return;
        }
        if(b.c) {
            Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
        }
        this.postValue(object0);
    }

    @Override  // androidx.lifecycle.LiveData
    public void removeObserver(@NonNull Observer observer0) {
        super.removeObserver(observer0);
        this.r = null;
        this.s = null;
    }

    @Override  // androidx.lifecycle.MutableLiveData
    public void setValue(Object object0) {
        super.setValue(object0);
        Loader loader0 = this.t;
        if(loader0 != null) {
            loader0.reset();
            this.t = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x40);
        stringBuilder0.append("LoaderInfo{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" #");
        stringBuilder0.append(this.o);
        stringBuilder0.append(" : ");
        DebugUtils.buildShortClassTag(this.q, stringBuilder0);
        stringBuilder0.append("}}");
        return stringBuilder0.toString();
    }
}

