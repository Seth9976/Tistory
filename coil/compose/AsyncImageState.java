package coil.compose;

import androidx.compose.runtime.Stable;
import coil.ImageLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000F\b\u0001\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FR\u0019\u0010\u0002\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Lcoil/compose/AsyncImageState;", "", "model", "Lcoil/compose/EqualityDelegate;", "modelEqualityDelegate", "Lcoil/ImageLoader;", "imageLoader", "<init>", "(Ljava/lang/Object;Lcoil/compose/EqualityDelegate;Lcoil/ImageLoader;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/Object;", "getModel", "()Ljava/lang/Object;", "b", "Lcoil/compose/EqualityDelegate;", "getModelEqualityDelegate", "()Lcoil/compose/EqualityDelegate;", "c", "Lcoil/ImageLoader;", "getImageLoader", "()Lcoil/ImageLoader;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AsyncImageState {
    public static final int $stable;
    public final Object a;
    public final EqualityDelegate b;
    public final ImageLoader c;

    public AsyncImageState(@Nullable Object object0, @NotNull EqualityDelegate equalityDelegate0, @NotNull ImageLoader imageLoader0) {
        this.a = object0;
        this.b = equalityDelegate0;
        this.c = imageLoader0;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof AsyncImageState && this.b.equals(this.a, ((AsyncImageState)object0).a) && Intrinsics.areEqual(this.c, ((AsyncImageState)object0).c);
    }

    @NotNull
    public final ImageLoader getImageLoader() {
        return this.c;
    }

    @Nullable
    public final Object getModel() {
        return this.a;
    }

    @NotNull
    public final EqualityDelegate getModelEqualityDelegate() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.b.hashCode(this.a);
        return this.c.hashCode() + v * 0x1F;
    }
}

