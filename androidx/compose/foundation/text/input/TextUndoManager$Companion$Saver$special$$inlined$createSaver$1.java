package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001A\u00020\u0003H\u0016J\u001A\u0010\u0006\u001A\u00020\u0003*\u00020\u00072\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"androidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "", "restore", "value", "save", "Landroidx/compose/runtime/saveable/SaverScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,174:1\n33#2,6:175\n33#2,6:181\n*S KotlinDebug\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n*L\n140#1:175,6\n145#1:181,6\n*E\n"})
public final class TextUndoManager.Companion.Saver.special..inlined.createSaver.1 implements Saver {
    public final Saver a;

    public TextUndoManager.Companion.Saver.special..inlined.createSaver.1(Saver saver0) {
        this.a = saver0;
        super();
    }

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
}

