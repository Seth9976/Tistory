package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u001F\b\u0017\u0018\u00002\u00020\u0001BE\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0014\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0014\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ?\u0010\u0010\u001A\u00020\u00002\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001A\u00020\u00012\u0014\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001C\u001A\u00020\b2\u0006\u0010\u0019\u001A\u00020\u0001H\u0010\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001E\u001A\u00020\b2\u0006\u0010\u0019\u001A\u00020\u0001H\u0010\u00A2\u0006\u0004\b\u001D\u0010\u001BJ\u000F\u0010 \u001A\u00020\bH\u0010\u00A2\u0006\u0004\b\u001F\u0010\u0016J\u000F\u0010\"\u001A\u00020\bH\u0010\u00A2\u0006\u0004\b!\u0010\u0016J\u000F\u0010$\u001A\u00020\bH\u0010\u00A2\u0006\u0004\b#\u0010\u0016J5\u0010,\u001A\u00020\u00122\u0006\u0010%\u001A\u00020\u00022\u0014\u0010(\u001A\u0010\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\'\u0018\u00010&2\u0006\u0010)\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b*\u0010+J$\u00102\u001A\u00028\u0000\"\u0004\b\u0000\u0010-2\f\u0010/\u001A\b\u0012\u0004\u0012\u00028\u00000.H\u0080\b\u00A2\u0006\u0004\b0\u00101J\u000F\u00102\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b0\u0010\u0016J\u0017\u00105\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b3\u00104J\u0017\u00107\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b6\u00104J\u0017\u0010<\u001A\u00020\b2\u0006\u00109\u001A\u000208H\u0000\u00A2\u0006\u0004\b:\u0010;J\u0017\u0010@\u001A\u00020\b2\u0006\u0010=\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b>\u0010?J\u0017\u0010E\u001A\u00020\b2\u0006\u0010B\u001A\u00020AH\u0010\u00A2\u0006\u0004\bC\u0010DR(\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010IR(\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004\u00A2\u0006\f\n\u0004\bJ\u0010G\u001A\u0004\bK\u0010IR\"\u0010Q\u001A\u00020\u00028\u0010@\u0010X\u0090\u000E\u00A2\u0006\u0012\n\u0004\bL\u0010M\u001A\u0004\bN\u0010O\"\u0004\bP\u00104R:\u0010Z\u001A\n\u0012\u0004\u0012\u00020A\u0018\u00010R2\u000E\u0010S\u001A\n\u0012\u0004\u0012\u00020A\u0018\u00010R8\u0010@VX\u0090\u000E\u00A2\u0006\u0012\n\u0004\bT\u0010U\u001A\u0004\bV\u0010W\"\u0004\bX\u0010YR*\u0010b\u001A\n\u0012\u0004\u0012\u00020A\u0018\u00010[8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\\\u0010]\u001A\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010h\u001A\u00020\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bc\u0010d\u001A\u0004\be\u0010f\"\u0004\bg\u0010?R\"\u0010n\u001A\u0002088\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bi\u0010j\u001A\u0004\bk\u0010l\"\u0004\bm\u0010;R\"\u0010t\u001A\u00020\r8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bo\u0010p\u001A\u0004\bq\u0010\u000F\"\u0004\br\u0010sR\u0014\u0010v\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bu\u0010\u000FR\u0014\u0010y\u001A\u00020\u00018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bw\u0010x\u00A8\u0006z"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "hasPendingChanges", "()Z", "takeNestedMutableSnapshot", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "()V", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "notifyObjectsInitialized$runtime_release", "notifyObjectsInitialized", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "snapshotId", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "optimisticMerges", "invalidSnapshots", "innerApplyLocked$runtime_release", "(ILjava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "innerApplyLocked", "T", "Lkotlin/Function0;", "block", "advance$runtime_release", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "advance", "recordPrevious$runtime_release", "(I)V", "recordPrevious", "recordPreviousPinnedSnapshot$runtime_release", "recordPreviousPinnedSnapshot", "", "handles", "recordPreviousPinnedSnapshots$runtime_release", "([I)V", "recordPreviousPinnedSnapshots", "snapshots", "recordPreviousList$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "recordPreviousList", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "e", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "f", "getWriteObserver$runtime_release", "g", "I", "getWriteCount$runtime_release", "()I", "setWriteCount$runtime_release", "writeCount", "Landroidx/collection/MutableScatterSet;", "<set-?>", "h", "Landroidx/collection/MutableScatterSet;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "modified", "", "i", "Ljava/util/List;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "merged", "j", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "previousIds", "k", "[I", "getPreviousPinnedSnapshots$runtime_release", "()[I", "setPreviousPinnedSnapshots$runtime_release", "previousPinnedSnapshots", "m", "Z", "getApplied$runtime_release", "setApplied$runtime_release", "(Z)V", "applied", "getReadOnly", "readOnly", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2431:1\n1099#1,2:2432\n1105#1,3:2436\n1108#1,6:2441\n1099#1,2:2523\n1105#1,3:2527\n1108#1,6:2532\n1099#1,9:2629\n1108#1,6:2640\n1843#2:2434\n1843#2:2439\n1843#2:2447\n1843#2:2461\n1843#2:2525\n1843#2:2530\n1843#2:2618\n1843#2:2627\n1843#2:2638\n1843#2:2646\n1843#2:2648\n89#3:2435\n89#3:2440\n89#3:2448\n89#3:2462\n89#3:2526\n89#3:2531\n89#3:2619\n89#3:2628\n89#3:2639\n89#3:2647\n89#3:2649\n33#4,6:2449\n33#4,6:2455\n33#4,6:2517\n33#4,4:2614\n38#4:2620\n33#4,6:2621\n267#5,4:2463\n237#5,7:2467\n248#5,3:2475\n251#5,2:2479\n272#5,2:2481\n254#5,6:2483\n274#5:2489\n267#5,4:2490\n237#5,7:2494\n248#5,3:2502\n251#5,2:2506\n272#5,2:2508\n254#5,6:2510\n274#5:2516\n267#5,4:2560\n237#5,7:2564\n248#5,3:2572\n251#5,2:2576\n272#5,2:2578\n254#5,6:2580\n274#5:2586\n267#5,4:2587\n237#5,7:2591\n248#5,3:2599\n251#5,2:2603\n272#5,2:2605\n254#5,6:2607\n274#5:2613\n1810#6:2474\n1672#6:2478\n1810#6:2501\n1672#6:2505\n1810#6:2571\n1672#6:2575\n1810#6:2598\n1672#6:2602\n33#7,7:2538\n50#7,7:2545\n50#7,7:2553\n201#8:2552\n1#9:2650\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n785#1:2432,2\n785#1:2436,3\n785#1:2441,6\n920#1:2523,2\n920#1:2527,3\n920#1:2532,6\n1116#1:2629,9\n1116#1:2640,6\n786#1:2434\n785#1:2439\n837#1:2447\n893#1:2461\n921#1:2525\n920#1:2530\n1082#1:2618\n1107#1:2627\n1116#1:2638\n1119#1:2646\n1143#1:2648\n786#1:2435\n785#1:2440\n837#1:2448\n893#1:2462\n921#1:2526\n920#1:2531\n1082#1:2619\n1107#1:2628\n1116#1:2639\n1119#1:2647\n1143#1:2649\n877#1:2449,6\n885#1:2455,6\n898#1:2517,6\n1079#1:2614,4\n1079#1:2620\n1090#1:2621,6\n896#1:2463,4\n896#1:2467,7\n896#1:2475,3\n896#1:2479,2\n896#1:2481,2\n896#1:2483,6\n896#1:2489\n897#1:2490,4\n897#1:2494,7\n897#1:2502,3\n897#1:2506,2\n897#1:2508,2\n897#1:2510,6\n897#1:2516\n985#1:2560,4\n985#1:2564,7\n985#1:2572,3\n985#1:2576,2\n985#1:2578,2\n985#1:2580,6\n985#1:2586\n1020#1:2587,4\n1020#1:2591,7\n1020#1:2599,3\n1020#1:2603,2\n1020#1:2605,2\n1020#1:2607,6\n1020#1:2613\n896#1:2474\n896#1:2478\n897#1:2501\n897#1:2505\n985#1:2571\n985#1:2575\n1020#1:2598\n1020#1:2602\n937#1:2538,7\n961#1:2545,7\n967#1:2553,7\n967#1:2552\n*E\n"})
public class MutableSnapshot extends Snapshot {
    public static final int $stable = 8;
    public final Function1 e;
    public final Function1 f;
    public int g;
    public MutableScatterSet h;
    public List i;
    public SnapshotIdSet j;
    public int[] k;
    public int l;
    public boolean m;
    public static final int[] n;

    static {
        MutableSnapshot.n = new int[0];
    }

    public MutableSnapshot(int v, @NotNull SnapshotIdSet snapshotIdSet0, @Nullable Function1 function10, @Nullable Function1 function11) {
        super(v, snapshotIdSet0, null);
        this.e = function10;
        this.f = function11;
        this.j = SnapshotIdSet.Companion.getEMPTY();
        this.k = MutableSnapshot.n;
        this.l = 1;
    }

    public final Object advance$runtime_release(@NotNull Function0 function00) {
        this.recordPrevious$runtime_release(this.getId());
        Object object0 = function00.invoke();
        if(!this.getApplied$runtime_release() && !this.getDisposed$runtime_release()) {
            int v = this.getId();
            synchronized(SnapshotKt.getLock()) {
                SnapshotKt.access$setNextSnapshotId$p(4);
                this.setId$runtime_release(3);
                SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().set(this.getId()));
            }
            this.setInvalid$runtime_release(SnapshotKt.addRange(this.getInvalid$runtime_release(), v + 1, this.getId()));
            return object0;
        }
        return object0;
    }

    public final void advance$runtime_release() {
        this.recordPrevious$runtime_release(this.getId());
        if(!this.getApplied$runtime_release() && !this.getDisposed$runtime_release()) {
            int v = this.getId();
            synchronized(SnapshotKt.getLock()) {
                SnapshotKt.access$setNextSnapshotId$p(4);
                this.setId$runtime_release(3);
                SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().set(this.getId()));
            }
            this.setInvalid$runtime_release(SnapshotKt.addRange(this.getInvalid$runtime_release(), v + 1, this.getId()));
        }
    }

    @NotNull
    public SnapshotApplyResult apply() {
        SnapshotApplyResult snapshotApplyResult0;
        MutableScatterSet mutableScatterSet1;
        MutableScatterSet mutableScatterSet0 = this.getModified$runtime_release();
        Map map0 = mutableScatterSet0 == null ? null : SnapshotKt.access$optimisticMerges(((MutableSnapshot)SnapshotKt.access$getCurrentGlobalSnapshot$p().get()), this, SnapshotKt.access$getOpenSnapshots$p().clear(((GlobalSnapshot)SnapshotKt.access$getCurrentGlobalSnapshot$p().get()).getId()));
        List list0 = CollectionsKt__CollectionsKt.emptyList();
        Object object0 = SnapshotKt.getLock();
        __monitor_enter(object0);
        try {
            SnapshotKt.access$validateOpen(this);
            if(mutableScatterSet0 == null || mutableScatterSet0.getSize() == 0) {
                this.closeLocked$runtime_release();
                GlobalSnapshot globalSnapshot0 = (GlobalSnapshot)SnapshotKt.access$getCurrentGlobalSnapshot$p().get();
                SnapshotKt.access$takeNewGlobalSnapshot(globalSnapshot0, SnapshotKt.access$getEmptyLambda$p());
                mutableScatterSet1 = globalSnapshot0.getModified$runtime_release();
                if(mutableScatterSet1 != null && mutableScatterSet1.isNotEmpty()) {
                    list0 = SnapshotKt.access$getApplyObservers$p();
                    goto label_29;
                }
                mutableScatterSet1 = null;
                goto label_29;
            }
            GlobalSnapshot globalSnapshot1 = (GlobalSnapshot)SnapshotKt.access$getCurrentGlobalSnapshot$p().get();
            snapshotApplyResult0 = this.innerApplyLocked$runtime_release(3, map0, SnapshotKt.access$getOpenSnapshots$p().clear(globalSnapshot1.getId()));
            if(Intrinsics.areEqual(snapshotApplyResult0, Success.INSTANCE)) {
                this.closeLocked$runtime_release();
                SnapshotKt.access$takeNewGlobalSnapshot(globalSnapshot1, SnapshotKt.access$getEmptyLambda$p());
                mutableScatterSet1 = globalSnapshot1.getModified$runtime_release();
                this.setModified(null);
                globalSnapshot1.setModified(null);
                list0 = SnapshotKt.access$getApplyObservers$p();
                goto label_29;
            }
            goto label_106;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    label_29:
        __monitor_exit(object0);
        this.m = true;
        if(mutableScatterSet1 != null) {
            Set set0 = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet1);
            if(!set0.isEmpty()) {
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((Function2)list0.get(v1)).invoke(set0, this);
                }
            }
        }
        if(mutableScatterSet0 != null && mutableScatterSet0.isNotEmpty()) {
            Set set1 = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet0);
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ((Function2)list0.get(v3)).invoke(set1, this);
            }
        }
        synchronized(SnapshotKt.getLock()) {
            this.releasePinnedSnapshotsForCloseLocked$runtime_release();
            SnapshotKt.access$checkAndOverwriteUnusedRecordsLocked();
            if(mutableScatterSet1 == null) {
            label_73:
                if(mutableScatterSet0 == null) {
                label_93:
                    List list1 = this.i;
                    if(list1 != null) {
                        int v15 = list1.size();
                        for(int v16 = 0; v16 < v15; ++v16) {
                            SnapshotKt.access$processForUnusedRecordsLocked(((StateObject)list1.get(v16)));
                        }
                    }
                }
                else {
                    Object[] arr_object1 = mutableScatterSet0.elements;
                    long[] arr_v1 = mutableScatterSet0.metadata;
                    int v10 = arr_v1.length - 2;
                    if(v10 >= 0) {
                        int v11 = 0;
                        while(true) {
                            long v12 = arr_v1[v11];
                            if((~v12 << 7 & v12 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_90;
                            }
                            int v13 = 8 - (~(v11 - v10) >>> 0x1F);
                            for(int v14 = 0; v14 < v13; ++v14) {
                                if((v12 & 0xFFL) < 0x80L) {
                                    SnapshotKt.access$processForUnusedRecordsLocked(((StateObject)arr_object1[(v11 << 3) + v14]));
                                }
                                v12 >>= 8;
                            }
                            if(v13 == 8) {
                            label_90:
                                if(v11 != v10) {
                                    ++v11;
                                    continue;
                                }
                            }
                            goto label_93;
                        }
                    }
                    else {
                        goto label_93;
                    }
                }
            }
            else {
                Object[] arr_object = mutableScatterSet1.elements;
                long[] arr_v = mutableScatterSet1.metadata;
                int v5 = arr_v.length - 2;
                if(v5 >= 0) {
                    int v6 = 0;
                    while(true) {
                        long v7 = arr_v[v6];
                        if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_70;
                        }
                        int v8 = 8 - (~(v6 - v5) >>> 0x1F);
                        for(int v9 = 0; v9 < v8; ++v9) {
                            if((v7 & 0xFFL) < 0x80L) {
                                SnapshotKt.access$processForUnusedRecordsLocked(((StateObject)arr_object[(v6 << 3) + v9]));
                            }
                            v7 >>= 8;
                        }
                        if(v8 == 8) {
                        label_70:
                            if(v6 != v5) {
                                ++v6;
                                continue;
                            }
                        }
                        goto label_73;
                    }
                }
                else {
                    goto label_73;
                }
            }
            this.i = null;
            return Success.INSTANCE;
        }
    label_106:
        __monitor_exit(object0);
        return snapshotApplyResult0;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().clear(this.getId()).andNot(this.j));
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if(!this.getDisposed$runtime_release()) {
            super.dispose();
            this.nestedDeactivated$runtime_release(this);
        }
    }

    public final boolean getApplied$runtime_release() {
        return this.m;
    }

    @Nullable
    public final List getMerged$runtime_release() {
        return this.i;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public MutableScatterSet getModified$runtime_release() {
        return this.h;
    }

    @NotNull
    public final SnapshotIdSet getPreviousIds$runtime_release() {
        return this.j;
    }

    @NotNull
    public final int[] getPreviousPinnedSnapshots$runtime_release() {
        return this.k;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getReadObserver() {
        return this.getReadObserver$runtime_release();
    }

    @Nullable
    public Function1 getReadObserver$runtime_release() {
        return this.e;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return this.g;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1 getWriteObserver$runtime_release() {
        return this.f;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        MutableScatterSet mutableScatterSet0 = this.getModified$runtime_release();
        return mutableScatterSet0 != null && mutableScatterSet0.isNotEmpty();
    }

    @NotNull
    public final SnapshotApplyResult innerApplyLocked$runtime_release(int v, @Nullable Map map0, @NotNull SnapshotIdSet snapshotIdSet0) {
        MutableScatterSet mutableScatterSet2;
        StateRecord stateRecord5;
        SnapshotIdSet snapshotIdSet2;
        long[] arr_v1;
        Object[] arr_object1;
        MutableScatterSet mutableScatterSet1;
        List list1;
        SnapshotIdSet snapshotIdSet1 = this.getInvalid$runtime_release().set(this.getId()).or(this.j);
        MutableScatterSet mutableScatterSet0 = this.getModified$runtime_release();
        Intrinsics.checkNotNull(mutableScatterSet0);
        Object[] arr_object = mutableScatterSet0.elements;
        long[] arr_v = mutableScatterSet0.metadata;
        int v1 = arr_v.length - 2;
        List list0 = null;
        if(v1 >= 0) {
            list1 = null;
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v2];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_73;
                }
                int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        StateObject stateObject0 = (StateObject)arr_object[(v2 << 3) + v5];
                        StateRecord stateRecord0 = stateObject0.getFirstStateRecord();
                        mutableScatterSet1 = mutableScatterSet0;
                        arr_object1 = arr_object;
                        arr_v1 = arr_v;
                        StateRecord stateRecord1 = SnapshotKt.access$readable(stateRecord0, v, snapshotIdSet0);
                        if(stateRecord1 == null) {
                            snapshotIdSet2 = snapshotIdSet1;
                        }
                        else {
                            StateRecord stateRecord2 = SnapshotKt.access$readable(stateRecord0, this.getId(), snapshotIdSet1);
                            if(stateRecord2 == null) {
                                snapshotIdSet2 = snapshotIdSet1;
                            }
                            else {
                                snapshotIdSet2 = snapshotIdSet1;
                                if(stateRecord2.getSnapshotId$runtime_release() != 1 && !Intrinsics.areEqual(stateRecord1, stateRecord2)) {
                                    StateRecord stateRecord3 = SnapshotKt.access$readable(stateRecord0, this.getId(), this.getInvalid$runtime_release());
                                    if(stateRecord3 == null) {
                                        SnapshotKt.access$readError();
                                        throw new KotlinNothingValueException();
                                    }
                                    if(map0 == null) {
                                        stateRecord5 = stateObject0.mergeRecords(stateRecord2, stateRecord1, stateRecord3);
                                    }
                                    else {
                                        StateRecord stateRecord4 = (StateRecord)map0.get(stateRecord1);
                                        if(stateRecord4 != null) {
                                            stateRecord5 = stateRecord4;
                                        }
                                    }
                                    if(stateRecord5 == null) {
                                        return new Failure(this);
                                    }
                                    if(!Intrinsics.areEqual(stateRecord5, stateRecord3)) {
                                        if(Intrinsics.areEqual(stateRecord5, stateRecord1)) {
                                            if(list0 == null) {
                                                list0 = new ArrayList();
                                            }
                                            list0.add(TuplesKt.to(stateObject0, stateRecord1.create()));
                                            if(list1 == null) {
                                                list1 = new ArrayList();
                                            }
                                            list1.add(stateObject0);
                                        }
                                        else {
                                            if(list0 == null) {
                                                list0 = new ArrayList();
                                            }
                                            list0.add((Intrinsics.areEqual(stateRecord5, stateRecord2) ? TuplesKt.to(stateObject0, stateRecord2.create()) : TuplesKt.to(stateObject0, stateRecord5)));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        snapshotIdSet2 = snapshotIdSet1;
                        mutableScatterSet1 = mutableScatterSet0;
                        arr_object1 = arr_object;
                        arr_v1 = arr_v;
                    }
                    v3 >>= 8;
                    ++v5;
                    arr_object = arr_object1;
                    arr_v = arr_v1;
                    mutableScatterSet0 = mutableScatterSet1;
                    snapshotIdSet1 = snapshotIdSet2;
                }
                SnapshotIdSet snapshotIdSet3 = snapshotIdSet1;
                mutableScatterSet2 = mutableScatterSet0;
                Object[] arr_object2 = arr_object;
                long[] arr_v2 = arr_v;
                if(v4 == 8) {
                    goto label_77;
                label_73:
                    snapshotIdSet3 = snapshotIdSet1;
                    mutableScatterSet2 = mutableScatterSet0;
                    arr_object2 = arr_object;
                    arr_v2 = arr_v;
                label_77:
                    if(v2 != v1) {
                        ++v2;
                        arr_object = arr_object2;
                        arr_v = arr_v2;
                        mutableScatterSet0 = mutableScatterSet2;
                        snapshotIdSet1 = snapshotIdSet3;
                        continue;
                    }
                }
                break;
            }
        }
        else {
            mutableScatterSet2 = mutableScatterSet0;
            list1 = null;
        }
        if(list0 != null) {
            this.advance$runtime_release();
            int v6 = list0.size();
            for(int v7 = 0; v7 < v6; ++v7) {
                Pair pair0 = (Pair)list0.get(v7);
                StateObject stateObject1 = (StateObject)pair0.component1();
                StateRecord stateRecord6 = (StateRecord)pair0.component2();
                stateRecord6.setSnapshotId$runtime_release(this.getId());
                synchronized(SnapshotKt.getLock()) {
                    stateRecord6.setNext$runtime_release(stateObject1.getFirstStateRecord());
                    stateObject1.prependStateRecord(stateRecord6);
                }
            }
        }
        if(list1 != null) {
            int v9 = list1.size();
            for(int v10 = 0; v10 < v9; ++v10) {
                mutableScatterSet2.remove(((StateObject)list1.get(v10)));
            }
            List list2 = this.i;
            if(list2 != null) {
                list1 = CollectionsKt___CollectionsKt.plus(list2, list1);
            }
            this.i = list1;
        }
        return Success.INSTANCE;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void nestedActivated$runtime_release(@NotNull Snapshot snapshot0) {
        ++this.l;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void nestedDeactivated$runtime_release(@NotNull Snapshot snapshot0) {
        if(this.l <= 0) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        int v = this.l - 1;
        this.l = v;
        if(v == 0 && !this.m) {
            MutableScatterSet mutableScatterSet0 = this.getModified$runtime_release();
            if(mutableScatterSet0 != null) {
                if(this.m) {
                    PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
                }
                this.setModified(null);
                int v1 = this.getId();
                Object[] arr_object = mutableScatterSet0.elements;
                long[] arr_v = mutableScatterSet0.metadata;
                int v2 = arr_v.length - 2;
                if(v2 >= 0) {
                    for(int v3 = 0; true; ++v3) {
                        long v4 = arr_v[v3];
                        if((~v4 << 7 & v4 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int v5 = 8 - (~(v3 - v2) >>> 0x1F);
                            for(int v6 = 0; v6 < v5; ++v6) {
                                if((0xFFL & v4) < 0x80L) {
                                    for(StateRecord stateRecord0 = ((StateObject)arr_object[(v3 << 3) + v6]).getFirstStateRecord(); stateRecord0 != null; stateRecord0 = stateRecord0.getNext$runtime_release()) {
                                        if(stateRecord0.getSnapshotId$runtime_release() == v1 || CollectionsKt___CollectionsKt.contains(this.j, stateRecord0.getSnapshotId$runtime_release())) {
                                            stateRecord0.setSnapshotId$runtime_release(0);
                                        }
                                    }
                                }
                                v4 >>= 8;
                            }
                            if(v5 != 8) {
                                this.closeAndReleasePinning$runtime_release();
                                return;
                            }
                        }
                        if(v3 == v2) {
                            break;
                        }
                    }
                    this.closeAndReleasePinning$runtime_release();
                    return;
                }
                this.closeAndReleasePinning$runtime_release();
                return;
            }
            this.closeAndReleasePinning$runtime_release();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if(!this.m && !this.getDisposed$runtime_release()) {
            this.advance$runtime_release();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void recordModified$runtime_release(@NotNull StateObject stateObject0) {
        MutableScatterSet mutableScatterSet0 = this.getModified$runtime_release();
        if(mutableScatterSet0 == null) {
            mutableScatterSet0 = ScatterSetKt.mutableScatterSetOf();
            this.setModified(mutableScatterSet0);
        }
        mutableScatterSet0.add(stateObject0);
    }

    public final void recordPrevious$runtime_release(int v) {
        synchronized(SnapshotKt.getLock()) {
            this.j = this.j.set(v);
        }
    }

    public final void recordPreviousList$runtime_release(@NotNull SnapshotIdSet snapshotIdSet0) {
        synchronized(SnapshotKt.getLock()) {
            this.j = this.j.or(snapshotIdSet0);
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int v) {
        if(v >= 0) {
            this.k = ArraysKt___ArraysJvmKt.plus(this.k, v);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(@NotNull int[] arr_v) {
        if(arr_v.length == 0) {
            return;
        }
        int[] arr_v1 = this.k;
        if(arr_v1.length != 0) {
            arr_v = ArraysKt___ArraysJvmKt.plus(arr_v1, arr_v);
        }
        this.k = arr_v;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        for(int v = 0; v < this.k.length; ++v) {
            SnapshotKt.releasePinningLocked(this.k[v]);
        }
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void setApplied$runtime_release(boolean z) {
        this.m = z;
    }

    public final void setMerged$runtime_release(@Nullable List list0) {
        this.i = list0;
    }

    public void setModified(@Nullable MutableScatterSet mutableScatterSet0) {
        this.h = mutableScatterSet0;
    }

    public final void setPreviousIds$runtime_release(@NotNull SnapshotIdSet snapshotIdSet0) {
        this.j = snapshotIdSet0;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(@NotNull int[] arr_v) {
        this.k = arr_v;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int v) {
        this.g = v;
    }

    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable Function1 function10, @Nullable Function1 function11) {
        MutableSnapshot mutableSnapshot0;
        this.validateNotDisposed$runtime_release();
        if(this.m && this.d < 0) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
        this.recordPrevious$runtime_release(this.getId());
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.access$setNextSnapshotId$p(4);
            SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().set(3));
            SnapshotIdSet snapshotIdSet0 = this.getInvalid$runtime_release();
            this.setInvalid$runtime_release(snapshotIdSet0.set(3));
            mutableSnapshot0 = new NestedMutableSnapshot(3, SnapshotKt.addRange(snapshotIdSet0, this.getId() + 1, 3), SnapshotKt.d(function10, this.getReadObserver$runtime_release()), SnapshotKt.access$mergedWriteObserver(function11, this.getWriteObserver$runtime_release()), this);
        }
        if(!this.getApplied$runtime_release() && !this.getDisposed$runtime_release()) {
            int v1 = this.getId();
            synchronized(SnapshotKt.getLock()) {
                SnapshotKt.access$setNextSnapshotId$p(4);
                this.setId$runtime_release(3);
                SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().set(this.getId()));
            }
            this.setInvalid$runtime_release(SnapshotKt.addRange(this.getInvalid$runtime_release(), v1 + 1, this.getId()));
            return mutableSnapshot0;
        }
        return mutableSnapshot0;
    }

    public static MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot0, Function1 function10, Function1 function11, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if((v & 1) != 0) {
            function10 = null;
        }
        if((v & 2) != 0) {
            function11 = null;
        }
        return mutableSnapshot0.takeNestedMutableSnapshot(function10, function11);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1 function10) {
        Snapshot snapshot0;
        this.validateNotDisposed$runtime_release();
        if(this.m && this.d < 0) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
        int v = this.getId();
        this.recordPrevious$runtime_release(this.getId());
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.access$setNextSnapshotId$p(4);
            SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().set(3));
            snapshot0 = new NestedReadonlySnapshot(3, SnapshotKt.addRange(this.getInvalid$runtime_release(), v + 1, 3), SnapshotKt.d(function10, this.getReadObserver$runtime_release()), this);
        }
        if(!this.getApplied$runtime_release() && !this.getDisposed$runtime_release()) {
            int v2 = this.getId();
            synchronized(SnapshotKt.getLock()) {
                SnapshotKt.access$setNextSnapshotId$p(4);
                this.setId$runtime_release(3);
                SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().set(this.getId()));
            }
            this.setInvalid$runtime_release(SnapshotKt.addRange(this.getInvalid$runtime_release(), v2 + 1, this.getId()));
            return snapshot0;
        }
        return snapshot0;
    }
}

