package coil.decode;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\u000B\u001A\u00020\u00042\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcoil/decode/DecodeResult;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "copy", "(Landroid/graphics/drawable/Drawable;Z)Lcoil/decode/DecodeResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "b", "Z", "()Z", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DecodeResult {
    public final Drawable a;
    public final boolean b;

    public DecodeResult(@NotNull Drawable drawable0, boolean z) {
        this.a = drawable0;
        this.b = z;
    }

    @NotNull
    public final DecodeResult copy(@NotNull Drawable drawable0, boolean z) {
        return new DecodeResult(drawable0, z);
    }

    public static DecodeResult copy$default(DecodeResult decodeResult0, Drawable drawable0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            drawable0 = decodeResult0.a;
        }
        if((v & 2) != 0) {
            z = decodeResult0.b;
        }
        return decodeResult0.copy(drawable0, z);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof DecodeResult && Intrinsics.areEqual(this.a, ((DecodeResult)object0).a) && this.b == ((DecodeResult)object0).b;
    }

    @NotNull
    public final Drawable getDrawable() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
    }

    public final boolean isSampled() {
        return this.b;
    }
}

