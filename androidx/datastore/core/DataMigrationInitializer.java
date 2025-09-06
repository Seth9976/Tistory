package androidx.datastore.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import qd.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer;", "T", "", "()V", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DataMigrationInitializer {
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JX\u0010\r\u001A3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer$Companion;", "", "T", "", "Landroidx/datastore/core/DataMigration;", "migrations", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "getInitializer", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nDataMigrationInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1855#2,2:73\n1#3:75\n*S KotlinDebug\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion\n*L\n55#1:73,2\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final Object access$runMigrations(Companion dataMigrationInitializer$Companion0, List list0, InitializerApi initializerApi0, Continuation continuation0) {
            Iterator iterator0;
            ObjectRef ref$ObjectRef0;
            b b0;
            dataMigrationInitializer$Companion0.getClass();
            if(continuation0 instanceof b) {
                b0 = (b)continuation0;
                int v = b0.s;
                if((v & 0x80000000) == 0) {
                    b0 = new b(dataMigrationInitializer$Companion0, continuation0);
                }
                else {
                    b0.s = v ^ 0x80000000;
                }
            }
            else {
                b0 = new b(dataMigrationInitializer$Companion0, continuation0);
            }
            Object object0 = b0.q;
            Unit unit0 = a.getCOROUTINE_SUSPENDED();
            switch(b0.s) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    ArrayList arrayList0 = new ArrayList();
                    d d0 = new d(list0, arrayList0, null);
                    b0.o = arrayList0;
                    b0.s = 1;
                    if(initializerApi0.updateData(d0, b0) != unit0) {
                        ref$ObjectRef0 = new ObjectRef();
                        iterator0 = arrayList0.iterator();
                        break;
                    }
                    return unit0;
                }
                case 1: {
                    List list1 = (List)b0.o;
                    ResultKt.throwOnFailure(object0);
                    ref$ObjectRef0 = new ObjectRef();
                    iterator0 = list1.iterator();
                    break;
                }
                case 2: {
                    iterator0 = b0.p;
                    ref$ObjectRef0 = (ObjectRef)b0.o;
                    try {
                        ResultKt.throwOnFailure(object0);
                        break;
                    }
                    catch(Throwable throwable0) {
                        goto label_41;
                    }
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                Function1 function10 = (Function1)object1;
                try {
                    b0.o = ref$ObjectRef0;
                    b0.p = iterator0;
                    b0.s = 2;
                    if(function10.invoke(b0) != unit0) {
                        continue;
                    }
                }
                catch(Throwable throwable0) {
                label_41:
                    Object object2 = ref$ObjectRef0.element;
                    if(object2 == null) {
                        ref$ObjectRef0.element = throwable0;
                        continue;
                    }
                    Intrinsics.checkNotNull(object2);
                    md.b.addSuppressed(((Throwable)object2), throwable0);
                    continue;
                }
                return unit0;
            }
            Throwable throwable1 = (Throwable)ref$ObjectRef0.element;
            if(throwable1 != null) {
                throw throwable1;
            }
            return Unit.INSTANCE;
        }

        @NotNull
        public final Function2 getInitializer(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "migrations");
            return new androidx.datastore.core.a(list0, null);
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        DataMigrationInitializer.Companion = new Companion(null);
    }
}

