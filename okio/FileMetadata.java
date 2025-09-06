package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0019\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u000E\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f\u00A2\u0006\u0004\b\u000F\u0010\u0010J)\u0010\u0013\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00012\u000E\u0010\u0012\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r\u00A2\u0006\u0004\b\u0013\u0010\u0014Jw\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\u000E\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u0003\u0010\u001CR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001D\u0010\u001B\u001A\u0004\b\u0004\u0010\u001CR\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00078\u0006\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u0019\u0010\t\u001A\u0004\u0018\u00010\u00078\u0006\u00A2\u0006\f\n\u0004\b&\u0010#\u001A\u0004\b\'\u0010%R\u0019\u0010\n\u001A\u0004\u0018\u00010\u00078\u0006\u00A2\u0006\f\n\u0004\b(\u0010#\u001A\u0004\b)\u0010%R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\u00078\u0006\u00A2\u0006\f\n\u0004\b*\u0010#\u001A\u0004\b+\u0010%R\'\u0010\u000E\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f8\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/\u00A8\u00060"}, d2 = {"Lokio/FileMetadata;", "", "", "isRegularFile", "isDirectory", "Lokio/Path;", "symlinkTarget", "", "size", "createdAtMillis", "lastModifiedAtMillis", "lastAccessedAtMillis", "", "Lkotlin/reflect/KClass;", "extras", "<init>", "(ZZLokio/Path;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V", "T", "type", "extra", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "copy", "(ZZLokio/Path;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)Lokio/FileMetadata;", "", "toString", "()Ljava/lang/String;", "a", "Z", "()Z", "b", "c", "Lokio/Path;", "getSymlinkTarget", "()Lokio/Path;", "d", "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "e", "getCreatedAtMillis", "f", "getLastModifiedAtMillis", "g", "getLastAccessedAtMillis", "h", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FileMetadata {
    public final boolean a;
    public final boolean b;
    public final Path c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map h;

    public FileMetadata() {
        this(false, false, null, null, null, null, null, null, 0xFF, null);
    }

    public FileMetadata(boolean z, boolean z1, @Nullable Path path0, @Nullable Long long0, @Nullable Long long1, @Nullable Long long2, @Nullable Long long3, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "extras");
        super();
        this.a = z;
        this.b = z1;
        this.c = path0;
        this.d = long0;
        this.e = long1;
        this.f = long2;
        this.g = long3;
        this.h = x.toMap(map0);
    }

    public FileMetadata(boolean z, boolean z1, Path path0, Long long0, Long long1, Long long2, Long long3, Map map0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? z1 : false), ((v & 4) == 0 ? path0 : null), ((v & 8) == 0 ? long0 : null), ((v & 16) == 0 ? long1 : null), ((v & 0x20) == 0 ? long2 : null), ((v & 0x40) == 0 ? long3 : null), ((v & 0x80) == 0 ? map0 : x.emptyMap()));
    }

    @NotNull
    public final FileMetadata copy(boolean z, boolean z1, @Nullable Path path0, @Nullable Long long0, @Nullable Long long1, @Nullable Long long2, @Nullable Long long3, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "extras");
        return new FileMetadata(z, z1, path0, long0, long1, long2, long3, map0);
    }

    public static FileMetadata copy$default(FileMetadata fileMetadata0, boolean z, boolean z1, Path path0, Long long0, Long long1, Long long2, Long long3, Map map0, int v, Object object0) {
        boolean z2 = (v & 1) == 0 ? z : fileMetadata0.a;
        boolean z3 = (v & 2) == 0 ? z1 : fileMetadata0.b;
        Path path1 = (v & 4) == 0 ? path0 : fileMetadata0.c;
        Long long4 = (v & 8) == 0 ? long0 : fileMetadata0.d;
        Long long5 = (v & 16) == 0 ? long1 : fileMetadata0.e;
        Long long6 = (v & 0x20) == 0 ? long2 : fileMetadata0.f;
        Long long7 = (v & 0x40) == 0 ? long3 : fileMetadata0.g;
        return (v & 0x80) == 0 ? fileMetadata0.copy(z2, z3, path1, long4, long5, long6, long7, map0) : fileMetadata0.copy(z2, z3, path1, long4, long5, long6, long7, fileMetadata0.h);
    }

    @Nullable
    public final Object extra(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "type");
        Object object0 = this.h.get(kClass0);
        return object0 == null ? null : KClasses.cast(kClass0, object0);
    }

    @Nullable
    public final Long getCreatedAtMillis() {
        return this.e;
    }

    @NotNull
    public final Map getExtras() {
        return this.h;
    }

    @Nullable
    public final Long getLastAccessedAtMillis() {
        return this.g;
    }

    @Nullable
    public final Long getLastModifiedAtMillis() {
        return this.f;
    }

    @Nullable
    public final Long getSize() {
        return this.d;
    }

    @Nullable
    public final Path getSymlinkTarget() {
        return this.c;
    }

    public final boolean isDirectory() {
        return this.b;
    }

    public final boolean isRegularFile() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        ArrayList arrayList0 = new ArrayList();
        if(this.a) {
            arrayList0.add("isRegularFile");
        }
        if(this.b) {
            arrayList0.add("isDirectory");
        }
        Long long0 = this.d;
        if(long0 != null) {
            arrayList0.add("byteCount=" + long0);
        }
        Long long1 = this.e;
        if(long1 != null) {
            arrayList0.add("createdAt=" + long1);
        }
        Long long2 = this.f;
        if(long2 != null) {
            arrayList0.add("lastModifiedAt=" + long2);
        }
        Long long3 = this.g;
        if(long3 != null) {
            arrayList0.add("lastAccessedAt=" + long3);
        }
        Map map0 = this.h;
        if(!map0.isEmpty()) {
            arrayList0.add("extras=" + map0);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList0, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }
}

