package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperationKt;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000F\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001A\u00020\u00138F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001A\u00020\u00138F¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0015¨\u0006\u001A"}, d2 = {"Landroidx/compose/foundation/text/input/TextUndoManager;", "", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "initialStagingUndo", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "undoManager", "<init>", "(Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text/input/internal/undo/UndoManager;)V", "Landroidx/compose/foundation/text/input/TextFieldState;", "state", "", "undo", "(Landroidx/compose/foundation/text/input/TextFieldState;)V", "redo", "op", "record", "(Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;)V", "clearHistory", "()V", "", "getCanUndo", "()Z", "canUndo", "getCanRedo", "canRedo", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n81#2:267\n107#2,2:268\n602#3,8:270\n602#3,8:278\n1#4:286\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager\n*L\n46#1:267\n46#1:268,2\n72#1:270,8\n97#1:278,8\n*E\n"})
public final class TextUndoManager {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/TextUndoManager$Companion;", "", "Saver", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001B\u0010\u0006\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/TextUndoManager;", "", "Landroidx/compose/runtime/saveable/SaverScope;", "value", "save", "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/text/input/TextUndoManager;)Ljava/lang/Object;", "restore", "(Ljava/lang/Object;)Landroidx/compose/foundation/text/input/TextUndoManager;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver\n+ 2 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion\n*L\n1#1,266:1\n125#2:267\n171#2:268\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver\n*L\n104#1:267\n104#1:268\n*E\n"})
        public static final class Saver implements androidx.compose.runtime.saveable.Saver {
            public static final int $stable;
            @NotNull
            public static final Saver INSTANCE;
            public static final TextUndoManager.Companion.Saver.special..inlined.createSaver.1 a;

            static {
                Saver.INSTANCE = new Saver();  // 初始化器: Ljava/lang/Object;-><init>()V
                Saver.a = new TextUndoManager.Companion.Saver.special..inlined.createSaver.1(TextUndoOperation.Companion.getSaver());
                Saver.$stable = 8;
            }

            @Nullable
            public TextUndoManager restore(@NotNull Object object0) {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<*>");
                Object object1 = ((List)object0).get(0);
                Object object2 = ((List)object0).get(1);
                TextUndoOperation textUndoOperation0 = object1 == null ? null : ((TextUndoOperation)TextUndoOperation.Companion.getSaver().restore(object1));
                Intrinsics.checkNotNull(object2);
                UndoManager undoManager0 = (UndoManager)Saver.a.restore(object2);
                Intrinsics.checkNotNull(undoManager0);
                return new TextUndoManager(textUndoOperation0, undoManager0);
            }

            @Override  // androidx.compose.runtime.saveable.Saver
            public Object restore(Object object0) {
                return this.restore(object0);
            }

            @NotNull
            public Object save(@NotNull SaverScope saverScope0, @NotNull TextUndoManager textUndoManager0) {
                TextUndoOperation textUndoOperation0 = TextUndoManager.access$getStagingUndo(textUndoManager0);
                return CollectionsKt__CollectionsKt.listOf(new Object[]{(textUndoOperation0 == null ? null : TextUndoOperation.Companion.getSaver().save(saverScope0, textUndoOperation0)), Saver.a.save(saverScope0, textUndoManager0.a)});
            }

            @Override  // androidx.compose.runtime.saveable.Saver
            public Object save(SaverScope saverScope0, Object object0) {
                return this.save(saverScope0, ((TextUndoManager)object0));
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final UndoManager a;
    public final MutableState b;

    static {
        TextUndoManager.Companion = new Companion(null);
        TextUndoManager.$stable = 8;
    }

    public TextUndoManager() {
        this(null, null, 3, null);
    }

    public TextUndoManager(@Nullable TextUndoOperation textUndoOperation0, @NotNull UndoManager undoManager0) {
        this.a = undoManager0;
        this.b = SnapshotStateKt.mutableStateOf$default(textUndoOperation0, null, 2, null);
    }

    public TextUndoManager(TextUndoOperation textUndoOperation0, UndoManager undoManager0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            textUndoOperation0 = null;
        }
        if((v & 2) != 0) {
            undoManager0 = new UndoManager(null, null, 100, 3, null);
        }
        this(textUndoOperation0, undoManager0);
    }

    public final void a() {
        TextUndoOperation textUndoOperation0;
        MutableState mutableState0 = this.b;
        Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
        Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
        Snapshot snapshot1 = Snapshot.Companion.makeCurrentNonObservable(snapshot0);
        try {
            textUndoOperation0 = (TextUndoOperation)mutableState0.getValue();
        }
        finally {
            Snapshot.Companion.restoreNonObservable(snapshot0, snapshot1, function10);
        }
        if(textUndoOperation0 != null) {
            this.a.record(textUndoOperation0);
        }
        mutableState0.setValue(null);
    }

    public static final TextUndoOperation access$getStagingUndo(TextUndoManager textUndoManager0) {
        return (TextUndoOperation)textUndoManager0.b.getValue();
    }

    public final void clearHistory() {
        this.b.setValue(null);
        this.a.clearHistory();
    }

    public final boolean getCanRedo() {
        return this.a.getCanRedo$foundation_release() && ((TextUndoOperation)this.b.getValue()) == null;
    }

    public final boolean getCanUndo() {
        return this.a.getCanUndo$foundation_release() || ((TextUndoOperation)this.b.getValue()) != null;
    }

    public final void record(@NotNull TextUndoOperation textUndoOperation0) {
        TextUndoOperation textUndoOperation1;
        MutableState mutableState0 = this.b;
        Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
        Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
        Snapshot snapshot1 = Snapshot.Companion.makeCurrentNonObservable(snapshot0);
        try {
            textUndoOperation1 = (TextUndoOperation)mutableState0.getValue();
        }
        finally {
            Snapshot.Companion.restoreNonObservable(snapshot0, snapshot1, function10);
        }
        if(textUndoOperation1 == null) {
            mutableState0.setValue(textUndoOperation0);
            return;
        }
        TextUndoOperation textUndoOperation2 = TextUndoManagerKt.merge(textUndoOperation1, textUndoOperation0);
        if(textUndoOperation2 != null) {
            mutableState0.setValue(textUndoOperation2);
            return;
        }
        this.a();
        mutableState0.setValue(textUndoOperation0);
    }

    public final void redo(@NotNull TextFieldState textFieldState0) {
        if(!this.getCanRedo()) {
            return;
        }
        TextUndoOperationKt.redo(textFieldState0, ((TextUndoOperation)this.a.redo()));
    }

    public final void undo(@NotNull TextFieldState textFieldState0) {
        if(!this.getCanUndo()) {
            return;
        }
        this.a();
        TextUndoOperationKt.undo(textFieldState0, ((TextUndoOperation)this.a.undo()));
    }
}

