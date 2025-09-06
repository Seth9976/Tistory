package androidx.compose.foundation.text.input;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.intl.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l0.b;
import l0.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007\u001AD\u0010\u0004\u001A\u00020\u0001*\u00020\u000126\u0010\u0005\u001A2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u001A\u0014\u0010\f\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001A\u00020\rH\u0007\u001A\u0014\u0010\u000E\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u0001H\u0007¨\u0006\u0010"}, d2 = {"allCaps", "Landroidx/compose/foundation/text/input/InputTransformation;", "locale", "Landroidx/compose/ui/text/intl/Locale;", "byValue", "transformation", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "current", "proposed", "maxLength", "", "then", "next", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InputTransformationKt {
    @Stable
    @NotNull
    public static final InputTransformation allCaps(@NotNull InputTransformation inputTransformation0, @NotNull Locale locale0) {
        return InputTransformationKt.then(inputTransformation0, new a(locale0));
    }

    @Stable
    @NotNull
    public static final InputTransformation byValue(@NotNull InputTransformation inputTransformation0, @NotNull Function2 function20) {
        return InputTransformationKt.then(inputTransformation0, new b(function20));
    }

    @Stable
    @NotNull
    public static final InputTransformation maxLength(@NotNull InputTransformation inputTransformation0, int v) {
        return InputTransformationKt.then(inputTransformation0, new c(v));
    }

    @Stable
    @NotNull
    public static final InputTransformation then(@NotNull InputTransformation inputTransformation0, @NotNull InputTransformation inputTransformation1) {
        return new l0.a(inputTransformation0, inputTransformation1);
    }
}

