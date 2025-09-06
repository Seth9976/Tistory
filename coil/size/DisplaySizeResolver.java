package coil.size;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001A\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcoil/size/DisplaySizeResolver;", "Lcoil/size/SizeResolver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcoil/size/Size;", "size", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DisplaySizeResolver implements SizeResolver {
    public final Context a;

    public DisplaySizeResolver(@NotNull Context context0) {
        this.a = context0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof DisplaySizeResolver && Intrinsics.areEqual(this.a, ((DisplaySizeResolver)object0).a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // coil.size.SizeResolver
    @Nullable
    public Object size(@NotNull Continuation continuation0) {
        DisplayMetrics displayMetrics0 = this.a.getResources().getDisplayMetrics();
        Pixels dimension$Pixels0 = -Dimensions.Dimension(Math.max(displayMetrics0.widthPixels, displayMetrics0.heightPixels));
        return new Size(dimension$Pixels0, dimension$Pixels0);
    }
}

