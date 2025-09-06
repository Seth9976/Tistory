package androidx.compose.animation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1\n*L\n1#1,497:1\n796#2,3:498\n*E\n"})
public final class AnimatedContentKt.AnimatedContent.6.1.5.1.1.invoke..inlined.onDispose.1 implements DisposableEffectResult {
    public final SnapshotStateList a;
    public final Object b;
    public final AnimatedContentTransitionScopeImpl c;

    public AnimatedContentKt.AnimatedContent.6.1.5.1.1.invoke..inlined.onDispose.1(SnapshotStateList snapshotStateList0, Object object0, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0) {
        this.a = snapshotStateList0;
        this.b = object0;
        this.c = animatedContentTransitionScopeImpl0;
        super();
    }

    @Override  // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        this.a.remove(this.b);
        this.c.getTargetSizeMap$animation_release().remove(this.b);
    }
}

