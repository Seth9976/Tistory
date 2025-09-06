package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A#\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\b\u001A#\u0010\u0005\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\b¨\u0006\u0006"}, d2 = {"addExactOrElse", "", "right", "defaultValue", "Lkotlin/Function0;", "subtractExactOrElse", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class MathUtilsKt {
    public static final int addExactOrElse(int v, int v1, @NotNull Function0 function00) {
        int v2 = v + v1;
        return ((v ^ v2) & (v1 ^ v2)) >= 0 ? v2 : ((Number)function00.invoke()).intValue();
    }

    public static final int subtractExactOrElse(int v, int v1, @NotNull Function0 function00) {
        int v2 = v - v1;
        return ((v ^ v2) & (v1 ^ v)) >= 0 ? v2 : ((Number)function00.invoke()).intValue();
    }
}

