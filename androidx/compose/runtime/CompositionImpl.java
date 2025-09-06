package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;
import y0.g;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00AA\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001F\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u008A\u0001B\'\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u0007\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u000B\u0010\fJ\"\u0010\u0011\u001A\u00020\u000E2\u0011\u0010\u0010\u001A\r\u0012\u0004\u0012\u00020\u000E0\r\u00A2\u0006\u0002\b\u000FH\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001A\u00020\u000E2\u0011\u0010\u0010\u001A\r\u0012\u0004\u0012\u00020\u000E0\r\u00A2\u0006\u0002\b\u000FH\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u0014H\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001C\u001A\u00020\u000E2\u0006\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\"\u0010\u001E\u001A\u00020\u000E2\u0011\u0010\u0010\u001A\r\u0012\u0004\u0012\u00020\u000E0\r\u00A2\u0006\u0002\b\u000FH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u0012J\u000F\u0010\u001F\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u001D\u0010$\u001A\u00020\u000E2\f\u0010#\u001A\b\u0012\u0004\u0012\u00020\"0!H\u0016\u00A2\u0006\u0004\b$\u0010%J\u001D\u0010\'\u001A\u00020&2\f\u0010#\u001A\b\u0012\u0004\u0012\u00020\"0!H\u0016\u00A2\u0006\u0004\b\'\u0010(J\u001D\u0010*\u001A\u00020\u000E2\f\u0010)\u001A\b\u0012\u0004\u0012\u00020\u000E0\rH\u0016\u00A2\u0006\u0004\b*\u0010+J\u0017\u0010-\u001A\u00020\u000E2\u0006\u0010,\u001A\u00020\"H\u0016\u00A2\u0006\u0004\b-\u0010.J\u0017\u0010/\u001A\u00020\u000E2\u0006\u0010,\u001A\u00020\"H\u0016\u00A2\u0006\u0004\b/\u0010.J\u000F\u00100\u001A\u00020&H\u0016\u00A2\u0006\u0004\b0\u00101J+\u00106\u001A\u00020\u000E2\u001A\u00105\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000204\u0012\u0006\u0012\u0004\u0018\u0001040302H\u0016\u00A2\u0006\u0004\b6\u00107J\u0017\u0010:\u001A\u00020\u000E2\u0006\u00109\u001A\u000208H\u0016\u00A2\u0006\u0004\b:\u0010;J\u000F\u0010<\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b<\u0010 J\u000F\u0010=\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b=\u0010 J\u000F\u0010>\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b>\u0010 J\u000F\u0010?\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b?\u0010 J\u000F\u0010@\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b@\u0010 J\u000F\u0010A\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\bA\u0010 J5\u0010E\u001A\u00028\u0000\"\u0004\b\u0000\u0010B2\b\u0010C\u001A\u0004\u0018\u00010\u00012\u0006\u0010D\u001A\u00020\u001A2\f\u0010)\u001A\b\u0012\u0004\u0012\u00028\u00000\rH\u0016\u00A2\u0006\u0004\bE\u0010FJ!\u0010K\u001A\u00020J2\u0006\u0010H\u001A\u00020G2\b\u0010I\u001A\u0004\u0018\u00010\"H\u0016\u00A2\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001A\u00020\u000E2\u0006\u0010H\u001A\u00020GH\u0016\u00A2\u0006\u0004\bM\u0010NJ%\u0010Q\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010O2\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000PH\u0016\u00A2\u0006\u0004\bQ\u0010RJ\u001F\u0010U\u001A\u00020\u000E2\u0006\u0010I\u001A\u00020\"2\u0006\u0010H\u001A\u00020GH\u0000\u00A2\u0006\u0004\bS\u0010TJ\u001B\u0010Y\u001A\u00020\u000E2\n\u00109\u001A\u0006\u0012\u0002\b\u00030VH\u0000\u00A2\u0006\u0004\bW\u0010XJ\u000F\u0010Z\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\bZ\u0010 J\u000F\u0010]\u001A\u00020\u001AH\u0000\u00A2\u0006\u0004\b[\u0010\\R \u0010d\u001A\u00020^8\u0000X\u0080\u0004\u00A2\u0006\u0012\n\u0004\b_\u0010`\u0012\u0004\bc\u0010 \u001A\u0004\ba\u0010bR(\u0010k\u001A\u00020&8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0004\be\u0010f\u0012\u0004\bj\u0010 \u001A\u0004\bg\u00101\"\u0004\bh\u0010iR\u001A\u0010q\u001A\u00020l8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bm\u0010n\u001A\u0004\bo\u0010pR\u0017\u0010s\u001A\u00020&8\u0006\u00A2\u0006\f\n\u0004\br\u0010f\u001A\u0004\bs\u00101R-\u0010y\u001A\r\u0012\u0004\u0012\u00020\u000E0\r\u00A2\u0006\u0002\b\u000F8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bt\u0010u\u001A\u0004\bv\u0010w\"\u0004\bx\u0010\u0012R\u001A\u0010|\u001A\b\u0012\u0004\u0012\u00020\"0!8AX\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bz\u0010{R\u001A\u0010~\u001A\b\u0012\u0004\u0012\u00020\"0!8AX\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b}\u0010{R\u001C\u0010\u0081\u0001\u001A\b\u0012\u0004\u0012\u00020G028AX\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u007F\u0010\u0080\u0001R\u0013\u0010\n\u001A\u00020\t8F\u00A2\u0006\b\u001A\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0084\u0001\u001A\u00020&8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0084\u0001\u00101R\u0016\u0010\u0085\u0001\u001A\u00020&8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0085\u0001\u00101R\u0016\u0010\u0087\u0001\u001A\u00020&8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0086\u0001\u00101R\u0016\u0010\u0089\u0001\u001A\u00020&8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0088\u0001\u00101\u00A8\u0006\u008B\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Applier;", "applier", "Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "setContentWithReuse", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe$runtime_release", "(Landroidx/compose/runtime/tooling/CompositionObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe", "", "key", "invalidateGroupsWithKey", "(I)V", "composeContent", "dispose", "()V", "", "", "values", "recordModificationsOf", "(Ljava/util/Set;)V", "", "observesAnyOf", "(Ljava/util/Set;)Z", "block", "prepareCompose", "(Lkotlin/jvm/functions/Function0;)V", "value", "recordReadOf", "(Ljava/lang/Object;)V", "recordWriteOf", "recompose", "()Z", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MovableContentState;", "state", "disposeUnusedMovableContent", "(Landroidx/compose/runtime/MovableContentState;)V", "applyChanges", "applyLateChanges", "changesApplied", "abandonChanges", "invalidateAll", "verifyConsistent", "R", "to", "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "Landroidx/compose/runtime/InvalidationResult;", "invalidate", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "recomposeScopeReleased", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "T", "Landroidx/compose/runtime/CompositionServiceKey;", "getCompositionService", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "removeObservation$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime_release", "(Landroidx/compose/runtime/DerivedState;)V", "removeDerivedStateObservation", "deactivate", "composerStacksSizes$runtime_release", "()I", "composerStacksSizes", "Landroidx/compose/runtime/SlotTable;", "f", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release$annotations", "slotTable", "o", "Z", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "getPendingInvalidScopes$runtime_release$annotations", "pendingInvalidScopes", "Landroidx/compose/runtime/CompositionObserverHolder;", "r", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "u", "isRoot", "w", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "composable", "getObservedObjects$runtime_release", "()Ljava/util/Set;", "observedObjects", "getDerivedStateDependencies$runtime_release", "derivedStateDependencies", "getConditionalScopes$runtime_release", "()Ljava/util/List;", "conditionalScopes", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "isComposing", "isDisposed", "getHasPendingChanges", "hasPendingChanges", "getHasInvalidations", "hasInvalidations", "y0/g", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 12 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 15 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 16 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 17 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 18 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1504:1\n1055#1,2:1525\n1225#1,3:1527\n1045#1,6:1531\n1228#1,7:1537\n1057#1,4:1544\n1055#1,2:2056\n1225#1,3:2058\n1045#1,6:2061\n1228#1,7:2067\n1057#1,4:2074\n1055#1,2:2087\n1225#1,10:2089\n1057#1,4:2099\n1055#1,2:2196\n1225#1,10:2198\n1057#1,4:2208\n1055#1,2:2213\n1225#1,10:2215\n1057#1,4:2225\n1055#1,2:2230\n1225#1,10:2232\n1057#1,4:2242\n1225#1,10:2246\n89#2:1505\n89#2:1513\n89#2:1514\n89#2:1530\n89#2:1548\n89#2:1565\n89#2:1566\n89#2:2018\n89#2:2055\n89#2:2195\n89#2:2212\n89#2:2229\n89#2:2256\n89#2:2259\n89#2:2260\n89#2:2261\n89#2:2332\n50#3,7:1506\n50#3,7:1549\n50#3,7:2324\n93#4,2:1515\n33#4,4:1517\n95#4,2:1521\n38#4:1523\n97#4:1524\n110#4,2:2078\n33#4,6:2080\n112#4:2086\n33#4,4:2320\n38#4:2331\n174#5,5:1556\n180#5,3:1562\n174#5,5:2103\n180#5,3:2109\n174#5,5:2115\n180#5,3:2121\n174#5,5:2336\n180#5,3:2342\n1#6:1561\n1#6:2108\n1#6:2120\n1#6:2317\n1#6:2341\n48#7,3:1567\n53#7:1597\n55#7:1600\n48#7,3:1637\n53#7:1703\n55#7:1733\n267#8,4:1570\n237#8,7:1574\n248#8,3:1582\n251#8,2:1586\n272#8,2:1588\n254#8,6:1590\n274#8:1596\n267#8,4:1606\n237#8,7:1610\n248#8,3:1618\n251#8,2:1622\n272#8,2:1624\n254#8,6:1626\n274#8:1632\n267#8,4:1640\n237#8,7:1644\n248#8,3:1652\n251#8,2:1656\n272#8:1658\n267#8,4:1664\n237#8,7:1668\n248#8,3:1676\n251#8,2:1680\n272#8,2:1682\n254#8,6:1684\n274#8:1690\n273#8:1695\n254#8,6:1696\n274#8:1702\n267#8,4:1705\n237#8,7:1709\n248#8,3:1717\n251#8,2:1721\n272#8,2:1723\n254#8,6:1725\n274#8:1731\n237#8,7:1757\n248#8,3:1765\n251#8,2:1769\n254#8,6:1775\n237#8,7:1821\n248#8,3:1829\n251#8,2:1833\n254#8,6:1839\n237#8,16:1885\n254#8,6:1905\n237#8,7:1930\n248#8,3:1938\n251#8,2:1942\n254#8,6:1948\n267#8,4:1987\n237#8,7:1991\n248#8,3:1999\n251#8,2:2003\n272#8,2:2005\n254#8,6:2007\n274#8:2013\n267#8,4:2024\n237#8,7:2028\n248#8,3:2036\n251#8,2:2040\n272#8,2:2042\n254#8,6:2044\n274#8:2050\n237#8,16:2151\n254#8,6:2171\n267#8,4:2268\n237#8,7:2272\n248#8,3:2280\n251#8,2:2284\n272#8:2286\n273#8:2289\n254#8,6:2290\n274#8:2296\n1810#9:1581\n1672#9:1585\n1810#9:1617\n1672#9:1621\n1810#9:1651\n1672#9:1655\n1810#9:1675\n1672#9:1679\n1810#9:1716\n1672#9:1720\n1810#9:1742\n1672#9:1746\n1810#9:1764\n1672#9:1768\n1810#9:1806\n1672#9:1810\n1810#9:1828\n1672#9:1832\n1810#9:1870\n1672#9:1874\n1810#9:1937\n1672#9:1941\n1810#9:1965\n1672#9:1969\n1810#9:1998\n1672#9:2002\n1810#9:2035\n1672#9:2039\n1810#9:2136\n1672#9:2140\n1810#9:2279\n1672#9:2283\n1855#10,2:1598\n1855#10:1704\n1856#10:1732\n77#11,5:1601\n85#11,4:1633\n77#11,5:1659\n85#11,4:1691\n138#11:1734\n139#11,5:1750\n144#11,5:1782\n152#11:1797\n138#11:1798\n139#11,5:1814\n144#11,5:1846\n152#11:1861\n138#11:1862\n139#11,5:1878\n144#11,5:1912\n152#11:1927\n77#11,5:1982\n85#11,4:2014\n77#11,5:2019\n85#11,4:2051\n138#11:2128\n139#11,5:2144\n144#11,5:2178\n152#11:2193\n91#11:2262\n77#11,5:2263\n92#11,2:2287\n85#11,10:2297\n1047#12:1735\n1049#12:1749\n1050#12,3:1787\n1053#12:1796\n1047#12:1799\n1049#12:1813\n1050#12,3:1851\n1053#12:1860\n1047#12:1863\n1049#12:1877\n1050#12,3:1917\n1053#12:1926\n1047#12:2129\n1049#12:2143\n1050#12,3:2183\n1053#12:2192\n363#13,6:1736\n373#13,3:1743\n376#13,2:1747\n379#13,6:1790\n363#13,6:1800\n373#13,3:1807\n376#13,2:1811\n379#13,6:1854\n363#13,6:1864\n373#13,3:1871\n376#13,2:1875\n379#13,6:1920\n363#13,6:2130\n373#13,3:2137\n376#13,2:2141\n379#13,6:2186\n842#14,2:1755\n845#14,4:1771\n849#14:1781\n842#14,2:1819\n845#14,4:1835\n849#14:1845\n842#14,2:1883\n845#14,4:1901\n849#14:1911\n842#14,2:1928\n845#14,4:1944\n849#14:1954\n842#14,2:2149\n845#14,4:2167\n849#14:2177\n50#15:1955\n50#15:1973\n415#16,3:1956\n373#16,6:1959\n383#16,3:1966\n386#16,2:1970\n419#16:1972\n420#16:1974\n389#16,6:1975\n421#16:1981\n46#17,3:2112\n50#17:2124\n46#17,3:2125\n50#17:2194\n46#17,3:2333\n50#17:2345\n13579#18,2:2257\n11653#18,9:2307\n13579#18:2316\n13580#18:2318\n11662#18:2319\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n731#1:1525,2\n731#1:1527,3\n734#1:1531,6\n731#1:1537,7\n731#1:1544,4\n940#1:2056,2\n940#1:2058,3\n941#1:2061,6\n940#1:2067,7\n940#1:2074,4\n961#1:2087,2\n961#1:2089,10\n961#1:2099,4\n1012#1:2196,2\n1012#1:2198,10\n1012#1:2208,4\n1021#1:2213,2\n1021#1:2215,10\n1021#1:2225,4\n1031#1:2230,2\n1031#1:2232,10\n1031#1:2242,4\n1056#1:2246,10\n632#1:1505\n654#1:1513\n671#1:1514\n732#1:1530\n751#1:1548\n797#1:1565\n818#1:1566\n928#1:2018\n938#1:2055\n1011#1:2195\n1020#1:2212\n1030#1:2229\n1073#1:2256\n1079#1:2259\n1114#1:2260\n1141#1:2261\n1253#1:2332\n647#1:1506,7\n752#1:1549,7\n1215#1:2324,7\n678#1:1515,2\n678#1:1517,4\n678#1:1521,2\n678#1:1523\n678#1:1524\n960#1:2078,2\n960#1:2080,6\n960#1:2086\n1213#1:2320,4\n1213#1:2331\n782#1:1556,5\n782#1:1562,3\n969#1:2103,5\n969#1:2109,3\n983#1:2115,5\n983#1:2121,3\n1260#1:2336,5\n1260#1:2342,3\n782#1:1561\n969#1:2108\n983#1:2120\n1212#1:2317\n1260#1:2341\n828#1:1567,3\n828#1:1597\n828#1:1600\n855#1:1637,3\n855#1:1703\n855#1:1733\n828#1:1570,4\n828#1:1574,7\n828#1:1582,3\n828#1:1586,2\n828#1:1588,2\n828#1:1590,6\n828#1:1596\n840#1:1606,4\n840#1:1610,7\n840#1:1618,3\n840#1:1622,2\n840#1:1624,2\n840#1:1626,6\n840#1:1632\n855#1:1640,4\n855#1:1644,7\n855#1:1652,3\n855#1:1656,2\n855#1:1658\n860#1:1664,4\n860#1:1668,7\n860#1:1676,3\n860#1:1680,2\n860#1:1682,2\n860#1:1684,6\n860#1:1690\n855#1:1695\n855#1:1696,6\n855#1:1702\n860#1:1705,4\n860#1:1709,7\n860#1:1717,3\n860#1:1721,2\n860#1:1723,2\n860#1:1725,6\n860#1:1731\n869#1:1757,7\n869#1:1765,3\n869#1:1769,2\n869#1:1775,6\n875#1:1821,7\n875#1:1829,3\n875#1:1833,2\n875#1:1839,6\n882#1:1885,16\n882#1:1905,6\n884#1:1930,7\n884#1:1938,3\n884#1:1942,2\n884#1:1948,6\n920#1:1987,4\n920#1:1991,7\n920#1:1999,3\n920#1:2003,2\n920#1:2005,2\n920#1:2007,6\n920#1:2013\n933#1:2024,4\n933#1:2028,7\n933#1:2036,3\n933#1:2040,2\n933#1:2042,2\n933#1:2044,6\n933#1:2050\n998#1:2151,16\n998#1:2171,6\n1170#1:2268,4\n1170#1:2272,7\n1170#1:2280,3\n1170#1:2284,2\n1170#1:2286\n1170#1:2289\n1170#1:2290,6\n1170#1:2296\n828#1:1581\n828#1:1585\n840#1:1617\n840#1:1621\n855#1:1651\n855#1:1655\n860#1:1675\n860#1:1679\n860#1:1716\n860#1:1720\n869#1:1742\n869#1:1746\n869#1:1764\n869#1:1768\n875#1:1806\n875#1:1810\n875#1:1828\n875#1:1832\n882#1:1870\n882#1:1874\n884#1:1937\n884#1:1941\n905#1:1965\n905#1:1969\n920#1:1998\n920#1:2002\n933#1:2035\n933#1:2039\n998#1:2136\n998#1:2140\n1170#1:2279\n1170#1:2283\n828#1:1598,2\n855#1:1704\n855#1:1732\n840#1:1601,5\n840#1:1633,4\n860#1:1659,5\n860#1:1691,4\n869#1:1734\n869#1:1750,5\n869#1:1782,5\n869#1:1797\n875#1:1798\n875#1:1814,5\n875#1:1846,5\n875#1:1861\n882#1:1862\n882#1:1878,5\n882#1:1912,5\n882#1:1927\n920#1:1982,5\n920#1:2014,4\n933#1:2019,5\n933#1:2051,4\n998#1:2128\n998#1:2144,5\n998#1:2178,5\n998#1:2193\n1170#1:2262\n1170#1:2263,5\n1170#1:2287,2\n1170#1:2297,10\n869#1:1735\n869#1:1749\n869#1:1787,3\n869#1:1796\n875#1:1799\n875#1:1813\n875#1:1851,3\n875#1:1860\n882#1:1863\n882#1:1877\n882#1:1917,3\n882#1:1926\n998#1:2129\n998#1:2143\n998#1:2183,3\n998#1:2192\n869#1:1736,6\n869#1:1743,3\n869#1:1747,2\n869#1:1790,6\n875#1:1800,6\n875#1:1807,3\n875#1:1811,2\n875#1:1854,6\n882#1:1864,6\n882#1:1871,3\n882#1:1875,2\n882#1:1920,6\n998#1:2130,6\n998#1:2137,3\n998#1:2141,2\n998#1:2186,6\n869#1:1755,2\n869#1:1771,4\n869#1:1781\n875#1:1819,2\n875#1:1835,4\n875#1:1845\n882#1:1883,2\n882#1:1901,4\n882#1:1911\n884#1:1928,2\n884#1:1944,4\n884#1:1954\n998#1:2149,2\n998#1:2167,4\n998#1:2177\n896#1:1955\n907#1:1973\n905#1:1956,3\n905#1:1959,6\n905#1:1966,3\n905#1:1970,2\n905#1:1972\n905#1:1974\n905#1:1975,6\n905#1:1981\n979#1:2112,3\n979#1:2124\n996#1:2125,3\n996#1:2194\n1256#1:2333,3\n1256#1:2345\n1074#1:2257,2\n1212#1:2307,9\n1212#1:2316\n1212#1:2318\n1212#1:2319\n*E\n"})
public final class CompositionImpl implements CompositionServices, ControlledComposition, RecomposeScopeOwner, ReusableComposition {
    public static final int $stable = 8;
    public final CompositionContext a;
    public final Applier b;
    public final AtomicReference c;
    public final Object d;
    public final Set e;
    public final SlotTable f;
    public final ScopeMap g;
    public final MutableScatterSet h;
    public final MutableScatterSet i;
    public final ScopeMap j;
    public final ChangeList k;
    public final ChangeList l;
    public final ScopeMap m;
    public ScopeMap n;
    public boolean o;
    public CompositionImpl p;
    public int q;
    public final CompositionObserverHolder r;
    public final ComposerImpl s;
    public final CoroutineContext t;
    public final boolean u;
    public boolean v;
    public Function2 w;

