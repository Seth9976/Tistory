package androidx.core.provider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;

public abstract class d {
    @DoNotInline
    public static Uri a(String s, String s1) {
        return DocumentsContract.buildChildDocumentsUri(s, s1);
    }

    @DoNotInline
    public static Uri b(Uri uri0, String s) {
        return DocumentsContract.buildChildDocumentsUriUsingTree(uri0, s);
    }

    @DoNotInline
    public static Uri c(Uri uri0, String s) {
        return DocumentsContract.buildDocumentUriUsingTree(uri0, s);
    }

    @DoNotInline
    public static Uri d(String s, String s1) {
        return DocumentsContract.buildTreeDocumentUri(s, s1);
    }

    @DoNotInline
    public static Uri e(ContentResolver contentResolver0, Uri uri0, String s, String s1) throws FileNotFoundException {
        return DocumentsContract.createDocument(contentResolver0, uri0, s, s1);
    }

    @DoNotInline
    public static String f(Uri uri0) {
        return DocumentsContract.getTreeDocumentId(uri0);
    }

    @DoNotInline
    public static Uri g(@NonNull ContentResolver contentResolver0, @NonNull Uri uri0, @NonNull String s) throws FileNotFoundException {
        return DocumentsContract.renameDocument(contentResolver0, uri0, s);
    }
}

