package com.kakao.kandinsky.preview;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
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

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateValue$1\n*L\n1#1,2183:1\n*E\n"})
public final class PreviewAnimator.getAnimatedMatrix..inlined.animateValue.3 extends Lambda implements Function3 {
    public static final PreviewAnimator.getAnimatedMatrix..inlined.animateValue.3 INSTANCE;

    static {
        PreviewAnimator.getAnimatedMatrix..inlined.animateValue.3.INSTANCE = new PreviewAnimator.getAnimatedMatrix..inlined.animateValue.3();
    }

    public PreviewAnimator.getAnimatedMatrix..inlined.animateValue.3() {
        super(3);
    }

    @Composable
    @NotNull
    public final SpringSpec invoke(@NotNull Segment transition$Segment0, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0xCA9F45E6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCA9F45E6, v, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1878)");
        }
        SpringSpec springSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return springSpec0;
    }

    @Override  // kotlin.jvm.functions.Function3
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.invoke(((Segment)object0), ((Composer)object1), ((Number)object2).intValue());
    }
}

