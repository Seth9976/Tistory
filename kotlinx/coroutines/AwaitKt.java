package kotlinx.coroutines;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import sf.d;
import sf.e;
import sf.f;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001E\n\u0002\b\u0002\u001A=\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001E\u0010\u0003\u001A\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004\"\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001A%\u0010\u0007\u001A\u00020\b2\u0012\u0010\t\u001A\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0004\"\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000B\u001A-\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001A\u001B\u0010\u0007\u001A\u00020\b*\b\u0012\u0004\u0012\u00020\n0\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000E"}, d2 = {"awaitAll", "", "T", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "([Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinAll", "", "jobs", "Lkotlinx/coroutines/Job;", "([Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n37#2,2:128\n13579#3,2:130\n1855#4,2:132\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n*L\n42#1:128,2\n54#1:130,2\n66#1:132,2\n*E\n"})
public final class AwaitKt {
    @Nullable
    public static final Object awaitAll(@NotNull Collection collection0, @NotNull Continuation continuation0) {
        return collection0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : new d(((Deferred[])collection0.toArray(new Deferred[0]))).a(continuation0);
    }

    @Nullable
    public static final Object awaitAll(@NotNull Deferred[] arr_deferred, @NotNull Continuation continuation0) {
        return arr_deferred.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new d(arr_deferred).a(continuation0);
    }

    @Nullable
    public static final Object joinAll(@NotNull Collection collection0, @NotNull Continuation continuation0) {
        Iterator iterator0;
        f f0;
        if(continuation0 instanceof f) {
            f0 = (f)continuation0;
            int v = f0.q;
            if((v & 0x80000000) == 0) {
                f0 = new f(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                f0.q = v ^ 0x80000000;
            }
        }
        else {
            f0 = new f(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = f0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                iterator0 = collection0.iterator();
                break;
            }
            case 1: {
                iterator0 = f0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            f0.o = iterator0;
            f0.q = 1;
            if(((Job)object2).join(f0) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object joinAll(@NotNull Job[] arr_job, @NotNull Continuation continuation0) {
        int v2;
        Job[] arr_job1;
        int v1;
        e e0;
        if(continuation0 instanceof e) {
            e0 = (e)continuation0;
            int v = e0.s;
            if((v & 0x80000000) == 0) {
                e0 = new e(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                e0.s = v ^ 0x80000000;
            }
        }
        else {
            e0 = new e(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = e0.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(e0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                v1 = 0;
                arr_job1 = arr_job;
                v2 = arr_job.length;
                goto label_24;
            }
            case 1: {
                v2 = e0.q;
                v1 = e0.p;
                Job[] arr_job2 = (Job[])e0.o;
                ResultKt.throwOnFailure(object0);
                arr_job1 = arr_job2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            ++v1;
        label_24:
            if(v1 >= v2) {
                break;
            }
            e0.o = arr_job1;
            e0.p = v1;
            e0.q = v2;
            e0.s = 1;
            if(arr_job1[v1].join(e0) != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

