package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause0Impl;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectInstance;
import md.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import sf.a0;
import sf.b0;
import sf.c0;
import sf.d0;
import sf.e0;
import sf.f0;
import sf.i0;
import sf.j0;
import sf.s;
import sf.v;
import sf.w;
import sf.x;
import sf.y;
import sf.z;

@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000\u009A\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\n\u0088\u0001\u0089\u0001\u008A\u0001\u008B\u0001\u008C\u0001B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0001H\u0004\u00A2\u0006\u0004\b\n\u0010\u000BJ\r\u0010\f\u001A\u00020\u0004\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\tH\u0014\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0011\u0010\u0012\u001A\u00060\u0010j\u0002`\u0011\u00A2\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001A\u00060\u0010j\u0002`\u0011*\u00020\u00142\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0004\u00A2\u0006\u0004\b\u0017\u0010\u0018J6\u0010 \u001A\u00020\u001F2\'\u0010\u001E\u001A#\u0012\u0015\u0012\u0013\u0018\u00010\u0014\u00A2\u0006\f\b\u001A\u0012\b\b\u001B\u0012\u0004\b\b(\u001C\u0012\u0004\u0012\u00020\t0\u0019j\u0002`\u001D\u00A2\u0006\u0004\b \u0010!JF\u0010 \u001A\u00020\u001F2\u0006\u0010\"\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\u00042\'\u0010\u001E\u001A#\u0012\u0015\u0012\u0013\u0018\u00010\u0014\u00A2\u0006\f\b\u001A\u0012\b\b\u001B\u0012\u0004\b\b(\u001C\u0012\u0004\u0012\u00020\t0\u0019j\u0002`\u001D\u00A2\u0006\u0004\b \u0010$J\u0013\u0010%\u001A\u00020\tH\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J\u0017\u0010+\u001A\u00020\t2\u0006\u0010(\u001A\u00020\'H\u0000\u00A2\u0006\u0004\b)\u0010*J\u001F\u0010,\u001A\u00020\t2\u000E\u0010\u001C\u001A\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0016\u00A2\u0006\u0004\b,\u0010-J\u000F\u0010.\u001A\u00020\u0015H\u0014\u00A2\u0006\u0004\b.\u0010/J\u0019\u0010,\u001A\u00020\u00042\b\u0010\u001C\u001A\u0004\u0018\u00010\u0014H\u0017\u00A2\u0006\u0004\b,\u00100J\u0017\u00101\u001A\u00020\t2\u0006\u0010\u001C\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b1\u00102J\u0015\u00104\u001A\u00020\t2\u0006\u00103\u001A\u00020\u0003\u00A2\u0006\u0004\b4\u00105J\u0017\u00106\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b6\u00100J\u0017\u00107\u001A\u00020\u00042\b\u0010\u001C\u001A\u0004\u0018\u00010\u0014\u00A2\u0006\u0004\b7\u00100J\u0019\u0010;\u001A\u00020\u00042\b\u0010\u001C\u001A\u0004\u0018\u000108H\u0000\u00A2\u0006\u0004\b9\u0010:J(\u0010?\u001A\u00020<2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u0014H\u0080\b\u00A2\u0006\u0004\b=\u0010>J\u0013\u0010@\u001A\u00060\u0010j\u0002`\u0011H\u0016\u00A2\u0006\u0004\b@\u0010\u0013J\u0019\u0010C\u001A\u00020\u00042\b\u0010A\u001A\u0004\u0018\u000108H\u0000\u00A2\u0006\u0004\bB\u0010:J\u001B\u0010F\u001A\u0004\u0018\u0001082\b\u0010A\u001A\u0004\u0018\u000108H\u0000\u00A2\u0006\u0004\bD\u0010EJ\u0015\u0010I\u001A\u00020H2\u0006\u0010G\u001A\u00020\u0002\u00A2\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001A\u00020\t2\u0006\u0010K\u001A\u00020\u0014H\u0010\u00A2\u0006\u0004\bL\u00102J\u0019\u0010\"\u001A\u00020\t2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0014H\u0014\u00A2\u0006\u0004\b\"\u00102J\u0017\u0010N\u001A\u00020\u00042\u0006\u0010K\u001A\u00020\u0014H\u0014\u00A2\u0006\u0004\bN\u00100J\u0019\u0010P\u001A\u00020\t2\b\u0010O\u001A\u0004\u0018\u000108H\u0014\u00A2\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001A\u00020\t2\b\u0010O\u001A\u0004\u0018\u000108H\u0014\u00A2\u0006\u0004\bR\u0010QJ\u000F\u0010S\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\bS\u0010/J\u000F\u0010T\u001A\u00020\u0015H\u0007\u00A2\u0006\u0004\bT\u0010/J\u000F\u0010V\u001A\u00020\u0015H\u0010\u00A2\u0006\u0004\bU\u0010/J\u000F\u0010W\u001A\u0004\u0018\u00010\u0014\u00A2\u0006\u0004\bW\u0010XJ\u0011\u0010[\u001A\u0004\u0018\u000108H\u0000\u00A2\u0006\u0004\bY\u0010ZJ\u0015\u0010\\\u001A\u0004\u0018\u000108H\u0084@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\\\u0010&R\u0015\u0010`\u001A\u0006\u0012\u0002\b\u00030]8F\u00A2\u0006\u0006\u001A\u0004\b^\u0010_R(\u0010f\u001A\u0004\u0018\u00010H2\b\u0010a\u001A\u0004\u0018\u00010H8@@@X\u0080\u000E\u00A2\u0006\f\u001A\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0016\u0010\b\u001A\u0004\u0018\u00010\u00018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bg\u0010hR\u0016\u0010O\u001A\u0004\u0018\u0001088@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bi\u0010ZR\u0014\u0010j\u001A\u00020\u00048VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bj\u0010\rR\u0011\u0010k\u001A\u00020\u00048F\u00A2\u0006\u0006\u001A\u0004\bk\u0010\rR\u0011\u0010l\u001A\u00020\u00048F\u00A2\u0006\u0006\u001A\u0004\bl\u0010\rR\u0016\u0010n\u001A\u0004\u0018\u00010\u00148DX\u0084\u0004\u00A2\u0006\u0006\u001A\u0004\bm\u0010XR\u0014\u0010p\u001A\u00020\u00048DX\u0084\u0004\u00A2\u0006\u0006\u001A\u0004\bo\u0010\rR\u0017\u0010u\u001A\u00020q8F\u00A2\u0006\f\u0012\u0004\bt\u0010\u000F\u001A\u0004\br\u0010sR\u0014\u0010w\u001A\u00020\u00048PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\bv\u0010\rR\u0017\u0010{\u001A\b\u0012\u0004\u0012\u00020\u00010x8F\u00A2\u0006\u0006\u001A\u0004\by\u0010zR\u0014\u0010|\u001A\u00020\u00048TX\u0094\u0004\u00A2\u0006\u0006\u001A\u0004\b|\u0010\rR\u0014\u0010~\u001A\u00020\u00048PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\b}\u0010\rR\u0011\u0010\u007F\u001A\u00020\u00048F\u00A2\u0006\u0006\u001A\u0004\b\u007F\u0010\rR#\u0010\u0084\u0001\u001A\u0007\u0012\u0002\b\u00030\u0080\u00018DX\u0084\u0004\u00A2\u0006\u000F\u0012\u0005\b\u0083\u0001\u0010\u000F\u001A\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0015\u0010\u0086\u0001\u001A\u000B\u0012\u0006\u0012\u0004\u0018\u00010H0\u0085\u00018\u0002X\u0082\u0004R\u0015\u0010\u0087\u0001\u001A\u000B\u0012\u0006\u0012\u0004\u0018\u0001080\u0085\u00018\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006\u008D\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "", "active", "<init>", "(Z)V", "parent", "", "initParentJob", "(Lkotlinx/coroutines/Job;)V", "start", "()Z", "onStart", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "", "", "message", "toCancellationException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/JobNode;", "node", "removeNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/JobNode;)V", "removeNode", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "cancellationExceptionMessage", "()Ljava/lang/String;", "(Ljava/lang/Throwable;)Z", "cancelInternal", "(Ljava/lang/Throwable;)V", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "childCancelled", "cancelCoroutine", "", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException", "getChildJobCancellationCause", "proposedUpdate", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "makeCompletingOnce", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "exception", "handleOnCompletionException$kotlinx_coroutines_core", "handleOnCompletionException", "handleJobException", "state", "onCompletionInternal", "(Ljava/lang/Object;)V", "afterCompletion", "toString", "toDebugString", "nameString$kotlinx_coroutines_core", "nameString", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "awaitInternal", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "value", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parentHandle", "getParent", "()Lkotlinx/coroutines/Job;", "getState$kotlinx_coroutines_core", "isActive", "isCompleted", "isCancelled", "getCompletionCause", "completionCause", "getCompletionCauseHandled", "completionCauseHandled", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin$annotations", "onJoin", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "isScopedCoroutine", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isCompletedExceptionally", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwaitInternal", "()Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwaitInternal$annotations", "onAwaitInternal", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "sf/x", "sf/y", "sf/z", "sf/a0", "sf/b0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 9 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 10 CompletionHandler.common.kt\nkotlinx/coroutines/CompletionHandler_commonKt\n+ 11 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 12 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 13 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1454:1\n706#1,2:1461\n367#1,2:1471\n369#1,4:1476\n373#1,4:1482\n377#1,2:1489\n367#1,2:1491\n369#1,4:1496\n373#1,4:1502\n377#1,2:1509\n178#1,2:1518\n707#1:1520\n178#1,2:1521\n178#1,2:1540\n178#1,2:1555\n706#1,2:1557\n706#1,2:1559\n178#1,2:1561\n706#1,2:1563\n178#1,2:1565\n178#1,2:1572\n178#1,2:1574\n1#2:1455\n1#2:1480\n1#2:1500\n28#3,4:1456\n28#3,4:1523\n28#3,4:1567\n28#3,4:1576\n20#4:1460\n20#4:1527\n20#4:1571\n20#4:1580\n288#5,2:1463\n288#5,2:1465\n19#6:1467\n163#7:1468\n163#7:1469\n153#7,4:1583\n75#8:1470\n75#8:1481\n75#8:1501\n75#8:1514\n341#9,3:1473\n344#9,3:1486\n341#9,3:1493\n344#9,3:1506\n341#9,3:1511\n344#9,3:1515\n47#10:1528\n22#11:1529\n22#11:1530\n13#11:1551\n13#11:1554\n13#11:1581\n13#11:1582\n13#11:1587\n13#11:1588\n134#12:1531\n73#12,3:1532\n135#12,5:1535\n314#13,9:1542\n323#13,2:1552\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n250#1:1461,2\n332#1:1471,2\n332#1:1476,4\n332#1:1482,4\n332#1:1489,2\n364#1:1491,2\n364#1:1496,4\n364#1:1502,4\n364#1:1509,2\n381#1:1518,2\n426#1:1520\n461#1:1521,2\n553#1:1540,2\n594#1:1555,2\n621#1:1557,2\n630#1:1559,2\n694#1:1561,2\n723#1:1563,2\n736#1:1565,2\n809#1:1572,2\n831#1:1574,2\n332#1:1480\n364#1:1500\n213#1:1456,4\n478#1:1523,4\n739#1:1567,4\n884#1:1576,4\n213#1:1460\n478#1:1527\n739#1:1571\n884#1:1580\n261#1:1463,2\n265#1:1465,2\n273#1:1467\n279#1:1468\n281#1:1469\n1218#1:1583,4\n284#1:1470\n332#1:1481\n364#1:1501\n372#1:1514\n332#1:1473,3\n332#1:1486,3\n364#1:1493,3\n364#1:1506,3\n368#1:1511,3\n368#1:1515,3\n483#1:1528\n495#1:1529\n505#1:1530\n561#1:1551\n577#1:1554\n924#1:1581\n974#1:1582\n1237#1:1587\n1259#1:1588\n526#1:1531\n526#1:1532,3\n526#1:1535,5\n559#1:1542,9\n559#1:1552,2\n*E\n"})
public class JobSupport implements ChildJob, Job, ParentJob {
    @Volatile
    @Nullable
    private volatile Object _parentHandle;
    @Volatile
    @Nullable
    private volatile Object _state;
    public static final AtomicReferenceFieldUpdater a;
    public static final AtomicReferenceFieldUpdater b;

