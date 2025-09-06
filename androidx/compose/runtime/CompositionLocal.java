package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J3\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u000E\u0010\u0006\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H ¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001A\u00028\u00008Ç\u0002¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u000F\u0010\u0010\u0082\u0001\u0001\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/CompositionLocal;", "T", "", "Landroidx/compose/runtime/ProvidedValue;", "value", "Landroidx/compose/runtime/ValueHolder;", "previous", "updatedStateOf$runtime_release", "(Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/ValueHolder;)Landroidx/compose/runtime/ValueHolder;", "updatedStateOf", "a", "Landroidx/compose/runtime/ValueHolder;", "getDefaultValueHolder$runtime_release", "()Landroidx/compose/runtime/ValueHolder;", "defaultValueHolder", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "getCurrent$annotations", "()V", "current", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class CompositionLocal {
    public static final int $stable;
    public final LazyValueHolder a;

    public CompositionLocal(Function0 function00, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = new LazyValueHolder(function00);
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getCurrent")
    public final Object getCurrent(@Nullable Composer composer0, int v) {
        return composer0.consume(this);
    }

    public static void getCurrent$annotations() {
    }

    @NotNull
    public ValueHolder getDefaultValueHolder$runtime_release() {
        return this.a;
    }

    @NotNull
    public abstract ValueHolder updatedStateOf$runtime_release(@NotNull ProvidedValue arg1, @Nullable ValueHolder arg2);
}

