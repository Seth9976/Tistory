package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0018\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001A\u00028\u0000X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalProvider;", "T", "Landroidx/compose/ui/Modifier$Element;", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "value", "getValue", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ModifierLocalProvider extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull ModifierLocalProvider modifierLocalProvider0, @NotNull Function1 function10) {
            return modifierLocalProvider0.super.all(function10);
        }

        @Deprecated
        public static boolean any(@NotNull ModifierLocalProvider modifierLocalProvider0, @NotNull Function1 function10) {
            return modifierLocalProvider0.super.any(function10);
        }

        @Deprecated
        public static Object foldIn(@NotNull ModifierLocalProvider modifierLocalProvider0, Object object0, @NotNull Function2 function20) {
            return modifierLocalProvider0.super.foldIn(object0, function20);
        }

        @Deprecated
        public static Object foldOut(@NotNull ModifierLocalProvider modifierLocalProvider0, Object object0, @NotNull Function2 function20) {
            return modifierLocalProvider0.super.foldOut(object0, function20);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull ModifierLocalProvider modifierLocalProvider0, @NotNull Modifier modifier0) {
            return modifierLocalProvider0.super.then(modifier0);
        }
    }

    @NotNull
    ProvidableModifierLocal getKey();

    Object getValue();
}

