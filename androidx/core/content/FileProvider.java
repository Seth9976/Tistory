package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.XmlRes;
import androidx.core.util.ObjectsCompat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    interface PathStrategy {
        File getFileForUri(Uri arg1);

        Uri getUriForFile(File arg1);
    }

    public final Object a;
    public String b;
    public PathStrategy c;
    public final int d;
    public static final String[] e;
    public static final File f;
    public static final HashMap g;

    static {
        FileProvider.e = new String[]{"_display_name", "_size"};
        FileProvider.f = new File("/");
        FileProvider.g = new HashMap();
    }

    public FileProvider() {
        this(0);
    }

    public FileProvider(@XmlRes int v) {
        this.a = new Object();
        this.d = v;
    }

    public static String a(String s) {
        return s.length() <= 0 || s.charAt(s.length() - 1) != 0x2F ? s : s.substring(0, s.length() - 1);
    }

    @Override  // android.content.ContentProvider
    @CallSuper
    public void attachInfo(@NonNull Context context0, @NonNull ProviderInfo providerInfo0) {
        super.attachInfo(context0, providerInfo0);
        if(providerInfo0.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if(!providerInfo0.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String s = providerInfo0.authority.split(";")[0];
        synchronized(this.a) {
            this.b = s;
        }
        synchronized(FileProvider.g) {
            FileProvider.g.remove(s);
        }
    }

    public final PathStrategy b() {
        synchronized(this.a) {
            ObjectsCompat.requireNonNull(this.b, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            if(this.c == null) {
                this.c = FileProvider.c(this.getContext(), this.b, this.d);
            }
            return this.c;
        }
    }

    public static PathStrategy c(Context context0, String s, int v) {
        HashMap hashMap0 = FileProvider.g;
        synchronized(hashMap0) {
            PathStrategy fileProvider$PathStrategy0 = (PathStrategy)hashMap0.get(s);
            if(fileProvider$PathStrategy0 == null) {
                try {
                    fileProvider$PathStrategy0 = FileProvider.d(context0, s, v);
                }
                catch(IOException iOException0) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", iOException0);
                }
                catch(XmlPullParserException xmlPullParserException0) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", xmlPullParserException0);
                }
                hashMap0.put(s, fileProvider$PathStrategy0);
            }
            return fileProvider$PathStrategy0;
        }
    }

    public static i d(Context context0, String s, int v) {
        File file1;
        String s2;
        i i0 = new i(s);
        ProviderInfo providerInfo0 = context0.getPackageManager().resolveContentProvider(s, 0x80);
        if(providerInfo0 == null) {
            throw new IllegalArgumentException("Couldn\'t find meta-data for provider with authority " + s);
        }
        if(providerInfo0.metaData == null && v != 0) {
            Bundle bundle0 = new Bundle(1);
            providerInfo0.metaData = bundle0;
            bundle0.putInt("android.support.FILE_PROVIDER_PATHS", v);
        }
        XmlResourceParser xmlResourceParser0 = providerInfo0.loadXmlMetaData(context0.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if(xmlResourceParser0 == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
    alab1:
        while(true) {
            switch(xmlResourceParser0.next()) {
                case 1: {
                    return i0;
                }
                case 2: {
                    String s1 = xmlResourceParser0.getName();
                    File file0 = null;
                    s2 = xmlResourceParser0.getAttributeValue(null, "name");
                    String s3 = xmlResourceParser0.getAttributeValue(null, "path");
                    if("root-path".equals(s1)) {
                        file0 = FileProvider.f;
                    }
                    else if("files-path".equals(s1)) {
                        file0 = context0.getFilesDir();
                    }
                    else if("cache-path".equals(s1)) {
                        file0 = context0.getCacheDir();
                    }
                    else if("external-path".equals(s1)) {
                        file0 = Environment.getExternalStorageDirectory();
                    }
                    else if("external-files-path".equals(s1)) {
                        File[] arr_file = ContextCompat.getExternalFilesDirs(context0, null);
                        if(arr_file.length > 0) {
                            file0 = arr_file[0];
                        }
                    }
                    else if("external-cache-path".equals(s1)) {
                        File[] arr_file1 = ContextCompat.getExternalCacheDirs(context0);
                        if(arr_file1.length > 0) {
                            file0 = arr_file1[0];
                        }
                    }
                    else if("external-media-path".equals(s1)) {
                        File[] arr_file2 = h.a(context0);
                        if(arr_file2.length > 0) {
                            file0 = arr_file2[0];
                        }
                    }
                    if(file0 == null) {
                        continue;
                    }
                    if(s3 != null) {
                        file0 = new File(file0, s3);
                    }
                    if(TextUtils.isEmpty(s2)) {
                        break alab1;
                    }
                    try {
                        file1 = file0.getCanonicalFile();
                        break;
                    }
                    catch(IOException iOException0) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + file0, iOException0);
                    }
                }
                default: {
                    continue;
                }
            }
            i0.b.put(s2, file1);
        }
        throw new IllegalArgumentException("Name must not be empty");
    }

    @Override  // android.content.ContentProvider
    public int delete(@NonNull Uri uri0, @Nullable String s, @Nullable String[] arr_s) {
        return this.b().getFileForUri(uri0).delete();
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri0) {
        File file0 = this.b().getFileForUri(uri0);
        int v = file0.getName().lastIndexOf(46);
        if(v >= 0) {
            String s = file0.getName().substring(v + 1);
            String s1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
            return s1 == null ? "application/octet-stream" : s1;
        }
        return "application/octet-stream";
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public String getTypeAnonymous(@NonNull Uri uri0) {
        return "application/octet-stream";
    }

    public static Uri getUriForFile(@NonNull Context context0, @NonNull String s, @NonNull File file0) {
        return FileProvider.c(context0, s, 0).getUriForFile(file0);
    }

    @SuppressLint({"StreamFiles"})
    @NonNull
    public static Uri getUriForFile(@NonNull Context context0, @NonNull String s, @NonNull File file0, @NonNull String s1) {
        return FileProvider.getUriForFile(context0, s, file0).buildUpon().appendQueryParameter("displayName", s1).build();
    }

    @Override  // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri0, @NonNull ContentValues contentValues0) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override  // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override  // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@NonNull Uri uri0, @NonNull String s) throws FileNotFoundException {
        File file0 = this.b().getFileForUri(uri0);
        if("r".equals(s)) {
            return ParcelFileDescriptor.open(file0, 0x10000000);
        }
        if(!"w".equals(s) && !"wt".equals(s)) {
            if("wa".equals(s)) {
                return ParcelFileDescriptor.open(file0, 0x2A000000);
            }
            if("rw".equals(s)) {
                return ParcelFileDescriptor.open(file0, 0x38000000);
            }
            if(!"rwt".equals(s)) {
                throw new IllegalArgumentException("Invalid mode: " + s);
            }
            return ParcelFileDescriptor.open(file0, 0x3C000000);
        }
        return ParcelFileDescriptor.open(file0, 0x2C000000);
    }

    @Override  // android.content.ContentProvider
    @NonNull
    public Cursor query(@NonNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1) {
        File file0 = this.b().getFileForUri(uri0);
        String s2 = uri0.getQueryParameter("displayName");
        if(arr_s == null) {
            arr_s = FileProvider.e;
        }
        String[] arr_s2 = new String[arr_s.length];
        Object[] arr_object = new Object[arr_s.length];
        int v1 = 0;
        for(int v = 0; v < arr_s.length; ++v) {
            String s3 = arr_s[v];
            if("_display_name".equals(s3)) {
                arr_s2[v1] = "_display_name";
                arr_object[v1] = s2 == null ? file0.getName() : s2;
                ++v1;
            }
            else if("_size".equals(s3)) {
                arr_s2[v1] = "_size";
                arr_object[v1] = file0.length();
                ++v1;
            }
        }
        String[] arr_s3 = new String[v1];
        System.arraycopy(arr_s2, 0, arr_s3, 0, v1);
        Object[] arr_object1 = new Object[v1];
        System.arraycopy(arr_object, 0, arr_object1, 0, v1);
        Cursor cursor0 = new MatrixCursor(arr_s3, 1);
        ((MatrixCursor)cursor0).addRow(arr_object1);
        return cursor0;
    }

    @Override  // android.content.ContentProvider
    public int update(@NonNull Uri uri0, @NonNull ContentValues contentValues0, @Nullable String s, @Nullable String[] arr_s) {
        throw new UnsupportedOperationException("No external updates");
    }
}

