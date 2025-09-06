package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import o1.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A%\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001A\u00020\bH\u0007\u001A-\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001A\u00020\b2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007¨\u0006\t"}, d2 = {"focusOrder", "Landroidx/compose/ui/Modifier;", "focusOrderReceiver", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "", "Lkotlin/ExtensionFunctionType;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FocusOrderModifierKt {
    @Deprecated(message = "Use focusRequester() instead", replaceWith = @ReplaceWith(expression = "this.focusRequester(focusRequester)", imports = {"androidx.compose.ui.focus.focusRequester"}))
    @NotNull
    public static final Modifier focusOrder(@NotNull Modifier modifier0, @NotNull FocusRequester focusRequester0) {
        return FocusRequesterModifierKt.focusRequester(modifier0, focusRequester0);
    }

    @Deprecated(message = "Use focusProperties() and focusRequester() instead", replaceWith = @ReplaceWith(expression = "this.focusRequester(focusRequester).focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties, androidx.compose.ui.focus.focusRequester"}))
    @NotNull
    public static final Modifier focusOrder(@NotNull Modifier modifier0, @NotNull FocusRequester focusRequester0, @NotNull Function1 function10) {
        FocusOrderToProperties focusOrderToProperties0 = new FocusOrderToProperties(function10);
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier0, focusRequester0), new d(focusOrderToProperties0, 1));
    }

    @Deprecated(message = "Use focusProperties() instead", replaceWith = @ReplaceWith(expression = "this.focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties"}))
    @NotNull
    public static final Modifier focusOrder(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return FocusPropertiesKt.focusProperties(modifier0, new d(new FocusOrderToProperties(function10), 0));
    }
}

