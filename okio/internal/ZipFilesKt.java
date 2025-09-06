package okio.internal;

import androidx.emoji2.text.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import okio.BufferedSource;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path.Companion;
import okio.Path;
import okio.ZipFileSystem;
import org.jetbrains.annotations.NotNull;
import wg.e;
import wg.f;
import wg.g;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001A5\u0010\t\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001A\u0013\u0010\f\u001A\u00020\u0005*\u00020\u000BH\u0000¢\u0006\u0004\b\f\u0010\r\u001A\u0013\u0010\u000F\u001A\u00020\u000E*\u00020\u000BH\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u001B\u0010\u0013\u001A\u00020\u0011*\u00020\u000B2\u0006\u0010\u0012\u001A\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001A\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001A\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokio/Path;", "zipPath", "Lokio/FileSystem;", "fileSystem", "Lkotlin/Function1;", "Lokio/internal/ZipEntry;", "", "predicate", "Lokio/ZipFileSystem;", "openZip", "(Lokio/Path;Lokio/FileSystem;Lkotlin/jvm/functions/Function1;)Lokio/ZipFileSystem;", "Lokio/BufferedSource;", "readEntry", "(Lokio/BufferedSource;)Lokio/internal/ZipEntry;", "", "skipLocalHeader", "(Lokio/BufferedSource;)V", "Lokio/FileMetadata;", "basicMetadata", "readLocalHeader", "(Lokio/BufferedSource;Lokio/FileMetadata;)Lokio/FileMetadata;", "", "COMPRESSION_METHOD_DEFLATED", "I", "COMPRESSION_METHOD_STORED", "okio"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1045#2:460\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n156#1:460\n*E\n"})
public final class ZipFilesKt {
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED;

    public static final Map a(ArrayList arrayList0) {
        ZipEntry zipEntry1;
        Path path0 = Companion.get$default(Path.Companion, "/", false, 1, null);
        Map map0 = x.mutableMapOf(new Pair[]{TuplesKt.to(path0, new ZipEntry(path0, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null))});
        Iterator iterator0 = CollectionsKt___CollectionsKt.sortedWith(arrayList0, new ZipFilesKt.buildIndex..inlined.sortedBy.1()).iterator();
    label_3:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ZipEntry zipEntry0 = (ZipEntry)object0;
            if(((ZipEntry)map0.put(zipEntry0.getCanonicalPath(), zipEntry0)) == null) {
                while(true) {
                    Path path1 = zipEntry0.getCanonicalPath().parent();
                    if(path1 == null) {
                        continue label_3;
                    }
                    zipEntry1 = (ZipEntry)map0.get(path1);
                    if(zipEntry1 != null) {
                        break;
                    }
                    ZipEntry zipEntry2 = new ZipEntry(path1, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                    map0.put(path1, zipEntry2);
                    zipEntry2.getChildren().add(zipEntry0.getCanonicalPath());
                    zipEntry0 = zipEntry2;
                }
                zipEntry1.getChildren().add(zipEntry0.getCanonicalPath());
            }
        }
        return map0;
    }

    public static final String b(int v) [...] // 潜在的解密器

