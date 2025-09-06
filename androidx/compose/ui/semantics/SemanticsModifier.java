package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001A\u0010\u0002\u001A\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001A\u00020\tX¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000Bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsModifier;", "Landroidx/compose/ui/Modifier$Element;", "id", "", "getId$annotations", "()V", "getId", "()I", "semanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SemanticsModifier extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull SemanticsModifier semanticsModifier0, @NotNull Function1 function10) {
            return semanticsModifier0.super.all(function10);
        }

        @Deprecated
        public static boolean any(@NotNull SemanticsModifier semanticsModifier0, @NotNull Function1 function10) {
            return semanticsModifier0.super.any(function10);
        }

        @Deprecated
        public static Object foldIn(@NotNull SemanticsModifier semanticsModifier0, Object object0, @NotNull Function2 function20) {
            return semanticsModifier0.super.foldIn(object0, function20);
        }

        @Deprecated
        public static Object foldOut(@NotNull SemanticsModifier semanticsModifier0, Object object0, @NotNull Function2 function20) {
            return semanticsModifier0.super.foldOut(object0, function20);
        }

        @Deprecated
        public static int getId(@NotNull SemanticsModifier semanticsModifier0) {
            return SemanticsModifier.access$getId$jd(semanticsModifier0);
        }

        @kotlin.Deprecated(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static void getId$annotations() {
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull SemanticsModifier semanticsModifier0, @NotNull Modifier modifier0) {
            return semanticsModifier0.super.then(modifier0);
        }
    }

    static int access$getId$jd(SemanticsModifier semanticsModifier0) {
        return -1;
    }

    default int getId() [...] // Inlined contents

    @NotNull
    SemanticsConfiguration getSemanticsConfiguration();
}

