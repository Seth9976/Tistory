package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/CoroutinesRoom;", "", "Companion", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CoroutinesRoom {
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J7\u0010\t\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJA\u0010\t\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\rJL\u0010\u0013\u001A\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00120\u0011\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "R", "Landroidx/room/RoomDatabase;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "execute", "(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "tableNames", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/jvm/JvmSuppressWildcards;", "createFlow", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lkotlinx/coroutines/flow/Flow;", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCoroutinesRoom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoom$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n*S KotlinDebug\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoom$Companion\n*L\n84#1:163,11\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final Flow createFlow(@NotNull RoomDatabase roomDatabase0, boolean z, @NotNull String[] arr_s, @NotNull Callable callable0) {
            return FlowKt.flow(new n0(z, roomDatabase0, arr_s, callable0, null));
        }

        @JvmStatic
        @Nullable
        public final Object execute(@NotNull RoomDatabase roomDatabase0, boolean z, @Nullable CancellationSignal cancellationSignal0, @NotNull Callable callable0, @NotNull Continuation continuation0) {
            ContinuationInterceptor continuationInterceptor0;
            if(roomDatabase0.isOpenInternal() && roomDatabase0.inTransaction()) {
                return callable0.call();
            }
            TransactionElement transactionElement0 = (TransactionElement)continuation0.getContext().get(TransactionElement.Key);
            if(transactionElement0 == null) {
                continuationInterceptor0 = z ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase0) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase0);
            }
            else {
                continuationInterceptor0 = transactionElement0.getTransactionDispatcher$room_ktx_release();
                if(continuationInterceptor0 == null) {
                    continuationInterceptor0 = z ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase0) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase0);
                }
            }
            CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
            cancellableContinuationImpl0.initCancellability();
            q0 q00 = new q0(callable0, cancellableContinuationImpl0, null);
            cancellableContinuationImpl0.invokeOnCancellation(new p0(cancellationSignal0, BuildersKt.launch$default(GlobalScope.INSTANCE, continuationInterceptor0, null, q00, 2, null)));
            Object object0 = cancellableContinuationImpl0.getResult();
            if(object0 == a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation0);
            }
            return object0;
        }

        @JvmStatic
        @Nullable
        public final Object execute(@NotNull RoomDatabase roomDatabase0, boolean z, @NotNull Callable callable0, @NotNull Continuation continuation0) {
            if(roomDatabase0.isOpenInternal() && roomDatabase0.inTransaction()) {
                return callable0.call();
            }
            TransactionElement transactionElement0 = (TransactionElement)continuation0.getContext().get(TransactionElement.Key);
            if(transactionElement0 != null) {
                ContinuationInterceptor continuationInterceptor0 = transactionElement0.getTransactionDispatcher$room_ktx_release();
                if(continuationInterceptor0 != null) {
                    return BuildersKt.withContext(continuationInterceptor0, new o0(callable0, null), continuation0);
                }
            }
            return z ? BuildersKt.withContext(CoroutinesRoomKt.getTransactionDispatcher(roomDatabase0), new o0(callable0, null), continuation0) : BuildersKt.withContext(CoroutinesRoomKt.getQueryDispatcher(roomDatabase0), new o0(callable0, null), continuation0);
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        CoroutinesRoom.Companion = new Companion(null);
    }

    @JvmStatic
    @NotNull
    public static final Flow createFlow(@NotNull RoomDatabase roomDatabase0, boolean z, @NotNull String[] arr_s, @NotNull Callable callable0) {
        return CoroutinesRoom.Companion.createFlow(roomDatabase0, z, arr_s, callable0);
    }

    @JvmStatic
    @Nullable
    public static final Object execute(@NotNull RoomDatabase roomDatabase0, boolean z, @Nullable CancellationSignal cancellationSignal0, @NotNull Callable callable0, @NotNull Continuation continuation0) {
        return CoroutinesRoom.Companion.execute(roomDatabase0, z, cancellationSignal0, callable0, continuation0);
    }

    @JvmStatic
    @Nullable
    public static final Object execute(@NotNull RoomDatabase roomDatabase0, boolean z, @NotNull Callable callable0, @NotNull Continuation continuation0) {
        return CoroutinesRoom.Companion.execute(roomDatabase0, z, callable0, continuation0);
    }
}

