package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001A\u00020\u0003*\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/Modifier$Element;", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface DrawModifier extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull DrawModifier drawModifier0, @NotNull Function1 function10) {
            return drawModifier0.super.all(function10);
        }

        @Deprecated
        public static boolean any(@NotNull DrawModifier drawModifier0, @NotNull Function1 function10) {
            return drawModifier0.super.any(function10);
        }

        @Deprecated
        public static Object foldIn(@NotNull DrawModifier drawModifier0, Object object0, @NotNull Function2 function20) {
            return drawModifier0.super.foldIn(object0, function20);
        }

        @Deprecated
        public static Object foldOut(@NotNull DrawModifier drawModifier0, Object object0, @NotNull Function2 function20) {
            return drawModifier0.super.foldOut(object0, function20);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull DrawModifier drawModifier0, @NotNull Modifier modifier0) {
            return drawModifier0.super.then(modifier0);
        }
    }

    void draw(@NotNull ContentDrawScope arg1);
}

