package androidx.room.util;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.k;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "tableName", "Landroidx/room/util/TableInfo;", "readTableInfo", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroidx/room/util/TableInfo;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n145#2,2:647\n148#2,2:654\n151#2:660\n145#2,7:661\n145#2,7:668\n145#2,7:675\n766#3:649\n857#3,2:650\n1855#3,2:652\n857#3,2:656\n1855#3,2:658\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n*L\n477#1:647,2\n477#1:654,2\n477#1:660\n542#1:661,7\n580#1:668,7\n613#1:675,7\n497#1:649\n497#1:650,2\n499#1:652,2\n497#1:656,2\n499#1:658,2\n*E\n"})
public final class TableInfoKt {
    public static final List a(Cursor cursor0) {
        int v = cursor0.getColumnIndex("id");
        int v1 = cursor0.getColumnIndex("seq");
        int v2 = cursor0.getColumnIndex("from");
        int v3 = cursor0.getColumnIndex("to");
        List list0 = k.createListBuilder();
        while(cursor0.moveToNext()) {
            int v4 = cursor0.getInt(v);
            int v5 = cursor0.getInt(v1);
            String s = cursor0.getString(v2);
            Intrinsics.checkNotNullExpressionValue(s, "cursor.getString(fromColumnIndex)");
            String s1 = cursor0.getString(v3);
            Intrinsics.checkNotNullExpressionValue(s1, "cursor.getString(toColumnIndex)");
            list0.add(new ForeignKeyWithSequence(v4, v5, s, s1));
        }
        return CollectionsKt___CollectionsKt.sorted(k.build(list0));
    }

