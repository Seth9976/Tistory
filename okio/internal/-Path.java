package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;
import okio.Path.Companion;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u001A\u0016\u0010\u0001\u001A\u0004\u0018\u00010\u0000*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0001\u0010\u0002\u001A\u001A\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0005\u0010\u0006\u001A\u001A\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0003*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\b\u0010\u0006\u001A\u0014\u0010\n\u001A\u00020\t*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\n\u0010\u000B\u001A\u0014\u0010\f\u001A\u00020\t*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\f\u0010\u000B\u001A\u0016\u0010\u000E\u001A\u0004\u0018\u00010\r*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001A\u0014\u0010\u0010\u001A\u00020\u0007*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001A\u0014\u0010\u0012\u001A\u00020\u0004*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001A\u0016\u0010\u0014\u001A\u0004\u0018\u00010\u0000*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0014\u0010\u0002\u001A\u0014\u0010\u0015\u001A\u00020\t*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0015\u0010\u000B\u001A$\u0010\u0018\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\tH\u0080\b\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A$\u0010\u0018\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u00072\u0006\u0010\u0017\u001A\u00020\tH\u0080\b\u00A2\u0006\u0004\b\u0018\u0010\u001A\u001A$\u0010\u0018\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u001B2\u0006\u0010\u0017\u001A\u00020\tH\u0080\b\u00A2\u0006\u0004\b\u0018\u0010\u001C\u001A#\u0010\u0018\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\tH\u0000\u00A2\u0006\u0004\b\u0018\u0010\u001D\u001A\u001C\u0010\u001F\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u001F\u0010 \u001A\u0014\u0010!\u001A\u00020\u0000*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b!\u0010\u0002\u001A\u001C\u0010#\u001A\u00020\"*\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b#\u0010$\u001A\u001E\u0010&\u001A\u00020\t*\u00020\u00002\b\u0010\u001E\u001A\u0004\u0018\u00010%H\u0080\b\u00A2\u0006\u0004\b&\u0010\'\u001A\u0014\u0010(\u001A\u00020\"*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b(\u0010)\u001A\u0014\u0010*\u001A\u00020\u0004*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b*\u0010\u0013\u001A\u001B\u0010+\u001A\u00020\u0000*\u00020\u00042\u0006\u0010\u0017\u001A\u00020\tH\u0000\u00A2\u0006\u0004\b+\u0010,\u001A\u001B\u0010-\u001A\u00020\u0000*\u00020\u001B2\u0006\u0010\u0017\u001A\u00020\tH\u0000\u00A2\u0006\u0004\b-\u0010.\u00A8\u0006/"}, d2 = {"Lokio/Path;", "commonRoot", "(Lokio/Path;)Lokio/Path;", "", "", "commonSegments", "(Lokio/Path;)Ljava/util/List;", "Lokio/ByteString;", "commonSegmentsBytes", "", "commonIsAbsolute", "(Lokio/Path;)Z", "commonIsRelative", "", "commonVolumeLetter", "(Lokio/Path;)Ljava/lang/Character;", "commonNameBytes", "(Lokio/Path;)Lokio/ByteString;", "commonName", "(Lokio/Path;)Ljava/lang/String;", "commonParent", "commonIsRoot", "child", "normalize", "commonResolve", "(Lokio/Path;Ljava/lang/String;Z)Lokio/Path;", "(Lokio/Path;Lokio/ByteString;Z)Lokio/Path;", "Lokio/Buffer;", "(Lokio/Path;Lokio/Buffer;Z)Lokio/Path;", "(Lokio/Path;Lokio/Path;Z)Lokio/Path;", "other", "commonRelativeTo", "(Lokio/Path;Lokio/Path;)Lokio/Path;", "commonNormalized", "", "commonCompareTo", "(Lokio/Path;Lokio/Path;)I", "", "commonEquals", "(Lokio/Path;Ljava/lang/Object;)Z", "commonHashCode", "(Lokio/Path;)I", "commonToString", "commonToPath", "(Ljava/lang/String;Z)Lokio/Path;", "toPath", "(Lokio/Buffer;Z)Lokio/Path;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-Path")
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/internal/-Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n59#1,22:407\n209#1:433\n209#1:434\n1549#2:429\n1620#2,3:430\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/internal/-Path\n*L\n53#1:407,22\n199#1:433\n204#1:434\n53#1:429\n53#1:430,3\n*E\n"})
public final class -Path {
    public static final ByteString a;
    public static final ByteString b;
    public static final ByteString c;
    public static final ByteString d;
    public static final ByteString e;

