package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R+\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u00068F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001AR.\u0010\t\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b8\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/animation/ContentTransform;", "", "Landroidx/compose/animation/EnterTransition;", "targetContentEnter", "Landroidx/compose/animation/ExitTransition;", "initialContentExit", "", "targetContentZIndex", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "<init>", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;FLandroidx/compose/animation/SizeTransform;)V", "a", "Landroidx/compose/animation/EnterTransition;", "getTargetContentEnter", "()Landroidx/compose/animation/EnterTransition;", "b", "Landroidx/compose/animation/ExitTransition;", "getInitialContentExit", "()Landroidx/compose/animation/ExitTransition;", "<set-?>", "c", "Landroidx/compose/runtime/MutableFloatState;", "getTargetContentZIndex", "()F", "setTargetContentZIndex", "(F)V", "d", "Landroidx/compose/animation/SizeTransform;", "getSizeTransform", "()Landroidx/compose/animation/SizeTransform;", "setSizeTransform$animation_release", "(Landroidx/compose/animation/SizeTransform;)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,899:1\n76#2:900\n109#2,2:901\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n*L\n201#1:900\n201#1:901,2\n*E\n"})
public final class ContentTransform {
    public static final int $stable = 8;
    public final EnterTransition a;
    public final ExitTransition b;
    public final MutableFloatState c;
    public SizeTransform d;

    public ContentTransform(@NotNull EnterTransition enterTransition0, @NotNull ExitTransition exitTransition0, float f, @Nullable SizeTransform sizeTransform0) {
        this.a = enterTransition0;
        this.b = exitTransition0;
        this.c = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.d = sizeTransform0;
    }

    public ContentTransform(EnterTransition enterTransition0, ExitTransition exitTransition0, float f, SizeTransform sizeTransform0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            f = 0.0f;
        }
        if((v & 8) != 0) {
            sizeTransform0 = AnimatedContentKt.SizeTransform$default(false, null, 3, null);
        }
        this(enterTransition0, exitTransition0, f, sizeTransform0);
    }

    @NotNull
    public final ExitTransition getInitialContentExit() {
        return this.b;
    }

    @Nullable
    public final SizeTransform getSizeTransform() {
        return this.d;
    }

    @NotNull
    public final EnterTransition getTargetContentEnter() {
        return this.a;
    }

    public final float getTargetContentZIndex() {
        return this.c.getFloatValue();
    }

    public final void setSizeTransform$animation_release(@Nullable SizeTransform sizeTransform0) {
        this.d = sizeTransform0;
    }

    public final void setTargetContentZIndex(float f) {
        this.c.setFloatValue(f);
    }
}

