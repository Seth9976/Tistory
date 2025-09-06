package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001F\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000F\u0010\u0017\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\"\u0010\u001E\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Landroidx/room/QueryInterceptorProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "<init>", "()V", "", "index", "", "bindNull", "(I)V", "", "value", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "clearBindings", "close", "", "", "a", "Ljava/util/List;", "getBindArgsCache$room_runtime_release", "()Ljava/util/List;", "bindArgsCache", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class QueryInterceptorProgram implements SupportSQLiteProgram {
    public final ArrayList a;

    public QueryInterceptorProgram() {
        this.a = new ArrayList();
    }

    public final void a(int v, Object object0) {
        ArrayList arrayList0 = this.a;
        if(v - 1 >= arrayList0.size()) {
            int v1 = arrayList0.size();
            if(v1 <= v - 1) {
                while(true) {
                    arrayList0.add(null);
                    if(v1 == v - 1) {
                        break;
                    }
                    ++v1;
                }
            }
        }
        arrayList0.set(v - 1, object0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int v, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "value");
        this.a(v, arr_b);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int v, double f) {
        this.a(v, f);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int v, long v1) {
        this.a(v, v1);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int v) {
        this.a(v, null);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int v, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.a(v, s);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.a.clear();
    }

    @Override
    public void close() {
    }

    @NotNull
    public final List getBindArgsCache$room_runtime_release() {
        return this.a;
    }
}

