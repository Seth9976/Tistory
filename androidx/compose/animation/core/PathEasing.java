package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.BezierKt;
import androidx.compose.ui.graphics.IntervalTree;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathSegment.Type;
import androidx.compose.ui.graphics.PathSegment;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/animation/core/PathEasing;", "Landroidx/compose/animation/core/Easing;", "Landroidx/compose/ui/graphics/Path;", "path", "<init>", "(Landroidx/compose/ui/graphics/Path;)V", "", "fraction", "transform", "(F)F", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPathEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathEasing.kt\nandroidx/compose/animation/core/PathEasing\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 4 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,120:1\n66#2,8:121\n54#2,7:129\n33#2,7:136\n33#2,7:146\n48#3:143\n54#3:145\n22#4:144\n*S KotlinDebug\n*F\n+ 1 PathEasing.kt\nandroidx/compose/animation/core/PathEasing\n*L\n72#1:121,8\n77#1:129,7\n101#1:136,7\n113#1:146,7\n108#1:143\n108#1:145\n108#1:144\n*E\n"})
public final class PathEasing implements Easing {
    public static final int $stable;
    public final Path a;
    public IntervalTree b;

    public PathEasing(@NotNull Path path0) {
        this.a = path0;
    }

    @Override  // androidx.compose.animation.core.Easing
    public float transform(float f) {
        if(f <= 0.0f) {
            return 0.0f;
        }
        if(f >= 1.0f) {
            return 1.0f;
        }
        if(this.b == null) {
            IntervalTree intervalTree0 = new IntervalTree();
            for(PathSegment pathSegment0: this.a) {
                if(pathSegment0.getType() == Type.Close) {
                    PreconditionsKt.throwIllegalArgumentException("The path cannot contain a close() command.");
                }
                if(pathSegment0.getType() != Type.Move && pathSegment0.getType() != Type.Done) {
                    long v = BezierKt.computeHorizontalBounds$default(pathSegment0, new float[5], 0, 4, null);
                    intervalTree0.addInterval(Float.intBitsToFloat(((int)(v >> 0x20))), Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))), pathSegment0);
                }
            }
            if(!intervalTree0.contains(0.0f) || !intervalTree0.contains(1.0f)) {
                PreconditionsKt.throwIllegalArgumentException("The easing path must start at 0.0f and end at 1.0f.");
            }
            this.b = intervalTree0;
        }
        IntervalTree intervalTree1 = this.b;
        if(intervalTree1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intervals");
            intervalTree1 = null;
        }
        Object object0 = IntervalTree.findFirstOverlap$default(intervalTree1, f, 0.0f, 2, null).getData();
        if(object0 != null) {
            float f1 = BezierKt.findFirstRoot(((PathSegment)object0), f);
            if(Float.isNaN(f1)) {
                PreconditionsKt.throwIllegalStateException("The easing path is invalid. Make sure it does not contain NaN/Infinity values.");
            }
            return BezierKt.evaluateY(((PathSegment)object0), f1);
        }
        PreconditionsKt.throwIllegalStateExceptionForNullCheck("The easing path is invalid. Make sure it is continuous on the x axis.");
        throw new KotlinNothingValueException();
    }
}

