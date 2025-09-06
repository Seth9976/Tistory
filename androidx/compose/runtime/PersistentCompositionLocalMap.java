package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u001E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u00052\u00020\u0006:\u0001\u0010J\b\u0010\u000B\u001A\u00020\fH&J(\u0010\r\u001A\u00020\u00002\u000E\u0010\u000E\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000E\u0010\u000F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H&R$\u0010\u0007\u001A\u0002H\b\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/CompositionLocalMap;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "currentValue", "T", "getCurrentValue", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "builder", "Landroidx/compose/runtime/PersistentCompositionLocalMap$Builder;", "putValue", "key", "value", "Builder", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PersistentCompositionLocalMap extends CompositionLocalAccessorScope, CompositionLocalMap, PersistentMap {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u001E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001J\b\u0010\u0005\u001A\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/PersistentCompositionLocalMap$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "build", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Builder extends androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder {
        @NotNull
        PersistentCompositionLocalMap build();
    }

    @NotNull
    Builder builder();

    @Override  // androidx.compose.runtime.CompositionLocalAccessorScope
    default Object getCurrentValue(@NotNull CompositionLocal compositionLocal0) {
        return CompositionLocalMapKt.read(this, compositionLocal0);
    }

    @NotNull
    PersistentCompositionLocalMap putValue(@NotNull CompositionLocal arg1, @NotNull ValueHolder arg2);
}

