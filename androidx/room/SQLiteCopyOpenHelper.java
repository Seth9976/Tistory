package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\u000E\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001A\u001A\u00020\u00132\u0006\u0010\u0019\u001A\u00020\u0018¢\u0006\u0004\b\u001A\u0010\u001BR\u001A\u0010\u000E\u001A\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0016\u0010\"\u001A\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b \u0010!R\u0014\u0010&\u001A\u00020#8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b$\u0010%R\u0014\u0010(\u001A\u00020#8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\'\u0010%¨\u0006)"}, d2 = {"Landroidx/room/SQLiteCopyOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "Landroid/content/Context;", "context", "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILandroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "Landroidx/room/DatabaseConfiguration;", "databaseConfiguration", "setDatabaseConfiguration", "(Landroidx/room/DatabaseConfiguration;)V", "f", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SQLiteCopyOpenHelper implements DelegatingOpenHelper, SupportSQLiteOpenHelper {
    public final Context a;
    public final String b;
    public final File c;
    public final Callable d;
    public final int e;
    public final SupportSQLiteOpenHelper f;
    public DatabaseConfiguration g;
    public boolean h;

    public SQLiteCopyOpenHelper(@NotNull Context context0, @Nullable String s, @Nullable File file0, @Nullable Callable callable0, int v, @NotNull SupportSQLiteOpenHelper supportSQLiteOpenHelper0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper0, "delegate");
        super();
        this.a = context0;
        this.b = s;
        this.c = file0;
        this.d = callable0;
        this.e = v;
        this.f = supportSQLiteOpenHelper0;
    }

    public final void a(File file0, boolean z) {
        int v;
        InputStream inputStream0;
        ReadableByteChannel readableByteChannel0;
        Context context0 = this.a;
        String s = this.b;
        if(s == null) {
            File file1 = this.c;
            if(file1 != null) {
                readableByteChannel0 = new FileInputStream(file1).getChannel();
                Intrinsics.checkNotNullExpressionValue(readableByteChannel0, "FileInputStream(copyFromFile).channel");
                goto label_19;
            }
            Callable callable0 = this.d;
            if(callable0 == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                inputStream0 = (InputStream)callable0.call();
            }
            catch(Exception exception0) {
                throw new IOException("inputStreamCallable exception on call", exception0);
            }
            readableByteChannel0 = Channels.newChannel(inputStream0);
            Intrinsics.checkNotNullExpressionValue(readableByteChannel0, "newChannel(inputStream)");
        }
        else {
            readableByteChannel0 = Channels.newChannel(context0.getAssets().open(s));
            Intrinsics.checkNotNullExpressionValue(readableByteChannel0, "newChannel(context.assets.open(copyFromAssetPath))");
        }
    label_19:
        File file2 = File.createTempFile("room-copy-helper", ".tmp", context0.getCacheDir());
        file2.deleteOnExit();
        FileChannel fileChannel0 = new FileOutputStream(file2).getChannel();
        Intrinsics.checkNotNullExpressionValue(fileChannel0, "output");
        FileUtil.copy(readableByteChannel0, fileChannel0);
        File file3 = file0.getParentFile();
        if(file3 != null && !file3.exists() && !file3.mkdirs()) {
            throw new IOException("Failed to create directories for " + file0.getAbsolutePath());
        }
        Intrinsics.checkNotNullExpressionValue(file2, "intermediateFile");
        DatabaseConfiguration databaseConfiguration0 = this.g;
        if(databaseConfiguration0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            databaseConfiguration0 = null;
        }
        if(databaseConfiguration0.prepackagedDatabaseCallback != null) {
            try {
                v = DBUtil.readVersion(file2);
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Malformed database file, unable to read version.", iOException0);
            }
            SupportSQLiteOpenHelper supportSQLiteOpenHelper0 = new FrameworkSQLiteOpenHelperFactory().create(Configuration.Companion.builder(context0).name(file2.getAbsolutePath()).callback(new SQLiteCopyOpenHelper.createFrameworkOpenHelper.configuration.1(v, c.coerceAtLeast(v, 1))).build());
            try {
                SupportSQLiteDatabase supportSQLiteDatabase0 = z ? supportSQLiteOpenHelper0.getWritableDatabase() : supportSQLiteOpenHelper0.getReadableDatabase();
                DatabaseConfiguration databaseConfiguration1 = this.g;
                if(databaseConfiguration1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                    databaseConfiguration1 = null;
                }
                Intrinsics.checkNotNull(databaseConfiguration1.prepackagedDatabaseCallback);
                databaseConfiguration1.prepackagedDatabaseCallback.onOpenPrepackagedDatabase(supportSQLiteDatabase0);
                goto label_51;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                CloseableKt.closeFinally(supportSQLiteOpenHelper0, throwable0);
                throw throwable1;
            }
        label_51:
            CloseableKt.closeFinally(supportSQLiteOpenHelper0, null);
        }
        if(!file2.renameTo(file0)) {
            throw new IOException("Failed to move intermediate file (" + file2.getAbsolutePath() + ") to destination (" + file0.getAbsolutePath() + ").");
        }
    }

    public final void b(boolean z) {
        String s = this.getDatabaseName();
        if(s == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Context context0 = this.a;
        File file0 = context0.getDatabasePath(s);
        DatabaseConfiguration databaseConfiguration0 = this.g;
        DatabaseConfiguration databaseConfiguration1 = null;
        if(databaseConfiguration0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            databaseConfiguration0 = null;
        }
        ProcessLock processLock0 = new ProcessLock(s, context0.getFilesDir(), databaseConfiguration0.multiInstanceInvalidation);
        try {
            ProcessLock.lock$default(processLock0, false, 1, null);
            if(!file0.exists()) {
                try {
                    Intrinsics.checkNotNullExpressionValue(file0, "databaseFile");
                    this.a(file0, z);
                }
                catch(IOException iOException0) {
                    throw new RuntimeException("Unable to copy database file.", iOException0);
                }
                return;
            }
            try {
                Intrinsics.checkNotNullExpressionValue(file0, "databaseFile");
                int v1 = DBUtil.readVersion(file0);
                int v2 = this.e;
            }
            catch(IOException iOException1) {
                Log.w("ROOM", "Unable to read database version.", iOException1);
                return;
            }
            if(v1 == v2) {
                return;
            }
            DatabaseConfiguration databaseConfiguration2 = this.g;
            if(databaseConfiguration2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            }
            else {
                databaseConfiguration1 = databaseConfiguration2;
            }
            if(databaseConfiguration1.isMigrationRequired(v1, v2)) {
                return;
            }
            if(context0.deleteDatabase(s)) {
                try {
                    this.a(file0, z);
                }
                catch(IOException iOException2) {
                    Log.w("ROOM", "Unable to copy database file.", iOException2);
                }
            }
            else {
                Log.w("ROOM", "Failed to delete database file (" + s + ") for a copy destructive migration.");
            }
        }
        finally {
            processLock0.unlock();
        }
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void close() {
        synchronized(this) {
            this.getDelegate().close();
            this.h = false;
        }
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    public String getDatabaseName() {
        return this.getDelegate().getDatabaseName();
    }

    @Override  // androidx.room.DelegatingOpenHelper
    @NotNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.f;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getReadableDatabase() {
        if(!this.h) {
            this.b(false);
            this.h = true;
        }
        return this.getDelegate().getReadableDatabase();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getWritableDatabase() {
        if(!this.h) {
            this.b(true);
            this.h = true;
        }
        return this.getDelegate().getWritableDatabase();
    }

    public final void setDatabaseConfiguration(@NotNull DatabaseConfiguration databaseConfiguration0) {
        Intrinsics.checkNotNullParameter(databaseConfiguration0, "databaseConfiguration");
        this.g = databaseConfiguration0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.getDelegate().setWriteAheadLoggingEnabled(z);
    }
}