    public CompositionImpl(@NotNull CompositionContext compositionContext0, @NotNull Applier applier0, @Nullable CoroutineContext coroutineContext0) {
        this.a = compositionContext0;
        this.b = applier0;
        this.c = new AtomicReference(null);
        this.d = new Object();
        Set set0 = new MutableScatterSet(0, 1, null).asMutableSet();
        this.e = set0;
        SlotTable slotTable0 = new SlotTable();
        if(compositionContext0.getCollectingCallByInformation$runtime_release()) {
            slotTable0.collectCalledByInformation();
        }
        if(compositionContext0.getCollectingSourceInformation$runtime_release()) {
            slotTable0.collectSourceInformation();
        }
        this.f = slotTable0;
        this.g = new ScopeMap();
        this.h = new MutableScatterSet(0, 1, null);
        this.i = new MutableScatterSet(0, 1, null);
        this.j = new ScopeMap();
        ChangeList changeList0 = new ChangeList();
        this.k = changeList0;
        ChangeList changeList1 = new ChangeList();
        this.l = changeList1;
        this.m = new ScopeMap();
        this.n = new ScopeMap();
        this.r = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl0 = new ComposerImpl(applier0, compositionContext0, slotTable0, set0, changeList0, changeList1, this);
        compositionContext0.registerComposer$runtime_release(composerImpl0);
        this.s = composerImpl0;
        this.t = coroutineContext0;
        this.u = compositionContext0 instanceof Recomposer;
        this.w = ComposableSingletons.CompositionKt.INSTANCE.getLambda-1$runtime_release();
    }

