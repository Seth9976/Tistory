package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001A\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/Modifier$Element;", "onRemeasured", "", "size", "Landroidx/compose/ui/unit/IntSize;", "onRemeasured-ozmzZPI", "(J)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface OnRemeasuredModifier extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull OnRemeasuredModifier onRemeasuredModifier0, @NotNull Function1 function10) {
            return onRemeasuredModifier0.super.all(function10);
        }

        @Deprecated
        public static boolean any(@NotNull OnRemeasuredModifier onRemeasuredModifier0, @NotNull Function1 function10) {
            return onRemeasuredModifier0.super.any(function10);
        }

        @Deprecated
        public static Object foldIn(@NotNull OnRemeasuredModifier onRemeasuredModifier0, Object object0, @NotNull Function2 function20) {
            return onRemeasuredModifier0.super.foldIn(object0, function20);
        }

        @Deprecated
        public static Object foldOut(@NotNull OnRemeasuredModifier onRemeasuredModifier0, Object object0, @NotNull Function2 function20) {
            return onRemeasuredModifier0.super.foldOut(object0, function20);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull OnRemeasuredModifier onRemeasuredModifier0, @NotNull Modifier modifier0) {
            return onRemeasuredModifier0.super.then(modifier0);
        }
    }

    void onRemeasured-ozmzZPI(long arg1);
}

