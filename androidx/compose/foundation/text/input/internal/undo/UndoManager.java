package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\n\b\u0000\u0018\u0000 \u001C*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001CB1\u0012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00028\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000FJ\r\u0010\u0011\u001A\u00020\u000B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001A\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001A\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0015R\u0011\u0010\u001B\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "T", "", "", "initialUndoStack", "initialRedoStack", "", "capacity", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "undoableAction", "", "record", "(Ljava/lang/Object;)V", "undo", "()Ljava/lang/Object;", "redo", "clearHistory", "()V", "", "getCanUndo$foundation_release", "()Z", "canUndo", "getCanRedo$foundation_release", "canRedo", "getSize", "()I", "size", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class UndoManager {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J>\u0010\u0006\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00020\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u00012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion;", "", "T", "Landroidx/compose/runtime/saveable/Saver;", "itemSaver", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "createSaver", "(Landroidx/compose/runtime/saveable/Saver;)Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Saver createSaver(Saver saver0) {
            Intrinsics.needClassReification();
            return new Saver() {
                @NotNull
                public UndoManager restore(@NotNull Object object0) {
                    Saver saver0;
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    int v = ((Number)((List)object0).get(0)).intValue();
                    int v1 = ((Number)((List)object0).get(1)).intValue();
                    int v2 = ((Number)((List)object0).get(2)).intValue();
                    List list0 = k.createListBuilder();
                    int v3;
                    for(v3 = 3; true; ++v3) {
                        saver0 = this.a;
                        if(v3 >= v1 + 3) {
                            break;
                        }
                        Object object1 = saver0.restore(((List)object0).get(v3));
                        Intrinsics.checkNotNull(object1);
                        list0.add(object1);
                    }
                    List list1 = k.build(list0);
                    List list2 = k.createListBuilder();
                    while(v3 < v1 + v2 + 3) {
                        Object object2 = saver0.restore(((List)object0).get(v3));
                        Intrinsics.checkNotNull(object2);
                        list2.add(object2);
                        ++v3;
                    }
                    return new UndoManager(list1, k.build(list2), v);
                }

                @Override  // androidx.compose.runtime.saveable.Saver
                public Object restore(Object object0) {
                    return this.restore(object0);
                }

                @NotNull
                public Object save(@NotNull SaverScope saverScope0, @NotNull UndoManager undoManager0) {
                    Saver saver0;
                    List list0 = k.createListBuilder();
                    list0.add(undoManager0.a);
                    list0.add(undoManager0.b.size());
                    list0.add(undoManager0.c.size());
                    SnapshotStateList snapshotStateList0 = undoManager0.b;
                    int v = snapshotStateList0.size();
                    for(int v2 = 0; true; ++v2) {
                        saver0 = this.a;
                        if(v2 >= v) {
                            break;
                        }
                        list0.add(saver0.save(saverScope0, snapshotStateList0.get(v2)));
                    }
                    SnapshotStateList snapshotStateList1 = undoManager0.c;
                    int v3 = snapshotStateList1.size();
                    for(int v1 = 0; v1 < v3; ++v1) {
                        list0.add(saver0.save(saverScope0, snapshotStateList1.get(v1)));
                    }
                    return k.build(list0);
                }

                @Override  // androidx.compose.runtime.saveable.Saver
                public Object save(SaverScope saverScope0, Object object0) {
                    return this.save(saverScope0, ((UndoManager)object0));
                }
            };
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public final SnapshotStateList b;
    public final SnapshotStateList c;

    static {
        UndoManager.Companion = new Companion(null);
        UndoManager.$stable = 8;
    }

    public UndoManager() {
        this(null, null, 0, 7, null);
    }

    public UndoManager(@NotNull List list0, @NotNull List list1, int v) {
        this.a = v;
        SnapshotStateList snapshotStateList0 = new SnapshotStateList();
        snapshotStateList0.addAll(list0);
        this.b = snapshotStateList0;
        SnapshotStateList snapshotStateList1 = new SnapshotStateList();
        snapshotStateList1.addAll(list1);
        this.c = snapshotStateList1;
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer");
        }
        if(this.getSize() > v) {
            throw new IllegalArgumentException(("Initial list of undo and redo operations have a size=(" + this.getSize() + ") greater than the given capacity=(" + v + ").").toString());
        }
    }

    public UndoManager(List list0, List list1, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v1 & 2) != 0) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v1 & 4) != 0) {
            v = 100;
        }
        this(list0, list1, v);
    }

    public final void clearHistory() {
        this.b.clear();
        this.c.clear();
    }

    public final boolean getCanRedo$foundation_release() {
        return !this.c.isEmpty();
    }

    public final boolean getCanUndo$foundation_release() {
        return !this.b.isEmpty();
    }

    public final int getSize() {
        return this.c.size() + this.b.size();
    }

    public final void record(Object object0) {
        SnapshotStateList snapshotStateList0;
        this.c.clear();
        while(true) {
            snapshotStateList0 = this.b;
            if(this.getSize() <= this.a - 1) {
                break;
            }
            o.removeFirst(snapshotStateList0);
        }
        snapshotStateList0.add(object0);
    }

    public final Object redo() {
        if(!this.getCanRedo$foundation_release()) {
            throw new IllegalStateException("It\'s an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        Object object0 = o.removeLast(this.c);
        this.b.add(object0);
        return object0;
    }

    public final Object undo() {
        if(!this.getCanUndo$foundation_release()) {
            throw new IllegalStateException("It\'s an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        Object object0 = o.removeLast(this.b);
        this.c.add(object0);
        return object0;
    }
}

