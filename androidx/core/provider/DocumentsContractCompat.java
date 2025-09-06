package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;

public final class DocumentsContractCompat {
    public static final class DocumentCompat {
        public static final int FLAG_VIRTUAL_DOCUMENT = 0x200;

    }

    @Nullable
    public static Uri buildChildDocumentsUri(@NonNull String s, @Nullable String s1) {
        return d.a(s, s1);
    }

    @Nullable
    public static Uri buildChildDocumentsUriUsingTree(@NonNull Uri uri0, @NonNull String s) {
        return d.b(uri0, s);
    }

    @Nullable
    public static Uri buildDocumentUri(@NonNull String s, @NonNull String s1) {
        return DocumentsContract.buildDocumentUri(s, s1);
    }

    @Nullable
    public static Uri buildDocumentUriUsingTree(@NonNull Uri uri0, @NonNull String s) {
        return d.c(uri0, s);
    }

    @Nullable
    public static Uri buildTreeDocumentUri(@NonNull String s, @NonNull String s1) {
        return d.d(s, s1);
    }

    @Nullable
    public static Uri createDocument(@NonNull ContentResolver contentResolver0, @NonNull Uri uri0, @NonNull String s, @NonNull String s1) throws FileNotFoundException {
        return d.e(contentResolver0, uri0, s, s1);
    }

    @Nullable
    public static String getDocumentId(@NonNull Uri uri0) {
        return DocumentsContract.getDocumentId(uri0);
    }

    @Nullable
    public static String getTreeDocumentId(@NonNull Uri uri0) {
        return d.f(uri0);
    }

    public static boolean isDocumentUri(@NonNull Context context0, @Nullable Uri uri0) {
        return DocumentsContract.isDocumentUri(context0, uri0);
    }

    public static boolean isTreeUri(@NonNull Uri uri0) {
        return e.a(uri0);
    }

    public static boolean removeDocument(@NonNull ContentResolver contentResolver0, @NonNull Uri uri0, @NonNull Uri uri1) throws FileNotFoundException {
        return e.b(contentResolver0, uri0, uri1);
    }

    @Nullable
    public static Uri renameDocument(@NonNull ContentResolver contentResolver0, @NonNull Uri uri0, @NonNull String s) throws FileNotFoundException {
        return d.g(contentResolver0, uri0, s);
    }
}

