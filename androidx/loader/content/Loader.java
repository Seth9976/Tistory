package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import wb.a;

public class Loader {
    public final class ForceLoadContentObserver extends ContentObserver {
        public final Loader a;

        public ForceLoadContentObserver() {
            super(new Handler());
        }

        @Override  // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override  // android.database.ContentObserver
        public void onChange(boolean z) {
            Loader.this.onContentChanged();
        }
    }

    public interface OnLoadCanceledListener {
        void onLoadCanceled(@NonNull Loader arg1);
    }

    public interface OnLoadCompleteListener {
        void onLoadComplete(@NonNull Loader arg1, @Nullable Object arg2);
    }

    public int a;
    public OnLoadCompleteListener b;
    public OnLoadCanceledListener c;
    public final Context d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public Loader(@NonNull Context context0) {
        this.e = false;
        this.f = false;
        this.g = true;
        this.h = false;
        this.i = false;
        this.d = context0.getApplicationContext();
    }

    @MainThread
    public void abandon() {
        this.f = true;
    }

    @MainThread
    public boolean cancelLoad() {
        return this.onCancelLoad();
    }

    public void commitContentChanged() {
        this.i = false;
    }

    @NonNull
    public String dataToString(@Nullable Object object0) {
        StringBuilder stringBuilder0 = new StringBuilder(0x40);
        DebugUtils.buildShortClassTag(object0, stringBuilder0);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    @MainThread
    public void deliverCancellation() {
        OnLoadCanceledListener loader$OnLoadCanceledListener0 = this.c;
        if(loader$OnLoadCanceledListener0 != null) {
            loader$OnLoadCanceledListener0.onLoadCanceled(this);
        }
    }

    @MainThread
    public void deliverResult(@Nullable Object object0) {
        OnLoadCompleteListener loader$OnLoadCompleteListener0 = this.b;
        if(loader$OnLoadCompleteListener0 != null) {
            loader$OnLoadCompleteListener0.onLoadComplete(this, object0);
        }
    }

    @Deprecated
    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.print(s);
        printWriter0.print("mId=");
        printWriter0.print(this.a);
        printWriter0.print(" mListener=");
        printWriter0.println(this.b);
        if(this.e || this.h || this.i) {
            printWriter0.print(s);
            printWriter0.print("mStarted=");
            printWriter0.print(this.e);
            printWriter0.print(" mContentChanged=");
            printWriter0.print(this.h);
            printWriter0.print(" mProcessingChange=");
            printWriter0.println(this.i);
        }
        if(this.f || this.g) {
            printWriter0.print(s);
            printWriter0.print("mAbandoned=");
            printWriter0.print(this.f);
            printWriter0.print(" mReset=");
            printWriter0.println(this.g);
        }
    }

    @MainThread
    public void forceLoad() {
        this.onForceLoad();
    }

    @NonNull
    public Context getContext() {
        return this.d;
    }

    public int getId() {
        return this.a;
    }

    public boolean isAbandoned() {
        return this.f;
    }

    public boolean isReset() {
        return this.g;
    }

    public boolean isStarted() {
        return this.e;
    }

    @MainThread
    public void onAbandon() {
    }

    @MainThread
    public boolean onCancelLoad() {
        return false;
    }

    @MainThread
    public void onContentChanged() {
        if(this.e) {
            this.forceLoad();
            return;
        }
        this.h = true;
    }

    @MainThread
    public void onForceLoad() {
    }

    @MainThread
    public void onReset() {
    }

    @MainThread
    public void onStartLoading() {
    }

    @MainThread
    public void onStopLoading() {
    }

    @MainThread
    public void registerListener(int v, @NonNull OnLoadCompleteListener loader$OnLoadCompleteListener0) {
        if(this.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.b = loader$OnLoadCompleteListener0;
        this.a = v;
    }

    @MainThread
    public void registerOnLoadCanceledListener(@NonNull OnLoadCanceledListener loader$OnLoadCanceledListener0) {
        if(this.c != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.c = loader$OnLoadCanceledListener0;
    }

    @MainThread
    public void reset() {
        this.onReset();
        this.g = true;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = false;
    }

    public void rollbackContentChanged() {
        if(this.i) {
            this.onContentChanged();
        }
    }

    @MainThread
    public final void startLoading() {
        this.e = true;
        this.g = false;
        this.f = false;
        this.onStartLoading();
    }

    @MainThread
    public void stopLoading() {
        this.e = false;
        this.onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.h;
        this.h = false;
        this.i |= z;
        return z;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x40);
        DebugUtils.buildShortClassTag(this, stringBuilder0);
        stringBuilder0.append(" id=");
        return a.c(this.a, "}", stringBuilder0);
    }

    @MainThread
    public void unregisterListener(@NonNull OnLoadCompleteListener loader$OnLoadCompleteListener0) {
        OnLoadCompleteListener loader$OnLoadCompleteListener1 = this.b;
        if(loader$OnLoadCompleteListener1 == null) {
            throw new IllegalStateException("No listener register");
        }
        if(loader$OnLoadCompleteListener1 != loader$OnLoadCompleteListener0) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }

    @MainThread
    public void unregisterOnLoadCanceledListener(@NonNull OnLoadCanceledListener loader$OnLoadCanceledListener0) {
        OnLoadCanceledListener loader$OnLoadCanceledListener1 = this.c;
        if(loader$OnLoadCanceledListener1 == null) {
            throw new IllegalStateException("No listener register");
        }
        if(loader$OnLoadCanceledListener1 != loader$OnLoadCanceledListener0) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.c = null;
    }
}

