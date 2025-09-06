package androidx.core.provider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;

public abstract class e {
    @DoNotInline
    public static boolean a(@NonNull Uri uri0) {
        return DocumentsContract.isTreeUri(uri0);
    }

    @DoNotInline
    public static boolean b(ContentResolver contentResolver0, Uri uri0, Uri uri1) throws FileNotFoundException {
        return DocumentsContract.removeDocument(contentResolver0, uri0, uri1);
    }
}

