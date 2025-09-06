package kotlinx.coroutines.channels;

import androidx.compose.material3.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import uf.h;
import uf.i;
import uf.j;
import uf.k;
import uf.l;
import uf.m;
import uf.n1;
import uf.n;
import uf.o;
import uf.p;
import uf.q;
import uf.r1;
import uf.r;

@Metadata(d1 = {"\u0000\u00A2\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004\u0087\u0001\u0088\u0001B3\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\"\b\u0002\u0010\b\u001A\u001C\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007\u00A2\u0006\u0004\b\t\u0010\nJ\u001B\u0010\f\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00028\u0000H\u0096@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\rJ&\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00060\u000E2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016\u00F8\u0001\u0001\u00F8\u0001\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001B\u0010\u0014\u001A\u00020\u00122\u0006\u0010\u000B\u001A\u00028\u0000H\u0090@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\rJ\u00EC\u0001\u0010&\u001A\u00028\u0001\"\u0004\b\u0001\u0010\u00152\u0006\u0010\u000B\u001A\u00028\u00002\b\u0010\u0017\u001A\u0004\u0018\u00010\u00162\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00010\u00182<\u0010 \u001A8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001B\u00A2\u0006\f\b\u001C\u0012\b\b\u001D\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\u001C\u0012\b\b\u001D\u0012\u0004\b\b(\u001F\u0012\u0004\u0012\u00028\u00010\u001A2\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00010\u00182h\b\u0002\u0010%\u001Ab\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001B\u00A2\u0006\f\b\u001C\u0012\b\b\u001D\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\u001C\u0012\b\b\u001D\u0012\u0004\b\b(\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001C\u0012\b\b\u001D\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u00110#\u00A2\u0006\f\b\u001C\u0012\b\b\u001D\u0012\u0004\b\b($\u0012\u0004\u0012\u00028\u00010\"H\u0084\b\u00A2\u0006\u0004\b&\u0010\'J\u000F\u0010*\u001A\u00020\u0012H\u0010\u00A2\u0006\u0004\b(\u0010)J\u000F\u0010+\u001A\u00020\u0006H\u0014\u00A2\u0006\u0004\b+\u0010,J\u000F\u0010-\u001A\u00020\u0006H\u0014\u00A2\u0006\u0004\b-\u0010,J\u0013\u0010.\u001A\u00028\u0000H\u0096@\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010/J\"\u00101\u001A\b\u0012\u0004\u0012\u00028\u00000\u000EH\u0096@\u00F8\u0001\u0001\u00F8\u0001\u0002\u00F8\u0001\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u0010/J\u001E\u00104\u001A\b\u0012\u0004\u0012\u00028\u00000\u000EH\u0016\u00F8\u0001\u0001\u00F8\u0001\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u00103J\u0017\u00106\u001A\u00020\u00062\u0006\u00105\u001A\u00020#H\u0004\u00A2\u0006\u0004\b6\u00107J\u0017\u0010:\u001A\u00020\u00062\u0006\u00108\u001A\u00020#H\u0000\u00A2\u0006\u0004\b9\u00107J%\u0010=\u001A\u00020\u00062\n\u0010<\u001A\u0006\u0012\u0002\b\u00030;2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0016H\u0014\u00A2\u0006\u0004\b=\u0010>J\u0016\u0010@\u001A\b\u0012\u0004\u0012\u00028\u00000?H\u0096\u0002\u00A2\u0006\u0004\b@\u0010AJ\u000F\u0010B\u001A\u00020\u0006H\u0014\u00A2\u0006\u0004\bB\u0010,J\u0019\u0010E\u001A\u00020\u00122\b\u0010D\u001A\u0004\u0018\u00010CH\u0016\u00A2\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001A\u00020\u00122\b\u0010D\u001A\u0004\u0018\u00010C\u00A2\u0006\u0004\bG\u0010FJ\r\u0010G\u001A\u00020\u0006\u00A2\u0006\u0004\bG\u0010,J\u001D\u0010G\u001A\u00020\u00062\u000E\u0010D\u001A\n\u0018\u00010Hj\u0004\u0018\u0001`I\u00A2\u0006\u0004\bG\u0010JJ\u0019\u0010L\u001A\u00020\u00122\b\u0010D\u001A\u0004\u0018\u00010CH\u0010\u00A2\u0006\u0004\bK\u0010FJ!\u0010M\u001A\u00020\u00122\b\u0010D\u001A\u0004\u0018\u00010C2\u0006\u0010G\u001A\u00020\u0012H\u0014\u00A2\u0006\u0004\bM\u0010NJ4\u0010P\u001A\u00020\u00062#\u0010O\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010C\u00A2\u0006\f\b\u001C\u0012\b\b\u001D\u0012\u0004\b\b(D\u0012\u0004\u0012\u00020\u00060\u0005H\u0016\u00A2\u0006\u0004\bP\u0010QJ\u000F\u0010S\u001A\u00020\u0012H\u0000\u00A2\u0006\u0004\bR\u0010)J\u000F\u0010U\u001A\u00020TH\u0016\u00A2\u0006\u0004\bU\u0010VJ\u000F\u0010X\u001A\u00020TH\u0000\u00A2\u0006\u0004\bW\u0010VJ\r\u0010Y\u001A\u00020\u0006\u00A2\u0006\u0004\bY\u0010,R.\u0010\b\u001A\u001C\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004\u00A2\u0006\u0006\n\u0004\b\b\u0010ZR\u0014\u0010]\u001A\u00020#8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b[\u0010\\R\u0014\u0010_\u001A\u00020#8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b^\u0010\\R,\u0010d\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000`8VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\bc\u0010,\u001A\u0004\ba\u0010bR \u0010i\u001A\b\u0012\u0004\u0012\u00028\u00000e8VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\bh\u0010,\u001A\u0004\bf\u0010gR)\u0010l\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000E0e8VX\u0096\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\bk\u0010,\u001A\u0004\bj\u0010gR\"\u0010o\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000e8VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\bn\u0010,\u001A\u0004\bm\u0010gR\u0016\u0010r\u001A\u0004\u0018\u00010C8DX\u0084\u0004\u00A2\u0006\u0006\u001A\u0004\bp\u0010qR\u0014\u0010t\u001A\u00020C8DX\u0084\u0004\u00A2\u0006\u0006\u001A\u0004\bs\u0010qR\u0014\u0010u\u001A\u00020\u00128TX\u0094\u0004\u00A2\u0006\u0006\u001A\u0004\bu\u0010)R\u001A\u0010v\u001A\u00020\u00128VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\bw\u0010,\u001A\u0004\bv\u0010)R\u001A\u0010x\u001A\u00020\u00128VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\by\u0010,\u001A\u0004\bx\u0010)R\u001A\u0010z\u001A\u00020\u00128VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\b{\u0010,\u001A\u0004\bz\u0010)R\u0013\u0010}\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160|8\u0002X\u0082\u0004R\u000B\u0010\u007F\u001A\u00020~8\u0002X\u0082\u0004R\u0018\u0010\u0080\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001B0|8\u0002X\u0082\u0004R\u0014\u0010\u0081\u0001\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160|8\u0002X\u0082\u0004R\f\u0010\u0082\u0001\u001A\u00020~8\u0002X\u0082\u0004R\u0018\u0010\u0083\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001B0|8\u0002X\u0082\u0004R\f\u0010\u0084\u0001\u001A\u00020~8\u0002X\u0082\u0004R\u0018\u0010\u0085\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001B0|8\u0002X\u0082\u0004R\f\u0010\u0086\u0001\u001A\u00020~8\u0002X\u0082\u0004\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006\u0089\u0001"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/Channel;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "element", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "", "sendBroadcast$kotlinx_coroutines_core", "sendBroadcast", "R", "", "waiter", "Lkotlin/Function0;", "onRendezvousOrBuffered", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ChannelSegment;", "Lkotlin/ParameterName;", "name", "segm", "i", "onSuspend", "onClosed", "Lkotlin/Function4;", "", "s", "onNoWaiterSuspend", "sendImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "shouldSendSuspend$kotlinx_coroutines_core", "()Z", "shouldSendSuspend", "onReceiveEnqueued", "()V", "onReceiveDequeued", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching-JP2dKIU", "receiveCatching", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryReceive", "globalCellIndex", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "(J)V", "globalIndex", "waitExpandBufferCompletion$kotlinx_coroutines_core", "waitExpandBufferCompletion", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "registerSelectForSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "onClosedIdempotent", "", "cause", "close", "(Ljava/lang/Throwable;)Z", "cancel", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelImpl$kotlinx_coroutines_core", "cancelImpl", "closeOrCancelImpl", "(Ljava/lang/Throwable;Z)Z", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "hasElements$kotlinx_coroutines_core", "hasElements", "", "toString", "()Ljava/lang/String;", "toStringDebug$kotlinx_coroutines_core", "toStringDebug", "checkSegmentStructureInvariants", "Lkotlin/jvm/functions/Function1;", "getSendersCounter$kotlinx_coroutines_core", "()J", "sendersCounter", "getReceiversCounter$kotlinx_coroutines_core", "receiversCounter", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "onSend", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "onReceive", "getOnReceiveCatching", "getOnReceiveCatching$annotations", "onReceiveCatching", "getOnReceiveOrNull", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "getCloseCause", "()Ljava/lang/Throwable;", "closeCause", "getSendException", "sendException", "isConflatedDropOldest", "isClosedForSend", "isClosedForSend$annotations", "isClosedForReceive", "isClosedForReceive$annotations", "isEmpty", "isEmpty$annotations", "Lkotlinx/atomicfu/AtomicRef;", "_closeCause", "Lkotlinx/atomicfu/AtomicLong;", "bufferEnd", "bufferEndSegment", "closeHandler", "completedExpandBuffersAndPauseFlag", "receiveSegment", "receivers", "sendSegment", "sendersAndCloseStatus", "kotlinx/coroutines/channels/b", "uf/h", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3055:1\n273#1,6:3058\n280#1,68:3065\n374#1,18:3156\n244#1:3174\n269#1,10:3175\n280#1,48:3186\n395#1:3234\n334#1,14:3235\n399#1,3:3250\n244#1:3263\n269#1,10:3264\n280#1,68:3275\n244#1:3353\n269#1,10:3354\n280#1,68:3365\n244#1:3437\n269#1,10:3438\n280#1,68:3449\n886#1,52:3519\n964#1,8:3575\n858#1:3583\n882#1,33:3584\n974#1:3617\n916#1,14:3618\n935#1,3:3633\n979#1,6:3636\n886#1,52:3650\n964#1,8:3706\n858#1:3714\n882#1,33:3715\n974#1:3748\n916#1,14:3749\n935#1,3:3764\n979#1,6:3767\n858#1:3782\n882#1,48:3783\n935#1,3:3832\n858#1:3835\n882#1,48:3836\n935#1,3:3885\n244#1:3897\n269#1,10:3898\n280#1,68:3909\n858#1:3978\n882#1,48:3979\n935#1,3:4028\n1#2:3056\n3038#3:3057\n3038#3:3064\n3038#3:3185\n3038#3:3274\n3038#3:3364\n3038#3:3436\n3038#3:3448\n3038#3:3518\n3038#3:3781\n3038#3:3888\n3038#3:3889\n3052#3:3890\n3052#3:3891\n3051#3:3892\n3051#3:3893\n3051#3:3894\n3052#3:3895\n3051#3:3896\n3038#3:3908\n3039#3:4031\n3038#3:4032\n3038#3:4033\n3038#3:4034\n3039#3:4035\n3038#3:4036\n3039#3:4059\n3038#3:4060\n3038#3:4061\n3039#3:4062\n3038#3:4112\n3039#3:4113\n3039#3:4114\n3039#3:4132\n3039#3:4133\n314#4,9:3133\n323#4,2:3150\n332#4,4:3152\n336#4,8:3253\n314#4,9:3344\n323#4,2:3434\n332#4,4:3571\n336#4,8:3642\n332#4,4:3702\n336#4,8:3773\n220#5:3142\n221#5:3145\n220#5:3146\n221#5:3149\n61#6,2:3143\n61#6,2:3147\n61#6,2:3261\n269#7:3249\n269#7:3343\n269#7:3433\n269#7:3517\n269#7:3977\n882#8:3632\n882#8:3763\n882#8:3831\n882#8:3884\n882#8:4027\n37#9,11:4037\n37#9,11:4048\n72#10,3:4063\n46#10,8:4066\n72#10,3:4074\n46#10,8:4077\n46#10,8:4085\n72#10,3:4093\n46#10,8:4096\n46#10,8:4104\n766#11:4115\n857#11,2:4116\n2310#11,14:4118\n766#11:4134\n857#11,2:4135\n2310#11,14:4137\n766#11:4151\n857#11,2:4152\n2310#11,14:4154\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n113#1:3058,6\n113#1:3065,68\n154#1:3156,18\n154#1:3174\n154#1:3175,10\n154#1:3186,48\n154#1:3234\n154#1:3235,14\n154#1:3250,3\n194#1:3263\n194#1:3264,10\n194#1:3275,68\n225#1:3353\n225#1:3354,10\n225#1:3365,68\n391#1:3437\n391#1:3438,10\n391#1:3449,68\n667#1:3519,52\n696#1:3575,8\n696#1:3583\n696#1:3584,33\n696#1:3617\n696#1:3618,14\n696#1:3633,3\n696#1:3636,6\n732#1:3650,52\n748#1:3706,8\n748#1:3714\n748#1:3715,33\n748#1:3748\n748#1:3749,14\n748#1:3764,3\n748#1:3767,6\n781#1:3782\n781#1:3783,48\n781#1:3832,3\n971#1:3835\n971#1:3836,48\n971#1:3885,3\n1464#1:3897\n1464#1:3898,10\n1464#1:3909,68\n1512#1:3978\n1512#1:3979,48\n1512#1:4028,3\n70#1:3057\n113#1:3064\n154#1:3185\n194#1:3274\n225#1:3364\n278#1:3436\n391#1:3448\n606#1:3518\n771#1:3781\n1007#1:3888\n1056#1:3889\n1374#1:3890\n1376#1:3891\n1406#1:3892\n1416#1:3893\n1425#1:3894\n1426#1:3895\n1433#1:3896\n1464#1:3908\n1865#1:4031\n1867#1:4032\n1869#1:4033\n1882#1:4034\n1893#1:4035\n1894#1:4036\n2196#1:4059\n2209#1:4060\n2219#1:4061\n2222#1:4062\n2539#1:4112\n2541#1:4113\n2566#1:4114\n2628#1:4132\n2629#1:4133\n134#1:3133,9\n134#1:3150,2\n153#1:3152,4\n153#1:3253,8\n221#1:3344,9\n221#1:3434,2\n695#1:3571,4\n695#1:3642,8\n746#1:3702,4\n746#1:3773,8\n138#1:3142\n138#1:3145\n141#1:3146\n141#1:3149\n138#1:3143,2\n141#1:3147,2\n183#1:3261,2\n154#1:3249\n194#1:3343\n225#1:3433\n391#1:3517\n1464#1:3977\n696#1:3632\n748#1:3763\n781#1:3831\n971#1:3884\n1512#1:4027\n2098#1:4037,11\n2153#1:4048,11\n2361#1:4063,3\n2361#1:4066,8\n2416#1:4074,3\n2416#1:4077,8\n2435#1:4085,8\n2465#1:4093,3\n2465#1:4096,8\n2526#1:4104,8\n2575#1:4115\n2575#1:4116,2\n2576#1:4118,14\n2640#1:4134\n2640#1:4135,2\n2641#1:4137,14\n2681#1:4151\n2681#1:4152,2\n2682#1:4154,14\n*E\n"})
public class BufferedChannel implements Channel {
    @Volatile
    @Nullable
    private volatile Object _closeCause;
    public final int a;
    public final e0 b;
    @Volatile
    private volatile long bufferEnd;
    @Volatile
    @Nullable
    private volatile Object bufferEndSegment;
    public static final AtomicLongFieldUpdater c;
    @Volatile
    @Nullable
    private volatile Object closeHandler;
    @Volatile
    private volatile long completedExpandBuffersAndPauseFlag;
    public static final AtomicLongFieldUpdater d;
    public static final AtomicLongFieldUpdater e;
    public static final AtomicLongFieldUpdater f;
    public static final AtomicReferenceFieldUpdater g;
    public static final AtomicReferenceFieldUpdater h;
    public static final AtomicReferenceFieldUpdater i;
    public static final AtomicReferenceFieldUpdater j;
    public static final AtomicReferenceFieldUpdater k;
    @JvmField
    @Nullable
    public final Function1 onUndeliveredElement;
    @Volatile
    @Nullable
    private volatile Object receiveSegment;
    @Volatile
    private volatile long receivers;
    @Volatile
    @Nullable
    private volatile Object sendSegment;
    @Volatile
    private volatile long sendersAndCloseStatus;

    static {
        BufferedChannel.c = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus");
        BufferedChannel.d = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers");
        BufferedChannel.e = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd");
        BufferedChannel.f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag");
        BufferedChannel.g = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment");
        BufferedChannel.h = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment");
        BufferedChannel.i = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment");
        BufferedChannel.j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause");
        BufferedChannel.k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler");
    }

    public BufferedChannel(int v, @Nullable Function1 function10) {
        this.a = v;
        this.onUndeliveredElement = function10;
        if(v < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + v + ", should be >=0").toString());
        }
        this.bufferEnd = BufferedChannelKt.access$initialBufferEnd(v);
        this.completedExpandBuffersAndPauseFlag = BufferedChannel.e.get(this);
        ChannelSegment channelSegment0 = new ChannelSegment(0L, null, this, 3);
        this.sendSegment = channelSegment0;
        this.receiveSegment = channelSegment0;
        if(this.h()) {
            channelSegment0 = BufferedChannelKt.access$getNULL_SEGMENT$p();
            Intrinsics.checkNotNull(channelSegment0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = channelSegment0;
        this.b = function10 == null ? null : new e0(this, 13);
        this._closeCause = BufferedChannelKt.access$getNO_CLOSE_CAUSE$p();
    }

    public BufferedChannel(int v, Function1 function10, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            function10 = null;
        }
        this(v, function10);
    }

    public final boolean a(long v) {
        return v < BufferedChannel.e.get(this) || v < this.getReceiversCounter$kotlinx_coroutines_core() + ((long)this.a);
    }

    public static final ChannelSegment access$findSegmentSend(BufferedChannel bufferedChannel0, long v, ChannelSegment channelSegment0) {
        Object object0;
        bufferedChannel0.getClass();
        Function2 function20 = (Function2)BufferedChannelKt.createSegmentFunction();
    alab1:
        while(true) {
            object0 = ConcurrentLinkedListKt.findSegmentInternal(channelSegment0, v, function20);
            if(SegmentOrClosed.isClosed-impl(object0)) {
                break;
            }
            Segment segment0 = SegmentOrClosed.getSegment-impl(object0);
            while(true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = BufferedChannel.g;
                Segment segment1 = (Segment)atomicReferenceFieldUpdater0.get(bufferedChannel0);
                if(segment1.id >= segment0.id) {
                    break alab1;
                }
                if(!segment0.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(bufferedChannel0, segment1, segment0)) {
                        if(!segment1.decPointers$kotlinx_coroutines_core()) {
                            break alab1;
                        }
                        segment1.remove();
                        break alab1;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(bufferedChannel0) == segment1);
                if(segment0.decPointers$kotlinx_coroutines_core()) {
                    segment0.remove();
                }
            }
        }
        if(SegmentOrClosed.isClosed-impl(object0)) {
            bufferedChannel0.isClosedForSend();
            long v1 = bufferedChannel0.getReceiversCounter$kotlinx_coroutines_core();
            if(channelSegment0.id * ((long)BufferedChannelKt.SEGMENT_SIZE) >= v1) {
                return null;
            }
            channelSegment0.cleanPrev();
            return null;
        }
        ChannelSegment channelSegment1 = (ChannelSegment)SegmentOrClosed.getSegment-impl(object0);
        long v2 = channelSegment1.id;
        if(v2 > v) {
            long v3 = v2 * ((long)BufferedChannelKt.SEGMENT_SIZE);
            do {
                long v4 = BufferedChannel.c.get(bufferedChannel0);
            }
            while((0xFFFFFFFFFFFFFFFL & v4) < v3 && !BufferedChannel.c.compareAndSet(bufferedChannel0, v4, (((long)(((int)(v4 >> 60)))) << 60) + (0xFFFFFFFFFFFFFFFL & v4)));
            long v5 = bufferedChannel0.getReceiversCounter$kotlinx_coroutines_core();
            if(channelSegment1.id * ((long)BufferedChannelKt.SEGMENT_SIZE) < v5) {
                channelSegment1.cleanPrev();
                return null;
            }
            return null;
        }
        return channelSegment1;
    }

    public static final boolean access$isClosedForSend0(BufferedChannel bufferedChannel0, long v) {
        return bufferedChannel0.g(v, false);
    }

    public static final void access$onClosedReceiveCatchingOnNoWaiterSuspend(BufferedChannel bufferedChannel0, CancellableContinuation cancellableContinuation0) {
        bufferedChannel0.getClass();
        Throwable throwable0 = bufferedChannel0.getCloseCause();
        cancellableContinuation0.resumeWith(Result.constructor-impl(ChannelResult.box-impl(ChannelResult.Companion.closed-JP2dKIU(throwable0))));
    }

    public static final void access$onClosedReceiveOnNoWaiterSuspend(BufferedChannel bufferedChannel0, CancellableContinuation cancellableContinuation0) {
        bufferedChannel0.getClass();
        cancellableContinuation0.resumeWith(Result.constructor-impl(ResultKt.createFailure(bufferedChannel0.e())));
    }

    public static final Object access$onClosedSend(BufferedChannel bufferedChannel0, Object object0, Continuation continuation0) {
        return bufferedChannel0.k(object0, continuation0);
    }

    public static final void access$onClosedSendOnNoWaiterSuspend(BufferedChannel bufferedChannel0, Object object0, CancellableContinuation cancellableContinuation0) {
        Function1 function10 = bufferedChannel0.onUndeliveredElement;
        if(function10 != null) {
            OnUndeliveredElementKt.callUndeliveredElement(function10, object0, cancellableContinuation0.getContext());
        }
        cancellableContinuation0.resumeWith(Result.constructor-impl(ResultKt.createFailure(bufferedChannel0.getSendException())));
    }

    public static final void access$prepareReceiverForSuspension(BufferedChannel bufferedChannel0, Waiter waiter0, ChannelSegment channelSegment0, int v) {
        waiter0.invokeOnCancellation(channelSegment0, v);
    }

    public static final void access$prepareSenderForSuspension(BufferedChannel bufferedChannel0, Waiter waiter0, ChannelSegment channelSegment0, int v) {
        bufferedChannel0.getClass();
        waiter0.invokeOnCancellation(channelSegment0, v + BufferedChannelKt.SEGMENT_SIZE);
    }

    public static final Object access$processResultSelectReceive(BufferedChannel bufferedChannel0, Object object0, Object object1) {
        bufferedChannel0.getClass();
        if(object1 == BufferedChannelKt.getCHANNEL_CLOSED()) {
            throw bufferedChannel0.e();
        }
        return object1;
    }

    public static final Object access$processResultSelectReceiveCatching(BufferedChannel bufferedChannel0, Object object0, Object object1) {
        bufferedChannel0.getClass();
        if(object1 == BufferedChannelKt.getCHANNEL_CLOSED()) {
            Throwable throwable0 = bufferedChannel0.getCloseCause();
            return ChannelResult.box-impl(ChannelResult.Companion.closed-JP2dKIU(throwable0));
        }
        return ChannelResult.box-impl(ChannelResult.Companion.success-JP2dKIU(object1));
    }

    public static final Object access$processResultSelectReceiveOrNull(BufferedChannel bufferedChannel0, Object object0, Object object1) {
        bufferedChannel0.getClass();
        if(object1 == BufferedChannelKt.getCHANNEL_CLOSED()) {
            if(bufferedChannel0.getCloseCause() != null) {
                throw bufferedChannel0.e();
            }
            return null;
        }
        return object1;
    }

    public static final Object access$processResultSelectSend(BufferedChannel bufferedChannel0, Object object0, Object object1) {
        bufferedChannel0.getClass();
        if(object1 == BufferedChannelKt.getCHANNEL_CLOSED()) {
            throw bufferedChannel0.getSendException();
        }
        return bufferedChannel0;
    }

    public static final Object access$receiveOnNoWaiterSuspend(BufferedChannel bufferedChannel0, ChannelSegment channelSegment0, int v, long v1, Continuation continuation0) {
        return bufferedChannel0.n(channelSegment0, v, v1, continuation0);
    }

    public static final void access$registerSelectForReceive(BufferedChannel bufferedChannel0, SelectInstance selectInstance0, Object object0) {
        Object object1;
        bufferedChannel0.getClass();
        ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.h.get(bufferedChannel0);
        while(true) {
            if(bufferedChannel0.isClosedForReceive()) {
                selectInstance0.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
                return;
            }
            long v = BufferedChannel.d.getAndIncrement(bufferedChannel0);
            long v1 = v / ((long)BufferedChannelKt.SEGMENT_SIZE);
            int v2 = (int)(v % ((long)BufferedChannelKt.SEGMENT_SIZE));
            if(channelSegment0.id != v1) {
                ChannelSegment channelSegment1 = bufferedChannel0.d(v1, channelSegment0);
                if(channelSegment1 == null) {
                    continue;
                }
                channelSegment0 = channelSegment1;
            }
            object1 = BufferedChannel.access$updateCellReceive(bufferedChannel0, channelSegment0, v2, v, selectInstance0);
            if(object1 == BufferedChannelKt.access$getSUSPEND$p()) {
                Waiter waiter0 = selectInstance0 instanceof Waiter ? ((Waiter)selectInstance0) : null;
                if(waiter0 == null) {
                    return;
                }
                BufferedChannel.access$prepareReceiverForSuspension(bufferedChannel0, waiter0, channelSegment0, v2);
                return;
            }
            if(object1 != BufferedChannelKt.access$getFAILED$p()) {
                break;
            }
            if(v < bufferedChannel0.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment0.cleanPrev();
            }
        }
        if(object1 == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) {
            throw new IllegalStateException("unexpected");
        }
        channelSegment0.cleanPrev();
        selectInstance0.selectInRegistrationPhase(object1);
    }

    public static final Object access$sendOnNoWaiterSuspend(BufferedChannel bufferedChannel0, ChannelSegment channelSegment0, int v, Object object0, long v1, Continuation continuation0) {
        return bufferedChannel0.p(channelSegment0, v, object0, v1, continuation0);
    }

    public static final Object access$updateCellReceive(BufferedChannel bufferedChannel0, ChannelSegment channelSegment0, int v, long v1, Object object0) {
        return bufferedChannel0.s(channelSegment0, v, object0, v1);
    }

    public static final int access$updateCellSend(BufferedChannel bufferedChannel0, ChannelSegment channelSegment0, int v, Object object0, long v1, Object object1, boolean z) {
        bufferedChannel0.getClass();
        channelSegment0.storeElement$kotlinx_coroutines_core(v, object0);
        if(z) {
            return bufferedChannel0.t(channelSegment0, v, object0, v1, object1, true);
        }
        Object object2 = channelSegment0.getState$kotlinx_coroutines_core(v);
        if(object2 == null) {
            if(bufferedChannel0.a(v1)) {
                return channelSegment0.casState$kotlinx_coroutines_core(v, null, BufferedChannelKt.BUFFERED) ? 1 : bufferedChannel0.t(channelSegment0, v, object0, v1, object1, false);
            }
            if(object1 == null) {
                return 3;
            }
            return channelSegment0.casState$kotlinx_coroutines_core(v, null, object1) ? 2 : bufferedChannel0.t(channelSegment0, v, object0, v1, object1, false);
        }
        if(object2 instanceof Waiter) {
            channelSegment0.cleanElement$kotlinx_coroutines_core(v);
            if(bufferedChannel0.q(object2, object0)) {
                channelSegment0.setState$kotlinx_coroutines_core(v, BufferedChannelKt.access$getDONE_RCV$p());
                return 0;
            }
            if(channelSegment0.getAndSetState$kotlinx_coroutines_core(v, BufferedChannelKt.access$getINTERRUPTED_RCV$p()) != BufferedChannelKt.access$getINTERRUPTED_RCV$p()) {
                channelSegment0.onCancelledRequest(v, true);
            }
            return 5;
        }
        return bufferedChannel0.t(channelSegment0, v, object0, v1, object1, false);
    }

    public final ChannelSegment b(long v) {
        Object object2;
        long v2;
        ChannelSegment channelSegment0 = BufferedChannel.i.get(this);
        ChannelSegment channelSegment1 = (ChannelSegment)BufferedChannel.g.get(this);
        if(channelSegment1.id > channelSegment0.id) {
            channelSegment0 = channelSegment1;
        }
        ChannelSegment channelSegment2 = (ChannelSegment)BufferedChannel.h.get(this);
        if(channelSegment2.id > channelSegment0.id) {
            channelSegment0 = channelSegment2;
        }
        ChannelSegment channelSegment3 = (ChannelSegment)ConcurrentLinkedListKt.close(channelSegment0);
        if(this.isConflatedDropOldest()) {
            ChannelSegment channelSegment4 = channelSegment3;
        alab1:
            while(true) {
                int v1 = BufferedChannelKt.SEGMENT_SIZE - 1;
                while(-1 < v1) {
                    v2 = channelSegment4.id * ((long)BufferedChannelKt.SEGMENT_SIZE) + ((long)v1);
                    if(v2 >= this.getReceiversCounter$kotlinx_coroutines_core()) {
                        do {
                            Object object0 = channelSegment4.getState$kotlinx_coroutines_core(v1);
                            if(object0 != null && object0 != BufferedChannelKt.c) {
                                if(object0 != BufferedChannelKt.BUFFERED) {
                                    goto label_20;
                                }
                                break alab1;
                            }
                        }
                        while(!channelSegment4.casState$kotlinx_coroutines_core(v1, object0, BufferedChannelKt.getCHANNEL_CLOSED()));
                        channelSegment4.onSlotCleaned();
                    label_20:
                        --v1;
                        continue;
                    }
                    v2 = -1L;
                    break alab1;
                }
                channelSegment4 = (ChannelSegment)channelSegment4.getPrev();
                if(channelSegment4 == null) {
                    v2 = -1L;
                    break;
                }
                else {
                    continue;
                }
                goto label_31;
            }
            if(v2 != -1L) {
                this.dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(v2);
            }
        }
    label_31:
        Object object1 = InlineList.constructor-impl$default(null, 1, null);
        ChannelSegment channelSegment5 = channelSegment3;
    alab2:
        while(channelSegment5 != null) {
            int v3 = BufferedChannelKt.SEGMENT_SIZE - 1;
            while(-1 < v3) {
                if(channelSegment5.id * ((long)BufferedChannelKt.SEGMENT_SIZE) + ((long)v3) < v) {
                    break alab2;
                }
            alab3:
                while(true) {
                    do {
                        do {
                            object2 = channelSegment5.getState$kotlinx_coroutines_core(v3);
                            if(object2 == null || object2 == BufferedChannelKt.c) {
                                goto label_49;
                            }
                            if(!(object2 instanceof r1)) {
                                goto label_44;
                            }
                        }
                        while(!channelSegment5.casState$kotlinx_coroutines_core(v3, object2, BufferedChannelKt.getCHANNEL_CLOSED()));
                        object1 = InlineList.plus-FjFbRPM(object1, ((r1)object2).a);
                        channelSegment5.onCancelledRequest(v3, true);
                        break alab3;
                    label_44:
                        if(!(object2 instanceof Waiter)) {
                            break alab3;
                        }
                    }
                    while(!channelSegment5.casState$kotlinx_coroutines_core(v3, object2, BufferedChannelKt.getCHANNEL_CLOSED()));
                    object1 = InlineList.plus-FjFbRPM(object1, object2);
                    channelSegment5.onCancelledRequest(v3, true);
                    break;
                label_49:
                    if(channelSegment5.casState$kotlinx_coroutines_core(v3, object2, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        channelSegment5.onSlotCleaned();
                        break;
                    }
                }
                --v3;
            }
            channelSegment5 = (ChannelSegment)channelSegment5.getPrev();
        }
        if(object1 != null) {
            if(!(object1 instanceof ArrayList)) {
                this.o(((Waiter)object1), true);
                return channelSegment3;
            }
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            for(int v4 = ((ArrayList)object1).size() - 1; -1 < v4; --v4) {
                this.o(((Waiter)((ArrayList)object1).get(v4)), true);
            }
        }
        return channelSegment3;
    }

    public final void c() {
        Object object2;
        Object object0;
        if(this.h()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = BufferedChannel.i;
        ChannelSegment channelSegment0 = (ChannelSegment)atomicReferenceFieldUpdater0.get(this);
    alab3:
        while(true) {
            long v = BufferedChannel.e.getAndIncrement(this);
            long v1 = v / ((long)BufferedChannelKt.SEGMENT_SIZE);
            if(this.getSendersCounter$kotlinx_coroutines_core() <= v) {
                if(channelSegment0.id < v1 && channelSegment0.getNext() != null) {
                    this.i(v1, channelSegment0);
                }
                BufferedChannel.f(this);
                return;
            }
            if(channelSegment0.id != v1) {
                Function2 function20 = (Function2)BufferedChannelKt.createSegmentFunction();
            alab1:
                while(true) {
                    object0 = ConcurrentLinkedListKt.findSegmentInternal(channelSegment0, v1, function20);
                    if(SegmentOrClosed.isClosed-impl(object0)) {
                        break;
                    }
                    Segment segment0 = SegmentOrClosed.getSegment-impl(object0);
                    while(true) {
                        Segment segment1 = (Segment)atomicReferenceFieldUpdater0.get(this);
                        if(segment1.id >= segment0.id) {
                            break alab1;
                        }
                        if(!segment0.tryIncPointers$kotlinx_coroutines_core()) {
                            break;
                        }
                        do {
                            if(atomicReferenceFieldUpdater0.compareAndSet(this, segment1, segment0)) {
                                if(segment1.decPointers$kotlinx_coroutines_core()) {
                                    segment1.remove();
                                }
                                break alab1;
                            }
                        }
                        while(atomicReferenceFieldUpdater0.get(this) == segment1);
                        if(segment0.decPointers$kotlinx_coroutines_core()) {
                            segment0.remove();
                        }
                    }
                }
                ChannelSegment channelSegment1 = null;
                if(SegmentOrClosed.isClosed-impl(object0)) {
                    this.isClosedForSend();
                    this.i(v1, channelSegment0);
                    BufferedChannel.f(this);
                }
                else {
                    ChannelSegment channelSegment2 = (ChannelSegment)SegmentOrClosed.getSegment-impl(object0);
                    long v2 = channelSegment2.id;
                    if(v2 > v1) {
                        long v3 = (long)BufferedChannelKt.SEGMENT_SIZE;
                        if(BufferedChannel.e.compareAndSet(this, v + 1L, v2 * v3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater0 = BufferedChannel.f;
                            if((atomicLongFieldUpdater0.addAndGet(this, channelSegment2.id * v3 - v) & 0x4000000000000000L) != 0L) {
                                while((atomicLongFieldUpdater0.get(this) & 0x4000000000000000L) != 0L) {
                                }
                            }
                        }
                        else {
                            BufferedChannel.f(this);
                        }
                    }
                    else {
                        channelSegment1 = channelSegment2;
                    }
                }
                if(channelSegment1 == null) {
                    continue;
                }
                channelSegment0 = channelSegment1;
            }
            int v4 = (int)(v % ((long)BufferedChannelKt.SEGMENT_SIZE));
            Object object1 = channelSegment0.getState$kotlinx_coroutines_core(v4);
            AtomicLongFieldUpdater atomicLongFieldUpdater1 = BufferedChannel.d;
            if(!(object1 instanceof Waiter) || v < atomicLongFieldUpdater1.get(this) || !channelSegment0.casState$kotlinx_coroutines_core(v4, object1, BufferedChannelKt.e)) {
            alab2:
                do {
                    do {
                    label_60:
                        object2 = channelSegment0.getState$kotlinx_coroutines_core(v4);
                        if(!(object2 instanceof Waiter)) {
                            goto label_72;
                        }
                        if(v >= atomicLongFieldUpdater1.get(this)) {
                            continue alab2;
                        }
                    }
                    while(!channelSegment0.casState$kotlinx_coroutines_core(v4, object2, new r1(((Waiter)object2))));
                    break alab3;
                }
                while(!channelSegment0.casState$kotlinx_coroutines_core(v4, object2, BufferedChannelKt.e));
                if(this.r(object2, channelSegment0, v4)) {
                    channelSegment0.setState$kotlinx_coroutines_core(v4, BufferedChannelKt.BUFFERED);
                }
                else {
                    channelSegment0.setState$kotlinx_coroutines_core(v4, BufferedChannelKt.h);
                    channelSegment0.onCancelledRequest(v4, false);
                    goto label_73;
                label_72:
                    if(object2 == BufferedChannelKt.h) {
                    label_73:
                        BufferedChannel.f(this);
                        continue;
                    }
                    if(object2 != null) {
                        if(object2 != BufferedChannelKt.BUFFERED && object2 != BufferedChannelKt.f && object2 != BufferedChannelKt.g && object2 != BufferedChannelKt.i && object2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
                            if(object2 != BufferedChannelKt.d) {
                                throw new IllegalStateException(("Unexpected cell state: " + object2).toString());
                            }
                            goto label_60;
                        }
                    }
                    else if(channelSegment0.casState$kotlinx_coroutines_core(v4, null, BufferedChannelKt.c)) {
                    }
                    else {
                        goto label_60;
                    }
                }
            }
            else if(this.r(object1, channelSegment0, v4)) {
                channelSegment0.setState$kotlinx_coroutines_core(v4, BufferedChannelKt.BUFFERED);
            }
            else {
                channelSegment0.setState$kotlinx_coroutines_core(v4, BufferedChannelKt.h);
                channelSegment0.onCancelledRequest(v4, false);
                BufferedChannel.f(this);
                continue;
            }
            break;
        }
        BufferedChannel.f(this);
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        this.cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(@Nullable CancellationException cancellationException0) {
        this.cancelImpl$kotlinx_coroutines_core(cancellationException0);
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(@Nullable Throwable throwable0) {
        return this.cancelImpl$kotlinx_coroutines_core(throwable0);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(@Nullable Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new CancellationException("Channel was cancelled");
        }
        return this.closeOrCancelImpl(throwable0, true);
    }

    public final void checkSegmentStructureInvariants() {
        boolean z = this.h();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = BufferedChannel.h;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1 = BufferedChannel.i;
        if(z) {
            if(atomicReferenceFieldUpdater1.get(this) != BufferedChannelKt.a) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        }
        else if(((ChannelSegment)atomicReferenceFieldUpdater0.get(this)).id > ((ChannelSegment)atomicReferenceFieldUpdater1.get(this)).id) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        ChannelSegment[] arr_channelSegment = new ChannelSegment[3];
        arr_channelSegment[0] = atomicReferenceFieldUpdater0.get(this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = BufferedChannel.g;
        arr_channelSegment[1] = atomicReferenceFieldUpdater2.get(this);
        arr_channelSegment[2] = atomicReferenceFieldUpdater1.get(this);
        Iterable iterable0 = CollectionsKt__CollectionsKt.listOf(arr_channelSegment);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((ChannelSegment)object0) != BufferedChannelKt.a) {
                arrayList0.add(object0);
            }
        }
        Iterator iterator1 = arrayList0.iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator1.next();
        if(iterator1.hasNext()) {
            long v = ((ChannelSegment)object1).id;
            while(true) {
                Object object2 = iterator1.next();
                long v1 = ((ChannelSegment)object2).id;
                if(v > v1) {
                    object1 = object2;
                    v = v1;
                }
                if(!iterator1.hasNext()) {
                    break;
                }
            }
        }
        ChannelSegment channelSegment0 = (ChannelSegment)object1;
        if(channelSegment0.getPrev() != null) {
            throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while(channelSegment0.getNext() != null) {
            ConcurrentLinkedListNode concurrentLinkedListNode0 = channelSegment0.getNext();
            Intrinsics.checkNotNull(concurrentLinkedListNode0);
            if(((ChannelSegment)concurrentLinkedListNode0).getPrev() != null) {
                ConcurrentLinkedListNode concurrentLinkedListNode1 = channelSegment0.getNext();
                Intrinsics.checkNotNull(concurrentLinkedListNode1);
                if(((ChannelSegment)concurrentLinkedListNode1).getPrev() != channelSegment0) {
                    throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                }
            }
            int v2 = BufferedChannelKt.SEGMENT_SIZE;
            int v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object3 = channelSegment0.getState$kotlinx_coroutines_core(v3);
                if(!Intrinsics.areEqual(object3, BufferedChannelKt.BUFFERED) && !(object3 instanceof Waiter)) {
                    if(((Intrinsics.areEqual(object3, BufferedChannelKt.i) ? true : Intrinsics.areEqual(object3, BufferedChannelKt.h)) ? true : Intrinsics.areEqual(object3, BufferedChannelKt.getCHANNEL_CLOSED()))) {
                        if(channelSegment0.getElement$kotlinx_coroutines_core(v3) != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        ++v4;
                        continue;
                    }
                    else {
                        if(!(Intrinsics.areEqual(object3, BufferedChannelKt.f) ? true : Intrinsics.areEqual(object3, BufferedChannelKt.g))) {
                            throw new IllegalStateException(("Unexpected segment cell state: " + object3 + ".\nChannel state: " + this).toString());
                        }
                        if(channelSegment0.getElement$kotlinx_coroutines_core(v3) != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
            }
            if(v4 == BufferedChannelKt.SEGMENT_SIZE && (channelSegment0 != atomicReferenceFieldUpdater0.get(this) && channelSegment0 != atomicReferenceFieldUpdater2.get(this) && channelSegment0 != atomicReferenceFieldUpdater1.get(this))) {
                throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
            }
            ConcurrentLinkedListNode concurrentLinkedListNode2 = channelSegment0.getNext();
            Intrinsics.checkNotNull(concurrentLinkedListNode2);
            channelSegment0 = (ChannelSegment)concurrentLinkedListNode2;
        }
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public boolean close(@Nullable Throwable throwable0) {
        return this.closeOrCancelImpl(throwable0, false);
    }

    public boolean closeOrCancelImpl(@Nullable Throwable throwable0, boolean z) {
        Object object0;
        long v3;
        boolean z1;
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = BufferedChannel.c;
        if(z) {
            while(true) {
                long v = atomicLongFieldUpdater0.get(this);
                if(((int)(v >> 60)) != 0 || atomicLongFieldUpdater0.compareAndSet(this, v, 0x1000000000000000L + (v & 0xFFFFFFFFFFFFFFFL))) {
                    break;
                }
            }
        }
        Symbol symbol0 = BufferedChannelKt.q;
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = BufferedChannel.j;
            if(atomicReferenceFieldUpdater0.compareAndSet(this, symbol0, throwable0)) {
                z1 = true;
                break;
            }
            if(atomicReferenceFieldUpdater0.get(this) != symbol0) {
                z1 = false;
                break;
            }
        }
        if(z) {
            do {
                long v1 = atomicLongFieldUpdater0.get(this);
            }
            while(!atomicLongFieldUpdater0.compareAndSet(this, v1, 0x3000000000000000L + (v1 & 0xFFFFFFFFFFFFFFFL)));
        }
        else {
        alab1:
            while(true) {
                long v2 = atomicLongFieldUpdater0.get(this);
                switch(((int)(v2 >> 60))) {
                    case 0: {
                        v3 = 0x2000000000000000L + (v2 & 0xFFFFFFFFFFFFFFFL);
                        break;
                    }
                    case 1: {
                        v3 = 0x3000000000000000L + (v2 & 0xFFFFFFFFFFFFFFFL);
                        break;
                    }
                    default: {
                        break alab1;
                    }
                }
                if(atomicLongFieldUpdater0.compareAndSet(this, v2, v3)) {
                    break;
                }
            }
        }
        this.isClosedForSend();
        if(z1) {
            while(true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1 = BufferedChannel.k;
                object0 = atomicReferenceFieldUpdater1.get(this);
                Symbol symbol1 = object0 == null ? BufferedChannelKt.o : BufferedChannelKt.p;
            label_29:
                if(atomicReferenceFieldUpdater1.compareAndSet(this, object0, symbol1)) {
                    break;
                }
                if(atomicReferenceFieldUpdater1.get(this) != object0) {
                    continue;
                }
                if(false) {
                    break;
                }
                goto label_29;
            }
            if(object0 != null) {
                Function1 function10 = (Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object0, 1);
                ((Function1)object0).invoke(this.getCloseCause());
                return true;
            }
        }
        return z1;
    }

    public final ChannelSegment d(long v, ChannelSegment channelSegment0) {
        Object object0;
        Function2 function20 = (Function2)BufferedChannelKt.createSegmentFunction();
    alab1:
        while(true) {
            object0 = ConcurrentLinkedListKt.findSegmentInternal(channelSegment0, v, function20);
            if(SegmentOrClosed.isClosed-impl(object0)) {
                break;
            }
            Segment segment0 = SegmentOrClosed.getSegment-impl(object0);
            while(true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = BufferedChannel.h;
                Segment segment1 = (Segment)atomicReferenceFieldUpdater0.get(this);
                if(segment1.id >= segment0.id) {
                    break alab1;
                }
                if(!segment0.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, segment1, segment0)) {
                        if(!segment1.decPointers$kotlinx_coroutines_core()) {
                            break alab1;
                        }
                        segment1.remove();
                        break alab1;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == segment1);
                if(segment0.decPointers$kotlinx_coroutines_core()) {
                    segment0.remove();
                }
            }
        }
        if(SegmentOrClosed.isClosed-impl(object0)) {
            this.isClosedForSend();
            long v1 = this.getSendersCounter$kotlinx_coroutines_core();
            if(channelSegment0.id * ((long)BufferedChannelKt.SEGMENT_SIZE) >= v1) {
                return null;
            }
            channelSegment0.cleanPrev();
            return null;
        }
        ChannelSegment channelSegment1 = (ChannelSegment)SegmentOrClosed.getSegment-impl(object0);
        if(!this.h() && v <= BufferedChannel.e.get(this) / ((long)BufferedChannelKt.SEGMENT_SIZE)) {
            while(true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1 = BufferedChannel.i;
                Segment segment2 = (Segment)atomicReferenceFieldUpdater1.get(this);
                if(segment2.id >= channelSegment1.id || !channelSegment1.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
            label_28:
                if(atomicReferenceFieldUpdater1.compareAndSet(this, segment2, channelSegment1)) {
                    if(!segment2.decPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    segment2.remove();
                    break;
                }
                if(atomicReferenceFieldUpdater1.get(this) != segment2) {
                    if(!channelSegment1.decPointers$kotlinx_coroutines_core()) {
                        continue;
                    }
                    channelSegment1.remove();
                    continue;
                }
                if(false) {
                    break;
                }
                goto label_28;
            }
        }
        long v2 = channelSegment1.id;
        if(v2 > v) {
            long v3 = v2 * ((long)BufferedChannelKt.SEGMENT_SIZE);
            do {
                long v4 = BufferedChannel.d.get(this);
            }
            while(v4 < v3 && !BufferedChannel.d.compareAndSet(this, v4, v3));
            long v5 = this.getSendersCounter$kotlinx_coroutines_core();
            if(channelSegment1.id * ((long)BufferedChannelKt.SEGMENT_SIZE) < v5) {
                channelSegment1.cleanPrev();
                return null;
            }
            return null;
        }
        return channelSegment1;
    }

    public final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long v) {
        UndeliveredElementException undeliveredElementException0;
        Function1 function10;
        Object object0;
        int v4;
        long v1;
        ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.h.get(this);
        while(true) {
            while(true) {
                while(true) {
                    while(true) {
                        do {
                        label_1:
                            AtomicLongFieldUpdater atomicLongFieldUpdater0 = BufferedChannel.d;
                            v1 = atomicLongFieldUpdater0.get(this);
                            long v2 = BufferedChannel.e.get(this);
                            if(v < Math.max(((long)this.a) + v1, v2)) {
                                return;
                            }
                        }
                        while(!atomicLongFieldUpdater0.compareAndSet(this, v1, v1 + 1L));
                        long v3 = v1 / ((long)BufferedChannelKt.SEGMENT_SIZE);
                        v4 = (int)(v1 % ((long)BufferedChannelKt.SEGMENT_SIZE));
                        if(channelSegment0.id == v3) {
                            break;
                        }
                        ChannelSegment channelSegment1 = this.d(v3, channelSegment0);
                        if(channelSegment1 != null) {
                            channelSegment0 = channelSegment1;
                            break;
                        }
                    }
                    object0 = this.s(channelSegment0, v4, null, v1);
                    if(object0 != BufferedChannelKt.m) {
                        break;
                    }
                    if(v1 < this.getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment0.cleanPrev();
                    }
                }
                channelSegment0.cleanPrev();
                function10 = this.onUndeliveredElement;
                if(function10 == null) {
                    goto label_1;
                }
                break;
            }
            undeliveredElementException0 = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function10, object0, null, 2, null);
            if(undeliveredElementException0 == null) {
                goto label_1;
            }
            break;
        }
        throw undeliveredElementException0;
    }

    public final Throwable e() {
        Throwable throwable0 = this.getCloseCause();
        return throwable0 == null ? new ClosedReceiveChannelException("Channel was closed") : throwable0;
    }

    public static void f(BufferedChannel bufferedChannel0) {
        bufferedChannel0.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = BufferedChannel.f;
        if((atomicLongFieldUpdater0.addAndGet(bufferedChannel0, 1L) & 0x4000000000000000L) != 0L) {
            while((atomicLongFieldUpdater0.get(bufferedChannel0) & 0x4000000000000000L) != 0L) {
            }
        }
    }

    public final boolean g(long v, boolean z) {
        Waiter waiter0;
        Object object1;
        switch(((int)(v >> 60))) {
            case 0: 
            case 1: {
                return false;
            }
            case 2: {
                this.b(v & 0xFFFFFFFFFFFFFFFL);
                return !z || !this.hasElements$kotlinx_coroutines_core();
            }
            case 3: {
                ChannelSegment channelSegment0 = this.b(v & 0xFFFFFFFFFFFFFFFL);
                Function1 function10 = this.onUndeliveredElement;
                Throwable throwable0 = null;
                Object object0 = InlineList.constructor-impl$default(null, 1, null);
            alab1:
                do {
                    int v1 = BufferedChannelKt.SEGMENT_SIZE - 1;
                    while(-1 < v1) {
                        long v2 = channelSegment0.id * ((long)BufferedChannelKt.SEGMENT_SIZE) + ((long)v1);
                    alab2:
                        do {
                            do {
                                do {
                                    do {
                                        object1 = channelSegment0.getState$kotlinx_coroutines_core(v1);
                                        if(object1 == BufferedChannelKt.g) {
                                            break alab1;
                                        }
                                        if(object1 != BufferedChannelKt.BUFFERED) {
                                            goto label_22;
                                        }
                                        if(v2 < this.getReceiversCounter$kotlinx_coroutines_core()) {
                                            break alab1;
                                        }
                                    }
                                    while(!channelSegment0.casState$kotlinx_coroutines_core(v1, object1, BufferedChannelKt.getCHANNEL_CLOSED()));
                                    if(function10 != null) {
                                        throwable0 = OnUndeliveredElementKt.callUndeliveredElementCatchingException(function10, channelSegment0.getElement$kotlinx_coroutines_core(v1), ((UndeliveredElementException)throwable0));
                                    }
                                    channelSegment0.cleanElement$kotlinx_coroutines_core(v1);
                                    channelSegment0.onSlotCleaned();
                                    break;
                                label_22:
                                    if(object1 == BufferedChannelKt.c || object1 == null) {
                                        continue alab2;
                                    }
                                    if(object1 instanceof Waiter || object1 instanceof r1) {
                                        goto label_27;
                                    }
                                    if(object1 == BufferedChannelKt.e || object1 == BufferedChannelKt.d) {
                                        break alab1;
                                    }
                                }
                                while(object1 == BufferedChannelKt.e);
                                goto label_38;
                            label_27:
                                if(v2 < this.getReceiversCounter$kotlinx_coroutines_core()) {
                                    break alab1;
                                }
                                waiter0 = object1 instanceof r1 ? ((r1)object1).a : ((Waiter)object1);
                            }
                            while(!channelSegment0.casState$kotlinx_coroutines_core(v1, object1, BufferedChannelKt.getCHANNEL_CLOSED()));
                            if(function10 != null) {
                                throwable0 = OnUndeliveredElementKt.callUndeliveredElementCatchingException(function10, channelSegment0.getElement$kotlinx_coroutines_core(v1), ((UndeliveredElementException)throwable0));
                            }
                            object0 = InlineList.plus-FjFbRPM(object0, waiter0);
                            channelSegment0.cleanElement$kotlinx_coroutines_core(v1);
                            channelSegment0.onSlotCleaned();
                            goto label_38;
                        }
                        while(!channelSegment0.casState$kotlinx_coroutines_core(v1, object1, BufferedChannelKt.getCHANNEL_CLOSED()));
                        channelSegment0.onSlotCleaned();
                    label_38:
                        --v1;
                    }
                    channelSegment0 = (ChannelSegment)channelSegment0.getPrev();
                }
                while(channelSegment0 != null);
                if(object0 != null) {
                    if(object0 instanceof ArrayList) {
                        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                        for(int v3 = ((ArrayList)object0).size() - 1; -1 < v3; --v3) {
                            this.o(((Waiter)((ArrayList)object0).get(v3)), false);
                        }
                    }
                    else {
                        this.o(((Waiter)object0), false);
                    }
                }
                if(throwable0 != null) {
                    throw throwable0;
                }
                return true;
            }
            default: {
                throw new IllegalStateException(("unexpected close status: " + ((int)(v >> 60))).toString());
            }
        }
    }

    @Nullable
    public final Throwable getCloseCause() {
        return (Throwable)BufferedChannel.j.get(this);
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public SelectClause1 getOnReceive() {
        Intrinsics.checkNotNull(i.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function30 = (Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(i.a, 3);
        Intrinsics.checkNotNull(j.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'param\')] kotlin.Any?, @[ParameterName(name = \'clauseResult\')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, function30, ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(j.a, 3)), this.b);
    }

    public static void getOnReceive$annotations() {
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public SelectClause1 getOnReceiveCatching() {
        Intrinsics.checkNotNull(k.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function30 = (Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(k.a, 3);
        Intrinsics.checkNotNull(l.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'param\')] kotlin.Any?, @[ParameterName(name = \'clauseResult\')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, function30, ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(l.a, 3)), this.b);
    }

    public static void getOnReceiveCatching$annotations() {
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public SelectClause1 getOnReceiveOrNull() {
        Intrinsics.checkNotNull(m.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function30 = (Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(m.a, 3);
        Intrinsics.checkNotNull(n.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'param\')] kotlin.Any?, @[ParameterName(name = \'clauseResult\')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, function30, ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(n.a, 3)), this.b);
    }

    public static void getOnReceiveOrNull$annotations() {
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public SelectClause2 getOnSend() {
        Intrinsics.checkNotNull(o.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Object object0 = TypeIntrinsics.beforeCheckcastToFunctionOfArity(o.a, 3);
        Intrinsics.checkNotNull(p.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'param\')] kotlin.Any?, @[ParameterName(name = \'clauseResult\')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause2Impl(this, ((Function3)object0), ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(p.a, 3)), null, 8, null);
    }

    public static void getOnSend$annotations() {
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return BufferedChannel.d.get(this);
    }

    @NotNull
    public final Throwable getSendException() {
        Throwable throwable0 = this.getCloseCause();
        return throwable0 == null ? new ClosedSendChannelException("Channel was closed") : throwable0;
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return BufferedChannel.c.get(this) & 0xFFFFFFFFFFFFFFFL;
    }

    public final boolean h() {
        long v = BufferedChannel.e.get(this);
        return v == 0L || v == 0x7FFFFFFFFFFFFFFFL;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = BufferedChannel.h;
            ChannelSegment channelSegment0 = (ChannelSegment)atomicReferenceFieldUpdater0.get(this);
            long v = this.getReceiversCounter$kotlinx_coroutines_core();
            if(Long.compare(this.getSendersCounter$kotlinx_coroutines_core(), v) <= 0) {
                return false;
            }
            int v1 = BufferedChannelKt.SEGMENT_SIZE;
            long v2 = v / ((long)v1);
            if(channelSegment0.id != v2) {
                ChannelSegment channelSegment1 = this.d(v2, channelSegment0);
                if(channelSegment1 == null) {
                    if(((ChannelSegment)atomicReferenceFieldUpdater0.get(this)).id >= v2) {
                        continue;
                    }
                    return false;
                }
                else {
                    channelSegment0 = channelSegment1;
                }
            }
            channelSegment0.cleanPrev();
            int v3 = (int)(v % ((long)v1));
            while(true) {
                Object object0 = channelSegment0.getState$kotlinx_coroutines_core(v3);
                if(object0 != null && object0 != BufferedChannelKt.c) {
                    if(object0 != BufferedChannelKt.BUFFERED && (object0 == BufferedChannelKt.h || object0 == BufferedChannelKt.getCHANNEL_CLOSED() || object0 == BufferedChannelKt.g || object0 == BufferedChannelKt.f || object0 != BufferedChannelKt.e && (object0 == BufferedChannelKt.d || v != this.getReceiversCounter$kotlinx_coroutines_core()))) {
                        break;
                    }
                    return true;
                }
                if(channelSegment0.casState$kotlinx_coroutines_core(v3, object0, BufferedChannelKt.f)) {
                    this.c();
                    break;
                }
            }
            BufferedChannel.d.compareAndSet(this, v, v + 1L);
        }
    }

    public final void i(long v, ChannelSegment channelSegment0) {
        while(channelSegment0.id < v) {
            ChannelSegment channelSegment1 = (ChannelSegment)channelSegment0.getNext();
            if(channelSegment1 == null) {
                break;
            }
            channelSegment0 = channelSegment1;
        }
    alab1:
        while(true) {
            if(channelSegment0.isRemoved()) {
                ChannelSegment channelSegment2 = (ChannelSegment)channelSegment0.getNext();
                if(channelSegment2 != null) {
                    channelSegment0 = channelSegment2;
                    continue;
                }
            }
            while(true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = BufferedChannel.i;
                Segment segment0 = (Segment)atomicReferenceFieldUpdater0.get(this);
                if(segment0.id >= channelSegment0.id) {
                    break alab1;
                }
                if(!channelSegment0.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, segment0, channelSegment0)) {
                        if(!segment0.decPointers$kotlinx_coroutines_core()) {
                            break alab1;
                        }
                        segment0.remove();
                        return;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == segment0);
                if(channelSegment0.decPointers$kotlinx_coroutines_core()) {
                    channelSegment0.remove();
                }
            }
        }
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(@NotNull Function1 function10) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = BufferedChannel.k;
            if(atomicReferenceFieldUpdater0.compareAndSet(this, null, function10)) {
                return;
            }
        }
        while(atomicReferenceFieldUpdater0.get(this) == null);
        Object object0;
        while((object0 = atomicReferenceFieldUpdater0.get(this)) == BufferedChannelKt.o) {
            Symbol symbol0 = BufferedChannelKt.o;
            Symbol symbol1 = BufferedChannelKt.p;
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, symbol0, symbol1)) {
                    function10.invoke(this.getCloseCause());
                    return;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == symbol0);
        }
        throw object0 == BufferedChannelKt.p ? new IllegalStateException("Another handler was already registered and successfully invoked") : new IllegalStateException(("Another handler is already registered: " + object0).toString());
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return this.g(BufferedChannel.c.get(this), true);
    }

    @ExperimentalCoroutinesApi
    public static void isClosedForReceive$annotations() {
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.g(BufferedChannel.c.get(this), false);
    }

    @ExperimentalCoroutinesApi
    public static void isClosedForSend$annotations() {
    }

    public boolean isConflatedDropOldest() {
        return false;
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if(this.isClosedForReceive()) {
            return false;
        }
        return this.hasElements$kotlinx_coroutines_core() ? false : !this.isClosedForReceive();
    }

    @ExperimentalCoroutinesApi
    public static void isEmpty$annotations() {
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public ChannelIterator iterator() {
        return new b(this);
    }

    public final void j(SelectInstance selectInstance0, Object object0) {
        Function1 function10 = this.onUndeliveredElement;
        if(function10 != null) {
            OnUndeliveredElementKt.callUndeliveredElement(function10, object0, selectInstance0.getContext());
        }
        selectInstance0.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    public final Object k(Object object0, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        Function1 function10 = this.onUndeliveredElement;
        if(function10 == null) {
            cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(this.getSendException())));
        }
        else {
            UndeliveredElementException undeliveredElementException0 = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function10, object0, null, 2, null);
            if(undeliveredElementException0 == null) {
                cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(this.getSendException())));
            }
            else {
                md.b.addSuppressed(undeliveredElementException0, this.getSendException());
                cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(undeliveredElementException0)));
            }
        }
        Object object1 = cancellableContinuationImpl0.getResult();
        if(object1 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    public static Object l(BufferedChannel bufferedChannel0, Continuation continuation0) {
        q q0;
        if(continuation0 instanceof q) {
            q0 = (q)continuation0;
            int v = q0.q;
            if((v & 0x80000000) == 0) {
                q0 = new q(bufferedChannel0, continuation0);
            }
            else {
                q0.q = v ^ 0x80000000;
            }
        }
        else {
            q0 = new q(bufferedChannel0, continuation0);
        }
        Object object0 = q0.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(q0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.h.get(bufferedChannel0);
                while(true) {
                    if(bufferedChannel0.isClosedForReceive()) {
                        Throwable throwable0 = bufferedChannel0.getCloseCause();
                        return ChannelResult.Companion.closed-JP2dKIU(throwable0);
                    }
                    long v1 = BufferedChannel.d.getAndIncrement(bufferedChannel0);
                    long v2 = v1 / ((long)BufferedChannelKt.SEGMENT_SIZE);
                    int v3 = (int)(v1 % ((long)BufferedChannelKt.SEGMENT_SIZE));
                    if(channelSegment0.id != v2) {
                        ChannelSegment channelSegment1 = bufferedChannel0.d(v2, channelSegment0);
                        if(channelSegment1 == null) {
                            continue;
                        }
                        channelSegment0 = channelSegment1;
                    }
                    Object object2 = BufferedChannel.access$updateCellReceive(bufferedChannel0, channelSegment0, v3, v1, null);
                    if(object2 == BufferedChannelKt.access$getSUSPEND$p()) {
                        break;
                    }
                    if(object2 == BufferedChannelKt.m) {
                        if(v1 >= bufferedChannel0.getSendersCounter$kotlinx_coroutines_core()) {
                            continue;
                        }
                        channelSegment0.cleanPrev();
                        continue;
                    }
                    if(object2 == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) {
                        q0.q = 1;
                        Object object3 = bufferedChannel0.m(channelSegment0, v3, v1, q0);
                        return object3 == object1 ? object1 : object3;
                    }
                    channelSegment0.cleanPrev();
                    return ChannelResult.Companion.success-JP2dKIU(object2);
                }
                throw new IllegalStateException("unexpected");
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return ((ChannelResult)object0).unbox-impl();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object m(ChannelSegment channelSegment0, int v, long v1, Continuation continuation0) {
        ChannelResult channelResult0;
        r r0;
        if(continuation0 instanceof r) {
            r0 = (r)continuation0;
            int v2 = r0.q;
            if((v2 & 0x80000000) == 0) {
                r0 = new r(this, continuation0);
            }
            else {
                r0.q = v2 ^ 0x80000000;
            }
        }
        else {
            r0 = new r(this, continuation0);
        }
        Object object0 = r0.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                r0.q = 1;
                CancellableContinuationImpl cancellableContinuationImpl0 = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(r0));
                try {
                    Function1 function10 = null;
                    Intrinsics.checkNotNull(cancellableContinuationImpl0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$35>>");
                    n1 n10 = new n1(cancellableContinuationImpl0);
                    Object object2 = BufferedChannel.access$updateCellReceive(this, channelSegment0, v, v1, n10);
                    if(object2 == BufferedChannelKt.k) {
                        BufferedChannel.access$prepareReceiverForSuspension(this, n10, channelSegment0, v);
                    }
                    else {
                        if(object2 == BufferedChannelKt.m) {
                            if(v1 < this.getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment0.cleanPrev();
                            }
                            ChannelSegment channelSegment1 = (ChannelSegment)BufferedChannel.h.get(this);
                            while(!this.isClosedForReceive()) {
                                long v3 = BufferedChannel.d.getAndIncrement(this);
                                long v4 = v3 / ((long)BufferedChannelKt.SEGMENT_SIZE);
                                int v5 = (int)(v3 % ((long)BufferedChannelKt.SEGMENT_SIZE));
                                if(channelSegment1.id != v4) {
                                    ChannelSegment channelSegment2 = this.d(v4, channelSegment1);
                                    if(channelSegment2 == null) {
                                        continue;
                                    }
                                    channelSegment1 = channelSegment2;
                                }
                                Object object3 = BufferedChannel.access$updateCellReceive(this, channelSegment1, v5, v3, n10);
                                if(object3 == BufferedChannelKt.k) {
                                    BufferedChannel.access$prepareReceiverForSuspension(this, n10, channelSegment1, v5);
                                    goto label_63;
                                }
                                if(object3 == BufferedChannelKt.m) {
                                    if(v3 >= this.getSendersCounter$kotlinx_coroutines_core()) {
                                        continue;
                                    }
                                    channelSegment1.cleanPrev();
                                    continue;
                                }
                                if(object3 == BufferedChannelKt.l) {
                                    throw new IllegalStateException("unexpected");
                                }
                                channelSegment1.cleanPrev();
                                channelResult0 = ChannelResult.box-impl(ChannelResult.Companion.success-JP2dKIU(object3));
                                Function1 function11 = this.onUndeliveredElement;
                                if(function11 != null) {
                                    function10 = OnUndeliveredElementKt.bindCancellationFun(function11, object3, cancellableContinuationImpl0.getContext());
                                }
                                goto label_56;
                            }
                            BufferedChannel.access$onClosedReceiveCatchingOnNoWaiterSuspend(this, cancellableContinuationImpl0);
                            goto label_63;
                        }
                        else {
                            channelSegment0.cleanPrev();
                            channelResult0 = ChannelResult.box-impl(ChannelResult.Companion.success-JP2dKIU(object2));
                            Function1 function12 = this.onUndeliveredElement;
                            if(function12 != null) {
                                function10 = OnUndeliveredElementKt.bindCancellationFun(function12, object2, cancellableContinuationImpl0.getContext());
                            }
                        }
                    label_56:
                        cancellableContinuationImpl0.resume(channelResult0, function10);
                    }
                }
                catch(Throwable throwable0) {
                    cancellableContinuationImpl0.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                    throw throwable0;
                }
            label_63:
                object0 = cancellableContinuationImpl0.getResult();
                if(object0 == a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(r0);
                }
                return object0 == object1 ? object1 : ((ChannelResult)object0).unbox-impl();
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return ((ChannelResult)object0).unbox-impl();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object n(ChannelSegment channelSegment0, int v, long v1, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0));
        try {
            Function1 function10 = null;
            Object object0 = BufferedChannel.access$updateCellReceive(this, channelSegment0, v, v1, cancellableContinuationImpl0);
            if(object0 == BufferedChannelKt.k) {
                BufferedChannel.access$prepareReceiverForSuspension(this, cancellableContinuationImpl0, channelSegment0, v);
            }
            else if(object0 == BufferedChannelKt.m) {
                if(v1 < this.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment0.cleanPrev();
                }
                ChannelSegment channelSegment1 = (ChannelSegment)BufferedChannel.h.get(this);
                while(!this.isClosedForReceive()) {
                    long v2 = BufferedChannel.d.getAndIncrement(this);
                    long v3 = v2 / ((long)BufferedChannelKt.SEGMENT_SIZE);
                    int v4 = (int)(v2 % ((long)BufferedChannelKt.SEGMENT_SIZE));
                    if(channelSegment1.id != v3) {
                        ChannelSegment channelSegment2 = this.d(v3, channelSegment1);
                        if(channelSegment2 == null) {
                            continue;
                        }
                        channelSegment1 = channelSegment2;
                    }
                    object0 = BufferedChannel.access$updateCellReceive(this, channelSegment1, v4, v2, cancellableContinuationImpl0);
                    if(object0 == BufferedChannelKt.k) {
                        goto label_31;
                    }
                    if(object0 == BufferedChannelKt.m) {
                        if(v2 >= this.getSendersCounter$kotlinx_coroutines_core()) {
                            continue;
                        }
                        channelSegment1.cleanPrev();
                        continue;
                    }
                    if(object0 == BufferedChannelKt.l) {
                        throw new IllegalStateException("unexpected");
                    }
                    channelSegment1.cleanPrev();
                    Function1 function11 = this.onUndeliveredElement;
                    if(function11 == null) {
                        cancellableContinuationImpl0.resume(object0, null);
                        goto label_49;
                    label_31:
                        if(cancellableContinuationImpl0 != null) {
                            function10 = cancellableContinuationImpl0;
                        }
                        if(function10 != null) {
                            BufferedChannel.access$prepareReceiverForSuspension(this, ((Waiter)function10), channelSegment1, v4);
                        }
                    }
                    else {
                        cancellableContinuationImpl0.resume(object0, OnUndeliveredElementKt.bindCancellationFun(function11, object0, cancellableContinuationImpl0.getContext()));
                    }
                    goto label_49;
                }
                BufferedChannel.access$onClosedReceiveOnNoWaiterSuspend(this, cancellableContinuationImpl0);
            }
            else {
                channelSegment0.cleanPrev();
                Function1 function12 = this.onUndeliveredElement;
                if(function12 != null) {
                    function10 = OnUndeliveredElementKt.bindCancellationFun(function12, object0, cancellableContinuationImpl0.getContext());
                }
                cancellableContinuationImpl0.resume(object0, function10);
            }
        }
        catch(Throwable throwable0) {
            cancellableContinuationImpl0.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw throwable0;
        }
    label_49:
        Object object1 = cancellableContinuationImpl0.getResult();
        if(object1 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1;
    }

    public final void o(Waiter waiter0, boolean z) {
        if(waiter0 instanceof h) {
            ((h)waiter0).a.resumeWith(Boolean.FALSE);
            return;
        }
        if(waiter0 instanceof CancellableContinuation) {
            ((Continuation)waiter0).resumeWith(Result.constructor-impl(ResultKt.createFailure((z ? this.e() : this.getSendException()))));
            return;
        }
        if(waiter0 instanceof n1) {
            Throwable throwable0 = this.getCloseCause();
            Object object0 = Result.constructor-impl(ChannelResult.box-impl(ChannelResult.Companion.closed-JP2dKIU(throwable0)));
            ((n1)waiter0).a.resumeWith(object0);
            return;
        }
        if(waiter0 instanceof b) {
            CancellableContinuationImpl cancellableContinuationImpl0 = ((b)waiter0).b;
            Intrinsics.checkNotNull(cancellableContinuationImpl0);
            ((b)waiter0).b = null;
            ((b)waiter0).a = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable throwable1 = ((b)waiter0).c.getCloseCause();
            if(throwable1 == null) {
                cancellableContinuationImpl0.resumeWith(Boolean.FALSE);
                return;
            }
            cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable1)));
            return;
        }
        if(!(waiter0 instanceof SelectInstance)) {
            throw new IllegalStateException(("Unexpected waiter: " + waiter0).toString());
        }
        ((SelectInstance)waiter0).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of \'trySend\' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(Object object0) {
        return DefaultImpls.offer(this, object0);
    }

    public void onClosedIdempotent() {
    }

    public void onReceiveDequeued() {
    }

    public void onReceiveEnqueued() {
    }

    public final Object p(ChannelSegment channelSegment0, int v, Object object0, long v1, Continuation continuation0) {
        Unit unit0;
        ChannelSegment channelSegment3;
        CancellableContinuationImpl cancellableContinuationImpl0 = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0));
        try {
        alab1:
            switch(BufferedChannel.access$updateCellSend(this, channelSegment0, v, object0, v1, cancellableContinuationImpl0, false)) {
                case 0: {
                    channelSegment0.cleanPrev();
                    unit0 = Unit.INSTANCE;
                    break;
                }
                case 1: {
                    unit0 = Unit.INSTANCE;
                    break;
                }
                case 2: {
                    BufferedChannel.access$prepareSenderForSuspension(this, cancellableContinuationImpl0, channelSegment0, v);
                    goto label_55;
                }
                case 4: {
                    if(v1 < this.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment0.cleanPrev();
                    }
                    BufferedChannel.access$onClosedSendOnNoWaiterSuspend(this, object0, cancellableContinuationImpl0);
                    goto label_55;
                }
                case 5: {
                    channelSegment0.cleanPrev();
                    ChannelSegment channelSegment1 = (ChannelSegment)BufferedChannel.g.get(this);
                    while(true) {
                        long v2 = BufferedChannel.c.getAndIncrement(this);
                        long v3 = v2 & 0xFFFFFFFFFFFFFFFL;
                        boolean z = BufferedChannel.access$isClosedForSend0(this, v2);
                        long v4 = v3 / ((long)BufferedChannelKt.SEGMENT_SIZE);
                        int v5 = (int)(v3 % ((long)BufferedChannelKt.SEGMENT_SIZE));
                        if(channelSegment1.id == v4) {
                        label_17:
                            channelSegment3 = channelSegment1;
                        }
                        else {
                            ChannelSegment channelSegment2 = BufferedChannel.access$findSegmentSend(this, v4, channelSegment1);
                            if(channelSegment2 == null) {
                                if(!z) {
                                    continue;
                                }
                                BufferedChannel.access$onClosedSendOnNoWaiterSuspend(this, object0, cancellableContinuationImpl0);
                                goto label_55;
                            }
                            else {
                                channelSegment3 = channelSegment2;
                                goto label_18;
                            }
                            goto label_17;
                        }
                    label_18:
                        switch(BufferedChannel.access$updateCellSend(this, channelSegment3, v5, object0, v3, cancellableContinuationImpl0, z)) {
                            case 0: {
                                channelSegment3.cleanPrev();
                                unit0 = Unit.INSTANCE;
                                break alab1;
                            }
                            case 1: {
                                unit0 = Unit.INSTANCE;
                                break alab1;
                            }
                            case 2: {
                                if(z) {
                                    channelSegment3.onSlotCleaned();
                                    BufferedChannel.access$onClosedSendOnNoWaiterSuspend(this, object0, cancellableContinuationImpl0);
                                    goto label_55;
                                }
                                CancellableContinuationImpl cancellableContinuationImpl1 = cancellableContinuationImpl0 == null ? null : cancellableContinuationImpl0;
                                if(cancellableContinuationImpl1 == null) {
                                    goto label_55;
                                }
                                BufferedChannel.access$prepareSenderForSuspension(this, cancellableContinuationImpl1, channelSegment3, v5);
                                goto label_55;
                            }
                            case 3: {
                                throw new IllegalStateException("unexpected");
                            }
                            case 4: {
                                if(v3 < this.getReceiversCounter$kotlinx_coroutines_core()) {
                                    channelSegment3.cleanPrev();
                                }
                                BufferedChannel.access$onClosedSendOnNoWaiterSuspend(this, object0, cancellableContinuationImpl0);
                                goto label_55;
                            }
                            case 5: {
                                channelSegment3.cleanPrev();
                            }
                        }
                        channelSegment1 = channelSegment3;
                    }
                }
                default: {
                    throw new IllegalStateException("unexpected");
                }
            }
            cancellableContinuationImpl0.resumeWith(unit0);
        }
        catch(Throwable throwable0) {
            cancellableContinuationImpl0.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw throwable0;
        }
    label_55:
        Object object1 = cancellableContinuationImpl0.getResult();
        if(object1 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of \'tryReceive\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'poll\' did, for the precise replacement please refer to the \'poll\' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public Object poll() {
        return DefaultImpls.poll(this);
    }

    public final boolean q(Object object0, Object object1) {
        Function1 function10 = null;
        if(object0 instanceof SelectInstance) {
            return ((SelectInstance)object0).trySelect(this, object1);
        }
        if(object0 instanceof n1) {
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuationImpl cancellableContinuationImpl0 = ((n1)object0).a;
            ChannelResult channelResult0 = ChannelResult.box-impl(ChannelResult.Companion.success-JP2dKIU(object1));
            Function1 function11 = this.onUndeliveredElement;
            if(function11 != null) {
                function10 = OnUndeliveredElementKt.bindCancellationFun(function11, object1, ((n1)object0).a.getContext());
            }
            return BufferedChannelKt.access$tryResume0(cancellableContinuationImpl0, channelResult0, function10);
        }
        if(object0 instanceof b) {
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuationImpl cancellableContinuationImpl1 = ((b)object0).b;
            Intrinsics.checkNotNull(cancellableContinuationImpl1);
            ((b)object0).b = null;
            ((b)object0).a = object1;
            Function1 function12 = ((b)object0).c.onUndeliveredElement;
            if(function12 != null) {
                function10 = OnUndeliveredElementKt.bindCancellationFun(function12, object1, cancellableContinuationImpl1.getContext());
            }
            return BufferedChannelKt.access$tryResume0(cancellableContinuationImpl1, Boolean.TRUE, function10);
        }
        if(!(object0 instanceof CancellableContinuation)) {
            throw new IllegalStateException(("Unexpected receiver type: " + object0).toString());
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        Function1 function13 = this.onUndeliveredElement;
        if(function13 != null) {
            function10 = OnUndeliveredElementKt.bindCancellationFun(function13, object1, ((CancellableContinuation)object0).getContext());
        }
        return BufferedChannelKt.access$tryResume0(((CancellableContinuation)object0), object1, function10);
    }

    public final boolean r(Object object0, ChannelSegment channelSegment0, int v) {
        if(object0 instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            Object object1 = ((CancellableContinuation)object0).tryResume(Unit.INSTANCE, null, null);
            if(object1 == null) {
                return false;
            }
            ((CancellableContinuation)object0).completeResume(object1);
            return true;
        }
        if(object0 instanceof SelectInstance) {
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult trySelectDetailedResult0 = ((SelectImplementation)object0).trySelectDetailed(this, Unit.INSTANCE);
            if(trySelectDetailedResult0 == TrySelectDetailedResult.REREGISTER) {
                channelSegment0.cleanElement$kotlinx_coroutines_core(v);
            }
            return trySelectDetailedResult0 == TrySelectDetailedResult.SUCCESSFUL;
        }
        if(!(object0 instanceof h)) {
            throw new IllegalStateException(("Unexpected waiter: " + object0).toString());
        }
        CancellableContinuationImpl cancellableContinuationImpl0 = ((h)object0).a;
        Object object2 = cancellableContinuationImpl0.tryResume(Boolean.TRUE, null, null);
        if(object2 != null) {
            cancellableContinuationImpl0.completeResume(object2);
            return true;
        }
        return false;
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    public Object receive(@NotNull Continuation continuation0) {
        ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.h.get(this);
        while(!this.isClosedForReceive()) {
            long v = BufferedChannel.d.getAndIncrement(this);
            long v1 = v / ((long)BufferedChannelKt.SEGMENT_SIZE);
            int v2 = (int)(v % ((long)BufferedChannelKt.SEGMENT_SIZE));
            if(channelSegment0.id != v1) {
                ChannelSegment channelSegment1 = this.d(v1, channelSegment0);
                if(channelSegment1 == null) {
                    continue;
                }
                channelSegment0 = channelSegment1;
            }
            Object object0 = BufferedChannel.access$updateCellReceive(this, channelSegment0, v2, v, null);
            if(object0 == BufferedChannelKt.k) {
                throw new IllegalStateException("unexpected");
            }
            if(object0 == BufferedChannelKt.m) {
                if(v >= this.getSendersCounter$kotlinx_coroutines_core()) {
                    continue;
                }
                channelSegment0.cleanPrev();
                continue;
            }
            if(object0 == BufferedChannelKt.l) {
                return this.n(channelSegment0, v2, v, continuation0);
            }
            channelSegment0.cleanPrev();
            return object0;
        }
        throw StackTraceRecoveryKt.recoverStackTrace(this.e());
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    public Object receiveCatching-JP2dKIU(@NotNull Continuation continuation0) {
        return BufferedChannel.l(this, continuation0);
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of \'receiveCatching\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'receiveOrNull\' did, for the detailed replacement please refer to the \'receiveOrNull\' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    @Nullable
    public Object receiveOrNull(@NotNull Continuation continuation0) {
        return DefaultImpls.receiveOrNull(this, continuation0);
    }

    public void registerSelectForSend(@NotNull SelectInstance selectInstance0, @Nullable Object object0) {
        int v3;
        ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.g.get(this);
    alab1:
        while(true) {
            long v = BufferedChannel.c.getAndIncrement(this);
            long v1 = 0xFFFFFFFFFFFFFFFL & v;
            boolean z = BufferedChannel.access$isClosedForSend0(this, v);
            long v2 = v1 / ((long)BufferedChannelKt.SEGMENT_SIZE);
            v3 = (int)(v1 % ((long)BufferedChannelKt.SEGMENT_SIZE));
            if(channelSegment0.id != v2) {
                ChannelSegment channelSegment1 = BufferedChannel.access$findSegmentSend(this, v2, channelSegment0);
                if(channelSegment1 == null) {
                    if(!z) {
                        continue;
                    }
                    this.j(selectInstance0, object0);
                    return;
                }
                else {
                    channelSegment0 = channelSegment1;
                }
            }
            switch(BufferedChannel.access$updateCellSend(this, channelSegment0, v3, object0, v1, selectInstance0, z)) {
                case 0: {
                    channelSegment0.cleanPrev();
                    selectInstance0.selectInRegistrationPhase(Unit.INSTANCE);
                    return;
                }
                case 1: {
                    selectInstance0.selectInRegistrationPhase(Unit.INSTANCE);
                    return;
                }
                case 2: {
                    goto label_22;
                }
                case 3: {
                    throw new IllegalStateException("unexpected");
                }
                case 4: {
                    break alab1;
                }
                case 5: {
                    channelSegment0.cleanPrev();
                }
            }
        }
        if(v1 >= this.getReceiversCounter$kotlinx_coroutines_core()) {
            this.j(selectInstance0, object0);
            return;
        }
        channelSegment0.cleanPrev();
        this.j(selectInstance0, object0);
        return;
    label_22:
        if(z) {
            channelSegment0.onSlotCleaned();
            this.j(selectInstance0, object0);
            return;
        }
        Waiter waiter0 = selectInstance0 instanceof Waiter ? ((Waiter)selectInstance0) : null;
        if(waiter0 != null) {
            BufferedChannel.access$prepareSenderForSuspension(this, waiter0, channelSegment0, v3);
        }
    }

    public final Object s(ChannelSegment channelSegment0, int v, Object object0, long v1) {
        Waiter waiter0;
        Object object1 = channelSegment0.getState$kotlinx_coroutines_core(v);
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = BufferedChannel.c;
        if(object1 == null) {
            if(v1 >= (atomicLongFieldUpdater0.get(this) & 0xFFFFFFFFFFFFFFFL)) {
                if(object0 == null) {
                    return BufferedChannelKt.l;
                }
                if(channelSegment0.casState$kotlinx_coroutines_core(v, null, object0)) {
                    this.c();
                    return BufferedChannelKt.k;
                }
            }
        }
        else if(object1 == BufferedChannelKt.BUFFERED && channelSegment0.casState$kotlinx_coroutines_core(v, object1, BufferedChannelKt.g)) {
            this.c();
            return channelSegment0.retrieveElement$kotlinx_coroutines_core(v);
        }
        do {
            while(true) {
            alab1:
                while(true) {
                    do {
                        waiter0 = channelSegment0.getState$kotlinx_coroutines_core(v);
                        if(waiter0 == null || waiter0 == BufferedChannelKt.c) {
                            break alab1;
                        }
                        if(waiter0 != BufferedChannelKt.BUFFERED) {
                            goto label_18;
                        }
                    }
                    while(!channelSegment0.casState$kotlinx_coroutines_core(v, waiter0, BufferedChannelKt.g));
                    this.c();
                    return channelSegment0.retrieveElement$kotlinx_coroutines_core(v);
                label_18:
                    if(waiter0 == BufferedChannelKt.h) {
                        return BufferedChannelKt.m;
                    }
                    if(waiter0 == BufferedChannelKt.f) {
                        return BufferedChannelKt.m;
                    }
                    if(waiter0 == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        this.c();
                        return BufferedChannelKt.m;
                    }
                    if(waiter0 != BufferedChannelKt.e && channelSegment0.casState$kotlinx_coroutines_core(v, waiter0, BufferedChannelKt.d)) {
                        boolean z = waiter0 instanceof r1;
                        if(z) {
                            waiter0 = ((r1)waiter0).a;
                        }
                        if(this.r(waiter0, channelSegment0, v)) {
                            channelSegment0.setState$kotlinx_coroutines_core(v, BufferedChannelKt.g);
                            this.c();
                            return channelSegment0.retrieveElement$kotlinx_coroutines_core(v);
                        }
                        channelSegment0.setState$kotlinx_coroutines_core(v, BufferedChannelKt.h);
                        channelSegment0.onCancelledRequest(v, false);
                        if(z) {
                            this.c();
                        }
                        return BufferedChannelKt.m;
                    }
                }
                if(v1 >= (atomicLongFieldUpdater0.get(this) & 0xFFFFFFFFFFFFFFFL)) {
                    break;
                }
                if(channelSegment0.casState$kotlinx_coroutines_core(v, waiter0, BufferedChannelKt.f)) {
                    this.c();
                    return BufferedChannelKt.m;
                }
            }
            if(object0 == null) {
                return BufferedChannelKt.l;
            }
        }
        while(!channelSegment0.casState$kotlinx_coroutines_core(v, waiter0, object0));
        this.c();
        return BufferedChannelKt.k;
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @Nullable
    public Object send(Object object0, @NotNull Continuation continuation0) {
        Unit unit0;
        ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.g.get(this);
    alab1:
        while(true) {
            long v = BufferedChannel.c.getAndIncrement(this);
            long v1 = 0xFFFFFFFFFFFFFFFL & v;
            boolean z = BufferedChannel.access$isClosedForSend0(this, v);
            long v2 = v1 / ((long)BufferedChannelKt.SEGMENT_SIZE);
            int v3 = (int)(v1 % ((long)BufferedChannelKt.SEGMENT_SIZE));
            if(channelSegment0.id != v2) {
                ChannelSegment channelSegment1 = BufferedChannel.access$findSegmentSend(this, v2, channelSegment0);
                if(channelSegment1 == null) {
                    if(!z) {
                        continue;
                    }
                    unit0 = this.k(object0, continuation0);
                    return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
                }
                else {
                    channelSegment0 = channelSegment1;
                }
            }
            switch(BufferedChannel.access$updateCellSend(this, channelSegment0, v3, object0, v1, null, z)) {
                case 0: {
                    channelSegment0.cleanPrev();
                    return Unit.INSTANCE;
                }
                case 1: {
                    return Unit.INSTANCE;
                }
                case 2: {
                    break alab1;
                }
                case 3: {
                    unit0 = this.p(channelSegment0, v3, object0, v1, continuation0);
                    return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
                }
                case 4: {
                    if(v1 < this.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment0.cleanPrev();
                    }
                    unit0 = this.k(object0, continuation0);
                    return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
                }
                case 5: {
                    channelSegment0.cleanPrev();
                }
            }
        }
        if(z) {
            channelSegment0.onSlotCleaned();
            unit0 = this.k(object0, continuation0);
            return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public Object sendBroadcast$kotlinx_coroutines_core(Object object0, @NotNull Continuation continuation0) {
        ChannelSegment channelSegment2;
        int v3;
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        if(this.onUndeliveredElement != null) {
            throw new IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`");
        }
        h h0 = new h(cancellableContinuationImpl0);
        ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.g.get(this);
    alab1:
        while(true) {
            long v = BufferedChannel.c.getAndIncrement(this);
            long v1 = v & 0xFFFFFFFFFFFFFFFL;
            boolean z = BufferedChannel.access$isClosedForSend0(this, v);
            long v2 = v1 / ((long)BufferedChannelKt.SEGMENT_SIZE);
            v3 = (int)(v1 % ((long)BufferedChannelKt.SEGMENT_SIZE));
            if(Long.compare(channelSegment0.id, v2) == 0) {
            label_17:
                channelSegment2 = channelSegment0;
            }
            else {
                ChannelSegment channelSegment1 = BufferedChannel.access$findSegmentSend(this, v2, channelSegment0);
                if(channelSegment1 == null) {
                    if(!z) {
                        continue;
                    }
                    cancellableContinuationImpl0.resumeWith(Boxing.boxBoolean(false));
                    goto label_36;
                }
                else {
                    channelSegment2 = channelSegment1;
                    goto label_18;
                }
                goto label_17;
            }
        label_18:
            switch(BufferedChannel.access$updateCellSend(this, channelSegment2, v3, object0, v1, h0, z)) {
                case 0: {
                    goto label_34;
                }
                case 1: {
                    goto label_35;
                }
                case 2: {
                    goto label_28;
                }
                case 3: {
                    throw new IllegalStateException("unexpected");
                }
                case 4: {
                    break alab1;
                }
                case 5: {
                    channelSegment2.cleanPrev();
                    channelSegment0 = channelSegment2;
                    break;
                }
                default: {
                    channelSegment0 = channelSegment2;
                    break;
                }
            }
        }
        if(v1 < this.getReceiversCounter$kotlinx_coroutines_core()) {
            channelSegment2.cleanPrev();
        }
        cancellableContinuationImpl0.resumeWith(Boxing.boxBoolean(false));
        goto label_36;
    label_28:
        if(z) {
            channelSegment2.onSlotCleaned();
            cancellableContinuationImpl0.resumeWith(Boxing.boxBoolean(false));
        }
        else {
            BufferedChannel.access$prepareSenderForSuspension(this, h0, channelSegment2, v3);
            goto label_36;
        label_34:
            channelSegment2.cleanPrev();
        label_35:
            cancellableContinuationImpl0.resumeWith(Boxing.boxBoolean(true));
        }
    label_36:
        Object object1 = cancellableContinuationImpl0.getResult();
        if(object1 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1;
    }

    public final Object sendImpl(Object object0, @Nullable Object object1, @NotNull Function0 function00, @NotNull Function2 function20, @NotNull Function0 function01, @NotNull Function4 function40) {
        ChannelSegment channelSegment2;
        ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.g.get(this);
        while(true) {
            long v = BufferedChannel.c.getAndIncrement(this);
            long v1 = v & 0xFFFFFFFFFFFFFFFL;
            boolean z = BufferedChannel.access$isClosedForSend0(this, v);
            long v2 = v1 / ((long)BufferedChannelKt.SEGMENT_SIZE);
            int v3 = (int)(v1 % ((long)BufferedChannelKt.SEGMENT_SIZE));
            if(channelSegment0.id == v2) {
            label_13:
                channelSegment2 = channelSegment0;
            }
            else {
                ChannelSegment channelSegment1 = BufferedChannel.access$findSegmentSend(this, v2, channelSegment0);
                if(channelSegment1 == null) {
                    if(!z) {
                        continue;
                    }
                    return function01.invoke();
                }
                else {
                    channelSegment2 = channelSegment1;
                    goto label_14;
                }
                goto label_13;
            }
        label_14:
            switch(BufferedChannel.access$updateCellSend(this, channelSegment2, v3, object0, v1, object1, z)) {
                case 0: {
                    channelSegment2.cleanPrev();
                    return function00.invoke();
                }
                case 1: {
                    return function00.invoke();
                }
                case 2: {
                    if(z) {
                        channelSegment2.onSlotCleaned();
                        return function01.invoke();
                    }
                    Waiter waiter0 = object1 instanceof Waiter ? ((Waiter)object1) : null;
                    if(waiter0 != null) {
                        BufferedChannel.access$prepareSenderForSuspension(this, waiter0, channelSegment2, v3);
                    }
                    return function20.invoke(channelSegment2, v3);
                }
                case 3: {
                    return function40.invoke(channelSegment2, v3, object0, v1);
                }
                case 4: {
                    if(v1 < this.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment2.cleanPrev();
                    }
                    return function01.invoke();
                }
                case 5: {
                    channelSegment2.cleanPrev();
                }
            }
            channelSegment0 = channelSegment2;
        }
    }

    public static Object sendImpl$default(BufferedChannel bufferedChannel0, Object object0, Object object1, Function0 function00, Function2 function20, Function0 function01, Function4 function40, int v, Object object2) {
        ChannelSegment channelSegment2;
        if(object2 == null) {
            Function4 function41 = (v & 0x20) == 0 ? function40 : kotlinx.coroutines.channels.BufferedChannel.sendImpl.1.INSTANCE;
            ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.g.get(bufferedChannel0);
            while(true) {
                long v1 = BufferedChannel.c.getAndIncrement(bufferedChannel0);
                long v2 = v1 & 0xFFFFFFFFFFFFFFFL;
                boolean z = BufferedChannel.access$isClosedForSend0(bufferedChannel0, v1);
                long v3 = v2 / ((long)BufferedChannelKt.SEGMENT_SIZE);
                int v4 = (int)(v2 % ((long)BufferedChannelKt.SEGMENT_SIZE));
                if(channelSegment0.id == v3) {
                label_18:
                    channelSegment2 = channelSegment0;
                }
                else {
                    ChannelSegment channelSegment1 = BufferedChannel.access$findSegmentSend(bufferedChannel0, v3, channelSegment0);
                    if(channelSegment1 == null) {
                        if(!z) {
                            continue;
                        }
                        return function01.invoke();
                    }
                    else {
                        channelSegment2 = channelSegment1;
                        goto label_19;
                    }
                    goto label_18;
                }
            label_19:
                switch(BufferedChannel.access$updateCellSend(bufferedChannel0, channelSegment2, v4, object0, v2, object1, z)) {
                    case 0: {
                        channelSegment2.cleanPrev();
                        return function00.invoke();
                    }
                    case 1: {
                        return function00.invoke();
                    }
                    case 2: {
                        if(z) {
                            channelSegment2.onSlotCleaned();
                            return function01.invoke();
                        }
                        Waiter waiter0 = object1 instanceof Waiter ? ((Waiter)object1) : null;
                        if(waiter0 != null) {
                            BufferedChannel.access$prepareSenderForSuspension(bufferedChannel0, waiter0, channelSegment2, v4);
                        }
                        return function20.invoke(channelSegment2, v4);
                    }
                    case 3: {
                        return function41.invoke(channelSegment2, v4, object0, v2);
                    }
                    case 4: {
                        if(v2 < bufferedChannel0.getReceiversCounter$kotlinx_coroutines_core()) {
                            channelSegment2.cleanPrev();
                        }
                        return function01.invoke();
                    }
                    case 5: {
                        channelSegment2.cleanPrev();
                    }
                }
                channelSegment0 = channelSegment2;
            }
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");

        @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u0002H\u00032\u0006\u0010\t\u001A\u00020\nH\n¢\u0006\u0004\b\u000B\u0010\f"}, d2 = {"<anonymous>", "", "R", "E", "<anonymous parameter 0>", "Lkotlinx/coroutines/channels/ChannelSegment;", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "", "invoke", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;J)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,3055:1\n*E\n"})
        public final class kotlinx.coroutines.channels.BufferedChannel.sendImpl.1 extends Lambda implements Function4 {
            public static final kotlinx.coroutines.channels.BufferedChannel.sendImpl.1 INSTANCE;

            static {
                kotlinx.coroutines.channels.BufferedChannel.sendImpl.1.INSTANCE = new kotlinx.coroutines.channels.BufferedChannel.sendImpl.1();
            }

            public kotlinx.coroutines.channels.BufferedChannel.sendImpl.1() {
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                return this.invoke(((ChannelSegment)object0), ((Number)object1).intValue(), object2, ((Number)object3).longValue());
            }

            @NotNull
            public final Void invoke(@NotNull ChannelSegment channelSegment0, int v, Object object0, long v1) {
                throw new IllegalStateException("unexpected");
            }
        }

    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        long v = BufferedChannel.c.get(this);
        return this.g(v, false) ? false : !this.a(v & 0xFFFFFFFFFFFFFFFL);
    }

    public final int t(ChannelSegment channelSegment0, int v, Object object0, long v1, Object object1, boolean z) {
        Waiter waiter0;
        while(true) {
        alab1:
            while(true) {
                do {
                    do {
                        waiter0 = channelSegment0.getState$kotlinx_coroutines_core(v);
                        if(waiter0 != null) {
                            break alab1;
                        }
                        if(!this.a(v1) || z) {
                            goto label_5;
                        }
                    }
                    while(!channelSegment0.casState$kotlinx_coroutines_core(v, null, BufferedChannelKt.BUFFERED));
                    return 1;
                label_5:
                    if(!z) {
                        goto label_9;
                    }
                }
                while(!channelSegment0.casState$kotlinx_coroutines_core(v, null, BufferedChannelKt.h));
                channelSegment0.onCancelledRequest(v, false);
                return 4;
            label_9:
                if(object1 == null) {
                    return 3;
                }
                if(channelSegment0.casState$kotlinx_coroutines_core(v, null, object1)) {
                    return 2;
                }
            }
            if(waiter0 != BufferedChannelKt.c) {
                break;
            }
            if(channelSegment0.casState$kotlinx_coroutines_core(v, waiter0, BufferedChannelKt.BUFFERED)) {
                return 1;
            }
        }
        if(waiter0 == BufferedChannelKt.i) {
            channelSegment0.cleanElement$kotlinx_coroutines_core(v);
            return 5;
        }
        if(waiter0 == BufferedChannelKt.f) {
            channelSegment0.cleanElement$kotlinx_coroutines_core(v);
            return 5;
        }
        if(waiter0 == BufferedChannelKt.getCHANNEL_CLOSED()) {
            channelSegment0.cleanElement$kotlinx_coroutines_core(v);
            this.isClosedForSend();
            return 4;
        }
        channelSegment0.cleanElement$kotlinx_coroutines_core(v);
        if(waiter0 instanceof r1) {
            waiter0 = ((r1)waiter0).a;
        }
        if(this.q(waiter0, object0)) {
            channelSegment0.setState$kotlinx_coroutines_core(v, BufferedChannelKt.g);
            return 0;
        }
        if(channelSegment0.getAndSetState$kotlinx_coroutines_core(v, BufferedChannelKt.i) != BufferedChannelKt.i) {
            channelSegment0.onCancelledRequest(v, true);
        }
        return 5;
    }

    @Override
    @NotNull
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        switch(((int)(BufferedChannel.c.get(this) >> 60))) {
            case 2: {
                stringBuilder0.append("closed,");
                break;
            }
            case 3: {
                stringBuilder0.append("cancelled,");
            }
        }
        stringBuilder0.append("capacity=" + this.a + ',');
        stringBuilder0.append("data=[");
        Iterable iterable0 = CollectionsKt__CollectionsKt.listOf(new ChannelSegment[]{BufferedChannel.h.get(this), BufferedChannel.g.get(this), BufferedChannel.i.get(this)});
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((ChannelSegment)object0) != BufferedChannelKt.a) {
                arrayList0.add(object0);
            }
        }
        Iterator iterator1 = arrayList0.iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator1.next();
        if(iterator1.hasNext()) {
            long v = ((ChannelSegment)object1).id;
            while(true) {
                Object object2 = iterator1.next();
                long v1 = ((ChannelSegment)object2).id;
                if(v > v1) {
                    object1 = object2;
                    v = v1;
                }
                if(!iterator1.hasNext()) {
                    break;
                }
            }
        }
        ChannelSegment channelSegment0 = (ChannelSegment)object1;
        long v2 = this.getReceiversCounter$kotlinx_coroutines_core();
        long v3 = this.getSendersCounter$kotlinx_coroutines_core();
    alab1:
        do {
            int v4 = BufferedChannelKt.SEGMENT_SIZE;
            int v5 = 0;
            while(v5 < v4) {
                long v6 = channelSegment0.id * ((long)BufferedChannelKt.SEGMENT_SIZE) + ((long)v5);
                int v7 = Long.compare(v6, v3);
                if(v7 >= 0 && v6 >= v2) {
                    break alab1;
                }
                Object object3 = channelSegment0.getState$kotlinx_coroutines_core(v5);
                Object object4 = channelSegment0.getElement$kotlinx_coroutines_core(v5);
                if(object3 instanceof CancellableContinuation) {
                    int v8 = Long.compare(v6, v2);
                    if(v8 < 0 && v7 >= 0) {
                        s = "receive";
                    }
                    else if(v7 >= 0 || v8 < 0) {
                        s = "cont";
                    }
                    else {
                        s = "send";
                    }
                    goto label_72;
                }
                else if(object3 instanceof SelectInstance) {
                    int v9 = Long.compare(v6, v2);
                    if(v9 < 0 && v7 >= 0) {
                        s = "onReceive";
                    }
                    else if(v7 >= 0 || v9 < 0) {
                        s = "select";
                    }
                    else {
                        s = "onSend";
                    }
                    goto label_72;
                }
                else if(object3 instanceof n1) {
                    s = "receiveCatching";
                    goto label_72;
                }
                else if(object3 instanceof h) {
                    s = "sendBroadcast";
                    goto label_72;
                }
                else if(object3 instanceof r1) {
                    s = "EB(" + object3 + ')';
                    goto label_72;
                }
                else if((Intrinsics.areEqual(object3, BufferedChannelKt.d) ? true : Intrinsics.areEqual(object3, BufferedChannelKt.e))) {
                    s = "resuming_sender";
                    goto label_72;
                }
                else if(!((((((object3 == null ? true : Intrinsics.areEqual(object3, BufferedChannelKt.c)) ? true : Intrinsics.areEqual(object3, BufferedChannelKt.g)) ? true : Intrinsics.areEqual(object3, BufferedChannelKt.f)) ? true : Intrinsics.areEqual(object3, BufferedChannelKt.i)) ? true : Intrinsics.areEqual(object3, BufferedChannelKt.h)) ? true : Intrinsics.areEqual(object3, BufferedChannelKt.getCHANNEL_CLOSED()))) {
                    s = object3.toString();
                label_72:
                    if(object4 == null) {
                        stringBuilder0.append(s + ',');
                    }
                    else {
                        stringBuilder0.append("(" + s + ',' + object4 + "),");
                    }
                }
                ++v5;
            }
            channelSegment0 = (ChannelSegment)channelSegment0.getNext();
        }
        while(channelSegment0 != null);
        if(StringsKt___StringsKt.last(stringBuilder0) == 44) {
            Intrinsics.checkNotNullExpressionValue(stringBuilder0.deleteCharAt(stringBuilder0.length() - 1), "this.deleteCharAt(index)");
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @NotNull
    public final String toStringDebug$kotlinx_coroutines_core() {
        String s1;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("S=" + this.getSendersCounter$kotlinx_coroutines_core() + ",R=" + this.getReceiversCounter$kotlinx_coroutines_core() + ",B=" + BufferedChannel.e.get(this) + ",B\'=" + BufferedChannel.f.get(this) + ",C=" + ((int)(BufferedChannel.c.get(this) >> 60)) + ',');
        switch(((int)(BufferedChannel.c.get(this) >> 60))) {
            case 1: {
                stringBuilder0.append("CANCELLATION_STARTED,");
                break;
            }
            case 2: {
                stringBuilder0.append("CLOSED,");
                break;
            }
            case 3: {
                stringBuilder0.append("CANCELLED,");
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = BufferedChannel.g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1 = BufferedChannel.h;
        stringBuilder0.append("SEND_SEGM=" + DebugStringsKt.getHexAddress(atomicReferenceFieldUpdater0.get(this)) + ",RCV_SEGM=" + DebugStringsKt.getHexAddress(atomicReferenceFieldUpdater1.get(this)));
        boolean z = this.h();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = BufferedChannel.i;
        if(!z) {
            stringBuilder0.append(",EB_SEGM=" + DebugStringsKt.getHexAddress(atomicReferenceFieldUpdater2.get(this)));
        }
        stringBuilder0.append("  ");
        Iterable iterable0 = CollectionsKt__CollectionsKt.listOf(new ChannelSegment[]{atomicReferenceFieldUpdater1.get(this), atomicReferenceFieldUpdater0.get(this), atomicReferenceFieldUpdater2.get(this)});
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((ChannelSegment)object0) != BufferedChannelKt.a) {
                arrayList0.add(object0);
            }
        }
        Iterator iterator1 = arrayList0.iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator1.next();
        if(iterator1.hasNext()) {
            long v = ((ChannelSegment)object1).id;
            while(true) {
                Object object2 = iterator1.next();
                long v1 = ((ChannelSegment)object2).id;
                if(v > v1) {
                    object1 = object2;
                    v = v1;
                }
                if(!iterator1.hasNext()) {
                    break;
                }
            }
        }
        ChannelSegment channelSegment0 = (ChannelSegment)object1;
        do {
            ChannelSegment channelSegment1 = (ChannelSegment)channelSegment0.getPrev();
            String s = null;
            stringBuilder0.append(DebugStringsKt.getHexAddress(channelSegment0) + "=[" + (channelSegment0.isRemoved() ? "*" : "") + channelSegment0.id + ",prev=" + (channelSegment1 == null ? null : DebugStringsKt.getHexAddress(channelSegment1)) + ',');
            int v2 = BufferedChannelKt.SEGMENT_SIZE;
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object3 = channelSegment0.getState$kotlinx_coroutines_core(v3);
                Object object4 = channelSegment0.getElement$kotlinx_coroutines_core(v3);
                if(object3 instanceof CancellableContinuation) {
                    s1 = "cont";
                }
                else if(object3 instanceof SelectInstance) {
                    s1 = "select";
                }
                else if(object3 instanceof n1) {
                    s1 = "receiveCatching";
                }
                else if(object3 instanceof h) {
                    s1 = "send(broadcast)";
                }
                else {
                    s1 = object3 instanceof r1 ? "EB(" + object3 + ')' : String.valueOf(object3);
                }
                stringBuilder0.append("[" + v3 + "]=(" + s1 + ',' + object4 + "),");
            }
            StringBuilder stringBuilder1 = new StringBuilder("next=");
            ChannelSegment channelSegment2 = (ChannelSegment)channelSegment0.getNext();
            if(channelSegment2 != null) {
                s = DebugStringsKt.getHexAddress(channelSegment2);
            }
            stringBuilder1.append(s);
            stringBuilder1.append("]  ");
            stringBuilder0.append(stringBuilder1.toString());
            channelSegment0 = (ChannelSegment)channelSegment0.getNext();
        }
        while(channelSegment0 != null);
        return stringBuilder0.toString();
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public Object tryReceive-PtdJZtk() {
        Object object0;
        ChannelSegment channelSegment2;
        long v = BufferedChannel.d.get(this);
        long v1 = BufferedChannel.c.get(this);
        if(this.g(v1, true)) {
            Throwable throwable0 = this.getCloseCause();
            return ChannelResult.Companion.closed-JP2dKIU(throwable0);
        }
        if(v >= (v1 & 0xFFFFFFFFFFFFFFFL)) {
            return ChannelResult.Companion.failure-PtdJZtk();
        }
        Symbol symbol0 = BufferedChannelKt.i;
        ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.h.get(this);
        while(true) {
            if(this.isClosedForReceive()) {
                Throwable throwable1 = this.getCloseCause();
                return ChannelResult.Companion.closed-JP2dKIU(throwable1);
            }
            long v2 = BufferedChannel.d.getAndIncrement(this);
            long v3 = v2 / ((long)BufferedChannelKt.SEGMENT_SIZE);
            int v4 = (int)(v2 % ((long)BufferedChannelKt.SEGMENT_SIZE));
            if(channelSegment0.id == v3) {
                channelSegment2 = channelSegment0;
            }
            else {
                ChannelSegment channelSegment1 = this.d(v3, channelSegment0);
                if(channelSegment1 == null) {
                    continue;
                }
                channelSegment2 = channelSegment1;
            }
            object0 = BufferedChannel.access$updateCellReceive(this, channelSegment2, v4, v2, symbol0);
            if(object0 == BufferedChannelKt.k) {
                Waiter waiter0 = symbol0 instanceof Waiter ? ((Waiter)symbol0) : null;
                if(waiter0 != null) {
                    BufferedChannel.access$prepareReceiverForSuspension(this, waiter0, channelSegment2, v4);
                }
                this.waitExpandBufferCompletion$kotlinx_coroutines_core(v2);
                channelSegment2.onSlotCleaned();
                return ChannelResult.Companion.failure-PtdJZtk();
            }
            if(object0 != BufferedChannelKt.m) {
                break;
            }
            if(v2 < this.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            channelSegment0 = channelSegment2;
        }
        if(object0 == BufferedChannelKt.l) {
            throw new IllegalStateException("unexpected");
        }
        channelSegment2.cleanPrev();
        return ChannelResult.Companion.success-JP2dKIU(object0);
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public Object trySend-JP2dKIU(Object object0) {
        ChannelSegment channelSegment2;
        int v5;
        long v = BufferedChannel.c.get(this);
        int v1 = 0;
        if(!this.g(v, false)) {
            v1 = !this.a(v & 0xFFFFFFFFFFFFFFFL);
        }
        if(v1 != 0) {
            return ChannelResult.Companion.failure-PtdJZtk();
        }
        Symbol symbol0 = BufferedChannelKt.h;
        ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.g.get(this);
    alab1:
        while(true) {
            long v2 = BufferedChannel.c.getAndIncrement(this);
            long v3 = v2 & 0xFFFFFFFFFFFFFFFL;
            boolean z = BufferedChannel.access$isClosedForSend0(this, v2);
            long v4 = v3 / ((long)BufferedChannelKt.SEGMENT_SIZE);
            v5 = (int)(v3 % ((long)BufferedChannelKt.SEGMENT_SIZE));
            if(channelSegment0.id == v4) {
            label_20:
                channelSegment2 = channelSegment0;
            }
            else {
                ChannelSegment channelSegment1 = BufferedChannel.access$findSegmentSend(this, v4, channelSegment0);
                if(channelSegment1 == null) {
                    if(!z) {
                        continue;
                    }
                    goto label_35;
                }
                else {
                    channelSegment2 = channelSegment1;
                    goto label_21;
                }
                goto label_20;
            }
        label_21:
            switch(BufferedChannel.access$updateCellSend(this, channelSegment2, v5, object0, v3, symbol0, z)) {
                case 0: {
                    channelSegment2.cleanPrev();
                    return ChannelResult.Companion.success-JP2dKIU(Unit.INSTANCE);
                }
                case 1: {
                    return ChannelResult.Companion.success-JP2dKIU(Unit.INSTANCE);
                }
                case 2: {
                    goto label_33;
                }
                case 3: {
                    throw new IllegalStateException("unexpected");
                }
                case 4: {
                    break alab1;
                }
                case 5: {
                    channelSegment2.cleanPrev();
                    channelSegment0 = channelSegment2;
                    break;
                }
                default: {
                    channelSegment0 = channelSegment2;
                    break;
                }
            }
        }
        if(v3 >= this.getReceiversCounter$kotlinx_coroutines_core()) {
            goto label_35;
        }
        channelSegment2.cleanPrev();
        goto label_35;
    label_33:
        if(z) {
            channelSegment2.onSlotCleaned();
        label_35:
            Throwable throwable0 = this.getSendException();
            return ChannelResult.Companion.closed-JP2dKIU(throwable0);
        }
        Waiter waiter0 = symbol0 instanceof Waiter ? ((Waiter)symbol0) : null;
        if(waiter0 != null) {
            BufferedChannel.access$prepareSenderForSuspension(this, waiter0, channelSegment2, v5);
        }
        channelSegment2.onSlotCleaned();
        return ChannelResult.Companion.failure-PtdJZtk();
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long v) {
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        AtomicLongFieldUpdater atomicLongFieldUpdater0;
        if(this.h()) {
            return;
        }
        do {
            atomicLongFieldUpdater0 = BufferedChannel.e;
        }
        while(atomicLongFieldUpdater0.get(this) <= v);
        AtomicLongFieldUpdater atomicLongFieldUpdater1 = BufferedChannel.f;
        do {
            long v1 = atomicLongFieldUpdater1.get(this);
        }
        while(!atomicLongFieldUpdater1.compareAndSet(this, v1, BufferedChannelKt.access$constructEBCompletedAndPauseFlag(v1 & 0x3FFFFFFFFFFFFFFFL, true)));
        while(true) {
            long v2 = atomicLongFieldUpdater0.get(this);
            atomicLongFieldUpdater2 = BufferedChannel.f;
            long v3 = atomicLongFieldUpdater2.get(this);
            long v4 = v3 & 0x3FFFFFFFFFFFFFFFL;
            if(v2 == v4 && v2 == atomicLongFieldUpdater0.get(this)) {
                break;
            }
            if((0x4000000000000000L & v3) == 0L) {
                atomicLongFieldUpdater2.compareAndSet(this, v3, BufferedChannelKt.access$constructEBCompletedAndPauseFlag(v4, true));
            }
        }
        do {
            long v5 = atomicLongFieldUpdater2.get(this);
        }
        while(!atomicLongFieldUpdater2.compareAndSet(this, v5, BufferedChannelKt.access$constructEBCompletedAndPauseFlag(v5 & 0x3FFFFFFFFFFFFFFFL, false)));
    }
}

