package androidx.room;

import aa.o;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class j0 implements SupportSQLiteStatement {
    public final String a;
    public final AutoCloser b;
    public final ArrayList c;

    public j0(String s, AutoCloser autoCloser0) {
        Intrinsics.checkNotNullParameter(s, "sql");
        Intrinsics.checkNotNullParameter(autoCloser0, "autoCloser");
        super();
        this.a = s;
        this.b = autoCloser0;
        this.c = new ArrayList();
    }

    public final Object a(Function1 function10) {
        o o0 = new o(this, function10);
        return this.b.executeRefCountingFunction(o0);
    }

    public final void b(int v, Object object0) {
        ArrayList arrayList0 = this.c;
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
    public final void bindBlob(int v, byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "value");
        this.b(v, arr_b);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindDouble(int v, double f) {
        this.b(v, f);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindLong(int v, long v1) {
        this.b(v, v1);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindNull(int v) {
        this.b(v, null);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindString(int v, String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.b(v, s);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public final void clearBindings() {
        this.c.clear();
    }

    @Override
    public final void close() {
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        this.a(i0.x);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public final long executeInsert() {
        return ((Number)this.a(i0.y)).longValue();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public final int executeUpdateDelete() {
        return ((Number)this.a(i0.z)).intValue();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public final long simpleQueryForLong() {
        return ((Number)this.a(i0.A)).longValue();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public final String simpleQueryForString() {
        return (String)this.a(i0.B);
    }
}

