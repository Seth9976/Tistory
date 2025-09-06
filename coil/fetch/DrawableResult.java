package coil.fetch;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000E\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000E\u001A\u00020\u00042\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0005\u0010\u0019R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001E"}, d2 = {"Lcoil/fetch/DrawableResult;", "Lcoil/fetch/FetchResult;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "Lcoil/decode/DataSource;", "dataSource", "<init>", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;)V", "copy", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;)Lcoil/fetch/DrawableResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "b", "Z", "()Z", "c", "Lcoil/decode/DataSource;", "getDataSource", "()Lcoil/decode/DataSource;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DrawableResult extends FetchResult {
    public final Drawable a;
    public final boolean b;
    public final DataSource c;

    public DrawableResult(@NotNull Drawable drawable0, boolean z, @NotNull DataSource dataSource0) {
        super(null);
        this.a = drawable0;
        this.b = z;
        this.c = dataSource0;
    }

    @NotNull
    public final DrawableResult copy(@NotNull Drawable drawable0, boolean z, @NotNull DataSource dataSource0) {
        return new DrawableResult(drawable0, z, dataSource0);
    }

    public static DrawableResult copy$default(DrawableResult drawableResult0, Drawable drawable0, boolean z, DataSource dataSource0, int v, Object object0) {
        if((v & 1) != 0) {
            drawable0 = drawableResult0.a;
        }
        if((v & 2) != 0) {
            z = drawableResult0.b;
        }
        if((v & 4) != 0) {
            dataSource0 = drawableResult0.c;
        }
        return drawableResult0.copy(drawable0, z, dataSource0);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof DrawableResult && Intrinsics.areEqual(this.a, ((DrawableResult)object0).a) && this.b == ((DrawableResult)object0).b && this.c == ((DrawableResult)object0).c;
    }

    @NotNull
    public final DataSource getDataSource() {
        return this.c;
    }

    @NotNull
    public final Drawable getDrawable() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + a.e(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    public final boolean isSampled() {
        return this.b;
    }
}

