package androidx.room.util;

import a5.b;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.ColumnInfo.SQLiteTypeAffinity;
import androidx.room.Index.Order;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.f0;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0006\u0014\u0015\u0016\u0017\u0018\u0019B1\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nBA\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001A\u00020\u0012H\u0016J\b\u0010\u0013\u001A\u00020\u0003H\u0016R\u001C\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001A"}, d2 = {"Landroidx/room/util/TableInfo;", "", "name", "", "columns", "", "Landroidx/room/util/TableInfo$Column;", "foreignKeys", "", "Landroidx/room/util/TableInfo$ForeignKey;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;)V", "indices", "Landroidx/room/util/TableInfo$Index;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "equals", "", "other", "hashCode", "", "toString", "Column", "Companion", "CreatedFrom", "ForeignKey", "ForeignKeyWithSequence", "Index", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TableInfo {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 \u001D2\u00020\u0001:\u0001\u001DB9\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\u000B\u0010\fB)\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\u000B\u0010\rJ\u001A\u0010\u000F\u001A\u00020\u00052\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0004\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\b\u001A\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\t\u001A\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\n\u001A\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u001A\u0010\u0018\u001A\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u0012\u0004\b\u0019\u0010\u001AR\u0011\u0010\u001B\u001A\u00020\u00058F¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/room/util/TableInfo$Column;", "", "", "name", "type", "", "notNull", "", "primaryKeyPosition", "defaultValue", "createdFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Z", "I", "affinity", "getAffinity$annotations", "()V", "isPrimaryKey", "()Z", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Column {
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/room/util/TableInfo$Column$Companion;", "", "", "current", "other", "", "defaultValueEquals", "(Ljava/lang/String;Ljava/lang/String;)Z", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Column$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,646:1\n1183#2,3:647\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Column$Companion\n*L\n249#1:647,3\n*E\n"})
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @VisibleForTesting
            @JvmStatic
            public final boolean defaultValueEquals(@NotNull String s, @Nullable String s1) {
                Intrinsics.checkNotNullParameter(s, "current");
                if(Intrinsics.areEqual(s, s1)) {
                    return true;
                }
                if(s.length() != 0) {
                    int v = 0;
                    int v1 = 0;
                    for(int v2 = 0; v < s.length(); ++v2) {
                        int v3 = s.charAt(v);
                        if(v2 == 0 && v3 != 40) {
                            return false;
                        }
                        switch(v3) {
                            case 40: {
                                ++v1;
                                break;
                            }
                            case 41: {
                                --v1;
                                if(v1 != 0 || v2 == s.length() - 1) {
                                    break;
                                }
                                return false;
                            }
                        }
                        ++v;
                    }
                    if(v1 == 0) {
                        String s2 = s.substring(1, s.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                        return Intrinsics.areEqual(StringsKt__StringsKt.trim(s2).toString(), s1);
                    }
                }
                return false;
            }
        }

        @NotNull
        public static final Companion Companion;
        @JvmField
        public final int affinity;
        @JvmField
        public final int createdFrom;
        @JvmField
        @Nullable
        public final String defaultValue;
        @JvmField
        @NotNull
        public final String name;
        @JvmField
        public final boolean notNull;
        @JvmField
        public final int primaryKeyPosition;
        @JvmField
        @NotNull
        public final String type;

        static {
            Column.Companion = new Companion(null);
        }

        @Deprecated(message = "Use {@link Column#Column(String, String, boolean, int, String, int)} instead.")
        public Column(@NotNull String s, @NotNull String s1, boolean z, int v) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "type");
            this(s, s1, z, v, null, 0);
        }

        public Column(@NotNull String s, @NotNull String s1, boolean z, int v, @Nullable String s2, int v1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "type");
            super();
            this.name = s;
            this.type = s1;
            this.notNull = z;
            this.primaryKeyPosition = v;
            this.defaultValue = s2;
            this.createdFrom = v1;
            int v2 = 5;
            if(s1 != null) {
                Locale locale0 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale0, "US");
                String s3 = s1.toUpperCase(locale0);
                Intrinsics.checkNotNullExpressionValue(s3, "this as java.lang.String).toUpperCase(locale)");
                if(StringsKt__StringsKt.contains$default(s3, "INT", false, 2, null)) {
                    v2 = 3;
                }
                else if(StringsKt__StringsKt.contains$default(s3, "CHAR", false, 2, null) || StringsKt__StringsKt.contains$default(s3, "CLOB", false, 2, null) || StringsKt__StringsKt.contains$default(s3, "TEXT", false, 2, null)) {
                    v2 = 2;
                }
                else if(!StringsKt__StringsKt.contains$default(s3, "BLOB", false, 2, null)) {
                    v2 = StringsKt__StringsKt.contains$default(s3, "REAL", false, 2, null) || StringsKt__StringsKt.contains$default(s3, "FLOA", false, 2, null) || StringsKt__StringsKt.contains$default(s3, "DOUB", false, 2, null) ? 4 : 1;
                }
            }
            this.affinity = v2;
        }

        @VisibleForTesting
        @JvmStatic
        public static final boolean defaultValueEquals(@NotNull String s, @Nullable String s1) {
            return Column.Companion.defaultValueEquals(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Column)) {
                return false;
            }
            if(this.primaryKeyPosition != ((Column)object0).primaryKeyPosition) {
                return false;
            }
            if(!Intrinsics.areEqual(this.name, ((Column)object0).name)) {
                return false;
            }
            if(this.notNull != ((Column)object0).notNull) {
                return false;
            }
            if(this.createdFrom == 1 && ((Column)object0).createdFrom == 2 && (this.defaultValue != null && !Column.Companion.defaultValueEquals(this.defaultValue, ((Column)object0).defaultValue))) {
                return false;
            }
            if(this.createdFrom == 2 && ((Column)object0).createdFrom == 1) {
                String s = ((Column)object0).defaultValue;
                if(s != null && !Column.Companion.defaultValueEquals(s, this.defaultValue)) {
                    return false;
                }
            }
            if(this.createdFrom != 0 && this.createdFrom == ((Column)object0).createdFrom) {
                String s1 = this.defaultValue;
                if(s1 != null) {
                    return Column.Companion.defaultValueEquals(s1, ((Column)object0).defaultValue) ? this.affinity == ((Column)object0).affinity : false;
                }
                return ((Column)object0).defaultValue == null ? this.affinity == ((Column)object0).affinity : false;
            }
            return this.affinity == ((Column)object0).affinity;
        }

        @SQLiteTypeAffinity
        public static void getAffinity$annotations() {
        }

        @Override
        public int hashCode() {
            int v = (this.name.hashCode() * 0x1F + this.affinity) * 0x1F;
            return this.notNull ? (v + 0x4CF) * 0x1F + this.primaryKeyPosition : (v + 0x4D5) * 0x1F + this.primaryKeyPosition;
        }

        public final boolean isPrimaryKey() {
            return this.primaryKeyPosition > 0;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Column{name=\'");
            stringBuilder0.append(this.name);
            stringBuilder0.append("\', type=\'");
            stringBuilder0.append(this.type);
            stringBuilder0.append("\', affinity=\'");
            stringBuilder0.append(this.affinity);
            stringBuilder0.append("\', notNull=");
            stringBuilder0.append(this.notNull);
            stringBuilder0.append(", primaryKeyPosition=");
            stringBuilder0.append(this.primaryKeyPosition);
            stringBuilder0.append(", defaultValue=\'");
            return a.o(stringBuilder0, (this.defaultValue == null ? "undefined" : this.defaultValue), "\'}");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000BR\u0014\u0010\r\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000B¨\u0006\u000E"}, d2 = {"Landroidx/room/util/TableInfo$Companion;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "tableName", "Landroidx/room/util/TableInfo;", "read", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroidx/room/util/TableInfo;", "", "CREATED_FROM_DATABASE", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class androidx.room.util.TableInfo.Companion {
        public androidx.room.util.TableInfo.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final TableInfo read(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "database");
            Intrinsics.checkNotNullParameter(s, "tableName");
            return TableInfoKt.readTableInfo(supportSQLiteDatabase0, s);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/util/TableInfo$CreatedFrom;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface CreatedFrom {
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001A\u00020\u000EH\u0016J\b\u0010\u000F\u001A\u00020\u0003H\u0016R\u0016\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/room/util/TableInfo$ForeignKey;", "", "referenceTable", "", "onDelete", "onUpdate", "columnNames", "", "referenceColumnNames", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "equals", "", "other", "hashCode", "", "toString", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ForeignKey {
        @JvmField
        @NotNull
        public final List columnNames;
        @JvmField
        @NotNull
        public final String onDelete;
        @JvmField
        @NotNull
        public final String onUpdate;
        @JvmField
        @NotNull
        public final List referenceColumnNames;
        @JvmField
        @NotNull
        public final String referenceTable;

        public ForeignKey(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull List list0, @NotNull List list1) {
            Intrinsics.checkNotNullParameter(s, "referenceTable");
            Intrinsics.checkNotNullParameter(s1, "onDelete");
            Intrinsics.checkNotNullParameter(s2, "onUpdate");
            Intrinsics.checkNotNullParameter(list0, "columnNames");
            Intrinsics.checkNotNullParameter(list1, "referenceColumnNames");
            super();
            this.referenceTable = s;
            this.onDelete = s1;
            this.onUpdate = s2;
            this.columnNames = list0;
            this.referenceColumnNames = list1;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ForeignKey)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.referenceTable, ((ForeignKey)object0).referenceTable)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.onDelete, ((ForeignKey)object0).onDelete)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.onUpdate, ((ForeignKey)object0).onUpdate)) {
                return false;
            }
            return Intrinsics.areEqual(this.columnNames, ((ForeignKey)object0).columnNames) ? Intrinsics.areEqual(this.referenceColumnNames, ((ForeignKey)object0).referenceColumnNames) : false;
        }

        @Override
        public int hashCode() {
            return this.referenceColumnNames.hashCode() + b.c(this.columnNames, q.c(q.c(this.referenceTable.hashCode() * 0x1F, 0x1F, this.onDelete), 0x1F, this.onUpdate), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            return "ForeignKey{referenceTable=\'" + this.referenceTable + "\', onDelete=\'" + this.onDelete + " +\', onUpdate=\'" + this.onUpdate + "\', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0014\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000B\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000E\u001A\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/room/util/TableInfo$ForeignKeyWithSequence;", "", "", "id", "sequence", "", "from", "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "other", "compareTo", "(Landroidx/room/util/TableInfo$ForeignKeyWithSequence;)I", "a", "I", "getId", "()I", "b", "getSequence", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "d", "getTo", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ForeignKeyWithSequence implements Comparable {
        public final int a;
        public final int b;
        public final String c;
        public final String d;

        public ForeignKeyWithSequence(int v, int v1, @NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "from");
            Intrinsics.checkNotNullParameter(s1, "to");
            super();
            this.a = v;
            this.b = v1;
            this.c = s;
            this.d = s1;
        }

        public int compareTo(@NotNull ForeignKeyWithSequence tableInfo$ForeignKeyWithSequence0) {
            Intrinsics.checkNotNullParameter(tableInfo$ForeignKeyWithSequence0, "other");
            int v = this.a - tableInfo$ForeignKeyWithSequence0.a;
            return v == 0 ? this.b - tableInfo$ForeignKeyWithSequence0.b : v;
        }

        @Override
        public int compareTo(Object object0) {
            return this.compareTo(((ForeignKeyWithSequence)object0));
        }

        @NotNull
        public final String getFrom() {
            return this.c;
        }

        public final int getId() {
            return this.a;
        }

        public final int getSequence() {
            return this.b;
        }

        @NotNull
        public final String getTo() {
            return this.d;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\b\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bB1\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\nJ\u0013\u0010\u000B\u001A\u00020\u00052\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001A\u00020\u000EH\u0016J\b\u0010\u000F\u001A\u00020\u0003H\u0016R\u0016\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0087\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/room/util/TableInfo$Index;", "", "name", "", "unique", "", "columns", "", "(Ljava/lang/String;ZLjava/util/List;)V", "orders", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "equals", "other", "hashCode", "", "toString", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Index\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,646:1\n1#2:647\n*E\n"})
    public static final class Index {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/util/TableInfo$Index$Companion;", "", "", "DEFAULT_PREFIX", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.room.util.TableInfo.Index.Companion {
            public androidx.room.util.TableInfo.Index.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }
        }

        @NotNull
        public static final androidx.room.util.TableInfo.Index.Companion Companion = null;
        @NotNull
        public static final String DEFAULT_PREFIX = "index_";
        @JvmField
        @NotNull
        public final List columns;
        @JvmField
        @NotNull
        public final String name;
        @JvmField
        @NotNull
        public List orders;
        @JvmField
        public final boolean unique;

        static {
            Index.Companion = new androidx.room.util.TableInfo.Index.Companion(null);
        }

        @Deprecated(message = "Use {@link #Index(String, boolean, List, List)}")
        public Index(@NotNull String s, boolean z, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(list0, "columns");
            int v = list0.size();
            ArrayList arrayList0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList0.add(Order.ASC.name());
            }
            this(s, z, list0, arrayList0);
        }

        public Index(@NotNull String s, boolean z, @NotNull List list0, @NotNull List list1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(list0, "columns");
            Intrinsics.checkNotNullParameter(list1, "orders");
            super();
            this.name = s;
            this.unique = z;
            this.columns = list0;
            this.orders = list1;
            Collection collection0 = list1;
            if(collection0.isEmpty()) {
                int v = list0.size();
                collection0 = new ArrayList(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    ((ArrayList)collection0).add(Order.ASC.name());
                }
            }
            this.orders = (List)collection0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Index)) {
                return false;
            }
            if(this.unique != ((Index)object0).unique) {
                return false;
            }
            if(!Intrinsics.areEqual(this.columns, ((Index)object0).columns)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.orders, ((Index)object0).orders)) {
                return false;
            }
            return p.startsWith$default(this.name, "index_", false, 2, null) ? p.startsWith$default(((Index)object0).name, "index_", false, 2, null) : Intrinsics.areEqual(this.name, ((Index)object0).name);
        }

        // 去混淆评级： 低(20)
        @Override
        public int hashCode() {
            return p.startsWith$default(this.name, "index_", false, 2, null) ? this.orders.hashCode() + b.c(this.columns, (this.unique + 0x73D447D3) * 0x1F, 0x1F) : this.orders.hashCode() + b.c(this.columns, (this.name.hashCode() * 0x1F + this.unique) * 0x1F, 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Index{name=\'");
            stringBuilder0.append(this.name);
            stringBuilder0.append("\', unique=");
            stringBuilder0.append(this.unique);
            stringBuilder0.append(", columns=");
            stringBuilder0.append(this.columns);
            stringBuilder0.append(", orders=");
            return wb.a.e(stringBuilder0, this.orders, "\'}");
        }
    }

    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN;
    @NotNull
    public static final androidx.room.util.TableInfo.Companion Companion;
    @JvmField
    @NotNull
    public final Map columns;
    @JvmField
    @NotNull
    public final Set foreignKeys;
    @JvmField
    @Nullable
    public final Set indices;
    @JvmField
    @NotNull
    public final String name;

    static {
        TableInfo.Companion = new androidx.room.util.TableInfo.Companion(null);
    }

    public TableInfo(@NotNull String s, @NotNull Map map0, @NotNull Set set0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(map0, "columns");
        Intrinsics.checkNotNullParameter(set0, "foreignKeys");
        this(s, map0, set0, f0.emptySet());
    }

    public TableInfo(@NotNull String s, @NotNull Map map0, @NotNull Set set0, @Nullable Set set1) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(map0, "columns");
        Intrinsics.checkNotNullParameter(set0, "foreignKeys");
        super();
        this.name = s;
        this.columns = map0;
        this.foreignKeys = set0;
        this.indices = set1;
    }

    public TableInfo(String s, Map map0, Set set0, Set set1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            set1 = null;
        }
        this(s, map0, set0, set1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TableInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.name, ((TableInfo)object0).name)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.columns, ((TableInfo)object0).columns)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.foreignKeys, ((TableInfo)object0).foreignKeys)) {
            return false;
        }
        Set set0 = this.indices;
        if(set0 != null) {
            Set set1 = ((TableInfo)object0).indices;
            return set1 == null ? true : Intrinsics.areEqual(set0, set1);
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.foreignKeys.hashCode() + (this.columns.hashCode() + this.name.hashCode() * 0x1F) * 0x1F;
    }

    @JvmStatic
    @NotNull
    public static final TableInfo read(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, @NotNull String s) {
        return TableInfo.Companion.read(supportSQLiteDatabase0, s);
    }

    @Override
    @NotNull
    public String toString() {
        return "TableInfo{name=\'" + this.name + "\', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }
}

