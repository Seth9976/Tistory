package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(23)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000B\bÁ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0006\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00042\b\u0010\r\u001A\u0004\u0018\u00010\f2\b\u0010\u000E\u001A\u0004\u0018\u00010\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u0019\u001A\u00020\u00102\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi23Helper;", "", "Landroid/view/ViewStructure;", "structure", "", "index", "newChild", "(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;", "num", "addChildCount", "(Landroid/view/ViewStructure;I)I", "id", "", "packageName", "typeName", "entryName", "", "setId", "(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "left", "top", "scrollX", "scrollY", "width", "height", "setDimens", "(Landroid/view/ViewStructure;IIIIII)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AutofillApi23Helper {
    public static final int $stable;
    @NotNull
    public static final AutofillApi23Helper INSTANCE;

    static {
        AutofillApi23Helper.INSTANCE = new AutofillApi23Helper();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(23)
    public final int addChildCount(@NotNull ViewStructure viewStructure0, int v) {
        return viewStructure0.addChildCount(v);
    }

    @DoNotInline
    @RequiresApi(23)
    @Nullable
    public final ViewStructure newChild(@NotNull ViewStructure viewStructure0, int v) {
        return viewStructure0.newChild(v);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setDimens(@NotNull ViewStructure viewStructure0, int v, int v1, int v2, int v3, int v4, int v5) {
        viewStructure0.setDimens(v, v1, v2, v3, v4, v5);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setId(@NotNull ViewStructure viewStructure0, int v, @Nullable String s, @Nullable String s1, @Nullable String s2) {
        viewStructure0.setId(v, s, s1, s2);
    }
}

