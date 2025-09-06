package okio.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import md.c;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path.Companion;
import okio.Path;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w1.a;
import wg.d;
import wg.e;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001,B#\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\t0\u000E2\u0006\u0010\r\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000E2\u0006\u0010\r\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\'\u0010\u0018\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\t2\u0006\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u0012\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001F\u0010!\u001A\u00020 2\u0006\u0010\u0012\u001A\u00020\t2\u0006\u0010\u0016\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b!\u0010\"J\u001F\u0010#\u001A\u00020 2\u0006\u0010\u0012\u001A\u00020\t2\u0006\u0010\u0017\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b#\u0010\"J\u001F\u0010%\u001A\u00020$2\u0006\u0010\r\u001A\u00020\t2\u0006\u0010\u0016\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b%\u0010&J\u001F\u0010(\u001A\u00020$2\u0006\u0010\u001E\u001A\u00020\t2\u0006\u0010\'\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b(\u0010)J\u001F\u0010*\u001A\u00020$2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0017\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b*\u0010&J\u001F\u0010+\u001A\u00020$2\u0006\u0010\u001E\u001A\u00020\t2\u0006\u0010\'\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b+\u0010)\u00A8\u0006-"}, d2 = {"Lokio/internal/ResourceFileSystem;", "Lokio/FileSystem;", "Ljava/lang/ClassLoader;", "classLoader", "", "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLokio/FileSystem;)V", "Lokio/Path;", "path", "canonicalize", "(Lokio/Path;)Lokio/Path;", "dir", "", "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", "Lokio/FileMetadata;", "metadataOrNull", "(Lokio/Path;)Lokio/FileMetadata;", "Lokio/Source;", "source", "(Lokio/Path;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "appendingSink", "", "createDirectory", "(Lokio/Path;Z)V", "target", "atomicMove", "(Lokio/Path;Lokio/Path;)V", "delete", "createSymlink", "wg/d", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n766#2:211\n857#2,2:212\n1549#2:214\n1620#2,3:215\n766#2:218\n857#2,2:219\n1549#2:221\n1620#2,3:222\n1603#2,9:225\n1855#2:234\n1856#2:236\n1612#2:237\n1603#2,9:238\n1855#2:247\n1856#2:249\n1612#2:250\n1#3:235\n1#3:248\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n74#1:211\n74#1:212,2\n75#1:214\n75#1:215,3\n90#1:218\n90#1:219,2\n91#1:221\n91#1:222,3\n173#1:225,9\n173#1:234\n173#1:236\n173#1:237\n174#1:238,9\n174#1:247\n174#1:249\n174#1:250\n173#1:235\n174#1:248\n*E\n"})
public final class ResourceFileSystem extends FileSystem {
    public final ClassLoader a;
    public final FileSystem b;
    public final Lazy c;
    public static final d d;
    public static final Path e;

    static {
        ResourceFileSystem.d = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        ResourceFileSystem.e = Companion.get$default(Path.Companion, "/", false, 1, null);
    }

    public ResourceFileSystem(@NotNull ClassLoader classLoader0, boolean z, @NotNull FileSystem fileSystem0) {
        Intrinsics.checkNotNullParameter(classLoader0, "classLoader");
        Intrinsics.checkNotNullParameter(fileSystem0, "systemFileSystem");
        super();
        this.a = classLoader0;
        this.b = fileSystem0;
        Lazy lazy0 = c.lazy(new a(this, 2));
        this.c = lazy0;
        if(z) {
            ((List)lazy0.getValue()).size();
        }
    }

