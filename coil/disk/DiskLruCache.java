package coil.disk;

import androidx.annotation.VisibleForTesting;
import coil.util.-FileSystems;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import m0.b0;
import md.b;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.ForwardingFileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r5.a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\n\b\u0000\u0018\u0000 $2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0004$%&\'B7\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\f¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001E\u0010\u0017\u001A\b\u0018\u00010\u0016R\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0014H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001B\u0010\u001A\u001A\b\u0018\u00010\u0019R\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u001A\u0010\u001BJ\r\u0010\u001C\u001A\u00020\n¢\u0006\u0004\b\u001C\u0010\u001DJ\u0015\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u001F\u0010 J\u000F\u0010!\u001A\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0013J\u000F\u0010\"\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0013J\r\u0010#\u001A\u00020\u0011¢\u0006\u0004\b#\u0010\u0013¨\u0006("}, d2 = {"Lcoil/disk/DiskLruCache;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Ljava/io/Flushable;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", "directory", "Lkotlinx/coroutines/CoroutineDispatcher;", "cleanupDispatcher", "", "maxSize", "", "appVersion", "valueCount", "<init>", "(Lokio/FileSystem;Lokio/Path;Lkotlinx/coroutines/CoroutineDispatcher;JII)V", "", "initialize", "()V", "", "key", "Lcoil/disk/DiskLruCache$Snapshot;", "get", "(Ljava/lang/String;)Lcoil/disk/DiskLruCache$Snapshot;", "Lcoil/disk/DiskLruCache$Editor;", "edit", "(Ljava/lang/String;)Lcoil/disk/DiskLruCache$Editor;", "size", "()J", "", "remove", "(Ljava/lang/String;)Z", "close", "flush", "evictAll", "Companion", "Editor", "Entry", "Snapshot", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Okio.kt\nokio/Okio__OkioKt\n+ 4 FileSystem.kt\nokio/FileSystem\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,869:1\n1#2:870\n66#3:871\n52#3,5:873\n60#3,10:879\n57#3,2:889\n71#3,2:891\n52#3,5:903\n60#3,10:909\n57#3,16:919\n67#4:872\n68#4:878\n80#4:900\n165#4:901\n81#4:902\n82#4:908\n372#5,7:893\n37#6,2:935\n37#6,2:937\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache\n*L\n207#1:871\n207#1:873,5\n207#1:879,10\n207#1:889,2\n207#1:891,2\n320#1:903,5\n320#1:909,10\n320#1:919,16\n207#1:872\n207#1:878\n320#1:900\n320#1:901\n320#1:902\n320#1:908\n270#1:893,7\n585#1:935,2\n641#1:937,2\n*E\n"})
public final class DiskLruCache implements Closeable, Flushable {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u001A\u0010\u0007\u001A\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\b\u0010\u0006R\u001A\u0010\t\u001A\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\t\u0010\u0004\u0012\u0004\b\n\u0010\u0006R\u001A\u0010\u000B\u001A\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u0012\u0004\b\f\u0010\u0006R\u001A\u0010\r\u001A\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\r\u0010\u0004\u0012\u0004\b\u000E\u0010\u0006R\u0014\u0010\u000F\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000F\u0010\u0004R\u0014\u0010\u0010\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0012\u001A\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcoil/disk/DiskLruCache$Companion;", "", "", "JOURNAL_FILE", "Ljava/lang/String;", "getJOURNAL_FILE$coil_base_release$annotations", "()V", "JOURNAL_FILE_TMP", "getJOURNAL_FILE_TMP$coil_base_release$annotations", "JOURNAL_FILE_BACKUP", "getJOURNAL_FILE_BACKUP$coil_base_release$annotations", "MAGIC", "getMAGIC$coil_base_release$annotations", "VERSION", "getVERSION$coil_base_release$annotations", "CLEAN", "DIRTY", "Lkotlin/text/Regex;", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "READ", "REMOVE", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @VisibleForTesting
        public static void getJOURNAL_FILE$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static void getJOURNAL_FILE_BACKUP$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static void getJOURNAL_FILE_TMP$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static void getMAGIC$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static void getVERSION$coil_base_release$annotations() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0018\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001A\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\r\u001A\u00020\f¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u000F\u001A\u00020\f¢\u0006\u0004\b\u000F\u0010\u000EJ\u0013\u0010\u0011\u001A\b\u0018\u00010\u0010R\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\f¢\u0006\u0004\b\u0013\u0010\u000ER\u001B\u0010\u0004\u001A\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001D\u001A\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Lcoil/disk/DiskLruCache$Editor;", "", "Lcoil/disk/DiskLruCache$Entry;", "Lcoil/disk/DiskLruCache;", "entry", "<init>", "(Lcoil/disk/DiskLruCache;Lcoil/disk/DiskLruCache$Entry;)V", "", "index", "Lokio/Path;", "file", "(I)Lokio/Path;", "", "detach", "()V", "commit", "Lcoil/disk/DiskLruCache$Snapshot;", "commitAndGet", "()Lcoil/disk/DiskLruCache$Snapshot;", "abort", "a", "Lcoil/disk/DiskLruCache$Entry;", "getEntry", "()Lcoil/disk/DiskLruCache$Entry;", "", "c", "[Z", "getWritten", "()[Z", "written", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Editor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    public final class Editor {
        public final Entry a;
        public boolean b;
        public final boolean[] c;
        public final DiskLruCache d;

        public Editor(@NotNull Entry diskLruCache$Entry0) {
            this.a = diskLruCache$Entry0;
            this.c = new boolean[diskLruCache0.d];
        }

        public final void a(boolean z) {
            DiskLruCache diskLruCache0 = DiskLruCache.this;
            synchronized(diskLruCache0) {
                if(!this.b) {
                    if(Intrinsics.areEqual(this.a.getCurrentEditor(), this)) {
                        DiskLruCache.access$completeEdit(diskLruCache0, this, z);
                    }
                    this.b = true;
                    return;
                }
            }
            throw new IllegalStateException("editor is closed");
        }

        public final void abort() {
            this.a(false);
        }

        public final void commit() {
            this.a(true);
        }

        @Nullable
        public final Snapshot commitAndGet() {
            synchronized(DiskLruCache.this) {
                this.commit();
                return DiskLruCache.this.get(this.a.getKey());
            }
        }

        public final void detach() {
            Entry diskLruCache$Entry0 = this.a;
            if(Intrinsics.areEqual(diskLruCache$Entry0.getCurrentEditor(), this)) {
                diskLruCache$Entry0.setZombie(true);
            }
        }

        @NotNull
        public final Path file(int v) {
            DiskLruCache diskLruCache0 = DiskLruCache.this;
            synchronized(diskLruCache0) {
                if(!this.b) {
                    this.c[v] = true;
                    Object object0 = this.a.getDirtyFiles().get(v);
                    -FileSystems.createFile(diskLruCache0.r, ((Path)object0));
                    return (Path)object0;
                }
            }
            throw new IllegalStateException("editor is closed");
        }

        @NotNull
        public final Entry getEntry() {
            return this.a;
        }

        @NotNull
        public final boolean[] getWritten() {
            return this.c;
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001B\u0010\t\u001A\u00020\b2\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u0013\u0010\u0011\u001A\b\u0018\u00010\u000FR\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001C\u001A\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\'\u0010$\u001A\u0012\u0012\u0004\u0012\u00020\u001E0\u001Dj\b\u0012\u0004\u0012\u00020\u001E`\u001F8\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R\'\u0010\'\u001A\u0012\u0012\u0004\u0012\u00020\u001E0\u001Dj\b\u0012\u0004\u0012\u00020\u001E`\u001F8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001A\u0004\b&\u0010#R\"\u0010/\u001A\u00020(8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001A\u00020(8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b0\u0010*\u001A\u0004\b1\u0010,\"\u0004\b2\u0010.R(\u0010;\u001A\b\u0018\u000104R\u00020\u00108\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b5\u00106\u001A\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001A\u00020<8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcoil/disk/DiskLruCache$Entry;", "", "", "key", "<init>", "(Lcoil/disk/DiskLruCache;Ljava/lang/String;)V", "", "strings", "", "setLengths", "(Ljava/util/List;)V", "Lokio/BufferedSink;", "writer", "writeLengths", "(Lokio/BufferedSink;)V", "Lcoil/disk/DiskLruCache$Snapshot;", "Lcoil/disk/DiskLruCache;", "snapshot", "()Lcoil/disk/DiskLruCache$Snapshot;", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "", "b", "[J", "getLengths", "()[J", "lengths", "Ljava/util/ArrayList;", "Lokio/Path;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "getCleanFiles", "()Ljava/util/ArrayList;", "cleanFiles", "d", "getDirtyFiles", "dirtyFiles", "", "e", "Z", "getReadable", "()Z", "setReadable", "(Z)V", "readable", "f", "getZombie", "setZombie", "zombie", "Lcoil/disk/DiskLruCache$Editor;", "g", "Lcoil/disk/DiskLruCache$Editor;", "getCurrentEditor", "()Lcoil/disk/DiskLruCache$Editor;", "setCurrentEditor", "(Lcoil/disk/DiskLruCache$Editor;)V", "currentEditor", "", "h", "I", "getLockingSnapshotCount", "()I", "setLockingSnapshotCount", "(I)V", "lockingSnapshotCount", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Entry\n+ 2 Collections.kt\ncoil/util/-Collections\n*L\n1#1,869:1\n12#2,4:870\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Entry\n*L\n841#1:870,4\n*E\n"})
    public final class Entry {
        public final String a;
        public final long[] b;
        public final ArrayList c;
        public final ArrayList d;
        public boolean e;
        public boolean f;
        public Editor g;
        public int h;
        public final DiskLruCache i;

        public Entry(@NotNull String s) {
            this.a = s;
            this.b = new long[diskLruCache0.d];
            this.c = new ArrayList(diskLruCache0.d);
            this.d = new ArrayList(diskLruCache0.d);
            StringBuilder stringBuilder0 = new StringBuilder(s);
            stringBuilder0.append('.');
            int v = stringBuilder0.length();
            int v1 = diskLruCache0.d;
            for(int v2 = 0; v2 < v1; ++v2) {
                stringBuilder0.append(v2);
                Path path0 = DiskLruCache.this.a.resolve(stringBuilder0.toString());
                this.c.add(path0);
                stringBuilder0.append(".tmp");
                Path path1 = DiskLruCache.this.a.resolve(stringBuilder0.toString());
                this.d.add(path1);
                stringBuilder0.setLength(v);
            }
        }

        @NotNull
        public final ArrayList getCleanFiles() {
            return this.c;
        }

        @Nullable
        public final Editor getCurrentEditor() {
            return this.g;
        }

        @NotNull
        public final ArrayList getDirtyFiles() {
            return this.d;
        }

        @NotNull
        public final String getKey() {
            return this.a;
        }

        @NotNull
        public final long[] getLengths() {
            return this.b;
        }

        public final int getLockingSnapshotCount() {
            return this.h;
        }

        public final boolean getReadable() {
            return this.e;
        }

        public final boolean getZombie() {
            return this.f;
        }

        public final void setCurrentEditor(@Nullable Editor diskLruCache$Editor0) {
            this.g = diskLruCache$Editor0;
        }

        public final void setLengths(@NotNull List list0) {
            if(list0.size() == DiskLruCache.this.d) {
                try {
                    int v = list0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        this.b[v1] = Long.parseLong(((String)list0.get(v1)));
                    }
                    return;
                }
                catch(NumberFormatException unused_ex) {
                    throw new IOException("unexpected journal line: " + list0);
                }
            }
            throw new IOException("unexpected journal line: " + list0);
        }

        public final void setLockingSnapshotCount(int v) {
            this.h = v;
        }

        public final void setReadable(boolean z) {
            this.e = z;
        }

        public final void setZombie(boolean z) {
            this.f = z;
        }

        @Nullable
        public final Snapshot snapshot() {
            DiskLruCache diskLruCache0;
            if(!this.e) {
                return null;
            }
            if(this.g == null && !this.f) {
                ArrayList arrayList0 = this.c;
                int v = arrayList0.size();
                for(int v1 = 0; true; ++v1) {
                    diskLruCache0 = DiskLruCache.this;
                    if(v1 >= v) {
                        break;
                    }
                    if(!diskLruCache0.r.exists(((Path)arrayList0.get(v1)))) {
                        try {
                            DiskLruCache.access$removeEntry(diskLruCache0, this);
                        }
                        catch(IOException unused_ex) {
                        }
                        return null;
                    }
                }
                ++this.h;
                return new Snapshot(diskLruCache0, this);
            }
            return null;
        }

        public final void writeLengths(@NotNull BufferedSink bufferedSink0) {
            long[] arr_v = this.b;
            for(int v = 0; v < arr_v.length; ++v) {
                long v1 = arr_v[v];
                bufferedSink0.writeByte(0x20).writeDecimalLong(v1);
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001A\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0013\u0010\u0011\u001A\b\u0018\u00010\u0010R\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001B\u0010\u0005\u001A\u00060\u0003R\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcoil/disk/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lcoil/disk/DiskLruCache$Entry;", "Lcoil/disk/DiskLruCache;", "entry", "<init>", "(Lcoil/disk/DiskLruCache;Lcoil/disk/DiskLruCache$Entry;)V", "", "index", "Lokio/Path;", "file", "(I)Lokio/Path;", "", "close", "()V", "Lcoil/disk/DiskLruCache$Editor;", "closeAndEdit", "()Lcoil/disk/DiskLruCache$Editor;", "a", "Lcoil/disk/DiskLruCache$Entry;", "getEntry", "()Lcoil/disk/DiskLruCache$Entry;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Snapshot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    public final class Snapshot implements Closeable {
        public final Entry a;
        public boolean b;
        public final DiskLruCache c;

        public Snapshot(@NotNull Entry diskLruCache$Entry0) {
            this.a = diskLruCache$Entry0;
        }

        @Override
        public void close() {
            if(!this.b) {
                this.b = true;
                DiskLruCache diskLruCache0 = DiskLruCache.this;
                synchronized(diskLruCache0) {
                    this.a.setLockingSnapshotCount(this.a.getLockingSnapshotCount() - 1);
                    if(this.a.getLockingSnapshotCount() == 0 && this.a.getZombie()) {
                        DiskLruCache.access$removeEntry(diskLruCache0, this.a);
                    }
                }
            }
        }

        @Nullable
        public final Editor closeAndEdit() {
            synchronized(DiskLruCache.this) {
                this.close();
                return DiskLruCache.this.edit(this.a.getKey());
            }
        }

        @NotNull
        public final Path file(int v) {
            if(this.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Path)this.a.getCleanFiles().get(v);
        }

        @NotNull
        public final Entry getEntry() {
            return this.a;
        }
    }

    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String JOURNAL_FILE = "journal";
    @NotNull
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    @NotNull
    public static final String JOURNAL_FILE_TMP = "journal.tmp";
    @NotNull
    public static final String MAGIC = "libcore.io.DiskLruCache";
    @NotNull
    public static final String VERSION = "1";
    public final Path a;
    public final long b;
    public final int c;
    public final int d;
    public final Path e;
    public final Path f;
    public final Path g;
    public final LinkedHashMap h;
    public final CoroutineScope i;
    public long j;
    public int k;
    public BufferedSink l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final coil.disk.DiskLruCache.fileSystem.1 r;
    public static final Regex s;

    static {
        DiskLruCache.Companion = new Companion(null);
        DiskLruCache.s = new Regex("[a-z0-9_-]{1,120}");
    }

    public DiskLruCache(@NotNull FileSystem fileSystem0, @NotNull Path path0, @NotNull CoroutineDispatcher coroutineDispatcher0, long v, int v1, int v2) {
        this.a = path0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        if(v <= 0L) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if(v2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.e = path0.resolve("journal");
        this.f = path0.resolve("journal.tmp");
        this.g = path0.resolve("journal.bkp");
        this.h = new LinkedHashMap(0, 0.75f, true);
        this.i = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(coroutineDispatcher0.limitedParallelism(1)));
        this.r = new ForwardingFileSystem() {  // 初始化器: Lokio/ForwardingFileSystem;-><init>(Lokio/FileSystem;)V
            @Override  // okio.ForwardingFileSystem
            @NotNull
            public Sink sink(@NotNull Path path0, boolean z) {
                Path path1 = path0.parent();
                if(path1 != null) {
                    this.createDirectories(path1);
                }
                return super.sink(path0, z);
            }
        };
    }

    public final void a() {
        if(this.o) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static final void access$completeEdit(DiskLruCache diskLruCache0, Editor diskLruCache$Editor0, boolean z) {
        synchronized(diskLruCache0) {
            Entry diskLruCache$Entry0 = diskLruCache$Editor0.getEntry();
            if(Intrinsics.areEqual(diskLruCache$Entry0.getCurrentEditor(), diskLruCache$Editor0)) {
                if(!z || diskLruCache$Entry0.getZombie()) {
                    int v7 = diskLruCache0.d;
                    for(int v8 = 0; v8 < v7; ++v8) {
                        Path path4 = (Path)diskLruCache$Entry0.getDirtyFiles().get(v8);
                        diskLruCache0.r.delete(path4);
                    }
                }
                else {
                    int v1 = diskLruCache0.d;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        if(diskLruCache$Editor0.getWritten()[v2]) {
                            Path path0 = (Path)diskLruCache$Entry0.getDirtyFiles().get(v2);
                            if(!diskLruCache0.r.exists(path0)) {
                                diskLruCache$Editor0.abort();
                                return;
                            }
                        }
                    }
                    int v3 = diskLruCache0.d;
                    for(int v4 = 0; v4 < v3; ++v4) {
                        Path path1 = (Path)diskLruCache$Entry0.getDirtyFiles().get(v4);
                        Path path2 = (Path)diskLruCache$Entry0.getCleanFiles().get(v4);
                        if(diskLruCache0.r.exists(path1)) {
                            diskLruCache0.r.atomicMove(path1, path2);
                        }
                        else {
                            Path path3 = (Path)diskLruCache$Entry0.getCleanFiles().get(v4);
                            -FileSystems.createFile(diskLruCache0.r, path3);
                        }
                        long v5 = diskLruCache$Entry0.getLengths()[v4];
                        Long long0 = diskLruCache0.r.metadata(path2).getSize();
                        long v6 = long0 == null ? 0L : ((long)long0);
                        diskLruCache$Entry0.getLengths()[v4] = v6;
                        diskLruCache0.j = diskLruCache0.j - v5 + v6;
                    }
                }
                diskLruCache$Entry0.setCurrentEditor(null);
                if(diskLruCache$Entry0.getZombie()) {
                    diskLruCache0.f(diskLruCache$Entry0);
                    return;
                }
                ++diskLruCache0.k;
                BufferedSink bufferedSink0 = diskLruCache0.l;
                Intrinsics.checkNotNull(bufferedSink0);
                if(z || diskLruCache$Entry0.getReadable()) {
                    diskLruCache$Entry0.setReadable(true);
                    bufferedSink0.writeUtf8("CLEAN");
                    bufferedSink0.writeByte(0x20);
                    bufferedSink0.writeUtf8(diskLruCache$Entry0.getKey());
                    diskLruCache$Entry0.writeLengths(bufferedSink0);
                }
                else {
                    diskLruCache0.h.remove(diskLruCache$Entry0.getKey());
                    bufferedSink0.writeUtf8("REMOVE");
                    bufferedSink0.writeByte(0x20);
                    bufferedSink0.writeUtf8(diskLruCache$Entry0.getKey());
                }
                bufferedSink0.writeByte(10);
                bufferedSink0.flush();
                if(diskLruCache0.j > diskLruCache0.b || diskLruCache0.k >= 2000) {
                    diskLruCache0.b();
                }
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final boolean access$journalRewriteRequired(DiskLruCache diskLruCache0) {
        return diskLruCache0.k >= 2000;
    }

    public static final boolean access$removeEntry(DiskLruCache diskLruCache0, Entry diskLruCache$Entry0) {
        diskLruCache0.f(diskLruCache$Entry0);
        return true;
    }

    public static final void access$setHasJournalErrors$p(DiskLruCache diskLruCache0, boolean z) {
        diskLruCache0.m = z;
    }

    public final void b() {
        a a0 = new a(this, null);
        BuildersKt.launch$default(this.i, null, null, a0, 3, null);
    }

    public final void c() {
        long v = 0L;
        Iterator iterator0 = this.h.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Entry diskLruCache$Entry0 = (Entry)object0;
            int v1 = this.d;
            int v2 = 0;
            if(diskLruCache$Entry0.getCurrentEditor() == null) {
                while(v2 < v1) {
                    v += diskLruCache$Entry0.getLengths()[v2];
                    ++v2;
                }
            }
            else {
                diskLruCache$Entry0.setCurrentEditor(null);
                while(v2 < v1) {
                    Path path0 = (Path)diskLruCache$Entry0.getCleanFiles().get(v2);
                    this.r.delete(path0);
                    Path path1 = (Path)diskLruCache$Entry0.getDirtyFiles().get(v2);
                    this.r.delete(path1);
                    ++v2;
                }
                iterator0.remove();
            }
        }
        this.j = v;
    }

    @Override
    public void close() {
        synchronized(this) {
            if(this.n && !this.o) {
                Entry[] arr_diskLruCache$Entry = (Entry[])this.h.values().toArray(new Entry[0]);
                for(int v1 = 0; v1 < arr_diskLruCache$Entry.length; ++v1) {
                    Editor diskLruCache$Editor0 = arr_diskLruCache$Entry[v1].getCurrentEditor();
                    if(diskLruCache$Editor0 != null) {
                        diskLruCache$Editor0.detach();
                    }
                }
                this.g();
                CoroutineScopeKt.cancel$default(this.i, null, 1, null);
                BufferedSink bufferedSink0 = this.l;
                Intrinsics.checkNotNull(bufferedSink0);
                bufferedSink0.close();
                this.l = null;
                this.o = true;
                return;
            }
            this.o = true;
        }
    }

    public final void d() {
        Unit unit0;
        coil.disk.DiskLruCache.fileSystem.1 diskLruCache$fileSystem$10 = this.r;
        Path path0 = this.e;
        BufferedSource bufferedSource0 = Okio.buffer(diskLruCache$fileSystem$10.source(path0));
        Throwable throwable0 = null;
        try {
            String s = bufferedSource0.readUtf8LineStrict();
            String s1 = bufferedSource0.readUtf8LineStrict();
            String s2 = bufferedSource0.readUtf8LineStrict();
            String s3 = bufferedSource0.readUtf8LineStrict();
            String s4 = bufferedSource0.readUtf8LineStrict();
            if(!Intrinsics.areEqual("libcore.io.DiskLruCache", s) || !Intrinsics.areEqual("1", s1) || !Intrinsics.areEqual(String.valueOf(this.c), s2) || !Intrinsics.areEqual(String.valueOf(this.d), s3) || s4.length() > 0) {
                throw new IOException("unexpected journal header: [" + s + ", " + s1 + ", " + s2 + ", " + s3 + ", " + s4 + ']');
            }
            int v = 0;
            try {
                while(true) {
                    this.e(bufferedSource0.readUtf8LineStrict());
                    ++v;
                }
            }
            catch(EOFException unused_ex) {
                this.k = v - this.h.size();
                if(bufferedSource0.exhausted()) {
                    this.l = Okio.buffer(new FaultHidingSink(diskLruCache$fileSystem$10.appendingSink(path0), new b0(this, 25)));
                }
                else {
                    this.i();
                }
                unit0 = Unit.INSTANCE;
                try {
                    bufferedSource0.close();
                }
                catch(Throwable throwable0) {
                }
            }
        }
        catch(Throwable throwable1) {
            if(bufferedSource0 != null) {
                try {
                    bufferedSource0.close();
                }
                catch(Throwable throwable2) {
                    b.addSuppressed(throwable1, throwable2);
                }
            }
            throwable0 = throwable1;
            unit0 = null;
        }
        if(throwable0 != null) {
            throw throwable0;
        }
        Intrinsics.checkNotNull(unit0);
    }

    public final void e(String s) {
        String s1;
        int v = StringsKt__StringsKt.indexOf$default(s, ' ', 0, false, 6, null);
        if(v == -1) {
            throw new IOException("unexpected journal line: " + s);
        }
        int v1 = StringsKt__StringsKt.indexOf$default(s, ' ', v + 1, false, 4, null);
        LinkedHashMap linkedHashMap0 = this.h;
        if(v1 == -1) {
            s1 = s.substring(v + 1);
            Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
            if(v == 6 && p.startsWith$default(s, "REMOVE", false, 2, null)) {
                linkedHashMap0.remove(s1);
                return;
            }
        }
        else {
            s1 = s.substring(v + 1, v1);
            Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        }
        Entry diskLruCache$Entry0 = linkedHashMap0.get(s1);
        if(diskLruCache$Entry0 == null) {
            diskLruCache$Entry0 = new Entry(this, s1);
            linkedHashMap0.put(s1, diskLruCache$Entry0);
        }
        if(v1 != -1 && v == 5 && p.startsWith$default(s, "CLEAN", false, 2, null)) {
            String s2 = s.substring(v1 + 1);
            Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
            List list0 = StringsKt__StringsKt.split$default(s2, new char[]{' '}, false, 0, 6, null);
            diskLruCache$Entry0.setReadable(true);
            diskLruCache$Entry0.setCurrentEditor(null);
            diskLruCache$Entry0.setLengths(list0);
            return;
        }
        if(v1 == -1 && v == 5 && p.startsWith$default(s, "DIRTY", false, 2, null)) {
            diskLruCache$Entry0.setCurrentEditor(new Editor(this, diskLruCache$Entry0));
            return;
        }
        if(v1 != -1 || v != 4 || !p.startsWith$default(s, "READ", false, 2, null)) {
            throw new IOException("unexpected journal line: " + s);
        }
    }

    @Nullable
    public final Editor edit(@NotNull String s) {
        synchronized(this) {
            this.a();
            DiskLruCache.h(s);
            this.initialize();
            Entry diskLruCache$Entry0 = (Entry)this.h.get(s);
            if((diskLruCache$Entry0 == null ? null : diskLruCache$Entry0.getCurrentEditor()) != null) {
                return null;
            }
            if(diskLruCache$Entry0 != null && diskLruCache$Entry0.getLockingSnapshotCount() != 0) {
                return null;
            }
            if(!this.p && !this.q) {
                BufferedSink bufferedSink0 = this.l;
                Intrinsics.checkNotNull(bufferedSink0);
                bufferedSink0.writeUtf8("DIRTY");
                bufferedSink0.writeByte(0x20);
                bufferedSink0.writeUtf8(s);
                bufferedSink0.writeByte(10);
                bufferedSink0.flush();
                if(this.m) {
                    return null;
                }
                if(diskLruCache$Entry0 == null) {
                    diskLruCache$Entry0 = new Entry(this, s);
                    this.h.put(s, diskLruCache$Entry0);
                }
                Editor diskLruCache$Editor0 = new Editor(this, diskLruCache$Entry0);
                diskLruCache$Entry0.setCurrentEditor(diskLruCache$Editor0);
                return diskLruCache$Editor0;
            }
            this.b();
            return null;
        }
    }

    public final void evictAll() {
        synchronized(this) {
            this.initialize();
            Entry[] arr_diskLruCache$Entry = (Entry[])this.h.values().toArray(new Entry[0]);
            for(int v1 = 0; v1 < arr_diskLruCache$Entry.length; ++v1) {
                this.f(arr_diskLruCache$Entry[v1]);
            }
            this.p = false;
        }
    }

    public final void f(Entry diskLruCache$Entry0) {
        if(diskLruCache$Entry0.getLockingSnapshotCount() > 0) {
            BufferedSink bufferedSink0 = this.l;
            if(bufferedSink0 != null) {
                bufferedSink0.writeUtf8("DIRTY");
                bufferedSink0.writeByte(0x20);
                bufferedSink0.writeUtf8(diskLruCache$Entry0.getKey());
                bufferedSink0.writeByte(10);
                bufferedSink0.flush();
            }
        }
        if(diskLruCache$Entry0.getLockingSnapshotCount() <= 0 && diskLruCache$Entry0.getCurrentEditor() == null) {
            for(int v = 0; v < this.d; ++v) {
                Path path0 = (Path)diskLruCache$Entry0.getCleanFiles().get(v);
                this.r.delete(path0);
                this.j -= diskLruCache$Entry0.getLengths()[v];
                diskLruCache$Entry0.getLengths()[v] = 0L;
            }
            ++this.k;
            BufferedSink bufferedSink1 = this.l;
            if(bufferedSink1 != null) {
                bufferedSink1.writeUtf8("REMOVE");
                bufferedSink1.writeByte(0x20);
                bufferedSink1.writeUtf8(diskLruCache$Entry0.getKey());
                bufferedSink1.writeByte(10);
            }
            this.h.remove(diskLruCache$Entry0.getKey());
            if(this.k >= 2000) {
                this.b();
            }
            return;
        }
        diskLruCache$Entry0.setZombie(true);
    }

    @Override
    public void flush() {
        synchronized(this) {
            if(!this.n) {
                return;
            }
            this.a();
            this.g();
            BufferedSink bufferedSink0 = this.l;
            Intrinsics.checkNotNull(bufferedSink0);
            bufferedSink0.flush();
        }
    }

    public final void g() {
        while(this.j > this.b) {
            Iterator iterator0 = this.h.values().iterator();
        label_2:
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Entry diskLruCache$Entry0 = (Entry)object0;
                if(!diskLruCache$Entry0.getZombie()) {
                    this.f(diskLruCache$Entry0);
                    continue;
                }
                goto label_2;
            }
            return;
        }
        this.p = false;
    }

    @Nullable
    public final Snapshot get(@NotNull String s) {
        synchronized(this) {
            this.a();
            DiskLruCache.h(s);
            this.initialize();
            Entry diskLruCache$Entry0 = (Entry)this.h.get(s);
            if(diskLruCache$Entry0 != null) {
                Snapshot diskLruCache$Snapshot0 = diskLruCache$Entry0.snapshot();
                if(diskLruCache$Snapshot0 != null) {
                    ++this.k;
                    BufferedSink bufferedSink0 = this.l;
                    Intrinsics.checkNotNull(bufferedSink0);
                    bufferedSink0.writeUtf8("READ");
                    bufferedSink0.writeByte(0x20);
                    bufferedSink0.writeUtf8(s);
                    bufferedSink0.writeByte(10);
                    if(this.k >= 2000) {
                        this.b();
                    }
                    return diskLruCache$Snapshot0;
                }
            }
            return null;
        }
    }

    public static void h(String s) {
        if(!DiskLruCache.s.matches(s)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + s + '\"').toString());
        }
    }

    public final void i() {
        Throwable throwable0;
        Unit unit0;
        synchronized(this) {
            BufferedSink bufferedSink0 = this.l;
            if(bufferedSink0 != null) {
                bufferedSink0.close();
            }
            BufferedSink bufferedSink1 = Okio.buffer(this.r.sink(this.f, false));
            throwable0 = null;
            try {
                bufferedSink1.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                bufferedSink1.writeUtf8("1").writeByte(10);
                bufferedSink1.writeDecimalLong(((long)this.c)).writeByte(10);
                bufferedSink1.writeDecimalLong(((long)this.d)).writeByte(10);
                bufferedSink1.writeByte(10);
                for(Object object0: this.h.values()) {
                    Entry diskLruCache$Entry0 = (Entry)object0;
                    if(diskLruCache$Entry0.getCurrentEditor() == null) {
                        bufferedSink1.writeUtf8("CLEAN");
                        bufferedSink1.writeByte(0x20);
                        bufferedSink1.writeUtf8(diskLruCache$Entry0.getKey());
                        diskLruCache$Entry0.writeLengths(bufferedSink1);
                    }
                    else {
                        bufferedSink1.writeUtf8("DIRTY");
                        bufferedSink1.writeByte(0x20);
                        bufferedSink1.writeUtf8(diskLruCache$Entry0.getKey());
                    }
                    bufferedSink1.writeByte(10);
                }
                unit0 = Unit.INSTANCE;
                goto label_39;
            label_31:
                if(bufferedSink1 != null) {
                    goto label_32;
                }
                unit0 = null;
                throwable0 = throwable1;
                goto label_42;
            }
            catch(Throwable throwable1) {
                goto label_31;
            }
            try {
            label_32:
                bufferedSink1.close();
            }
            catch(Throwable throwable2) {
                b.addSuppressed(throwable1, throwable2);
            }
            unit0 = null;
            throwable0 = throwable1;
            goto label_42;
            try {
            label_39:
                bufferedSink1.close();
            }
            catch(Throwable throwable0) {
            }
        label_42:
            if(throwable0 == null) {
                Intrinsics.checkNotNull(unit0);
                if(this.r.exists(this.e)) {
                    this.r.atomicMove(this.e, this.g);
                    this.r.atomicMove(this.f, this.e);
                    this.r.delete(this.g);
                }
                else {
                    this.r.atomicMove(this.f, this.e);
                }
                this.l = Okio.buffer(new FaultHidingSink(this.r.appendingSink(this.e), new b0(this, 25)));
                this.k = 0;
                this.m = false;
                this.q = false;
                return;
            }
        }
        throw throwable0;
    }

    public final void initialize() {
        synchronized(this) {
            if(this.n) {
                return;
            }
            this.r.delete(this.f);
            if(this.r.exists(this.g)) {
                if(this.r.exists(this.e)) {
                    this.r.delete(this.g);
                }
                else {
                    this.r.atomicMove(this.g, this.e);
                }
            }
            if(this.r.exists(this.e)) {
                try {
                    this.d();
                    this.c();
                    this.n = true;
                    return;
                }
                catch(IOException unused_ex) {
                    try {
                        this.close();
                        -FileSystems.deleteContents(this.r, this.a);
                        this.o = false;
                    }
                    catch(Throwable throwable0) {
                        this.o = false;
                        throw throwable0;
                    }
                }
            }
            this.i();
            this.n = true;
        }
    }

    public final boolean remove(@NotNull String s) {
        synchronized(this) {
            this.a();
            DiskLruCache.h(s);
            this.initialize();
            Entry diskLruCache$Entry0 = (Entry)this.h.get(s);
            if(diskLruCache$Entry0 == null) {
                return false;
            }
            this.f(diskLruCache$Entry0);
            if(this.j <= this.b) {
                this.p = false;
            }
            return true;
        }
    }

    public final long size() {
        synchronized(this) {
            this.initialize();
            return this.j;
        }
    }
}