    static {
        -Path.a = ByteString.Companion.encodeUtf8("/");
        -Path.b = ByteString.Companion.encodeUtf8("\\");
        -Path.c = ByteString.Companion.encodeUtf8("/\\");
        -Path.d = ByteString.Companion.encodeUtf8(".");
        -Path.e = ByteString.Companion.encodeUtf8("..");
    }

    public static final ByteString a(Path path0) {
        ByteString byteString0 = -Path.a;
        if(ByteString.indexOf$default(path0.getBytes$okio(), byteString0, 0, 2, null) == -1) {
            return ByteString.indexOf$default(path0.getBytes$okio(), -Path.b, 0, 2, null) == -1 ? null : -Path.b;
        }
        return byteString0;
    }

    public static final int access$getIndexOfLastSlash(Path path0) {
        int v = ByteString.lastIndexOf$default(path0.getBytes$okio(), -Path.a, 0, 2, null);
        return v == -1 ? ByteString.lastIndexOf$default(path0.getBytes$okio(), -Path.b, 0, 2, null) : v;
    }

    public static final boolean access$lastSegmentIsDotDot(Path path0) {
        if(path0.getBytes$okio().endsWith(-Path.e)) {
            return path0.getBytes$okio().size() == 2 ? true : path0.getBytes$okio().rangeEquals(path0.getBytes$okio().size() - 3, -Path.a, 0, 1) || path0.getBytes$okio().rangeEquals(path0.getBytes$okio().size() - 3, -Path.b, 0, 1);
        }
        return false;
    }

    public static final int access$rootLength(Path path0) {
        if(path0.getBytes$okio().size() != 0) {
            if(path0.getBytes$okio().getByte(0) == 0x2F) {
                return 1;
            }
            if(path0.getBytes$okio().getByte(0) == 92) {
                if(path0.getBytes$okio().size() <= 2 || path0.getBytes$okio().getByte(1) != 92) {
                    return 1;
                }
                int v = path0.getBytes$okio().indexOf(-Path.b, 2);
                return v == -1 ? path0.getBytes$okio().size() : v;
            }
            if(path0.getBytes$okio().size() > 2 && path0.getBytes$okio().getByte(1) == 58 && path0.getBytes$okio().getByte(2) == 92) {
                int v1 = (char)path0.getBytes$okio().getByte(0);
                return (97 > v1 || v1 >= 0x7B) && (65 > v1 || v1 >= 91) ? -1 : 3;
            }
        }
        return -1;
    }

    public static final ByteString b(byte b) {
        switch(b) {
            case 0x2F: {
                return -Path.a;
            }
            case 92: {
                return -Path.b;
            }
            default: {
                throw new IllegalArgumentException("not a directory separator: " + ((int)b));
            }
        }
    }

    public static final ByteString c(String s) {
        if(Intrinsics.areEqual(s, "/")) {
            return -Path.a;
        }
        if(!Intrinsics.areEqual(s, "\\")) {
            throw new IllegalArgumentException("not a directory separator: " + s);
        }
        return -Path.b;
    }

    public static final int commonCompareTo(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(path1, "other");
        return path0.getBytes$okio().compareTo(path1.getBytes$okio());
    }