    public static final void c(BufferedSource bufferedSource0, int v, Function2 function20) {
        for(long v1 = (long)v; v1 != 0L; v1 = v1 - 4L - v3) {
            if(v1 < 4L) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int v2 = bufferedSource0.readShortLe() & 0xFFFF;
            long v3 = ((long)bufferedSource0.readShortLe()) & 0xFFFFL;
            if(v1 - 4L < v3) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource0.require(v3);
            long v4 = bufferedSource0.getBuffer().size();
            function20.invoke(v2, v3);
            long v5 = bufferedSource0.getBuffer().size() + v3 - v4;
            int v6 = Long.compare(v5, 0L);
            if(v6 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + v2);
            }
            if(v6 > 0) {
                bufferedSource0.getBuffer().skip(v5);
            }
        }
    }

    public static final FileMetadata d(BufferedSource bufferedSource0, FileMetadata fileMetadata0) {
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        ref$ObjectRef0.element = fileMetadata0 == null ? null : fileMetadata0.getLastModifiedAtMillis();
        ObjectRef ref$ObjectRef1 = new ObjectRef();
        ObjectRef ref$ObjectRef2 = new ObjectRef();
        int v = bufferedSource0.readIntLe();
        if(v != 0x4034B50) {
            throw new IOException("bad zip: expected 0x4034b50 but was " + ZipFilesKt.b(v));
        }
        bufferedSource0.skip(2L);
        int v1 = bufferedSource0.readShortLe();
        if((v1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + ZipFilesKt.b(v1 & 0xFFFF));
        }
        bufferedSource0.skip(18L);
        long v2 = ((long)bufferedSource0.readShortLe()) & 0xFFFFL;
        int v3 = bufferedSource0.readShortLe();
        bufferedSource0.skip(v2);
        if(fileMetadata0 == null) {
            bufferedSource0.skip(((long)(v3 & 0xFFFF)));
            return null;
        }
        ZipFilesKt.c(bufferedSource0, v3 & 0xFFFF, new g(bufferedSource0, ref$ObjectRef0, ref$ObjectRef1, ref$ObjectRef2));
        return new FileMetadata(fileMetadata0.isRegularFile(), fileMetadata0.isDirectory(), null, fileMetadata0.getSize(), ((Long)ref$ObjectRef2.element), ((Long)ref$ObjectRef0.element), ((Long)ref$ObjectRef1.element), null, 0x80, null);
    }

    @NotNull
    public static final ZipFileSystem openZip(@NotNull Path path0, @NotNull FileSystem fileSystem0, @NotNull Function1 function10) throws IOException {
        ZipFileSystem zipFileSystem0;
        BufferedSource bufferedSource3;
        ArrayList arrayList0;
        BufferedSource bufferedSource2;
        BufferedSource bufferedSource1;
        String s;
        y y0;
        int v7;
        BufferedSource bufferedSource0;
        long v1;
        long v;
        Intrinsics.checkNotNullParameter(path0, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem0, "fileSystem");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        FileHandle fileHandle0 = fileSystem0.openReadOnly(path0);
        try {
            v = fileHandle0.size() - 22L;
            v1 = 0L;
            if(v < 0L) {
                throw new IOException("not a zip: size=" + fileHandle0.size());
            }
            long v2 = Math.max(v - 0x10000L, 0L);
            while(true) {
            label_9:
                bufferedSource0 = Okio.buffer(fileHandle0.source(v));
                break;
            }
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(fileHandle0, throwable0);
            throw throwable0;
        }
        try {
            if(bufferedSource0.readIntLe() == 101010256) {
                int v3 = bufferedSource0.readShortLe();
                int v4 = bufferedSource0.readShortLe();
                int v5 = bufferedSource0.readShortLe();
                if(Long.compare(v5 & 0xFFFF, bufferedSource0.readShortLe() & 0xFFFF) != 0 || (v3 & 0xFFFF) != 0 || (v4 & 0xFFFF) != 0) {
                    throw new IOException("unsupported zip: spanned");
                }
                bufferedSource0.skip(4L);
                long v6 = ((long)bufferedSource0.readIntLe()) & 0xFFFFFFFFL;
                v7 = bufferedSource0.readShortLe();
                y0 = new y(((long)(v5 & 0xFFFF)), v6, v7 & 0xFFFF);
                s = bufferedSource0.readUtf8(((long)(v7 & 0xFFFF)));
                goto label_25;
            }
            goto label_74;
        }
        catch(Throwable throwable1) {
            try {
                bufferedSource0.close();
                throw throwable1;
            label_25:
                bufferedSource0.close();
                if(Long.compare(v - 20L, 0L) > 0) {
                    bufferedSource1 = Okio.buffer(fileHandle0.source(v - 20L));
                    goto label_28;
                }
                goto label_55;
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(fileHandle0, throwable0);
                throw throwable0;
            }
        }
        try {
        label_28:
            if(bufferedSource1.readIntLe() == 0x7064B50) {
                int v8 = bufferedSource1.readIntLe();
                long v9 = bufferedSource1.readLongLe();
                if(bufferedSource1.readIntLe() != 1 || v8 != 0) {
                    throw new IOException("unsupported zip: spanned");
                }
                bufferedSource2 = Okio.buffer(fileHandle0.source(v9));
                goto label_34;
            }
            goto label_54;
        }
        catch(Throwable throwable2) {
            goto label_52;
        }
        try {
        label_34:
            int v10 = bufferedSource2.readIntLe();
            if(v10 != 0x6064B50) {
                throw new IOException("bad zip: expected 0x6064b50 but was " + ZipFilesKt.b(v10));
            }
            bufferedSource2.skip(12L);
            int v11 = bufferedSource2.readIntLe();
            int v12 = bufferedSource2.readIntLe();
            long v13 = bufferedSource2.readLongLe();
            if(v13 != bufferedSource2.readLongLe() || v11 != 0 || v12 != 0) {
                throw new IOException("unsupported zip: spanned");
            }
            bufferedSource2.skip(8L);
            y0 = new y(v13, bufferedSource2.readLongLe(), v7 & 0xFFFF);
            goto label_49;
        }
        catch(Throwable throwable3) {
            try {
                CloseableKt.closeFinally(bufferedSource2, throwable3);
                throw throwable3;
            label_49:
                CloseableKt.closeFinally(bufferedSource2, null);
                goto label_54;
            }
            catch(Throwable throwable2) {
            }
        }
        try {
        label_52:
            CloseableKt.closeFinally(bufferedSource1, throwable2);
            throw throwable2;
        label_54:
            CloseableKt.closeFinally(bufferedSource1, null);
        label_55:
            long v14 = y0.b;
            arrayList0 = new ArrayList();
            bufferedSource3 = Okio.buffer(fileHandle0.source(v14));
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(fileHandle0, throwable0);
            throw throwable0;
        }
        try {
            long v15 = y0.a;
            while(true) {
                if(v1 >= v15) {
                    goto label_70;
                }
                ZipEntry zipEntry0 = ZipFilesKt.readEntry(bufferedSource3);
                if(zipEntry0.getOffset() >= v14) {
                    throw new IOException("bad zip: local file header offset >= central directory offset");
                }
                if(((Boolean)function10.invoke(zipEntry0)).booleanValue()) {
                    arrayList0.add(zipEntry0);
                }
                ++v1;
            }
        }
        catch(Throwable throwable4) {
            try {
                CloseableKt.closeFinally(bufferedSource3, throwable4);
                throw throwable4;
            label_70:
                CloseableKt.closeFinally(bufferedSource3, null);
                zipFileSystem0 = new ZipFileSystem(path0, fileSystem0, ZipFilesKt.a(arrayList0), s);
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(fileHandle0, throwable0);
                throw throwable0;
            }
        }
        CloseableKt.closeFinally(fileHandle0, null);
        return zipFileSystem0;
        try {
        label_74:
            bufferedSource0.close();
            --v;
            if(v < v2) {
                throw new IOException("not a zip: end of central directory signature not found");
            }
            goto label_9;
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(fileHandle0, throwable0);
            throw throwable0;
        }
    }

    public static ZipFileSystem openZip$default(Path path0, FileSystem fileSystem0, Function1 function10, int v, Object object0) throws IOException {
        if((v & 4) != 0) {
            function10 = e.y;
        }
        return ZipFilesKt.openZip(path0, fileSystem0, function10);
    }

    @NotNull
    public static final ZipEntry readEntry(@NotNull BufferedSource bufferedSource0) throws IOException {
        LongRef ref$LongRef3;
        long v9;
        Long long0;
        Intrinsics.checkNotNullParameter(bufferedSource0, "<this>");
        int v = bufferedSource0.readIntLe();
        if(v != 0x2014B50) {
            throw new IOException("bad zip: expected 0x2014b50 but was " + ZipFilesKt.b(v));
        }
        bufferedSource0.skip(4L);
        int v1 = bufferedSource0.readShortLe();
        if((v1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + ZipFilesKt.b(v1 & 0xFFFF));
        }
        int v2 = bufferedSource0.readShortLe();
        int v3 = bufferedSource0.readShortLe();
        int v4 = bufferedSource0.readShortLe();
        if((v3 & 0xFFFF) == -1) {
            long0 = null;
        }
        else {
            GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
            gregorianCalendar0.set(14, 0);
            gregorianCalendar0.set(((v4 & 0xFFFF) >> 9 & 0x7F) + 1980, ((v4 & 0xFFFF) >> 5 & 15) - 1, v4 & 0x1F, (v3 & 0xFFFF) >> 11 & 0x1F, (v3 & 0xFFFF) >> 5 & 0x3F, (v3 & 0x1F) << 1);
            long0 = gregorianCalendar0.getTime().getTime();
        }
        long v5 = ((long)bufferedSource0.readIntLe()) & 0xFFFFFFFFL;
        LongRef ref$LongRef0 = new LongRef();
        ref$LongRef0.element = ((long)bufferedSource0.readIntLe()) & 0xFFFFFFFFL;
        LongRef ref$LongRef1 = new LongRef();
        ref$LongRef1.element = ((long)bufferedSource0.readIntLe()) & 0xFFFFFFFFL;
        int v6 = bufferedSource0.readShortLe();
        int v7 = bufferedSource0.readShortLe();
        int v8 = bufferedSource0.readShortLe();
        bufferedSource0.skip(8L);
        LongRef ref$LongRef2 = new LongRef();
        ref$LongRef2.element = ((long)bufferedSource0.readIntLe()) & 0xFFFFFFFFL;
        String s = bufferedSource0.readUtf8(((long)(v6 & 0xFFFF)));
        if(StringsKt__StringsKt.contains$default(s, '\u0000', false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if(Long.compare(ref$LongRef1.element, 0xFFFFFFFFL) == 0) {
            v9 = 8L;
            ref$LongRef3 = ref$LongRef2;
        }
        else {
            ref$LongRef3 = ref$LongRef2;
            v9 = 0L;
        }
        if(Long.compare(ref$LongRef0.element, 0xFFFFFFFFL) == 0) {
            v9 += 8L;
        }
        if(ref$LongRef3.element == 0xFFFFFFFFL) {
            v9 += 8L;
        }
        BooleanRef ref$BooleanRef0 = new BooleanRef();
        ZipFilesKt.c(bufferedSource0, v7 & 0xFFFF, new f(ref$BooleanRef0, v9, ref$LongRef1, bufferedSource0, ref$LongRef0, ref$LongRef3));
        if(v9 > 0L && !ref$BooleanRef0.element) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String s1 = bufferedSource0.readUtf8(((long)(v8 & 0xFFFF)));
        return new ZipEntry(Companion.get$default(Path.Companion, "/", false, 1, null).resolve(s), p.endsWith$default(s, "/", false, 2, null), s1, v5, ref$LongRef0.element, ref$LongRef1.element, v2 & 0xFFFF, long0, ref$LongRef3.element);
    }

    @NotNull
    public static final FileMetadata readLocalHeader(@NotNull BufferedSource bufferedSource0, @NotNull FileMetadata fileMetadata0) {
        Intrinsics.checkNotNullParameter(bufferedSource0, "<this>");
        Intrinsics.checkNotNullParameter(fileMetadata0, "basicMetadata");
        FileMetadata fileMetadata1 = ZipFilesKt.d(bufferedSource0, fileMetadata0);
        Intrinsics.checkNotNull(fileMetadata1);
        return fileMetadata1;
    }

    public static final void skipLocalHeader(@NotNull BufferedSource bufferedSource0) {
        Intrinsics.checkNotNullParameter(bufferedSource0, "<this>");
        ZipFilesKt.d(bufferedSource0, null);
    }
}