    public static final Index b(SupportSQLiteDatabase supportSQLiteDatabase0, String s, boolean z) {
        Index tableInfo$Index0;
        Cursor cursor0 = supportSQLiteDatabase0.query("PRAGMA index_xinfo(`" + s + "`)");
        try {
            int v = cursor0.getColumnIndex("seqno");
            int v1 = cursor0.getColumnIndex("cid");
            int v2 = cursor0.getColumnIndex("name");
            int v3 = cursor0.getColumnIndex("desc");
            if(v != -1 && v1 != -1 && v2 != -1 && v3 != -1) {
                TreeMap treeMap0 = new TreeMap();
                TreeMap treeMap1 = new TreeMap();
                while(cursor0.moveToNext()) {
                    if(cursor0.getInt(v1) >= 0) {
                        int v4 = cursor0.getInt(v);
                        String s1 = cursor0.getString(v2);
                        String s2 = cursor0.getInt(v3) <= 0 ? "ASC" : "DESC";
                        Intrinsics.checkNotNullExpressionValue(s1, "columnName");
                        treeMap0.put(v4, s1);
                        treeMap1.put(v4, s2);
                    }
                }
                Collection collection0 = treeMap0.values();
                Intrinsics.checkNotNullExpressionValue(collection0, "columnsMap.values");
                List list0 = CollectionsKt___CollectionsKt.toList(collection0);
                Collection collection1 = treeMap1.values();
                Intrinsics.checkNotNullExpressionValue(collection1, "ordersMap.values");
                tableInfo$Index0 = new Index(s, z, list0, CollectionsKt___CollectionsKt.toList(collection1));
                goto label_29;
            }
            goto label_31;
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
    label_29:
        CloseableKt.closeFinally(cursor0, null);
        return tableInfo$Index0;
    label_31:
        CloseableKt.closeFinally(cursor0, null);
        return null;
    }

    @NotNull
    public static final TableInfo readTableInfo(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, @NotNull String s) {
        Set set3;
        Set set2;
        Set set1;
        Map map1;
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "database");
        Intrinsics.checkNotNullParameter(s, "tableName");
        Cursor cursor0 = supportSQLiteDatabase0.query("PRAGMA table_info(`" + s + "`)");
        try {
            if(cursor0.getColumnCount() > 0) {
                int v = cursor0.getColumnIndex("name");
                int v1 = cursor0.getColumnIndex("type");
                int v2 = cursor0.getColumnIndex("notnull");
                int v3 = cursor0.getColumnIndex("pk");
                int v4 = cursor0.getColumnIndex("dflt_value");
                Map map0 = w.createMapBuilder();
                while(cursor0.moveToNext()) {
                    String s1 = cursor0.getString(v);
                    String s2 = cursor0.getString(v1);
                    boolean z = cursor0.getInt(v2) != 0;
                    int v5 = cursor0.getInt(v3);
                    String s3 = cursor0.getString(v4);
                    Intrinsics.checkNotNullExpressionValue(s1, "name");
                    Intrinsics.checkNotNullExpressionValue(s2, "type");
                    map0.put(s1, new Column(s1, s2, z, v5, s3, 2));
                }
                map1 = w.build(map0);
            }
            else {
                map1 = x.emptyMap();
            }
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(cursor0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(cursor0, null);
        Cursor cursor1 = supportSQLiteDatabase0.query("PRAGMA foreign_key_list(`" + s + "`)");
        try {
            int v6 = cursor1.getColumnIndex("id");
            int v7 = cursor1.getColumnIndex("seq");
            int v8 = cursor1.getColumnIndex("table");
            int v9 = cursor1.getColumnIndex("on_delete");
            int v10 = cursor1.getColumnIndex("on_update");
            List list0 = TableInfoKt.a(cursor1);
            cursor1.moveToPosition(-1);
            Set set0 = e0.createSetBuilder();
            while(cursor1.moveToNext()) {
                if(cursor1.getInt(v7) == 0) {
                    int v11 = cursor1.getInt(v6);
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object0: list0) {
                        if(((ForeignKeyWithSequence)object0).getId() == v11) {
                            arrayList2.add(object0);
                        }
                    }
                    for(Object object1: arrayList2) {
                        arrayList0.add(((ForeignKeyWithSequence)object1).getFrom());
                        arrayList1.add(((ForeignKeyWithSequence)object1).getTo());
                    }
                    String s4 = cursor1.getString(v8);
                    Intrinsics.checkNotNullExpressionValue(s4, "cursor.getString(tableColumnIndex)");
                    String s5 = cursor1.getString(v9);
                    Intrinsics.checkNotNullExpressionValue(s5, "cursor.getString(onDeleteColumnIndex)");
                    String s6 = cursor1.getString(v10);
                    Intrinsics.checkNotNullExpressionValue(s6, "cursor.getString(onUpdateColumnIndex)");
                    set0.add(new ForeignKey(s4, s5, s6, arrayList0, arrayList1));
                }
            }
            set1 = e0.build(set0);
        }
        catch(Throwable throwable1) {
            CloseableKt.closeFinally(cursor1, throwable1);
            throw throwable1;
        }
        CloseableKt.closeFinally(cursor1, null);
        Cursor cursor2 = supportSQLiteDatabase0.query("PRAGMA index_list(`" + s + "`)");
        try {
            int v12 = cursor2.getColumnIndex("name");
            int v13 = cursor2.getColumnIndex("origin");
            int v14 = cursor2.getColumnIndex("unique");
            if(v12 != -1 && v13 != -1 && v14 != -1) {
                set2 = e0.createSetBuilder();
                while(true) {
                    if(!cursor2.moveToNext()) {
                        goto label_86;
                    }
                    if(Intrinsics.areEqual("c", cursor2.getString(v13))) {
                        String s7 = cursor2.getString(v12);
                        boolean z1 = cursor2.getInt(v14) == 1;
                        Intrinsics.checkNotNullExpressionValue(s7, "name");
                        Index tableInfo$Index0 = TableInfoKt.b(supportSQLiteDatabase0, s7, z1);
                        if(tableInfo$Index0 == null) {
                            goto label_84;
                        }
                        set2.add(tableInfo$Index0);
                    }
                }
            }
            goto label_93;
        }
        catch(Throwable throwable2) {
            CloseableKt.closeFinally(cursor2, throwable2);
            throw throwable2;
        }
    label_84:
        CloseableKt.closeFinally(cursor2, null);
        return new TableInfo(s, map1, set1, null);
        try {
        label_86:
            set3 = e0.build(set2);
        }
        catch(Throwable throwable2) {
            CloseableKt.closeFinally(cursor2, throwable2);
            throw throwable2;
        }
        CloseableKt.closeFinally(cursor2, null);
        return new TableInfo(s, map1, set1, set3);
    label_93:
        CloseableKt.closeFinally(cursor2, null);
        return new TableInfo(s, map1, set1, null);
    }
}

