package androidx.compose.runtime.saveable;

import h1.d;
import h1.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A~\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012.\u0010\t\u001A*\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003¢\u0006\u0002\b\b2#\u0010\u000B\u001A\u001F\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\r\u0010\u000E\u001A\u001F\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\f\"\u0004\b\u0000\u0010\u000F¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/ExtensionFunctionType;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/Saver;", "Saver", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "T", "autoSaver", "()Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SaverKt {
    public static final Saver a;

    static {
        SaverKt.a = SaverKt.Saver(d.y, e.y);
    }

    @NotNull
    public static final Saver Saver(@NotNull Function2 function20, @NotNull Function1 function10) {
        return new Saver() {
            public final Function2 a;
            public final Function1 b;

            {
                Function2 function20 = function20;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function10 = function10;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = function20;
                this.b = function10;
            }

            @Override  // androidx.compose.runtime.saveable.Saver
            @Nullable
            public Object restore(@NotNull Object object0) {
                return this.b.invoke(object0);
            }

            @Override  // androidx.compose.runtime.saveable.Saver
            @Nullable
            public Object save(@NotNull SaverScope saverScope0, Object object0) {
                return this.a.invoke(saverScope0, object0);
            }
        };
    }

    @NotNull
    public static final Saver autoSaver() {
        Intrinsics.checkNotNull(SaverKt.a, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return SaverKt.a;
    }
}

