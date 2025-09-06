package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import b2.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B0\u0012\'\u0010\b\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0011J/\u0010\u0016\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0011J%\u0010\u0019\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u000B2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010 \u001A\u00020\u0004\"\b\b\u0000\u0010\u001B*\u00020\u001A2\u0006\u0010\u001C\u001A\u00028\u00002\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010#\u001A\u00020\u0004H\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u0001H\u0000¢\u0006\u0004\b$\u0010%J\u000F\u0010(\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\'\u0010\"J\u000F\u0010*\u001A\u00020\u0004H\u0000¢\u0006\u0004\b)\u0010\"¨\u0006+"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", "block", "observeLayoutSnapshotReads$ui_release", "(Landroidx/compose/ui/node/LayoutNode;ZLkotlin/jvm/functions/Function0;)V", "observeLayoutSnapshotReads", "observeLayoutModifierSnapshotReads$ui_release", "observeLayoutModifierSnapshotReads", "observeMeasureSnapshotReads$ui_release", "observeMeasureSnapshotReads", "observeSemanticsReads$ui_release", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function0;)V", "observeSemanticsReads", "Landroidx/compose/ui/node/OwnerScope;", "T", "target", "onChanged", "observeReads$ui_release", "(Landroidx/compose/ui/node/OwnerScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "observeReads", "clearInvalidObservations$ui_release", "()V", "clearInvalidObservations", "clear$ui_release", "(Ljava/lang/Object;)V", "clear", "startObserving$ui_release", "startObserving", "stopObserving$ui_release", "stopObserving", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class OwnerSnapshotObserver {
    public static final int $stable;
    public final SnapshotStateObserver a;
    public final d b;
    public final d c;
    public final d d;
    public final d e;
    public final d f;
    public final d g;
    public final d h;

    static {
        OwnerSnapshotObserver.$stable = SnapshotStateObserver.$stable;
    }

    public OwnerSnapshotObserver(@NotNull Function1 function10) {
        this.a = new SnapshotStateObserver(function10);
        this.b = d.H;
        this.c = d.I;
        this.d = d.J;
        this.e = d.D;
        this.f = d.E;
        this.g = d.F;
        this.h = d.G;
    }

    public final void clear$ui_release(@NotNull Object object0) {
        this.a.clear(object0);
    }

    public final void clearInvalidObservations$ui_release() {
        this.a.clearIf(d.C);
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(@NotNull LayoutNode layoutNode0, boolean z, @NotNull Function0 function00) {
        if(z && layoutNode0.getLookaheadRoot$ui_release() != null) {
            this.observeReads$ui_release(layoutNode0, this.g, function00);
            return;
        }
        this.observeReads$ui_release(layoutNode0, this.f, function00);
    }

    public static void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver0, LayoutNode layoutNode0, boolean z, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver0.observeLayoutModifierSnapshotReads$ui_release(layoutNode0, z, function00);
    }

    public final void observeLayoutSnapshotReads$ui_release(@NotNull LayoutNode layoutNode0, boolean z, @NotNull Function0 function00) {
        if(z && layoutNode0.getLookaheadRoot$ui_release() != null) {
            this.observeReads$ui_release(layoutNode0, this.h, function00);
            return;
        }
        this.observeReads$ui_release(layoutNode0, this.e, function00);
    }

    public static void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver0, LayoutNode layoutNode0, boolean z, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver0.observeLayoutSnapshotReads$ui_release(layoutNode0, z, function00);
    }

    public final void observeMeasureSnapshotReads$ui_release(@NotNull LayoutNode layoutNode0, boolean z, @NotNull Function0 function00) {
        if(z && layoutNode0.getLookaheadRoot$ui_release() != null) {
            this.observeReads$ui_release(layoutNode0, this.b, function00);
            return;
        }
        this.observeReads$ui_release(layoutNode0, this.c, function00);
    }

    public static void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver0, LayoutNode layoutNode0, boolean z, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver0.observeMeasureSnapshotReads$ui_release(layoutNode0, z, function00);
    }

    public final void observeReads$ui_release(@NotNull OwnerScope ownerScope0, @NotNull Function1 function10, @NotNull Function0 function00) {
        this.a.observeReads(ownerScope0, function10, function00);
    }

    public final void observeSemanticsReads$ui_release(@NotNull LayoutNode layoutNode0, @NotNull Function0 function00) {
        this.observeReads$ui_release(layoutNode0, this.d, function00);
    }

    public final void startObserving$ui_release() {
        this.a.start();
    }

    public final void stopObserving$ui_release() {
        this.a.stop();
        this.a.clear();
    }
}

