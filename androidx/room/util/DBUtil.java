package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.a;
import androidx.sqlite.db.SupportSQLiteCompat.Api16Impl;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001A\'\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001A/\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\u0007\u0010\u000B\u001A\u0015\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0001\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u001D\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0001\u001A\u00020\f2\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001A\u0015\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018\u001A\u000F\u0010\u0019\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/room/RoomDatabase;", "db", "Landroidx/sqlite/db/SupportSQLiteQuery;", "sqLiteQuery", "", "maybeCopy", "Landroid/database/Cursor;", "query", "(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;Z)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "signal", "(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "dropFtsSyncTriggers", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "", "tableName", "foreignKeyCheck", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)V", "Ljava/io/File;", "databaseFile", "", "readVersion", "(Ljava/io/File;)I", "createCancellationSignal", "()Landroid/os/CancellationSignal;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "DBUtil")
@SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n145#2,7:215\n145#2,7:224\n1855#3,2:222\n*S KotlinDebug\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil\n*L\n100#1:215,7\n121#1:224,7\n107#1:222,2\n*E\n"})
public final class DBUtil {
    public static final String a(Cursor cursor0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = cursor0.getCount();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        while(cursor0.moveToNext()) {
            if(cursor0.isFirst()) {
                stringBuilder0.append("Foreign key violation(s) detected in \'");
                stringBuilder0.append(cursor0.getString(0));
                stringBuilder0.append("\'.\n");
            }
            String s = cursor0.getString(3);
            if(!linkedHashMap0.containsKey(s)) {
                Intrinsics.checkNotNullExpressionValue(s, "constraintIndex");
                String s1 = cursor0.getString(2);
                Intrinsics.checkNotNullExpressionValue(s1, "cursor.getString(2)");
                linkedHashMap0.put(s, s1);
            }
        }
        stringBuilder0.append("Number of different violations discovered: ");
        stringBuilder0.append(linkedHashMap0.keySet().size());
        stringBuilder0.append("\nNumber of rows in violation: ");
        stringBuilder0.append(v);
        stringBuilder0.append("\nViolation(s) detected in the following constraint(s):\n");
        for(Object object0: linkedHashMap0.entrySet()) {
            String s2 = (String)((Map.Entry)object0).getKey();
            a.w(stringBuilder0, "\tParent Table = ", ((String)((Map.Entry)object0).getValue()), ", Foreign Key Constraint Index = ", s2);
            stringBuilder0.append("\n");
        }
        String s3 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s3, "StringBuilder().apply(builderAction).toString()");
        return s3;
    }

    @Nullable
    public static final CancellationSignal createCancellationSignal() {
        return Api16Impl.createCancellationSignal();
    }

    public static final void dropFtsSyncTriggers(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        List list0 = k.createListBuilder();
        Cursor cursor0 = supportSQLiteDatabase0.query("SELECT name FROM sqlite_master WHERE type = \'trigger\'");
        while(true) {
            try {
                if(!cursor0.moveToNext()) {
                    break;
                }
                list0.add(cursor0.getString(0));
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(cursor0, throwable0);
                throw throwable0;
            }
        }
        CloseableKt.closeFinally(cursor0, null);
        for(Object object0: k.build(list0)) {
            String s = (String)object0;
            Intrinsics.checkNotNullExpressionValue(s, "triggerName");
            if(p.startsWith$default(s, "room_fts_content_sync_", false, 2, null)) {
                supportSQLiteDatabase0.execSQL("DROP TRIGGER IF EXISTS " + s);
            }
        }
    }

    public static final void foreignKeyCheck(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        Intrinsics.checkNotNullParameter(s, "tableName");
        Cursor cursor0 = supportSQLiteDatabase0.query("PRAGMA foreign_key_check(`" + s + "`)");
        try {
            if(cursor0.getCount() > 0) {
                throw new SQLiteConstraintException(DBUtil.a(cursor0));
            }
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(cursor0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(cursor0, null);
    }

    @Deprecated(message = "This is only used in the generated code and shouldn\'t be called directly.")
    @NotNull
    public static final Cursor query(@NotNull RoomDatabase roomDatabase0, @NotNull SupportSQLiteQuery supportSQLiteQuery0, boolean z) {
        Intrinsics.checkNotNullParameter(roomDatabase0, "db");
        Intrinsics.checkNotNullParameter(supportSQLiteQuery0, "sqLiteQuery");
        return DBUtil.query(roomDatabase0, supportSQLiteQuery0, z, null);
    }

    @NotNull
    public static final Cursor query(@NotNull RoomDatabase roomDatabase0, @NotNull SupportSQLiteQuery supportSQLiteQuery0, boolean z, @Nullable CancellationSignal cancellationSignal0) {
        Intrinsics.checkNotNullParameter(roomDatabase0, "db");
        Intrinsics.checkNotNullParameter(supportSQLiteQuery0, "sqLiteQuery");
        Cursor cursor0 = roomDatabase0.query(supportSQLiteQuery0, cancellationSignal0);
        if(z && cursor0 instanceof AbstractWindowedCursor) {
            int v = ((AbstractWindowedCursor)cursor0).getCount();
            return (((AbstractWindowedCursor)cursor0).hasWindow() ? ((AbstractWindowedCursor)cursor0).getWindow().getNumRows() : v) >= v ? cursor0 : CursorUtil.copyAndClose(cursor0);
        }
        return cursor0;
    }

    public static final int readVersion(@NotNull File file0) throws IOException {
        int v;
        Intrinsics.checkNotNullParameter(file0, "databaseFile");
        FileChannel fileChannel0 = new FileInputStream(file0).getChannel();
        try {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
            fileChannel0.tryLock(60L, 4L, true);
            fileChannel0.position(60L);
            if(fileChannel0.read(byteBuffer0) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBuffer0.rewind();
            v = byteBuffer0.getInt();
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(fileChannel0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(fileChannel0, null);
        return v;
    }
}

