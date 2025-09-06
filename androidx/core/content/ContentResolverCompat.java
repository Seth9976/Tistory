package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class ContentResolverCompat {
    @Nullable
    public static Cursor query(@NonNull ContentResolver contentResolver0, @NonNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1, @Nullable CancellationSignal cancellationSignal0) {
        try {
            return contentResolver0.query(uri0, arr_s, s, arr_s1, s1, cancellationSignal0);
        }
        catch(Exception exception0) {
            if(exception0 instanceof OperationCanceledException) {
                throw new androidx.core.os.OperationCanceledException();
            }
            throw exception0;
        }
    }

    @Nullable
    @Deprecated
    public static Cursor query(@NonNull ContentResolver contentResolver0, @NonNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1, @Nullable androidx.core.os.CancellationSignal cancellationSignal0) {
        return cancellationSignal0 == null ? ContentResolverCompat.query(contentResolver0, uri0, arr_s, s, arr_s1, s1, null) : ContentResolverCompat.query(contentResolver0, uri0, arr_s, s, arr_s1, s1, ((CancellationSignal)cancellationSignal0.getCancellationSignalObject()));
    }
}