    public ResourceFileSystem(ClassLoader classLoader0, boolean z, FileSystem fileSystem0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            fileSystem0 = FileSystem.SYSTEM;
        }
        this(classLoader0, z, fileSystem0);
    }

    public static final ClassLoader access$getClassLoader$p(ResourceFileSystem resourceFileSystem0) {
        return resourceFileSystem0.a;
    }

    public static final List access$toClasspathRoots(ResourceFileSystem resourceFileSystem0, ClassLoader classLoader0) {
        Pair pair1;
        FileSystem fileSystem0;
        resourceFileSystem0.getClass();
        Enumeration enumeration0 = classLoader0.getResources("");
        Intrinsics.checkNotNullExpressionValue(enumeration0, "getResources(...)");
        ArrayList arrayList0 = Collections.list(enumeration0);
        Intrinsics.checkNotNullExpressionValue(arrayList0, "list(...)");
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            fileSystem0 = resourceFileSystem0.b;
            Pair pair0 = null;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            URL uRL0 = (URL)object0;
            Intrinsics.checkNotNull(uRL0);
            if(Intrinsics.areEqual(uRL0.getProtocol(), "file")) {
                File file0 = new File(uRL0.toURI());
                pair0 = TuplesKt.to(fileSystem0, Companion.get$default(Path.Companion, file0, false, 1, null));
            }
            if(pair0 != null) {
                arrayList1.add(pair0);
            }
        }
        Enumeration enumeration1 = classLoader0.getResources("META-INF/MANIFEST.MF");
        Intrinsics.checkNotNullExpressionValue(enumeration1, "getResources(...)");
        ArrayList arrayList2 = Collections.list(enumeration1);
        Intrinsics.checkNotNullExpressionValue(arrayList2, "list(...)");
        ArrayList arrayList3 = new ArrayList();
        for(Object object1: arrayList2) {
            Intrinsics.checkNotNull(((URL)object1));
            String s = ((URL)object1).toString();
            Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
            if(p.startsWith$default(s, "jar:file:", false, 2, null)) {
                int v = StringsKt__StringsKt.lastIndexOf$default(s, "!", 0, false, 6, null);
                if(v != -1) {
                    String s1 = s.substring(4, v);
                    Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
                    File file1 = new File(URI.create(s1));
                    pair1 = TuplesKt.to(ZipFilesKt.openZip(Companion.get$default(Path.Companion, file1, false, 1, null), fileSystem0, e.x), ResourceFileSystem.e);
                }
            }
            else {
                pair1 = null;
            }
            if(pair1 != null) {
                arrayList3.add(pair1);
            }
        }
        return CollectionsKt___CollectionsKt.plus(arrayList1, arrayList3);
    }

    @Override  // okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "file");
        throw new IOException(this + " is read-only");
    }

    @Override  // okio.FileSystem
    public void atomicMove(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "source");
        Intrinsics.checkNotNullParameter(path1, "target");
        throw new IOException(this + " is read-only");
    }

    @Override  // okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "path");
        return ResourceFileSystem.e.resolve(path0, true);
    }

    @Override  // okio.FileSystem
    public void createDirectory(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override  // okio.FileSystem
    public void createSymlink(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "source");
        Intrinsics.checkNotNullParameter(path1, "target");
        throw new IOException(this + " is read-only");
    }

    @Override  // okio.FileSystem
    public void delete(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "path");
        throw new IOException(this + " is read-only");
    }

    @Override  // okio.FileSystem
    @NotNull
    public List list(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        String s = ResourceFileSystem.e.resolve(path0, true).relativeTo(ResourceFileSystem.e).toString();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        boolean z = false;
        for(Object object0: ((List)this.c.getValue())) {
            FileSystem fileSystem0 = (FileSystem)((Pair)object0).component1();
            Path path1 = (Path)((Pair)object0).component2();
            try {
                Iterable iterable0 = fileSystem0.list(path1.resolve(s));
                ArrayList arrayList0 = new ArrayList();
                Iterator iterator1 = iterable0.iterator();
                while(true) {
                    boolean z1 = iterator1.hasNext();
                    d d0 = ResourceFileSystem.d;
                    if(!z1) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    if(d.a(d0, ((Path)object1))) {
                        arrayList0.add(object1);
                    }
                }
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
                for(Object object2: arrayList0) {
                    arrayList1.add(d.b(((Path)object2), path1));
                }
                o.addAll(linkedHashSet0, arrayList1);
                z = true;
            }
            catch(IOException unused_ex) {
            }
        }
        if(!z) {
            throw new FileNotFoundException("file not found: " + path0);
        }
        return CollectionsKt___CollectionsKt.toList(linkedHashSet0);
    }

    @Override  // okio.FileSystem
    @Nullable
    public List listOrNull(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        String s = ResourceFileSystem.e.resolve(path0, true).relativeTo(ResourceFileSystem.e).toString();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        Iterator iterator0 = ((List)this.c.getValue()).iterator();
        boolean z = false;
        while(true) {
            List list0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Path path1 = (Path)((Pair)object0).component2();
            List list1 = ((FileSystem)((Pair)object0).component1()).listOrNull(path1.resolve(s));
            if(list1 != null) {
                ArrayList arrayList0 = new ArrayList();
                Iterator iterator1 = list1.iterator();
                while(true) {
                    boolean z1 = iterator1.hasNext();
                    d d0 = ResourceFileSystem.d;
                    if(!z1) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    if(d.a(d0, ((Path)object1))) {
                        arrayList0.add(object1);
                    }
                }
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
                for(Object object2: arrayList0) {
                    arrayList1.add(d.b(((Path)object2), path1));
                }
                list0 = arrayList1;
            }
            if(list0 != null) {
                o.addAll(linkedHashSet0, list0);
                z = true;
            }
        }
        return z ? CollectionsKt___CollectionsKt.toList(linkedHashSet0) : null;
    }

    @Override  // okio.FileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "path");
        if(!d.a(ResourceFileSystem.d, path0)) {
            return null;
        }
        String s = ResourceFileSystem.e.resolve(path0, true).relativeTo(ResourceFileSystem.e).toString();
        for(Object object0: ((List)this.c.getValue())) {
            FileMetadata fileMetadata0 = ((FileSystem)((Pair)object0).component1()).metadataOrNull(((Path)((Pair)object0).component2()).resolve(s));
            if(fileMetadata0 != null) {
                return fileMetadata0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "file");
        if(!d.a(ResourceFileSystem.d, path0)) {
            throw new FileNotFoundException("file not found: " + path0);
        }
        String s = ResourceFileSystem.e.resolve(path0, true).relativeTo(ResourceFileSystem.e).toString();
        Iterator iterator0 = ((List)this.c.getValue()).iterator();
    label_4:
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            FileSystem fileSystem0 = (FileSystem)((Pair)object0).component1();
            Path path1 = (Path)((Pair)object0).component2();
            try {
                return fileSystem0.openReadOnly(path1.resolve(s));
            }
            catch(FileNotFoundException unused_ex) {
                goto label_4;
            }
        }
        throw new FileNotFoundException("file not found: " + path0);
    }

    @Override  // okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path path0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(path0, "file");
        throw new IOException("resources are not writable");
    }

    @Override  // okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "file");
        throw new IOException(this + " is read-only");
    }

    @Override  // okio.FileSystem
    @NotNull
    public Source source(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "file");
        if(!d.a(ResourceFileSystem.d, path0)) {
            throw new FileNotFoundException("file not found: " + path0);
        }
        String s = Path.resolve$default(ResourceFileSystem.e, path0, false, 2, null).relativeTo(ResourceFileSystem.e).toString();
        InputStream inputStream0 = this.a.getResourceAsStream(s);
        if(inputStream0 != null) {
            Source source0 = Okio.source(inputStream0);
            if(source0 != null) {
                return source0;
            }
        }
        throw new FileNotFoundException("file not found: " + path0);
    }
}

