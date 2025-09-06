package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.material3.ti;
import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import i1.a;
import i1.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\u001A\u001F\u0010\u0004\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005\u001A\u0017\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\b\u0010\t\u001A\u000F\u0010\u000B\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b\u000B\u0010\f\u001A$\u0010\u0010\u001A\u00028\u0000\"\u0004\b\u0000\u0010\r2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000EH\u0081\b\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001A#\u0010\u0015\u001A\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u0012*\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u0013\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A+\u0010\u0015\u001A\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u0012*\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\n\u00A2\u0006\u0004\b\u0015\u0010\u0018\u001A-\u0010\u0019\u001A\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u0012*\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\nH\u0001\u00A2\u0006\u0004\b\u0019\u0010\u0018\u001A5\u0010\u001B\u001A\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u0012*\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\n2\u0006\u0010\u001A\u001A\u00028\u0000H\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001A-\u0010\u001D\u001A\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u0012*\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b\u001D\u0010\u0018\u001A%\u0010\u001E\u001A\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u0012*\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u0013H\u0000\u00A2\u0006\u0004\b\u001E\u0010\u0016\u001A\u001F\u0010\u001F\u001A\u00020\u00072\u0006\u0010\u0017\u001A\u00020\n2\u0006\u0010\u0014\u001A\u00020\u0013H\u0001\u00A2\u0006\u0004\b\u001F\u0010 \u001AM\u0010$\u001A\u00028\u0001\"\b\b\u0000\u0010\r*\u00020\u0012\"\u0004\b\u0001\u0010!*\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\n2\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"\u00A2\u0006\u0002\b#H\u0086\b\u00A2\u0006\u0004\b$\u0010%\u001AE\u0010$\u001A\u00028\u0001\"\b\b\u0000\u0010\r*\u00020\u0012\"\u0004\b\u0001\u0010!*\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u00132\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"\u00A2\u0006\u0002\b#H\u0086\b\u00A2\u0006\u0004\b$\u0010&\u001AM\u0010\'\u001A\u00028\u0001\"\b\b\u0000\u0010\r*\u00020\u0012\"\u0004\b\u0001\u0010!*\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u001A\u001A\u00028\u00002\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"\u00A2\u0006\u0002\b#H\u0080\b\u00A2\u0006\u0004\b\'\u0010(\u001A)\u0010*\u001A\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u00122\u0006\u0010)\u001A\u00028\u00002\u0006\u0010\u0017\u001A\u00020\nH\u0001\u00A2\u0006\u0004\b*\u0010+\u001A!\u0010*\u001A\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u00122\u0006\u0010)\u001A\u00028\u0000H\u0001\u00A2\u0006\u0004\b*\u0010,\u001AG\u0010/\u001A\u00028\u0001\"\b\b\u0000\u0010\r*\u00020\u0012\"\u0004\b\u0001\u0010!*\u00028\u00002!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b()\u0012\u0004\u0012\u00028\u00010\"H\u0086\b\u00A2\u0006\u0004\b/\u00100\u001A#\u00103\u001A\u00020\u0002*\u00020\u00022\u0006\u00101\u001A\u00020\u00002\u0006\u00102\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b3\u00104\" \u0010<\u001A\u0002058\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010;\u001A\u0004\b8\u00109\" \u0010A\u001A\u00020\n8\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\b@\u0010;\u001A\u0004\b?\u0010\f\u00A8\u0006B"}, d2 = {"", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "trackPinning", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)I", "handle", "", "releasePinningLocked", "(I)V", "Landroidx/compose/runtime/snapshots/Snapshot;", "currentSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "T", "Lkotlin/Function0;", "block", "sync", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "readable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "snapshot", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "writableRecord", "candidate", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "newOverwritableRecordLocked", "notifyWrite", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V", "R", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "overwritable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "r", "current", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "Lkotlin/ParameterName;", "name", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "from", "until", "addRange", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;II)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "c", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "getLock$annotations", "()V", "lock", "k", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer", "getSnapshotInitializer$annotations", "snapshotInitializer", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2431:1\n1843#1:2432\n1843#1:2435\n1843#1:2437\n1843#1:2445\n1843#1:2474\n1843#1:2476\n2163#1,9:2478\n1843#1:2515\n1843#1:2517\n1843#1:2519\n1843#1:2521\n1843#1:2524\n1843#1:2526\n1843#1:2555\n89#2:2433\n89#2:2434\n89#2:2436\n89#2:2438\n89#2:2446\n89#2:2475\n89#2:2477\n89#2:2516\n89#2:2518\n89#2:2520\n89#2:2522\n89#2:2525\n89#2:2527\n89#2:2556\n33#3,6:2439\n267#4,4:2447\n237#4,7:2451\n248#4,3:2459\n251#4,2:2463\n272#4,2:2465\n254#4,6:2467\n274#4:2473\n267#4,4:2528\n237#4,7:2532\n248#4,3:2540\n251#4,2:2544\n272#4,2:2546\n254#4,6:2548\n274#4:2554\n1810#5:2458\n1672#5:2462\n1810#5:2539\n1672#5:2543\n125#6,28:2487\n1#7:2523\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n720#1:2432\n1904#1:2435\n1930#1:2437\n1952#1:2445\n1982#1:2474\n2035#1:2476\n2145#1:2478,9\n2199#1:2515\n2225#1:2517\n2234#1:2519\n2302#1:2521\n2314#1:2524\n2342#1:2526\n2407#1:2555\n720#1:2433\n1843#1:2434\n1904#1:2436\n1930#1:2438\n1952#1:2446\n1982#1:2475\n2035#1:2477\n2199#1:2516\n2225#1:2518\n2234#1:2520\n2302#1:2522\n2314#1:2525\n2342#1:2527\n2407#1:2556\n1944#1:2439,6\n1954#1:2447,4\n1954#1:2451,7\n1954#1:2459,3\n1954#1:2463,2\n1954#1:2465,2\n1954#1:2467,6\n1954#1:2473\n2365#1:2528,4\n2365#1:2532,7\n2365#1:2540,3\n2365#1:2544,2\n2365#1:2546,2\n2365#1:2548,6\n2365#1:2554\n1954#1:2458\n1954#1:2462\n2365#1:2539\n2365#1:2543\n2175#1:2487,28\n*E\n"})
public final class SnapshotKt {
    public static final d a;
    public static final SnapshotThreadLocal b;
    public static final Object c;
    public static SnapshotIdSet d;
    public static int e;
    public static final SnapshotDoubleIndexHeap f;
    public static final SnapshotWeakSet g;
    public static List h;
    public static List i;
    public static final AtomicReference j;
    public static final Snapshot k;
    public static final AtomicInt l;

