package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import o1.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001A#\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"focusProperties", "Landroidx/compose/ui/Modifier;", "scope", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FocusPropertiesKt {
    @NotNull
    public static final Modifier focusProperties(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return modifier0.then(new FocusPropertiesElement(new h(function10)));
    }
}

