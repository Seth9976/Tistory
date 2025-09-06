package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "Use FocusEventModifierNode instead")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusEventModifier;", "Landroidx/compose/ui/Modifier$Element;", "onFocusEvent", "", "focusState", "Landroidx/compose/ui/focus/FocusState;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface FocusEventModifier extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean all(@NotNull FocusEventModifier focusEventModifier0, @NotNull Function1 function10) {
            return focusEventModifier0.super.all(function10);
        }

        @java.lang.Deprecated
        public static boolean any(@NotNull FocusEventModifier focusEventModifier0, @NotNull Function1 function10) {
            return focusEventModifier0.super.any(function10);
        }

        @java.lang.Deprecated
        public static Object foldIn(@NotNull FocusEventModifier focusEventModifier0, Object object0, @NotNull Function2 function20) {
            return focusEventModifier0.super.foldIn(object0, function20);
        }

        @java.lang.Deprecated
        public static Object foldOut(@NotNull FocusEventModifier focusEventModifier0, Object object0, @NotNull Function2 function20) {
            return focusEventModifier0.super.foldOut(object0, function20);
        }

        @java.lang.Deprecated
        @NotNull
        public static Modifier then(@NotNull FocusEventModifier focusEventModifier0, @NotNull Modifier modifier0) {
            return focusEventModifier0.super.then(modifier0);
        }
    }

    void onFocusEvent(@NotNull FocusState arg1);
}

