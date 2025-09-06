package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0018\u0010\u0005\u001A\u00028\u00012\u0006\u0010\u0004\u001A\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\u0005\u001A\u00028\u0003\"\u0004\b\u0002\u0010\u0007\"\u0004\b\u0003\u0010\b*\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t2\u0006\u0010\u0004\u001A\u00028\u0002H¦@¢\u0006\u0004\b\u0005\u0010\nJ&\u0010\f\u001A\u00020\u000B*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003H\u0087\u0002¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0001\u000E¨\u0006\u000F"}, d2 = {"Lkotlin/DeepRecursiveScope;", "T", "R", "", "value", "callRecursive", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "U", "S", "Lkotlin/DeepRecursiveFunction;", "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "invoke", "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;)Ljava/lang/Void;", "Lmd/a;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.7")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
@RestrictsSuspension
public abstract class DeepRecursiveScope {
    public DeepRecursiveScope(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Nullable
    public abstract Object callRecursive(Object arg1, @NotNull Continuation arg2);

    @Nullable
    public abstract Object callRecursive(@NotNull DeepRecursiveFunction arg1, Object arg2, @NotNull Continuation arg3);

    @Deprecated(level = DeprecationLevel.ERROR, message = "\'invoke\' should not be called from DeepRecursiveScope. Use \'callRecursive\' to do recursion in the heap instead of the call stack.", replaceWith = @ReplaceWith(expression = "this.callRecursive(value)", imports = {}))
    @NotNull
    public final Void invoke(@NotNull DeepRecursiveFunction deepRecursiveFunction0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(deepRecursiveFunction0, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }
}

