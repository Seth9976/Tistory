package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\bÇ\u0002\u0018\u00002\u00020\u0001J@\u0010\t\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022)\u0010\b\u001A%\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nRQ\u0010\u0011\u001A1\u0012\u0004\u0012\u00020\u0002\u0012\'\u0012%\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u00058\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/constraintlayout/compose/DesignElements;", "", "", "name", "Lkotlin/Function2;", "Ljava/util/HashMap;", "", "Landroidx/compose/runtime/Composable;", "function", "define", "(Ljava/lang/String;Lkotlin/jvm/functions/Function4;)V", "a", "Ljava/util/HashMap;", "getMap", "()Ljava/util/HashMap;", "setMap", "(Ljava/util/HashMap;)V", "map", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DesignElements {
    public static final int $stable;
    @NotNull
    public static final DesignElements INSTANCE;
    public static HashMap a;

    static {
        DesignElements.INSTANCE = new DesignElements();  // 初始化器: Ljava/lang/Object;-><init>()V
        DesignElements.a = new HashMap();
        DesignElements.$stable = 8;
    }

    public final void define(@NotNull String s, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function40, "function");
        DesignElements.a.put(s, function40);
    }

    @NotNull
    public final HashMap getMap() {
        return DesignElements.a;
    }

    public final void setMap(@NotNull HashMap hashMap0) {
        Intrinsics.checkNotNullParameter(hashMap0, "<set-?>");
        DesignElements.a = hashMap0;
    }
}

