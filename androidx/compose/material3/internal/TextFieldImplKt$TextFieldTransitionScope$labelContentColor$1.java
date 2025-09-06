package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000B¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", "Lw0/v0;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/graphics/Color;", "invoke", "(Landroidx/compose/animation/core/Transition$Segment;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1\n*L\n1#1,501:1\n*E\n"})
public final class TextFieldImplKt.TextFieldTransitionScope.labelContentColor.1 extends Lambda implements Function3 {
    public static final TextFieldImplKt.TextFieldTransitionScope.labelContentColor.1 INSTANCE;

    static {
        TextFieldImplKt.TextFieldTransitionScope.labelContentColor.1.INSTANCE = new TextFieldImplKt.TextFieldTransitionScope.labelContentColor.1();
    }

    public TextFieldImplKt.TextFieldTransitionScope.labelContentColor.1() {
        super(3);
    }

    @Composable
    @NotNull
    public final FiniteAnimationSpec invoke(@NotNull Segment transition$Segment0, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0xDF986B01);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDF986B01, v, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:419)");
        }
        FiniteAnimationSpec finiteAnimationSpec0 = AnimationSpecKt.tween$default(150, 0, null, 6, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return finiteAnimationSpec0;
    }

    @Override  // kotlin.jvm.functions.Function3
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.invoke(((Segment)object0), ((Composer)object1), ((Number)object2).intValue());
    }
}

