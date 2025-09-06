package androidx.room;

import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ThreadContextElement;
import kotlinx.coroutines.ThreadContextElementKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u001A;\u0010\u0006\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001C\u0010\u0005\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A;\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000E0\r*\u00020\u00012\u0012\u0010\n\u001A\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u000F\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"R", "Landroidx/room/RoomDatabase;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "withTransaction", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "tables", "", "emitInitialState", "Lkotlinx/coroutines/flow/Flow;", "", "invalidationTrackerFlow", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "room-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "RoomDatabaseKt")
@SourceDebugExtension({"SMAP\nRoomDatabaseExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabaseExt.kt\nandroidx/room/RoomDatabaseKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,239:1\n314#2,11:240\n*S KotlinDebug\n*F\n+ 1 RoomDatabaseExt.kt\nandroidx/room/RoomDatabaseKt\n*L\n92#1:240,11\n*E\n"})
public final class RoomDatabaseKt {
    public static final Object a(RoomDatabase roomDatabase0, CoroutineContext coroutineContext0, Function2 function20, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        try {
            roomDatabase0.getTransactionExecutor().execute(new d1(coroutineContext0, cancellableContinuationImpl0, roomDatabase0, function20));
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            cancellableContinuationImpl0.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", rejectedExecutionException0));
        }
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    public static final CoroutineContext access$createTransactionContext(RoomDatabase roomDatabase0, ContinuationInterceptor continuationInterceptor0) {
        TransactionElement transactionElement0 = new TransactionElement(continuationInterceptor0);
        ThreadContextElement threadContextElement0 = ThreadContextElementKt.asContextElement(roomDatabase0.getSuspendingTransactionId(), System.identityHashCode(transactionElement0));
        return continuationInterceptor0.plus(transactionElement0).plus(threadContextElement0);
    }

    public static final Object access$startTransactionCoroutine(RoomDatabase roomDatabase0, CoroutineContext coroutineContext0, Function2 function20, Continuation continuation0) {
        return RoomDatabaseKt.a(roomDatabase0, coroutineContext0, function20, continuation0);
    }

    @NotNull
    public static final Flow invalidationTrackerFlow(@NotNull RoomDatabase roomDatabase0, @NotNull String[] arr_s, boolean z) {
        return FlowKt.callbackFlow(new b1(z, roomDatabase0, arr_s, null));
    }

    public static Flow invalidationTrackerFlow$default(RoomDatabase roomDatabase0, String[] arr_s, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return RoomDatabaseKt.invalidationTrackerFlow(roomDatabase0, arr_s, z);
    }

    @Nullable
    public static final Object withTransaction(@NotNull RoomDatabase roomDatabase0, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        ContinuationInterceptor continuationInterceptor0 = null;
        e1 e10 = new e1(roomDatabase0, function10, null);
        TransactionElement transactionElement0 = (TransactionElement)continuation0.getContext().get(TransactionElement.Key);
        if(transactionElement0 != null) {
            continuationInterceptor0 = transactionElement0.getTransactionDispatcher$room_ktx_release();
        }
        return continuationInterceptor0 == null ? RoomDatabaseKt.a(roomDatabase0, continuation0.getContext(), e10, continuation0) : BuildersKt.withContext(continuationInterceptor0, e10, continuation0);
    }
}

