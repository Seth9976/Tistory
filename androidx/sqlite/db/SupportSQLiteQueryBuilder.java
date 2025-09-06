package androidx.sqlite.db;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\r\u0010\u0002\u001A\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\u0006\u001A\u00020\u00002\u0010\u0010\u0006\u001A\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\b\u001A\u00020\u00002\b\u0010\b\u001A\u0004\u0018\u00010\u00052\u0012\u0010\t\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000B\u001A\u00020\u00002\b\u0010\u000B\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\r\u001A\u00020\u00002\b\u0010\r\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000E\u001A\u00020\u00002\b\u0010\u000E\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000E\u0010\fJ\u0015\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u0005¢\u0006\u0004\b\u000F\u0010\fJ\r\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "", "distinct", "()Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "", "", "columns", "([Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "selection", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "groupBy", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "having", "orderBy", "limit", "Landroidx/sqlite/db/SupportSQLiteQuery;", "create", "()Landroidx/sqlite/db/SupportSQLiteQuery;", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSupportSQLiteQueryBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteQueryBuilder.kt\nandroidx/sqlite/db/SupportSQLiteQueryBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class SupportSQLiteQueryBuilder {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001C\u0010\t\u001A\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder$Companion;", "", "", "tableName", "Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "builder", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "limitPattern", "Ljava/util/regex/Pattern;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final SupportSQLiteQueryBuilder builder(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "tableName");
            return new SupportSQLiteQueryBuilder(s, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String a;
    public boolean b;
    public String[] c;
    public String d;
    public Object[] e;
    public String f;
    public String g;
    public String h;
    public String i;
    public static final Pattern j;

    static {
        SupportSQLiteQueryBuilder.Companion = new Companion(null);
        SupportSQLiteQueryBuilder.j = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    }

    public SupportSQLiteQueryBuilder(String s, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = s;
    }

    public static void a(StringBuilder stringBuilder0, String s, String s1) {
        if(s1 != null && s1.length() != 0) {
            stringBuilder0.append(s);
            stringBuilder0.append(s1);
        }
    }

    @JvmStatic
    @NotNull
    public static final SupportSQLiteQueryBuilder builder(@NotNull String s) {
        return SupportSQLiteQueryBuilder.Companion.builder(s);
    }

    @NotNull
    public final SupportSQLiteQueryBuilder columns(@Nullable String[] arr_s) {
        this.c = arr_s;
        return this;
    }

    @NotNull
    public final SupportSQLiteQuery create() {
        if((this.f == null || this.f.length() == 0) && (this.g != null && this.g.length() != 0)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        StringBuilder stringBuilder0 = new StringBuilder(120);
        stringBuilder0.append("SELECT ");
        if(this.b) {
            stringBuilder0.append("DISTINCT ");
        }
        String[] arr_s = this.c;
        if(arr_s == null || arr_s.length == 0) {
            stringBuilder0.append("* ");
        }
        else {
            Intrinsics.checkNotNull(arr_s);
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                if(v > 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(s);
            }
            stringBuilder0.append(' ');
        }
        stringBuilder0.append("FROM ");
        stringBuilder0.append(this.a);
        SupportSQLiteQueryBuilder.a(stringBuilder0, " WHERE ", this.d);
        SupportSQLiteQueryBuilder.a(stringBuilder0, " GROUP BY ", this.f);
        SupportSQLiteQueryBuilder.a(stringBuilder0, " HAVING ", this.g);
        SupportSQLiteQueryBuilder.a(stringBuilder0, " ORDER BY ", this.h);
        SupportSQLiteQueryBuilder.a(stringBuilder0, " LIMIT ", this.i);
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder(capacity).…builderAction).toString()");
        return new SimpleSQLiteQuery(s1, this.e);
    }

    @NotNull
    public final SupportSQLiteQueryBuilder distinct() {
        this.b = true;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder groupBy(@Nullable String s) {
        this.f = s;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder having(@Nullable String s) {
        this.g = s;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder limit(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "limit");
        boolean z = SupportSQLiteQueryBuilder.j.matcher(s).matches();
        if(s.length() != 0 && !z) {
            throw new IllegalArgumentException(("invalid LIMIT clauses:" + s).toString());
        }
        this.i = s;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder orderBy(@Nullable String s) {
        this.h = s;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder selection(@Nullable String s, @Nullable Object[] arr_object) {
        this.d = s;
        this.e = arr_object;
        return this;
    }
}

