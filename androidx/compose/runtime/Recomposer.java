package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult.Failure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation.DefaultImpls;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s.h1;
import u2.b;
import y0.b0;
import y0.e0;
import y0.f0;
import y0.h0;
import y0.i0;
import y0.k0;
import y0.n0;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000F\b\u0007\u0018\u0000 e2\u00020\u0001:\u0005efghiB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001A\u00020\tH\u0086@\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0018\u0010\r\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u0002H\u0087@\u00A2\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u000F\u001A\u00020\t\u00A2\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\t\u00A2\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\tH\u0086@\u00A2\u0006\u0004\b\u0012\u0010\u000BJ*\u0010\u001A\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u00132\u0011\u0010\u0017\u001A\r\u0012\u0004\u0012\u00020\t0\u0015\u00A2\u0006\u0002\b\u0016H\u0010\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\tH\u0086@\u00A2\u0006\u0004\b\u001B\u0010\u000BJ\r\u0010\u001C\u001A\u00020\t\u00A2\u0006\u0004\b\u001C\u0010\u0010J\r\u0010\u001D\u001A\u00020\t\u00A2\u0006\u0004\b\u001D\u0010\u0010J\u001D\u0010#\u001A\u00020\t2\f\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001F0\u001EH\u0010\u00A2\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u0013H\u0010\u00A2\u0006\u0004\b$\u0010%J\u0017\u0010(\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u0013H\u0010\u00A2\u0006\u0004\b\'\u0010%J\u0017\u0010*\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u0013H\u0010\u00A2\u0006\u0004\b)\u0010%J\u0017\u0010/\u001A\u00020\t2\u0006\u0010,\u001A\u00020+H\u0010\u00A2\u0006\u0004\b-\u0010.J\u0017\u00104\u001A\u00020\t2\u0006\u00101\u001A\u000200H\u0010\u00A2\u0006\u0004\b2\u00103J\u0017\u00106\u001A\u00020\t2\u0006\u00101\u001A\u000200H\u0010\u00A2\u0006\u0004\b5\u00103J\u001F\u0010;\u001A\u00020\t2\u0006\u00101\u001A\u0002002\u0006\u00108\u001A\u000207H\u0010\u00A2\u0006\u0004\b9\u0010:J\u0017\u0010=\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u0013H\u0010\u00A2\u0006\u0004\b<\u0010%J\u0019\u0010@\u001A\u0004\u0018\u0001072\u0006\u00101\u001A\u000200H\u0010\u00A2\u0006\u0004\b>\u0010?R$\u0010G\u001A\u00020A2\u0006\u0010B\u001A\u00020A8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010FR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010KR\u0014\u0010\f\u001A\u00020\u00028PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\bL\u0010KR \u0010R\u001A\b\u0012\u0004\u0012\u00020N0M8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bQ\u0010\u0010\u001A\u0004\bO\u0010PR\u0017\u0010V\u001A\b\u0012\u0004\u0012\u00020N0S8F\u00A2\u0006\u0006\u001A\u0004\bT\u0010UR\u0011\u0010Z\u001A\u00020W8F\u00A2\u0006\u0006\u001A\u0004\bX\u0010YR\u0014\u0010^\u001A\u00020[8PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\b\\\u0010]R\u0014\u0010`\u001A\u00020W8PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\b_\u0010YR\u0014\u0010b\u001A\u00020W8PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\ba\u0010YR\u0014\u0010d\u001A\u00020W8PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\bc\u0010Y\u00A8\u0006j"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/compose/runtime/RecomposerInfo;", "asRecomposerInfo", "()Landroidx/compose/runtime/RecomposerInfo;", "", "runRecomposeAndApplyChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recomposeCoroutineContext", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "()V", "close", "join", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "awaitIdle", "pauseCompositionFrameClock", "resumeCompositionFrameClock", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "invalidate$runtime_release", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V", "movableContentStateReleased", "reportRemovedComposition$runtime_release", "reportRemovedComposition", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "", "<set-?>", "a", "J", "getChangeCount", "()J", "changeCount", "w", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getRecomposeCoroutineContext$runtime_release", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "getState$annotations", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "currentState", "", "getHasPendingWork", "()Z", "hasPendingWork", "", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "getCollectingCallByInformation$runtime_release", "collectingCallByInformation", "getCollectingParameterInformation$runtime_release", "collectingParameterInformation", "getCollectingSourceInformation$runtime_release", "collectingSourceInformation", "Companion", "y0/e0", "y0/f0", "androidx/compose/runtime/c", "State", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 9 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 10 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1646:1\n1299#1,5:1712\n1305#1:1722\n1299#1,5:1735\n1305#1:1745\n1299#1,5:1766\n1305#1:1829\n1208#2:1647\n1187#2,2:1648\n89#3:1650\n89#3:1651\n89#3:1654\n89#3:1656\n89#3:1663\n89#3:1664\n89#3:1665\n89#3:1666\n89#3:1684\n89#3:1685\n89#3:1686\n89#3:1687\n89#3:1688\n89#3:1689\n89#3:1690\n89#3:1697\n89#3:1707\n89#3:1710\n89#3:1711\n89#3:1723\n89#3:1724\n89#3:1774\n89#3:1816\n89#3:1830\n89#3:1853\n89#3:1854\n89#3:1855\n89#3:1856\n89#3:1859\n89#3:1862\n89#3:1863\n89#3:1864\n89#3:1865\n89#3:1866\n89#3:1867\n89#3:1868\n1229#4,2:1652\n1#5:1655\n1#5:1812\n33#6,6:1657\n33#6,6:1667\n33#6,6:1691\n93#6,2:1725\n33#6,4:1727\n95#6,2:1731\n38#6:1733\n97#6:1734\n120#6,3:1746\n33#6,4:1749\n123#6,2:1753\n125#6,2:1762\n38#6:1764\n127#6:1765\n82#6,3:1775\n33#6,4:1778\n85#6,2:1782\n38#6:1784\n87#6:1785\n110#6,2:1786\n33#6,6:1788\n112#6:1794\n110#6,2:1795\n33#6,6:1797\n112#6:1803\n211#6,3:1804\n33#6,4:1807\n214#6:1811\n215#6:1813\n38#6:1814\n216#6:1815\n231#6,3:1817\n64#6,4:1820\n234#6,2:1824\n69#6:1826\n236#6:1827\n82#6,3:1831\n33#6,4:1834\n85#6,2:1838\n38#6:1840\n87#6:1841\n33#6,6:1842\n460#7,11:1673\n735#7,2:1857\n728#7,2:1860\n314#8,9:1698\n323#8,2:1708\n138#9,5:1717\n138#9,5:1740\n138#9,3:1771\n142#9:1828\n138#9,5:1848\n361#10,7:1755\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1121#1:1712,5\n1121#1:1722\n1198#1:1735,5\n1198#1:1745\n1218#1:1766,5\n1218#1:1829\n218#1:1647\n218#1:1648,2\n297#1:1650\n347#1:1651\n441#1:1654\n446#1:1656\n460#1:1663\n469#1:1664\n474#1:1665\n485#1:1666\n497#1:1684\n505#1:1685\n751#1:1686\n781#1:1687\n812#1:1688\n824#1:1689\n841#1:1690\n989#1:1697\n1001#1:1707\n1086#1:1710\n1102#1:1711\n1134#1:1723\n1165#1:1724\n1221#1:1774\n1239#1:1816\n1262#1:1830\n1329#1:1853\n1366#1:1854\n1381#1:1855\n1413#1:1856\n1421#1:1859\n1430#1:1862\n1437#1:1863\n1444#1:1864\n1453#1:1865\n1459#1:1866\n1471#1:1867\n1171#1:1868\n348#1:1652,2\n1236#1:1812\n452#1:1657,6\n491#1:1667,6\n842#1:1691,6\n1166#1:1725,2\n1166#1:1727,4\n1166#1:1731,2\n1166#1:1733\n1166#1:1734\n1215#1:1746,3\n1215#1:1749,4\n1215#1:1753,2\n1215#1:1762,2\n1215#1:1764\n1215#1:1765\n1222#1:1775,3\n1222#1:1778,4\n1222#1:1782,2\n1222#1:1784\n1222#1:1785\n1231#1:1786,2\n1231#1:1788,6\n1231#1:1794\n1231#1:1795,2\n1231#1:1797,6\n1231#1:1803\n1236#1:1804,3\n1236#1:1807,4\n1236#1:1811\n1236#1:1813\n1236#1:1814\n1236#1:1815\n1244#1:1817,3\n1244#1:1820,4\n1244#1:1824,2\n1244#1:1826\n1244#1:1827\n1266#1:1831,3\n1266#1:1834,4\n1266#1:1838,2\n1266#1:1840\n1266#1:1841\n1273#1:1842,6\n495#1:1673,11\n1415#1:1857,2\n1423#1:1860,2\n1000#1:1698,9\n1000#1:1708,2\n1121#1:1717,5\n1198#1:1740,5\n1218#1:1771,3\n1218#1:1828\n1303#1:1848,5\n1215#1:1755,7\n*E\n"})
public final class Recomposer extends CompositionContext {
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\n\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u001B\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001AR\u001D\u0010!\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001E0\u001D0\u001C8F¢\u0006\u0006\u001A\u0004\b\u001F\u0010 R4\u0010%\u001A\"\u0012\f\u0012\n #*\u0004\u0018\u00010\u00020\u00020\"j\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u00020\u0002`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010+\u001A\u0012\u0012\u000E\u0012\f\u0012\b\u0012\u00060)R\u00020*0(0\'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "", "value", "", "setHotReloadEnabled$runtime_release", "(Z)V", "setHotReloadEnabled", "saveStateAndDisposeForHotReload$runtime_release", "()Ljava/lang/Object;", "saveStateAndDisposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "(Ljava/lang/Object;)V", "loadStateAndComposeForHotReload", "", "key", "invalidateGroupsWithKey$runtime_release", "(I)V", "invalidateGroupsWithKey", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "()Ljava/util/List;", "getCurrentErrors", "clearErrors$runtime_release", "()V", "clearErrors", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/StateFlow;", "runningRecomposers", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/c;", "Landroidx/compose/runtime/Recomposer;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1646:1\n1360#2:1647\n1446#2,5:1648\n1855#2,2:1653\n1855#2,2:1667\n1855#2,2:1669\n1603#2,9:1671\n1855#2:1680\n1856#2:1682\n1612#2:1683\n1603#2,9:1684\n1855#2:1693\n1856#2:1695\n1612#2:1696\n33#3,6:1655\n33#3,6:1661\n1#4:1681\n1#4:1694\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1522#1:1647\n1522#1:1648,5\n1530#1:1653,2\n1539#1:1667,2\n1546#1:1669,2\n1560#1:1671,9\n1560#1:1680\n1560#1:1682\n1560#1:1683\n1565#1:1684,9\n1565#1:1693\n1565#1:1695\n1565#1:1696\n1536#1:1655,6\n1537#1:1661,6\n1560#1:1681\n1565#1:1694\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final void access$addRunning(Companion recomposer$Companion0, c c0) {
            recomposer$Companion0.getClass();
            do {
                PersistentSet persistentSet0 = (PersistentSet)Recomposer.y.getValue();
                PersistentSet persistentSet1 = persistentSet0.add(c0);
            }
            while(persistentSet0 != persistentSet1 && !Recomposer.y.compareAndSet(persistentSet0, persistentSet1));
        }

        public static final void access$removeRunning(Companion recomposer$Companion0, c c0) {
            recomposer$Companion0.getClass();
            do {
                PersistentSet persistentSet0 = (PersistentSet)Recomposer.y.getValue();
                PersistentSet persistentSet1 = persistentSet0.remove(c0);
            }
            while(persistentSet0 != persistentSet1 && !Recomposer.y.compareAndSet(persistentSet0, persistentSet1));
        }

        public final void clearErrors$runtime_release() {
            Iterable iterable0 = (Iterable)Recomposer.y.getValue();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                f0 f00 = Recomposer.access$resetErrorState(((c)object0).a);
                if(f00 != null) {
                    arrayList0.add(f00);
                }
            }
        }

        @NotNull
        public final List getCurrentErrors$runtime_release() {
            f0 f00;
            Iterable iterable0 = (Iterable)Recomposer.y.getValue();
            List list0 = new ArrayList();
            for(Object object0: iterable0) {
                synchronized(((c)object0).a.c) {
                    f00 = ((c)object0).a.s;
                }
                if(f00 != null) {
                    ((ArrayList)list0).add(f00);
                }
            }
            return list0;
        }

        @NotNull
        public final StateFlow getRunningRecomposers() {
            return Recomposer.y;
        }

        public final void invalidateGroupsWithKey$runtime_release(int v) {
            List list0;
            Recomposer.z.set(Boolean.TRUE);
            for(Object object0: ((Iterable)Recomposer.y.getValue())) {
                c c0 = (c)object0;
                synchronized(c0.a.c) {
                    f0 f00 = c0.a.s;
                }
                if(f00 == null || f00.a) {
                    Recomposer.access$resetErrorState(c0.a);
                    synchronized(c0.a.c) {
                        list0 = c0.a.e();
                    }
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    int v2 = list0.size();
                    for(int v4 = 0; v4 < v2; ++v4) {
                        ControlledComposition controlledComposition0 = (ControlledComposition)list0.get(v4);
                        CompositionImpl compositionImpl0 = controlledComposition0 instanceof CompositionImpl ? ((CompositionImpl)controlledComposition0) : null;
                        if(compositionImpl0 != null) {
                            arrayList0.add(compositionImpl0);
                        }
                    }
                    int v5 = arrayList0.size();
                    for(int v3 = 0; v3 < v5; ++v3) {
                        ((CompositionImpl)arrayList0.get(v3)).invalidateGroupsWithKey(v);
                    }
                    Recomposer.access$retryFailedCompositions(c0.a);
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(@NotNull Object object0) {
            Recomposer.z.set(Boolean.TRUE);
            for(Object object1: ((Iterable)Recomposer.y.getValue())) {
                Recomposer.access$resetErrorState(((c)object1).a);
            }
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            int v = ((List)object0).size();
            for(int v2 = 0; v2 < v; ++v2) {
                e0 e00 = (e0)((List)object0).get(v2);
                e00.a.setComposable(e00.b);
            }
            int v3 = ((List)object0).size();
            for(int v1 = 0; v1 < v3; ++v1) {
                e0 e01 = (e0)((List)object0).get(v1);
                CompositionImpl compositionImpl0 = e01.a;
                if(compositionImpl0.isRoot()) {
                    compositionImpl0.setContent(e01.b);
                }
            }
            for(Object object2: ((Iterable)Recomposer.y.getValue())) {
                Recomposer.access$retryFailedCompositions(((c)object2).a);
            }
        }

        @NotNull
        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            List list0;
            Recomposer.z.set(Boolean.TRUE);
            Iterable iterable0 = (Iterable)Recomposer.y.getValue();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                synchronized(((c)object0).a.c) {
                    list0 = ((c)object0).a.e();
                }
                ArrayList arrayList1 = new ArrayList(list0.size());
                int v1 = list0.size();
                for(int v3 = 0; v3 < v1; ++v3) {
                    ControlledComposition controlledComposition0 = (ControlledComposition)list0.get(v3);
                    CompositionImpl compositionImpl0 = controlledComposition0 instanceof CompositionImpl ? ((CompositionImpl)controlledComposition0) : null;
                    if(compositionImpl0 != null) {
                        arrayList1.add(compositionImpl0);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList1.size());
                int v4 = arrayList1.size();
                for(int v2 = 0; v2 < v4; ++v2) {
                    CompositionImpl compositionImpl1 = (CompositionImpl)arrayList1.get(v2);
                    e0 e00 = new e0(compositionImpl1);
                    if(compositionImpl1.isRoot()) {
                        compositionImpl1.setContent(ComposableSingletons.RecomposerKt.INSTANCE.getLambda-1$runtime_release());
                    }
                    arrayList2.add(e00);
                }
                o.addAll(arrayList0, arrayList2);
            }
            return arrayList0;
        }

        public final void setHotReloadEnabled$runtime_release(boolean z) {
            Recomposer.z.set(Boolean.valueOf(z));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork;

    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public long a;
    public final BroadcastFrameClock b;
    public final Object c;
    public Job d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public MutableScatterSet h;
    public final MutableVector i;
    public final ArrayList j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public ArrayList n;
    public Set o;
    public CancellableContinuation p;
    public int q;
    public boolean r;
    public f0 s;
    public boolean t;
    public final MutableStateFlow u;
    public final CompletableJob v;
    public final CoroutineContext w;
    public final c x;
    public static final MutableStateFlow y;
    public static final AtomicReference z;

    static {
        Recomposer.Companion = new Companion(null);
        Recomposer.$stable = 8;
        Recomposer.y = StateFlowKt.MutableStateFlow(ExtensionsKt.persistentSetOf());
        Recomposer.z = new AtomicReference(Boolean.FALSE);
    }

    public Recomposer(@NotNull CoroutineContext coroutineContext0) {
        BroadcastFrameClock broadcastFrameClock0 = new BroadcastFrameClock(new e(this));
        this.b = broadcastFrameClock0;
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new MutableScatterSet(0, 1, null);
        this.i = new MutableVector(new ControlledComposition[16], 0);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.u = StateFlowKt.MutableStateFlow(State.Inactive);
        CompletableJob completableJob0 = JobKt.Job(((Job)coroutineContext0.get(Job.Key)));
        completableJob0.invokeOnCompletion(new g(this));
        this.v = completableJob0;
        this.w = coroutineContext0.plus(broadcastFrameClock0).plus(completableJob0);
        this.x = new c(this);
    }

    public static void a(MutableSnapshot mutableSnapshot0) {
        try {
            if(!(mutableSnapshot0.apply() instanceof Failure)) {
                return;
            }
        }
        finally {
            mutableSnapshot0.dispose();
        }
        throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
    }

    public static final Object access$awaitWorkAvailable(Recomposer recomposer0, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl1;
        if(!recomposer0.d()) {
            CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
            cancellableContinuationImpl0.initCancellability();
            synchronized(Recomposer.access$getStateLock$p(recomposer0)) {
                if(recomposer0.d()) {
                    cancellableContinuationImpl1 = cancellableContinuationImpl0;
                }
                else {
                    Recomposer.access$setWorkContinuation$p(recomposer0, cancellableContinuationImpl0);
                    cancellableContinuationImpl1 = null;
                }
            }
            if(cancellableContinuationImpl1 != null) {
                cancellableContinuationImpl1.resumeWith(Unit.INSTANCE);
            }
            Unit unit0 = cancellableContinuationImpl0.getResult();
            if(unit0 == a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation0);
            }
            return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final void access$discardUnusedValues(Recomposer recomposer0) {
        List list1;
        synchronized(recomposer0.c) {
            if(recomposer0.l.isEmpty()) {
                list1 = CollectionsKt__CollectionsKt.emptyList();
            }
            else {
                List list0 = l.flatten(recomposer0.l.values());
                recomposer0.l.clear();
                list1 = new ArrayList(list0.size());
                int v2 = list0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    MovableContentStateReference movableContentStateReference0 = (MovableContentStateReference)list0.get(v3);
                    ((ArrayList)list1).add(TuplesKt.to(movableContentStateReference0, recomposer0.m.get(movableContentStateReference0)));
                }
                recomposer0.m.clear();
            }
        }
        int v4 = list1.size();
        for(int v = 0; v < v4; ++v) {
            Pair pair0 = (Pair)list1.get(v);
            MovableContentStateReference movableContentStateReference1 = (MovableContentStateReference)pair0.component1();
            MovableContentState movableContentState0 = (MovableContentState)pair0.component2();
            if(movableContentState0 != null) {
                movableContentStateReference1.getComposition$runtime_release().disposeUnusedMovableContent(movableContentState0);
            }
        }
    }

    public static final boolean access$getHasBroadcastFrameClockAwaiters(Recomposer recomposer0) {
        synchronized(recomposer0.c) {
            return recomposer0.c();
        }
    }

    // 去混淆评级： 低(20)
    public static final boolean access$getHasConcurrentFrameWorkLocked(Recomposer recomposer0) {
        return !recomposer0.j.isEmpty() || recomposer0.c();
    }

    public static final boolean access$getShouldKeepRecomposing(Recomposer recomposer0) {
        synchronized(recomposer0.c) {
        }
        if(recomposer0.r) {
            for(Object object0: recomposer0.v.getChildren()) {
                if(((Job)object0).isActive()) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static final ControlledComposition access$performRecompose(Recomposer recomposer0, ControlledComposition controlledComposition0, MutableScatterSet mutableScatterSet0) {
        boolean z;
        recomposer0.getClass();
        if(!controlledComposition0.isComposing() && !controlledComposition0.isDisposed() && (recomposer0.o == null || !recomposer0.o.contains(controlledComposition0))) {
            h1 h10 = new h1(controlledComposition0, 25);
            b b0 = new b(10, controlledComposition0, mutableScatterSet0);
            MutableSnapshot mutableSnapshot0 = Snapshot.Companion.takeMutableSnapshot(h10, b0);
            try {
                Snapshot snapshot0 = mutableSnapshot0.makeCurrent();
                try {
                    if(mutableScatterSet0 != null && mutableScatterSet0.isNotEmpty()) {
                        controlledComposition0.prepareCompose(new p9.a(15, mutableScatterSet0, controlledComposition0));
                    }
                    z = controlledComposition0.recompose();
                }
                catch(Throwable throwable0) {
                    mutableSnapshot0.restoreCurrent(snapshot0);
                    throw throwable0;
                }
                mutableSnapshot0.restoreCurrent(snapshot0);
                return z ? controlledComposition0 : null;
            }
            finally {
                Recomposer.a(mutableSnapshot0);
            }
        }
        return null;
    }

    public static final Object access$recompositionRunner(Recomposer recomposer0, Function3 function30, Continuation continuation0) {
        return recomposer0.k(function30, continuation0);
    }

    public static final boolean access$recordComposerModifications(Recomposer recomposer0) {
        List list0;
        Set set0;
        boolean z = false;
        synchronized(recomposer0.c) {
            if(recomposer0.h.isEmpty()) {
                if(recomposer0.i.isNotEmpty() || recomposer0.c()) {
                    z = true;
                }
                return z;
            }
            set0 = ScatterSetWrapperKt.wrapIntoSet(recomposer0.h);
            recomposer0.h = new MutableScatterSet(0, 1, null);
        }
        synchronized(recomposer0.c) {
            list0 = recomposer0.e();
        }
        try {
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ((ControlledComposition)list0.get(v3)).recordModificationsOf(set0);
                if(((State)recomposer0.u.getValue()).compareTo(State.ShuttingDown) <= 0) {
                    break;
                }
            }
            synchronized(recomposer0.c) {
                recomposer0.h = new MutableScatterSet(0, 1, null);
            }
        }
        catch(Throwable throwable0) {
            synchronized(recomposer0.c) {
                recomposer0.h.addAll(set0);
            }
            throw throwable0;
        }
        synchronized(recomposer0.c) {
            if(recomposer0.b() == null) {
                if(recomposer0.i.isNotEmpty() || recomposer0.c()) {
                    z = true;
                }
                return z;
            }
        }
        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
    }

    public static final void access$registerRunnerJob(Recomposer recomposer0, Job job0) {
        Throwable throwable0;
        synchronized(recomposer0.c) {
            throwable0 = recomposer0.e;
            if(throwable0 == null) {
                if(((State)recomposer0.u.getValue()).compareTo(State.ShuttingDown) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if(recomposer0.d != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                recomposer0.d = job0;
                recomposer0.b();
                return;
            }
        }
        throw throwable0;
    }

    public static final f0 access$resetErrorState(Recomposer recomposer0) {
        synchronized(recomposer0.c) {
            f0 f00 = recomposer0.s;
            if(f00 != null) {
                recomposer0.s = null;
                recomposer0.b();
            }
            return f00;
        }
    }

    public static final void access$retryFailedCompositions(Recomposer recomposer0) {
        int v;
        __monitor_enter(recomposer0.c);
        ArrayList arrayList0 = recomposer0.n;
        recomposer0.n = null;
        __monitor_exit(recomposer0.c);
        if(arrayList0 != null) {
        alab1:
            while(true) {
                try {
                    do {
                        v = 0;
                        if(arrayList0.isEmpty()) {
                            break;
                        }
                        ControlledComposition controlledComposition0 = (ControlledComposition)o.removeLast(arrayList0);
                        if(!(controlledComposition0 instanceof CompositionImpl)) {
                            continue alab1;
                        }
                        controlledComposition0.invalidateAll();
                        controlledComposition0.setContent(((CompositionImpl)controlledComposition0).getComposable());
                    }
                    while(recomposer0.s == null);
                    break;
                }
                catch(Throwable throwable0) {
                    if(!arrayList0.isEmpty()) {
                        Object object0 = recomposer0.c;
                        synchronized(object0) {
                            int v2 = arrayList0.size();
                            while(v < v2) {
                                recomposer0.l(((ControlledComposition)arrayList0.get(v)));
                                ++v;
                            }
                        }
                    }
                    throw throwable0;
                }
            }
            if(!arrayList0.isEmpty()) {
                synchronized(recomposer0.c) {
                    int v4 = arrayList0.size();
                    while(v < v4) {
                        recomposer0.l(((ControlledComposition)arrayList0.get(v)));
                        ++v;
                    }
                }
            }
        }
    }

    public static final Object access$runFrameLoop(Recomposer recomposer0, MonotonicFrameClock monotonicFrameClock0, b0 b00, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl1;
        Unit unit0;
        Recomposer recomposer1;
        MonotonicFrameClock monotonicFrameClock1;
        List list3;
        List list2;
        List list1;
        List list0;
        h0 h00;
        recomposer0.getClass();
        if(continuation0 instanceof h0) {
            h00 = (h0)continuation0;
            int v = h00.v;
            if((v & 0x80000000) == 0) {
                h00 = new h0(recomposer0, continuation0);
            }
            else {
                h00.v = v ^ 0x80000000;
            }
        }
        else {
            h00 = new h0(recomposer0, continuation0);
        }
        Object object0 = h00.t;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h00.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                list0 = new ArrayList();
                list1 = new ArrayList();
                goto label_35;
            }
            case 1: {
                list2 = h00.s;
                list3 = h00.r;
                b00 = h00.q;
                monotonicFrameClock1 = h00.p;
                recomposer1 = h00.o;
                ResultKt.throwOnFailure(object0);
                goto label_72;
            }
            case 2: {
                list2 = h00.s;
                list3 = h00.r;
                b00 = h00.q;
                monotonicFrameClock1 = h00.p;
                recomposer1 = h00.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            list0 = list3;
            monotonicFrameClock0 = monotonicFrameClock1;
            list1 = list2;
            recomposer0 = recomposer1;
        label_35:
            Object object2 = recomposer0.c;
            h00.o = recomposer0;
            h00.p = monotonicFrameClock0;
            h00.q = b00;
            h00.r = list0;
            h00.s = list1;
            h00.v = 1;
            b00.getClass();
            __monitor_enter(object2);
            if(b00.a == RecomposerKt.a) {
                b00.a = RecomposerKt.b;
                unit0 = Unit.INSTANCE;
                __monitor_exit(object2);
            }
            else {
                __monitor_exit(object2);
                CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(h00), 1);
                cancellableContinuationImpl0.initCancellability();
                synchronized(object2) {
                    if(b00.a == RecomposerKt.a) {
                        b00.a = RecomposerKt.b;
                        cancellableContinuationImpl1 = cancellableContinuationImpl0;
                    }
                    else {
                        b00.a = cancellableContinuationImpl0;
                        cancellableContinuationImpl1 = null;
                    }
                }
                if(cancellableContinuationImpl1 != null) {
                    cancellableContinuationImpl1.resumeWith(Unit.INSTANCE);
                }
                unit0 = cancellableContinuationImpl0.getResult();
                if(unit0 == a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(h00);
                }
                if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                    unit0 = Unit.INSTANCE;
                }
            }
            if(unit0 == object1) {
                break;
            }
            recomposer1 = recomposer0;
            list2 = list1;
            monotonicFrameClock1 = monotonicFrameClock0;
            list3 = list0;
        label_72:
            i0 i00 = new i0(recomposer1, list3, list2, b00);
            h00.o = recomposer1;
            h00.p = monotonicFrameClock1;
            h00.q = b00;
            h00.r = list3;
            h00.s = list2;
            h00.v = 2;
        }
        while(monotonicFrameClock1.withFrameNanos(i00, h00) != object1);
        return object1;
    }

    @NotNull
    public final RecomposerInfo asRecomposerInfo() {
        return this.x;
    }

    @Nullable
    public final Object awaitIdle(@NotNull Continuation continuation0) {
        Object object0 = FlowKt.collect(FlowKt.takeWhile(this.getCurrentState(), new d(2, null)), continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final CancellableContinuation b() {
        State recomposer$State0;
        MutableStateFlow mutableStateFlow0 = this.u;
        int v = ((State)mutableStateFlow0.getValue()).compareTo(State.ShuttingDown);
        ArrayList arrayList0 = this.k;
        ArrayList arrayList1 = this.j;
        MutableVector mutableVector0 = this.i;
        if(v <= 0) {
            this.f.clear();
            this.g = CollectionsKt__CollectionsKt.emptyList();
            this.h = new MutableScatterSet(0, 1, null);
            mutableVector0.clear();
            arrayList1.clear();
            arrayList0.clear();
            this.n = null;
            CancellableContinuation cancellableContinuation0 = this.p;
            if(cancellableContinuation0 != null) {
                DefaultImpls.cancel$default(cancellableContinuation0, null, 1, null);
            }
            this.p = null;
            this.s = null;
            return null;
        }
        if(this.s != null) {
            recomposer$State0 = State.Inactive;
        }
        else if(this.d == null) {
            this.h = new MutableScatterSet(0, 1, null);
            mutableVector0.clear();
            recomposer$State0 = this.c() ? State.InactivePendingWork : State.Inactive;
        }
        else {
            recomposer$State0 = mutableVector0.isNotEmpty() || this.h.isNotEmpty() || !arrayList1.isEmpty() || !arrayList0.isEmpty() || this.q > 0 || this.c() ? State.PendingWork : State.Idle;
        }
        mutableStateFlow0.setValue(recomposer$State0);
        if(recomposer$State0 == State.PendingWork) {
            CancellableContinuation cancellableContinuation1 = this.p;
            this.p = null;
            return cancellableContinuation1;
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public final boolean c() {
        return !this.t && this.b.getHasAwaiters();
    }

    public final void cancel() {
        synchronized(this.c) {
            if(((State)this.u.getValue()).compareTo(State.Idle) >= 0) {
                this.u.setValue(State.ShuttingDown);
            }
        }
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(this.v, null, 1, null);
    }

    public final void close() {
        if(this.v.complete()) {
            synchronized(this.c) {
                this.r = true;
            }
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime_release(@NotNull ControlledComposition controlledComposition0, @NotNull Function2 function20) {
        androidx.compose.runtime.snapshots.Snapshot.Companion snapshot$Companion0;
        boolean z = controlledComposition0.isComposing();
        try {
            snapshot$Companion0 = Snapshot.Companion;
            MutableSnapshot mutableSnapshot0 = snapshot$Companion0.takeMutableSnapshot(new h1(controlledComposition0, 25), new b(10, controlledComposition0, null));
            try {
                Snapshot snapshot0 = mutableSnapshot0.makeCurrent();
                try {
                    controlledComposition0.composeContent(function20);
                }
                catch(Throwable throwable0) {
                    mutableSnapshot0.restoreCurrent(snapshot0);
                    throw throwable0;
                }
                mutableSnapshot0.restoreCurrent(snapshot0);
            }
            finally {
                Recomposer.a(mutableSnapshot0);
            }
        }
        catch(Exception exception0) {
            this.i(exception0, controlledComposition0, true);
            return;
        }
        if(!z) {
            snapshot$Companion0.notifyObjectsInitialized();
        }
        synchronized(this.c) {
            if(((State)this.u.getValue()).compareTo(State.ShuttingDown) > 0 && !this.e().contains(controlledComposition0)) {
                this.f.add(controlledComposition0);
                this.g = null;
            }
        }
        try {
            this.f(controlledComposition0);
        }
        catch(Exception exception1) {
            this.i(exception1, controlledComposition0, true);
            return;
        }
        try {
            controlledComposition0.applyChanges();
            controlledComposition0.applyLateChanges();
        }
        catch(Exception exception2) {
            Recomposer.j(this, exception2, false, 6);
            return;
        }
        if(!z) {
            snapshot$Companion0.notifyObjectsInitialized();
        }
    }

    public final boolean d() {
        synchronized(this.c) {
            return this.h.isNotEmpty() || this.i.isNotEmpty() || this.c();
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference movableContentStateReference0) {
        synchronized(this.c) {
            RecomposerKt.addMultiValue(this.l, movableContentStateReference0.getContent$runtime_release(), movableContentStateReference0);
        }
    }

    public final List e() {
        List list0 = this.g;
        if(list0 == null) {
            ArrayList arrayList0 = this.f;
            list0 = arrayList0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : new ArrayList(arrayList0);
            this.g = list0;
        }
        return list0;
    }

    public final void f(ControlledComposition controlledComposition0) {
        synchronized(this.c) {
            ArrayList arrayList0 = this.k;
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(Intrinsics.areEqual(((MovableContentStateReference)arrayList0.get(v2)).getComposition$runtime_release(), controlledComposition0)) {
                    ArrayList arrayList1 = new ArrayList();
                    Recomposer.g(arrayList1, this, controlledComposition0);
                    while(!arrayList1.isEmpty()) {
                        this.h(arrayList1, null);
                        Recomposer.g(arrayList1, this, controlledComposition0);
                    }
                    return;
                }
            }
        }
    }

    public static final void g(ArrayList arrayList0, Recomposer recomposer0, ControlledComposition controlledComposition0) {
        arrayList0.clear();
        synchronized(recomposer0.c) {
            Iterator iterator0 = recomposer0.k.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                MovableContentStateReference movableContentStateReference0 = (MovableContentStateReference)object1;
                if(Intrinsics.areEqual(movableContentStateReference0.getComposition$runtime_release(), controlledComposition0)) {
                    arrayList0.add(movableContentStateReference0);
                    iterator0.remove();
                }
            }
        }
    }

    public final long getChangeCount() {
        return this.a;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime_release() {
        return ((Boolean)Recomposer.z.get()).booleanValue();
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @NotNull
    public final StateFlow getCurrentState() {
        return this.u;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    @NotNull
    public CoroutineContext getEffectCoroutineContext() {
        return this.w;
    }

    public final boolean getHasPendingWork() {
        synchronized(this.c) {
            return this.h.isNotEmpty() || this.i.isNotEmpty() || this.q > 0 || !this.j.isEmpty() || this.c();
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    @NotNull
    public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @NotNull
    public final Flow getState() {
        return this.getCurrentState();
    }

    @Deprecated(message = "Replaced by currentState as a StateFlow", replaceWith = @ReplaceWith(expression = "currentState", imports = {}))
    public static void getState$annotations() {
    }

    public final List h(List list0, MutableScatterSet mutableScatterSet0) {
        ArrayList arrayList1;
        HashMap hashMap0 = new HashMap(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            ControlledComposition controlledComposition0 = ((MovableContentStateReference)object0).getComposition$runtime_release();
            ArrayList arrayList0 = hashMap0.get(controlledComposition0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                hashMap0.put(controlledComposition0, arrayList0);
            }
            arrayList0.add(object0);
        }
        for(Object object1: hashMap0.entrySet()) {
            ControlledComposition controlledComposition1 = (ControlledComposition)((Map.Entry)object1).getKey();
            List list1 = (List)((Map.Entry)object1).getValue();
            ComposerKt.runtimeCheck(!controlledComposition1.isComposing());
            h1 h10 = new h1(controlledComposition1, 25);
            b b0 = new b(10, controlledComposition1, mutableScatterSet0);
            MutableSnapshot mutableSnapshot0 = Snapshot.Companion.takeMutableSnapshot(h10, b0);
            try {
                Snapshot snapshot0 = mutableSnapshot0.makeCurrent();
                try {
                    synchronized(this.c) {
                        arrayList1 = new ArrayList(list1.size());
                        int v5 = list1.size();
                        for(int v6 = 0; v6 < v5; ++v6) {
                            MovableContentStateReference movableContentStateReference0 = (MovableContentStateReference)list1.get(v6);
                            arrayList1.add(TuplesKt.to(movableContentStateReference0, RecomposerKt.removeLastMultiValue(this.l, movableContentStateReference0.getContent$runtime_release())));
                        }
                    }
                    int v7 = arrayList1.size();
                    int v8 = 0;
                label_41:
                    while(v8 < v7) {
                        if(((Pair)arrayList1.get(v8)).getSecond() == null) {
                            ++v8;
                        }
                        else {
                            int v9 = arrayList1.size();
                            int v10 = 0;
                            while(true) {
                                if(v10 >= v9) {
                                    break label_41;
                                }
                                if(((Pair)arrayList1.get(v10)).getSecond() != null) {
                                    ++v10;
                                    continue;
                                }
                                ArrayList arrayList2 = new ArrayList(arrayList1.size());
                                int v11 = arrayList1.size();
                                for(int v12 = 0; v12 < v11; ++v12) {
                                    Pair pair0 = (Pair)arrayList1.get(v12);
                                    MovableContentStateReference movableContentStateReference1 = pair0.getSecond() == null ? ((MovableContentStateReference)pair0.getFirst()) : null;
                                    if(movableContentStateReference1 != null) {
                                        arrayList2.add(movableContentStateReference1);
                                    }
                                }
                                synchronized(this.c) {
                                    o.addAll(this.k, arrayList2);
                                }
                                ArrayList arrayList3 = new ArrayList(arrayList1.size());
                                int v13 = arrayList1.size();
                                for(int v14 = 0; v14 < v13; ++v14) {
                                    Object object4 = arrayList1.get(v14);
                                    if(((Pair)object4).getSecond() != null) {
                                        arrayList3.add(object4);
                                    }
                                }
                                arrayList1 = arrayList3;
                                if(true) {
                                    break label_41;
                                }
                                continue label_41;
                            }
                        }
                    }
                    controlledComposition1.insertMovableContent(arrayList1);
                }
                finally {
                    mutableSnapshot0.restoreCurrent(snapshot0);
                }
            }
            finally {
                Recomposer.a(mutableSnapshot0);
            }
        }
        return CollectionsKt___CollectionsKt.toList(hashMap0.keySet());
    }

    public final void i(Exception exception0, ControlledComposition controlledComposition0, boolean z) {
        f0 f00;
        if(((Boolean)Recomposer.z.get()).booleanValue() && !(exception0 instanceof ComposeRuntimeError)) {
            synchronized(this.c) {
                ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", exception0);
                this.j.clear();
                this.i.clear();
                this.h = new MutableScatterSet(0, 1, null);
                this.k.clear();
                this.l.clear();
                this.m.clear();
                this.s = new f0(z, exception0);
                if(controlledComposition0 != null) {
                    this.l(controlledComposition0);
                }
                this.b();
            }
            return;
        }
        synchronized(this.c) {
            f00 = this.s;
            if(f00 == null) {
                this.s = new f0(false, exception0);
                throw exception0;
            }
        }
        throw f00.b;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(@NotNull MovableContentStateReference movableContentStateReference0) {
        CancellableContinuation cancellableContinuation0;
        synchronized(this.c) {
            this.k.add(movableContentStateReference0);
            cancellableContinuation0 = this.b();
        }
        if(cancellableContinuation0 != null) {
            cancellableContinuation0.resumeWith(Unit.INSTANCE);
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(@NotNull ControlledComposition controlledComposition0) {
        CancellableContinuation cancellableContinuation0;
        synchronized(this.c) {
            if(this.i.contains(controlledComposition0)) {
                cancellableContinuation0 = null;
            }
            else {
                this.i.add(controlledComposition0);
                cancellableContinuation0 = this.b();
            }
        }
        if(cancellableContinuation0 != null) {
            cancellableContinuation0.resumeWith(Unit.INSTANCE);
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl recomposeScopeImpl0) {
        CancellableContinuation cancellableContinuation0;
        synchronized(this.c) {
            this.h.add(recomposeScopeImpl0);
            cancellableContinuation0 = this.b();
        }
        if(cancellableContinuation0 != null) {
            cancellableContinuation0.resumeWith(Unit.INSTANCE);
        }
    }

    public static void j(Recomposer recomposer0, Exception exception0, boolean z, int v) {
        if((v & 4) != 0) {
            z = false;
        }
        recomposer0.i(exception0, null, z);
    }

    @Nullable
    public final Object join(@NotNull Continuation continuation0) {
        Object object0 = FlowKt.first(this.getCurrentState(), new h(2, null), continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final Object k(Function3 function30, Continuation continuation0) {
        j j0 = new j(this, function30, MonotonicFrameClockKt.getMonotonicFrameClock(continuation0.getContext()), null);
        Object object0 = BuildersKt.withContext(this.b, j0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final void l(ControlledComposition controlledComposition0) {
        ArrayList arrayList0 = this.n;
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            this.n = arrayList0;
        }
        if(!arrayList0.contains(controlledComposition0)) {
            arrayList0.add(controlledComposition0);
        }
        this.f.remove(controlledComposition0);
        this.g = null;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference movableContentStateReference0, @NotNull MovableContentState movableContentState0) {
        synchronized(this.c) {
            this.m.put(movableContentStateReference0, movableContentState0);
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    @Nullable
    public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference movableContentStateReference0) {
        synchronized(this.c) {
            return (MovableContentState)this.m.remove(movableContentStateReference0);
        }
    }

    public final void pauseCompositionFrameClock() {
        synchronized(this.c) {
            this.t = true;
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(@NotNull Set set0) {
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(@NotNull ControlledComposition controlledComposition0) {
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(@NotNull ControlledComposition controlledComposition0) {
        synchronized(this.c) {
            Set set0 = this.o;
            if(set0 == null) {
                set0 = new LinkedHashSet();
                this.o = set0;
            }
            set0.add(controlledComposition0);
        }
    }

    public final void resumeCompositionFrameClock() {
        CancellableContinuation cancellableContinuation0;
        synchronized(this.c) {
            if(this.t) {
                this.t = false;
                cancellableContinuation0 = this.b();
            }
            else {
                cancellableContinuation0 = null;
            }
        }
        if(cancellableContinuation0 != null) {
            cancellableContinuation0.resumeWith(Unit.INSTANCE);
        }
    }

    @Nullable
    public final Object runRecomposeAndApplyChanges(@NotNull Continuation continuation0) {
        Object object0 = this.k(new k0(this, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @ExperimentalComposeApi
    @Nullable
    public final Object runRecomposeConcurrentlyAndApplyChanges(@NotNull CoroutineContext coroutineContext0, @NotNull Continuation continuation0) {
        Object object0 = this.k(new n0(coroutineContext0, this, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(@NotNull ControlledComposition controlledComposition0) {
        synchronized(this.c) {
            this.f.remove(controlledComposition0);
            this.g = null;
            this.i.remove(controlledComposition0);
            this.j.remove(controlledComposition0);
        }
    }
}

