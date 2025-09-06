package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0016\u0010\u0000\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0000¨\u0006\u0003"}, d2 = {"parse", "Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "Landroidx/compose/animation/core/Transition;", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TransitionComposeAnimation_androidKt {
    @Nullable
    public static final TransitionComposeAnimation parse(@NotNull Transition transition0) {
        Object object0 = transition0.getCurrentState();
        if(object0 != null) {
            Object[] arr_object = object0.getClass().getEnumConstants();
            if(arr_object != null) {
                Set set0 = ArraysKt___ArraysKt.toSet(arr_object);
                return set0 == null ? new TransitionComposeAnimation(transition0, e0.setOf(object0), (transition0.getLabel() == null ? Reflection.getOrCreateKotlinClass(object0.getClass()).getSimpleName() : transition0.getLabel())) : new TransitionComposeAnimation(transition0, set0, (transition0.getLabel() == null ? Reflection.getOrCreateKotlinClass(object0.getClass()).getSimpleName() : transition0.getLabel()));
            }
            return new TransitionComposeAnimation(transition0, e0.setOf(object0), (transition0.getLabel() == null ? Reflection.getOrCreateKotlinClass(object0.getClass()).getSimpleName() : transition0.getLabel()));
        }
        return null;
    }
}

