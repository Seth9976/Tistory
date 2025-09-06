package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.SharingStartedKt;
import md.b;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s.h1;
import w3.a0;
import w3.d;
import w3.e;
import w3.j;
import w3.k;
import w3.n;
import w3.o;
import w3.p;
import w3.q;
import w3.r;
import w3.s;
import w3.t;
import w3.u;
import w3.v;
import w3.x;
import w3.y;
import w3.z;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 ,*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002,-Bp\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012?\b\u0002\u0010\u000E\u001A9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00060\u0005\u0012\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u0017\u001A\u00028\u000021\u0010\u0016\u001A-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000B\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001F\u001A\u00020\u001C2\u0006\u0010\u0019\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\u001AH\u0080@¢\u0006\u0004\b\u001D\u0010\u001ER \u0010%\u001A\b\u0012\u0004\u0012\u00028\u00000 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R!\u0010+\u001A\b\u0012\u0004\u0012\u00028\u00000&8@X\u0080\u0084\u0002¢\u0006\f\u001A\u0004\b\'\u0010(*\u0004\b)\u0010*¨\u0006."}, d2 = {"Landroidx/datastore/core/DataStoreImpl;", "T", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", "storage", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "Landroidx/datastore/core/CorruptionHandler;", "corruptionHandler", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Landroidx/datastore/core/Storage;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;)V", "t", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", "", "updateCache", "", "writeData$datastore_core_release", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "Lkotlinx/coroutines/flow/Flow;", "f", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "data", "Landroidx/datastore/core/StorageConnection;", "getStorageConnection$datastore_core_release", "()Landroidx/datastore/core/StorageConnection;", "getStorageConnection$datastore_core_release$delegate", "(Landroidx/datastore/core/DataStoreImpl;)Ljava/lang/Object;", "storageConnection", "Companion", "w3/d", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DataStoreImpl implements DataStore {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$Companion;", "", "", "BUG_MESSAGE", "Ljava/lang/String;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Storage a;
    public final CorruptionHandler b;
    public final CoroutineScope c;
    public final SharedFlow d;
    public final Flow e;
    public final Flow f;
    public final DataStoreInMemoryCache g;
    public final d h;
    public final Lazy i;
    public final Lazy j;
    public final SimpleActor k;

    static {
        DataStoreImpl.Companion = new Companion(null);
    }

    public DataStoreImpl(@NotNull Storage storage0, @NotNull List list0, @NotNull CorruptionHandler corruptionHandler0, @NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(storage0, "storage");
        Intrinsics.checkNotNullParameter(list0, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler0, "corruptionHandler");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        super();
        this.a = storage0;
        this.b = corruptionHandler0;
        this.c = coroutineScope0;
        this.d = FlowKt.shareIn(FlowKt.flow(new y(this, null)), coroutineScope0, SharingStartedKt.WhileSubscribed-5qebJ5I(SharingStarted.Companion, 0L, 0L), 0);
        this.e = FlowKt.flow(new n(this, null));
        this.f = FlowKt.channelFlow(new j(this, null));
        this.g = new DataStoreInMemoryCache();
        this.h = new d(this, list0);
        this.i = c.lazy(new e(this, 1));
        this.j = c.lazy(new e(this, 0));
        h1 h10 = new h1(this, 19);
        h h0 = new h(this, null);
        this.k = new SimpleActor(coroutineScope0, h10, g.w, h0);
    }

    public DataStoreImpl(Storage storage0, List list0, CorruptionHandler corruptionHandler0, CoroutineScope coroutineScope0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 4) != 0) {
            corruptionHandler0 = new NoOpCorruptionHandler();
        }
        if((v & 8) != 0) {
            coroutineScope0 = CoroutineScopeKt.CoroutineScope(Actual_jvmKt.ioDispatcher().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        this(storage0, list0, corruptionHandler0, coroutineScope0);
    }

    public final InterProcessCoordinator a() {
        return (InterProcessCoordinator)this.j.getValue();
    }

    public static final Object access$doWithWriteFileLock(DataStoreImpl dataStoreImpl0, boolean z, Function1 function10, Continuation continuation0) {
        if(z) {
            dataStoreImpl0.getClass();
            return function10.invoke(continuation0);
        }
        return dataStoreImpl0.a().lock(new k(function10, null), continuation0);
    }

    public static final Lazy access$getStorageConnectionDelegate$p(DataStoreImpl dataStoreImpl0) {
        return dataStoreImpl0.i;
    }

    public static final Object access$handleUpdate(DataStoreImpl dataStoreImpl0, Update message$Update0, Continuation continuation0) {
        Object object2;
        Function2 function20;
        CompletableDeferred completableDeferred1;
        Object object1;
        CompletableDeferred completableDeferred0;
        androidx.datastore.core.e e0;
        dataStoreImpl0.getClass();
        if(continuation0 instanceof androidx.datastore.core.e) {
            e0 = (androidx.datastore.core.e)continuation0;
            int v = e0.t;
            if((v & 0x80000000) == 0) {
                e0 = new androidx.datastore.core.e(dataStoreImpl0, continuation0);
            }
            else {
                e0.t = v ^ 0x80000000;
            }
        }
        else {
            e0 = new androidx.datastore.core.e(dataStoreImpl0, continuation0);
        }
        Object object0 = e0.r;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        boolean z = true;
        switch(e0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                completableDeferred0 = message$Update0.getAck();
                try {
                    State state0 = dataStoreImpl0.g.getCurrentState();
                    if(state0 instanceof Data) {
                        e0.o = completableDeferred0;
                        e0.t = 1;
                        goto label_36;
                    }
                    else {
                        if(!(state0 instanceof ReadException)) {
                            z = state0 instanceof UnInitialized;
                        }
                        if(!z) {
                            if(!(state0 instanceof Final)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw ((Final)state0).getFinalException();
                        }
                        if(state0 != message$Update0.getLastState()) {
                            Intrinsics.checkNotNull(state0, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$0>");
                            throw ((ReadException)state0).getReadException();
                        }
                        e0.o = message$Update0;
                        e0.p = dataStoreImpl0;
                        e0.q = completableDeferred0;
                        e0.t = 2;
                        if(dataStoreImpl0.b(e0) == unit0) {
                            return unit0;
                        }
                        goto label_48;
                    }
                    goto label_64;
                }
                catch(Throwable throwable0) {
                    goto label_55;
                }
                try {
                label_36:
                    object1 = dataStoreImpl0.a().lock(new x(dataStoreImpl0, message$Update0.getTransform(), message$Update0.getCallerContext(), null), e0);
                    if(object1 == unit0) {
                        return unit0;
                    }
                    goto label_64;
                }
                catch(Throwable throwable1) {
                    goto label_59;
                }
                return unit0;
            }
            case 1: {
                completableDeferred1 = (CompletableDeferred)e0.o;
                goto label_68;
            }
            case 2: {
                completableDeferred1 = e0.q;
                DataStoreImpl dataStoreImpl1 = e0.p;
                Update message$Update1 = (Update)e0.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    completableDeferred0 = completableDeferred1;
                    dataStoreImpl0 = dataStoreImpl1;
                    message$Update0 = message$Update1;
                }
                catch(Throwable throwable0) {
                    break;
                }
                try {
                label_48:
                    function20 = message$Update0.getTransform();
                    e0.o = completableDeferred0;
                    e0.p = null;
                    e0.q = null;
                    e0.t = 3;
                }
                catch(Throwable throwable0) {
                label_55:
                    goto label_60;
                }
                try {
                    object1 = dataStoreImpl0.a().lock(new x(dataStoreImpl0, function20, message$Update0.getCallerContext(), null), e0);
                    goto label_62;
                }
                catch(Throwable throwable1) {
                label_59:
                    throwable0 = throwable1;
                }
            label_60:
                completableDeferred1 = completableDeferred0;
                break;
            label_62:
                if(object1 == unit0) {
                    return unit0;
                }
            label_64:
                object0 = object1;
                completableDeferred1 = completableDeferred0;
                goto label_69;
            }
            case 3: {
                completableDeferred1 = (CompletableDeferred)e0.o;
                try {
                label_68:
                    ResultKt.throwOnFailure(object0);
                label_69:
                    object2 = object0;
                    goto label_73;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object2 = Result.constructor-impl(ResultKt.createFailure(throwable0));
    label_73:
        CompletableDeferredKt.completeWith(completableDeferred1, object2);
        return Unit.INSTANCE;
    }

    public static final Object access$readDataAndUpdateCache(DataStoreImpl dataStoreImpl0, boolean z, Continuation continuation0) {
        DataStoreImpl dataStoreImpl2;
        State state2;
        DataStoreImpl dataStoreImpl1;
        p p0;
        dataStoreImpl0.getClass();
        if(continuation0 instanceof p) {
            p0 = (p)continuation0;
            int v = p0.t;
            if((v & 0x80000000) == 0) {
                p0 = new p(dataStoreImpl0, continuation0);
            }
            else {
                p0.t = v ^ 0x80000000;
            }
        }
        else {
            p0 = new p(dataStoreImpl0, continuation0);
        }
        Object object0 = p0.r;
        State state0 = a.getCOROUTINE_SUSPENDED();
        switch(p0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                State state1 = dataStoreImpl0.g.getCurrentState();
                if(state1 instanceof UnInitialized) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                InterProcessCoordinator interProcessCoordinator0 = dataStoreImpl0.a();
                p0.o = dataStoreImpl0;
                p0.p = state1;
                p0.q = z;
                p0.t = 1;
                Object object1 = interProcessCoordinator0.getVersion(p0);
                if(object1 != state0) {
                    dataStoreImpl1 = dataStoreImpl0;
                    state2 = state1;
                    object0 = object1;
                    goto label_33;
                }
                break;
            }
            case 1: {
                z = p0.q;
                state2 = p0.p;
                dataStoreImpl1 = p0.o;
                ResultKt.throwOnFailure(object0);
            label_33:
                int v1 = state2 instanceof Data ? state2.getVersion() : -1;
                if(state2 instanceof Data && ((Number)object0).intValue() == v1) {
                    return state2;
                }
                if(z) {
                    InterProcessCoordinator interProcessCoordinator1 = dataStoreImpl1.a();
                    q q0 = new q(dataStoreImpl1, null);
                    p0.o = dataStoreImpl1;
                    p0.p = null;
                    p0.t = 2;
                    object0 = interProcessCoordinator1.lock(q0, p0);
                    if(object0 != state0) {
                        dataStoreImpl2 = dataStoreImpl1;
                        goto label_60;
                    }
                }
                else {
                    InterProcessCoordinator interProcessCoordinator2 = dataStoreImpl1.a();
                    r r0 = new r(dataStoreImpl1, v1, null);
                    p0.o = dataStoreImpl1;
                    p0.p = null;
                    p0.t = 3;
                    object0 = interProcessCoordinator2.tryLock(r0, p0);
                    if(object0 != state0) {
                        dataStoreImpl2 = dataStoreImpl1;
                        goto label_60;
                    }
                }
                break;
            }
            case 2: {
                dataStoreImpl2 = p0.o;
                ResultKt.throwOnFailure(object0);
                goto label_60;
            }
            case 3: {
                dataStoreImpl2 = p0.o;
                ResultKt.throwOnFailure(object0);
            label_60:
                state0 = (State)((Pair)object0).component1();
                if(((Boolean)((Pair)object0).component2()).booleanValue()) {
                    dataStoreImpl2.g.tryUpdate(state0);
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return state0;
    }

    public static final Object access$readDataFromFileOrDefault(DataStoreImpl dataStoreImpl0, Continuation continuation0) {
        return StorageConnectionKt.readData(dataStoreImpl0.getStorageConnection$datastore_core_release(), continuation0);
    }

    public static final Object access$readDataOrHandleCorruption(DataStoreImpl dataStoreImpl0, boolean z, Continuation continuation0) {
        ObjectRef ref$ObjectRef2;
        IntRef ref$IntRef1;
        CorruptionException corruptionException2;
        Object object4;
        IntRef ref$IntRef0;
        CorruptionException corruptionException1;
        boolean z1;
        DataStoreImpl dataStoreImpl2;
        ObjectRef ref$ObjectRef0;
        Object object2;
        int v3;
        DataStoreImpl dataStoreImpl1;
        Object object1;
        int v2;
        s s0;
        dataStoreImpl0.getClass();
        if(continuation0 instanceof s) {
            s0 = (s)continuation0;
            int v = s0.w;
            if((v & 0x80000000) == 0) {
                s0 = new s(dataStoreImpl0, continuation0);
            }
            else {
                s0.w = v ^ 0x80000000;
            }
        }
        else {
            s0 = new s(dataStoreImpl0, continuation0);
        }
        Object object0 = s0.u;
        Data data0 = a.getCOROUTINE_SUSPENDED();
        int v1 = 0;
        switch(s0.w) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    if(z) {
                        s0.o = dataStoreImpl0;
                        s0.s = true;
                        s0.w = 1;
                        object0 = StorageConnectionKt.readData(dataStoreImpl0.getStorageConnection$datastore_core_release(), s0);
                        if(object0 != data0) {
                            goto label_33;
                        }
                    }
                    else {
                        InterProcessCoordinator interProcessCoordinator0 = dataStoreImpl0.a();
                        s0.o = dataStoreImpl0;
                        s0.s = false;
                        s0.w = 3;
                        object0 = interProcessCoordinator0.getVersion(s0);
                        if(object0 != data0) {
                            goto label_59;
                        }
                    }
                    return data0;
                }
                catch(CorruptionException corruptionException0) {
                    goto label_72;
                }
                goto label_59;
            }
            case 1: {
                z = s0.s;
                dataStoreImpl0 = (DataStoreImpl)s0.o;
                try {
                    ResultKt.throwOnFailure(object0);
                label_33:
                    v2 = object0 == null ? 0 : object0.hashCode();
                    InterProcessCoordinator interProcessCoordinator1 = dataStoreImpl0.a();
                    s0.o = dataStoreImpl0;
                    s0.p = object0;
                    s0.s = z;
                    s0.t = v2;
                    s0.w = 2;
                    object1 = interProcessCoordinator1.getVersion(s0);
                    if(object1 != data0) {
                        goto label_42;
                    }
                    return data0;
                }
                catch(CorruptionException corruptionException0) {
                    goto label_72;
                }
            label_42:
                dataStoreImpl1 = dataStoreImpl0;
                v3 = v2;
                object2 = object0;
                object0 = object1;
                return new Data(object2, v3, ((Number)object0).intValue());
            }
            case 2: {
                v3 = s0.t;
                z = s0.s;
                object2 = s0.p;
                dataStoreImpl1 = (DataStoreImpl)s0.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    return new Data(object2, v3, ((Number)object0).intValue());
                }
                catch(CorruptionException corruptionException0) {
                    dataStoreImpl0 = dataStoreImpl1;
                    goto label_72;
                }
            }
            case 3: {
                z = s0.s;
                dataStoreImpl0 = (DataStoreImpl)s0.o;
                try {
                    ResultKt.throwOnFailure(object0);
                label_59:
                    InterProcessCoordinator interProcessCoordinator2 = dataStoreImpl0.a();
                    t t0 = new t(dataStoreImpl0, ((Number)object0).intValue(), null);
                    s0.o = dataStoreImpl0;
                    s0.s = z;
                    s0.w = 4;
                    object0 = interProcessCoordinator2.tryLock(t0, s0);
                    return object0 != data0 ? ((Data)object0) : data0;
                }
                catch(CorruptionException corruptionException0) {
                    goto label_72;
                }
                return (Data)object0;
            }
            case 4: {
                z = s0.s;
                dataStoreImpl0 = (DataStoreImpl)s0.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    return (Data)object0;
                }
                catch(CorruptionException corruptionException0) {
                }
            label_72:
                ref$ObjectRef0 = new ObjectRef();
                s0.o = dataStoreImpl0;
                s0.p = corruptionException0;
                s0.q = ref$ObjectRef0;
                s0.r = ref$ObjectRef0;
                s0.s = z;
                s0.w = 5;
                Object object3 = dataStoreImpl0.b.handleCorruption(corruptionException0, s0);
                if(object3 != data0) {
                    dataStoreImpl2 = dataStoreImpl0;
                    z1 = z;
                    corruptionException1 = corruptionException0;
                    ref$ObjectRef0.element = object3;
                    ref$IntRef0 = new IntRef();
                    goto label_95;
                }
                return data0;
            }
            case 5: {
                z1 = s0.s;
                ObjectRef ref$ObjectRef1 = s0.r;
                ref$ObjectRef0 = (ObjectRef)s0.q;
                corruptionException1 = (CorruptionException)s0.p;
                dataStoreImpl2 = (DataStoreImpl)s0.o;
                ResultKt.throwOnFailure(object0);
                ref$ObjectRef1.element = object0;
                ref$IntRef0 = new IntRef();
                try {
                label_95:
                    u u0 = new u(ref$ObjectRef0, dataStoreImpl2, ref$IntRef0, null);
                    s0.o = corruptionException1;
                    s0.p = ref$ObjectRef0;
                    s0.q = ref$IntRef0;
                    s0.r = null;
                    s0.w = 6;
                    if(z1) {
                        dataStoreImpl2.getClass();
                        object4 = u0.invoke(s0);
                    }
                    else {
                        object4 = dataStoreImpl2.a().lock(new k(u0, null), s0);
                    }
                }
                catch(Throwable throwable0) {
                    corruptionException2 = corruptionException1;
                    b.addSuppressed(corruptionException2, throwable0);
                    throw corruptionException2;
                }
                if(object4 != data0) {
                    ref$IntRef1 = ref$IntRef0;
                    ref$ObjectRef2 = ref$ObjectRef0;
                    break;
                }
                return data0;
            }
            case 6: {
                ref$IntRef1 = (IntRef)s0.q;
                ref$ObjectRef2 = (ObjectRef)s0.p;
                corruptionException2 = (CorruptionException)s0.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                b.addSuppressed(corruptionException2, throwable0);
                throw corruptionException2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object5 = ref$ObjectRef2.element;
        if(object5 != null) {
            v1 = object5.hashCode();
        }
        return new Data(object5, v1, ref$IntRef1.element);
    }

    public static final Object access$readState(DataStoreImpl dataStoreImpl0, boolean z, Continuation continuation0) {
        return BuildersKt.withContext(dataStoreImpl0.c.getCoroutineContext(), new v(dataStoreImpl0, z, null), continuation0);
    }

    public static final Object access$transformAndWrite(DataStoreImpl dataStoreImpl0, Function2 function20, CoroutineContext coroutineContext0, Continuation continuation0) {
        return dataStoreImpl0.a().lock(new x(dataStoreImpl0, function20, coroutineContext0, null), continuation0);
    }

    public final Object b(Continuation continuation0) {
        DataStoreImpl dataStoreImpl0;
        int v1;
        DataStoreImpl dataStoreImpl1;
        o o0;
        if(continuation0 instanceof o) {
            o0 = (o)continuation0;
            int v = o0.s;
            if((v & 0x80000000) == 0) {
                o0 = new o(this, continuation0);
            }
            else {
                o0.s = v ^ 0x80000000;
            }
        }
        else {
            o0 = new o(this, continuation0);
        }
        Object object0 = o0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(o0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                InterProcessCoordinator interProcessCoordinator0 = this.a();
                o0.o = this;
                o0.s = 1;
                object0 = interProcessCoordinator0.getVersion(o0);
                if(object0 == object1) {
                    return object1;
                }
                dataStoreImpl1 = this;
                break;
            }
            case 1: {
                dataStoreImpl1 = o0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                try {
                    v1 = o0.p;
                    dataStoreImpl0 = o0.o;
                    ResultKt.throwOnFailure(object0);
                    return Unit.INSTANCE;
                }
                catch(Throwable throwable0) {
                    goto label_40;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        int v2 = ((Number)object0).intValue();
        try {
            o0.o = dataStoreImpl1;
            o0.p = v2;
            o0.s = 2;
            return dataStoreImpl1.h.runIfNeeded(o0) == object1 ? object1 : Unit.INSTANCE;
        }
        catch(Throwable throwable1) {
            v1 = v2;
            throwable0 = throwable1;
            dataStoreImpl0 = dataStoreImpl1;
        }
    label_40:
        ReadException readException0 = new ReadException(throwable0, v1);
        dataStoreImpl0.g.tryUpdate(readException0);
        throw throwable0;
    }

    @Override  // androidx.datastore.core.DataStore
    @NotNull
    public Flow getData() {
        return this.f;
    }

    @NotNull
    public final StorageConnection getStorageConnection$datastore_core_release() {
        return (StorageConnection)this.i.getValue();
    }

    @Override  // androidx.datastore.core.DataStore
    @Nullable
    public Object updateData(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        UpdatingDataContextElement updatingDataContextElement0 = (UpdatingDataContextElement)continuation0.getContext().get(Key.INSTANCE);
        if(updatingDataContextElement0 != null) {
            updatingDataContextElement0.checkNotUpdating(this);
        }
        return BuildersKt.withContext(new UpdatingDataContextElement(updatingDataContextElement0, this), new f(this, function20, null), continuation0);
    }

    @Nullable
    public final Object writeData$datastore_core_release(Object object0, boolean z, @NotNull Continuation continuation0) {
        z z1;
        if(continuation0 instanceof z) {
            z1 = (z)continuation0;
            int v = z1.r;
            if((v & 0x80000000) == 0) {
                z1 = new z(this, continuation0);
            }
            else {
                z1.r = v ^ 0x80000000;
            }
        }
        else {
            z1 = new z(this, continuation0);
        }
        Object object1 = z1.p;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(z1.r) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                IntRef ref$IntRef0 = new IntRef();
                StorageConnection storageConnection0 = this.getStorageConnection$datastore_core_release();
                a0 a00 = new a0(ref$IntRef0, this, object0, z, null);
                z1.o = ref$IntRef0;
                z1.r = 1;
                return storageConnection0.writeScope(a00, z1) == object2 ? object2 : Boxing.boxInt(ref$IntRef0.element);
            }
            case 1: {
                IntRef ref$IntRef1 = z1.o;
                ResultKt.throwOnFailure(object1);
                return Boxing.boxInt(ref$IntRef1.element);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

