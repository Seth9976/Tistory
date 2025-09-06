package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;

public final class f implements FontProvider.ContentQueryWrapper {
    public final ContentProviderClient a;

    public f(Context context0, Uri uri0) {
        this.a = context0.getContentResolver().acquireUnstableContentProviderClient(uri0);
    }

    @Override  // androidx.core.provider.FontProvider$ContentQueryWrapper
    public final void close() {
        ContentProviderClient contentProviderClient0 = this.a;
        if(contentProviderClient0 != null) {
            contentProviderClient0.close();
        }
    }

    @Override  // androidx.core.provider.FontProvider$ContentQueryWrapper
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1, CancellationSignal cancellationSignal0) {
        ContentProviderClient contentProviderClient0 = this.a;
        if(contentProviderClient0 == null) {
            return null;
        }
        try {
            return contentProviderClient0.query(uri0, arr_s, s, arr_s1, s1, cancellationSignal0);
        }
        catch(RemoteException remoteException0) {
            Log.w("FontsProvider", "Unable to query the content provider", remoteException0);
            return null;
        }
    }
}

