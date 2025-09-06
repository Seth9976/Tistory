package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalComposeApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001B_\b\u0000\u0012\u000E\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u001A\u0010\u000E\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000B\u0012\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001A\u0010\u0006\u001A\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u001A\u0010\b\u001A\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u001A\u0010\n\u001A\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R6\u0010\u000E\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000B8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001A\u0010\u0010\u001A\u00020\u000F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100¨\u00061"}, d2 = {"Landroidx/compose/runtime/MovableContentStateReference;", "", "Landroidx/compose/runtime/MovableContent;", "content", "parameter", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/Anchor;", "anchor", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidations", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "locals", "<init>", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;Ljava/util/List;Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "a", "Landroidx/compose/runtime/MovableContent;", "getContent$runtime_release", "()Landroidx/compose/runtime/MovableContent;", "b", "Ljava/lang/Object;", "getParameter$runtime_release", "()Ljava/lang/Object;", "c", "Landroidx/compose/runtime/ControlledComposition;", "getComposition$runtime_release", "()Landroidx/compose/runtime/ControlledComposition;", "d", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "e", "Landroidx/compose/runtime/Anchor;", "getAnchor$runtime_release", "()Landroidx/compose/runtime/Anchor;", "f", "Ljava/util/List;", "getInvalidations$runtime_release", "()Ljava/util/List;", "setInvalidations$runtime_release", "(Ljava/util/List;)V", "g", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getLocals$runtime_release", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MovableContentStateReference {
    public static final int $stable = 8;
    public final MovableContent a;
    public final Object b;
    public final ControlledComposition c;
    public final SlotTable d;
    public final Anchor e;
    public List f;
    public final PersistentCompositionLocalMap g;

    public MovableContentStateReference(@NotNull MovableContent movableContent0, @Nullable Object object0, @NotNull ControlledComposition controlledComposition0, @NotNull SlotTable slotTable0, @NotNull Anchor anchor0, @NotNull List list0, @NotNull PersistentCompositionLocalMap persistentCompositionLocalMap0) {
        this.a = movableContent0;
        this.b = object0;
        this.c = controlledComposition0;
        this.d = slotTable0;
        this.e = anchor0;
        this.f = list0;
        this.g = persistentCompositionLocalMap0;
    }

    @NotNull
    public final Anchor getAnchor$runtime_release() {
        return this.e;
    }

    @NotNull
    public final ControlledComposition getComposition$runtime_release() {
        return this.c;
    }

    @NotNull
    public final MovableContent getContent$runtime_release() {
        return this.a;
    }

    @NotNull
    public final List getInvalidations$runtime_release() {
        return this.f;
    }

    @NotNull
    public final PersistentCompositionLocalMap getLocals$runtime_release() {
        return this.g;
    }

    @Nullable
    public final Object getParameter$runtime_release() {
        return this.b;
    }

    @NotNull
    public final SlotTable getSlotTable$runtime_release() {
        return this.d;
    }

    public final void setInvalidations$runtime_release(@NotNull List list0) {
        this.f = list0;
    }
}

