package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.a1;

@Immutable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0018\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001A\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000ER\u0014\u0010\u0012\u001A\u00020\u000F8 X \u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011\u0082\u0001\u0001\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/ExitTransition;", "", "exit", "plus", "(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "Landroidx/compose/animation/TransitionData;", "getData$animation_release", "()Landroidx/compose/animation/TransitionData;", "data", "Companion", "Ls/a1;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class ExitTransition {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001A\u0010\u0007\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/animation/ExitTransition$Companion;", "", "Landroidx/compose/animation/ExitTransition;", "None", "Landroidx/compose/animation/ExitTransition;", "getNone", "()Landroidx/compose/animation/ExitTransition;", "KeepUntilTransitionsFinished", "getKeepUntilTransitionsFinished$animation_release", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ExitTransition getKeepUntilTransitionsFinished$animation_release() {
            return ExitTransition.b;
        }

        @NotNull
        public final ExitTransition getNone() {
            return ExitTransition.a;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public static final a1 a;
    public static final a1 b;

    static {
        ExitTransition.Companion = new Companion(null);
        ExitTransition.a = new a1(new TransitionData(null, null, null, null, false, null, 0x3F, null));
        ExitTransition.b = new a1(new TransitionData(null, null, null, null, true, null, 0x2F, null));
    }

    public ExitTransition(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ExitTransition && Intrinsics.areEqual(((ExitTransition)object0).getData$animation_release(), this.getData$animation_release());
    }

    @NotNull
    public abstract TransitionData getData$animation_release();

    @Override
    public int hashCode() {
        return this.getData$animation_release().hashCode();
    }

    @Stable
    @NotNull
    public final ExitTransition plus(@NotNull ExitTransition exitTransition0) {
        Fade fade0 = exitTransition0.getData$animation_release().getFade();
        if(fade0 == null) {
            fade0 = this.getData$animation_release().getFade();
        }
        Slide slide0 = exitTransition0.getData$animation_release().getSlide();
        if(slide0 == null) {
            slide0 = this.getData$animation_release().getSlide();
        }
        ChangeSize changeSize0 = exitTransition0.getData$animation_release().getChangeSize();
        if(changeSize0 == null) {
            changeSize0 = this.getData$animation_release().getChangeSize();
        }
        Scale scale0 = exitTransition0.getData$animation_release().getScale();
        if(scale0 == null) {
            scale0 = this.getData$animation_release().getScale();
        }
        return exitTransition0.getData$animation_release().getHold() || this.getData$animation_release().getHold() ? new a1(new TransitionData(fade0, slide0, changeSize0, scale0, true, x.plus(this.getData$animation_release().getEffectsMap(), exitTransition0.getData$animation_release().getEffectsMap()))) : new a1(new TransitionData(fade0, slide0, changeSize0, scale0, false, x.plus(this.getData$animation_release().getEffectsMap(), exitTransition0.getData$animation_release().getEffectsMap())));
    }

    @Override
    @NotNull
    public String toString() {
        if(Intrinsics.areEqual(this, ExitTransition.a)) {
            return "ExitTransition.None";
        }
        if(Intrinsics.areEqual(this, ExitTransition.b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData transitionData0 = this.getData$animation_release();
        StringBuilder stringBuilder0 = new StringBuilder("ExitTransition: \nFade - ");
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
        stringBuilder0.append(",\nKeepUntilTransitionsFinished - ");
        stringBuilder0.append(transitionData0.getHold());
        return stringBuilder0.toString();
    }
}

