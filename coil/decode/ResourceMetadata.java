package coil.decode;

import androidx.annotation.DrawableRes;
import coil.annotation.ExperimentalCoilApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalCoilApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000E\u001A\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcoil/decode/ResourceMetadata;", "Lcoil/decode/ImageSource$Metadata;", "", "packageName", "", "resId", "density", "<init>", "(Ljava/lang/String;II)V", "a", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "b", "I", "getResId", "()I", "c", "getDensity", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ResourceMetadata extends coil.decode.ImageSource.Metadata {
    public final String a;
    public final int b;
    public final int c;

    public ResourceMetadata(@NotNull String s, @DrawableRes int v, int v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    public final int getDensity() {
        return this.c;
    }

    @NotNull
    public final String getPackageName() {
        return this.a;
    }

    public final int getResId() {
        return this.b;
    }
}