    public static final boolean commonEquals(@NotNull Path path0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        return object0 instanceof Path && Intrinsics.areEqual(((Path)object0).getBytes$okio(), path0.getBytes$okio());
    }

    public static final int commonHashCode(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        return path0.getBytes$okio().hashCode();
    }

    public static final boolean commonIsAbsolute(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        return -Path.access$rootLength(path0) != -1;
    }

    public static final boolean commonIsRelative(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        return -Path.access$rootLength(path0) == -1;
    }

    public static final boolean commonIsRoot(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        return -Path.access$rootLength(path0) == path0.getBytes$okio().size();
    }

    @NotNull
    public static final String commonName(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        return path0.nameBytes().utf8();
    }

    @NotNull
    public static final ByteString commonNameBytes(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        int v = -Path.access$getIndexOfLastSlash(path0);
        if(v != -1) {
            return ByteString.substring$default(path0.getBytes$okio(), v + 1, 0, 2, null);
        }
        return path0.volumeLetter() == null || path0.getBytes$okio().size() != 2 ? path0.getBytes$okio() : ByteString.EMPTY;
    }

    @NotNull
    public static final Path commonNormalized(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        return Path.Companion.get(path0.toString(), true);
    }

    @Nullable
    public static final Path commonParent(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        if(!Intrinsics.areEqual(path0.getBytes$okio(), -Path.d) && !Intrinsics.areEqual(path0.getBytes$okio(), -Path.a) && !Intrinsics.areEqual(path0.getBytes$okio(), -Path.b) && !-Path.access$lastSegmentIsDotDot(path0)) {
            int v = -Path.access$getIndexOfLastSlash(path0);
            if(v == 2 && path0.volumeLetter() != null) {
                return path0.getBytes$okio().size() == 3 ? null : new Path(ByteString.substring$default(path0.getBytes$okio(), 0, 3, 1, null));
            }
            if(v == 1 && path0.getBytes$okio().startsWith(-Path.b)) {
                return null;
            }
            if(v == -1 && path0.volumeLetter() != null) {
                return path0.getBytes$okio().size() == 2 ? null : new Path(ByteString.substring$default(path0.getBytes$okio(), 0, 2, 1, null));
            }
            if(v == -1) {
                return new Path(-Path.d);
            }
            return v == 0 ? new Path(ByteString.substring$default(path0.getBytes$okio(), 0, 1, 1, null)) : new Path(ByteString.substring$default(path0.getBytes$okio(), 0, v, 1, null));
        }
        return null;
    }

