package androidx.compose.foundation.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.Placeholder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0017\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER(\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/text/InlineTextContent;", "", "Landroidx/compose/ui/text/Placeholder;", "placeholder", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/Composable;", "children", "<init>", "(Landroidx/compose/ui/text/Placeholder;Lkotlin/jvm/functions/Function3;)V", "a", "Landroidx/compose/ui/text/Placeholder;", "getPlaceholder", "()Landroidx/compose/ui/text/Placeholder;", "b", "Lkotlin/jvm/functions/Function3;", "getChildren", "()Lkotlin/jvm/functions/Function3;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InlineTextContent {
    public static final int $stable;
    public final Placeholder a;
    public final Function3 b;

    public InlineTextContent(@NotNull Placeholder placeholder0, @NotNull Function3 function30) {
        this.a = placeholder0;
        this.b = function30;
    }

    @NotNull
    public final Function3 getChildren() {
        return this.b;
    }

    @NotNull
    public final Placeholder getPlaceholder() {
        return this.a;
    }
}