    static {
        JobSupport.a = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
        JobSupport.b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle");
    }

    public JobSupport(boolean z) {
        this._state = z ? JobSupportKt.access$getEMPTY_ACTIVE$p() : JobSupportKt.access$getEMPTY_NEW$p();
    }

    public final Object a(Continuation continuation0) {
        x x0 = new x(this, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0));
        x0.initCancellability();
        CancellableContinuationKt.disposeOnCancellation(x0, this.invokeOnCompletion(new i0(x0)));
        Object object0 = x0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    public static final Object access$awaitSuspend(JobSupport jobSupport0, Continuation continuation0) {
        return jobSupport0.a(continuation0);
    }

    // 去混淆评级： 低(20)
    public static final String access$cancellationExceptionMessage(JobSupport jobSupport0) {
        return "Job was cancelled";
    }

    public static final void access$continueCompleting(JobSupport jobSupport0, z z0, ChildHandleNode childHandleNode0, Object object0) {
        jobSupport0.getClass();
        ChildHandleNode childHandleNode1 = JobSupport.i(childHandleNode0);
        if(childHandleNode1 != null) {
            while(true) {
                y y0 = new y(jobSupport0, z0, childHandleNode1, object0);
                if(DefaultImpls.invokeOnCompletion$default(childHandleNode1.childJob, false, false, y0, 1, null) != NonDisposableHandle.INSTANCE) {
                    return;
                }
                childHandleNode1 = JobSupport.i(childHandleNode1);
                if(childHandleNode1 == null) {
                    break;
                }
            }
        }
        jobSupport0.afterCompletion(jobSupport0.e(z0, object0));
    }

