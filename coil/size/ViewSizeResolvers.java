package coil.size;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A1\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u0002H\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ViewSizeResolver", "Lcoil/size/ViewSizeResolver;", "T", "Landroid/view/View;", "view", "subtractPadding", "", "create", "(Landroid/view/View;Z)Lcoil/size/ViewSizeResolver;", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "ViewSizeResolvers")
public final class ViewSizeResolvers {
    @JvmName(name = "create")
    @JvmOverloads
    @NotNull
    public static final ViewSizeResolver create(@NotNull View view0) {
        return ViewSizeResolvers.create$default(view0, false, 2, null);
    }

    @JvmName(name = "create")
    @JvmOverloads
    @NotNull
    public static final ViewSizeResolver create(@NotNull View view0, boolean z) {
        return new RealViewSizeResolver(view0, z);
    }

    public static ViewSizeResolver create$default(View view0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return ViewSizeResolvers.create(view0, z);
    }
}

