package androidx.webkit;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.io.FileNotFoundException;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;

public final class DropDataContentProvider extends ContentProvider {
    public DropDataContentProviderBoundaryInterface a;

    public final DropDataContentProviderBoundaryInterface a() {
        if(this.a == null) {
            DropDataContentProviderBoundaryInterface dropDataContentProviderBoundaryInterface0 = WebViewGlueCommunicator.getFactory().getDropDataProvider();
            this.a = dropDataContentProviderBoundaryInterface0;
            dropDataContentProviderBoundaryInterface0.onCreate();
        }
        return this.a;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String s, @Nullable String s1, @Nullable Bundle bundle0) {
        return this.a().call(s, s1, bundle0);
    }

    @Override  // android.content.ContentProvider
    public int delete(@NonNull Uri uri0, @Nullable String s, @Nullable String[] arr_s) {
        throw new UnsupportedOperationException("delete method is not supported.");
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri0) {
        return this.a().getType(uri0);
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri0, @Nullable ContentValues contentValues0) {
        throw new UnsupportedOperationException("Insert method is not supported.");
    }

    @Override  // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public ParcelFileDescriptor openFile(@NonNull Uri uri0, @NonNull String s) throws FileNotFoundException {
        return this.a().openFile(this, uri0);
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1) {
        return this.a().query(uri0, arr_s, s, arr_s1, s1);
    }

    @Override  // android.content.ContentProvider
    public int update(@NonNull Uri uri0, @Nullable ContentValues contentValues0, @Nullable String s, @Nullable String[] arr_s) {
        throw new UnsupportedOperationException("update method is not supported.");
    }
}

