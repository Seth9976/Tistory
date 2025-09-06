package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u0004\u0018\u00010\u0003*\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/Modifier$Element;", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ParentDataModifier extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull ParentDataModifier parentDataModifier0, @NotNull Function1 function10) {
            return parentDataModifier0.super.all(function10);
        }

        @Deprecated
        public static boolean any(@NotNull ParentDataModifier parentDataModifier0, @NotNull Function1 function10) {
            return parentDataModifier0.super.any(function10);
        }

        @Deprecated
        public static Object foldIn(@NotNull ParentDataModifier parentDataModifier0, Object object0, @NotNull Function2 function20) {
            return parentDataModifier0.super.foldIn(object0, function20);
        }

        @Deprecated
        public static Object foldOut(@NotNull ParentDataModifier parentDataModifier0, Object object0, @NotNull Function2 function20) {
            return parentDataModifier0.super.foldOut(object0, function20);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull ParentDataModifier parentDataModifier0, @NotNull Modifier modifier0) {
            return parentDataModifier0.super.then(modifier0);
        }
    }

    @Nullable
    Object modifyParentData(@NotNull Density arg1, @Nullable Object arg2);
}

