package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\u001A\u0015\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001A\u001D\u0010\t\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\b\u001A%\u0010\f\u001A\u00020\u00062\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001A1\u0010\u0011\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u000E*\u00020\u00002\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000FH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A+\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u00002\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Landroid/database/Cursor;", "c", "copyAndClose", "(Landroid/database/Cursor;)Landroid/database/Cursor;", "", "name", "", "getColumnIndex", "(Landroid/database/Cursor;Ljava/lang/String;)I", "getColumnIndexOrThrow", "", "columnNames", "findColumnIndexBySuffix", "([Ljava/lang/String;Ljava/lang/String;)I", "R", "Lkotlin/Function1;", "block", "useCursor", "(Landroid/database/Cursor;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "cursor", "", "mapping", "wrapMappedColumns", "(Landroid/database/Cursor;[Ljava/lang/String;[I)Landroid/database/Cursor;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "CursorUtil")
@SourceDebugExtension({"SMAP\nCursorUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n145#1,7:185\n13644#2,3:192\n1#3:195\n*S KotlinDebug\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n39#1:185,7\n127#1:192,3\n*E\n"})
public final class CursorUtil {
    @NotNull
    public static final Cursor copyAndClose(@NotNull Cursor cursor0) {
        Cursor cursor1;
        Intrinsics.checkNotNullParameter(cursor0, "c");
        try {
            cursor1 = new MatrixCursor(cursor0.getColumnNames(), cursor0.getCount());
            while(true) {
                if(!cursor0.moveToNext()) {
                    goto label_27;
                }
                Object[] arr_object = new Object[cursor0.getColumnCount()];
                int v = cursor0.getColumnCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    switch(cursor0.getType(v1)) {
                        case 0: {
                            arr_object[v1] = null;
                            break;
                        }
                        case 1: {
                            arr_object[v1] = cursor0.getLong(v1);
                            break;
                        }
                        case 2: {
                            arr_object[v1] = cursor0.getDouble(v1);
                            break;
                        }
                        case 3: {
                            arr_object[v1] = cursor0.getString(v1);
                            break;
                        }
                        case 4: {
                            arr_object[v1] = cursor0.getBlob(v1);
                            break;
                        }
                        default: {
                            throw new IllegalStateException();
                        }
                    }
                }
                ((MatrixCursor)cursor1).addRow(arr_object);
            }
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            CloseableKt.closeFinally(cursor0, throwable0);
            throw throwable1;
        }
    label_27:
        CloseableKt.closeFinally(cursor0, null);
        return cursor1;
    }

    @VisibleForTesting
    public static final int findColumnIndexBySuffix(@NotNull String[] arr_s, @NotNull String s) {
        Intrinsics.checkNotNullParameter(arr_s, "columnNames");
        Intrinsics.checkNotNullParameter(s, "name");
        int v = 0;
        for(int v1 = 0; v < arr_s.length; ++v1) {
            String s1 = arr_s[v];
            if(s1.length() >= s.length() + 2) {
                if(p.endsWith$default(s1, "." + s, false, 2, null)) {
                    return v1;
                }
                if(s1.charAt(0) == 0x60 && p.endsWith$default(s1, "." + s + '`', false, 2, null)) {
                    return v1;
                }
            }
            ++v;
        }
        return -1;
    }

    public static final int getColumnIndex(@NotNull Cursor cursor0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(cursor0, "c");
        Intrinsics.checkNotNullParameter(s, "name");
        int v = cursor0.getColumnIndex(s);
        if(v >= 0) {
            return v;
        }
        int v1 = cursor0.getColumnIndex("`" + s + '`');
        return v1 >= 0 ? v1 : -1;
    }

    public static final int getColumnIndexOrThrow(@NotNull Cursor cursor0, @NotNull String s) {
        String s1;
        Intrinsics.checkNotNullParameter(cursor0, "c");
        Intrinsics.checkNotNullParameter(s, "name");
        int v = CursorUtil.getColumnIndex(cursor0, s);
        if(v >= 0) {
            return v;
        }
        try {
            String[] arr_s = cursor0.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(arr_s, "c.columnNames");
            s1 = ArraysKt___ArraysKt.joinToString$default(arr_s, null, null, null, 0, null, null, 0x3F, null);
        }
        catch(Exception exception0) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", exception0);
            s1 = "unknown";
        }
        throw new IllegalArgumentException("column \'" + s + "\' does not exist. Available columns: " + s1);
    }

    public static final Object useCursor(@NotNull Cursor cursor0, @NotNull Function1 function10) {
        Object object0;
        Intrinsics.checkNotNullParameter(cursor0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        try {
            object0 = function10.invoke(cursor0);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(cursor0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(cursor0, null);
        return object0;
    }

    @NotNull
    public static final Cursor wrapMappedColumns(@NotNull Cursor cursor0, @NotNull String[] arr_s, @NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(cursor0, "cursor");
        Intrinsics.checkNotNullParameter(arr_s, "columnNames");
        Intrinsics.checkNotNullParameter(arr_v, "mapping");
        if(arr_s.length != arr_v.length) {
            throw new IllegalStateException("Expected columnNames.length == mapping.length");
        }
        return new CursorWrapper(cursor0) {
            @Override  // android.database.CursorWrapper
            public int getColumnIndex(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "columnName");
                String[] arr_s = arr_s;
                int v = 0;
                for(int v1 = 0; v < arr_s.length; ++v1) {
                    if(p.equals(arr_s[v], s, true)) {
                        return arr_v[v1];
                    }
                    ++v;
                }
                return super.getColumnIndex(s);
            }
        };
    }
}

