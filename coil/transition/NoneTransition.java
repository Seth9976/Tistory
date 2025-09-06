package coil.transition;

import coil.request.ErrorResult;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000BB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcoil/transition/NoneTransition;", "Lcoil/transition/Transition;", "Lcoil/transition/TransitionTarget;", "target", "Lcoil/request/ImageResult;", "result", "<init>", "(Lcoil/transition/TransitionTarget;Lcoil/request/ImageResult;)V", "", "transition", "()V", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class NoneTransition implements Transition {
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0016J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001A\u00020\u000EH\u0016¨\u0006\u000F"}, d2 = {"Lcoil/transition/NoneTransition$Factory;", "Lcoil/transition/Transition$Factory;", "()V", "create", "Lcoil/transition/Transition;", "target", "Lcoil/transition/TransitionTarget;", "result", "Lcoil/request/ImageResult;", "equals", "", "other", "", "hashCode", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Factory implements coil.transition.Transition.Factory {
        @Override  // coil.transition.Transition$Factory
        @NotNull
        public Transition create(@NotNull TransitionTarget transitionTarget0, @NotNull ImageResult imageResult0) {
            return new NoneTransition(transitionTarget0, imageResult0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Factory;
        }

        @Override
        public int hashCode() {
            return Factory.class.hashCode();
        }
    }

    public final TransitionTarget a;
    public final ImageResult b;

    public NoneTransition(@NotNull TransitionTarget transitionTarget0, @NotNull ImageResult imageResult0) {
        this.a = transitionTarget0;
        this.b = imageResult0;
    }

    @Override  // coil.transition.Transition
    public void transition() {
        ImageResult imageResult0 = this.b;
        TransitionTarget transitionTarget0 = this.a;
        if(imageResult0 instanceof SuccessResult) {
            transitionTarget0.onSuccess(((SuccessResult)imageResult0).getDrawable());
            return;
        }
        if(imageResult0 instanceof ErrorResult) {
            transitionTarget0.onError(imageResult0.getDrawable());
        }
    }
}

