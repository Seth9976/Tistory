package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.h;
import i1.b;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 Z2\u00020\u0001:\u0001ZJ\u000F\u0010\u0003\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0003\u0010\u0004J\'\u0010\u0007\u001A\u00020\u00002\u0016\b\u0002\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H&\u00A2\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH&\u00A2\u0006\u0004\b\n\u0010\u000BJ$\u0010\u000F\u001A\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\b\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0011\u0010\u0011\u001A\u0004\u0018\u00010\u0000H\u0011\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001A\u00020\u00022\b\u0010\u0013\u001A\u0004\u0018\u00010\u0000H\u0011\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001A\u0004\u0018\u00010\u0000H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0012J\u0019\u0010\u0018\u001A\u00020\u00022\b\u0010\u0017\u001A\u0004\u0018\u00010\u0000H\u0007\u00A2\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001A\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u0000H \u00A2\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001C\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u0000H \u00A2\u0006\u0004\b\u001B\u0010\u0015J\u0017\u0010!\u001A\u00020\u00022\u0006\u0010\u001E\u001A\u00020\u001DH \u00A2\u0006\u0004\b\u001F\u0010 J\u000F\u0010#\u001A\u00020\u0002H \u00A2\u0006\u0004\b\"\u0010\u0004J\u000F\u0010%\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b$\u0010\u0004J\u000F\u0010\'\u001A\u00020\u0002H\u0010\u00A2\u0006\u0004\b&\u0010\u0004J\u000F\u0010)\u001A\u00020\u0002H\u0010\u00A2\u0006\u0004\b(\u0010\u0004J\u000F\u0010+\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b*\u0010\u0004J\u000F\u0010-\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b,\u0010\u0004J\u000F\u00101\u001A\u00020.H\u0000\u00A2\u0006\u0004\b/\u00100R\"\u00109\u001A\u0002028\u0010@\u0010X\u0090\u000E\u00A2\u0006\u0012\n\u0004\b3\u00104\u001A\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010@\u001A\u00020.2\u0006\u0010:\u001A\u00020.8\u0016@PX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b;\u0010<\u001A\u0004\b=\u00100\"\u0004\b>\u0010?R\"\u0010F\u001A\u00020\t8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010B\u001A\u0004\bC\u0010\u000B\"\u0004\bD\u0010ER$\u0010J\u001A\u00020.2\u0006\u0010G\u001A\u00020.8P@PX\u0090\u000E\u00A2\u0006\f\u001A\u0004\bH\u00100\"\u0004\bI\u0010?R\u0014\u0010L\u001A\u00020\u00008&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bK\u0010\u0012R\u0014\u0010N\u001A\u00020\t8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bM\u0010\u000BR\u0015\u0010P\u001A\u00020\t8\u00C0\u0002X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bO\u0010\u000BR(\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058 X\u00A1\u0004\u00A2\u0006\f\u0012\u0004\bS\u0010\u0004\u001A\u0004\bQ\u0010RR\"\u0010U\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058 X\u00A0\u0004\u00A2\u0006\u0006\u001A\u0004\bT\u0010RR\u001C\u0010Y\u001A\n\u0012\u0004\u0012\u00020\u001D\u0018\u00010V8 X\u00A0\u0004\u00A2\u0006\u0006\u001A\u0004\bW\u0010X\u0082\u0001\u0004[\\]^\u00A8\u0006_"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "", "dispose", "()V", "Lkotlin/Function1;", "readObserver", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "", "hasPendingChanges", "()Z", "T", "Lkotlin/Function0;", "block", "enter", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "makeCurrent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "restoreCurrent", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "unsafeEnter", "oldSnapshot", "unsafeLeave", "nestedActivated$runtime_release", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "notifyObjectsInitialized$runtime_release", "notifyObjectsInitialized", "closeAndReleasePinning$runtime_release", "closeAndReleasePinning", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "validateNotDisposed$runtime_release", "validateNotDisposed", "releasePinnedSnapshotLocked$runtime_release", "releasePinnedSnapshotLocked", "", "takeoverPinnedSnapshot$runtime_release", "()I", "takeoverPinnedSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "a", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "<set-?>", "b", "I", "getId", "setId$runtime_release", "(I)V", "id", "c", "Z", "getDisposed$runtime_release", "setDisposed$runtime_release", "(Z)V", "disposed", "value", "getWriteCount$runtime_release", "setWriteCount$runtime_release", "writeCount", "getRoot", "root", "getReadOnly", "readOnly", "isPinned$runtime_release", "isPinned", "getReadObserver", "()Lkotlin/jvm/functions/Function1;", "getReadObserver$annotations", "getWriteObserver$runtime_release", "writeObserver", "Landroidx/collection/MutableScatterSet;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "modified", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2431:1\n1843#2:2432\n1843#2:2441\n89#3:2433\n89#3:2442\n50#4,7:2434\n33#4,7:2443\n1#5:2450\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n100#1:2432\n251#1:2441\n100#1:2433\n251#1:2442\n186#1:2434,7\n280#1:2443,7\n*E\n"})
public abstract class Snapshot {
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001J%\u0010\u0006\u001A\u00020\u00052\u0016\b\u0002\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00A2\u0006\u0004\b\u0006\u0010\u0007J=\u0010\n\u001A\u00020\t2\u0016\b\u0002\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00A2\u0006\u0004\b\n\u0010\u000BJ$\u0010\u000F\u001A\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\b\u00A2\u0006\u0004\b\u000F\u0010\u0010J$\u0010\u0012\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00112\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\b\u00A2\u0006\u0004\b\u0012\u0010\u0010JQ\u0010\u0013\u001A\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0016\b\u0002\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\r\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0005H\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001A\u00020\u00052\b\u0010\u0017\u001A\u0004\u0018\u00010\u0005H\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001C\u001A\u00020\u00032\b\u0010\u0017\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u001A\u001A\u00020\u00052\u0014\u0010\u001B\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ6\u0010\u001F\u001A\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00028\u00000\r\u00A2\u0006\u0002\b\u001EH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00A2\u0006\u0004\b\u001F\u0010\u0010J-\u0010#\u001A\u00020\"2\u001E\u0010\u001B\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010!\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030 \u00A2\u0006\u0004\b#\u0010$J!\u0010%\u001A\u00020\"2\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0004\b%\u0010&J\r\u0010\'\u001A\u00020\u0003\u00A2\u0006\u0004\b\'\u0010(J\r\u0010)\u001A\u00020\u0003\u00A2\u0006\u0004\b)\u0010(J\u000F\u0010+\u001A\u00020*H\u0007\u00A2\u0006\u0004\b+\u0010,J\u0011\u0010-\u001A\u0004\u0018\u00010\u0005H\u0001\u00A2\u0006\u0004\b-\u0010\u0016J\u0019\u0010.\u001A\u00020\u00032\b\u0010\u0017\u001A\u0004\u0018\u00010\u0005H\u0001\u00A2\u0006\u0004\b.\u0010/R\u0011\u00101\u001A\u00020\u00058F\u00A2\u0006\u0006\u001A\u0004\b0\u0010\u0016R\u0011\u00103\u001A\u0002028F\u00A2\u0006\u0006\u001A\u0004\b3\u00104R\u0011\u00105\u001A\u0002028F\u00A2\u0006\u0006\u001A\u0004\b5\u00104R\u001C\u00108\u001A\u0004\u0018\u00010\u00058@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\b7\u0010(\u001A\u0004\b6\u0010\u0016R\u001A\u00109\u001A\u00020*8\u0006X\u0086T\u00A2\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u0010(\u00A8\u0006<"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "Lkotlin/Function1;", "", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "writeObserver", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "takeMutableSnapshot", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", "T", "Lkotlin/Function0;", "block", "global", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "R", "withMutableSnapshot", "observe", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "createNonObservableSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "previous", "makeCurrentNonObservable", "(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;", "nonObservable", "observer", "restoreNonObservable", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/runtime/DisallowComposableCalls;", "withoutReadObservation", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "registerApplyObserver", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/snapshots/ObserverHandle;", "registerGlobalWriteObserver", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/ObserverHandle;", "notifyObjectsInitialized", "()V", "sendApplyNotifications", "", "openSnapshotCount", "()I", "removeCurrent", "restoreCurrent", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "getCurrent", "current", "", "isInSnapshot", "()Z", "isApplyObserverNotificationPending", "getCurrentThreadSnapshot", "getCurrentThreadSnapshot$annotations", "currentThreadSnapshot", "PreexistingSnapshotId", "I", "getPreexistingSnapshotId$annotations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2431:1\n547#1:2438\n547#1:2444\n550#1:2445\n1#2:2432\n138#3,5:2433\n138#3,5:2439\n1843#4:2446\n1843#4:2448\n1843#4:2450\n1843#4:2452\n1843#4:2454\n89#5:2447\n89#5:2449\n89#5:2451\n89#5:2453\n89#5:2455\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n493#1:2438\n555#1:2444\n559#1:2445\n462#1:2433,5\n529#1:2439,5\n623#1:2446\n650#1:2448\n688#1:2450\n627#1:2452\n655#1:2454\n623#1:2447\n650#1:2449\n688#1:2451\n627#1:2453\n655#1:2455\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @PublishedApi
        @NotNull
        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.c(((Snapshot)SnapshotKt.access$getThreadSnapshot$p().get()), null, false);
        }

        @NotNull
        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        @Nullable
        public final Snapshot getCurrentThreadSnapshot() {
            return (Snapshot)SnapshotKt.access$getThreadSnapshot$p().get();
        }

        @PublishedApi
        public static void getCurrentThreadSnapshot$annotations() {
        }

        public static void getPreexistingSnapshotId$annotations() {
        }

        public final Object global(@NotNull Function0 function00) {
            Snapshot snapshot0 = this.removeCurrent();
            Object object0 = function00.invoke();
            Snapshot.Companion.restoreCurrent(snapshot0);
            return object0;
        }

        public final boolean isApplyObserverNotificationPending() {
            return SnapshotKt.access$getPendingApplyObserverCount$p().get() > 0;
        }

        public final boolean isInSnapshot() {
            return SnapshotKt.access$getThreadSnapshot$p().get() != null;
        }

        @PublishedApi
        @NotNull
        public final Snapshot makeCurrentNonObservable(@Nullable Snapshot snapshot0) {
            if(snapshot0 instanceof TransparentObserverMutableSnapshot && ((TransparentObserverMutableSnapshot)snapshot0).getThreadId$runtime_release() == 40348L) {
                ((TransparentObserverMutableSnapshot)snapshot0).setReadObserver(null);
                return snapshot0;
            }
            if(snapshot0 instanceof TransparentObserverSnapshot && ((TransparentObserverSnapshot)snapshot0).getThreadId$runtime_release() == 40348L) {
                ((TransparentObserverSnapshot)snapshot0).setReadObserver(null);
                return snapshot0;
            }
            snapshot0 = SnapshotKt.c(snapshot0, null, false);
            snapshot0.makeCurrent();
            return snapshot0;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final Object observe(@Nullable Function1 function10, @Nullable Function1 function11, @NotNull Function0 function00) {
            Object object1;
            Snapshot snapshot1;
            if(function10 == null && function11 == null) {
                return function00.invoke();
            }
            Snapshot snapshot0 = (Snapshot)SnapshotKt.access$getThreadSnapshot$p().get();
            if(snapshot0 instanceof TransparentObserverMutableSnapshot && ((TransparentObserverMutableSnapshot)snapshot0).getThreadId$runtime_release() == 40910L) {
                Function1 function12 = ((TransparentObserverMutableSnapshot)snapshot0).getReadObserver$runtime_release();
                Function1 function13 = ((TransparentObserverMutableSnapshot)snapshot0).getWriteObserver$runtime_release();
                try {
                    ((TransparentObserverMutableSnapshot)snapshot0).setReadObserver(SnapshotKt.d(function10, function12));
                    ((TransparentObserverMutableSnapshot)snapshot0).setWriteObserver(SnapshotKt.access$mergedWriteObserver(function11, function13));
                    return function00.invoke();
                }
                finally {
                    ((TransparentObserverMutableSnapshot)snapshot0).setReadObserver(function12);
                    ((TransparentObserverMutableSnapshot)snapshot0).setWriteObserver(function13);
                }
            }
            if(snapshot0 == null || snapshot0 instanceof MutableSnapshot) {
                snapshot1 = new TransparentObserverMutableSnapshot((snapshot0 instanceof MutableSnapshot ? ((MutableSnapshot)snapshot0) : null), function10, function11, true, false);
            }
            else {
                if(function10 == null) {
                    return function00.invoke();
                }
                snapshot1 = snapshot0.takeNestedSnapshot(function10);
            }
            try {
                Snapshot snapshot2 = snapshot1.makeCurrent();
                try {
                    object1 = function00.invoke();
                }
                catch(Throwable throwable0) {
                    snapshot1.restoreCurrent(snapshot2);
                    throw throwable0;
                }
                snapshot1.restoreCurrent(snapshot2);
                return object1;
            }
            finally {
                snapshot1.dispose();
            }
        }

        public static Object observe$default(Companion snapshot$Companion0, Function1 function10, Function1 function11, Function0 function00, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = null;
            }
            if((v & 2) != 0) {
                function11 = null;
            }
            return snapshot$Companion0.observe(function10, function11, function00);
        }

        @InternalComposeApi
        public final int openSnapshotCount() {
            return CollectionsKt___CollectionsKt.toList(SnapshotKt.access$getOpenSnapshots$p()).size();
        }

        @NotNull
        public final ObserverHandle registerApplyObserver(@NotNull Function2 function20) {
            SnapshotKt.access$advanceGlobalSnapshot(SnapshotKt.access$getEmptyLambda$p());
            synchronized(SnapshotKt.getLock()) {
                SnapshotKt.access$setApplyObservers$p(CollectionsKt___CollectionsKt.plus(SnapshotKt.access$getApplyObservers$p(), function20));
            }
            return new h(function20, 16);
        }

        @NotNull
        public final ObserverHandle registerGlobalWriteObserver(@NotNull Function1 function10) {
            synchronized(SnapshotKt.getLock()) {
                SnapshotKt.access$setGlobalWriteObservers$p(CollectionsKt___CollectionsKt.plus(SnapshotKt.access$getGlobalWriteObservers$p(), function10));
            }
            SnapshotKt.access$advanceGlobalSnapshot();
            return new b(function10, 0);
        }

        @PublishedApi
        @Nullable
        public final Snapshot removeCurrent() {
            Snapshot snapshot0 = (Snapshot)SnapshotKt.access$getThreadSnapshot$p().get();
            if(snapshot0 != null) {
                SnapshotKt.access$getThreadSnapshot$p().set(null);
            }
            return snapshot0;
        }

        @PublishedApi
        public final void restoreCurrent(@Nullable Snapshot snapshot0) {
            if(snapshot0 != null) {
                SnapshotKt.access$getThreadSnapshot$p().set(snapshot0);
            }
        }

        @PublishedApi
        public final void restoreNonObservable(@Nullable Snapshot snapshot0, @NotNull Snapshot snapshot1, @Nullable Function1 function10) {
            if(snapshot0 == snapshot1) {
                if(snapshot0 instanceof TransparentObserverMutableSnapshot) {
                    ((TransparentObserverMutableSnapshot)snapshot0).setReadObserver(function10);
                    return;
                }
                if(!(snapshot0 instanceof TransparentObserverSnapshot)) {
                    throw new IllegalStateException(("Non-transparent snapshot was reused: " + snapshot0).toString());
                }
                ((TransparentObserverSnapshot)snapshot0).setReadObserver(function10);
                return;
            }
            snapshot1.restoreCurrent(snapshot0);
            snapshot1.dispose();
        }

        public final void sendApplyNotifications() {
            synchronized(SnapshotKt.getLock()) {
                MutableScatterSet mutableScatterSet0 = ((GlobalSnapshot)SnapshotKt.j.get()).getModified$runtime_release();
                boolean z = mutableScatterSet0 != null && mutableScatterSet0.isNotEmpty();
            }
            if(z) {
                SnapshotKt.access$advanceGlobalSnapshot();
            }
        }

        @NotNull
        public final MutableSnapshot takeMutableSnapshot(@Nullable Function1 function10, @Nullable Function1 function11) {
            Snapshot snapshot0 = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot0 = snapshot0 instanceof MutableSnapshot ? ((MutableSnapshot)snapshot0) : null;
            if(mutableSnapshot0 != null) {
                MutableSnapshot mutableSnapshot1 = mutableSnapshot0.takeNestedMutableSnapshot(function10, function11);
                if(mutableSnapshot1 != null) {
                    return mutableSnapshot1;
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }

        public static MutableSnapshot takeMutableSnapshot$default(Companion snapshot$Companion0, Function1 function10, Function1 function11, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = null;
            }
            if((v & 2) != 0) {
                function11 = null;
            }
            return snapshot$Companion0.takeMutableSnapshot(function10, function11);
        }

        @NotNull
        public final Snapshot takeSnapshot(@Nullable Function1 function10) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(function10);
        }

        public static Snapshot takeSnapshot$default(Companion snapshot$Companion0, Function1 function10, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = null;
            }
            return snapshot$Companion0.takeSnapshot(function10);
        }

        public final Object withMutableSnapshot(@NotNull Function0 function00) {
            Object object0;
            MutableSnapshot mutableSnapshot0 = Companion.takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot snapshot0 = mutableSnapshot0.makeCurrent();
                try {
                    object0 = function00.invoke();
                }
                catch(Throwable throwable0) {
                    mutableSnapshot0.restoreCurrent(snapshot0);
                    throw throwable0;
                }
                mutableSnapshot0.restoreCurrent(snapshot0);
                mutableSnapshot0.apply().check();
                return object0;
            }
            finally {
                mutableSnapshot0.dispose();
            }
        }

        public final Object withoutReadObservation(@NotNull Function0 function00) {
            Snapshot snapshot0 = this.getCurrentThreadSnapshot();
            Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
            Snapshot snapshot1 = this.makeCurrentNonObservable(snapshot0);
            try {
                return function00.invoke();
            }
            finally {
                this.restoreNonObservable(snapshot0, snapshot1, function10);
            }
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int PreexistingSnapshotId = 1;
    public SnapshotIdSet a;
    public int b;
    public boolean c;
    public int d;

    static {
        Snapshot.Companion = new Companion(null);
        Snapshot.$stable = 8;
    }

    public Snapshot(int v, SnapshotIdSet snapshotIdSet0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = snapshotIdSet0;
        this.b = v;
        this.d = v == 0 ? -1 : SnapshotKt.trackPinning(v, this.getInvalid$runtime_release());
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized(SnapshotKt.getLock()) {
            this.closeLocked$runtime_release();
            this.releasePinnedSnapshotsForCloseLocked$runtime_release();
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().clear(this.getId()));
    }

    public void dispose() {
        this.c = true;
        synchronized(SnapshotKt.getLock()) {
            this.releasePinnedSnapshotLocked$runtime_release();
        }
    }

    public final Object enter(@NotNull Function0 function00) {
        Snapshot snapshot0 = this.makeCurrent();
        try {
            return function00.invoke();
        }
        finally {
            this.restoreCurrent(snapshot0);
        }
    }

    public final boolean getDisposed$runtime_release() {
        return this.c;
    }

    public int getId() {
        return this.b;
    }

    @NotNull
    public SnapshotIdSet getInvalid$runtime_release() {
        return this.a;
    }

    @Nullable
    public abstract MutableScatterSet getModified$runtime_release();

    @Nullable
    public abstract Function1 getReadObserver();

    @PublishedApi
    public static void getReadObserver$annotations() {
    }

    public abstract boolean getReadOnly();

    @NotNull
    public abstract Snapshot getRoot();

    public int getWriteCount$runtime_release() {
        return 0;
    }

    @Nullable
    public abstract Function1 getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime_release() {
        return this.d >= 0;
    }

    @PublishedApi
    @Nullable
    public Snapshot makeCurrent() {
        Snapshot snapshot0 = (Snapshot)SnapshotKt.access$getThreadSnapshot$p().get();
        SnapshotKt.access$getThreadSnapshot$p().set(this);
        return snapshot0;
    }

    public abstract void nestedActivated$runtime_release(@NotNull Snapshot arg1);

    public abstract void nestedDeactivated$runtime_release(@NotNull Snapshot arg1);

    public abstract void notifyObjectsInitialized$runtime_release();

    public abstract void recordModified$runtime_release(@NotNull StateObject arg1);

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int v = this.d;
        if(v >= 0) {
            SnapshotKt.releasePinningLocked(v);
            this.d = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        this.releasePinnedSnapshotLocked$runtime_release();
    }

    @PublishedApi
    public void restoreCurrent(@Nullable Snapshot snapshot0) {
        SnapshotKt.access$getThreadSnapshot$p().set(snapshot0);
    }

    public final void setDisposed$runtime_release(boolean z) {
        this.c = z;
    }

    public void setId$runtime_release(int v) {
        this.b = v;
    }

    public void setInvalid$runtime_release(@NotNull SnapshotIdSet snapshotIdSet0) {
        this.a = snapshotIdSet0;
    }

    public void setWriteCount$runtime_release(int v) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    @NotNull
    public abstract Snapshot takeNestedSnapshot(@Nullable Function1 arg1);

    public static Snapshot takeNestedSnapshot$default(Snapshot snapshot0, Function1 function10, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if((v & 1) != 0) {
            function10 = null;
        }
        return snapshot0.takeNestedSnapshot(function10);
    }

    public final int takeoverPinnedSnapshot$runtime_release() {
        int v = this.d;
        this.d = -1;
        return v;
    }

    @ExperimentalComposeApi
    @Nullable
    public final Snapshot unsafeEnter() {
        return this.makeCurrent();
    }

    @ExperimentalComposeApi
    public final void unsafeLeave(@Nullable Snapshot snapshot0) {
        if(SnapshotKt.access$getThreadSnapshot$p().get() != this) {
            PreconditionsKt.throwIllegalStateException(("Cannot leave snapshot; " + this + " is not the current snapshot"));
        }
        this.restoreCurrent(snapshot0);
    }

    public final void validateNotDisposed$runtime_release() {
        if(this.c) {
            PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
    }
}

