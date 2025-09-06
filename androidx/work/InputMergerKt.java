package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "className", "Landroidx/work/InputMerger;", "fromClassName", "(Ljava/lang/String;)Landroidx/work/InputMerger;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InputMergerKt {
    public static final String a;

    // 去混淆评级： 低(20)
    static {
        Intrinsics.checkNotNullExpressionValue("WM-InputMerger", "tagWithPrefix(\"InputMerger\")");
        InputMergerKt.a = "WM-InputMerger";
    }

    @Nullable
    public static final InputMerger fromClassName(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "className");
        try {
            Object object0 = Class.forName(s).getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (InputMerger)object0;
        }
        catch(Exception exception0) {
            Logger.get().error("WM-InputMerger", "Trouble instantiating " + s, exception0);
            return null;
        }
    }
}

