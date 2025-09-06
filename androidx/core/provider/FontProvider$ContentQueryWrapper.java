package androidx.core.provider;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

interface FontProvider.ContentQueryWrapper {
    void close();

    static FontProvider.ContentQueryWrapper make(Context context0, Uri uri0) {
        return new f(context0, uri0);
    }

    Cursor query(Uri arg1, String[] arg2, String arg3, String[] arg4, String arg5, CancellationSignal arg6);
}

