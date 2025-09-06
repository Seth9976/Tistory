package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001A)\u0010\u0004\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001A!\u0010\n\u001A\u00020\u00012\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000B\u001A!\u0010\r\u001A\u00020\f2\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\r\u0010\u000E\u001A#\u0010\u0010\u001A\u00020\u000F2\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001A\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001A+\u0010\n\u001A\u00020\u00012\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u0012H\u0007¢\u0006\u0004\b\n\u0010\u0014\u001A+\u0010\u0010\u001A\u00020\u000F2\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u0012H\u0007¢\u0006\u0004\b\u0010\u0010\u0015\" \u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00160\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u001E\u0010\u0013\u001A\u00020\u0012*\u00020\u000F8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001E\u0010\u001F\u001A\u0004\b\u001C\u0010\u001D¨\u0006 "}, d2 = {"T", "Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/CompositionServiceKey;", "key", "getCompositionService", "(Landroidx/compose/runtime/Composition;Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parent", "Composition", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/ReusableComposition;", "ReusableComposition", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/ControlledComposition;", "ControlledComposition", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/ControlledComposition;", "Lkotlin/coroutines/CoroutineContext;", "recomposeCoroutineContext", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/Composition;", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/CompositionImpl;", "b", "Landroidx/compose/runtime/CompositionServiceKey;", "getCompositionImplServiceKey", "()Landroidx/compose/runtime/CompositionServiceKey;", "CompositionImplServiceKey", "getRecomposeCoroutineContext", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/coroutines/CoroutineContext;", "getRecomposeCoroutineContext$annotations", "(Landroidx/compose/runtime/ControlledComposition;)V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CompositionKt {
    public static final Object a;
    public static final CompositionKt.CompositionImplServiceKey.1 b;

    static {
        CompositionKt.a = new Object();
        CompositionKt.b = new CompositionKt.CompositionImplServiceKey.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public static final Composition Composition(@NotNull Applier applier0, @NotNull CompositionContext compositionContext0) {
        return new CompositionImpl(compositionContext0, applier0, null, 4, null);
    }

    @ExperimentalComposeApi
    @NotNull
    public static final Composition Composition(@NotNull Applier applier0, @NotNull CompositionContext compositionContext0, @NotNull CoroutineContext coroutineContext0) {
        return new CompositionImpl(compositionContext0, applier0, coroutineContext0);
    }

    @NotNull
    @TestOnly
    public static final ControlledComposition ControlledComposition(@NotNull Applier applier0, @NotNull CompositionContext compositionContext0) {
        return new CompositionImpl(compositionContext0, applier0, null, 4, null);
    }

    @ExperimentalComposeApi
    @NotNull
    @TestOnly
    public static final ControlledComposition ControlledComposition(@NotNull Applier applier0, @NotNull CompositionContext compositionContext0, @NotNull CoroutineContext coroutineContext0) {
        return new CompositionImpl(compositionContext0, applier0, coroutineContext0);
    }

    @NotNull
    public static final ReusableComposition ReusableComposition(@NotNull Applier applier0, @NotNull CompositionContext compositionContext0) {
        return new CompositionImpl(compositionContext0, applier0, null, 4, null);
    }

    public static final void access$swap(MutableIntList mutableIntList0, int v, int v1) {
        int v2 = mutableIntList0.get(v);
        mutableIntList0.set(v, mutableIntList0.get(v1));
        mutableIntList0.set(v1, v2);
    }

    public static final void access$swap(List list0, int v, int v1) {
        Object object0 = list0.get(v);
        list0.set(v, list0.get(v1));
        list0.set(v1, object0);
    }

    @NotNull
    public static final CompositionServiceKey getCompositionImplServiceKey() {
        return CompositionKt.b;
    }

    @Nullable
    public static final Object getCompositionService(@NotNull Composition composition0, @NotNull CompositionServiceKey compositionServiceKey0) {
        CompositionServices compositionServices0 = composition0 instanceof CompositionServices ? ((CompositionServices)composition0) : null;
        return compositionServices0 == null ? null : compositionServices0.getCompositionService(compositionServiceKey0);
    }

    @ExperimentalComposeApi
    @NotNull
    public static final CoroutineContext getRecomposeCoroutineContext(@NotNull ControlledComposition controlledComposition0) {
        CompositionImpl compositionImpl0 = controlledComposition0 instanceof CompositionImpl ? ((CompositionImpl)controlledComposition0) : null;
        if(compositionImpl0 != null) {
            CoroutineContext coroutineContext0 = compositionImpl0.getRecomposeContext();
            if(coroutineContext0 != null) {
                return coroutineContext0;
            }
        }
        return EmptyCoroutineContext.INSTANCE;
    }

    @ExperimentalComposeApi
    public static void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition0) {
    }
}

