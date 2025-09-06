package coil.size;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0003\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0006J\u001A\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcoil/size/RealSizeResolver;", "Lcoil/size/SizeResolver;", "Lcoil/size/Size;", "size", "<init>", "(Lcoil/size/Size;)V", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RealSizeResolver implements SizeResolver {
    public final Size a;

    public RealSizeResolver(@NotNull Size size0) {
        this.a = size0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof RealSizeResolver && Intrinsics.areEqual(this.a, ((RealSizeResolver)object0).a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // coil.size.SizeResolver
    @Nullable
    public Object size(@NotNull Continuation continuation0) {
        return this.a;
    }
}

