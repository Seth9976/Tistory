package b4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.documentfile.provider.DocumentFile;
import g.a;
import java.util.ArrayList;

public final class b extends DocumentFile {
    public final int b;
    public Context c;
    public Uri d;

    public b(DocumentFile documentFile0) {
        this.b = 0;
        super(documentFile0);
    }

    public b(b b0, Context context0, Uri uri0) {
        this.b = 1;
        super(b0);
        this.c = context0;
        this.d = uri0;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean canRead() {
        if(this.b != 0) {
            Context context0 = this.c;
            Uri uri0 = this.d;
            return context0.checkCallingOrSelfUriPermission(uri0, 1) == 0 ? !TextUtils.isEmpty(a.U(context0, uri0, "mime_type")) : false;
        }
        Context context1 = this.c;
        Uri uri1 = this.d;
        return context1.checkCallingOrSelfUriPermission(uri1, 1) == 0 ? !TextUtils.isEmpty(a.U(context1, uri1, "mime_type")) : false;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean canWrite() {
        return a.e(this.c, this.d);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final DocumentFile createDirectory(String s) {
        Uri uri1;
        Context context0;
        if(this.b == 0) {
            throw new UnsupportedOperationException();
        }
        try {
            Uri uri0 = this.d;
            context0 = this.c;
            uri1 = null;
            uri1 = DocumentsContract.createDocument(context0.getContentResolver(), uri0, "vnd.android.document/directory", s);
        }
        catch(Exception unused_ex) {
        }
        return uri1 != null ? new b(this, context0, uri1) : null;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final DocumentFile createFile(String s, String s1) {
        Uri uri1;
        Context context0;
        if(this.b == 0) {
            throw new UnsupportedOperationException();
        }
        try {
            Uri uri0 = this.d;
            context0 = this.c;
            uri1 = null;
            uri1 = DocumentsContract.createDocument(context0.getContentResolver(), uri0, s, s1);
        }
        catch(Exception unused_ex) {
        }
        return uri1 != null ? new b(this, context0, uri1) : null;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean delete() {
        if(this.b != 0) {
            try {
                return DocumentsContract.deleteDocument(this.c.getContentResolver(), this.d);
            }
            catch(Exception unused_ex) {
                return false;
            }
        }
        try {
            return DocumentsContract.deleteDocument(this.c.getContentResolver(), this.d);
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean exists() {
        return a.s(this.c, this.d);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final String getName() {
        return a.U(this.c, this.d, "_display_name");
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final String getType() {
        if(this.b != 0) {
            String s = a.U(this.c, this.d, "mime_type");
            return "vnd.android.document/directory".equals(s) ? null : s;
        }
        String s1 = a.U(this.c, this.d, "mime_type");
        return "vnd.android.document/directory".equals(s1) ? null : s1;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final Uri getUri() {
        return this.d;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean isDirectory() {
        return "vnd.android.document/directory".equals(a.U(this.c, this.d, "mime_type"));
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean isFile() {
        if(this.b != 0) {
            String s = a.U(this.c, this.d, "mime_type");
            return !"vnd.android.document/directory".equals(s) && !TextUtils.isEmpty(s);
        }
        String s1 = a.U(this.c, this.d, "mime_type");
        return !"vnd.android.document/directory".equals(s1) && !TextUtils.isEmpty(s1);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean isVirtual() {
        if(this.b != 0) {
            Context context0 = this.c;
            Uri uri0 = this.d;
            return DocumentsContract.isDocumentUri(context0, uri0) && (a.T(context0, uri0, "flags", 0L) & 0x200L) != 0L;
        }
        Context context1 = this.c;
        Uri uri1 = this.d;
        return DocumentsContract.isDocumentUri(context1, uri1) && (a.T(context1, uri1, "flags", 0L) & 0x200L) != 0L;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final long lastModified() {
        return a.T(this.c, this.d, "last_modified", 0L);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final long length() {
        return a.T(this.c, this.d, "_size", 0L);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final DocumentFile[] listFiles() {
        if(this.b != 0) {
            Context context0 = this.c;
            ContentResolver contentResolver0 = context0.getContentResolver();
            Uri uri0 = DocumentsContract.buildChildDocumentsUriUsingTree(this.d, DocumentsContract.getDocumentId(this.d));
            ArrayList arrayList0 = new ArrayList();
            Cursor cursor0 = null;
            try {
                try {
                    cursor0 = contentResolver0.query(uri0, new String[]{"document_id"}, null, null, null);
                    while(true) {
                        if(!cursor0.moveToNext()) {
                            goto label_26;
                        }
                        String s = cursor0.getString(0);
                        arrayList0.add(DocumentsContract.buildDocumentUriUsingTree(this.d, s));
                    }
                }
                catch(Exception exception0) {
                }
                Log.w("DocumentFile", "Failed query: " + exception0);
                if(cursor0 != null) {
                    goto label_15;
                }
                goto label_30;
            }
            catch(Throwable throwable0) {
                goto label_20;
            }
            try {
            label_15:
                cursor0.close();
                goto label_30;
            }
            catch(RuntimeException runtimeException0) {
                throw runtimeException0;
            label_20:
                if(cursor0 == null) {
                    throw throwable0;
                }
                try {
                    cursor0.close();
                    throw throwable0;
                }
                catch(RuntimeException runtimeException1) {
                }
                catch(Exception unused_ex) {
                    throw throwable0;
                }
                throw runtimeException1;
                try {
                label_26:
                    cursor0.close();
                    goto label_30;
                }
                catch(RuntimeException runtimeException2) {
                }
                catch(Exception unused_ex) {
                    goto label_30;
                }
                throw runtimeException2;
            }
            catch(Exception unused_ex) {
            label_30:
                Uri[] arr_uri = (Uri[])arrayList0.toArray(new Uri[arrayList0.size()]);
                DocumentFile[] arr_documentFile = new DocumentFile[arr_uri.length];
                for(int v = 0; v < arr_uri.length; ++v) {
                    arr_documentFile[v] = new b(this, context0, arr_uri[v]);
                }
                return arr_documentFile;
            }
        }
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean renameTo(String s) {
        if(this.b == 0) {
            throw new UnsupportedOperationException();
        }
        try {
            Uri uri0 = DocumentsContract.renameDocument(this.c.getContentResolver(), this.d, s);
            if(uri0 != null) {
                this.d = uri0;
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }
}