    public CompositionImpl(CompositionContext compositionContext0, Applier applier0, CoroutineContext coroutineContext0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            coroutineContext0 = null;
        }
        this(compositionContext0, applier0, coroutineContext0);
    }

    public final void a(Object object0, boolean z) {
        Object object1 = this.g.getMap().get(object0);
        if(object1 != null) {
            MutableScatterSet mutableScatterSet0 = this.h;
            MutableScatterSet mutableScatterSet1 = this.i;
            ScopeMap scopeMap0 = this.m;
            if(object1 instanceof MutableScatterSet) {
                Object[] arr_object = ((MutableScatterSet)object1).elements;
                long[] arr_v = ((MutableScatterSet)object1).metadata;
                int v = arr_v.length - 2;
                if(v >= 0) {
                    int v1 = 0;
                    while(true) {
                        long v2 = arr_v[v1];
                        if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_27;
                        }
                        int v3 = 8 - (~(v1 - v) >>> 0x1F);
                        for(int v4 = 0; v4 < v3; ++v4) {
                            if((0xFFL & v2) < 0x80L) {
                                RecomposeScopeImpl recomposeScopeImpl0 = (RecomposeScopeImpl)arr_object[(v1 << 3) + v4];
                                if(!scopeMap0.remove(object0, recomposeScopeImpl0) && recomposeScopeImpl0.invalidateForResult(object0) != InvalidationResult.IGNORED) {
                                    if(!recomposeScopeImpl0.isConditional() || z) {
                                        mutableScatterSet0.add(recomposeScopeImpl0);
                                    }
                                    else {
                                        mutableScatterSet1.add(recomposeScopeImpl0);
                                    }
                                }
                            }
                            v2 >>= 8;
                        }
                        if(v3 == 8) {
                        label_27:
                            if(v1 != v) {
                                ++v1;
                                continue;
                            }
                        }
                        break;
                    }
                }
            }
            else if(!scopeMap0.remove(object0, ((RecomposeScopeImpl)object1)) && ((RecomposeScopeImpl)object1).invalidateForResult(object0) != InvalidationResult.IGNORED) {
                if(((RecomposeScopeImpl)object1).isConditional() && !z) {
                    mutableScatterSet1.add(((RecomposeScopeImpl)object1));
                    return;
                }
                mutableScatterSet0.add(((RecomposeScopeImpl)object1));
            }
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        this.c.set(null);
        this.k.clear();
        this.l.clear();
        Set set0 = this.e;
        if(!set0.isEmpty()) {
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new MutableIntList(0, 1, null);
            new MutableIntList(0, 1, null);
            if(!set0.isEmpty()) {
                Object object0 = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator iterator0 = set0.iterator();
                    while(iterator0.hasNext()) {
                        Object object1 = iterator0.next();
                        iterator0.remove();
                        ((RememberObserver)object1).onAbandoned();
                    }
                }
                finally {
                    Trace.INSTANCE.endSection(object0);
                }
            }
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        Object object0 = this.d;
        __monitor_enter(object0);
        try {
            this.c(this.k);
            this.f();
        }
        catch(Throwable throwable0) {
            try {
                try {
                    if(!this.e.isEmpty()) {
                        Set set0 = this.e;
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        new MutableIntList(0, 1, null);
                        new MutableIntList(0, 1, null);
                        if(!set0.isEmpty()) {
                            Object object1 = Trace.INSTANCE.beginSection("Compose:abandons");
                            try {
                                Iterator iterator0 = set0.iterator();
                                while(iterator0.hasNext()) {
                                    Object object2 = iterator0.next();
                                    iterator0.remove();
                                    ((RememberObserver)object2).onAbandoned();
                                }
                            }
                            finally {
                                Trace.INSTANCE.endSection(object1);
                            }
                        }
                    }
                    throw throwable0;
                }
                catch(Exception exception0) {
                }
                this.abandonChanges();
                throw exception0;
            }
            catch(Throwable throwable1) {
            }
            __monitor_exit(object0);
            throw throwable1;
        }
        __monitor_exit(object0);
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        Object object0 = this.d;
        __monitor_enter(object0);
        try {
            if(this.l.isNotEmpty()) {
                this.c(this.l);
            }
        }
        catch(Throwable throwable0) {
            try {
                try {
                    if(!this.e.isEmpty()) {
                        Set set0 = this.e;
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        new MutableIntList(0, 1, null);
                        new MutableIntList(0, 1, null);
                        if(!set0.isEmpty()) {
                            Object object1 = Trace.INSTANCE.beginSection("Compose:abandons");
                            try {
                                Iterator iterator0 = set0.iterator();
                                while(iterator0.hasNext()) {
                                    Object object2 = iterator0.next();
                                    iterator0.remove();
                                    ((RememberObserver)object2).onAbandoned();
                                }
                            }
                            finally {
                                Trace.INSTANCE.endSection(object1);
                            }
                        }
                    }
                    throw throwable0;
                }
                catch(Exception exception0) {
                }
                this.abandonChanges();
                throw exception0;
            }
            catch(Throwable throwable1) {
            }
            __monitor_exit(object0);
            throw throwable1;
        }
        __monitor_exit(object0);
    }

    public final void b(Set set0, boolean z) {
        boolean z2;
        Object[] arr_object9;
        int v44;
        int v41;
        int v40;
        long[] arr_v11;
        int v32;
        long[] arr_v8;
        boolean z1;
        Object[] arr_object6;
        long[] arr_v6;
        long v28;
        int v25;
        int v24;
        long[] arr_v5;
        MutableScatterSet mutableScatterSet0;
        ScopeMap scopeMap3;
        int v9;
        int v8;
        ScopeMap scopeMap1;
        Object[] arr_object2;
        ScopeMap scopeMap0 = this.j;
        if(set0 instanceof ScatterSetWrapper) {
            ScatterSet scatterSet0 = ((ScatterSetWrapper)set0).getSet$runtime_release();
            Object[] arr_object = scatterSet0.elements;
            long[] arr_v = scatterSet0.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_72;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    int v4 = 0;
                    while(v4 < v3) {
                        if((v2 & 0xFFL) < 0x80L) {
                            Object object0 = arr_object[(v1 << 3) + v4];
                            if(object0 instanceof RecomposeScopeImpl) {
                                ((RecomposeScopeImpl)object0).invalidateForResult(null);
                                goto label_53;
                            }
                            else {
                                this.a(object0, z);
                                Object object1 = scopeMap0.getMap().get(object0);
                                if(object1 == null) {
                                label_53:
                                    arr_object2 = arr_object;
                                    scopeMap1 = scopeMap0;
                                    v8 = v3;
                                    v9 = v4;
                                }
                                else if(object1 instanceof MutableScatterSet) {
                                    Object[] arr_object1 = ((MutableScatterSet)object1).elements;
                                    long[] arr_v1 = ((MutableScatterSet)object1).metadata;
                                    int v5 = arr_v1.length - 2;
                                    if(v5 >= 0) {
                                        arr_object2 = arr_object;
                                        scopeMap1 = scopeMap0;
                                        int v6 = 0;
                                        while(true) {
                                            long v7 = arr_v1[v6];
                                            v8 = v3;
                                            v9 = v4;
                                            if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                goto label_42;
                                            }
                                            int v10 = 8 - (~(v6 - v5) >>> 0x1F);
                                            for(int v11 = 0; v11 < v10; ++v11) {
                                                if((v7 & 0xFFL) < 0x80L) {
                                                    this.a(((DerivedState)arr_object1[(v6 << 3) + v11]), z);
                                                }
                                                v7 >>= 8;
                                            }
                                            if(v10 == 8) {
                                            label_42:
                                                if(v6 != v5) {
                                                    ++v6;
                                                    v3 = v8;
                                                    v4 = v9;
                                                    continue;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    else {
                                        goto label_53;
                                    }
                                }
                                else {
                                    arr_object2 = arr_object;
                                    scopeMap1 = scopeMap0;
                                    v8 = v3;
                                    v9 = v4;
                                    this.a(((DerivedState)object1), z);
                                }
                            }
                        }
                        else {
                            arr_object2 = arr_object;
                            scopeMap1 = scopeMap0;
                            v8 = v3;
                            v9 = v4;
                        }
                        v2 >>= 8;
                        v4 = v9 + 1;
                        scopeMap0 = scopeMap1;
                        v3 = v8;
                        arr_object = arr_object2;
                    }
                    Object[] arr_object3 = arr_object;
                    ScopeMap scopeMap2 = scopeMap0;
                    if(v3 == 8) {
                        goto label_74;
                    label_72:
                        arr_object3 = arr_object;
                        scopeMap2 = scopeMap0;
                    label_74:
                        if(v1 == v) {
                            goto label_110;
                        }
                        else {
                            ++v1;
                            arr_object = arr_object3;
                            scopeMap0 = scopeMap2;
                            continue;
                        }
                    }
                    else {
                        goto label_110;
                    }
                    break;
                }
            }
            else {
                goto label_110;
            }
        }
        else {
            Iterator iterator0 = set0.iterator();
        label_80:
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                if(object2 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl)object2).invalidateForResult(null);
                }
                else {
                    this.a(object2, z);
                    Object object3 = scopeMap0.getMap().get(object2);
                    if(object3 != null) {
                        if(object3 instanceof MutableScatterSet) {
                            Object[] arr_object4 = ((MutableScatterSet)object3).elements;
                            long[] arr_v2 = ((MutableScatterSet)object3).metadata;
                            int v12 = arr_v2.length - 2;
                            if(v12 < 0) {
                                continue;
                            }
                            int v13 = 0;
                            while(true) {
                                long v14 = arr_v2[v13];
                                if((~v14 << 7 & v14 & 0x8080808080808080L) != 0x8080808080808080L) {
                                    int v15 = 8 - (~(v13 - v12) >>> 0x1F);
                                    for(int v16 = 0; v16 < v15; ++v16) {
                                        if((v14 & 0xFFL) < 0x80L) {
                                            this.a(((DerivedState)arr_object4[(v13 << 3) + v16]), z);
                                        }
                                        v14 >>= 8;
                                    }
                                    if(v15 == 8) {
                                        goto label_105;
                                    }
                                    continue label_80;
                                }
                            label_105:
                                if(v13 == v12) {
                                    continue label_80;
                                }
                                ++v13;
                            }
                        }
                        this.a(((DerivedState)object3), z);
                    }
                }
            }
        label_110:
            scopeMap3 = this.g;
            mutableScatterSet0 = this.h;
            if(z) {
                MutableScatterSet mutableScatterSet1 = this.i;
                if(mutableScatterSet1.isNotEmpty()) {
                    MutableScatterMap mutableScatterMap0 = scopeMap3.getMap();
                    long[] arr_v3 = mutableScatterMap0.metadata;
                    int v17 = arr_v3.length - 2;
                    if(v17 >= 0) {
                        int v18 = 0;
                        while(true) {
                            long v19 = arr_v3[v18];
                            if((~v19 << 7 & v19 & 0x8080808080808080L) == 0x8080808080808080L) {
                                arr_v8 = arr_v3;
                            }
                            else {
                                int v20 = 8 - (~(v18 - v17) >>> 0x1F);
                                int v21 = 0;
                                while(v21 < v20) {
                                    if((v19 & 0xFFL) < 0x80L) {
                                        int v22 = (v18 << 3) + v21;
                                        Object object4 = mutableScatterMap0.keys[v22];
                                        Object object5 = mutableScatterMap0.values[v22];
                                        if(object5 instanceof MutableScatterSet) {
                                            Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                            MutableScatterSet mutableScatterSet2 = (MutableScatterSet)object5;
                                            Object[] arr_object5 = mutableScatterSet2.elements;
                                            long[] arr_v4 = mutableScatterSet2.metadata;
                                            arr_v5 = arr_v3;
                                            int v23 = arr_v4.length - 2;
                                            v24 = v17;
                                            v25 = v18;
                                            if(v23 >= 0) {
                                                int v26 = 0;
                                                while(true) {
                                                    long v27 = arr_v4[v26];
                                                    v28 = v19;
                                                    if((~v27 << 7 & v27 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                        goto label_165;
                                                    }
                                                    int v29 = 8 - (~(v26 - v23) >>> 0x1F);
                                                    int v30 = 0;
                                                    while(v30 < v29) {
                                                        if((v27 & 0xFFL) < 0x80L) {
                                                            arr_v6 = arr_v4;
                                                            int v31 = (v26 << 3) + v30;
                                                            arr_object6 = arr_object5;
                                                            RecomposeScopeImpl recomposeScopeImpl0 = (RecomposeScopeImpl)arr_object5[v31];
                                                            if(mutableScatterSet1.contains(recomposeScopeImpl0) || mutableScatterSet0.contains(recomposeScopeImpl0)) {
                                                                mutableScatterSet2.removeElementAt(v31);
                                                            }
                                                        }
                                                        else {
                                                            arr_v6 = arr_v4;
                                                            arr_object6 = arr_object5;
                                                        }
                                                        v27 >>= 8;
                                                        ++v30;
                                                        arr_v4 = arr_v6;
                                                        arr_object5 = arr_object6;
                                                    }
                                                    long[] arr_v7 = arr_v4;
                                                    Object[] arr_object7 = arr_object5;
                                                    if(v29 == 8) {
                                                        goto label_167;
                                                    label_165:
                                                        arr_v7 = arr_v4;
                                                        arr_object7 = arr_object5;
                                                    label_167:
                                                        if(v26 != v23) {
                                                            ++v26;
                                                            v19 = v28;
                                                            arr_v4 = arr_v7;
                                                            arr_object5 = arr_object7;
                                                            continue;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                            else {
                                                v28 = v19;
                                            }
                                            z1 = mutableScatterSet2.isEmpty();
                                        }
                                        else {
                                            arr_v5 = arr_v3;
                                            v24 = v17;
                                            v25 = v18;
                                            v28 = v19;
                                            Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                            z1 = mutableScatterSet1.contains(((RecomposeScopeImpl)object5)) || mutableScatterSet0.contains(((RecomposeScopeImpl)object5));
                                        }
                                        if(z1) {
                                            mutableScatterMap0.removeValueAt(v22);
                                        }
                                    }
                                    else {
                                        arr_v5 = arr_v3;
                                        v24 = v17;
                                        v25 = v18;
                                        v28 = v19;
                                    }
                                    v19 = v28 >> 8;
                                    ++v21;
                                    v17 = v24;
                                    arr_v3 = arr_v5;
                                    v18 = v25;
                                }
                                arr_v8 = arr_v3;
                                if(v20 != 8) {
                                    break;
                                }
                            }
                            v32 = v18;
                            if(v32 == v17) {
                                break;
                            }
                            v18 = v32 + 1;
                            arr_v3 = arr_v8;
                        }
                    }
                    mutableScatterSet1.clear();
                    this.d();
                    return;
                }
            }
        }
        if(mutableScatterSet0.isNotEmpty()) {
            MutableScatterMap mutableScatterMap1 = scopeMap3.getMap();
            long[] arr_v9 = mutableScatterMap1.metadata;
            int v33 = arr_v9.length - 2;
            if(v33 >= 0) {
                int v34 = 0;
                while(true) {
                    long v35 = arr_v9[v34];
                    if((~v35 << 7 & v35 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_285;
                    }
                    int v36 = 8 - (~(v34 - v33) >>> 0x1F);
                    int v37 = 0;
                    while(v37 < v36) {
                        if((v35 & 0xFFL) < 0x80L) {
                            int v38 = (v34 << 3) + v37;
                            Object object6 = mutableScatterMap1.keys[v38];
                            Object object7 = mutableScatterMap1.values[v38];
                            if(object7 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(object7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                MutableScatterSet mutableScatterSet3 = (MutableScatterSet)object7;
                                Object[] arr_object8 = mutableScatterSet3.elements;
                                long[] arr_v10 = mutableScatterSet3.metadata;
                                int v39 = arr_v10.length - 2;
                                arr_v11 = arr_v9;
                                v40 = v34;
                                v41 = v37;
                                if(v39 >= 0) {
                                    int v42 = 0;
                                    while(true) {
                                        long v43 = arr_v10[v42];
                                        v44 = v36;
                                        if((~v43 << 7 & v43 & 0x8080808080808080L) == 0x8080808080808080L) {
                                            goto label_254;
                                        }
                                        int v45 = 8 - (~(v42 - v39) >>> 0x1F);
                                        int v46 = 0;
                                        while(v46 < v45) {
                                            if((v43 & 0xFFL) < 0x80L) {
                                                int v47 = (v42 << 3) + v46;
                                                arr_object9 = arr_object8;
                                                if(mutableScatterSet0.contains(((RecomposeScopeImpl)arr_object8[v47]))) {
                                                    mutableScatterSet3.removeElementAt(v47);
                                                }
                                            }
                                            else {
                                                arr_object9 = arr_object8;
                                            }
                                            v43 >>= 8;
                                            ++v46;
                                            arr_object8 = arr_object9;
                                        }
                                        Object[] arr_object10 = arr_object8;
                                        if(v45 == 8) {
                                            goto label_255;
                                        label_254:
                                            arr_object10 = arr_object8;
                                        label_255:
                                            if(v42 != v39) {
                                                ++v42;
                                                v36 = v44;
                                                arr_object8 = arr_object10;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                }
                                else {
                                    v44 = v36;
                                }
                                z2 = mutableScatterSet3.isEmpty();
                            }
                            else {
                                arr_v11 = arr_v9;
                                v40 = v34;
                                v44 = v36;
                                v41 = v37;
                                Intrinsics.checkNotNull(object7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                z2 = mutableScatterSet0.contains(((RecomposeScopeImpl)object7));
                            }
                            if(z2) {
                                mutableScatterMap1.removeValueAt(v38);
                            }
                        }
                        else {
                            arr_v11 = arr_v9;
                            v40 = v34;
                            v44 = v36;
                            v41 = v37;
                        }
                        v35 >>= 8;
                        v37 = v41 + 1;
                        v34 = v40;
                        arr_v9 = arr_v11;
                        v36 = v44;
                    }
                    long[] arr_v12 = arr_v9;
                    if(v36 == 8) {
                        goto label_286;
                    label_285:
                        arr_v12 = arr_v9;
                    label_286:
                        if(v34 != v33) {
                            ++v34;
                            arr_v9 = arr_v12;
                            continue;
                        }
                        this.d();
                        mutableScatterSet0.clear();
                        return;
                    }
                    break;
                }
            }
            this.d();
            mutableScatterSet0.clear();
        }
    }

    public final void c(ChangeList changeList0) {
        int v15;
        boolean z;
        long[] arr_v3;
        int v11;
        int v10;
        long[] arr_v2;
        SlotWriter slotWriter0;
        Object object0;
        Trace trace0;
        Applier applier0 = this.b;
        ChangeList changeList1 = this.l;
        g g0 = new g(this.e);
        try {
            if(!changeList0.isEmpty()) {
                trace0 = Trace.INSTANCE;
                object0 = trace0.beginSection("Compose:applyChanges");
                goto label_6;
            }
            goto label_122;
        }
        catch(Throwable throwable0) {
            goto label_116;
        }
        try {
        label_6:
            slotWriter0 = this.f.openWriter();
        }
        catch(Throwable throwable1) {
            goto label_16;
        }
        try {
            changeList0.executeAndFlushAllPendingChanges(applier0, slotWriter0, g0);
            goto label_12;
        }
        catch(Throwable throwable2) {
            try {
                slotWriter0.close(false);
                throw throwable2;
            label_12:
                slotWriter0.close(true);
                applier0.onEndChanges();
                goto label_18;
            }
            catch(Throwable throwable1) {
            }
        }
        try {
        label_16:
            Trace.INSTANCE.endSection(object0);
            throw throwable1;
        label_18:
            trace0.endSection(object0);
            g0.b();
            g0.c();
            if(this.o) {
                Object object1 = trace0.beginSection("Compose:unobserve");
                try {
                    this.o = false;
                    MutableScatterMap mutableScatterMap0 = this.g.getMap();
                    long[] arr_v = mutableScatterMap0.metadata;
                    int v1 = arr_v.length - 2;
                    if(v1 >= 0) {
                        int v2 = 0;
                        while(true) {
                            long v3 = arr_v[v2];
                            if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_102;
                            }
                            int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                            int v5 = 0;
                            while(v5 < v4) {
                                if((v3 & 0xFFL) < 0x80L) {
                                    int v6 = (v2 << 3) + v5;
                                    Object object2 = mutableScatterMap0.keys[v6];
                                    Object object3 = mutableScatterMap0.values[v6];
                                    if(object3 instanceof MutableScatterSet) {
                                        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                        MutableScatterSet mutableScatterSet0 = (MutableScatterSet)object3;
                                        Object[] arr_object = mutableScatterSet0.elements;
                                        long[] arr_v1 = mutableScatterSet0.metadata;
                                        int v7 = arr_v1.length - 2;
                                        arr_v2 = arr_v;
                                        if(v7 >= 0) {
                                            int v8 = 0;
                                            while(true) {
                                                long v9 = arr_v1[v8];
                                                v10 = v5;
                                                v11 = v2;
                                                if((~v9 << 7 & v9 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                    goto label_69;
                                                }
                                                int v12 = 8 - (~(v8 - v7) >>> 0x1F);
                                                int v13 = 0;
                                                while(v13 < v12) {
                                                    if((v9 & 0xFFL) < 0x80L) {
                                                        arr_v3 = arr_v1;
                                                        int v14 = (v8 << 3) + v13;
                                                        if(!((RecomposeScopeImpl)arr_object[v14]).getValid()) {
                                                            mutableScatterSet0.removeElementAt(v14);
                                                        }
                                                    }
                                                    else {
                                                        arr_v3 = arr_v1;
                                                    }
                                                    v9 >>= 8;
                                                    ++v13;
                                                    arr_v1 = arr_v3;
                                                }
                                                long[] arr_v4 = arr_v1;
                                                if(v12 == 8) {
                                                    goto label_70;
                                                label_69:
                                                    arr_v4 = arr_v1;
                                                label_70:
                                                    if(v8 != v7) {
                                                        ++v8;
                                                        v2 = v11;
                                                        v5 = v10;
                                                        arr_v1 = arr_v4;
                                                        continue;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        else {
                                            v10 = v5;
                                            v11 = v2;
                                        }
                                        z = mutableScatterSet0.isEmpty();
                                    }
                                    else {
                                        arr_v2 = arr_v;
                                        v10 = v5;
                                        v11 = v2;
                                        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        z = !((RecomposeScopeImpl)object3).getValid();
                                    }
                                    if(z) {
                                        mutableScatterMap0.removeValueAt(v6);
                                    }
                                }
                                else {
                                    arr_v2 = arr_v;
                                    v10 = v5;
                                    v11 = v2;
                                }
                                v3 >>= 8;
                                v5 = v10 + 1;
                                arr_v = arr_v2;
                                v2 = v11;
                            }
                            long[] arr_v5 = arr_v;
                            if(v4 == 8) {
                                v15 = v2;
                                goto label_104;
                            }
                            else {
                                this.d();
                                goto label_119;
                            label_102:
                                arr_v5 = arr_v;
                                v15 = v2;
                            label_104:
                                if(v15 != v1) {
                                    v2 = v15 + 1;
                                    arr_v = arr_v5;
                                    continue;
                                }
                                break;
                            }
                            goto label_119;
                        }
                    }
                    this.d();
                }
                finally {
                    Trace.INSTANCE.endSection(object1);
                }
            }
            goto label_119;
        }
        catch(Throwable throwable0) {
        }
    label_116:
        if(changeList1.isEmpty()) {
            g0.a();
        }
        throw throwable0;
    label_119:
        if(changeList1.isEmpty()) {
            g0.a();
        }
        return;
    label_122:
        if(changeList1.isEmpty()) {
            g0.a();
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        Object object0 = this.d;
        __monitor_enter(object0);
        try {
            this.s.changesApplied$runtime_release();
            if(!this.e.isEmpty()) {
                Set set0 = this.e;
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new MutableIntList(0, 1, null);
                new MutableIntList(0, 1, null);
                if(!set0.isEmpty()) {
                    Object object1 = Trace.INSTANCE.beginSection("Compose:abandons");
                    try {
                        Iterator iterator0 = set0.iterator();
                        while(iterator0.hasNext()) {
                            Object object2 = iterator0.next();
                            iterator0.remove();
                            ((RememberObserver)object2).onAbandoned();
                        }
                    }
                    finally {
                        Trace.INSTANCE.endSection(object1);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            try {
                try {
                    if(!this.e.isEmpty()) {
                        Set set1 = this.e;
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        new MutableIntList(0, 1, null);
                        new MutableIntList(0, 1, null);
                        if(!set1.isEmpty()) {
                            Object object3 = Trace.INSTANCE.beginSection("Compose:abandons");
                            try {
                                Iterator iterator1 = set1.iterator();
                                while(iterator1.hasNext()) {
                                    Object object4 = iterator1.next();
                                    iterator1.remove();
                                    ((RememberObserver)object4).onAbandoned();
                                }
                            }
                            finally {
                                Trace.INSTANCE.endSection(object3);
                            }
                        }
                    }
                    throw throwable0;
                }
                catch(Exception exception0) {
                }
                this.abandonChanges();
                throw exception0;
            }
            catch(Throwable throwable1) {
            }
            __monitor_exit(object0);
            throw throwable1;
        }
        __monitor_exit(object0);
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void composeContent(@NotNull Function2 function20) {
        try {
            Object object0 = this.d;
            synchronized(object0) {
                this.e();
                ScopeMap scopeMap0 = this.n;
                this.n = new ScopeMap();
                try {
                    CompositionObserver compositionObserver0 = this.i();
                    if(compositionObserver0 != null) {
                        Map map0 = scopeMap0.asMap();
                        Intrinsics.checkNotNull(map0, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        compositionObserver0.onBeginComposition(this, map0);
                    }
                    this.s.composeContent$runtime_release(scopeMap0, function20);
                    if(compositionObserver0 != null) {
                        compositionObserver0.onEndComposition(this);
                    }
                }
                catch(Exception exception0) {
                    this.n = scopeMap0;
                    throw exception0;
                }
            }
        }
        catch(Throwable throwable0) {
            try {
                if(!this.e.isEmpty()) {
                    Set set0 = this.e;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new MutableIntList(0, 1, null);
                    new MutableIntList(0, 1, null);
                    if(!set0.isEmpty()) {
                        Object object1 = Trace.INSTANCE.beginSection("Compose:abandons");
                        try {
                            Iterator iterator0 = set0.iterator();
                            while(iterator0.hasNext()) {
                                Object object2 = iterator0.next();
                                iterator0.remove();
                                ((RememberObserver)object2).onAbandoned();
                            }
                        }
                        finally {
                            Trace.INSTANCE.endSection(object1);
                        }
                    }
                }
                throw throwable0;
            }
            catch(Exception exception1) {
            }
            this.abandonChanges();
            throw exception1;
        }
    }

    public final int composerStacksSizes$runtime_release() {
        return this.s.stacksSize$runtime_release();
    }

    public final void d() {
        boolean z;
        long[] arr_v3;
        int v9;
        long[] arr_v2;
        MutableScatterMap mutableScatterMap0 = this.j.getMap();
        long[] arr_v = mutableScatterMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_74;
                }
                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                int v4 = 0;
                while(v4 < v3) {
                    if((v2 & 0xFFL) < 0x80L) {
                        int v5 = (v1 << 3) + v4;
                        Object object0 = mutableScatterMap0.keys[v5];
                        Object object1 = mutableScatterMap0.values[v5];
                        if(object1 instanceof MutableScatterSet) {
                            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                            MutableScatterSet mutableScatterSet0 = (MutableScatterSet)object1;
                            Object[] arr_object = mutableScatterSet0.elements;
                            long[] arr_v1 = mutableScatterSet0.metadata;
                            int v6 = arr_v1.length - 2;
                            arr_v2 = arr_v;
                            if(v6 >= 0) {
                                int v7 = 0;
                                while(true) {
                                    long v8 = arr_v1[v7];
                                    v9 = v1;
                                    Object[] arr_object1 = arr_object;
                                    if((~v8 << 7 & v8 & 0x8080808080808080L) == 0x8080808080808080L) {
                                        goto label_45;
                                    }
                                    int v10 = 8 - (~(v7 - v6) >>> 0x1F);
                                    int v11 = 0;
                                    while(v11 < v10) {
                                        if(Long.compare(v8 & 0xFFL, 0x80L) < 0) {
                                            int v12 = (v7 << 3) + v11;
                                            arr_v3 = arr_v1;
                                            if(!this.g.contains(((DerivedState)arr_object1[v12]))) {
                                                mutableScatterSet0.removeElementAt(v12);
                                            }
                                        }
                                        else {
                                            arr_v3 = arr_v1;
                                        }
                                        v8 >>= 8;
                                        ++v11;
                                        arr_v1 = arr_v3;
                                    }
                                    Object[] arr_object2 = arr_object1;
                                    long[] arr_v4 = arr_v1;
                                    if(v10 == 8) {
                                        goto label_47;
                                    label_45:
                                        arr_object2 = arr_object1;
                                        arr_v4 = arr_v1;
                                    label_47:
                                        if(v7 != v6) {
                                            ++v7;
                                            arr_v1 = arr_v4;
                                            arr_object = arr_object2;
                                            v1 = v9;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            }
                            else {
                                v9 = v1;
                            }
                            z = mutableScatterSet0.isEmpty();
                        }
                        else {
                            arr_v2 = arr_v;
                            v9 = v1;
                            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                            z = !this.g.contains(((DerivedState)object1));
                        }
                        if(z) {
                            mutableScatterMap0.removeValueAt(v5);
                        }
                    }
                    else {
                        arr_v2 = arr_v;
                        v9 = v1;
                    }
                    v2 >>= 8;
                    ++v4;
                    arr_v = arr_v2;
                    v1 = v9;
                }
                long[] arr_v5 = arr_v;
                if(v3 == 8) {
                    int v13 = v1;
                    goto label_76;
                label_74:
                    arr_v5 = arr_v;
                    v13 = v1;
                label_76:
                    if(v13 != v) {
                        v1 = v13 + 1;
                        arr_v = arr_v5;
                        continue;
                    }
                }
                goto label_80;
            }
        }
        else {
        label_80:
            MutableScatterSet mutableScatterSet1 = this.i;
            if(mutableScatterSet1.isNotEmpty()) {
                Object[] arr_object3 = mutableScatterSet1.elements;
                long[] arr_v6 = mutableScatterSet1.metadata;
                int v14 = arr_v6.length - 2;
                if(v14 >= 0) {
                    int v15 = 0;
                    while(true) {
                        long v16 = arr_v6[v15];
                        if((~v16 << 7 & v16 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int v17 = 8 - (~(v15 - v14) >>> 0x1F);
                            for(int v18 = 0; v18 < v17; ++v18) {
                                if((v16 & 0xFFL) < 0x80L) {
                                    int v19 = (v15 << 3) + v18;
                                    if(!((RecomposeScopeImpl)arr_object3[v19]).isConditional()) {
                                        mutableScatterSet1.removeElementAt(v19);
                                    }
                                }
                                v16 >>= 8;
                            }
                            if(v17 == 8) {
                                goto label_100;
                            }
                            break;
                        }
                    label_100:
                        if(v15 == v14) {
                            break;
                        }
                        ++v15;
                    }
                }
            }
        }
    }

    @Override  // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        SlotWriter slotWriter0;
        g g0;
        synchronized(this.d) {
            boolean z = this.f.getGroupsSize() > 0;
            if(z || !this.e.isEmpty()) {
                Trace trace0 = Trace.INSTANCE;
                Object object1 = trace0.beginSection("Compose:deactivate");
                try {
                    g0 = new g(this.e);
                    if(z) {
                        slotWriter0 = this.f.openWriter();
                        goto label_10;
                    }
                    goto label_18;
                }
                catch(Throwable throwable0) {
                    Trace.INSTANCE.endSection(object1);
                    throw throwable0;
                }
                try {
                label_10:
                    ComposerKt.deactivateCurrentGroup(slotWriter0, g0);
                    goto label_15;
                }
                catch(Throwable throwable1) {
                    try {
                        slotWriter0.close(false);
                        throw throwable1;
                    label_15:
                        slotWriter0.close(true);
                        this.b.onEndChanges();
                        g0.b();
                    label_18:
                        g0.a();
                        goto label_24;
                    }
                    catch(Throwable throwable0) {
                    }
                }
                Trace.INSTANCE.endSection(object1);
                throw throwable0;
            label_24:
                trace0.endSection(object1);
            }
            this.g.clear();
            this.j.clear();
            this.n.clear();
            this.k.clear();
            this.l.clear();
            this.s.deactivate$runtime_release();
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public Object delegateInvalidations(@Nullable ControlledComposition controlledComposition0, int v, @NotNull Function0 function00) {
        if(controlledComposition0 != null && !Intrinsics.areEqual(controlledComposition0, this) && v >= 0) {
            this.p = (CompositionImpl)controlledComposition0;
            this.q = v;
            try {
                Object object0 = function00.invoke();
                this.p = null;
                this.q = 0;
                return object0;
            }
            catch(Throwable throwable0) {
                this.p = null;
                this.q = 0;
                throw throwable0;
            }
        }
        return function00.invoke();
    }

    @Override  // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized(this.d) {
            if(this.s.isComposing$runtime_release()) {
                PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if(!this.v) {
                this.v = true;
                this.w = ComposableSingletons.CompositionKt.INSTANCE.getLambda-2$runtime_release();
                ChangeList changeList0 = this.s.getDeferredChanges$runtime_release();
                if(changeList0 != null) {
                    this.c(changeList0);
                }
                boolean z = this.f.getGroupsSize() > 0;
                if(z || !this.e.isEmpty()) {
                    g g0 = new g(this.e);
                    if(z) {
                        SlotWriter slotWriter0 = this.f.openWriter();
                        try {
                            ComposerKt.removeCurrentGroup(slotWriter0, g0);
                        }
                        catch(Throwable throwable0) {
                            slotWriter0.close(false);
                            throw throwable0;
                        }
                        slotWriter0.close(true);
                        this.b.clear();
                        this.b.onEndChanges();
                        g0.b();
                    }
                    g0.a();
                }
                this.s.dispose$runtime_release();
            }
        }
        this.a.unregisterComposition$runtime_release(this);
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(@NotNull MovableContentState movableContentState0) {
        g g0 = new g(this.e);
        SlotWriter slotWriter0 = movableContentState0.getSlotTable$runtime_release().openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriter0, g0);
        }
        catch(Throwable throwable0) {
            slotWriter0.close(false);
            throw throwable0;
        }
        slotWriter0.close(true);
        g0.b();
    }

    public final void e() {
        AtomicReference atomicReference0 = this.c;
        Object object0 = atomicReference0.getAndSet(CompositionKt.a);
        if(object0 != null) {
            if(!Intrinsics.areEqual(object0, CompositionKt.a)) {
                if(object0 instanceof Set) {
                    this.b(((Set)object0), true);
                    return;
                }
                if(object0 instanceof Object[]) {
                    for(int v = 0; v < ((Set[])object0).length; ++v) {
                        this.b(((Set[])object0)[v], true);
                    }
                    return;
                }
                ComposerKt.composeRuntimeError(("corrupt pendingModifications drain: " + atomicReference0));
                throw new KotlinNothingValueException();
            }
            ComposerKt.composeRuntimeError("pending composition has not been applied");
            throw new KotlinNothingValueException();
        }
    }

    public final void f() {
        AtomicReference atomicReference0 = this.c;
        Object object0 = atomicReference0.getAndSet(null);
        if(!Intrinsics.areEqual(object0, CompositionKt.a)) {
            if(object0 instanceof Set) {
                this.b(((Set)object0), false);
                return;
            }
            if(object0 instanceof Object[]) {
                for(int v = 0; v < ((Set[])object0).length; ++v) {
                    this.b(((Set[])object0)[v], false);
                }
                return;
            }
            if(object0 == null) {
                ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new KotlinNothingValueException();
            }
            ComposerKt.composeRuntimeError(("corrupt pendingModifications drain: " + atomicReference0));
            throw new KotlinNothingValueException();
        }
    }

    public final InvalidationResult g(RecomposeScopeImpl recomposeScopeImpl0, Anchor anchor0, Object object0) {
        CompositionImpl compositionImpl1;
        Object object1 = this.d;
        __monitor_enter(object1);
        try {
            CompositionImpl compositionImpl0 = this.p;
            compositionImpl1 = null;
            if(compositionImpl0 != null) {
                if(!this.f.groupContainsAnchor(this.q, anchor0)) {
                    compositionImpl0 = null;
                }
                compositionImpl1 = compositionImpl0;
            }
            if(compositionImpl1 == null) {
                if(this.isComposing() && this.s.tryImminentInvalidation$runtime_release(recomposeScopeImpl0, object0)) {
                    goto label_52;
                }
                CompositionObserver compositionObserver0 = this.i();
                if(object0 == null) {
                    this.n.set(recomposeScopeImpl0, ScopeInvalidated.INSTANCE);
                }
                else if(compositionObserver0 != null || object0 instanceof DerivedState) {
                    Object object2 = this.n.getMap().get(recomposeScopeImpl0);
                    if(object2 == null) {
                        this.n.add(recomposeScopeImpl0, object0);
                    }
                    else if(object2 instanceof MutableScatterSet) {
                        Object[] arr_object = ((MutableScatterSet)object2).elements;
                        long[] arr_v = ((MutableScatterSet)object2).metadata;
                        int v = arr_v.length - 2;
                        if(v >= 0) {
                            int v1 = 0;
                            while(true) {
                                long v2 = arr_v[v1];
                                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                                    int v4 = 0;
                                    while(true) {
                                        if(v4 >= v3) {
                                            if(v3 == 8) {
                                                break;
                                            }
                                            this.n.add(recomposeScopeImpl0, object0);
                                            goto label_54;
                                        }
                                        if((v2 & 0xFFL) < 0x80L && arr_object[(v1 << 3) + v4] == ScopeInvalidated.INSTANCE) {
                                            goto label_54;
                                        }
                                        v2 >>= 8;
                                        ++v4;
                                    }
                                }
                                if(v1 == v) {
                                    break;
                                }
                                ++v1;
                            }
                        }
                        this.n.add(recomposeScopeImpl0, object0);
                    }
                    else if(object2 != ScopeInvalidated.INSTANCE) {
                        this.n.add(recomposeScopeImpl0, object0);
                    }
                }
                else {
                    this.n.set(recomposeScopeImpl0, ScopeInvalidated.INSTANCE);
                }
            }
            goto label_54;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object1);
        throw throwable0;
    label_52:
        __monitor_exit(object1);
        return InvalidationResult.IMMINENT;
    label_54:
        __monitor_exit(object1);
        if(compositionImpl1 != null) {
            return compositionImpl1.g(recomposeScopeImpl0, anchor0, object0);
        }
        this.a.invalidate$runtime_release(this);
        return this.isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
    }

    @NotNull
    public final Function2 getComposable() {
        return this.w;
    }

    @Override  // androidx.compose.runtime.CompositionServices
    @Nullable
    public Object getCompositionService(@NotNull CompositionServiceKey compositionServiceKey0) {
        return Intrinsics.areEqual(compositionServiceKey0, CompositionKt.getCompositionImplServiceKey()) ? this : null;
    }

    @NotNull
    @TestOnly
    public final List getConditionalScopes$runtime_release() {
        return CollectionsKt___CollectionsKt.toList(this.i.asSet());
    }

    @NotNull
    @TestOnly
    public final Set getDerivedStateDependencies$runtime_release() {
        return this.j.getMap().asMap().keySet();
    }

    @Override  // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        synchronized(this.d) {
            return this.n.getSize() > 0;
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        synchronized(this.d) {
            return this.s.getHasPendingChanges$runtime_release();
        }
    }

    @NotNull
    @TestOnly
    public final Set getObservedObjects$runtime_release() {
        return this.g.getMap().asMap().keySet();
    }

    @NotNull
    public final CompositionObserverHolder getObserverHolder$runtime_release() {
        return this.r;
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.o;
    }

    public static void getPendingInvalidScopes$runtime_release$annotations() {
    }

    @NotNull
    public final CoroutineContext getRecomposeContext() {
        return this.t == null ? this.a.getRecomposeCoroutineContext$runtime_release() : this.t;
    }

    @NotNull
    public final SlotTable getSlotTable$runtime_release() {
        return this.f;
    }

    public static void getSlotTable$runtime_release$annotations() {
    }

    public final void h(Object object0) {
        Object object1 = this.g.getMap().get(object0);
        if(object1 != null) {
            ScopeMap scopeMap0 = this.m;
            if(object1 instanceof MutableScatterSet) {
                Object[] arr_object = ((MutableScatterSet)object1).elements;
                long[] arr_v = ((MutableScatterSet)object1).metadata;
                int v = arr_v.length - 2;
                if(v >= 0) {
                    int v1 = 0;
                    while(true) {
                        long v2 = arr_v[v1];
                        if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_22;
                        }
                        int v3 = 8 - (~(v1 - v) >>> 0x1F);
                        for(int v4 = 0; v4 < v3; ++v4) {
                            if((0xFFL & v2) < 0x80L) {
                                RecomposeScopeImpl recomposeScopeImpl0 = (RecomposeScopeImpl)arr_object[(v1 << 3) + v4];
                                if(recomposeScopeImpl0.invalidateForResult(object0) == InvalidationResult.IMMINENT) {
                                    scopeMap0.add(object0, recomposeScopeImpl0);
                                }
                            }
                            v2 >>= 8;
                        }
                        if(v3 == 8) {
                        label_22:
                            if(v1 != v) {
                                ++v1;
                                continue;
                            }
                        }
                        break;
                    }
                }
            }
            else if(((RecomposeScopeImpl)object1).invalidateForResult(object0) == InvalidationResult.IMMINENT) {
                scopeMap0.add(object0, ((RecomposeScopeImpl)object1));
            }
        }
    }

    public final CompositionObserver i() {
        CompositionObserverHolder compositionObserverHolder0 = this.r;
        if(compositionObserverHolder0.getRoot()) {
            return compositionObserverHolder0.getObserver();
        }
        CompositionObserverHolder compositionObserverHolder1 = this.a.getObserverHolder$runtime_release();
        CompositionObserver compositionObserver0 = compositionObserverHolder1 == null ? null : compositionObserverHolder1.getObserver();
        if(!Intrinsics.areEqual(compositionObserver0, compositionObserverHolder0.getObserver())) {
            compositionObserverHolder0.setObserver(compositionObserver0);
        }
        return compositionObserver0;
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(@NotNull List list0) {
        boolean z;
        Set set0 = this.e;
        int v = list0.size();
        for(int v1 = 0; true; ++v1) {
            z = true;
            if(v1 >= v) {
                break;
            }
            if(!Intrinsics.areEqual(((MovableContentStateReference)((Pair)list0.get(v1)).getFirst()).getComposition$runtime_release(), this)) {
                z = false;
                break;
            }
        }
        ComposerKt.runtimeCheck(z);
        try {
            this.s.insertMovableContentReferences(list0);
        }
        catch(Throwable throwable0) {
            try {
                if(!set0.isEmpty()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new MutableIntList(0, 1, null);
                    new MutableIntList(0, 1, null);
                    if(!set0.isEmpty()) {
                        Object object0 = Trace.INSTANCE.beginSection("Compose:abandons");
                        try {
                            Iterator iterator0 = set0.iterator();
                            while(iterator0.hasNext()) {
                                Object object1 = iterator0.next();
                                iterator0.remove();
                                ((RememberObserver)object1).onAbandoned();
                            }
                        }
                        finally {
                            Trace.INSTANCE.endSection(object0);
                        }
                    }
                }
                throw throwable0;
            }
            catch(Exception exception0) {
                this.abandonChanges();
                throw exception0;
            }
        }
    }

    @Override  // androidx.compose.runtime.RecomposeScopeOwner
    @NotNull
    public InvalidationResult invalidate(@NotNull RecomposeScopeImpl recomposeScopeImpl0, @Nullable Object object0) {
        if(recomposeScopeImpl0.getDefaultsInScope()) {
            recomposeScopeImpl0.setDefaultsInvalid(true);
        }
        Anchor anchor0 = recomposeScopeImpl0.getAnchor();
        if(anchor0 != null && anchor0.getValid()) {
            if(!this.f.ownsAnchor(anchor0)) {
                return this.p == null || !this.p.isComposing() || !this.p.s.tryImminentInvalidation$runtime_release(recomposeScopeImpl0, object0) ? InvalidationResult.IGNORED : InvalidationResult.IMMINENT;
            }
            return recomposeScopeImpl0.getCanRecompose() ? this.g(recomposeScopeImpl0, anchor0, object0) : InvalidationResult.IGNORED;
        }
        return InvalidationResult.IGNORED;
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized(this.d) {
            Object[] arr_object = this.f.getSlots();
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                Object object1 = arr_object[v1];
                RecomposeScopeImpl recomposeScopeImpl0 = object1 instanceof RecomposeScopeImpl ? ((RecomposeScopeImpl)object1) : null;
                if(recomposeScopeImpl0 != null) {
                    recomposeScopeImpl0.invalidate();
                }
            }
        }
    }

    public final void invalidateGroupsWithKey(int v) {
        List list0;
        synchronized(this.d) {
            list0 = this.f.invalidateGroupsWithKey$runtime_release(v);
        }
        if(list0 != null) {
            int v2 = list0.size();
            int v3 = 0;
            while(v3 < v2) {
                if(((RecomposeScopeImpl)list0.get(v3)).invalidateForResult(null) == InvalidationResult.IGNORED) {
                    goto label_14;
                }
                ++v3;
            }
            return;
        }
    label_14:
        if(this.s.forceRecomposeScopes$runtime_release()) {
            this.a.invalidate$runtime_release(this);
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.s.isComposing$runtime_release();
    }

    @Override  // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.v;
    }

    public final boolean isRoot() {
        return this.u;
    }

    public static void j(SlotTable slotTable0) {
        Object[] arr_object = slotTable0.getSlots();
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            Object object0 = arr_object[v1];
            RecomposeScopeImpl recomposeScopeImpl0 = object0 instanceof RecomposeScopeImpl ? ((RecomposeScopeImpl)object0) : null;
            if(recomposeScopeImpl0 != null) {
                arrayList0.add(recomposeScopeImpl0);
            }
        }
        int v2 = arrayList0.size();
        for(int v = 0; v < v2; ++v) {
            RecomposeScopeImpl recomposeScopeImpl1 = (RecomposeScopeImpl)arrayList0.get(v);
            Anchor anchor0 = recomposeScopeImpl1.getAnchor();
            if(anchor0 != null && !slotTable0.slotsOf$runtime_release(anchor0.toIndexFor(slotTable0)).contains(recomposeScopeImpl1)) {
                PreconditionsKt.throwIllegalStateException(("Misaligned anchor " + anchor0 + " in scope " + recomposeScopeImpl1 + " encountered, scope found at " + ArraysKt___ArraysKt.indexOf(slotTable0.getSlots(), recomposeScopeImpl1)));
            }
        }
    }

    @NotNull
    public final CompositionObserverHandle observe$runtime_release(@NotNull CompositionObserver compositionObserver0) {
        synchronized(this.d) {
            this.r.setObserver(compositionObserver0);
            this.r.setRoot(true);
        }
        return new CompositionObserverHandle() {
            public final CompositionImpl a;
            public final CompositionObserver b;

            {
                CompositionImpl compositionImpl0 = compositionObserver0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = compositionImpl0;
                this.b = compositionObserver0;
            }

            @Override  // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object object0 = this.a.d;
                CompositionImpl compositionImpl0 = this.a;
                synchronized(object0) {
                    if(Intrinsics.areEqual(compositionImpl0.getObserverHolder$runtime_release().getObserver(), this.b)) {
                        compositionImpl0.getObserverHolder$runtime_release().setObserver(null);
                        compositionImpl0.getObserverHolder$runtime_release().setRoot(false);
                    }
                }
            }
        };
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(@NotNull Set set0) {
        ScopeMap scopeMap0 = this.j;
        ScopeMap scopeMap1 = this.g;
        if(set0 instanceof ScatterSetWrapper) {
            ScatterSet scatterSet0 = ((ScatterSetWrapper)set0).getSet$runtime_release();
            Object[] arr_object = scatterSet0.elements;
            long[] arr_v = scatterSet0.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_22;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            Object object0 = arr_object[(v1 << 3) + v4];
                            if(scopeMap1.contains(object0) || scopeMap0.contains(object0)) {
                                return true;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                    label_22:
                        if(v1 != v) {
                            ++v1;
                            continue;
                        }
                    }
                    break;
                }
            }
        }
        else {
            for(Object object1: set0) {
                if(scopeMap1.contains(object1) || scopeMap0.contains(object1)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@NotNull Function0 function00) {
        this.s.prepareCompose$runtime_release(function00);
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean z;
        CompositionObserver compositionObserver0;
        synchronized(this.d) {
            this.e();
            try {
                ScopeMap scopeMap0 = this.n;
                this.n = new ScopeMap();
                try {
                    compositionObserver0 = this.i();
                    if(compositionObserver0 != null) {
                        Map map0 = scopeMap0.asMap();
                        Intrinsics.checkNotNull(map0, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        compositionObserver0.onBeginComposition(this, map0);
                    }
                    z = this.s.recompose$runtime_release(scopeMap0);
                    if(!z) {
                        this.f();
                    }
                }
                catch(Exception exception0) {
                    this.n = scopeMap0;
                    throw exception0;
                }
                if(compositionObserver0 != null) {
                    try {
                        compositionObserver0.onEndComposition(this);
                        return z;
                    }
                    catch(Exception exception0) {
                    }
                    this.n = scopeMap0;
                    throw exception0;
                }
                return z;
            }
            catch(Throwable throwable0) {
            }
            try {
                if(!this.e.isEmpty()) {
                    Set set0 = this.e;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new MutableIntList(0, 1, null);
                    new MutableIntList(0, 1, null);
                    if(!set0.isEmpty()) {
                        Object object1 = Trace.INSTANCE.beginSection("Compose:abandons");
                        try {
                            Iterator iterator0 = set0.iterator();
                            while(iterator0.hasNext()) {
                                Object object2 = iterator0.next();
                                iterator0.remove();
                                ((RememberObserver)object2).onAbandoned();
                            }
                        }
                        finally {
                            Trace.INSTANCE.endSection(object1);
                        }
                    }
                }
                throw throwable0;
            }
            catch(Exception exception1) {
            }
            this.abandonChanges();
            throw exception1;
        }
    }

    @Override  // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(@NotNull RecomposeScopeImpl recomposeScopeImpl0) {
        this.o = true;
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@NotNull Set set0) {
        Set set1;
        while(true) {
            Object object0 = this.c.get();
            boolean z = true;
            if((object0 == null ? true : Intrinsics.areEqual(object0, CompositionKt.a))) {
                set1 = set0;
            }
            else if(object0 instanceof Set) {
                set1 = new Set[]{object0, set0};
            }
            else {
                if(!(object0 instanceof Object[])) {
                    break;
                }
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                set1 = ArraysKt___ArraysJvmKt.plus(((Set[])object0), set0);
            }
            AtomicReference atomicReference0 = this.c;
            while(!atomicReference0.compareAndSet(object0, set1)) {
                if(atomicReference0.get() != object0) {
                    z = false;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(z) {
                if(object0 == null) {
                    synchronized(this.d) {
                        this.f();
                    }
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException(("corrupt pendingModifications: " + this.c).toString());
    }

    @Override  // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(@NotNull Object object0) {
        ComposerImpl composerImpl0 = this.s;
        if(!composerImpl0.getAreChildrenComposing$runtime_release()) {
            RecomposeScopeImpl recomposeScopeImpl0 = composerImpl0.getCurrentRecomposeScope$runtime_release();
            if(recomposeScopeImpl0 != null) {
                recomposeScopeImpl0.setUsed(true);
                if(!recomposeScopeImpl0.recordRead(object0)) {
                    if(object0 instanceof StateObjectImpl) {
                        ((StateObjectImpl)object0).recordReadIn-h_f27i8$runtime_release(1);
                    }
                    this.g.add(object0, recomposeScopeImpl0);
                    if(object0 instanceof DerivedState) {
                        Record derivedState$Record0 = ((DerivedState)object0).getCurrentRecord();
                        ScopeMap scopeMap0 = this.j;
                        scopeMap0.removeScope(object0);
                        ObjectIntMap objectIntMap0 = derivedState$Record0.getDependencies();
                        Object[] arr_object = objectIntMap0.keys;
                        long[] arr_v = objectIntMap0.metadata;
                        int v = arr_v.length - 2;
                        if(v >= 0) {
                            for(int v1 = 0; true; ++v1) {
                                long v2 = arr_v[v1];
                                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                                    for(int v4 = 0; v4 < v3; ++v4) {
                                        if((v2 & 0xFFL) < 0x80L) {
                                            StateObject stateObject0 = (StateObject)arr_object[(v1 << 3) + v4];
                                            if(stateObject0 instanceof StateObjectImpl) {
                                                ((StateObjectImpl)stateObject0).recordReadIn-h_f27i8$runtime_release(1);
                                            }
                                            scopeMap0.add(stateObject0, object0);
                                        }
                                        v2 >>= 8;
                                    }
                                    if(v3 != 8) {
                                        recomposeScopeImpl0.recordDerivedStateValue(((DerivedState)object0), derivedState$Record0.getCurrentValue());
                                        return;
                                    }
                                }
                                if(v1 == v) {
                                    break;
                                }
                            }
                            recomposeScopeImpl0.recordDerivedStateValue(((DerivedState)object0), derivedState$Record0.getCurrentValue());
                            return;
                        }
                        recomposeScopeImpl0.recordDerivedStateValue(((DerivedState)object0), derivedState$Record0.getCurrentValue());
                    }
                }
            }
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(@NotNull Object object0) {
        synchronized(this.d) {
            this.h(object0);
            Object object2 = this.j.getMap().get(object0);
            if(object2 != null) {
                if(object2 instanceof MutableScatterSet) {
                    Object[] arr_object = ((MutableScatterSet)object2).elements;
                    long[] arr_v = ((MutableScatterSet)object2).metadata;
                    int v1 = arr_v.length - 2;
                    if(v1 >= 0) {
                        int v2 = 0;
                        while(true) {
                            long v3 = arr_v[v2];
                            if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_23;
                            }
                            int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                            for(int v5 = 0; v5 < v4; ++v5) {
                                if((0xFFL & v3) < 0x80L) {
                                    this.h(((DerivedState)arr_object[(v2 << 3) + v5]));
                                }
                                v3 >>= 8;
                            }
                            if(v4 == 8) {
                            label_23:
                                if(v2 != v1) {
                                    ++v2;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                }
                else {
                    this.h(((DerivedState)object2));
                }
            }
        }
    }

    public final void removeDerivedStateObservation$runtime_release(@NotNull DerivedState derivedState0) {
        if(!this.g.contains(derivedState0)) {
            this.j.removeScope(derivedState0);
        }
    }

    public final void removeObservation$runtime_release(@NotNull Object object0, @NotNull RecomposeScopeImpl recomposeScopeImpl0) {
        this.g.remove(object0, recomposeScopeImpl0);
    }

    public final void setComposable(@NotNull Function2 function20) {
        this.w = function20;
    }

    @Override  // androidx.compose.runtime.Composition
    public void setContent(@NotNull Function2 function20) {
        if(this.v) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        this.w = function20;
        this.a.composeInitial$runtime_release(this, function20);
    }

    @Override  // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(@NotNull Function2 function20) {
        ComposerImpl composerImpl0 = this.s;
        composerImpl0.startReuseFromRoot();
        if(this.v) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        this.w = function20;
        this.a.composeInitial$runtime_release(this, function20);
        composerImpl0.endReuseFromRoot();
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.o = z;
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized(this.d) {
            if(!this.isComposing()) {
                this.s.verifyConsistent$runtime_release();
                this.f.verifyWellFormed();
                CompositionImpl.j(this.f);
            }
        }
    }
}

