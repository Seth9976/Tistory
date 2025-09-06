package coil.util;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import coil.request.DefaultRequestOptions;
import coil.request.ImageRequest;
import coil.size.DisplaySizeResolver;
import coil.size.Precision;
import coil.size.ViewSizeResolver;
import coil.target.ViewTarget;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A5\u0010\u0006\u001A\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u00012\n\b\u0001\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\u0010\u0005\u001A\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001A\u0010\r\u001A\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"\u0018\u0010\u0011\u001A\u00020\u000E*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcoil/request/ImageRequest;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "resId", "default", "getDrawableCompat", "(Lcoil/request/ImageRequest;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "Lcoil/request/DefaultRequestOptions;", "a", "Lcoil/request/DefaultRequestOptions;", "getDEFAULT_REQUEST_OPTIONS", "()Lcoil/request/DefaultRequestOptions;", "DEFAULT_REQUEST_OPTIONS", "", "getAllowInexactSize", "(Lcoil/request/ImageRequest;)Z", "allowInexactSize", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-Requests")
public final class -Requests {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Precision.values().length];
            try {
                arr_v[Precision.EXACT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Precision.INEXACT.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Precision.AUTOMATIC.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final DefaultRequestOptions a;

    static {
        -Requests.a = new DefaultRequestOptions(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 0x7FFF, null);
    }

    public static final boolean getAllowInexactSize(@NotNull ImageRequest imageRequest0) {
        switch(WhenMappings.$EnumSwitchMapping$0[imageRequest0.getPrecision().ordinal()]) {
            case 1: {
                return false;
            }
            case 2: {
                return true;
            }
            case 3: {
                return imageRequest0.getDefined().getSizeResolver() == null && imageRequest0.getSizeResolver() instanceof DisplaySizeResolver || imageRequest0.getTarget() instanceof ViewTarget && imageRequest0.getSizeResolver() instanceof ViewSizeResolver && ((ViewTarget)imageRequest0.getTarget()).getView() instanceof ImageView && ((ViewTarget)imageRequest0.getTarget()).getView() == ((ViewSizeResolver)imageRequest0.getSizeResolver()).getView();
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final DefaultRequestOptions getDEFAULT_REQUEST_OPTIONS() {
        return -Requests.a;
    }

    @Nullable
    public static final Drawable getDrawableCompat(@NotNull ImageRequest imageRequest0, @Nullable Drawable drawable0, @DrawableRes @Nullable Integer integer0, @Nullable Drawable drawable1) {
        if(drawable0 == null) {
            if(integer0 != null) {
                return ((int)integer0) == 0 ? null : -Contexts.getDrawableCompat(imageRequest0.getContext(), ((int)integer0));
            }
            return drawable1;
        }
        return drawable0;
    }
}

