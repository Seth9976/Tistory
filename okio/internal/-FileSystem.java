package okio.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import md.b;
import okio.BufferedSink;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wg.a;
import wg.c;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AF\u0010\u0000\u001A\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\nH\u0080@¢\u0006\u0002\u0010\f\u001A\u001C\u0010\r\u001A\u00020\u0001*\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u0003H\u0000\u001A\u001C\u0010\u0010\u001A\u00020\u0001*\u00020\u00052\u0006\u0010\u0011\u001A\u00020\u00032\u0006\u0010\u0012\u001A\u00020\nH\u0000\u001A\u001C\u0010\u0013\u001A\u00020\u0001*\u00020\u00052\u0006\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\nH\u0000\u001A\u0014\u0010\u0016\u001A\u00020\n*\u00020\u00052\u0006\u0010\b\u001A\u00020\u0003H\u0000\u001A\"\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00052\u0006\u0010\u0011\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\nH\u0000\u001A\u0014\u0010\u0019\u001A\u00020\u001A*\u00020\u00052\u0006\u0010\b\u001A\u00020\u0003H\u0000\u001A\u0016\u0010\u001B\u001A\u0004\u0018\u00010\u0003*\u00020\u00052\u0006\u0010\b\u001A\u00020\u0003H\u0000¨\u0006\u001C"}, d2 = {"collectRecursively", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "stack", "Lkotlin/collections/ArrayDeque;", "path", "followSymlinks", "", "postorder", "(Lkotlin/sequences/SequenceScope;Lokio/FileSystem;Lkotlin/collections/ArrayDeque;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commonCopy", "source", "target", "commonCreateDirectories", "dir", "mustCreate", "commonDeleteRecursively", "fileOrDirectory", "mustExist", "commonExists", "commonListRecursively", "Lkotlin/sequences/Sequence;", "commonMetadata", "Lokio/FileMetadata;", "symlinkTarget", "okio"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-FileSystem")
@SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,5:156\n52#2,21:161\n60#2,10:182\n57#2,2:192\n71#2,2:194\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,5\n66#1:161,21\n65#1:182,10\n65#1:192,2\n65#1:194,2\n*E\n"})
public final class -FileSystem {
    @Nullable
    public static final Object collectRecursively(@NotNull SequenceScope sequenceScope0, @NotNull FileSystem fileSystem0, @NotNull ArrayDeque arrayDeque0, @NotNull Path path0, boolean z, boolean z1, @NotNull Continuation continuation0) {
        Path path4;
        ArrayDeque arrayDeque2;
        boolean z6;
        SequenceScope sequenceScope2;
        boolean z2;
        SequenceScope sequenceScope1;
        ArrayDeque arrayDeque1;
        FileSystem fileSystem1;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.w;
            if((v & 0x80000000) == 0) {
                a0 = new a(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                a0.w = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = a0.v;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(a0.w) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(z1) {
                    fileSystem1 = fileSystem0;
                    arrayDeque1 = arrayDeque0;
                }
                else {
                    a0.o = sequenceScope0;
                    fileSystem1 = fileSystem0;
                    a0.p = fileSystem1;
                    arrayDeque1 = arrayDeque0;
                    a0.q = arrayDeque1;
                    a0.r = path0;
                    a0.t = z;
                    a0.u = false;
                    a0.w = 1;
                    if(sequenceScope0.yield(path0, a0) == object1) {
                        return object1;
                    }
                }
                sequenceScope1 = sequenceScope0;
                z2 = z;
                goto label_44;
            }
            case 1: {
                boolean z3 = a0.u;
                boolean z4 = a0.t;
                Path path1 = a0.r;
                arrayDeque1 = a0.q;
                FileSystem fileSystem2 = a0.p;
                sequenceScope1 = a0.o;
                ResultKt.throwOnFailure(object0);
                fileSystem1 = fileSystem2;
                z1 = z3;
                z2 = z4;
                path0 = path1;
            label_44:
                List list0 = fileSystem1.listOrNull(path0);
                if(list0 == null) {
                    list0 = CollectionsKt__CollectionsKt.emptyList();
                }
                if(!list0.isEmpty()) {
                    int v1 = 0;
                    Path path2 = path0;
                    while(true) {
                        if(z2 && arrayDeque1.contains(path2)) {
                            throw new IOException("symlink cycle at " + path0);
                        }
                        Path path3 = -FileSystem.symlinkTarget(fileSystem1, path2);
                        if(path3 == null) {
                            if(!z2 && v1 != 0) {
                                break;
                            }
                            arrayDeque1.addLast(path2);
                            try {
                                sequenceScope2 = sequenceScope1;
                                FileSystem fileSystem3 = fileSystem1;
                                boolean z5 = z2;
                                z6 = z1;
                                arrayDeque2 = arrayDeque1;
                                path4 = path0;
                                Iterator iterator0 = list0.iterator();
                                goto label_75;
                            label_67:
                                z6 = a0.u;
                                z5 = a0.t;
                                iterator0 = a0.s;
                                path4 = a0.r;
                                arrayDeque2 = a0.q;
                                fileSystem3 = a0.p;
                                sequenceScope2 = a0.o;
                                ResultKt.throwOnFailure(object0);
                                while(true) {
                                label_75:
                                    if(!iterator0.hasNext()) {
                                        goto label_92;
                                    }
                                    Object object2 = iterator0.next();
                                    a0.o = sequenceScope2;
                                    a0.p = fileSystem3;
                                    a0.q = arrayDeque2;
                                    a0.r = path4;
                                    a0.s = iterator0;
                                    a0.t = z5;
                                    a0.u = z6;
                                    a0.w = 2;
                                    if(-FileSystem.collectRecursively(sequenceScope2, fileSystem3, arrayDeque2, ((Path)object2), z5, z6, a0) == object1) {
                                        return object1;
                                    }
                                }
                            }
                            catch(Throwable throwable0) {
                                break alab1;
                            }
                        }
                        ++v1;
                        path2 = path3;
                    }
                }
                goto label_96;
            }
            case 2: {
                goto label_67;
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        arrayDeque2.removeLast();
        throw throwable0;
    label_92:
        arrayDeque2.removeLast();
        z1 = z6;
        path0 = path4;
        sequenceScope1 = sequenceScope2;
    label_96:
        if(z1) {
            a0.o = null;
            a0.p = null;
            a0.q = null;
            a0.r = null;
            a0.s = null;
            a0.w = 3;
            return sequenceScope1.yield(path0, a0) == object1 ? object1 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final void commonCopy(@NotNull FileSystem fileSystem0, @NotNull Path path0, @NotNull Path path1) throws IOException {
        Long long1;
        Throwable throwable4;
        Long long0;
        BufferedSink bufferedSink0;
        Intrinsics.checkNotNullParameter(fileSystem0, "<this>");
        Intrinsics.checkNotNullParameter(path0, "source");
        Intrinsics.checkNotNullParameter(path1, "target");
        Source source0 = fileSystem0.source(path0);
        Throwable throwable0 = null;
        try {
            bufferedSink0 = Okio.buffer(fileSystem0.sink(path1));
        }
        catch(Throwable throwable1) {
            goto label_27;
        }
        try {
            long0 = bufferedSink0.writeAll(source0);
        }
        catch(Throwable throwable2) {
            if(bufferedSink0 != null) {
                try {
                    bufferedSink0.close();
                }
                catch(Throwable throwable3) {
                    try {
                        b.addSuppressed(throwable2, throwable3);
                        throwable4 = throwable2;
                        long0 = null;
                        goto label_21;
                    }
                    catch(Throwable throwable1) {
                        goto label_27;
                    }
                }
            }
            throwable4 = throwable2;
            long0 = null;
            goto label_21;
        }
        try {
            bufferedSink0.close();
            throwable4 = null;
        }
        catch(Throwable throwable4) {
        }
        try {
        label_21:
            if(throwable4 != null) {
                throw throwable4;
            }
            Intrinsics.checkNotNull(long0);
            long1 = long0.longValue();
            goto label_35;
        label_27:
            if(source0 != null) {
                goto label_28;
            }
            throwable0 = throwable1;
            long1 = null;
            goto label_39;
        }
        catch(Throwable throwable1) {
            goto label_27;
        }
        try {
        label_28:
            source0.close();
        }
        catch(Throwable throwable5) {
            b.addSuppressed(throwable1, throwable5);
        }
        throwable0 = throwable1;
        long1 = null;
        goto label_39;
    label_35:
        if(source0 != null) {
            try {
                source0.close();
            }
            catch(Throwable throwable0) {
            }
        }
    label_39:
        if(throwable0 != null) {
            throw throwable0;
        }
        Intrinsics.checkNotNull(long1);
    }

    public static final void commonCreateDirectories(@NotNull FileSystem fileSystem0, @NotNull Path path0, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem0, "<this>");
        Intrinsics.checkNotNullParameter(path0, "dir");
        ArrayDeque arrayDeque0 = new ArrayDeque();
        for(Path path1 = path0; path1 != null && !fileSystem0.exists(path1); path1 = path1.parent()) {
            arrayDeque0.addFirst(path1);
        }
        if(z && arrayDeque0.isEmpty()) {
            throw new IOException(path0 + " already exists.");
        }
        for(Object object0: arrayDeque0) {
            fileSystem0.createDirectory(((Path)object0));
        }
    }

    public static final void commonDeleteRecursively(@NotNull FileSystem fileSystem0, @NotNull Path path0, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem0, "<this>");
        Intrinsics.checkNotNullParameter(path0, "fileOrDirectory");
        Iterator iterator0 = SequencesKt__SequenceBuilderKt.sequence(new wg.b(fileSystem0, path0, null)).iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            fileSystem0.delete(((Path)object0), z && !iterator0.hasNext());
        }
    }

    public static final boolean commonExists(@NotNull FileSystem fileSystem0, @NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem0, "<this>");
        Intrinsics.checkNotNullParameter(path0, "path");
        return fileSystem0.metadataOrNull(path0) != null;
    }

    @NotNull
    public static final Sequence commonListRecursively(@NotNull FileSystem fileSystem0, @NotNull Path path0, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem0, "<this>");
        Intrinsics.checkNotNullParameter(path0, "dir");
        return SequencesKt__SequenceBuilderKt.sequence(new c(path0, fileSystem0, z, null));
    }

    @NotNull
    public static final FileMetadata commonMetadata(@NotNull FileSystem fileSystem0, @NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem0, "<this>");
        Intrinsics.checkNotNullParameter(path0, "path");
        FileMetadata fileMetadata0 = fileSystem0.metadataOrNull(path0);
        if(fileMetadata0 == null) {
            throw new FileNotFoundException("no such file: " + path0);
        }
        return fileMetadata0;
    }

    @Nullable
    public static final Path symlinkTarget(@NotNull FileSystem fileSystem0, @NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem0, "<this>");
        Intrinsics.checkNotNullParameter(path0, "path");
        Path path1 = fileSystem0.metadata(path0).getSymlinkTarget();
        if(path1 == null) {
            return null;
        }
        Path path2 = path0.parent();
        Intrinsics.checkNotNull(path2);
        return path2.resolve(path1);
    }
}

