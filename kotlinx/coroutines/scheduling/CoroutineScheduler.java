package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.c;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0003CDEB+\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BJ)\u0010\u0011\u001A\u00020\u00102\n\u0010\r\u001A\u00060\fR\u00020\u00002\u0006\u0010\u000E\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001A\u00020\u00132\n\u0010\r\u001A\u00060\fR\u00020\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001A\u00020\u00032\u0006\u0010\u0016\u001A\u00020\u0006H\u0086\b\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001B\u0010\u001C\u001A\u00020\u00102\n\u0010\u001B\u001A\u00060\u0019j\u0002`\u001AH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0015\u0010!\u001A\u00020\u00102\u0006\u0010 \u001A\u00020\u0006\u00A2\u0006\u0004\b!\u0010\"J-\u0010\'\u001A\u00020\u00102\n\u0010#\u001A\u00060\u0019j\u0002`\u001A2\b\b\u0002\u0010%\u001A\u00020$2\b\b\u0002\u0010&\u001A\u00020\u0013\u00A2\u0006\u0004\b\'\u0010(J!\u0010*\u001A\u00020)2\n\u0010#\u001A\u00060\u0019j\u0002`\u001A2\u0006\u0010%\u001A\u00020$\u00A2\u0006\u0004\b*\u0010+J\r\u0010,\u001A\u00020\u0010\u00A2\u0006\u0004\b,\u0010\u001FJ\u000F\u0010-\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b-\u0010.J\u0015\u00100\u001A\u00020\u00102\u0006\u0010/\u001A\u00020)\u00A2\u0006\u0004\b0\u00101R\u0014\u0010\u0004\u001A\u00020\u00038\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0004\u00102R\u0014\u0010\u0005\u001A\u00020\u00038\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001A\u00020\u00068\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001A\u00020\b8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\t\u00104R\u0014\u00106\u001A\u0002058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001A\u0002058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b8\u00107R\u001E\u0010:\u001A\f\u0012\b\u0012\u00060\fR\u00020\u0000098\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b:\u0010;R\u0011\u0010<\u001A\u00020\u00138F\u00A2\u0006\u0006\u001A\u0004\b<\u0010=R\u000B\u0010?\u001A\u00020>8\u0002X\u0082\u0004R\u000B\u0010A\u001A\u00020@8\u0002X\u0082\u0004R\u000B\u0010B\u001A\u00020@8\u0002X\u0082\u0004\u00A8\u0006F"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "worker", "oldIndex", "newIndex", "", "parkedWorkersStackTopUpdate", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V", "", "parkedWorkersStackPush", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)Z", "state", "availableCpuPermits", "(J)I", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "shutdown", "(J)V", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "tailDispatch", "dispatch", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "Lkotlinx/coroutines/scheduling/Task;", "createTask", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;", "signalCpuWork", "toString", "()Ljava/lang/String;", "task", "runSafely", "(Lkotlinx/coroutines/scheduling/Task;)V", "I", "J", "Ljava/lang/String;", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "isTerminated", "()Z", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "Lkotlinx/atomicfu/AtomicLong;", "controlState", "parkedWorkersStack", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 7 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1033:1\n285#1:1036\n283#1:1037\n283#1:1038\n285#1:1039\n280#1:1045\n281#1,5:1046\n291#1:1052\n283#1:1053\n284#1:1054\n283#1:1060\n284#1:1061\n280#1:1062\n288#1:1063\n283#1:1064\n283#1:1067\n284#1:1068\n285#1:1069\n93#2:1034\n93#2:1051\n1#3:1035\n28#4,4:1040\n28#4,4:1055\n20#5:1044\n20#5:1059\n90#6:1065\n610#7:1066\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n281#1:1036\n288#1:1037\n289#1:1038\n298#1:1039\n347#1:1045\n375#1:1046,5\n398#1:1052\n445#1:1053\n446#1:1054\n482#1:1060\n483#1:1061\n489#1:1062\n498#1:1063\n498#1:1064\n576#1:1067\n577#1:1068\n578#1:1069\n119#1:1034\n395#1:1051\n347#1:1040,4\n478#1:1055,4\n347#1:1044\n478#1:1059\n515#1:1065\n522#1:1066\n*E\n"})
public final class CoroutineScheduler implements Closeable, Executor {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000B\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001A\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000F\u001A\u00020\u000E8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0011\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lkotlinx/coroutines/internal/Symbol;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[WorkerState.values().length];
            try {
                arr_v[WorkerState.PARKING.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[WorkerState.BLOCKING.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[WorkerState.DORMANT.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[WorkerState.TERMINATED.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001A\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001A\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u001A\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00028\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u0014\u0010!\u001A\u00020 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001A\u00020\u00068\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010&\u001A\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010\u0016\u001A\u00020\b8\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b\u0016\u0010,R\u0012\u00100\u001A\u00020-8Æ\u0002¢\u0006\u0006\u001A\u0004\b.\u0010/R\b\u00102\u001A\u0002018\u0006¨\u00063"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "", "index", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "", "tryReleaseCpu", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "", "run", "()V", "", "runSingleTask", "()J", "isIo", "()Z", "upperBound", "nextInt", "(I)I", "mayHaveLocalTasks", "Lkotlinx/coroutines/scheduling/Task;", "findTask", "(Z)Lkotlinx/coroutines/scheduling/Task;", "indexInArray", "I", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "Lkotlinx/coroutines/scheduling/WorkQueue;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "nextParkedWorker", "Ljava/lang/Object;", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "Z", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "scheduler", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1033:1\n298#2:1034\n285#2:1035\n299#2,4:1036\n304#2:1040\n294#2,2:1041\n294#2,2:1045\n280#2:1052\n289#2:1053\n283#2:1054\n280#2:1055\n1#3:1043\n90#4:1044\n28#5,4:1047\n20#6:1051\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n665#1:1034\n665#1:1035\n665#1:1036,4\n679#1:1040\n753#1:1041,2\n807#1:1045,2\n855#1:1052\n881#1:1053\n881#1:1054\n963#1:1055\n790#1:1044\n851#1:1047,4\n851#1:1051\n*E\n"})
    public final class Worker extends Thread {
        public final ObjectRef a;
        public long b;
        public long c;
        public int d;
        public final CoroutineScheduler e;
        public static final AtomicIntegerFieldUpdater f;
        private volatile int indexInArray;
        @JvmField
        @NotNull
        public final WorkQueue localQueue;
        @JvmField
        public boolean mayHaveLocalTasks;
        @Nullable
        private volatile Object nextParkedWorker;
        @JvmField
        @NotNull
        public WorkerState state;
        @Volatile
        private volatile int workerCtl;

        static {
            Worker.f = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl");
        }

        public Worker(int v) {
            this.setDaemon(true);
            this.localQueue = new WorkQueue();
            this.a = new ObjectRef();
            this.state = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
            this.d = Random.Default.nextInt();
            this.setIndexInArray(v);
        }

        public final Task a() {
            int v = this.nextInt(2);
            CoroutineScheduler coroutineScheduler0 = CoroutineScheduler.this;
            if(v == 0) {
                Task task0 = (Task)coroutineScheduler0.globalCpuQueue.removeFirstOrNull();
                return task0 == null ? ((Task)coroutineScheduler0.globalBlockingQueue.removeFirstOrNull()) : task0;
            }
            Task task1 = (Task)coroutineScheduler0.globalBlockingQueue.removeFirstOrNull();
            return task1 == null ? ((Task)coroutineScheduler0.globalCpuQueue.removeFirstOrNull()) : task1;
        }

        public final Task b(int v) {
            CoroutineScheduler coroutineScheduler0 = CoroutineScheduler.this;
            long v1 = CoroutineScheduler.b.get(coroutineScheduler0);
            if(((int)(v1 & 0x1FFFFFL)) < 2) {
                return null;
            }
            int v2 = this.nextInt(((int)(v1 & 0x1FFFFFL)));
            long v4 = 0x7FFFFFFFFFFFFFFFL;
            for(int v3 = 0; v3 < ((int)(v1 & 0x1FFFFFL)); ++v3) {
                ++v2;
                v2 = v2 <= ((int)(v1 & 0x1FFFFFL)) ? v2 + 1 : 1;
                Worker coroutineScheduler$Worker0 = (Worker)coroutineScheduler0.workers.get(v2);
                if(coroutineScheduler$Worker0 != null && coroutineScheduler$Worker0 != this) {
                    ObjectRef ref$ObjectRef0 = this.a;
                    long v5 = coroutineScheduler$Worker0.localQueue.trySteal(v, ref$ObjectRef0);
                    if(v5 == -1L) {
                        Task task0 = (Task)ref$ObjectRef0.element;
                        ref$ObjectRef0.element = null;
                        return task0;
                    }
                    if(v5 > 0L) {
                        v4 = Math.min(v4, v5);
                    }
                }
            }
            if(v4 == 0x7FFFFFFFFFFFFFFFL) {
                v4 = 0L;
            }
            this.c = v4;
            return null;
        }

        @Nullable
        public final Task findTask(boolean z) {
            Task task1;
            boolean z1 = true;
            CoroutineScheduler coroutineScheduler0 = CoroutineScheduler.this;
            if(this.state != WorkerState.CPU_ACQUIRED) {
                AtomicLongFieldUpdater atomicLongFieldUpdater0 = CoroutineScheduler.b;
                do {
                    CoroutineScheduler coroutineScheduler1 = CoroutineScheduler.this;
                    long v = atomicLongFieldUpdater0.get(coroutineScheduler1);
                    if(((int)((0x7FFFFC0000000000L & v) >> 42)) == 0) {
                        Task task0 = this.localQueue.pollBlocking();
                        if(task0 == null) {
                            task0 = (Task)coroutineScheduler0.globalBlockingQueue.removeFirstOrNull();
                            return task0 == null ? this.b(1) : task0;
                        }
                        return task0;
                    }
                }
                while(!CoroutineScheduler.b.compareAndSet(coroutineScheduler1, v, v - 0x40000000000L));
                this.state = WorkerState.CPU_ACQUIRED;
            }
            if(z) {
                if(this.nextInt(coroutineScheduler0.corePoolSize * 2) == 0) {
                    task1 = this.a();
                    if(task1 == null) {
                    label_20:
                        task1 = this.localQueue.poll();
                        if(task1 == null) {
                            if(!z1) {
                                task1 = this.a();
                                return task1 == null ? this.b(3) : task1;
                            }
                            return this.b(3);
                        }
                    }
                }
                else {
                    z1 = false;
                    goto label_20;
                }
                return task1;
            }
            task1 = this.a();
            return task1 == null ? this.b(3) : task1;
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        @Nullable
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        @NotNull
        public final CoroutineScheduler getScheduler() {
            return CoroutineScheduler.this;
        }

        public final int getWorkerCtl() {
            return this.workerCtl;
        }

        @NotNull
        public static final AtomicIntegerFieldUpdater getWorkerCtl$FU() {
            return Worker.f;
        }

        public final boolean isIo() {
            return this.state == WorkerState.BLOCKING;
        }

        public final int nextInt(int v) {
            int v1 = this.d ^ this.d << 13;
            int v2 = v1 ^ v1 >> 17;
            int v3 = v2 ^ v2 << 5;
            this.d = v3;
            return (v - 1 & v) == 0 ? v3 & v - 1 : (v3 & 0x7FFFFFFF) % v;
        }

        @Override
        public void run() {
            CoroutineScheduler coroutineScheduler0;
            boolean z;
            do {
                do {
                    z = false;
                label_1:
                    if(CoroutineScheduler.this.isTerminated()) {
                        this.tryReleaseCpu(WorkerState.TERMINATED);
                        return;
                    }
                    WorkerState coroutineScheduler$WorkerState0 = WorkerState.TERMINATED;
                    if(this.state == coroutineScheduler$WorkerState0) {
                        this.tryReleaseCpu(WorkerState.TERMINATED);
                        return;
                    }
                    Task task0 = this.findTask(this.mayHaveLocalTasks);
                    if(task0 == null) {
                        goto label_21;
                    }
                    this.c = 0L;
                    int v = task0.taskContext.getTaskMode();
                    this.b = 0L;
                    if(this.state == WorkerState.PARKING) {
                        this.state = WorkerState.BLOCKING;
                    }
                    coroutineScheduler0 = CoroutineScheduler.this;
                    if(v != 0 && this.tryReleaseCpu(WorkerState.BLOCKING)) {
                        coroutineScheduler0.signalCpuWork();
                    }
                    coroutineScheduler0.runSafely(task0);
                }
                while(v == 0);
                CoroutineScheduler.b.addAndGet(coroutineScheduler0, 0xFFFFFFFFFFE00000L);
            }
            while(this.state == coroutineScheduler$WorkerState0);
            this.state = WorkerState.DORMANT;
            z = false;
            goto label_1;
        label_21:
            this.mayHaveLocalTasks = false;
            if(Long.compare(this.c, 0L) == 0) {
                if(this.nextParkedWorker == CoroutineScheduler.NOT_IN_STACK) {
                    CoroutineScheduler.this.parkedWorkersStackPush(this);
                }
                else {
                    Worker.f.set(this, -1);
                    while(this.nextParkedWorker != CoroutineScheduler.NOT_IN_STACK) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = Worker.f;
                        if(atomicIntegerFieldUpdater0.get(this) != -1 || CoroutineScheduler.this.isTerminated()) {
                            break;
                        }
                        WorkerState coroutineScheduler$WorkerState1 = WorkerState.TERMINATED;
                        if(this.state == coroutineScheduler$WorkerState1) {
                            break;
                        }
                        this.tryReleaseCpu(WorkerState.PARKING);
                        Thread.interrupted();
                        if(this.b == 0L) {
                            this.b = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
                        }
                        LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
                        if(System.nanoTime() - this.b >= 0L) {
                            this.b = 0L;
                            CoroutineScheduler coroutineScheduler1 = CoroutineScheduler.this;
                            ResizableAtomicArray resizableAtomicArray0 = coroutineScheduler1.workers;
                            __monitor_enter(resizableAtomicArray0);
                            try {
                                if(!coroutineScheduler1.isTerminated()) {
                                    if(((int)(CoroutineScheduler.b.get(coroutineScheduler1) & 0x1FFFFFL)) <= coroutineScheduler1.corePoolSize) {
                                    }
                                    else if(atomicIntegerFieldUpdater0.compareAndSet(this, -1, 1)) {
                                        int v1 = this.indexInArray;
                                        this.setIndexInArray(0);
                                        coroutineScheduler1.parkedWorkersStackTopUpdate(this, v1, 0);
                                        int v2 = (int)(CoroutineScheduler.b.getAndDecrement(coroutineScheduler1) & 0x1FFFFFL);
                                        if(v2 != v1) {
                                            Object object0 = coroutineScheduler1.workers.get(v2);
                                            Intrinsics.checkNotNull(object0);
                                            coroutineScheduler1.workers.setSynchronized(v1, ((Worker)object0));
                                            ((Worker)object0).setIndexInArray(v1);
                                            coroutineScheduler1.parkedWorkersStackTopUpdate(((Worker)object0), v2, v1);
                                        }
                                        coroutineScheduler1.workers.setSynchronized(v2, null);
                                        goto label_69;
                                    }
                                    else {
                                        goto label_72;
                                    }
                                    goto label_74;
                                }
                                goto label_76;
                            }
                            catch(Throwable throwable0) {
                            }
                            __monitor_exit(resizableAtomicArray0);
                            throw throwable0;
                        label_69:
                            __monitor_exit(resizableAtomicArray0);
                            this.state = coroutineScheduler$WorkerState1;
                            continue;
                        label_72:
                            __monitor_exit(resizableAtomicArray0);
                            continue;
                        label_74:
                            __monitor_exit(resizableAtomicArray0);
                            continue;
                        label_76:
                            __monitor_exit(resizableAtomicArray0);
                        }
                    }
                }
            }
            else if(z) {
                this.tryReleaseCpu(WorkerState.PARKING);
                Thread.interrupted();
                LockSupport.parkNanos(this.c);
                this.c = 0L;
                z = false;
            }
            else {
                z = true;
            }
            goto label_1;
        }

        public final long runSingleTask() {
            Task task0;
            boolean z = this.state == WorkerState.CPU_ACQUIRED;
            CoroutineScheduler coroutineScheduler0 = CoroutineScheduler.this;
            if(z) {
                task0 = this.localQueue.pollCpu();
                if(task0 == null) {
                    task0 = (Task)coroutineScheduler0.globalBlockingQueue.removeFirstOrNull();
                    if(task0 == null) {
                        task0 = this.b(2);
                    }
                }
            }
            else {
                Task task1 = this.localQueue.pollBlocking();
                if(task1 == null) {
                    task1 = (Task)coroutineScheduler0.globalBlockingQueue.removeFirstOrNull();
                    task0 = task1 == null ? this.b(1) : task1;
                }
                else {
                    task0 = task1;
                }
            }
            if(task0 == null) {
                return this.c == 0L ? -1L : this.c;
            }
            coroutineScheduler0.runSafely(task0);
            if(!z) {
                CoroutineScheduler.b.addAndGet(coroutineScheduler0, 0xFFFFFFFFFFE00000L);
            }
            return 0L;
        }

        public final void setIndexInArray(int v) {
            this.setName(CoroutineScheduler.this.schedulerName + "-worker-" + (v == 0 ? "TERMINATED" : String.valueOf(v)));
            this.indexInArray = v;
        }

        public final void setNextParkedWorker(@Nullable Object object0) {
            this.nextParkedWorker = object0;
        }

        public final boolean tryReleaseCpu(@NotNull WorkerState coroutineScheduler$WorkerState0) {
            WorkerState coroutineScheduler$WorkerState1 = this.state;
            boolean z = coroutineScheduler$WorkerState1 == WorkerState.CPU_ACQUIRED;
            if(z) {
                CoroutineScheduler.b.addAndGet(CoroutineScheduler.this, 0x40000000000L);
            }
            if(coroutineScheduler$WorkerState1 != coroutineScheduler$WorkerState0) {
                this.state = coroutineScheduler$WorkerState0;
            }
            return z;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

    }

    @NotNull
    public static final Companion Companion = null;
    public static final int MAX_SUPPORTED_POOL_SIZE = 0x1FFFFE;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
    @JvmField
    @NotNull
    public static final Symbol NOT_IN_STACK;
    @Volatile
    private volatile int _isTerminated;
    public static final AtomicLongFieldUpdater a;
    public static final AtomicLongFieldUpdater b;
    public static final AtomicIntegerFieldUpdater c;
    @Volatile
    private volatile long controlState;
    @JvmField
    public final int corePoolSize;
    @JvmField
    @NotNull
    public final GlobalQueue globalBlockingQueue;
    @JvmField
    @NotNull
    public final GlobalQueue globalCpuQueue;
    @JvmField
    public final long idleWorkerKeepAliveNs;
    @JvmField
    public final int maxPoolSize;
    @Volatile
    private volatile long parkedWorkersStack;
    @JvmField
    @NotNull
    public final String schedulerName;
    @JvmField
    @NotNull
    public final ResizableAtomicArray workers;

    static {
        CoroutineScheduler.Companion = new Companion(null);
        CoroutineScheduler.a = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
        CoroutineScheduler.b = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
        CoroutineScheduler.c = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
        CoroutineScheduler.NOT_IN_STACK = new Symbol("NOT_IN_STACK");
    }

    public CoroutineScheduler(int v, int v1, long v2, @NotNull String s) {
        this.corePoolSize = v;
        this.maxPoolSize = v1;
        this.idleWorkerKeepAliveNs = v2;
        this.schedulerName = s;
        if(v < 1) {
            throw new IllegalArgumentException(("Core pool size " + v + " should be at least 1").toString());
        }
        if(v1 < v) {
            throw new IllegalArgumentException(("Max pool size " + v1 + " should be greater than or equals to core pool size " + v).toString());
        }
        if(v1 > 0x1FFFFE) {
            throw new IllegalArgumentException(("Max pool size " + v1 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if(v2 <= 0L) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + v2 + " must be positive").toString());
        }
        this.globalCpuQueue = new GlobalQueue();
        this.globalBlockingQueue = new GlobalQueue();
        this.workers = new ResizableAtomicArray((v + 1) * 2);
        this.controlState = ((long)v) << 42;
        this._isTerminated = 0;
    }

    public CoroutineScheduler(int v, int v1, long v2, String s, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 4) != 0) {
            v2 = TasksKt.IDLE_WORKER_KEEP_ALIVE_NS;
        }
        if((v3 & 8) != 0) {
            s = "DefaultDispatcher";
        }
        this(v, v1, v2, s);
    }

    public final int a() {
        Worker coroutineScheduler$Worker0;
        int v1;
        synchronized(this.workers) {
            if(!this.isTerminated()) {
                AtomicLongFieldUpdater atomicLongFieldUpdater0 = CoroutineScheduler.b;
                long v = atomicLongFieldUpdater0.get(this);
                v1 = c.coerceAtLeast(((int)(v & 0x1FFFFFL)) - ((int)((v & 0x3FFFFE00000L) >> 21)), 0);
                if(v1 >= this.corePoolSize) {
                    return 0;
                }
                goto label_9;
            }
            return -1;
        }
        return 0;
    label_9:
        if(((int)(v & 0x1FFFFFL)) >= this.maxPoolSize) {
            return 0;
        }
        int v2 = ((int)(CoroutineScheduler.b.get(this) & 0x1FFFFFL)) + 1;
        if(v2 <= 0 || this.workers.get(v2) != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        coroutineScheduler$Worker0 = new Worker(this, v2);
        this.workers.setSynchronized(v2, coroutineScheduler$Worker0);
        if(v2 != ((int)(0x1FFFFFL & atomicLongFieldUpdater0.incrementAndGet(this)))) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        coroutineScheduler$Worker0.start();
        return v1 + 1;
    }

    public final int availableCpuPermits(long v) {
        return (int)((v & 0x7FFFFC0000000000L) >> 42);
    }

    public final boolean b(long v) {
        if(c.coerceAtLeast(((int)(0x1FFFFFL & v)) - ((int)((v & 0x3FFFFE00000L) >> 21)), 0) < this.corePoolSize) {
            int v1 = this.a();
            if(v1 == 1 && this.corePoolSize > 1) {
                this.a();
            }
            return v1 > 0;
        }
        return false;
    }

    public final boolean c() {
        int v1;
        Object object0;
    alab1:
        while(true) {
            while(true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater0 = CoroutineScheduler.a;
                long v = atomicLongFieldUpdater0.get(this);
                Worker coroutineScheduler$Worker0 = (Worker)this.workers.get(((int)(0x1FFFFFL & v)));
                if(coroutineScheduler$Worker0 == null) {
                    coroutineScheduler$Worker0 = null;
                }
                else {
                    object0 = coroutineScheduler$Worker0.getNextParkedWorker();
                label_7:
                    Symbol symbol0 = CoroutineScheduler.NOT_IN_STACK;
                    if(object0 == symbol0) {
                        v1 = -1;
                    }
                    else if(object0 == null) {
                        v1 = 0;
                    }
                    else {
                        int v2 = ((Worker)object0).getIndexInArray();
                        if(v2 == 0) {
                            break alab1;
                        }
                        else {
                            v1 = v2;
                        }
                    }
                    if(v1 >= 0 && atomicLongFieldUpdater0.compareAndSet(this, v, v + 0x200000L & 0xFFFFFFFFFFE00000L | ((long)v1))) {
                        coroutineScheduler$Worker0.setNextParkedWorker(symbol0);
                        goto label_21;
                    }
                    break;
                }
            label_21:
                if(coroutineScheduler$Worker0 == null) {
                    return false;
                }
                if(!Worker.getWorkerCtl$FU().compareAndSet(coroutineScheduler$Worker0, -1, 0)) {
                    break;
                }
                LockSupport.unpark(coroutineScheduler$Worker0);
                return true;
            }
        }
        object0 = ((Worker)object0).getNextParkedWorker();
        goto label_7;
    }

    @Override
    public void close() {
        this.shutdown(10000L);
    }

    @NotNull
    public final Task createTask(@NotNull Runnable runnable0, @NotNull TaskContext taskContext0) {
        long v = TasksKt.schedulerTimeSource.nanoTime();
        if(runnable0 instanceof Task) {
            ((Task)runnable0).submissionTime = v;
            ((Task)runnable0).taskContext = taskContext0;
            return (Task)runnable0;
        }
        return new TaskImpl(runnable0, v, taskContext0);
    }

    public final void dispatch(@NotNull Runnable runnable0, @NotNull TaskContext taskContext0, boolean z) {
        AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
        if(abstractTimeSource0 != null) {
            abstractTimeSource0.trackTask();
        }
        Task task0 = this.createTask(runnable0, taskContext0);
        boolean z1 = false;
        boolean z2 = task0.taskContext.getTaskMode() == 1;
        long v = z2 ? CoroutineScheduler.b.addAndGet(this, 0x200000L) : 0L;
        Thread thread0 = Thread.currentThread();
        Worker coroutineScheduler$Worker0 = null;
        Worker coroutineScheduler$Worker1 = thread0 instanceof Worker ? ((Worker)thread0) : null;
        if(coroutineScheduler$Worker1 != null && Intrinsics.areEqual(Worker.access$getThis$0$p(coroutineScheduler$Worker1), this)) {
            coroutineScheduler$Worker0 = coroutineScheduler$Worker1;
        }
        if(coroutineScheduler$Worker0 != null && coroutineScheduler$Worker0.state != WorkerState.TERMINATED && (task0.taskContext.getTaskMode() != 0 || coroutineScheduler$Worker0.state != WorkerState.BLOCKING)) {
            coroutineScheduler$Worker0.mayHaveLocalTasks = true;
            task0 = coroutineScheduler$Worker0.localQueue.add(task0, z);
        }
        if(task0 != null && !(task0.taskContext.getTaskMode() == 1 ? this.globalBlockingQueue.addLast(task0) : this.globalCpuQueue.addLast(task0))) {
            throw new RejectedExecutionException(a.o(new StringBuilder(), this.schedulerName, " was terminated"));
        }
        if(z && coroutineScheduler$Worker0 != null) {
            z1 = true;
        }
        if(!z2) {
            if(z1) {
                return;
            }
            this.signalCpuWork();
        }
        else if(!z1 && !this.c() && !this.b(v)) {
            this.c();
        }
    }

    public static void dispatch$default(CoroutineScheduler coroutineScheduler0, Runnable runnable0, TaskContext taskContext0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            taskContext0 = TasksKt.NonBlockingContext;
        }
        if((v & 4) != 0) {
            z = false;
        }
        coroutineScheduler0.dispatch(runnable0, taskContext0, z);
    }

    @Override
    public void execute(@NotNull Runnable runnable0) {
        CoroutineScheduler.dispatch$default(this, runnable0, null, false, 6, null);
    }

    public final boolean isTerminated() {
        return CoroutineScheduler.c.get(this) != 0;
    }

    public final boolean parkedWorkersStackPush(@NotNull Worker coroutineScheduler$Worker0) {
        if(coroutineScheduler$Worker0.getNextParkedWorker() != CoroutineScheduler.NOT_IN_STACK) {
            return false;
        }
        do {
            long v = CoroutineScheduler.a.get(this);
            coroutineScheduler$Worker0.setNextParkedWorker(this.workers.get(((int)(0x1FFFFFL & v))));
        }
        while(!CoroutineScheduler.a.compareAndSet(this, v, ((long)coroutineScheduler$Worker0.getIndexInArray()) | v + 0x200000L & 0xFFFFFFFFFFE00000L));
        return true;
    }

    public final void parkedWorkersStackTopUpdate(@NotNull Worker coroutineScheduler$Worker0, int v, int v1) {
        do {
            long v2 = CoroutineScheduler.a.get(this);
            int v3 = (int)(0x1FFFFFL & v2);
            if(v3 == v) {
                if(v1 == 0) {
                    for(Object object0 = coroutineScheduler$Worker0.getNextParkedWorker(); true; object0 = ((Worker)object0).getNextParkedWorker()) {
                        if(object0 == CoroutineScheduler.NOT_IN_STACK) {
                            v3 = -1;
                            break;
                        }
                        if(object0 == null) {
                            v3 = 0;
                            break;
                        }
                        int v4 = ((Worker)object0).getIndexInArray();
                        if(v4 != 0) {
                            v3 = v4;
                            break;
                        }
                    }
                }
                else {
                    v3 = v1;
                }
            }
        }
        while(v3 < 0 || !CoroutineScheduler.a.compareAndSet(this, v2, ((long)v3) | v2 + 0x200000L & 0xFFFFFFFFFFE00000L));
    }

    public final void runSafely(@NotNull Task task0) {
        AbstractTimeSource abstractTimeSource0;
        try {
            task0.run();
            abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
        }
        catch(Throwable throwable0) {
            try {
                Thread thread0 = Thread.currentThread();
                thread0.getUncaughtExceptionHandler().uncaughtException(thread0, throwable0);
                abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
            }
            catch(Throwable throwable1) {
                AbstractTimeSource abstractTimeSource1 = AbstractTimeSourceKt.getTimeSource();
                if(abstractTimeSource1 != null) {
                    abstractTimeSource1.unTrackTask();
                }
                throw throwable1;
            }
            if(abstractTimeSource0 != null) {
                abstractTimeSource0.unTrackTask();
                return;
            }
            return;
        }
        if(abstractTimeSource0 != null) {
            abstractTimeSource0.unTrackTask();
        }
    }

    public final void shutdown(long v) {
        Task task1;
        if(!CoroutineScheduler.c.compareAndSet(this, 0, 1)) {
            return;
        }
        Thread thread0 = Thread.currentThread();
        Worker coroutineScheduler$Worker0 = null;
        Worker coroutineScheduler$Worker1 = thread0 instanceof Worker ? ((Worker)thread0) : null;
        if(coroutineScheduler$Worker1 != null && Intrinsics.areEqual(Worker.access$getThis$0$p(coroutineScheduler$Worker1), this)) {
            coroutineScheduler$Worker0 = coroutineScheduler$Worker1;
        }
        synchronized(this.workers) {
            long v2 = CoroutineScheduler.b.get(this);
        }
        if(1 <= ((int)(v2 & 0x1FFFFFL))) {
            for(int v3 = 1; true; ++v3) {
                Object object0 = this.workers.get(v3);
                Intrinsics.checkNotNull(object0);
                Worker coroutineScheduler$Worker2 = (Worker)object0;
                if(coroutineScheduler$Worker2 != coroutineScheduler$Worker0) {
                    while(coroutineScheduler$Worker2.isAlive()) {
                        LockSupport.unpark(coroutineScheduler$Worker2);
                        coroutineScheduler$Worker2.join(v);
                    }
                    coroutineScheduler$Worker2.localQueue.offloadAllWorkTo(this.globalBlockingQueue);
                }
                if(v3 == ((int)(v2 & 0x1FFFFFL))) {
                    break;
                }
            }
        }
        this.globalBlockingQueue.close();
        this.globalCpuQueue.close();
        while(true) {
            if(coroutineScheduler$Worker0 == null) {
                Task task2 = (Task)this.globalCpuQueue.removeFirstOrNull();
                if(task2 == null) {
                    task1 = (Task)this.globalBlockingQueue.removeFirstOrNull();
                    if(task1 != null) {
                        goto label_40;
                    }
                    break;
                }
                else {
                    task1 = task2;
                }
            }
            else {
                Task task0 = coroutineScheduler$Worker0.findTask(true);
                if(task0 != null) {
                    task1 = task0;
                }
            }
        label_40:
            this.runSafely(task1);
        }
        if(coroutineScheduler$Worker0 != null) {
            coroutineScheduler$Worker0.tryReleaseCpu(WorkerState.TERMINATED);
        }
        CoroutineScheduler.a.set(this, 0L);
        CoroutineScheduler.b.set(this, 0L);
    }

    public final void signalCpuWork() {
        if(this.c()) {
            return;
        }
        if(this.b(CoroutineScheduler.b.get(this))) {
            return;
        }
        this.c();
    }

    @Override
    @NotNull
    public String toString() {
        ArrayList arrayList0 = new ArrayList();
        int v = this.workers.currentLength();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        for(int v6 = 1; v6 < v; ++v6) {
            Worker coroutineScheduler$Worker0 = (Worker)this.workers.get(v6);
            if(coroutineScheduler$Worker0 != null) {
                int v7 = coroutineScheduler$Worker0.localQueue.getSize$kotlinx_coroutines_core();
                switch(WhenMappings.$EnumSwitchMapping$0[coroutineScheduler$Worker0.state.ordinal()]) {
                    case 1: {
                        ++v3;
                        break;
                    }
                    case 2: {
                        ++v2;
                        arrayList0.add(v7 + 'b');
                        break;
                    }
                    case 3: {
                        ++v1;
                        arrayList0.add(v7 + 'c');
                        break;
                    }
                    case 4: {
                        ++v4;
                        if(v7 > 0) {
                            arrayList0.add(v7 + 'd');
                        }
                        break;
                    }
                    case 5: {
                        ++v5;
                    }
                }
            }
        }
        long v8 = CoroutineScheduler.b.get(this);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.schedulerName);
        stringBuilder0.append('@');
        stringBuilder0.append(DebugStringsKt.getHexAddress(this));
        stringBuilder0.append("[Pool Size {core = ");
        stringBuilder0.append(this.corePoolSize);
        stringBuilder0.append(", max = ");
        a.A(stringBuilder0, this.maxPoolSize, "}, Worker States {CPU = ", v1, ", blocking = ");
        a.A(stringBuilder0, v2, ", parked = ", v3, ", dormant = ");
        a.A(stringBuilder0, v4, ", terminated = ", v5, "}, running workers queues = ");
        stringBuilder0.append(arrayList0);
        stringBuilder0.append(", global CPU queue size = ");
        stringBuilder0.append(this.globalCpuQueue.getSize());
        stringBuilder0.append(", global blocking queue size = ");
        stringBuilder0.append(this.globalBlockingQueue.getSize());
        stringBuilder0.append(", Control State {created workers= ");
        stringBuilder0.append(((int)(0x1FFFFFL & v8)));
        stringBuilder0.append(", blocking tasks = ");
        stringBuilder0.append(((int)((0x3FFFFE00000L & v8) >> 21)));
        stringBuilder0.append(", CPUs acquired = ");
        stringBuilder0.append(this.corePoolSize - ((int)((0x7FFFFC0000000000L & v8) >> 42)));
        stringBuilder0.append("}]");
        return stringBuilder0.toString();
    }
}