    @NotNull
    public static final Path commonRelativeTo(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(path1, "other");
        if(!Intrinsics.areEqual(path0.getRoot(), path1.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + path0 + " and " + path1).toString());
        }
        List list0 = path0.getSegmentsBytes();
        List list1 = path1.getSegmentsBytes();
        int v = Math.min(list0.size(), list1.size());
        int v1;
        for(v1 = 0; v1 < v && Intrinsics.areEqual(list0.get(v1), list1.get(v1)); ++v1) {
        }
        if(v1 == v && path0.getBytes$okio().size() == path1.getBytes$okio().size()) {
            return Companion.get$default(Path.Companion, ".", false, 1, null);
        }
        if(list1.subList(v1, list1.size()).indexOf(-Path.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + path0 + " and " + path1).toString());
        }
        Buffer buffer0 = new Buffer();
        ByteString byteString0 = -Path.a(path1);
        if(byteString0 == null) {
            byteString0 = -Path.a(path0);
            if(byteString0 == null) {
                byteString0 = -Path.c("/");
            }
        }
        int v2 = list1.size();
        for(int v3 = v1; v3 < v2; ++v3) {
            buffer0.write(-Path.e);
            buffer0.write(byteString0);
        }
        int v4 = list0.size();
        while(v1 < v4) {
            buffer0.write(((ByteString)list0.get(v1)));
            buffer0.write(byteString0);
            ++v1;
        }
        return -Path.toPath(buffer0, false);
    }

    @NotNull
    public static final Path commonResolve(@NotNull Path path0, @NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(s, "child");
        return -Path.commonResolve(path0, -Path.toPath(new Buffer().writeUtf8(s), false), z);
    }

    @NotNull
    public static final Path commonResolve(@NotNull Path path0, @NotNull Buffer buffer0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(buffer0, "child");
        return -Path.commonResolve(path0, -Path.toPath(buffer0, false), z);
    }

    @NotNull
    public static final Path commonResolve(@NotNull Path path0, @NotNull ByteString byteString0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(byteString0, "child");
        return -Path.commonResolve(path0, -Path.toPath(new Buffer().write(byteString0), false), z);
    }

    @NotNull
    public static final Path commonResolve(@NotNull Path path0, @NotNull Path path1, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(path1, "child");
        if(!path1.isAbsolute() && path1.volumeLetter() == null) {
            ByteString byteString0 = -Path.a(path0);
            if(byteString0 == null) {
                byteString0 = -Path.a(path1);
                if(byteString0 == null) {
                    byteString0 = -Path.c("/");
                }
            }
            Buffer buffer0 = new Buffer();
            buffer0.write(path0.getBytes$okio());
            if(buffer0.size() > 0L) {
                buffer0.write(byteString0);
            }
            buffer0.write(path1.getBytes$okio());
            return -Path.toPath(buffer0, z);
        }
        return path1;
    }

    @Nullable
    public static final Path commonRoot(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        int v = -Path.access$rootLength(path0);
        return v == -1 ? null : new Path(path0.getBytes$okio().substring(0, v));
    }

    @NotNull
    public static final List commonSegments(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        ArrayList arrayList0 = new ArrayList();
        int v = -Path.access$rootLength(path0);
        if(v == -1) {
            v = 0;
        }
        else if(v < path0.getBytes$okio().size() && path0.getBytes$okio().getByte(v) == 92) {
            ++v;
        }
        int v1 = path0.getBytes$okio().size();
        int v2 = v;
        while(v < v1) {
            switch(path0.getBytes$okio().getByte(v)) {
                case 0x2F: 
                case 92: {
                    arrayList0.add(path0.getBytes$okio().substring(v2, v));
                    v2 = v + 1;
                }
            }
            ++v;
        }
        if(v2 < path0.getBytes$okio().size()) {
            arrayList0.add(path0.getBytes$okio().substring(v2, path0.getBytes$okio().size()));
        }
        List list0 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
        for(Object object0: arrayList0) {
            list0.add(((ByteString)object0).utf8());
        }
        return list0;
    }

    @NotNull
    public static final List commonSegmentsBytes(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        List list0 = new ArrayList();
        int v = -Path.access$rootLength(path0);
        if(v == -1) {
            v = 0;
        }
        else if(v < path0.getBytes$okio().size() && path0.getBytes$okio().getByte(v) == 92) {
            ++v;
        }
        int v1 = path0.getBytes$okio().size();
        int v2 = v;
        while(v < v1) {
            switch(path0.getBytes$okio().getByte(v)) {
                case 0x2F: 
                case 92: {
                    list0.add(path0.getBytes$okio().substring(v2, v));
                    v2 = v + 1;
                }
            }
            ++v;
        }
        if(v2 < path0.getBytes$okio().size()) {
            list0.add(path0.getBytes$okio().substring(v2, path0.getBytes$okio().size()));
        }
        return list0;
    }

    @NotNull
    public static final Path commonToPath(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return -Path.toPath(new Buffer().writeUtf8(s), z);
    }

    @NotNull
    public static final String commonToString(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        return path0.getBytes$okio().utf8();
    }

    @Nullable
    public static final Character commonVolumeLetter(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        if(ByteString.indexOf$default(path0.getBytes$okio(), -Path.a, 0, 2, null) != -1) {
            return null;
        }
        if(path0.getBytes$okio().size() < 2) {
            return null;
        }
        if(path0.getBytes$okio().getByte(1) != 58) {
            return null;
        }
        int v = (char)path0.getBytes$okio().getByte(0);
        return (97 > v || v >= 0x7B) && (65 > v || v >= 91) ? null : Character.valueOf(((char)v));
    }

    @NotNull
    public static final Path toPath(@NotNull Buffer buffer0, boolean z) {
        ByteString byteString4;
        ByteString byteString3;
        ByteString byteString1;
        Intrinsics.checkNotNullParameter(buffer0, "<this>");
        Buffer buffer1 = new Buffer();
        ByteString byteString0 = null;
        int v1 = 0;
        while(true) {
            if(!buffer0.rangeEquals(0L, -Path.a)) {
                byteString1 = -Path.b;
                if(buffer0.rangeEquals(0L, byteString1)) {
                    goto label_8;
                }
                break;
            }
        label_8:
            int v2 = buffer0.readByte();
            if(byteString0 == null) {
                byteString0 = -Path.b(((byte)v2));
            }
            ++v1;
        }
        boolean z1 = v1 >= 2 && Intrinsics.areEqual(byteString0, byteString1);
        ByteString byteString2 = -Path.c;
        if(z1) {
            Intrinsics.checkNotNull(byteString0);
            buffer1.write(byteString0);
            buffer1.write(byteString0);
        }
        else if(v1 > 0) {
            Intrinsics.checkNotNull(byteString0);
            buffer1.write(byteString0);
        }
        else {
            long v3 = buffer0.indexOfElement(byteString2);
            if(byteString0 == null) {
                byteString0 = v3 == -1L ? -Path.c("/") : -Path.b(buffer0.getByte(v3));
            }
            if(Intrinsics.areEqual(byteString0, byteString1) && buffer0.size() >= 2L && buffer0.getByte(1L) == 58) {
                int v4 = (char)buffer0.getByte(0L);
                if(97 <= v4 && v4 < 0x7B || 65 <= v4 && v4 < 91) {
                    if(v3 == 2L) {
                        buffer1.write(buffer0, 3L);
                    }
                    else {
                        buffer1.write(buffer0, 2L);
                    }
                }
            }
        }
        boolean z2 = buffer1.size() > 0L;
        ArrayList arrayList0 = new ArrayList();
        while(true) {
            byteString3 = -Path.d;
            if(buffer0.exhausted()) {
                break;
            }
            long v5 = buffer0.indexOfElement(byteString2);
            if(v5 == -1L) {
                byteString4 = buffer0.readByteString();
            }
            else {
                byteString4 = buffer0.readByteString(v5);
                buffer0.readByte();
            }
            ByteString byteString5 = -Path.e;
            if(Intrinsics.areEqual(byteString4, byteString5)) {
                if(z2 && arrayList0.isEmpty()) {
                    continue;
                }
                if(z && (z2 || !arrayList0.isEmpty() && !Intrinsics.areEqual(CollectionsKt___CollectionsKt.last(arrayList0), byteString5))) {
                    if(z1 && arrayList0.size() == 1) {
                        continue;
                    }
                    o.removeLastOrNull(arrayList0);
                }
                else {
                    arrayList0.add(byteString4);
                }
            }
            else if(!Intrinsics.areEqual(byteString4, byteString3) && !Intrinsics.areEqual(byteString4, ByteString.EMPTY)) {
                arrayList0.add(byteString4);
            }
        }
        int v6 = arrayList0.size();
        for(int v = 0; v < v6; ++v) {
            if(v > 0) {
                buffer1.write(byteString0);
            }
            buffer1.write(((ByteString)arrayList0.get(v)));
        }
        if(buffer1.size() == 0L) {
            buffer1.write(byteString3);
        }
        return new Path(buffer1.readByteString());
    }
}

