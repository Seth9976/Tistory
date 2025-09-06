package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b4.a;
import b4.b;
import java.io.File;

public abstract class DocumentFile {
    public final DocumentFile a;

    public DocumentFile(DocumentFile documentFile0) {
        this.a = documentFile0;
    }

    public abstract boolean canRead();

    public abstract boolean canWrite();

    @Nullable
    public abstract DocumentFile createDirectory(@NonNull String arg1);

    @Nullable
    public abstract DocumentFile createFile(@NonNull String arg1, @NonNull String arg2);

    public abstract boolean delete();

    public abstract boolean exists();

    @Nullable
    public DocumentFile findFile(@NonNull String s) {
        DocumentFile[] arr_documentFile = this.listFiles();
        for(int v = 0; v < arr_documentFile.length; ++v) {
            DocumentFile documentFile0 = arr_documentFile[v];
            if(s.equals(documentFile0.getName())) {
                return documentFile0;
            }
        }
        return null;
    }

    @NonNull
    public static DocumentFile fromFile(@NonNull File file0) {
        return new a(null, file0);
    }

    @Nullable
    public static DocumentFile fromSingleUri(@NonNull Context context0, @NonNull Uri uri0) {
        DocumentFile documentFile0 = new b(null);
        documentFile0.c = context0;
        documentFile0.d = uri0;
        return documentFile0;
    }

    @Nullable
    public static DocumentFile fromTreeUri(@NonNull Context context0, @NonNull Uri uri0) {
        return new b(null, context0, DocumentsContract.buildDocumentUriUsingTree(uri0, DocumentsContract.getTreeDocumentId(uri0)));
    }

    @Nullable
    public abstract String getName();

    @Nullable
    public DocumentFile getParentFile() {
        return this.a;
    }

    @Nullable
    public abstract String getType();

    @NonNull
    public abstract Uri getUri();

    public abstract boolean isDirectory();

    public static boolean isDocumentUri(@NonNull Context context0, @Nullable Uri uri0) {
        return DocumentsContract.isDocumentUri(context0, uri0);
    }

    public abstract boolean isFile();

    public abstract boolean isVirtual();

    public abstract long lastModified();

    public abstract long length();

    @NonNull
    public abstract DocumentFile[] listFiles();

    public abstract boolean renameTo(@NonNull String arg1);
}

