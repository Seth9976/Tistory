package androidx.sqlite.db;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0012\u0010\u0006\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000ER\u0014\u0010\u0011\u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0015\u001A\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "", "query", "", "", "bindArgs", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "Landroidx/sqlite/db/SupportSQLiteProgram;", "statement", "", "bindTo", "(Landroidx/sqlite/db/SupportSQLiteProgram;)V", "getSql", "()Ljava/lang/String;", "sql", "", "getArgCount", "()I", "argCount", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J+\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0012\u0010\u0005\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery$Companion;", "", "Landroidx/sqlite/db/SupportSQLiteProgram;", "statement", "", "bindArgs", "", "bind", "(Landroidx/sqlite/db/SupportSQLiteProgram;[Ljava/lang/Object;)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        public final void bind(@NotNull SupportSQLiteProgram supportSQLiteProgram0, @Nullable Object[] arr_object) {
            Intrinsics.checkNotNullParameter(supportSQLiteProgram0, "statement");
            if(arr_object == null) {
                return;
            }
            int v = 0;
            while(v < arr_object.length) {
                Object object0 = arr_object[v];
                ++v;
                if(object0 == null) {
                    supportSQLiteProgram0.bindNull(v);
                }
                else if(object0 instanceof byte[]) {
                    supportSQLiteProgram0.bindBlob(v, ((byte[])object0));
                }
                else if(object0 instanceof Float) {
                    supportSQLiteProgram0.bindDouble(v, ((double)((Number)object0).floatValue()));
                }
                else if(object0 instanceof Double) {
                    supportSQLiteProgram0.bindDouble(v, ((Number)object0).doubleValue());
                }
                else if(object0 instanceof Long) {
                    supportSQLiteProgram0.bindLong(v, ((Number)object0).longValue());
                }
                else if(object0 instanceof Integer) {
                    supportSQLiteProgram0.bindLong(v, ((long)((Number)object0).intValue()));
                }
                else if(object0 instanceof Short) {
                    supportSQLiteProgram0.bindLong(v, ((long)((Number)object0).shortValue()));
                }
                else if(object0 instanceof Byte) {
                    supportSQLiteProgram0.bindLong(v, ((long)((Number)object0).byteValue()));
                }
                else if(object0 instanceof String) {
                    supportSQLiteProgram0.bindString(v, ((String)object0));
                }
                else {
                    if(!(object0 instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + object0 + " at index " + v + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    supportSQLiteProgram0.bindLong(v, (((Boolean)object0).booleanValue() ? 1L : 0L));
                }
            }
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String a;
    public final Object[] b;

    static {
        SimpleSQLiteQuery.Companion = new Companion(null);
    }

    public SimpleSQLiteQuery(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "query");
        this(s, null);
    }

    public SimpleSQLiteQuery(@NotNull String s, @Nullable Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "query");
        super();
        this.a = s;
        this.b = arr_object;
    }

    @JvmStatic
    public static final void bind(@NotNull SupportSQLiteProgram supportSQLiteProgram0, @Nullable Object[] arr_object) {
        SimpleSQLiteQuery.Companion.bind(supportSQLiteProgram0, arr_object);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(@NotNull SupportSQLiteProgram supportSQLiteProgram0) {
        Intrinsics.checkNotNullParameter(supportSQLiteProgram0, "statement");
        SimpleSQLiteQuery.Companion.bind(supportSQLiteProgram0, this.b);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.b == null ? 0 : this.b.length;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteQuery
    @NotNull
    public String getSql() {
        return this.a;
    }
}

