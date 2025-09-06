package coil.transition;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.drawable.CrossfadeDrawable;
import coil.request.ErrorResult;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0017B-\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcoil/transition/CrossfadeTransition;", "Lcoil/transition/Transition;", "Lcoil/transition/TransitionTarget;", "target", "Lcoil/request/ImageResult;", "result", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(Lcoil/transition/TransitionTarget;Lcoil/request/ImageResult;IZ)V", "", "transition", "()V", "c", "I", "getDurationMillis", "()I", "d", "Z", "getPreferExactIntrinsicSize", "()Z", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCrossfadeTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeTransition.kt\ncoil/transition/CrossfadeTransition\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class CrossfadeTransition implements Transition {
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001D\b\u0007\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0011\u001A\u00020\u00042\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Lcoil/transition/CrossfadeTransition$Factory;", "Lcoil/transition/Transition$Factory;", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(IZ)V", "Lcoil/transition/TransitionTarget;", "target", "Lcoil/request/ImageResult;", "result", "Lcoil/transition/Transition;", "create", "(Lcoil/transition/TransitionTarget;Lcoil/request/ImageResult;)Lcoil/transition/Transition;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getDurationMillis", "b", "Z", "getPreferExactIntrinsicSize", "()Z", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCrossfadeTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeTransition.kt\ncoil/transition/CrossfadeTransition$Factory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
    public static final class Factory implements coil.transition.Transition.Factory {
        public final int a;
        public final boolean b;

        @JvmOverloads
        public Factory() {
            this(0, false, 3, null);
        }

        @JvmOverloads
        public Factory(int v) {
            this(v, false, 2, null);
        }

        @JvmOverloads
        public Factory(int v, boolean z) {
            this.a = v;
            this.b = z;
            if(v <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        public Factory(int v, boolean z, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = 100;
            }
            if((v1 & 2) != 0) {
                z = false;
            }
            this(v, z);
        }

        @Override  // coil.transition.Transition$Factory
        @NotNull
        public Transition create(@NotNull TransitionTarget transitionTarget0, @NotNull ImageResult imageResult0) {
            if(!(imageResult0 instanceof SuccessResult)) {
                return coil.transition.Transition.Factory.NONE.create(transitionTarget0, imageResult0);
            }
            return ((SuccessResult)imageResult0).getDataSource() == DataSource.MEMORY_CACHE ? coil.transition.Transition.Factory.NONE.create(transitionTarget0, imageResult0) : new CrossfadeTransition(transitionTarget0, imageResult0, this.a, this.b);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Factory && this.a == ((Factory)object0).a && this.b == ((Factory)object0).b;
        }

        public final int getDurationMillis() {
            return this.a;
        }

        public final boolean getPreferExactIntrinsicSize() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.b) + this.a * 0x1F;
        }
    }

    public final TransitionTarget a;
    public final ImageResult b;
    public final int c;
    public final boolean d;

    @JvmOverloads
    public CrossfadeTransition(@NotNull TransitionTarget transitionTarget0, @NotNull ImageResult imageResult0) {
        this(transitionTarget0, imageResult0, 0, false, 12, null);
    }

    @JvmOverloads
    public CrossfadeTransition(@NotNull TransitionTarget transitionTarget0, @NotNull ImageResult imageResult0, int v) {
        this(transitionTarget0, imageResult0, v, false, 8, null);
    }

    @JvmOverloads
    public CrossfadeTransition(@NotNull TransitionTarget transitionTarget0, @NotNull ImageResult imageResult0, int v, boolean z) {
        this.a = transitionTarget0;
        this.b = imageResult0;
        this.c = v;
        this.d = z;
        if(v <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    public CrossfadeTransition(TransitionTarget transitionTarget0, ImageResult imageResult0, int v, boolean z, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            v = 100;
        }
        if((v1 & 8) != 0) {
            z = false;
        }
        this(transitionTarget0, imageResult0, v, z);
    }

    public final int getDurationMillis() {
        return this.c;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.d;
    }

    @Override  // coil.transition.Transition
    public void transition() {
        TransitionTarget transitionTarget0 = this.a;
        Drawable drawable0 = transitionTarget0.getDrawable();
        ImageResult imageResult0 = this.b;
        CrossfadeDrawable crossfadeDrawable0 = new CrossfadeDrawable(drawable0, imageResult0.getDrawable(), imageResult0.getRequest().getScale(), this.c, !(imageResult0 instanceof SuccessResult) || !((SuccessResult)imageResult0).isPlaceholderCached(), this.d);
        if(imageResult0 instanceof SuccessResult) {
            transitionTarget0.onSuccess(crossfadeDrawable0);
            return;
        }
        if(imageResult0 instanceof ErrorResult) {
            transitionTarget0.onError(crossfadeDrawable0);
        }
    }
}

