package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0003H\u0016J\u0014\u0010\u0006\u001A\u00020\u0003*\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"androidx/compose/foundation/text/input/internal/undo/TextUndoOperation$Companion$Saver$1", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "", "restore", "value", "save", "Landroidx/compose/runtime/saveable/SaverScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextUndoOperation.Companion.Saver.1 implements Saver {
    @NotNull
    public TextUndoOperation restore(@NotNull Object object0) {
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<*>");
        Object object1 = ((List)object0).get(0);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Int");
        Object object2 = ((List)object0).get(1);
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.String");
        Object object3 = ((List)object0).get(2);
        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.String");
        Object object4 = ((List)object0).get(3);
        Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.Int");
        Object object5 = ((List)object0).get(4);
        Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type kotlin.Int");
        long v = TextRangeKt.TextRange(((int)(((Integer)object4))), ((int)(((Integer)object5))));
        Object object6 = ((List)object0).get(5);
        Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type kotlin.Int");
        Object object7 = ((List)object0).get(6);
        Intrinsics.checkNotNull(object7, "null cannot be cast to non-null type kotlin.Int");
        long v1 = TextRangeKt.TextRange(((int)(((Integer)object6))), ((int)(((Integer)object7))));
        Object object8 = ((List)object0).get(7);
        Intrinsics.checkNotNull(object8, "null cannot be cast to non-null type kotlin.Long");
        return new TextUndoOperation(((int)(((Integer)object1))), ((String)object2), ((String)object3), v, v1, ((long)(((Long)object8))), false, 0x40, null);
    }

    @Override  // androidx.compose.runtime.saveable.Saver
    public Object restore(Object object0) {
        return this.restore(object0);
    }

    @NotNull
    public Object save(@NotNull SaverScope saverScope0, @NotNull TextUndoOperation textUndoOperation0) {
        return CollectionsKt__CollectionsKt.listOf(new Object[]{textUndoOperation0.getIndex(), textUndoOperation0.getPreText(), textUndoOperation0.getPostText(), TextRange.getStart-impl(textUndoOperation0.getPreSelection-d9O1mEE()), TextRange.getEnd-impl(textUndoOperation0.getPreSelection-d9O1mEE()), TextRange.getStart-impl(textUndoOperation0.getPostSelection-d9O1mEE()), TextRange.getEnd-impl(textUndoOperation0.getPostSelection-d9O1mEE()), textUndoOperation0.getTimeInMillis()});
    }

    @Override  // androidx.compose.runtime.saveable.Saver
    public Object save(SaverScope saverScope0, Object object0) {
        return this.save(saverScope0, ((TextUndoOperation)object0));
    }
}

