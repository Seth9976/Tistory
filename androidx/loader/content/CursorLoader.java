package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContentResolverCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class CursorLoader extends AsyncTaskLoader {
    public final ForceLoadContentObserver p;
    public Uri q;
    public String[] r;
    public String s;
    public String[] t;
    public String u;
    public Cursor v;
    public CancellationSignal w;

    public CursorLoader(@NonNull Context context0) {
        super(context0);
        this.p = new ForceLoadContentObserver(this);
    }

    public CursorLoader(@NonNull Context context0, @NonNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1) {
        super(context0);
        this.p = new ForceLoadContentObserver(this);
        this.q = uri0;
        this.r = arr_s;
        this.s = s;
        this.t = arr_s1;
        this.u = s1;
    }

    @Override  // androidx.loader.content.AsyncTaskLoader
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized(this) {
            CancellationSignal cancellationSignal0 = this.w;
            if(cancellationSignal0 != null) {
                cancellationSignal0.cancel();
            }
        }
    }

    public void deliverResult(Cursor cursor0) {
        if(this.isReset()) {
            if(cursor0 != null) {
                cursor0.close();
            }
            return;
        }
        Cursor cursor1 = this.v;
        this.v = cursor0;
        if(this.isStarted()) {
            super.deliverResult(cursor0);
        }
        if(cursor1 != null && cursor1 != cursor0 && !cursor1.isClosed()) {
            cursor1.close();
        }
    }

    @Override  // androidx.loader.content.Loader
    public void deliverResult(Object object0) {
        this.deliverResult(((Cursor)object0));
    }

    @Override  // androidx.loader.content.AsyncTaskLoader
    @Deprecated
    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        super.dump(s, fileDescriptor0, printWriter0, arr_s);
        printWriter0.print(s);
        printWriter0.print("mUri=");
        printWriter0.println(this.q);
        printWriter0.print(s);
        printWriter0.print("mProjection=");
        printWriter0.println(Arrays.toString(this.r));
        printWriter0.print(s);
        printWriter0.print("mSelection=");
        printWriter0.println(this.s);
        printWriter0.print(s);
        printWriter0.print("mSelectionArgs=");
        printWriter0.println(Arrays.toString(this.t));
        printWriter0.print(s);
        printWriter0.print("mSortOrder=");
        printWriter0.println(this.u);
        printWriter0.print(s);
        printWriter0.print("mCursor=");
        printWriter0.println(this.v);
        printWriter0.print(s);
        printWriter0.print("mContentChanged=");
        printWriter0.println(this.h);
    }

    @Nullable
    public String[] getProjection() {
        return this.r;
    }

    @Nullable
    public String getSelection() {
        return this.s;
    }

    @Nullable
    public String[] getSelectionArgs() {
        return this.t;
    }

    @Nullable
    public String getSortOrder() {
        return this.u;
    }

    @NonNull
    public Uri getUri() {
        return this.q;
    }

    public Cursor loadInBackground() {
        synchronized(this) {
            if(!this.isLoadInBackgroundCanceled()) {
                this.w = new CancellationSignal();
                try {
                    Cursor cursor0 = ContentResolverCompat.query(this.getContext().getContentResolver(), this.q, this.r, this.s, this.t, this.u, this.w);
                    if(cursor0 != null) {
                        try {
                            cursor0.getCount();
                            cursor0.registerContentObserver(this.p);
                        }
                        catch(RuntimeException runtimeException0) {
                            cursor0.close();
                            throw runtimeException0;
                        }
                    }
                    return cursor0;
                }
                finally {
                    synchronized(this) {
                        this.w = null;
                    }
                }
            }
        }
        throw new OperationCanceledException();
    }

    @Override  // androidx.loader.content.AsyncTaskLoader
    public Object loadInBackground() {
        return this.loadInBackground();
    }

    public void onCanceled(Cursor cursor0) {
        if(cursor0 != null && !cursor0.isClosed()) {
            cursor0.close();
        }
    }

    @Override  // androidx.loader.content.AsyncTaskLoader
    public void onCanceled(Object object0) {
        this.onCanceled(((Cursor)object0));
    }

    @Override  // androidx.loader.content.Loader
    public void onReset() {
        super.onReset();
        this.onStopLoading();
        if(this.v != null && !this.v.isClosed()) {
            this.v.close();
        }
        this.v = null;
    }

    @Override  // androidx.loader.content.Loader
    public void onStartLoading() {
        Cursor cursor0 = this.v;
        if(cursor0 != null) {
            this.deliverResult(cursor0);
        }
        if(this.takeContentChanged() || this.v == null) {
            this.forceLoad();
        }
    }

    @Override  // androidx.loader.content.Loader
    public void onStopLoading() {
        this.cancelLoad();
    }

    public void setProjection(@Nullable String[] arr_s) {
        this.r = arr_s;
    }

    public void setSelection(@Nullable String s) {
        this.s = s;
    }

    public void setSelectionArgs(@Nullable String[] arr_s) {
        this.t = arr_s;
    }

    public void setSortOrder(@Nullable String s) {
        this.u = s;
    }

    public void setUri(@NonNull Uri uri0) {
        this.q = uri0;
    }
}

