package coil.size;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000B\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001A\u00028\u0000\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\u00052\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0004\u001A\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcoil/size/RealViewSizeResolver;", "Landroid/view/View;", "T", "Lcoil/size/ViewSizeResolver;", "view", "", "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "b", "Z", "getSubtractPadding", "()Z", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RealViewSizeResolver implements ViewSizeResolver {
    public final View a;
    public final boolean b;

    public RealViewSizeResolver(@NotNull View view0, boolean z) {
        this.a = view0;
        this.b = z;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof RealViewSizeResolver && Intrinsics.areEqual(this.getView(), ((RealViewSizeResolver)object0).getView()) && this.getSubtractPadding() == ((RealViewSizeResolver)object0).getSubtractPadding();
    }

    @Override  // coil.size.ViewSizeResolver
    public boolean getSubtractPadding() {
        return this.b;
    }

    @Override  // coil.size.ViewSizeResolver
    @NotNull
    public View getView() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.getSubtractPadding()) + this.getView().hashCode() * 0x1F;
    }
}

