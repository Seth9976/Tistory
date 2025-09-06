package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import w3.b;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JC\u0010\t\u001A\u00028\u000021\u0010\b\u001A-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"androidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,546:1\n120#2,10:547\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n*L\n449#1:547,10\n*E\n"})
public final class DataStoreImpl.InitDataStore.doRun.initData.1.api.1 implements InitializerApi {
    public final Mutex a;
    public final BooleanRef b;
    public final ObjectRef c;
    public final DataStoreImpl d;

    public DataStoreImpl.InitDataStore.doRun.initData.1.api.1(Mutex mutex0, BooleanRef ref$BooleanRef0, ObjectRef ref$ObjectRef0, DataStoreImpl dataStoreImpl0) {
        this.a = mutex0;
        this.b = ref$BooleanRef0;
        this.c = ref$ObjectRef0;
        this.d = dataStoreImpl0;
    }

    @Override  // androidx.datastore.core.InitializerApi
    @Nullable
    public Object updateData(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object4;
        DataStoreImpl dataStoreImpl2;
        Mutex mutex3;
        Mutex mutex2;
        Object object2;
        ObjectRef ref$ObjectRef1;
        BooleanRef ref$BooleanRef1;
        DataStoreImpl dataStoreImpl0;
        Mutex mutex0;
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v = b0.v;
            if((v & 0x80000000) == 0) {
                b0 = new b(this, continuation0);
            }
            else {
                b0.v = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(this, continuation0);
        }
        Object object0 = b0.t;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b0.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                b0.o = function20;
                mutex0 = this.a;
                b0.p = mutex0;
                BooleanRef ref$BooleanRef0 = this.b;
                b0.q = ref$BooleanRef0;
                ObjectRef ref$ObjectRef0 = this.c;
                b0.r = ref$ObjectRef0;
                dataStoreImpl0 = this.d;
                b0.s = dataStoreImpl0;
                b0.v = 1;
                if(mutex0.lock(null, b0) == object1) {
                    return object1;
                }
                ref$BooleanRef1 = ref$BooleanRef0;
                ref$ObjectRef1 = ref$ObjectRef0;
                goto label_38;
            }
            case 1: {
                DataStoreImpl dataStoreImpl1 = b0.s;
                ref$ObjectRef1 = b0.r;
                ref$BooleanRef1 = (BooleanRef)b0.q;
                Mutex mutex1 = (Mutex)b0.p;
                Function2 function21 = (Function2)b0.o;
                ResultKt.throwOnFailure(object0);
                mutex0 = mutex1;
                dataStoreImpl0 = dataStoreImpl1;
                function20 = function21;
                try {
                label_38:
                    if(ref$BooleanRef1.element) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    b0.o = mutex0;
                    b0.p = ref$ObjectRef1;
                    b0.q = dataStoreImpl0;
                    b0.r = null;
                    b0.s = null;
                    b0.v = 2;
                    object2 = function20.invoke(ref$ObjectRef1.element, b0);
                }
                catch(Throwable throwable0) {
                    mutex2 = mutex0;
                    break;
                }
                if(object2 == object1) {
                    return object1;
                }
                mutex3 = mutex0;
                object0 = object2;
                dataStoreImpl2 = dataStoreImpl0;
                goto label_61;
            }
            case 2: {
                dataStoreImpl2 = (DataStoreImpl)b0.q;
                ref$ObjectRef1 = (ObjectRef)b0.p;
                mutex3 = (Mutex)b0.o;
                try {
                    ResultKt.throwOnFailure(object0);
                label_61:
                    if(Intrinsics.areEqual(object0, ref$ObjectRef1.element)) {
                        mutex2 = mutex3;
                    }
                    else {
                        b0.o = mutex3;
                        b0.p = ref$ObjectRef1;
                        b0.q = object0;
                        b0.v = 3;
                        if(dataStoreImpl2.writeData$datastore_core_release(object0, false, b0) == object1) {
                            return object1;
                        }
                        mutex2 = mutex3;
                        ref$ObjectRef1.element = object0;
                    }
                    object4 = ref$ObjectRef1.element;
                    goto label_88;
                }
                catch(Throwable throwable0) {
                    mutex2 = mutex3;
                    break;
                }
                return object1;
            }
            case 3: {
                Object object3 = b0.q;
                ObjectRef ref$ObjectRef2 = (ObjectRef)b0.p;
                mutex2 = (Mutex)b0.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    ref$ObjectRef2.element = object3;
                    ref$ObjectRef1 = ref$ObjectRef2;
                    object4 = ref$ObjectRef1.element;
                    goto label_88;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutex2.unlock(null);
        throw throwable0;
    label_88:
        mutex2.unlock(null);
        return object4;
    }
}