    static {
        SnapshotKt.a = d.y;
        SnapshotKt.b = new SnapshotThreadLocal();
        SnapshotKt.c = new Object();
        SnapshotKt.d = SnapshotIdSet.Companion.getEMPTY();
        SnapshotKt.e = 2;
        SnapshotKt.f = new SnapshotDoubleIndexHeap();
        SnapshotKt.g = new SnapshotWeakSet();
        SnapshotKt.h = CollectionsKt__CollectionsKt.emptyList();
        SnapshotKt.i = CollectionsKt__CollectionsKt.emptyList();
        SnapshotKt.e = 4;
        GlobalSnapshot globalSnapshot0 = new GlobalSnapshot(3, SnapshotIdSet.Companion.getEMPTY());
        SnapshotKt.d = SnapshotKt.d.set(globalSnapshot0.getId());
        AtomicReference atomicReference0 = new AtomicReference(globalSnapshot0);
        SnapshotKt.j = atomicReference0;
        SnapshotKt.k = (Snapshot)atomicReference0.get();
        SnapshotKt.l = new AtomicInt(0);
    }

    public static final Object a(Function1 function10) {
        Object object2;
        MutableScatterSet mutableScatterSet0;
        Object object1;
        Intrinsics.checkNotNull(SnapshotKt.k, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        GlobalSnapshot globalSnapshot0 = (GlobalSnapshot)SnapshotKt.k;
        synchronized(SnapshotKt.getLock()) {
            object1 = SnapshotKt.j.get();
            mutableScatterSet0 = ((GlobalSnapshot)object1).getModified$runtime_release();
            if(mutableScatterSet0 != null) {
                SnapshotKt.l.add(1);
            }
            object2 = SnapshotKt.h(((Snapshot)object1), function10);
        }
        if(mutableScatterSet0 != null) {
            try {
                List list0 = SnapshotKt.h;
                int v2 = list0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    ((Function2)list0.get(v3)).invoke(ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet0), object1);
                }
            }
            finally {
                SnapshotKt.l.add(-1);
            }
        }
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.b();
            if(mutableScatterSet0 != null) {
                Object[] arr_object = mutableScatterSet0.elements;
                long[] arr_v = mutableScatterSet0.metadata;
                int v5 = arr_v.length - 2;
                if(v5 >= 0) {
                    int v6 = 0;
                    while(true) {
                        long v7 = arr_v[v6];
                        if((~v7 << 7 & v7 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int v8 = 8 - (~(v6 - v5) >>> 0x1F);
                            for(int v9 = 0; v9 < v8; ++v9) {
                                if((0xFFL & v7) < 0x80L) {
                                    StateObject stateObject0 = (StateObject)arr_object[(v6 << 3) + v9];
                                    if(SnapshotKt.e(stateObject0)) {
                                        SnapshotKt.g.add(stateObject0);
                                    }
                                }
                                v7 >>= 8;
                            }
                            if(v8 == 8) {
                                goto label_48;
                            }
                            break;
                        }
                    label_48:
                        if(v6 == v5) {
                            break;
                        }
                        ++v6;
                    }
                }
            }
            return object2;
        }
    }

    public static final Object access$advanceGlobalSnapshot(Function1 function10) {
        return SnapshotKt.a(function10);
    }

    public static final void access$advanceGlobalSnapshot() {
        SnapshotKt.a(d.x);
    }

    public static final void access$checkAndOverwriteUnusedRecordsLocked() {
        SnapshotKt.b();
    }

    public static final Function1 access$getEmptyLambda$p() {
        return SnapshotKt.a;
    }

    public static final int access$getNextSnapshotId$p() [...] // 潜在的解密器

    public static final SnapshotIdSet access$getOpenSnapshots$p() {
        return SnapshotKt.d;
    }

    public static final AtomicInt access$getPendingApplyObserverCount$p() {
        return SnapshotKt.l;
    }

    public static final SnapshotThreadLocal access$getThreadSnapshot$p() {
        return SnapshotKt.b;
    }

    public static final Function1 access$mergedReadObserver(Function1 function10, Function1 function11, boolean z) {
        if(!z) {
            function11 = null;
        }
        if(function10 != null && function11 != null && function10 != function11) {
            return new a(function10, function11, 1);
        }
        return function10 == null ? function11 : function10;
    }

    public static final Function1 access$mergedWriteObserver(Function1 function10, Function1 function11) {
        if(function10 != null && function11 != null && function10 != function11) {
            return new a(function10, function11, 2);
        }
        return function10 == null ? function11 : function10;
    }

    public static final Map access$optimisticMerges(MutableSnapshot mutableSnapshot0, MutableSnapshot mutableSnapshot1, SnapshotIdSet snapshotIdSet0) {
        int v7;
        long[] arr_v2;
        int v6;
        long[] arr_v1;
        MutableScatterSet mutableScatterSet0 = mutableSnapshot1.getModified$runtime_release();
        int v = mutableSnapshot0.getId();
        if(mutableScatterSet0 != null) {
            SnapshotIdSet snapshotIdSet1 = mutableSnapshot1.getInvalid$runtime_release().set(mutableSnapshot1.getId()).or(mutableSnapshot1.getPreviousIds$runtime_release());
            Object[] arr_object = mutableScatterSet0.elements;
            long[] arr_v = mutableScatterSet0.metadata;
            int v1 = arr_v.length - 2;
            if(v1 >= 0) {
                int v2 = 0;
                Map map0 = null;
                while(true) {
                    long v3 = arr_v[v2];
                    if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                        arr_v2 = arr_v;
                        v7 = v;
                    }
                    else {
                        int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                        int v5 = 0;
                        while(v5 < v4) {
                            if((0xFFL & v3) < 0x80L) {
                                StateObject stateObject0 = (StateObject)arr_object[(v2 << 3) + v5];
                                StateRecord stateRecord0 = stateObject0.getFirstStateRecord();
                                StateRecord stateRecord1 = SnapshotKt.g(stateRecord0, v, snapshotIdSet0);
                                if(stateRecord1 != null) {
                                    StateRecord stateRecord2 = SnapshotKt.g(stateRecord0, v, snapshotIdSet1);
                                    if(stateRecord2 != null && !Intrinsics.areEqual(stateRecord1, stateRecord2)) {
                                        arr_v1 = arr_v;
                                        v6 = v;
                                        StateRecord stateRecord3 = SnapshotKt.g(stateRecord0, mutableSnapshot1.getId(), mutableSnapshot1.getInvalid$runtime_release());
                                        if(stateRecord3 != null) {
                                            StateRecord stateRecord4 = stateObject0.mergeRecords(stateRecord2, stateRecord1, stateRecord3);
                                            if(stateRecord4 == null) {
                                                return null;
                                            }
                                            if(map0 == null) {
                                                map0 = new HashMap();
                                            }
                                            map0.put(stateRecord1, stateRecord4);
                                            goto label_39;
                                        }
                                        SnapshotKt.f();
                                        throw null;
                                    }
                                }
                            }
                            arr_v1 = arr_v;
                            v6 = v;
                        label_39:
                            v3 >>= 8;
                            ++v5;
                            arr_v = arr_v1;
                            v = v6;
                        }
                        arr_v2 = arr_v;
                        v7 = v;
                        if(v4 != 8) {
                            break;
                        }
                    }
                    if(v2 == v1) {
                        break;
                    }
                    ++v2;
                    arr_v = arr_v2;
                    v = v7;
                }
                return map0;
            }
            return null;
        }
        return null;
    }

    public static final void access$processForUnusedRecordsLocked(StateObject stateObject0) {
        if(SnapshotKt.e(stateObject0)) {
            SnapshotKt.g.add(stateObject0);
        }
    }

    public static final Void access$readError() {
        SnapshotKt.f();
        throw null;
    }

    public static final StateRecord access$readable(StateRecord stateRecord0, int v, SnapshotIdSet snapshotIdSet0) {
        return SnapshotKt.g(stateRecord0, v, snapshotIdSet0);
    }

    public static final Void access$reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public static final void access$setOpenSnapshots$p(SnapshotIdSet snapshotIdSet0) {
        SnapshotKt.d = snapshotIdSet0;
    }

    public static final Object access$takeNewGlobalSnapshot(Snapshot snapshot0, Function1 function10) {
        return SnapshotKt.h(snapshot0, function10);
    }

    public static final Snapshot access$takeNewSnapshot(Function1 function10) {
        return (Snapshot)SnapshotKt.a(new ti(function10, 9));
    }

    public static final void access$validateOpen(Snapshot snapshot0) {
        int v1;
        if(!SnapshotKt.d.get(snapshot0.getId())) {
            StringBuilder stringBuilder0 = new StringBuilder("Snapshot is not open: id=");
            stringBuilder0.append(snapshot0.getId());
            stringBuilder0.append(", disposed=");
            stringBuilder0.append(snapshot0.getDisposed$runtime_release());
            stringBuilder0.append(", applied=");
            MutableSnapshot mutableSnapshot0 = snapshot0 instanceof MutableSnapshot ? ((MutableSnapshot)snapshot0) : null;
            Boolean boolean0 = mutableSnapshot0 == null ? "read-only" : Boolean.valueOf(mutableSnapshot0.getApplied$runtime_release());
            stringBuilder0.append(boolean0);
            stringBuilder0.append(", lowestPin=");
            synchronized(SnapshotKt.getLock()) {
                v1 = SnapshotKt.f.lowestOrDefault(-1);
            }
            stringBuilder0.append(v1);
            throw new IllegalStateException(stringBuilder0.toString().toString());
        }
    }

    @NotNull
    public static final SnapshotIdSet addRange(@NotNull SnapshotIdSet snapshotIdSet0, int v, int v1) {
        while(v < v1) {
            snapshotIdSet0 = snapshotIdSet0.set(v);
            ++v;
        }
        return snapshotIdSet0;
    }

    public static final void b() {
        SnapshotWeakSet snapshotWeakSet0 = SnapshotKt.g;
        int v = snapshotWeakSet0.getSize$runtime_release();
        int v2 = 0;
        for(int v1 = 0; true; ++v1) {
            Object object0 = null;
            if(v1 >= v) {
                break;
            }
            WeakReference weakReference0 = snapshotWeakSet0.getValues$runtime_release()[v1];
            if(weakReference0 != null) {
                object0 = weakReference0.get();
            }
            if(object0 != null && SnapshotKt.e(((StateObject)object0))) {
                if(v2 != v1) {
                    snapshotWeakSet0.getValues$runtime_release()[v2] = weakReference0;
                    snapshotWeakSet0.getHashes$runtime_release()[v2] = snapshotWeakSet0.getHashes$runtime_release()[v1];
                }
                ++v2;
            }
        }
        for(int v3 = v2; v3 < v; ++v3) {
            snapshotWeakSet0.getValues$runtime_release()[v3] = null;
            snapshotWeakSet0.getHashes$runtime_release()[v3] = 0;
        }
        if(v2 != v) {
            snapshotWeakSet0.setSize$runtime_release(v2);
        }
    }

    public static final Snapshot c(Snapshot snapshot0, Function1 function10, boolean z) {
        if(!(snapshot0 instanceof MutableSnapshot) && snapshot0 != null) {
            return new TransparentObserverSnapshot(snapshot0, function10, false, z);
        }
        return snapshot0 instanceof MutableSnapshot ? new TransparentObserverMutableSnapshot(((MutableSnapshot)snapshot0), function10, null, false, z) : new TransparentObserverMutableSnapshot(null, function10, null, false, z);
    }

    @PublishedApi
    @NotNull
    public static final StateRecord current(@NotNull StateRecord stateRecord0) {
        StateRecord stateRecord2;
        Companion snapshot$Companion0 = Snapshot.Companion;
        Snapshot snapshot0 = snapshot$Companion0.getCurrent();
        StateRecord stateRecord1 = SnapshotKt.g(stateRecord0, snapshot0.getId(), snapshot0.getInvalid$runtime_release());
        if(stateRecord1 == null) {
            synchronized(SnapshotKt.getLock()) {
                Snapshot snapshot1 = snapshot$Companion0.getCurrent();
                stateRecord2 = SnapshotKt.g(stateRecord0, snapshot1.getId(), snapshot1.getInvalid$runtime_release());
            }
            if(stateRecord2 != null) {
                return stateRecord2;
            }
            SnapshotKt.f();
            throw null;
        }
        return stateRecord1;
    }

    @PublishedApi
    @NotNull
    public static final StateRecord current(@NotNull StateRecord stateRecord0, @NotNull Snapshot snapshot0) {
        StateRecord stateRecord1 = SnapshotKt.g(stateRecord0, snapshot0.getId(), snapshot0.getInvalid$runtime_release());
        if(stateRecord1 != null) {
            return stateRecord1;
        }
        SnapshotKt.f();
        throw null;
    }

    @NotNull
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot0 = (Snapshot)SnapshotKt.b.get();
        return snapshot0 == null ? ((Snapshot)SnapshotKt.j.get()) : snapshot0;
    }

    public static Function1 d(Function1 function10, Function1 function11) {
        if(function10 != null && function11 != null && function10 != function11) {
            return new a(function10, function11, 1);
        }
        return function10 == null ? function11 : function10;
    }

    public static final boolean e(StateObject stateObject0) {
        StateRecord stateRecord3;
        StateRecord stateRecord0 = stateObject0.getFirstStateRecord();
        int v = SnapshotKt.f.lowestOrDefault(3);
        StateRecord stateRecord1 = null;
        StateRecord stateRecord2 = null;
        int v1 = 0;
        while(stateRecord0 != null) {
            int v2 = stateRecord0.getSnapshotId$runtime_release();
            if(v2 != 0) {
                if(v2 >= v) {
                    ++v1;
                }
                else if(stateRecord1 == null) {
                    ++v1;
                    stateRecord1 = stateRecord0;
                }
                else {
                    if(stateRecord0.getSnapshotId$runtime_release() < stateRecord1.getSnapshotId$runtime_release()) {
                        stateRecord3 = stateRecord1;
                        stateRecord1 = stateRecord0;
                    }
                    else {
                        stateRecord3 = stateRecord0;
                    }
                    if(stateRecord2 == null) {
                        stateRecord2 = stateObject0.getFirstStateRecord();
                        StateRecord stateRecord4 = stateRecord2;
                        while(true) {
                            if(stateRecord2 != null) {
                                if(stateRecord2.getSnapshotId$runtime_release() < v) {
                                    if(stateRecord4.getSnapshotId$runtime_release() < stateRecord2.getSnapshotId$runtime_release()) {
                                        stateRecord4 = stateRecord2;
                                    }
                                    stateRecord2 = stateRecord2.getNext$runtime_release();
                                    continue;
                                }
                                else {
                                    break;
                                }
                            }
                            stateRecord2 = stateRecord4;
                            break;
                        }
                    }
                    stateRecord1.setSnapshotId$runtime_release(0);
                    stateRecord1.assign(stateRecord2);
                    stateRecord1 = stateRecord3;
                }
            }
            stateRecord0 = stateRecord0.getNext$runtime_release();
        }
        return v1 > 1;
    }

    public static final void f() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final StateRecord g(StateRecord stateRecord0, int v, SnapshotIdSet snapshotIdSet0) {
        StateRecord stateRecord1 = null;
        while(stateRecord0 != null) {
            int v1 = stateRecord0.getSnapshotId$runtime_release();
            if(v1 != 0 && v1 <= v && !snapshotIdSet0.get(v1) && (stateRecord1 == null || stateRecord1.getSnapshotId$runtime_release() < stateRecord0.getSnapshotId$runtime_release())) {
                stateRecord1 = stateRecord0;
            }
            stateRecord0 = stateRecord0.getNext$runtime_release();
        }
        return stateRecord1 == null ? null : stateRecord1;
    }

    @NotNull
    public static final Object getLock() {
        return SnapshotKt.c;
    }

    @PublishedApi
    public static void getLock$annotations() {
    }

    @NotNull
    public static final Snapshot getSnapshotInitializer() {
        return SnapshotKt.k;
    }

    @PublishedApi
    public static void getSnapshotInitializer$annotations() {
    }

    public static final Object h(Snapshot snapshot0, Function1 function10) {
        Object object0 = function10.invoke(SnapshotKt.d.clear(snapshot0.getId()));
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.e = 4;
            SnapshotKt.d = SnapshotKt.d.clear(snapshot0.getId());
            GlobalSnapshot globalSnapshot0 = new GlobalSnapshot(3, SnapshotKt.d);
            SnapshotKt.j.set(globalSnapshot0);
            snapshot0.dispose();
            SnapshotKt.d = SnapshotKt.d.set(3);
            return object0;
        }
    }

    @NotNull
    public static final StateRecord newOverwritableRecordLocked(@NotNull StateRecord stateRecord0, @NotNull StateObject stateObject0) {
        StateRecord stateRecord1 = stateObject0.getFirstStateRecord();
        int v = SnapshotKt.f.lowestOrDefault(3);
        SnapshotIdSet snapshotIdSet0 = SnapshotIdSet.Companion.getEMPTY();
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        while(stateRecord1 != null) {
            if(stateRecord1.getSnapshotId$runtime_release() == 0) {
                stateRecord2 = stateRecord1;
                break;
            }
            int v1 = stateRecord1.getSnapshotId$runtime_release();
            if(v1 != 0 && v1 <= v - 1 && !snapshotIdSet0.get(v1)) {
                if(stateRecord3 == null) {
                    stateRecord3 = stateRecord1;
                    goto label_17;
                }
                if(stateRecord1.getSnapshotId$runtime_release() >= stateRecord3.getSnapshotId$runtime_release()) {
                    stateRecord2 = stateRecord3;
                    break;
                }
                stateRecord2 = stateRecord1;
                break;
            }
        label_17:
            stateRecord1 = stateRecord1.getNext$runtime_release();
        }
        if(stateRecord2 != null) {
            stateRecord2.setSnapshotId$runtime_release(0x7FFFFFFF);
            return stateRecord2;
        }
        stateRecord2 = stateRecord0.create();
        stateRecord2.setSnapshotId$runtime_release(0x7FFFFFFF);
        stateRecord2.setNext$runtime_release(stateObject0.getFirstStateRecord());
        Intrinsics.checkNotNull(stateRecord2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16");
        stateObject0.prependStateRecord(stateRecord2);
        Intrinsics.checkNotNull(stateRecord2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return stateRecord2;
    }

    @NotNull
    public static final StateRecord newWritableRecord(@NotNull StateRecord stateRecord0, @NotNull StateObject stateObject0, @NotNull Snapshot snapshot0) {
        synchronized(SnapshotKt.getLock()) {
            StateRecord stateRecord1 = SnapshotKt.newOverwritableRecordLocked(stateRecord0, stateObject0);
            stateRecord1.assign(stateRecord0);
            stateRecord1.setSnapshotId$runtime_release(snapshot0.getId());
            return stateRecord1;
        }
    }

    @PublishedApi
    public static final void notifyWrite(@NotNull Snapshot snapshot0, @NotNull StateObject stateObject0) {
        snapshot0.setWriteCount$runtime_release(snapshot0.getWriteCount$runtime_release() + 1);
        Function1 function10 = snapshot0.getWriteObserver$runtime_release();
        if(function10 != null) {
            function10.invoke(stateObject0);
        }
    }

    public static final Object overwritable(@NotNull StateRecord stateRecord0, @NotNull StateObject stateObject0, @NotNull StateRecord stateRecord1, @NotNull Function1 function10) {
        Object object1;
        Snapshot snapshot0;
        synchronized(SnapshotKt.getLock()) {
            snapshot0 = Snapshot.Companion.getCurrent();
            object1 = function10.invoke(SnapshotKt.overwritableRecord(stateRecord0, stateObject0, snapshot0, stateRecord1));
        }
        SnapshotKt.notifyWrite(snapshot0, stateObject0);
        return object1;
    }

    @NotNull
    public static final StateRecord overwritableRecord(@NotNull StateRecord stateRecord0, @NotNull StateObject stateObject0, @NotNull Snapshot snapshot0, @NotNull StateRecord stateRecord1) {
        StateRecord stateRecord2;
        if(snapshot0.getReadOnly()) {
            snapshot0.recordModified$runtime_release(stateObject0);
        }
        int v = snapshot0.getId();
        if(stateRecord1.getSnapshotId$runtime_release() == v) {
            return stateRecord1;
        }
        synchronized(SnapshotKt.getLock()) {
            stateRecord2 = SnapshotKt.newOverwritableRecordLocked(stateRecord0, stateObject0);
        }
        stateRecord2.setSnapshotId$runtime_release(v);
        if(stateRecord1.getSnapshotId$runtime_release() != 1) {
            snapshot0.recordModified$runtime_release(stateObject0);
        }
        return stateRecord2;
    }

    @NotNull
    public static final StateRecord readable(@NotNull StateRecord stateRecord0, @NotNull StateObject stateObject0) {
        Companion snapshot$Companion0 = Snapshot.Companion;
        Snapshot snapshot0 = snapshot$Companion0.getCurrent();
        Function1 function10 = snapshot0.getReadObserver();
        if(function10 != null) {
            function10.invoke(stateObject0);
        }
        StateRecord stateRecord1 = SnapshotKt.g(stateRecord0, snapshot0.getId(), snapshot0.getInvalid$runtime_release());
        if(stateRecord1 == null) {
            synchronized(SnapshotKt.getLock()) {
                Snapshot snapshot1 = snapshot$Companion0.getCurrent();
                StateRecord stateRecord2 = stateObject0.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
                StateRecord stateRecord3 = SnapshotKt.g(stateRecord2, snapshot1.getId(), snapshot1.getInvalid$runtime_release());
                if(stateRecord3 != null) {
                    return stateRecord3;
                }
                SnapshotKt.f();
            }
            throw null;
        }
        return stateRecord1;
    }

    @NotNull
    public static final StateRecord readable(@NotNull StateRecord stateRecord0, @NotNull StateObject stateObject0, @NotNull Snapshot snapshot0) {
        Function1 function10 = snapshot0.getReadObserver();
        if(function10 != null) {
            function10.invoke(stateObject0);
        }
        StateRecord stateRecord1 = SnapshotKt.g(stateRecord0, snapshot0.getId(), snapshot0.getInvalid$runtime_release());
        if(stateRecord1 != null) {
            return stateRecord1;
        }
        SnapshotKt.f();
        throw null;
    }

    public static final void releasePinningLocked(int v) {
        SnapshotKt.f.remove(v);
    }

    @PublishedApi
    public static final Object sync(@NotNull Function0 function00) {
        synchronized(SnapshotKt.getLock()) {
            return function00.invoke();
        }
    }

    public static final int trackPinning(int v, @NotNull SnapshotIdSet snapshotIdSet0) {
        int v1 = snapshotIdSet0.lowest(v);
        synchronized(SnapshotKt.getLock()) {
            return SnapshotKt.f.add(v1);
        }
    }

    public static final Object withCurrent(@NotNull StateRecord stateRecord0, @NotNull Function1 function10) {
        return function10.invoke(SnapshotKt.current(stateRecord0));
    }

    public static final Object writable(@NotNull StateRecord stateRecord0, @NotNull StateObject stateObject0, @NotNull Snapshot snapshot0, @NotNull Function1 function10) {
        Object object1;
        synchronized(SnapshotKt.getLock()) {
            object1 = function10.invoke(SnapshotKt.writableRecord(stateRecord0, stateObject0, snapshot0));
        }
        SnapshotKt.notifyWrite(snapshot0, stateObject0);
        return object1;
    }

    public static final Object writable(@NotNull StateRecord stateRecord0, @NotNull StateObject stateObject0, @NotNull Function1 function10) {
        Object object1;
        Snapshot snapshot0;
        synchronized(SnapshotKt.getLock()) {
            snapshot0 = Snapshot.Companion.getCurrent();
            object1 = function10.invoke(SnapshotKt.writableRecord(stateRecord0, stateObject0, snapshot0));
        }
        SnapshotKt.notifyWrite(snapshot0, stateObject0);
        return object1;
    }

    @PublishedApi
    @NotNull
    public static final StateRecord writableRecord(@NotNull StateRecord stateRecord0, @NotNull StateObject stateObject0, @NotNull Snapshot snapshot0) {
        if(snapshot0.getReadOnly()) {
            snapshot0.recordModified$runtime_release(stateObject0);
        }
        int v = snapshot0.getId();
        StateRecord stateRecord1 = SnapshotKt.g(stateRecord0, v, snapshot0.getInvalid$runtime_release());
        if(stateRecord1 != null) {
            if(stateRecord1.getSnapshotId$runtime_release() == snapshot0.getId()) {
                return stateRecord1;
            }
            synchronized(SnapshotKt.getLock()) {
                StateRecord stateRecord2 = SnapshotKt.g(stateObject0.getFirstStateRecord(), v, snapshot0.getInvalid$runtime_release());
                if(stateRecord2 != null) {
                    if(stateRecord2.getSnapshotId$runtime_release() != v) {
                        StateRecord stateRecord3 = SnapshotKt.newOverwritableRecordLocked(stateRecord2, stateObject0);
                        stateRecord3.assign(stateRecord2);
                        stateRecord3.setSnapshotId$runtime_release(snapshot0.getId());
                        stateRecord2 = stateRecord3;
                    }
                    Intrinsics.checkNotNull(stateRecord2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
                    if(stateRecord1.getSnapshotId$runtime_release() != 1) {
                        snapshot0.recordModified$runtime_release(stateObject0);
                    }
                    return stateRecord2;
                }
                SnapshotKt.f();
            }
            throw null;
        }
        SnapshotKt.f();
        throw null;
    }
}

