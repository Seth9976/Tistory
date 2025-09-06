package org.chromium.support_lib_boundary;

import android.content.ContentProvider;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;

public interface DropDataContentProviderBoundaryInterface {
    Uri cache(byte[] arg1, String arg2, String arg3);

    Bundle call(@NonNull String arg1, @Nullable String arg2, @Nullable Bundle arg3);

    String[] getStreamTypes(@NonNull Uri arg1, @NonNull String arg2);

    String getType(@NonNull Uri arg1);

    boolean onCreate();

    void onDragEnd(boolean arg1);

    ParcelFileDescriptor openFile(@NonNull ContentProvider arg1, @NonNull Uri arg2) throws FileNotFoundException;

    Cursor query(@NonNull Uri arg1, @Nullable String[] arg2, @Nullable String arg3, @Nullable String[] arg4, @Nullable String arg5);

    void setClearCachedDataIntervalMs(int arg1);
}

