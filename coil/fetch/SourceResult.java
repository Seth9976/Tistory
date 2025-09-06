package coil.fetch;

import coil.decode.DataSource;
import coil.decode.ImageSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000F\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000F\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F¨\u0006 "}, d2 = {"Lcoil/fetch/SourceResult;", "Lcoil/fetch/FetchResult;", "Lcoil/decode/ImageSource;", "source", "", "mimeType", "Lcoil/decode/DataSource;", "dataSource", "<init>", "(Lcoil/decode/ImageSource;Ljava/lang/String;Lcoil/decode/DataSource;)V", "copy", "(Lcoil/decode/ImageSource;Ljava/lang/String;Lcoil/decode/DataSource;)Lcoil/fetch/SourceResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lcoil/decode/ImageSource;", "getSource", "()Lcoil/decode/ImageSource;", "b", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "c", "Lcoil/decode/DataSource;", "getDataSource", "()Lcoil/decode/DataSource;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SourceResult extends FetchResult {
    public final ImageSource a;
    public final String b;
    public final DataSource c;

    public SourceResult(@NotNull ImageSource imageSource0, @Nullable String s, @NotNull DataSource dataSource0) {
        super(null);
        this.a = imageSource0;
        this.b = s;
        this.c = dataSource0;
    }

    @NotNull
    public final SourceResult copy(@NotNull ImageSource imageSource0, @Nullable String s, @NotNull DataSource dataSource0) {
        return new SourceResult(imageSource0, s, dataSource0);
    }

    public static SourceResult copy$default(SourceResult sourceResult0, ImageSource imageSource0, String s, DataSource dataSource0, int v, Object object0) {
        if((v & 1) != 0) {
            imageSource0 = sourceResult0.a;
        }
        if((v & 2) != 0) {
            s = sourceResult0.b;
        }
        if((v & 4) != 0) {
            dataSource0 = sourceResult0.c;
        }
        return sourceResult0.copy(imageSource0, s, dataSource0);
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof SourceResult && Intrinsics.areEqual(this.a, ((SourceResult)object0).a) && Intrinsics.areEqual(this.b, ((SourceResult)object0).b) && this.c == ((SourceResult)object0).c;
    }

    @NotNull
    public final DataSource getDataSource() {
        return this.c;
    }

    @Nullable
    public final String getMimeType() {
        return this.b;
    }

    @NotNull
    public final ImageSource getSource() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.c.hashCode() + v * 961 : this.c.hashCode() + (v * 0x1F + this.b.hashCode()) * 0x1F;
    }
}

