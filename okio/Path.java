package okio;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.internal.-Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\b\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001<B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0006H\u0087\u0002\u00A2\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0002H\u0087\u0002\u00A2\u0006\u0004\b\b\u0010\u000BJ\u0018\u0010\n\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0000H\u0087\u0002\u00A2\u0006\u0004\b\b\u0010\fJ\u001F\u0010\b\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\r\u00A2\u0006\u0004\b\b\u0010\u000FJ\u001F\u0010\b\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\r\u00A2\u0006\u0004\b\b\u0010\u0010J\u001F\u0010\b\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\u000E\u001A\u00020\r\u00A2\u0006\u0004\b\b\u0010\u0011J\u0015\u0010\u0013\u001A\u00020\u00002\u0006\u0010\u0012\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001A\u00020\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001A\u001A\u00020\u0019\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0018\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u0012\u001A\u00020\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010 \u001A\u00020\r2\b\u0010\u0012\u001A\u0004\u0018\u00010\u001FH\u0096\u0002\u00A2\u0006\u0004\b \u0010!J\u000F\u0010\"\u001A\u00020\u001CH\u0016\u00A2\u0006\u0004\b\"\u0010#J\u000F\u0010$\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b$\u0010%R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u0013\u0010+\u001A\u0004\u0018\u00010\u00008F\u00A2\u0006\u0006\u001A\u0004\b*\u0010\u0015R\u0017\u0010/\u001A\b\u0012\u0004\u0012\u00020\u00060,8F\u00A2\u0006\u0006\u001A\u0004\b-\u0010.R\u0017\u00101\u001A\b\u0012\u0004\u0012\u00020\u00020,8F\u00A2\u0006\u0006\u001A\u0004\b0\u0010.R\u0011\u00102\u001A\u00020\r8F\u00A2\u0006\u0006\u001A\u0004\b2\u00103R\u0011\u00104\u001A\u00020\r8F\u00A2\u0006\u0006\u001A\u0004\b4\u00103R\u0013\u00106\u001A\u0004\u0018\u0001058G\u00A2\u0006\u0006\u001A\u0004\b6\u00107R\u0011\u00108\u001A\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b8\u0010)R\u0011\u00109\u001A\u00020\u00068G\u00A2\u0006\u0006\u001A\u0004\b9\u0010%R\u0013\u0010:\u001A\u0004\u0018\u00010\u00008G\u00A2\u0006\u0006\u001A\u0004\b:\u0010\u0015R\u0011\u0010;\u001A\u00020\r8F\u00A2\u0006\u0006\u001A\u0004\b;\u00103\u00A8\u0006="}, d2 = {"Lokio/Path;", "", "Lokio/ByteString;", "bytes", "<init>", "(Lokio/ByteString;)V", "", "child", "resolve", "(Ljava/lang/String;)Lokio/Path;", "div", "(Lokio/ByteString;)Lokio/Path;", "(Lokio/Path;)Lokio/Path;", "", "normalize", "(Ljava/lang/String;Z)Lokio/Path;", "(Lokio/ByteString;Z)Lokio/Path;", "(Lokio/Path;Z)Lokio/Path;", "other", "relativeTo", "normalized", "()Lokio/Path;", "Ljava/io/File;", "toFile", "()Ljava/io/File;", "Ljava/nio/file/Path;", "toNioPath", "()Ljava/nio/file/Path;", "", "compareTo", "(Lokio/Path;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lokio/ByteString;", "getBytes$okio", "()Lokio/ByteString;", "getRoot", "root", "", "getSegments", "()Ljava/util/List;", "segments", "getSegmentsBytes", "segmentsBytes", "isAbsolute", "()Z", "isRelative", "", "volumeLetter", "()Ljava/lang/Character;", "nameBytes", "name", "parent", "isRoot", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n45#2,3:133\n53#2,28:136\n59#2,22:168\n112#2:190\n117#2:191\n122#2,6:192\n139#2,5:198\n149#2:203\n154#2,25:204\n194#2:229\n199#2,11:230\n204#2,6:241\n199#2,11:247\n204#2,6:258\n228#2,36:264\n268#2:300\n282#2:301\n287#2:302\n292#2:303\n297#2:304\n1549#3:164\n1620#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,36\n97#1:300\n104#1:301\n106#1:302\n108#1:303\n110#1:304\n47#1:164\n47#1:165,3\n*E\n"})
public final class Path implements Comparable {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\b\u001A\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\u000B\u001A\u00020\u0005*\u00020\t2\b\b\u0002\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\nJ\u001D\u0010\u000B\u001A\u00020\u0005*\u00020\f2\b\b\u0002\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\rR\u0014\u0010\u000E\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lokio/Path$Companion;", "", "", "", "normalize", "Lokio/Path;", "get", "(Ljava/lang/String;Z)Lokio/Path;", "toPath", "Ljava/io/File;", "(Ljava/io/File;Z)Lokio/Path;", "toOkioPath", "Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Z)Lokio/Path;", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmName(name = "get")
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final Path get(@NotNull File file0) {
            Intrinsics.checkNotNullParameter(file0, "<this>");
            return Companion.get$default(this, file0, false, 1, null);
        }

        @JvmName(name = "get")
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final Path get(@NotNull File file0, boolean z) {
            Intrinsics.checkNotNullParameter(file0, "<this>");
            String s = file0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
            return this.get(s, z);
        }

        @JvmName(name = "get")
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final Path get(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<this>");
            return Companion.get$default(this, s, false, 1, null);
        }

        @JvmName(name = "get")
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final Path get(@NotNull String s, boolean z) {
            Intrinsics.checkNotNullParameter(s, "<this>");
            return -Path.commonToPath(s, z);
        }

        @JvmName(name = "get")
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final Path get(@NotNull java.nio.file.Path path0) {
            Intrinsics.checkNotNullParameter(path0, "<this>");
            return Companion.get$default(this, path0, false, 1, null);
        }

        @JvmName(name = "get")
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final Path get(@NotNull java.nio.file.Path path0, boolean z) {
            Intrinsics.checkNotNullParameter(path0, "<this>");
            return this.get(path0.toString(), z);
        }

        public static Path get$default(Companion path$Companion0, File file0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = false;
            }
            return path$Companion0.get(file0, z);
        }

        public static Path get$default(Companion path$Companion0, String s, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = false;
            }
            return path$Companion0.get(s, z);
        }

        public static Path get$default(Companion path$Companion0, java.nio.file.Path path0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = false;
            }
            return path$Companion0.get(path0, z);
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final String DIRECTORY_SEPARATOR;
    public final ByteString a;

    static {
        Path.Companion = new Companion(null);
        Intrinsics.checkNotNullExpressionValue("/", "separator");
        Path.DIRECTORY_SEPARATOR = "/";
    }

    public Path(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "bytes");
        super();
        this.a = byteString0;
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((Path)object0));
    }

    public int compareTo(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "other");
        return this.getBytes$okio().compareTo(path0.getBytes$okio());
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof Path && Intrinsics.areEqual(((Path)object0).getBytes$okio(), this.getBytes$okio());
    }

    @JvmName(name = "get")
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final Path get(@NotNull File file0) {
        return Path.Companion.get(file0);
    }

    @JvmName(name = "get")
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final Path get(@NotNull File file0, boolean z) {
        return Path.Companion.get(file0, z);
    }

    @JvmName(name = "get")
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final Path get(@NotNull String s) {
        return Path.Companion.get(s);
    }

    @JvmName(name = "get")
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final Path get(@NotNull String s, boolean z) {
        return Path.Companion.get(s, z);
    }

    @JvmName(name = "get")
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final Path get(@NotNull java.nio.file.Path path0) {
        return Path.Companion.get(path0);
    }

    @JvmName(name = "get")
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final Path get(@NotNull java.nio.file.Path path0, boolean z) {
        return Path.Companion.get(path0, z);
    }

    @NotNull
    public final ByteString getBytes$okio() {
        return this.a;
    }

    @Nullable
    public final Path getRoot() {
        int v = -Path.access$rootLength(this);
        return v == -1 ? null : new Path(this.getBytes$okio().substring(0, v));
    }

    @NotNull
    public final List getSegments() {
        ArrayList arrayList0 = new ArrayList();
        int v = -Path.access$rootLength(this);
        if(v == -1) {
            v = 0;
        }
        else if(v < this.getBytes$okio().size() && this.getBytes$okio().getByte(v) == 92) {
            ++v;
        }
        int v1 = this.getBytes$okio().size();
        int v2 = v;
        while(v < v1) {
            switch(this.getBytes$okio().getByte(v)) {
                case 0x2F: 
                case 92: {
                    arrayList0.add(this.getBytes$okio().substring(v2, v));
                    v2 = v + 1;
                }
            }
            ++v;
        }
        if(v2 < this.getBytes$okio().size()) {
            arrayList0.add(this.getBytes$okio().substring(v2, this.getBytes$okio().size()));
        }
        List list0 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
        for(Object object0: arrayList0) {
            list0.add(((ByteString)object0).utf8());
        }
        return list0;
    }

    @NotNull
    public final List getSegmentsBytes() {
        List list0 = new ArrayList();
        int v = -Path.access$rootLength(this);
        if(v == -1) {
            v = 0;
        }
        else if(v < this.getBytes$okio().size() && this.getBytes$okio().getByte(v) == 92) {
            ++v;
        }
        int v1 = this.getBytes$okio().size();
        int v2 = v;
        while(v < v1) {
            switch(this.getBytes$okio().getByte(v)) {
                case 0x2F: 
                case 92: {
                    list0.add(this.getBytes$okio().substring(v2, v));
                    v2 = v + 1;
                }
            }
            ++v;
        }
        if(v2 < this.getBytes$okio().size()) {
            list0.add(this.getBytes$okio().substring(v2, this.getBytes$okio().size()));
        }
        return list0;
    }

    @Override
    public int hashCode() {
        return this.getBytes$okio().hashCode();
    }

    public final boolean isAbsolute() {
        return -Path.access$rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return -Path.access$rootLength(this) == -1;
    }

    public final boolean isRoot() {
        return -Path.access$rootLength(this) == this.getBytes$okio().size();
    }

    @JvmName(name = "name")
    @NotNull
    public final String name() {
        return this.nameBytes().utf8();
    }

    @JvmName(name = "nameBytes")
    @NotNull
    public final ByteString nameBytes() {
        int v = -Path.access$getIndexOfLastSlash(this);
        if(v != -1) {
            return ByteString.substring$default(this.getBytes$okio(), v + 1, 0, 2, null);
        }
        return this.volumeLetter() == null || this.getBytes$okio().size() != 2 ? this.getBytes$okio() : ByteString.EMPTY;
    }

    @NotNull
    public final Path normalized() {
        return Path.Companion.get(this.toString(), true);
    }

    @JvmName(name = "parent")
    @Nullable
    public final Path parent() {
        if(!Intrinsics.areEqual(this.getBytes$okio(), -Path.access$getDOT$p()) && !Intrinsics.areEqual(this.getBytes$okio(), -Path.access$getSLASH$p()) && !Intrinsics.areEqual(this.getBytes$okio(), -Path.access$getBACKSLASH$p()) && !-Path.access$lastSegmentIsDotDot(this)) {
            int v = -Path.access$getIndexOfLastSlash(this);
            if(v == 2 && this.volumeLetter() != null) {
                return this.getBytes$okio().size() == 3 ? null : new Path(ByteString.substring$default(this.getBytes$okio(), 0, 3, 1, null));
            }
            if(v != 1 || !this.getBytes$okio().startsWith(-Path.access$getBACKSLASH$p())) {
                if(v == -1 && this.volumeLetter() != null) {
                    return this.getBytes$okio().size() == 2 ? null : new Path(ByteString.substring$default(this.getBytes$okio(), 0, 2, 1, null));
                }
                if(v == -1) {
                    return new Path(-Path.access$getDOT$p());
                }
                return v == 0 ? new Path(ByteString.substring$default(this.getBytes$okio(), 0, 1, 1, null)) : new Path(ByteString.substring$default(this.getBytes$okio(), 0, v, 1, null));
            }
        }
        return null;
    }

    @NotNull
    public final Path relativeTo(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "other");
        if(!Intrinsics.areEqual(this.getRoot(), path0.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + path0).toString());
        }
        List list0 = this.getSegmentsBytes();
        List list1 = path0.getSegmentsBytes();
        int v = Math.min(list0.size(), list1.size());
        int v1;
        for(v1 = 0; v1 < v && Intrinsics.areEqual(list0.get(v1), list1.get(v1)); ++v1) {
        }
        if(v1 == v && this.getBytes$okio().size() == path0.getBytes$okio().size()) {
            return Companion.get$default(Path.Companion, ".", false, 1, null);
        }
        if(list1.subList(v1, list1.size()).indexOf(-Path.access$getDOT_DOT$p()) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + path0).toString());
        }
        Buffer buffer0 = new Buffer();
        ByteString byteString0 = -Path.access$getSlash(path0);
        if(byteString0 == null) {
            byteString0 = -Path.access$getSlash(this);
            if(byteString0 == null) {
                byteString0 = -Path.access$toSlash("/");
            }
        }
        int v2 = list1.size();
        for(int v3 = v1; v3 < v2; ++v3) {
            buffer0.write(-Path.access$getDOT_DOT$p());
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

    @JvmName(name = "resolve")
    @NotNull
    public final Path resolve(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "child");
        return -Path.commonResolve(this, -Path.toPath(new Buffer().writeUtf8(s), false), false);
    }

    @NotNull
    public final Path resolve(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "child");
        return -Path.commonResolve(this, -Path.toPath(new Buffer().writeUtf8(s), false), z);
    }

    @JvmName(name = "resolve")
    @NotNull
    public final Path resolve(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "child");
        return -Path.commonResolve(this, -Path.toPath(new Buffer().write(byteString0), false), false);
    }

    @NotNull
    public final Path resolve(@NotNull ByteString byteString0, boolean z) {
        Intrinsics.checkNotNullParameter(byteString0, "child");
        return -Path.commonResolve(this, -Path.toPath(new Buffer().write(byteString0), false), z);
    }

    @JvmName(name = "resolve")
    @NotNull
    public final Path resolve(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "child");
        return -Path.commonResolve(this, path0, false);
    }

    @NotNull
    public final Path resolve(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "child");
        return -Path.commonResolve(this, path0, z);
    }

    public static Path resolve$default(Path path0, String s, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return path0.resolve(s, z);
    }

    public static Path resolve$default(Path path0, ByteString byteString0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return path0.resolve(byteString0, z);
    }

    public static Path resolve$default(Path path0, Path path1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return path0.resolve(path1, z);
    }

    @NotNull
    public final File toFile() {
        return new File(this.toString());
    }

    @NotNull
    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path0 = Paths.get(this.toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path0, "get(...)");
        return path0;
    }

    @Override
    @NotNull
    public String toString() {
        return this.getBytes$okio().utf8();
    }

    @JvmName(name = "volumeLetter")
    @Nullable
    public final Character volumeLetter() {
        if(ByteString.indexOf$default(this.getBytes$okio(), -Path.access$getSLASH$p(), 0, 2, null) == -1 && this.getBytes$okio().size() >= 2 && this.getBytes$okio().getByte(1) == 58) {
            int v = (char)this.getBytes$okio().getByte(0);
            return (97 > v || v >= 0x7B) && (65 > v || v >= 91) ? null : Character.valueOf(((char)v));
        }
        return null;
    }
}

