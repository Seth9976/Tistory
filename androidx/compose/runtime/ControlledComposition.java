package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001A\u00020\bH&J\b\u0010\t\u001A\u00020\bH&J\b\u0010\n\u001A\u00020\bH&J\b\u0010\u000B\u001A\u00020\bH&J \u0010\f\u001A\u00020\b2\u0011\u0010\r\u001A\r\u0012\u0004\u0012\u00020\b0\u000E¢\u0006\u0002\b\u000FH&¢\u0006\u0002\u0010\u0010J3\u0010\u0011\u001A\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0014\u001A\u00020\u00152\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\u00120\u000EH&¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\b2\u0006\u0010\u0019\u001A\u00020\u001AH\'J$\u0010\u001B\u001A\u00020\b2\u001A\u0010\u001C\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001F\u0012\u0006\u0012\u0004\u0018\u00010\u001F0\u001E0\u001DH\'J\b\u0010 \u001A\u00020\bH&J\u0016\u0010!\u001A\u00020\u00032\f\u0010\"\u001A\b\u0012\u0004\u0012\u00020$0#H&J\u0016\u0010%\u001A\u00020\b2\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\b0\u000EH&J\b\u0010&\u001A\u00020\u0003H&J\u0016\u0010\'\u001A\u00020\b2\f\u0010\"\u001A\b\u0012\u0004\u0012\u00020$0#H&J\u0010\u0010(\u001A\u00020\b2\u0006\u0010)\u001A\u00020$H&J\u0010\u0010*\u001A\u00020\b2\u0006\u0010)\u001A\u00020$H&J\b\u0010+\u001A\u00020\bH\'R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0005\u0082\u0001\u0001,ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Composition;", "hasPendingChanges", "", "getHasPendingChanges", "()Z", "isComposing", "abandonChanges", "", "applyChanges", "applyLateChanges", "changesApplied", "composeContent", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;)V", "delegateInvalidations", "R", "to", "groupIndex", "", "block", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "disposeUnusedMovableContent", "state", "Landroidx/compose/runtime/MovableContentState;", "insertMovableContent", "references", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "invalidateAll", "observesAnyOf", "values", "", "", "prepareCompose", "recompose", "recordModificationsOf", "recordReadOf", "value", "recordWriteOf", "verifyConsistent", "Landroidx/compose/runtime/CompositionImpl;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ControlledComposition extends Composition {
    void abandonChanges();

    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(@NotNull Function2 arg1);

    Object delegateInvalidations(@Nullable ControlledComposition arg1, int arg2, @NotNull Function0 arg3);

    @InternalComposeApi
    void disposeUnusedMovableContent(@NotNull MovableContentState arg1);

    boolean getHasPendingChanges();

    @InternalComposeApi
    void insertMovableContent(@NotNull List arg1);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(@NotNull Set arg1);

    void prepareCompose(@NotNull Function0 arg1);

    boolean recompose();

    void recordModificationsOf(@NotNull Set arg1);

    void recordReadOf(@NotNull Object arg1);

    void recordWriteOf(@NotNull Object arg1);

    @InternalComposeApi
    void verifyConsistent();
}

