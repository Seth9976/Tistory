package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.tracing.Trace;

public class InitializationProvider extends ContentProvider {
    @Override  // android.content.ContentProvider
    public final int delete(@NonNull Uri uri0, @Nullable String s, @Nullable String[] arr_s) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public final String getType(@NonNull Uri uri0) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NonNull Uri uri0, @Nullable ContentValues contentValues0) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override  // android.content.ContentProvider
    public final boolean onCreate() {
        Context context0 = this.getContext();
        if(context0 == null) {
            throw new StartupException("Context cannot be null");
        }
        if(context0.getApplicationContext() != null) {
            AppInitializer appInitializer0 = AppInitializer.getInstance(context0);
            try {
                Trace.beginSection("Startup");
                ComponentName componentName0 = new ComponentName("net.daum.android.tistoryapp", "androidx.startup.InitializationProvider");
                appInitializer0.a(appInitializer0.c.getPackageManager().getProviderInfo(componentName0, 0x80).metaData);
                return true;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                throw new StartupException(packageManager$NameNotFoundException0);
            }
            finally {
                Trace.endSection();
            }
        }
        return true;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NonNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override  // android.content.ContentProvider
    public final int update(@NonNull Uri uri0, @Nullable ContentValues contentValues0, @Nullable String s, @Nullable String[] arr_s) {
        throw new IllegalStateException("Not allowed.");
    }
}

