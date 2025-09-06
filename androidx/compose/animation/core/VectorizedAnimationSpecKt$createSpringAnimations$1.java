package androidx.compose.animation.core;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1", "Landroidx/compose/animation/core/Animations;", "", "index", "Landroidx/compose/animation/core/FloatSpringSpec;", "get", "(I)Landroidx/compose/animation/core/FloatSpringSpec;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1076:1\n1549#2:1077\n1620#2,3:1078\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1\n*L\n934#1:1077\n934#1:1078,3\n*E\n"})
public final class VectorizedAnimationSpecKt.createSpringAnimations.1 implements Animations {
    public final ArrayList a;

    public VectorizedAnimationSpecKt.createSpringAnimations.1(AnimationVector animationVector0, float f, float f1) {
        IntRange intRange0 = c.until(0, animationVector0.getSize$animation_core_release());
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
        Iterator iterator0 = intRange0.iterator();
        while(iterator0.hasNext()) {
            arrayList0.add(new FloatSpringSpec(f, f1, animationVector0.get$animation_core_release(((IntIterator)iterator0).nextInt())));
        }
        this.a = arrayList0;
    }

    @Override  // androidx.compose.animation.core.Animations
    public FloatAnimationSpec get(int v) {
        return this.get(v);
    }

    @NotNull
    public FloatSpringSpec get(int v) {
        return (FloatSpringSpec)this.a.get(v);
    }
}

