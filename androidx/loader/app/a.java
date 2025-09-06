package androidx.loader.app;

import android.util.Log;
import androidx.lifecycle.Observer;
import androidx.loader.content.Loader;

public final class a implements Observer {
    public final Loader a;
    public final LoaderCallbacks b;
    public boolean c;

    public a(Loader loader0, LoaderCallbacks loaderManager$LoaderCallbacks0) {
        this.c = false;
        this.a = loader0;
        this.b = loaderManager$LoaderCallbacks0;
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        Loader loader0 = this.a;
        if(b.c) {
            Log.v("LoaderManager", "  onLoadFinished in " + loader0 + ": " + loader0.dataToString(object0));
        }
        this.b.onLoadFinished(loader0, object0);
        this.c = true;
    }

    @Override
    public final String toString() {
        return this.b.toString();
    }
}