    public static final Object access$joinSuspend(JobSupport jobSupport0, Continuation continuation0) {
        return jobSupport0.h(continuation0);
    }

    public static final Object access$onAwaitInternalProcessResFunc(JobSupport jobSupport0, Object object0, Object object1) {
        jobSupport0.getClass();
        if(object1 instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally)object1).cause;
        }
        return object1;
    }

    public static final void access$onAwaitInternalRegFunc(JobSupport jobSupport0, SelectInstance selectInstance0, Object object0) {
        do {
            Object object1 = jobSupport0.getState$kotlinx_coroutines_core();
            if(!(object1 instanceof Incomplete)) {
                if(!(object1 instanceof CompletedExceptionally)) {
                    object1 = JobSupportKt.unboxState(object1);
                }
                selectInstance0.selectInRegistrationPhase(object1);
                return;
            }
        }
        while(jobSupport0.k(object1) < 0);
        selectInstance0.disposeOnCompletion(jobSupport0.invokeOnCompletion(new a0(jobSupport0, selectInstance0)));
    }

    public static final void access$registerSelectForOnJoin(JobSupport jobSupport0, SelectInstance selectInstance0, Object object0) {
        do {
            Object object1 = jobSupport0.getState$kotlinx_coroutines_core();
            if(!(object1 instanceof Incomplete)) {
                selectInstance0.selectInRegistrationPhase(Unit.INSTANCE);
                return;
            }
        }
        while(jobSupport0.k(object1) < 0);
        selectInstance0.disposeOnCompletion(jobSupport0.invokeOnCompletion(new b0(jobSupport0, selectInstance0)));
    }

    public void afterCompletion(@Nullable Object object0) {
    }

    @Override  // kotlinx.coroutines.Job
    @NotNull
    public final ChildHandle attachChild(@NotNull ChildJob childJob0) {
        DisposableHandle disposableHandle0 = DefaultImpls.invokeOnCompletion$default(this, true, false, new ChildHandleNode(childJob0), 2, null);
        Intrinsics.checkNotNull(disposableHandle0, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (ChildHandle)disposableHandle0;
    }

    @Nullable
    public final Object awaitInternal(@NotNull Continuation continuation0) {
        do {
            Object object0 = this.getState$kotlinx_coroutines_core();
            if(!(object0 instanceof Incomplete)) {
                if(object0 instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally)object0).cause;
                }
                return JobSupportKt.unboxState(object0);
            }
        }
        while(this.k(object0) < 0);
        return this.a(continuation0);
    }

    public final boolean b(Throwable throwable0) {
        if(this.isScopedCoroutine()) {
            return true;
        }
        ChildHandle childHandle0 = this.getParentHandle$kotlinx_coroutines_core();
        return childHandle0 == null || childHandle0 == NonDisposableHandle.INSTANCE ? throwable0 instanceof CancellationException : childHandle0.childCancelled(throwable0) || throwable0 instanceof CancellationException;
    }

    public final void c(Incomplete incomplete0, Object object0) {
        ChildHandle childHandle0 = this.getParentHandle$kotlinx_coroutines_core();
        if(childHandle0 != null) {
            childHandle0.dispose();
            this.setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        }
        Throwable throwable0 = null;
        CompletedExceptionally completedExceptionally0 = object0 instanceof CompletedExceptionally ? ((CompletedExceptionally)object0) : null;
        Throwable throwable1 = completedExceptionally0 == null ? null : completedExceptionally0.cause;
        if(incomplete0 instanceof JobNode) {
            try {
                ((JobNode)incomplete0).invoke(throwable1);
            }
            catch(Throwable throwable2) {
                this.handleOnCompletionException$kotlinx_coroutines_core(new CompletionHandlerException("Exception in completion handler " + incomplete0 + " for " + this, throwable2));
            }
            return;
        }
        NodeList nodeList0 = incomplete0.getList();
        if(nodeList0 != null) {
            Object object1 = nodeList0.getNext();
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for(LockFreeLinkedListNode lockFreeLinkedListNode0 = (LockFreeLinkedListNode)object1; !Intrinsics.areEqual(lockFreeLinkedListNode0, nodeList0); lockFreeLinkedListNode0 = lockFreeLinkedListNode0.getNextNode()) {
                if(lockFreeLinkedListNode0 instanceof JobNode) {
                    JobNode jobNode0 = (JobNode)lockFreeLinkedListNode0;
                    try {
                        jobNode0.invoke(throwable1);
                    }
                    catch(Throwable throwable3) {
                        if(throwable0 == null) {
                            throwable0 = new CompletionHandlerException("Exception in completion handler " + jobNode0 + " for " + this, throwable3);
                        }
                        else {
                            b.addSuppressed(throwable0, throwable3);
                        }
                    }
                }
            }
            if(throwable0 != null) {
                this.handleOnCompletionException$kotlinx_coroutines_core(throwable0);
            }
        }
    }

    @Override  // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public void cancel() {
        DefaultImpls.cancel(this);
    }

    @Override  // kotlinx.coroutines.Job
    public void cancel(@Nullable CancellationException cancellationException0) {
        if(cancellationException0 == null) {
            cancellationException0 = new JobCancellationException(JobSupport.access$cancellationExceptionMessage(this), null, this);
        }
        this.cancelInternal(cancellationException0);
    }

    @Override  // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public boolean cancel(Throwable throwable0) {
        CancellationException cancellationException0;
        if(throwable0 == null) {
            cancellationException0 = new JobCancellationException(JobSupport.access$cancellationExceptionMessage(this), null, this);
        }
        else {
            cancellationException0 = JobSupport.toCancellationException$default(this, throwable0, null, 1, null);
            if(cancellationException0 == null) {
                cancellationException0 = new JobCancellationException(JobSupport.access$cancellationExceptionMessage(this), null, this);
            }
        }
        this.cancelInternal(cancellationException0);
        return true;
    }

    public final boolean cancelCoroutine(@Nullable Throwable throwable0) {
        return this.cancelImpl$kotlinx_coroutines_core(throwable0);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(@Nullable Object object0) {
        Object object3;
        NodeList nodeList0;
        Symbol symbol2;
        Object object2;
        Symbol symbol1;
        Symbol symbol0 = JobSupportKt.access$getCOMPLETING_ALREADY$p();
        Throwable throwable0 = null;
        if(this.getOnCancelComplete$kotlinx_coroutines_core()) {
            do {
                Object object1 = this.getState$kotlinx_coroutines_core();
                if(!(object1 instanceof Incomplete) || object1 instanceof z && ((z)object1).d()) {
                    goto label_9;
                }
                symbol1 = this.m(object1, new CompletedExceptionally(this.d(object0), false, 2, null));
            }
            while(symbol1 == JobSupportKt.access$getCOMPLETING_RETRY$p());
            symbol0 = symbol1;
            goto label_10;
        label_9:
            symbol0 = JobSupportKt.access$getCOMPLETING_ALREADY$p();
        label_10:
            if(symbol0 == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
        }
        if(symbol0 == JobSupportKt.access$getCOMPLETING_ALREADY$p()) {
            Throwable throwable1 = null;
            while(true) {
                do {
                label_14:
                    object2 = this.getState$kotlinx_coroutines_core();
                    if(object2 instanceof z) {
                        synchronized(object2) {
                            ((z)object2).getClass();
                            if(z.d.get(((z)object2)) == JobSupportKt.access$getSEALED$p()) {
                                symbol2 = JobSupportKt.access$getTOO_LATE_TO_CANCEL$p();
                                goto label_60;
                            }
                            boolean z = ((z)object2).c();
                            if(object0 != null || !z) {
                                if(throwable1 == null) {
                                    throwable1 = this.d(object0);
                                }
                                ((z)object2).a(throwable1);
                            }
                            Throwable throwable2 = ((z)object2).b();
                            if(!z) {
                                throwable0 = throwable2;
                            }
                        }
                        if(throwable0 != null) {
                            this.j(((z)object2).a, throwable0);
                        }
                        symbol2 = JobSupportKt.access$getCOMPLETING_ALREADY$p();
                        goto label_60;
                    }
                    if(!(object2 instanceof Incomplete)) {
                        goto label_59;
                    }
                    if(throwable1 == null) {
                        throwable1 = this.d(object0);
                    }
                    Incomplete incomplete0 = (Incomplete)object2;
                    if(!incomplete0.isActive()) {
                        goto label_53;
                    }
                    nodeList0 = this.g(incomplete0);
                }
                while(nodeList0 == null);
                z z1 = new z(nodeList0, throwable1);
                do {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = JobSupport.a;
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, incomplete0, z1)) {
                        this.j(nodeList0, throwable1);
                        symbol2 = JobSupportKt.access$getCOMPLETING_ALREADY$p();
                        goto label_60;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == incomplete0);
                goto label_14;
            label_53:
                object3 = this.m(object2, new CompletedExceptionally(throwable1, false, 2, null));
                if(object3 == JobSupportKt.access$getCOMPLETING_ALREADY$p()) {
                    throw new IllegalStateException(("Cannot happen in " + object2).toString());
                }
                if(object3 == JobSupportKt.access$getCOMPLETING_RETRY$p()) {
                    goto label_14;
                }
                break;
            }
            symbol0 = object3;
            goto label_61;
        label_59:
            symbol2 = JobSupportKt.access$getTOO_LATE_TO_CANCEL$p();
        label_60:
            symbol0 = symbol2;
        }
    label_61:
        if(symbol0 != JobSupportKt.access$getCOMPLETING_ALREADY$p() && symbol0 != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            if(symbol0 != JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()) {
                this.afterCompletion(symbol0);
                return true;
            }
            return false;
        }
        return true;
    }

    public void cancelInternal(@NotNull Throwable throwable0) {
        this.cancelImpl$kotlinx_coroutines_core(throwable0);
    }

    @NotNull
    public String cancellationExceptionMessage() [...] // 潜在的解密器

    // 去混淆评级： 低(40)
    public boolean childCancelled(@NotNull Throwable throwable0) {
        return throwable0 instanceof CancellationException ? true : this.cancelImpl$kotlinx_coroutines_core(throwable0) && this.getHandlesException$kotlinx_coroutines_core();
    }

    public boolean complete(Object object0) {
        return this.makeCompleting$kotlinx_coroutines_core(object0);
    }

    public final Throwable d(Object object0) {
        if((object0 == null ? true : object0 instanceof Throwable)) {
            return ((Throwable)object0) == null ? new JobCancellationException(JobSupport.access$cancellationExceptionMessage(this), null, this) : ((Throwable)object0);
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ParentJob)object0).getChildJobCancellationCause();
    }

    @NotNull
    public final JobCancellationException defaultCancellationException$kotlinx_coroutines_core(@Nullable String s, @Nullable Throwable throwable0) {
        if(s == null) {
            s = JobSupport.access$cancellationExceptionMessage(this);
        }
        return new JobCancellationException(s, throwable0, this);
    }

    public static JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(JobSupport jobSupport0, String s, Throwable throwable0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if(s == null) {
            s = JobSupport.access$cancellationExceptionMessage(jobSupport0);
        }
        return new JobCancellationException(s, throwable0, jobSupport0);
    }

    public final Object e(z z0, Object object0) {
        Throwable throwable1;
        CompletedExceptionally completedExceptionally0 = object0 instanceof CompletedExceptionally ? ((CompletedExceptionally)object0) : null;
        Throwable throwable0 = completedExceptionally0 == null ? null : completedExceptionally0.cause;
        synchronized(z0) {
            boolean z1 = z0.c();
            ArrayList arrayList0 = z0.e(throwable0);
            throwable1 = this.f(z0, arrayList0);
            if(throwable1 != null && arrayList0.size() > 1) {
                Set set0 = Collections.newSetFromMap(new IdentityHashMap(arrayList0.size()));
                for(Object object1: arrayList0) {
                    Throwable throwable2 = (Throwable)object1;
                    if(throwable2 != throwable1 && !(throwable2 instanceof CancellationException) && set0.add(throwable2)) {
                        b.addSuppressed(throwable1, throwable2);
                    }
                }
            }
        }
        if(throwable1 != null && throwable1 != throwable0) {
            object0 = new CompletedExceptionally(throwable1, false, 2, null);
        }
        if(throwable1 != null && (this.b(throwable1) || this.handleJobException(throwable1))) {
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((CompletedExceptionally)object0).makeHandled();
        }
        if(!z1) {
            this.onCancelling(throwable1);
        }
        this.onCompletionInternal(object0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = JobSupport.a;
        Object object2 = JobSupportKt.boxIncomplete(object0);
        while(!atomicReferenceFieldUpdater0.compareAndSet(this, z0, object2) && atomicReferenceFieldUpdater0.get(this) == z0) {
        }
        this.c(z0, object0);
        return object0;
    }

    public final Throwable f(z z0, ArrayList arrayList0) {
        if(arrayList0.isEmpty()) {
            return z0.c() ? new JobCancellationException(JobSupport.access$cancellationExceptionMessage(this), null, this) : null;
        }
        Object object0 = null;
        for(Object object1: arrayList0) {
            if(!(((Throwable)object1) instanceof CancellationException)) {
                object0 = object1;
                break;
            }
        }
        if(((Throwable)object0) != null) {
            return (Throwable)object0;
        }
        Throwable throwable0 = (Throwable)arrayList0.get(0);
        if(throwable0 instanceof TimeoutCancellationException) {
            for(Object object2: arrayList0) {
                if(((Throwable)object2) != throwable0 && ((Throwable)object2) instanceof TimeoutCancellationException) {
                    return ((Throwable)object2) == null ? throwable0 : ((Throwable)object2);
                }
                if(false) {
                    break;
                }
            }
            return throwable0;
        }
        return throwable0;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public Object fold(Object object0, @NotNull Function2 function20) {
        return DefaultImpls.fold(this, object0, function20);
    }

    public final NodeList g(Incomplete incomplete0) {
        NodeList nodeList0 = incomplete0.getList();
        if(nodeList0 == null) {
            if(incomplete0 instanceof s) {
                return new NodeList();
            }
            if(!(incomplete0 instanceof JobNode)) {
                throw new IllegalStateException(("State should have list: " + incomplete0).toString());
            }
            ((JobNode)incomplete0).addOneIfEmpty(new NodeList());
            LockFreeLinkedListNode lockFreeLinkedListNode0 = ((JobNode)incomplete0).getNextNode();
            while(!JobSupport.a.compareAndSet(this, ((JobNode)incomplete0), lockFreeLinkedListNode0) && JobSupport.a.get(this) == ((JobNode)incomplete0)) {
            }
            return null;
        }
        return nodeList0;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @Nullable
    public Element get(@NotNull Key coroutineContext$Key0) {
        return DefaultImpls.get(this, coroutineContext$Key0);
    }

    @Override  // kotlinx.coroutines.Job
    @NotNull
    public final CancellationException getCancellationException() {
        Object object0 = this.getState$kotlinx_coroutines_core();
        if(object0 instanceof z) {
            Throwable throwable0 = ((z)object0).b();
            if(throwable0 != null) {
                CancellationException cancellationException0 = this.toCancellationException(throwable0, DebugStringsKt.getClassSimpleName(this) + " is cancelling");
                if(cancellationException0 != null) {
                    return cancellationException0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if(object0 instanceof Incomplete) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        return object0 instanceof CompletedExceptionally ? JobSupport.toCancellationException$default(this, ((CompletedExceptionally)object0).cause, null, 1, null) : new JobCancellationException(DebugStringsKt.getClassSimpleName(this) + " has completed normally", null, this);
    }

    @Override  // kotlinx.coroutines.ParentJob
    @NotNull
    public CancellationException getChildJobCancellationCause() {
        Throwable throwable0;
        Object object0 = this.getState$kotlinx_coroutines_core();
        CancellationException cancellationException0 = null;
        if(object0 instanceof z) {
            throwable0 = ((z)object0).b();
        }
        else if(object0 instanceof CompletedExceptionally) {
            throwable0 = ((CompletedExceptionally)object0).cause;
        }
        else if(!(object0 instanceof Incomplete)) {
            throwable0 = null;
        }
        else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + object0).toString());
        }
        if(throwable0 instanceof CancellationException) {
            cancellationException0 = (CancellationException)throwable0;
        }
        return cancellationException0 == null ? new JobCancellationException("Parent job is " + JobSupport.l(object0), throwable0, this) : cancellationException0;
    }

    @Override  // kotlinx.coroutines.Job
    @NotNull
    public final Sequence getChildren() {
        return SequencesKt__SequenceBuilderKt.sequence(new c0(this, null));
    }

    public Object getCompleted() {
        return this.getCompletedInternal$kotlinx_coroutines_core();
    }

    @Nullable
    public final Object getCompletedInternal$kotlinx_coroutines_core() {
        Object object0 = this.getState$kotlinx_coroutines_core();
        if(object0 instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if(object0 instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally)object0).cause;
        }
        return JobSupportKt.unboxState(object0);
    }

    @Nullable
    public final Throwable getCompletionCause() {
        Object object0 = this.getState$kotlinx_coroutines_core();
        if(object0 instanceof z) {
            Throwable throwable0 = ((z)object0).b();
            if(throwable0 == null) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            return throwable0;
        }
        if(object0 instanceof Incomplete) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        return object0 instanceof CompletedExceptionally ? ((CompletedExceptionally)object0).cause : null;
    }

    public final boolean getCompletionCauseHandled() {
        Object object0 = this.getState$kotlinx_coroutines_core();
        return object0 instanceof CompletedExceptionally && ((CompletedExceptionally)object0).getHandled();
    }

    @Nullable
    public final Throwable getCompletionExceptionOrNull() {
        Object object0 = this.getState$kotlinx_coroutines_core();
        if(object0 instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        CompletedExceptionally completedExceptionally0 = object0 instanceof CompletedExceptionally ? ((CompletedExceptionally)object0) : null;
        return completedExceptionally0 == null ? null : completedExceptionally0.cause;
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    public final Key getKey() {
        return Job.Key;
    }

    @NotNull
    public final SelectClause1 getOnAwaitInternal() {
        Intrinsics.checkNotNull(d0.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Object object0 = TypeIntrinsics.beforeCheckcastToFunctionOfArity(d0.a, 3);
        Intrinsics.checkNotNull(e0.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'param\')] kotlin.Any?, @[ParameterName(name = \'clauseResult\')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, ((Function3)object0), ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(e0.a, 3)), null, 8, null);
    }

    public static void getOnAwaitInternal$annotations() {
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    @Override  // kotlinx.coroutines.Job
    @NotNull
    public final SelectClause0 getOnJoin() {
        Intrinsics.checkNotNull(f0.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new SelectClause0Impl(this, ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(f0.a, 3)), null, 4, null);
    }

    public static void getOnJoin$annotations() {
    }

    @Override  // kotlinx.coroutines.Job
    @Nullable
    public Job getParent() {
        ChildHandle childHandle0 = this.getParentHandle$kotlinx_coroutines_core();
        return childHandle0 == null ? null : childHandle0.getParent();
    }

    @Nullable
    public final ChildHandle getParentHandle$kotlinx_coroutines_core() {
        return (ChildHandle)JobSupport.b.get(this);
    }

    @Nullable
    public final Object getState$kotlinx_coroutines_core() {
        Object object0;
        while(true) {
            object0 = JobSupport.a.get(this);
            if(!(object0 instanceof OpDescriptor)) {
                break;
            }
            ((OpDescriptor)object0).perform(this);
        }
        return object0;
    }

    public final Object h(Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl0, this.invokeOnCompletion(new j0(cancellableContinuationImpl0)));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public boolean handleJobException(@NotNull Throwable throwable0) {
        return false;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(@NotNull Throwable throwable0) {
        throw throwable0;
    }

    public static ChildHandleNode i(LockFreeLinkedListNode lockFreeLinkedListNode0) {
        while(lockFreeLinkedListNode0.isRemoved()) {
            lockFreeLinkedListNode0 = lockFreeLinkedListNode0.getPrevNode();
        }
        do {
            do {
                lockFreeLinkedListNode0 = lockFreeLinkedListNode0.getNextNode();
            }
            while(lockFreeLinkedListNode0.isRemoved());
            if(lockFreeLinkedListNode0 instanceof ChildHandleNode) {
                return (ChildHandleNode)lockFreeLinkedListNode0;
            }
        }
        while(!(lockFreeLinkedListNode0 instanceof NodeList));
        return null;
    }

    public final void initParentJob(@Nullable Job job0) {
        if(job0 == null) {
            this.setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
            return;
        }
        job0.start();
        ChildHandle childHandle0 = job0.attachChild(this);
        this.setParentHandle$kotlinx_coroutines_core(childHandle0);
        if(this.isCompleted()) {
            childHandle0.dispose();
            this.setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        }
    }

    @Override  // kotlinx.coroutines.Job
    @NotNull
    public final DisposableHandle invokeOnCompletion(@NotNull Function1 function10) {
        return this.invokeOnCompletion(false, true, function10);
    }

    @Override  // kotlinx.coroutines.Job
    @NotNull
    public final DisposableHandle invokeOnCompletion(boolean z, boolean z1, @NotNull Function1 function10) {
        Throwable throwable2;
        Object object0;
        DisposableHandle disposableHandle0;
        Throwable throwable0 = null;
        if(z) {
            disposableHandle0 = function10 instanceof JobCancellingNode ? ((JobCancellingNode)function10) : null;
            if(disposableHandle0 == null) {
                disposableHandle0 = new v(function10);
            }
        }
        else {
            disposableHandle0 = function10 instanceof JobNode ? ((JobNode)function10) : null;
            if(disposableHandle0 == null) {
                disposableHandle0 = new w(function10);
            }
        }
        ((JobNode)disposableHandle0).setJob(this);
        while(true) {
            while(true) {
            label_16:
                object0 = this.getState$kotlinx_coroutines_core();
                if(!(object0 instanceof s)) {
                    break;
                }
                s s0 = (s)object0;
                if(s0.a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = JobSupport.a;
                    do {
                        if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, disposableHandle0)) {
                            return disposableHandle0;
                        }
                    }
                    while(atomicReferenceFieldUpdater0.get(this) == object0);
                }
                else {
                    NodeList nodeList0 = new NodeList();
                    NodeList nodeList1 = s0.a ? nodeList0 : new InactiveNodeList(nodeList0);
                    while(!JobSupport.a.compareAndSet(this, s0, nodeList1) && JobSupport.a.get(this) == s0) {
                    }
                }
            }
            if(object0 instanceof Incomplete) {
                NodeList nodeList2 = ((Incomplete)object0).getList();
                if(nodeList2 == null) {
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    JobNode jobNode0 = (JobNode)object0;
                    jobNode0.addOneIfEmpty(new NodeList());
                    LockFreeLinkedListNode lockFreeLinkedListNode0 = jobNode0.getNextNode();
                label_40:
                    if(JobSupport.a.compareAndSet(this, jobNode0, lockFreeLinkedListNode0) || JobSupport.a.get(this) != jobNode0) {
                        goto label_16;
                    }
                    break;
                }
                else {
                    goto label_42;
                }
            }
            goto label_74;
        }
        goto label_40;
    label_42:
        DisposableHandle disposableHandle1 = NonDisposableHandle.INSTANCE;
        if(!z || !(object0 instanceof z)) {
            throwable2 = null;
        }
        else {
            __monitor_enter(object0);
            try {
                throwable2 = ((z)object0).b();
                if(throwable2 == null || function10 instanceof ChildHandleNode && !((z)object0).d()) {
                    JobSupport.addLastAtomic..inlined.addLastIf.1 jobSupport$addLastAtomic$$inlined$addLastIf$10 = new JobSupport.addLastAtomic..inlined.addLastIf.1(((LockFreeLinkedListNode)disposableHandle0), this, ((Incomplete)object0));
                    while(true) {
                        switch(nodeList2.getPrevNode().tryCondAddNext(((LockFreeLinkedListNode)disposableHandle0), nodeList2, jobSupport$addLastAtomic$$inlined$addLastIf$10)) {
                            case 1: {
                                goto label_53;
                            }
                            case 2: {
                                goto label_55;
                            }
                        }
                    }
                    goto label_51;
                }
                goto label_63;
            }
            catch(Throwable throwable1) {
            }
        label_51:
            __monitor_exit(object0);
            throw throwable1;
        label_53:
            boolean z2 = true;
            goto label_56;
        label_55:
            z2 = false;
        label_56:
            if(z2) {
                if(throwable2 == null) {
                    __monitor_exit(object0);
                    return disposableHandle0;
                }
                disposableHandle1 = disposableHandle0;
            }
            else {
                __monitor_exit(object0);
                goto label_16;
            }
        label_63:
            __monitor_exit(object0);
        }
        if(throwable2 != null) {
            if(z1) {
                function10.invoke(throwable2);
            }
            return disposableHandle1;
        }
        JobSupport.addLastAtomic..inlined.addLastIf.1 jobSupport$addLastAtomic$$inlined$addLastIf$11 = new JobSupport.addLastAtomic..inlined.addLastIf.1(((LockFreeLinkedListNode)disposableHandle0), this, ((Incomplete)object0));
    alab1:
        while(true) {
            switch(nodeList2.getPrevNode().tryCondAddNext(((LockFreeLinkedListNode)disposableHandle0), nodeList2, jobSupport$addLastAtomic$$inlined$addLastIf$11)) {
                case 1: {
                    break alab1;
                }
                case 2: {
                    goto label_16;
                }
            }
        }
        return disposableHandle0;
    label_74:
        if(z1) {
            CompletedExceptionally completedExceptionally0 = object0 instanceof CompletedExceptionally ? ((CompletedExceptionally)object0) : null;
            if(completedExceptionally0 != null) {
                throwable0 = completedExceptionally0.cause;
            }
            function10.invoke(throwable0);
        }
        return NonDisposableHandle.INSTANCE;
    }

    @Override  // kotlinx.coroutines.Job
    public boolean isActive() {
        Object object0 = this.getState$kotlinx_coroutines_core();
        return object0 instanceof Incomplete && ((Incomplete)object0).isActive();
    }

    @Override  // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object object0 = this.getState$kotlinx_coroutines_core();
        return object0 instanceof CompletedExceptionally || object0 instanceof z && ((z)object0).c();
    }

    @Override  // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(this.getState$kotlinx_coroutines_core() instanceof Incomplete);
    }

    public final boolean isCompletedExceptionally() {
        return this.getState$kotlinx_coroutines_core() instanceof CompletedExceptionally;
    }

    public boolean isScopedCoroutine() {
        return false;
    }

    public final void j(NodeList nodeList0, Throwable throwable0) {
        this.onCancelling(throwable0);
        Object object0 = nodeList0.getNext();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        LockFreeLinkedListNode lockFreeLinkedListNode0 = (LockFreeLinkedListNode)object0;
        Throwable throwable1 = null;
        while(!Intrinsics.areEqual(lockFreeLinkedListNode0, nodeList0)) {
            if(lockFreeLinkedListNode0 instanceof JobCancellingNode) {
                JobNode jobNode0 = (JobNode)lockFreeLinkedListNode0;
                try {
                    jobNode0.invoke(throwable0);
                }
                catch(Throwable throwable2) {
                    if(throwable1 == null) {
                        throwable1 = new CompletionHandlerException("Exception in completion handler " + jobNode0 + " for " + this, throwable2);
                    }
                    else {
                        b.addSuppressed(throwable1, throwable2);
                    }
                }
            }
            lockFreeLinkedListNode0 = lockFreeLinkedListNode0.getNextNode();
        }
        if(throwable1 != null) {
            this.handleOnCompletionException$kotlinx_coroutines_core(throwable1);
        }
        this.b(throwable0);
    }

    @Override  // kotlinx.coroutines.Job
    @Nullable
    public final Object join(@NotNull Continuation continuation0) {
        do {
            Object object0 = this.getState$kotlinx_coroutines_core();
            if(!(object0 instanceof Incomplete)) {
                JobKt.ensureActive(continuation0.getContext());
                return Unit.INSTANCE;
            }
        }
        while(this.k(object0) < 0);
        Object object1 = this.h(continuation0);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    public final int k(Object object0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = JobSupport.a;
        if(object0 instanceof s) {
            if(((s)object0).a) {
                return 0;
            }
            s s0 = JobSupportKt.access$getEMPTY_ACTIVE$p();
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, s0)) {
                    this.onStart();
                    return 1;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == object0);
            return -1;
        }
        if(object0 instanceof InactiveNodeList) {
            NodeList nodeList0 = ((InactiveNodeList)object0).getList();
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, nodeList0)) {
                    this.onStart();
                    return 1;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == object0);
            return -1;
        }
        return 0;
    }

    public static String l(Object object0) {
        if(object0 instanceof z) {
            if(((z)object0).c()) {
                return "Cancelling";
            }
            return ((z)object0).d() ? "Completing" : "Active";
        }
        if(object0 instanceof Incomplete) {
            return ((Incomplete)object0).isActive() ? "Active" : "New";
        }
        return object0 instanceof CompletedExceptionally ? "Cancelled" : "Completed";
    }

    public final Object m(Object object0, Object object1) {
        Throwable throwable0;
        ChildHandleNode childHandleNode0 = null;
        if(!(object0 instanceof Incomplete)) {
            return JobSupportKt.access$getCOMPLETING_ALREADY$p();
        }
        if((object0 instanceof s || object0 instanceof JobNode) && !(object0 instanceof ChildHandleNode) && !(object1 instanceof CompletedExceptionally)) {
            Object object2 = JobSupportKt.boxIncomplete(object1);
            do {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = JobSupport.a;
                if(atomicReferenceFieldUpdater0.compareAndSet(this, ((Incomplete)object0), object2)) {
                    this.onCancelling(null);
                    this.onCompletionInternal(object1);
                    this.c(((Incomplete)object0), object1);
                    return object1;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == ((Incomplete)object0));
            return JobSupportKt.access$getCOMPLETING_RETRY$p();
        }
        NodeList nodeList0 = this.g(((Incomplete)object0));
        if(nodeList0 == null) {
            return JobSupportKt.access$getCOMPLETING_RETRY$p();
        }
        z z0 = ((Incomplete)object0) instanceof z ? ((z)(((Incomplete)object0))) : null;
        if(z0 == null) {
            z0 = new z(nodeList0, null);
        }
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        synchronized(z0) {
            if(z0.d()) {
                return JobSupportKt.access$getCOMPLETING_ALREADY$p();
            }
            z.b.set(z0, 1);
            if(z0 != ((Incomplete)object0)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1 = JobSupport.a;
                while(!atomicReferenceFieldUpdater1.compareAndSet(this, ((Incomplete)object0), z0)) {
                    if(atomicReferenceFieldUpdater1.get(this) != ((Incomplete)object0)) {
                        return JobSupportKt.access$getCOMPLETING_RETRY$p();
                    }
                    if(false) {
                        break;
                    }
                }
            }
            boolean z1 = z0.c();
            CompletedExceptionally completedExceptionally0 = object1 instanceof CompletedExceptionally ? ((CompletedExceptionally)object1) : null;
            if(completedExceptionally0 != null) {
                z0.a(completedExceptionally0.cause);
            }
            throwable0 = z0.b();
            if(z1) {
                throwable0 = null;
            }
            ref$ObjectRef0.element = throwable0;
        }
        if(throwable0 != null) {
            this.j(nodeList0, throwable0);
        }
        ChildHandleNode childHandleNode1 = ((Incomplete)object0) instanceof ChildHandleNode ? ((ChildHandleNode)(((Incomplete)object0))) : null;
        if(childHandleNode1 == null) {
            NodeList nodeList1 = ((Incomplete)object0).getList();
            if(nodeList1 != null) {
                childHandleNode0 = JobSupport.i(nodeList1);
            }
        }
        else {
            childHandleNode0 = childHandleNode1;
        }
        if(childHandleNode0 != null) {
            while(true) {
                y y0 = new y(this, z0, childHandleNode0, object1);
                if(DefaultImpls.invokeOnCompletion$default(childHandleNode0.childJob, false, false, y0, 1, null) != NonDisposableHandle.INSTANCE) {
                    return JobSupportKt.COMPLETING_WAITING_CHILDREN;
                }
                childHandleNode0 = JobSupport.i(childHandleNode0);
                if(childHandleNode0 == null) {
                    break;
                }
            }
        }
        return this.e(z0, object1);
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(@Nullable Object object0) {
        Object object1;
        do {
            object1 = this.m(this.getState$kotlinx_coroutines_core(), object0);
            if(object1 == JobSupportKt.access$getCOMPLETING_ALREADY$p()) {
                return false;
            }
            if(object1 == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
        }
        while(object1 == JobSupportKt.access$getCOMPLETING_RETRY$p());
        this.afterCompletion(object1);
        return true;
    }

    @Nullable
    public final Object makeCompletingOnce$kotlinx_coroutines_core(@Nullable Object object0) {
        Throwable throwable0;
        while(true) {
            throwable0 = null;
            Object object1 = this.m(this.getState$kotlinx_coroutines_core(), object0);
            if(object1 == JobSupportKt.access$getCOMPLETING_ALREADY$p()) {
                break;
            }
            if(object1 != JobSupportKt.access$getCOMPLETING_RETRY$p()) {
                return object1;
            }
        }
        CompletedExceptionally completedExceptionally0 = object0 instanceof CompletedExceptionally ? ((CompletedExceptionally)object0) : null;
        if(completedExceptionally0 != null) {
            throwable0 = completedExceptionally0.cause;
        }
        throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + object0, throwable0);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    public CoroutineContext minusKey(@NotNull Key coroutineContext$Key0) {
        return DefaultImpls.minusKey(this, coroutineContext$Key0);
    }

    @NotNull
    public String nameString$kotlinx_coroutines_core() {
        return DebugStringsKt.getClassSimpleName(this);
    }

    public void onCancelling(@Nullable Throwable throwable0) {
    }

    public void onCompletionInternal(@Nullable Object object0) {
    }

    public void onStart() {
    }

    @Override  // kotlinx.coroutines.ChildJob
    public final void parentCancelled(@NotNull ParentJob parentJob0) {
        this.cancelImpl$kotlinx_coroutines_core(parentJob0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext0) {
        return DefaultImpls.plus(this, coroutineContext0);
    }

    @Override  // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public Job plus(@NotNull Job job0) {
        return job0;
    }

    public final void removeNode$kotlinx_coroutines_core(@NotNull JobNode jobNode0) {
        while(true) {
            Object object0 = this.getState$kotlinx_coroutines_core();
            if(!(object0 instanceof JobNode)) {
                break;
            }
            if(object0 != jobNode0) {
                return;
            }
            s s0 = JobSupportKt.access$getEMPTY_ACTIVE$p();
            do {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = JobSupport.a;
                if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, s0)) {
                    return;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == object0);
        }
        if(object0 instanceof Incomplete && ((Incomplete)object0).getList() != null) {
            jobNode0.remove();
        }
    }

    public final void setParentHandle$kotlinx_coroutines_core(@Nullable ChildHandle childHandle0) {
        JobSupport.b.set(this, childHandle0);
    }

    @Override  // kotlinx.coroutines.Job
    public final boolean start() {
    alab1:
        while(true) {
            switch(this.k(this.getState$kotlinx_coroutines_core())) {
                case 0: {
                    return false;
                }
                case 1: {
                    break alab1;
                }
            }
        }
        return true;
    }

    @NotNull
    public final CancellationException toCancellationException(@NotNull Throwable throwable0, @Nullable String s) {
        CancellationException cancellationException0 = throwable0 instanceof CancellationException ? ((CancellationException)throwable0) : null;
        if(cancellationException0 == null) {
            if(s == null) {
                s = JobSupport.access$cancellationExceptionMessage(this);
            }
            return new JobCancellationException(s, throwable0, this);
        }
        return cancellationException0;
    }

    public static CancellationException toCancellationException$default(JobSupport jobSupport0, Throwable throwable0, String s, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if((v & 1) != 0) {
            s = null;
        }
        return jobSupport0.toCancellationException(throwable0, s);
    }

    @InternalCoroutinesApi
    @NotNull
    public final String toDebugString() {
        return this.nameString$kotlinx_coroutines_core() + '{' + JobSupport.l(this.getState$kotlinx_coroutines_core()) + '}';
    }

    @Override
    @NotNull
    public String toString() {
        return this.toDebugString() + '@' + DebugStringsKt.getHexAddress(this);
    }
}

