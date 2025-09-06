package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "Use FocusRequesterModifierNode instead")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterModifier;", "Landroidx/compose/ui/Modifier$Element;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface FocusRequesterModifier extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean all(@NotNull FocusRequesterModifier focusRequesterModifier0, @NotNull Function1 function10) {
            return focusRequesterModifier0.super.all(function10);
        }

        @java.lang.Deprecated
        public static boolean any(@NotNull FocusRequesterModifier focusRequesterModifier0, @NotNull Function1 function10) {
            return focusRequesterModifier0.super.any(function10);
        }

        @java.lang.Deprecated
        public static Object foldIn(@NotNull FocusRequesterModifier focusRequesterModifier0, Object object0, @NotNull Function2 function20) {
            return focusRequesterModifier0.super.foldIn(object0, function20);
        }

        @java.lang.Deprecated
        public static Object foldOut(@NotNull FocusRequesterModifier focusRequesterModifier0, Object object0, @NotNull Function2 function20) {
            return focusRequesterModifier0.super.foldOut(object0, function20);
        }

        @java.lang.Deprecated
        @NotNull
        public static Modifier then(@NotNull FocusRequesterModifier focusRequesterModifier0, @NotNull Modifier modifier0) {
            return focusRequesterModifier0.super.then(modifier0);
        }
    }

    @NotNull
    FocusRequester getFocusRequester();
}

