package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.l2;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003Bd\u0012[\u0010\r\u001AW\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004¢\u0006\u0004\b\u000E\u0010\u000FJ\"\u0010\u0013\u001A\u00020\f2\u0006\u0010\u0011\u001A\u00020\u00102\b\u0010\u0012\u001A\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/paging/UnbatchedFlowCombiner;", "T1", "T2", "", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "t1", "t2", "Landroidx/paging/CombineSource;", "updateFrom", "Lkotlin/coroutines/Continuation;", "", "send", "<init>", "(Lkotlin/jvm/functions/Function4;)V", "", "index", "value", "onNext", "(ILjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/UnbatchedFlowCombiner\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,224:1\n120#2,8:225\n129#2:237\n12744#3,2:233\n18987#3,2:235\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/paging/UnbatchedFlowCombiner\n*L\n195#1:225,8\n195#1:237\n196#1:233,2\n199#1:235,2\n*E\n"})
public final class UnbatchedFlowCombiner {
    public final Function4 a;
    public final CompletableDeferred b;
    public final Mutex c;
    public final CompletableDeferred[] d;
    public final Object[] e;

    public UnbatchedFlowCombiner(@NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(function40, "send");
        super();
        this.a = function40;
        this.b = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.c = MutexKt.Mutex$default(false, 1, null);
        CompletableDeferred[] arr_completableDeferred = new CompletableDeferred[2];
        for(int v1 = 0; v1 < 2; ++v1) {
            arr_completableDeferred[v1] = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        }
        this.d = arr_completableDeferred;
        Object[] arr_object = new Object[2];
        for(int v = 0; v < 2; ++v) {
            arr_object[v] = FlowExtKt.a;
        }
        this.e = arr_object;
    }

    @Nullable
    public final Object onNext(int v, @Nullable Object object0, @NotNull Continuation continuation0) {
        Mutex mutex2;
        CombineSource combineSource0;
        UnbatchedFlowCombiner unbatchedFlowCombiner1;
        Mutex mutex1;
        Object object4;
        UnbatchedFlowCombiner unbatchedFlowCombiner0;
        Object object3;
        l2 l20;
        if(continuation0 instanceof l2) {
            l20 = (l2)continuation0;
            int v1 = l20.u;
            if((v1 & 0x80000000) == 0) {
                l20 = new l2(this, continuation0);
            }
            else {
                l20.u = v1 ^ 0x80000000;
            }
        }
        else {
            l20 = new l2(this, continuation0);
        }
        Object object1 = l20.s;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(l20.u) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                CompletableDeferred[] arr_completableDeferred = this.d;
                if(arr_completableDeferred[v].isCompleted()) {
                    l20.o = this;
                    object3 = object0;
                    l20.p = object3;
                    l20.r = v;
                    l20.u = 1;
                    if(this.b.await(l20) == object2) {
                        return object2;
                    }
                }
                else {
                    object3 = object0;
                    arr_completableDeferred[v].complete(Unit.INSTANCE);
                }
                unbatchedFlowCombiner0 = this;
                goto label_31;
            }
            case 1: {
                v = l20.r;
                object3 = l20.p;
                unbatchedFlowCombiner0 = l20.o;
                ResultKt.throwOnFailure(object1);
            label_31:
                Mutex mutex0 = unbatchedFlowCombiner0.c;
                l20.o = unbatchedFlowCombiner0;
                l20.p = object3;
                l20.q = mutex0;
                l20.r = v;
                l20.u = 2;
                if(mutex0.lock(null, l20) == object2) {
                    return object2;
                }
                object4 = object3;
                mutex1 = mutex0;
                unbatchedFlowCombiner1 = unbatchedFlowCombiner0;
                goto label_49;
            }
            case 2: {
                v = l20.r;
                mutex1 = l20.q;
                object4 = l20.p;
                unbatchedFlowCombiner0 = l20.o;
                ResultKt.throwOnFailure(object1);
                unbatchedFlowCombiner1 = unbatchedFlowCombiner0;
                try {
                label_49:
                    boolean z = false;
                    Object[] arr_object = unbatchedFlowCombiner1.e;
                    for(int v2 = 0; v2 < arr_object.length; ++v2) {
                        if(arr_object[v2] == FlowExtKt.a) {
                            z = true;
                            break;
                        }
                    }
                    arr_object[v] = object4;
                    int v3 = 0;
                    while(true) {
                        if(v3 >= arr_object.length) {
                            if(z) {
                                combineSource0 = CombineSource.INITIAL;
                            }
                            else {
                                combineSource0 = v == 0 ? CombineSource.RECEIVER : CombineSource.OTHER;
                            }
                            l20.o = unbatchedFlowCombiner1;
                            l20.p = mutex1;
                            l20.q = null;
                            l20.u = 3;
                            if(unbatchedFlowCombiner1.a.invoke(arr_object[0], arr_object[1], combineSource0, l20) == object2) {
                                return object2;
                            }
                            mutex2 = mutex1;
                            goto label_81;
                        }
                        if(arr_object[v3] == FlowExtKt.a) {
                            goto label_87;
                        }
                        ++v3;
                    }
                }
                catch(Throwable throwable0) {
                    mutex2 = mutex1;
                    break;
                }
            }
            case 3: {
                mutex2 = (Mutex)l20.p;
                unbatchedFlowCombiner1 = l20.o;
                try {
                    ResultKt.throwOnFailure(object1);
                label_81:
                    unbatchedFlowCombiner1.b.complete(Unit.INSTANCE);
                    mutex1 = mutex2;
                    goto label_87;
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
    label_87:
        mutex1.unlock(null);
        return Unit.INSTANCE;
    }
}

