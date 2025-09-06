package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.z0;

@Immutable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0018\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0006\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000ER\u0014\u0010\u0012\u001A\u00020\u000F8 X \u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011\u0082\u0001\u0001\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/EnterTransition;", "", "enter", "plus", "(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/animation/TransitionData;", "getData$animation_release", "()Landroidx/compose/animation/TransitionData;", "data", "Companion", "Ls/z0;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class EnterTransition {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/EnterTransition$Companion;", "", "Landroidx/compose/animation/EnterTransition;", "None", "Landroidx/compose/animation/EnterTransition;", "getNone", "()Landroidx/compose/animation/EnterTransition;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final EnterTransition getNone() {
            return EnterTransition.a;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public static final z0 a;

    static {
        EnterTransition.Companion = new Companion(null);
        EnterTransition.a = new z0(new TransitionData(null, null, null, null, false, null, 0x3F, null));
    }

    public EnterTransition(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof EnterTransition && Intrinsics.areEqual(((EnterTransition)object0).getData$animation_release(), this.getData$animation_release());
    }

    @NotNull
    public abstract TransitionData getData$animation_release();

    @Override
    public int hashCode() {
        return this.getData$animation_release().hashCode();
    }

    @Stable
    @NotNull
    public final EnterTransition plus(@NotNull EnterTransition enterTransition0) {
        Fade fade0 = enterTransition0.getData$animation_release().getFade();
        if(fade0 == null) {
            fade0 = this.getData$animation_release().getFade();
        }
        Slide slide0 = enterTransition0.getData$animation_release().getSlide();
        if(slide0 == null) {
            slide0 = this.getData$animation_release().getSlide();
        }
        ChangeSize changeSize0 = enterTransition0.getData$animation_release().getChangeSize();
        if(changeSize0 == null) {
            changeSize0 = this.getData$animation_release().getChangeSize();
        }
        Scale scale0 = enterTransition0.getData$animation_release().getScale();
        if(scale0 == null) {
            scale0 = this.getData$animation_release().getScale();
        }
        return new z0(new TransitionData(fade0, slide0, changeSize0, scale0, false, x.plus(this.getData$animation_release().getEffectsMap(), enterTransition0.getData$animation_release().getEffectsMap()), 16, null));
    }

    @Override
    @NotNull
    public String toString() {
        if(Intrinsics.areEqual(this, EnterTransition.a)) {
            return "EnterTransition.None";
        }
        TransitionData transitionData0 = this.getData$animation_release();
        StringBuilder stringBuilder0 = new StringBuilder("EnterTransition: \nFade - ");
        Fade fade0 = transitionData0.getFade();
        String s = null;
        stringBuilder0.append((fade0 == null ? null : fade0.toString()));
        stringBuilder0.append(",\nSlide - ");
        Slide slide0 = transitionData0.getSlide();
        stringBuilder0.append((slide0 == null ? null : slide0.toString()));
        stringBuilder0.append(",\nShrink - ");
        ChangeSize changeSize0 = transitionData0.getChangeSize();
        stringBuilder0.append((changeSize0 == null ? null : changeSize0.toString()));
        stringBuilder0.append(",\nScale - ");
        Scale scale0 = transitionData0.getScale();
        if(scale0 != null) {
            s = scale0.toString();
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }
}

