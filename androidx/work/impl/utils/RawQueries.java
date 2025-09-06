package androidx.work.impl.utils;

import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo.State;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0011\u0010\u0002\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/WorkQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "toRawQuery", "(Landroidx/work/WorkQuery;)Landroidx/sqlite/db/SupportSQLiteQuery;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "RawQueries")
@SourceDebugExtension({"SMAP\nRawQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawQueries.kt\nandroidx/work/impl/utils/RawQueries\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1549#2:74\n1620#2,3:75\n1549#2:78\n1620#2,3:79\n37#3,2:82\n1#4:84\n*S KotlinDebug\n*F\n+ 1 RawQueries.kt\nandroidx/work/impl/utils/RawQueries\n*L\n35#1:74\n35#1:75,3\n43#1:78\n43#1:79,3\n64#1:82,2\n*E\n"})
public final class RawQueries {
    public static final void a(int v, StringBuilder stringBuilder0) {
        if(v <= 0) {
            return;
        }
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add("?");
        }
        stringBuilder0.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList0, ",", null, null, 0, null, null, 62, null));
    }

    @NotNull
    public static final SupportSQLiteQuery toRawQuery(@NotNull WorkQuery workQuery0) {
        String s1;
        Intrinsics.checkNotNullParameter(workQuery0, "<this>");
        ArrayList arrayList0 = new ArrayList();
        StringBuilder stringBuilder0 = new StringBuilder("SELECT * FROM workspec");
        List list0 = workQuery0.getStates();
        Intrinsics.checkNotNullExpressionValue(list0, "states");
        String s = " AND";
        if(list0.isEmpty()) {
            s1 = " WHERE";
        }
        else {
            List list1 = workQuery0.getStates();
            Intrinsics.checkNotNullExpressionValue(list1, "states");
            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
            for(Object object0: list1) {
                Intrinsics.checkNotNull(((State)object0));
                arrayList1.add(WorkTypeConverters.stateToInt(((State)object0)));
            }
            stringBuilder0.append(" WHERE state IN (");
            RawQueries.a(arrayList1.size(), stringBuilder0);
            stringBuilder0.append(")");
            arrayList0.addAll(arrayList1);
            s1 = " AND";
        }
        List list2 = workQuery0.getIds();
        Intrinsics.checkNotNullExpressionValue(list2, "ids");
        if(!list2.isEmpty()) {
            List list3 = workQuery0.getIds();
            Intrinsics.checkNotNullExpressionValue(list3, "ids");
            ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(list3, 10));
            for(Object object1: list3) {
                arrayList2.add(((UUID)object1).toString());
            }
            stringBuilder0.append(s1 + " id IN (");
            RawQueries.a(workQuery0.getIds().size(), stringBuilder0);
            stringBuilder0.append(")");
            arrayList0.addAll(arrayList2);
            s1 = " AND";
        }
        List list4 = workQuery0.getTags();
        Intrinsics.checkNotNullExpressionValue(list4, "tags");
        if(list4.isEmpty()) {
            s = s1;
        }
        else {
            stringBuilder0.append(s1 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            RawQueries.a(workQuery0.getTags().size(), stringBuilder0);
            stringBuilder0.append("))");
            List list5 = workQuery0.getTags();
            Intrinsics.checkNotNullExpressionValue(list5, "tags");
            arrayList0.addAll(list5);
        }
        List list6 = workQuery0.getUniqueWorkNames();
        Intrinsics.checkNotNullExpressionValue(list6, "uniqueWorkNames");
        if(!list6.isEmpty()) {
            stringBuilder0.append(s + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            RawQueries.a(workQuery0.getUniqueWorkNames().size(), stringBuilder0);
            stringBuilder0.append("))");
            List list7 = workQuery0.getUniqueWorkNames();
            Intrinsics.checkNotNullExpressionValue(list7, "uniqueWorkNames");
            arrayList0.addAll(list7);
        }
        stringBuilder0.append(";");
        String s2 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s2, "builder.toString()");
        return new SimpleSQLiteQuery(s2, arrayList0.toArray(new Object[0]));
    }
}

