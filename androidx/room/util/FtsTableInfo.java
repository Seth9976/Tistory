package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001A\u00020\u000EH\u0016J\b\u0010\u000F\u001A\u00020\u0003H\u0016R\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/room/util/FtsTableInfo;", "", "name", "", "columns", "", "createSql", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)V", "options", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "equals", "", "other", "hashCode", "", "toString", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FtsTableInfo {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/room/util/FtsTableInfo$Companion;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "tableName", "Landroidx/room/util/FtsTableInfo;", "read", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroidx/room/util/FtsTableInfo;", "createStatement", "", "parseOptions", "(Ljava/lang/String;)Ljava/util/Set;", "", "FTS_OPTIONS", "[Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nFtsTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FtsTableInfo.kt\nandroidx/room/util/FtsTableInfo$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,182:1\n145#2,7:183\n145#2,7:190\n1183#3,2:197\n1185#3:222\n107#4:199\n79#4,22:200\n766#5:223\n857#5:224\n858#5:227\n12744#6,2:225\n*S KotlinDebug\n*F\n+ 1 FtsTableInfo.kt\nandroidx/room/util/FtsTableInfo$Companion\n*L\n94#1:183,7\n108#1:190,7\n148#1:197,2\n148#1:222\n163#1:199\n163#1:200,22\n173#1:223\n173#1:224\n173#1:227\n174#1:225,2\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @VisibleForTesting
        @JvmStatic
        @NotNull
        public final Set parseOptions(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "createStatement");
            if(s.length() == 0) {
                return f0.emptySet();
            }
            String s1 = s.substring(StringsKt__StringsKt.indexOf$default(s, '(', 0, false, 6, null) + 1, StringsKt__StringsKt.lastIndexOf$default(s, ')', 0, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList0 = new ArrayList();
            ArrayDeque arrayDeque0 = new ArrayDeque();
            int v = -1;
            int v1 = 0;
            for(int v2 = 0; v1 < s1.length(); ++v2) {
                int v3 = s1.charAt(v1);
                switch(v3) {
                    case 44: {
                        if(arrayDeque0.isEmpty()) {
                            String s2 = s1.substring(v + 1, v2);
                            Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                            int v4 = s2.length() - 1;
                            int v5 = 0;
                            boolean z = false;
                            while(v5 <= v4) {
                                boolean z1 = Intrinsics.compare(s2.charAt((z ? v4 : v5)), 0x20) <= 0;
                                if(z) {
                                    if(!z1) {
                                        break;
                                    }
                                    --v4;
                                }
                                else if(z1) {
                                    ++v5;
                                }
                                else {
                                    z = true;
                                }
                            }
                            arrayList0.add(s2.subSequence(v5, v4 + 1).toString());
                            v = v2;
                        }
                        break;
                    }
                    case 91: {
                        if(arrayDeque0.isEmpty()) {
                            arrayDeque0.push(Character.valueOf('['));
                        }
                        break;
                    }
                    case 93: {
                        if(!arrayDeque0.isEmpty()) {
                            Character character1 = (Character)arrayDeque0.peek();
                            if(character1 != null && character1.charValue() == 91) {
                                arrayDeque0.pop();
                            }
                        }
                        break;
                    }
                    case 34: 
                    case 39: 
                    case 0x60: {
                        if(arrayDeque0.isEmpty()) {
                            arrayDeque0.push(Character.valueOf(((char)v3)));
                        }
                        else {
                            Character character0 = (Character)arrayDeque0.peek();
                            if(character0 != null && character0.charValue() == v3) {
                                arrayDeque0.pop();
                            }
                        }
                    }
                }
                ++v1;
            }
            String s3 = s1.substring(v + 1);
            Intrinsics.checkNotNullExpressionValue(s3, "this as java.lang.String).substring(startIndex)");
            arrayList0.add(StringsKt__StringsKt.trim(s3).toString());
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                String s4 = (String)object0;
                String[] arr_s = FtsTableInfo.a;
                for(int v6 = 0; v6 < arr_s.length; ++v6) {
                    if(p.startsWith$default(s4, arr_s[v6], false, 2, null)) {
                        arrayList1.add(object0);
                        break;
                    }
                }
            }
            return CollectionsKt___CollectionsKt.toSet(arrayList1);
        }

        @JvmStatic
        @NotNull
        public final FtsTableInfo read(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, @NotNull String s) {
            String s2;
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "database");
            Intrinsics.checkNotNullParameter(s, "tableName");
            Set set0 = e0.createSetBuilder();
            Cursor cursor0 = supportSQLiteDatabase0.query("PRAGMA table_info(`" + s + "`)");
            try {
                if(cursor0.getColumnCount() > 0) {
                    int v = cursor0.getColumnIndex("name");
                    while(cursor0.moveToNext()) {
                        String s1 = cursor0.getString(v);
                        Intrinsics.checkNotNullExpressionValue(s1, "cursor.getString(nameIndex)");
                        set0.add(s1);
                    }
                }
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(cursor0, throwable0);
                throw throwable0;
            }
            CloseableKt.closeFinally(cursor0, null);
            Set set1 = e0.build(set0);
            Cursor cursor1 = supportSQLiteDatabase0.query("SELECT * FROM sqlite_master WHERE `name` = \'" + s + '\'');
            try {
                s2 = cursor1.moveToFirst() ? cursor1.getString(cursor1.getColumnIndexOrThrow("sql")) : "";
                goto label_27;
            }
            catch(Throwable throwable1) {
            }
            try {
                throw throwable1;
            }
            catch(Throwable throwable2) {
                CloseableKt.closeFinally(cursor1, throwable1);
                throw throwable2;
            }
        label_27:
            CloseableKt.closeFinally(cursor1, null);
            Intrinsics.checkNotNullExpressionValue(s2, "sql");
            return new FtsTableInfo(s, set1, this.parseOptions(s2));
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final String[] a;
    @JvmField
    @NotNull
    public final Set columns;
    @JvmField
    @NotNull
    public final String name;
    @JvmField
    @NotNull
    public final Set options;

    static {
        FtsTableInfo.Companion = new Companion(null);
        FtsTableInfo.a = new String[]{"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    }

    public FtsTableInfo(@NotNull String s, @NotNull Set set0, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(set0, "columns");
        Intrinsics.checkNotNullParameter(s1, "createSql");
        this(s, set0, FtsTableInfo.Companion.parseOptions(s1));
    }

    public FtsTableInfo(@NotNull String s, @NotNull Set set0, @NotNull Set set1) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(set0, "columns");
        Intrinsics.checkNotNullParameter(set1, "options");
        super();
        this.name = s;
        this.columns = set0;
        this.options = set1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FtsTableInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.name, ((FtsTableInfo)object0).name)) {
            return false;
        }
        return Intrinsics.areEqual(this.columns, ((FtsTableInfo)object0).columns) ? Intrinsics.areEqual(this.options, ((FtsTableInfo)object0).options) : false;
    }

    @Override
    public int hashCode() {
        return this.options.hashCode() + (this.columns.hashCode() + this.name.hashCode() * 0x1F) * 0x1F;
    }

    @VisibleForTesting
    @JvmStatic
    @NotNull
    public static final Set parseOptions(@NotNull String s) {
        return FtsTableInfo.Companion.parseOptions(s);
    }

    @JvmStatic
    @NotNull
    public static final FtsTableInfo read(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, @NotNull String s) {
        return FtsTableInfo.Companion.read(supportSQLiteDatabase0, s);
    }

    @Override
    @NotNull
    public String toString() {
        return "FtsTableInfo{name=\'" + this.name + "\', columns=" + this.columns + ", options=" + this.options + "\'}";
    }
}

