package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001D\u0010\u0004\u001A\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001A\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/ui/text/SaversKt$NonNullValueClassSaver$1", "Landroidx/compose/ui/text/NonNullValueClassSaver;", "Landroidx/compose/runtime/saveable/SaverScope;", "value", "save", "(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;", "restore", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SaversKt.NonNullValueClassSaver.1 implements NonNullValueClassSaver {
    public final Lambda a;
    public final Lambda b;

    public SaversKt.NonNullValueClassSaver.1(Function2 function20, Function1 function10) {
        this.a = (Lambda)function20;
        this.b = (Lambda)function10;
    }

    @Override  // androidx.compose.runtime.saveable.Saver
    @Nullable
    public Object restore(@NotNull Object object0) {
        return ((Function1)this.b).invoke(object0);
    }

    @Override  // androidx.compose.runtime.saveable.Saver
    @Nullable
    public Object save(@NotNull SaverScope saverScope0, Object object0) {
        return ((Function2)this.a).invoke(saverScope0, object0);
    }
}

