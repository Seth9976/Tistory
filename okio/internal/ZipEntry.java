package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\b\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000F\u001A\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0005\u0010\u0018R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u0017\u0010\n\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001E\u001A\u0004\b\"\u0010 R\u0017\u0010\u000B\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010\u001E\u001A\u0004\b$\u0010 R\u0017\u0010\r\u001A\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R\u0019\u0010\u000E\u001A\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u0017\u0010\u000F\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010\u001E\u001A\u0004\b.\u0010 R\u001D\u00104\u001A\b\u0012\u0004\u0012\u00020\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103¨\u00065"}, d2 = {"Lokio/internal/ZipEntry;", "", "Lokio/Path;", "canonicalPath", "", "isDirectory", "", "comment", "", "crc", "compressedSize", "size", "", "compressionMethod", "lastModifiedAtMillis", "offset", "<init>", "(Lokio/Path;ZLjava/lang/String;JJJILjava/lang/Long;J)V", "a", "Lokio/Path;", "getCanonicalPath", "()Lokio/Path;", "b", "Z", "()Z", "c", "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "d", "J", "getCrc", "()J", "e", "getCompressedSize", "f", "getSize", "g", "I", "getCompressionMethod", "()I", "h", "Ljava/lang/Long;", "getLastModifiedAtMillis", "()Ljava/lang/Long;", "i", "getOffset", "", "j", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "children", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ZipEntry {
    public final Path a;
    public final boolean b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final Long h;
    public final long i;
    public final ArrayList j;

    public ZipEntry(@NotNull Path path0, boolean z, @NotNull String s, long v, long v1, long v2, int v3, @Nullable Long long0, long v4) {
        Intrinsics.checkNotNullParameter(path0, "canonicalPath");
        Intrinsics.checkNotNullParameter(s, "comment");
        super();
        this.a = path0;
        this.b = z;
        this.c = s;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        this.h = long0;
        this.i = v4;
        this.j = new ArrayList();
    }

    public ZipEntry(Path path0, boolean z, String s, long v, long v1, long v2, int v3, Long long0, long v4, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(path0, ((v5 & 2) == 0 ? z : false), ((v5 & 4) == 0 ? s : ""), ((v5 & 8) == 0 ? v : -1L), ((v5 & 16) == 0 ? v1 : -1L), ((v5 & 0x20) == 0 ? v2 : -1L), ((v5 & 0x40) == 0 ? v3 : -1), ((v5 & 0x80) == 0 ? long0 : null), ((v5 & 0x100) == 0 ? v4 : -1L));
    }

    @NotNull
    public final Path getCanonicalPath() {
        return this.a;
    }

    @NotNull
    public final List getChildren() {
        return this.j;
    }

    @NotNull
    public final String getComment() {
        return this.c;
    }

    public final long getCompressedSize() {
        return this.e;
    }

    public final int getCompressionMethod() {
        return this.g;
    }

    public final long getCrc() {
        return this.d;
    }

    @Nullable
    public final Long getLastModifiedAtMillis() {
        return this.h;
    }

    public final long getOffset() {
        return this.i;
    }

    public final long getSize() {
        return this.f;
    }

    public final boolean isDirectory() {
        return this.b;
    }
}

