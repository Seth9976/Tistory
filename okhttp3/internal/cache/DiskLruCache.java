package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import m0.b0;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010)\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0004UVWXB9\b\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u001E\u0010\u0018\u001A\b\u0018\u00010\u0017R\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u0015H\u0086\u0002\u00A2\u0006\u0004\b\u0018\u0010\u0019J\'\u0010\u001C\u001A\b\u0018\u00010\u001BR\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u001A\u001A\u00020\nH\u0007\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\r\u0010\u001E\u001A\u00020\n\u00A2\u0006\u0004\b\u001E\u0010\u001FJ#\u0010%\u001A\u00020\u00102\n\u0010 \u001A\u00060\u001BR\u00020\u00002\u0006\u0010\"\u001A\u00020!H\u0000\u00A2\u0006\u0004\b#\u0010$J\u0015\u0010&\u001A\u00020!2\u0006\u0010\u0016\u001A\u00020\u0015\u00A2\u0006\u0004\b&\u0010\'J\u001B\u0010,\u001A\u00020!2\n\u0010)\u001A\u00060(R\u00020\u0000H\u0000\u00A2\u0006\u0004\b*\u0010+J\u000F\u0010-\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b-\u0010\u0012J\r\u0010.\u001A\u00020!\u00A2\u0006\u0004\b.\u0010/J\u000F\u00100\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b0\u0010\u0012J\r\u00101\u001A\u00020\u0010\u00A2\u0006\u0004\b1\u0010\u0012J\r\u00102\u001A\u00020\u0010\u00A2\u0006\u0004\b2\u0010\u0012J\r\u00103\u001A\u00020\u0010\u00A2\u0006\u0004\b3\u0010\u0012J\u0017\u00105\u001A\f\u0012\b\u0012\u00060\u0017R\u00020\u000004\u00A2\u0006\u0004\b5\u00106R\u001A\u0010\u0004\u001A\u00020\u00038\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>R\u001A\u0010\t\u001A\u00020\u00078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010BR*\u0010\u000B\u001A\u00020\n2\u0006\u0010C\u001A\u00020\n8F@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bD\u0010E\u001A\u0004\bF\u0010\u001F\"\u0004\bG\u0010HR*\u0010N\u001A\u0012\u0012\u0004\u0012\u00020\u0015\u0012\b\u0012\u00060(R\u00020\u00000I8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010MR\"\u0010T\u001A\u00020!8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010/\"\u0004\bR\u0010S\u00A8\u0006Y"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "Ljava/io/File;", "directory", "", "appVersion", "valueCount", "", "maxSize", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "", "initialize", "()V", "rebuildJournal$okhttp", "rebuildJournal", "", "key", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "(Ljava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "(Ljava/lang/String;J)Lokhttp3/internal/cache/DiskLruCache$Editor;", "size", "()J", "editor", "", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "(Ljava/lang/String;)Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", "()Z", "close", "trimToSize", "delete", "evictAll", "", "snapshots", "()Ljava/util/Iterator;", "a", "Lokhttp3/internal/io/FileSystem;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "b", "Ljava/io/File;", "getDirectory", "()Ljava/io/File;", "d", "I", "getValueCount$okhttp", "()I", "value", "e", "J", "getMaxSize", "setMaxSize", "(J)V", "Ljava/util/LinkedHashMap;", "k", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "lruEntries", "p", "Z", "getClosed$okhttp", "setClosed$okhttp", "(Z)V", "closed", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1065:1\n1#2:1066\n608#3,4:1067\n37#4,2:1071\n37#4,2:1073\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n*L\n215#1:1067,4\n672#1:1071,2\n721#1:1073,2\n*E\n"})
public final class DiskLruCache implements Closeable, Flushable {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001A\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001A\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000B\u001A\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000B\u0010\u0007R\u0014\u0010\r\u001A\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000ER\u0014\u0010\u000F\u001A\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000F\u0010\u0007R\u0014\u0010\u0010\u001A\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001A\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001A\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lkotlin/text/Regex;", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "VERSION_1", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001A\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\n\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000E\u001A\u0004\u0018\u00010\r2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0011\u001A\u00020\u00102\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\u0007¢\u0006\u0004\b\u0013\u0010\tJ\r\u0010\u0014\u001A\u00020\u0007¢\u0006\u0004\b\u0014\u0010\tR\u001E\u0010\u0004\u001A\u00060\u0002R\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u001C\u0010\u001E\u001A\u0004\u0018\u00010\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "", "detach$okhttp", "()V", "detach", "", "index", "Lokio/Source;", "newSource", "(I)Lokio/Source;", "Lokio/Sink;", "newSink", "(I)Lokio/Sink;", "commit", "abort", "a", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "b", "[Z", "getWritten$okhttp", "()[Z", "written", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public final class Editor {
        public final Entry a;
        public final boolean[] b;
        public boolean c;
        public final DiskLruCache d;

        public Editor(@NotNull Entry diskLruCache$Entry0) {
            Intrinsics.checkNotNullParameter(diskLruCache$Entry0, "entry");
            this.d = diskLruCache0;
            super();
            this.a = diskLruCache$Entry0;
            this.b = diskLruCache$Entry0.getReadable$okhttp() ? null : new boolean[diskLruCache0.getValueCount$okhttp()];
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache0 = this.d;
            synchronized(diskLruCache0) {
                if(!this.c) {
                    if(Intrinsics.areEqual(this.a.getCurrentEditor$okhttp(), this)) {
                        diskLruCache0.completeEdit$okhttp(this, false);
                    }
                    this.c = true;
                    return;
                }
            }
            throw new IllegalStateException("Check failed.");
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache0 = this.d;
            synchronized(diskLruCache0) {
                if(!this.c) {
                    if(Intrinsics.areEqual(this.a.getCurrentEditor$okhttp(), this)) {
                        diskLruCache0.completeEdit$okhttp(this, true);
                    }
                    this.c = true;
                    return;
                }
            }
            throw new IllegalStateException("Check failed.");
        }

        public final void detach$okhttp() {
            Entry diskLruCache$Entry0 = this.a;
            if(Intrinsics.areEqual(diskLruCache$Entry0.getCurrentEditor$okhttp(), this)) {
                DiskLruCache diskLruCache0 = this.d;
                if(diskLruCache0.n) {
                    diskLruCache0.completeEdit$okhttp(this, false);
                    return;
                }
                diskLruCache$Entry0.setZombie$okhttp(true);
            }
        }

        @NotNull
        public final Entry getEntry$okhttp() {
            return this.a;
        }

        @Nullable
        public final boolean[] getWritten$okhttp() {
            return this.b;
        }

        @NotNull
        public final Sink newSink(int v) {
            Sink sink1;
            DiskLruCache diskLruCache0 = this.d;
            synchronized(diskLruCache0) {
                if(!this.c) {
                    if(!Intrinsics.areEqual(this.a.getCurrentEditor$okhttp(), this)) {
                        return Okio.blackhole();
                    }
                    if(!this.a.getReadable$okhttp()) {
                        Intrinsics.checkNotNull(this.b);
                        this.b[v] = true;
                    }
                    File file0 = (File)this.a.getDirtyFiles$okhttp().get(v);
                    try {
                        sink1 = diskLruCache0.getFileSystem$okhttp().sink(file0);
                    }
                    catch(FileNotFoundException unused_ex) {
                        return Okio.blackhole();
                    }
                    return new FaultHidingSink(sink1, new a(diskLruCache0, this));
                }
            }
            throw new IllegalStateException("Check failed.");
        }

        @Nullable
        public final Source newSource(int v) {
            Source source0 = null;
            DiskLruCache diskLruCache0 = this.d;
            synchronized(diskLruCache0) {
                if(!this.c) {
                    if(this.a.getReadable$okhttp() && Intrinsics.areEqual(this.a.getCurrentEditor$okhttp(), this) && !this.a.getZombie$okhttp()) {
                        try {
                            source0 = diskLruCache0.getFileSystem$okhttp().source(((File)this.a.getCleanFiles$okhttp().get(v)));
                        }
                        catch(FileNotFoundException unused_ex) {
                        }
                        return source0;
                    }
                    return null;
                }
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\u000B\u001A\u00020\b2\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000\u00A2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\fH\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0015\u001A\b\u0018\u00010\u0011R\u00020\u0012H\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001F\u001A\u00020\u001A8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER \u0010&\u001A\b\u0012\u0004\u0012\u00020!0 8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R \u0010)\u001A\b\u0012\u0004\u0012\u00020!0 8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\'\u0010#\u001A\u0004\b(\u0010%R\"\u00101\u001A\u00020*8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001A\u00020*8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b2\u0010,\u001A\u0004\b3\u0010.\"\u0004\b4\u00100R(\u0010=\u001A\b\u0018\u000106R\u00020\u00128\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b7\u00108\u001A\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001A\u00020>8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b?\u0010@\u001A\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001A\u00020F8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bG\u0010H\u001A\u0004\bI\u0010J\"\u0004\bK\u0010L\u00A8\u0006N"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "key", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "", "strings", "", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lokio/BufferedSink;", "writer", "writeLengths$okhttp", "(Lokio/BufferedSink;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "a", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "", "b", "[J", "getLengths$okhttp", "()[J", "lengths", "", "Ljava/io/File;", "c", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "cleanFiles", "d", "getDirtyFiles$okhttp", "dirtyFiles", "", "e", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "readable", "f", "getZombie$okhttp", "setZombie$okhttp", "zombie", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "g", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "currentEditor", "", "h", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "lockingSourceCount", "", "i", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "sequenceNumber", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n*L\n1001#1:1066,4\n*E\n"})
    public final class Entry {
        public final String a;
        public final long[] b;
        public final ArrayList c;
        public final ArrayList d;
        public boolean e;
        public boolean f;
        public Editor g;
        public int h;
        public long i;
        public final DiskLruCache j;

        public Entry(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "key");
            this.j = diskLruCache0;
            super();
            this.a = s;
            this.b = new long[diskLruCache0.getValueCount$okhttp()];
            this.c = new ArrayList();
            this.d = new ArrayList();
            StringBuilder stringBuilder0 = new StringBuilder(s);
            stringBuilder0.append('.');
            int v = stringBuilder0.length();
            int v1 = diskLruCache0.getValueCount$okhttp();
            for(int v2 = 0; v2 < v1; ++v2) {
                stringBuilder0.append(v2);
                File file0 = new File(this.j.getDirectory(), stringBuilder0.toString());
                this.c.add(file0);
                stringBuilder0.append(".tmp");
                File file1 = new File(this.j.getDirectory(), stringBuilder0.toString());
                this.d.add(file1);
                stringBuilder0.setLength(v);
            }
        }

        @NotNull
        public final List getCleanFiles$okhttp() {
            return this.c;
        }

        @Nullable
        public final Editor getCurrentEditor$okhttp() {
            return this.g;
        }

        @NotNull
        public final List getDirtyFiles$okhttp() {
            return this.d;
        }

        @NotNull
        public final String getKey$okhttp() {
            return this.a;
        }

        @NotNull
        public final long[] getLengths$okhttp() {
            return this.b;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.h;
        }

        public final boolean getReadable$okhttp() {
            return this.e;
        }

        public final long getSequenceNumber$okhttp() {
            return this.i;
        }

        public final boolean getZombie$okhttp() {
            return this.f;
        }

        public final void setCurrentEditor$okhttp(@Nullable Editor diskLruCache$Editor0) {
            this.g = diskLruCache$Editor0;
        }

        public final void setLengths$okhttp(@NotNull List list0) throws IOException {
            Intrinsics.checkNotNullParameter(list0, "strings");
            if(list0.size() == this.j.getValueCount$okhttp()) {
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

        public final void setLockingSourceCount$okhttp(int v) {
            this.h = v;
        }

        public final void setReadable$okhttp(boolean z) {
            this.e = z;
        }

        public final void setSequenceNumber$okhttp(long v) {
            this.i = v;
        }

        public final void setZombie$okhttp(boolean z) {
            this.f = z;
        }

        @Nullable
        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache0 = this.j;
            if(Util.assertionsEnabled && !Thread.holdsLock(diskLruCache0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-2297 MUST hold lock on " + diskLruCache0);
            }
            if(!this.e) {
                return null;
            }
            if(!diskLruCache0.n && (this.g != null || this.f)) {
                return null;
            }
            ArrayList arrayList0 = new ArrayList();
            long[] arr_v = (long[])this.b.clone();
            try {
                int v = diskLruCache0.getValueCount$okhttp();
                for(int v1 = 0; v1 < v; ++v1) {
                    Source source0 = diskLruCache0.getFileSystem$okhttp().source(((File)this.c.get(v1)));
                    if(!diskLruCache0.n) {
                        ++this.h;
                        source0 = new DiskLruCache.Entry.newSource.1(source0, diskLruCache0, this);
                    }
                    arrayList0.add(source0);
                }
                return new Snapshot(this.j, this.a, this.i, arrayList0, arr_v);
            }
            catch(FileNotFoundException unused_ex) {
                for(Object object0: arrayList0) {
                    Util.closeQuietly(((Source)object0));
                }
                try {
                    diskLruCache0.removeEntry$okhttp(this);
                }
                catch(IOException unused_ex) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(@NotNull BufferedSink bufferedSink0) throws IOException {
            Intrinsics.checkNotNullParameter(bufferedSink0, "writer");
            long[] arr_v = this.b;
            for(int v = 0; v < arr_v.length; ++v) {
                long v1 = arr_v[v];
                bufferedSink0.writeByte(0x20).writeDecimalLong(v1);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\rJ\u0013\u0010\u0010\u001A\b\u0018\u00010\u000ER\u00020\u000F¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001A\u00020\u00072\u0006\u0010\u0013\u001A\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "key", "", "sequenceNumber", "", "Lokio/Source;", "sources", "", "lengths", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "()Ljava/lang/String;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "index", "getSource", "(I)Lokio/Source;", "getLength", "(I)J", "", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public final class Snapshot implements Closeable {
        public final String a;
        public final long b;
        public final List c;
        public final long[] d;
        public final DiskLruCache e;

        public Snapshot(@NotNull String s, long v, @NotNull List list0, @NotNull long[] arr_v) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(list0, "sources");
            Intrinsics.checkNotNullParameter(arr_v, "lengths");
            this.e = diskLruCache0;
            super();
            this.a = s;
            this.b = v;
            this.c = list0;
            this.d = arr_v;
        }

        @Override
        public void close() {
            for(Object object0: this.c) {
                Util.closeQuietly(((Source)object0));
            }
        }

        @Nullable
        public final Editor edit() throws IOException {
            return this.e.edit(this.a, this.b);
        }

        public final long getLength(int v) {
            return this.d[v];
        }

        @NotNull
        public final Source getSource(int v) {
            return (Source)this.c.get(v);
        }

        @NotNull
        public final String key() {
            return this.a;
        }
    }

    @JvmField
    public static final long ANY_SEQUENCE_NUMBER;
    @JvmField
    @NotNull
    public static final String CLEAN;
    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final String DIRTY;
    @JvmField
    @NotNull
    public static final String JOURNAL_FILE;
    @JvmField
    @NotNull
    public static final String JOURNAL_FILE_BACKUP;
    @JvmField
    @NotNull
    public static final String JOURNAL_FILE_TEMP;
    @JvmField
    @NotNull
    public static final Regex LEGAL_KEY_PATTERN;
    @JvmField
    @NotNull
    public static final String MAGIC;
    @JvmField
    @NotNull
    public static final String READ;
    @JvmField
    @NotNull
    public static final String REMOVE;
    @JvmField
    @NotNull
    public static final String VERSION_1;
    public final FileSystem a;
    public final File b;
    public final int c;
    public final int d;
    public long e;
    public final File f;
    public final File g;
    public final File h;
    public long i;
    public BufferedSink j;
    public final LinkedHashMap k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long s;
    public final TaskQueue t;
    public final okhttp3.internal.cache.DiskLruCache.cleanupTask.1 u;

    static {
        DiskLruCache.Companion = new Companion(null);
        DiskLruCache.JOURNAL_FILE = "journal";
        DiskLruCache.JOURNAL_FILE_TEMP = "journal.tmp";
        DiskLruCache.JOURNAL_FILE_BACKUP = "journal.bkp";
        DiskLruCache.MAGIC = "libcore.io.DiskLruCache";
        DiskLruCache.VERSION_1 = "1";
        DiskLruCache.ANY_SEQUENCE_NUMBER = -1L;
        DiskLruCache.LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
        DiskLruCache.CLEAN = "CLEAN";
        DiskLruCache.DIRTY = "DIRTY";
        DiskLruCache.REMOVE = "REMOVE";
        DiskLruCache.READ = "READ";
    }

    public DiskLruCache(@NotNull FileSystem fileSystem0, @NotNull File file0, int v, int v1, long v2, @NotNull TaskRunner taskRunner0) {
        Intrinsics.checkNotNullParameter(fileSystem0, "fileSystem");
        Intrinsics.checkNotNullParameter(file0, "directory");
        Intrinsics.checkNotNullParameter(taskRunner0, "taskRunner");
        super();
        this.a = fileSystem0;
        this.b = file0;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.k = new LinkedHashMap(0, 0.75f, true);
        this.t = taskRunner0.newQueue();
        this.u = new Task("null Cache") {
            public final DiskLruCache e;

            {
                this.e = diskLruCache0;
                super(s, false, 2, null);
            }

            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                DiskLruCache diskLruCache0 = this.e;
                synchronized(diskLruCache0) {
                    if(diskLruCache0.o && !diskLruCache0.getClosed$okhttp()) {
                        try {
                            diskLruCache0.trimToSize();
                        }
                        catch(IOException unused_ex) {
                            DiskLruCache.access$setMostRecentTrimFailed$p(diskLruCache0, true);
                        }
                        try {
                            if(DiskLruCache.access$journalRebuildRequired(diskLruCache0)) {
                                diskLruCache0.rebuildJournal$okhttp();
                                DiskLruCache.access$setRedundantOpCount$p(diskLruCache0, 0);
                            }
                        }
                        catch(IOException unused_ex) {
                            DiskLruCache.access$setMostRecentRebuildFailed$p(diskLruCache0, true);
                            diskLruCache0.j = Okio.buffer(Okio.blackhole());
                        }
                        return -1L;
                    }
                    return -1L;
                }
            }
        };
        if(v2 <= 0L) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if(v1 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f = new File(file0, "journal");
        this.g = new File(file0, "journal.tmp");
        this.h = new File(file0, "journal.bkp");
    }

    public final void a() {
        synchronized(this) {
            if(!this.p) {
                return;
            }
        }
        throw new IllegalStateException("cache is closed");
    }

    public static final boolean access$journalRebuildRequired(DiskLruCache diskLruCache0) {
        return diskLruCache0.b();
    }

    public static final void access$setHasJournalErrors$p(DiskLruCache diskLruCache0, boolean z) {
        diskLruCache0.m = z;
    }

    public static final void access$setMostRecentRebuildFailed$p(DiskLruCache diskLruCache0, boolean z) {
        diskLruCache0.r = z;
    }

    public static final void access$setMostRecentTrimFailed$p(DiskLruCache diskLruCache0, boolean z) {
        diskLruCache0.q = z;
    }

    public static final void access$setRedundantOpCount$p(DiskLruCache diskLruCache0, int v) {
        diskLruCache0.l = v;
    }

    public final boolean b() {
        return this.l >= 2000 && this.l >= this.k.size();
    }

    public final void c() {
        FileSystem fileSystem0 = this.a;
        fileSystem0.delete(this.g);
        Iterator iterator0 = this.k.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Intrinsics.checkNotNullExpressionValue(object0, "i.next()");
            Entry diskLruCache$Entry0 = (Entry)object0;
            int v = this.d;
            int v1 = 0;
            if(diskLruCache$Entry0.getCurrentEditor$okhttp() == null) {
                while(v1 < v) {
                    this.i += diskLruCache$Entry0.getLengths$okhttp()[v1];
                    ++v1;
                }
            }
            else {
                diskLruCache$Entry0.setCurrentEditor$okhttp(null);
                while(v1 < v) {
                    fileSystem0.delete(((File)diskLruCache$Entry0.getCleanFiles$okhttp().get(v1)));
                    fileSystem0.delete(((File)diskLruCache$Entry0.getDirtyFiles$okhttp().get(v1)));
                    ++v1;
                }
                iterator0.remove();
            }
        }
    }

    @Override
    public void close() throws IOException {
        synchronized(this) {
            if(this.o && !this.p) {
                Collection collection0 = this.k.values();
                Intrinsics.checkNotNullExpressionValue(collection0, "lruEntries.values");
                Entry[] arr_diskLruCache$Entry = (Entry[])collection0.toArray(new Entry[0]);
                for(int v1 = 0; v1 < arr_diskLruCache$Entry.length; ++v1) {
                    Entry diskLruCache$Entry0 = arr_diskLruCache$Entry[v1];
                    if(diskLruCache$Entry0.getCurrentEditor$okhttp() != null) {
                        Editor diskLruCache$Editor0 = diskLruCache$Entry0.getCurrentEditor$okhttp();
                        if(diskLruCache$Editor0 != null) {
                            diskLruCache$Editor0.detach$okhttp();
                        }
                    }
                }
                this.trimToSize();
                BufferedSink bufferedSink0 = this.j;
                Intrinsics.checkNotNull(bufferedSink0);
                bufferedSink0.close();
                this.j = null;
                this.p = true;
                return;
            }
            this.p = true;
        }
    }

    public final void completeEdit$okhttp(@NotNull Editor diskLruCache$Editor0, boolean z) throws IOException {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(diskLruCache$Editor0, "editor");
            Entry diskLruCache$Entry0 = diskLruCache$Editor0.getEntry$okhttp();
            if(Intrinsics.areEqual(diskLruCache$Entry0.getCurrentEditor$okhttp(), diskLruCache$Editor0)) {
                if(z && !diskLruCache$Entry0.getReadable$okhttp()) {
                    int v2 = this.d;
                    int v3 = 0;
                    while(v3 < v2) {
                        boolean[] arr_z = diskLruCache$Editor0.getWritten$okhttp();
                        Intrinsics.checkNotNull(arr_z);
                        if(arr_z[v3]) {
                            File file0 = (File)diskLruCache$Entry0.getDirtyFiles$okhttp().get(v3);
                            if(!this.a.exists(file0)) {
                                diskLruCache$Editor0.abort();
                                return;
                            }
                            ++v3;
                            continue;
                        }
                        diskLruCache$Editor0.abort();
                        throw new IllegalStateException("Newly created entry didn\'t create value for index " + v3);
                    }
                }
                int v4 = this.d;
                for(int v1 = 0; v1 < v4; ++v1) {
                    File file1 = (File)diskLruCache$Entry0.getDirtyFiles$okhttp().get(v1);
                    if(!z || diskLruCache$Entry0.getZombie$okhttp()) {
                        this.a.delete(file1);
                    }
                    else if(this.a.exists(file1)) {
                        File file2 = (File)diskLruCache$Entry0.getCleanFiles$okhttp().get(v1);
                        this.a.rename(file1, file2);
                        long v5 = diskLruCache$Entry0.getLengths$okhttp()[v1];
                        long v6 = this.a.size(file2);
                        diskLruCache$Entry0.getLengths$okhttp()[v1] = v6;
                        this.i = this.i - v5 + v6;
                    }
                }
                diskLruCache$Entry0.setCurrentEditor$okhttp(null);
                if(diskLruCache$Entry0.getZombie$okhttp()) {
                    this.removeEntry$okhttp(diskLruCache$Entry0);
                    return;
                }
                ++this.l;
                BufferedSink bufferedSink0 = this.j;
                Intrinsics.checkNotNull(bufferedSink0);
                if(diskLruCache$Entry0.getReadable$okhttp() || z) {
                    diskLruCache$Entry0.setReadable$okhttp(true);
                    bufferedSink0.writeUtf8("CLEAN").writeByte(0x20);
                    bufferedSink0.writeUtf8(diskLruCache$Entry0.getKey$okhttp());
                    diskLruCache$Entry0.writeLengths$okhttp(bufferedSink0);
                    bufferedSink0.writeByte(10);
                    if(z) {
                        long v7 = this.s;
                        this.s = v7 + 1L;
                        diskLruCache$Entry0.setSequenceNumber$okhttp(v7);
                    }
                }
                else {
                    this.k.remove(diskLruCache$Entry0.getKey$okhttp());
                    bufferedSink0.writeUtf8("REMOVE").writeByte(0x20);
                    bufferedSink0.writeUtf8(diskLruCache$Entry0.getKey$okhttp());
                    bufferedSink0.writeByte(10);
                }
                bufferedSink0.flush();
                if(this.i > this.e || this.b()) {
                    TaskQueue.schedule$default(this.t, this.u, 0L, 2, null);
                }
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void d() {
        File file0 = this.f;
        FileSystem fileSystem0 = this.a;
        BufferedSource bufferedSource0 = Okio.buffer(fileSystem0.source(file0));
        try {
            String s = bufferedSource0.readUtf8LineStrict();
            String s1 = bufferedSource0.readUtf8LineStrict();
            String s2 = bufferedSource0.readUtf8LineStrict();
            String s3 = bufferedSource0.readUtf8LineStrict();
            String s4 = bufferedSource0.readUtf8LineStrict();
            if(!Intrinsics.areEqual("libcore.io.DiskLruCache", s) || !Intrinsics.areEqual("1", s1) || !Intrinsics.areEqual(String.valueOf(this.c), s2) || !Intrinsics.areEqual(String.valueOf(this.d), s3) || s4.length() > 0) {
                throw new IOException("unexpected journal header: [" + s + ", " + s1 + ", " + s3 + ", " + s4 + ']');
            }
            int v = 0;
            try {
                while(true) {
                    this.e(bufferedSource0.readUtf8LineStrict());
                    ++v;
                }
            }
            catch(EOFException unused_ex) {
            }
            this.l = v - this.k.size();
            if(bufferedSource0.exhausted()) {
                this.j = Okio.buffer(new FaultHidingSink(fileSystem0.appendingSink(file0), new b0(this, 8)));
            }
            else {
                this.rebuildJournal$okhttp();
            }
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(bufferedSource0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(bufferedSource0, null);
    }

    public final void delete() throws IOException {
        this.close();
        this.a.deleteContents(this.b);
    }

    public final void e(String s) {
        String s1;
        int v = StringsKt__StringsKt.indexOf$default(s, ' ', 0, false, 6, null);
        if(v == -1) {
            throw new IOException("unexpected journal line: " + s);
        }
        int v1 = StringsKt__StringsKt.indexOf$default(s, ' ', v + 1, false, 4, null);
        LinkedHashMap linkedHashMap0 = this.k;
        if(v1 == -1) {
            s1 = s.substring(v + 1);
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).substring(startIndex)");
            if(v == 6 && p.startsWith$default(s, "REMOVE", false, 2, null)) {
                linkedHashMap0.remove(s1);
                return;
            }
        }
        else {
            s1 = s.substring(v + 1, v1);
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry diskLruCache$Entry0 = (Entry)linkedHashMap0.get(s1);
        if(diskLruCache$Entry0 == null) {
            diskLruCache$Entry0 = new Entry(this, s1);
            linkedHashMap0.put(s1, diskLruCache$Entry0);
        }
        if(v1 != -1 && (v == 5 && p.startsWith$default(s, "CLEAN", false, 2, null))) {
            String s2 = s.substring(v1 + 1);
            Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String).substring(startIndex)");
            List list0 = StringsKt__StringsKt.split$default(s2, new char[]{' '}, false, 0, 6, null);
            diskLruCache$Entry0.setReadable$okhttp(true);
            diskLruCache$Entry0.setCurrentEditor$okhttp(null);
            diskLruCache$Entry0.setLengths$okhttp(list0);
            return;
        }
        if(v1 == -1 && (v == 5 && p.startsWith$default(s, "DIRTY", false, 2, null))) {
            diskLruCache$Entry0.setCurrentEditor$okhttp(new Editor(this, diskLruCache$Entry0));
            return;
        }
        if(v1 != -1 || (v != 4 || !p.startsWith$default(s, "READ", false, 2, null))) {
            throw new IOException("unexpected journal line: " + s);
        }
    }

    @JvmOverloads
    @Nullable
    public final Editor edit(@NotNull String s) throws IOException {
        Intrinsics.checkNotNullParameter(s, "key");
        return DiskLruCache.edit$default(this, s, 0L, 2, null);
    }

    @JvmOverloads
    @Nullable
    public final Editor edit(@NotNull String s, long v) throws IOException {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(s, "key");
            this.initialize();
            this.a();
            DiskLruCache.f(s);
            Entry diskLruCache$Entry0 = (Entry)this.k.get(s);
            if(Long.compare(v, DiskLruCache.ANY_SEQUENCE_NUMBER) != 0 && (diskLruCache$Entry0 == null || diskLruCache$Entry0.getSequenceNumber$okhttp() != v)) {
                return null;
            }
            if((diskLruCache$Entry0 == null ? null : diskLruCache$Entry0.getCurrentEditor$okhttp()) != null) {
                return null;
            }
            if(diskLruCache$Entry0 != null && diskLruCache$Entry0.getLockingSourceCount$okhttp() != 0) {
                return null;
            }
            if(!this.q && !this.r) {
                BufferedSink bufferedSink0 = this.j;
                Intrinsics.checkNotNull(bufferedSink0);
                bufferedSink0.writeUtf8("DIRTY").writeByte(0x20).writeUtf8(s).writeByte(10);
                bufferedSink0.flush();
                if(this.m) {
                    return null;
                }
                if(diskLruCache$Entry0 == null) {
                    diskLruCache$Entry0 = new Entry(this, s);
                    this.k.put(s, diskLruCache$Entry0);
                }
                Editor diskLruCache$Editor0 = new Editor(this, diskLruCache$Entry0);
                diskLruCache$Entry0.setCurrentEditor$okhttp(diskLruCache$Editor0);
                return diskLruCache$Editor0;
            }
            TaskQueue.schedule$default(this.t, this.u, 0L, 2, null);
            return null;
        }
    }

    public static Editor edit$default(DiskLruCache diskLruCache0, String s, long v, int v1, Object object0) throws IOException {
        if((v1 & 2) != 0) {
            v = DiskLruCache.ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache0.edit(s, v);
    }

    public final void evictAll() throws IOException {
        synchronized(this) {
            this.initialize();
            Collection collection0 = this.k.values();
            Intrinsics.checkNotNullExpressionValue(collection0, "lruEntries.values");
            Entry[] arr_diskLruCache$Entry = (Entry[])collection0.toArray(new Entry[0]);
            for(int v1 = 0; v1 < arr_diskLruCache$Entry.length; ++v1) {
                Entry diskLruCache$Entry0 = arr_diskLruCache$Entry[v1];
                Intrinsics.checkNotNullExpressionValue(diskLruCache$Entry0, "entry");
                this.removeEntry$okhttp(diskLruCache$Entry0);
            }
            this.q = false;
        }
    }

    public static void f(String s) {
        if(!DiskLruCache.LEGAL_KEY_PATTERN.matches(s)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + s + '\"').toString());
        }
    }

    @Override
    public void flush() throws IOException {
        synchronized(this) {
            if(!this.o) {
                return;
            }
            this.a();
            this.trimToSize();
            BufferedSink bufferedSink0 = this.j;
            Intrinsics.checkNotNull(bufferedSink0);
            bufferedSink0.flush();
        }
    }

    @Nullable
    public final Snapshot get(@NotNull String s) throws IOException {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(s, "key");
            this.initialize();
            this.a();
            DiskLruCache.f(s);
            Entry diskLruCache$Entry0 = (Entry)this.k.get(s);
            if(diskLruCache$Entry0 == null) {
                return null;
            }
            Snapshot diskLruCache$Snapshot0 = diskLruCache$Entry0.snapshot$okhttp();
            if(diskLruCache$Snapshot0 == null) {
                return null;
            }
            ++this.l;
            BufferedSink bufferedSink0 = this.j;
            Intrinsics.checkNotNull(bufferedSink0);
            bufferedSink0.writeUtf8("READ").writeByte(0x20).writeUtf8(s).writeByte(10);
            if(this.b()) {
                TaskQueue.schedule$default(this.t, this.u, 0L, 2, null);
            }
            return diskLruCache$Snapshot0;
        }
    }

    public final boolean getClosed$okhttp() {
        return this.p;
    }

    @NotNull
    public final File getDirectory() {
        return this.b;
    }

    @NotNull
    public final FileSystem getFileSystem$okhttp() {
        return this.a;
    }

    @NotNull
    public final LinkedHashMap getLruEntries$okhttp() {
        return this.k;
    }

    public final long getMaxSize() {
        synchronized(this) {
        }
        return this.e;
    }

    public final int getValueCount$okhttp() {
        return this.d;
    }

    public final void initialize() throws IOException {
        synchronized(this) {
            if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-2354 MUST hold lock on " + this);
            }
            if(this.o) {
                return;
            }
            if(this.a.exists(this.h)) {
                if(this.a.exists(this.f)) {
                    this.a.delete(this.h);
                }
                else {
                    this.a.rename(this.h, this.f);
                }
            }
            this.n = Util.isCivilized(this.a, this.h);
            if(this.a.exists(this.f)) {
                try {
                    this.d();
                    this.c();
                    this.o = true;
                    return;
                }
                catch(IOException iOException0) {
                    Platform.Companion.get().log("DiskLruCache " + this.b + " is corrupt: " + iOException0.getMessage() + ", removing", 5, iOException0);
                    try {
                        this.delete();
                        this.p = false;
                    }
                    catch(Throwable throwable0) {
                        this.p = false;
                        throw throwable0;
                    }
                }
            }
            this.rebuildJournal$okhttp();
            this.o = true;
        }
    }

    public final boolean isClosed() {
        synchronized(this) {
        }
        return this.p;
    }

    public final void rebuildJournal$okhttp() throws IOException {
        synchronized(this) {
            BufferedSink bufferedSink0 = this.j;
            if(bufferedSink0 != null) {
                bufferedSink0.close();
            }
            BufferedSink bufferedSink1 = Okio.buffer(this.a.sink(this.g));
            try {
                bufferedSink1.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                bufferedSink1.writeUtf8("1").writeByte(10);
                bufferedSink1.writeDecimalLong(((long)this.c)).writeByte(10);
                bufferedSink1.writeDecimalLong(((long)this.d)).writeByte(10);
                bufferedSink1.writeByte(10);
                Iterator iterator0 = this.k.values().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_31;
                    }
                    Object object0 = iterator0.next();
                    Entry diskLruCache$Entry0 = (Entry)object0;
                    if(diskLruCache$Entry0.getCurrentEditor$okhttp() == null) {
                        bufferedSink1.writeUtf8("CLEAN").writeByte(0x20);
                        bufferedSink1.writeUtf8(diskLruCache$Entry0.getKey$okhttp());
                        diskLruCache$Entry0.writeLengths$okhttp(bufferedSink1);
                    }
                    else {
                        bufferedSink1.writeUtf8("DIRTY").writeByte(0x20);
                        bufferedSink1.writeUtf8(diskLruCache$Entry0.getKey$okhttp());
                    }
                    bufferedSink1.writeByte(10);
                }
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                CloseableKt.closeFinally(bufferedSink1, throwable0);
                throw throwable1;
            }
        label_31:
            CloseableKt.closeFinally(bufferedSink1, null);
            if(this.a.exists(this.f)) {
                this.a.rename(this.f, this.h);
            }
            this.a.rename(this.g, this.f);
            this.a.delete(this.h);
            this.j = Okio.buffer(new FaultHidingSink(this.a.appendingSink(this.f), new b0(this, 8)));
            this.m = false;
            this.r = false;
        }
    }

    public final boolean remove(@NotNull String s) throws IOException {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(s, "key");
            this.initialize();
            this.a();
            DiskLruCache.f(s);
            Entry diskLruCache$Entry0 = (Entry)this.k.get(s);
            if(diskLruCache$Entry0 == null) {
                return false;
            }
            boolean z = this.removeEntry$okhttp(diskLruCache$Entry0);
            if(z && this.i <= this.e) {
                this.q = false;
            }
            return z;
        }
    }

    public final boolean removeEntry$okhttp(@NotNull Entry diskLruCache$Entry0) throws IOException {
        Intrinsics.checkNotNullParameter(diskLruCache$Entry0, "entry");
        if(!this.n) {
            if(diskLruCache$Entry0.getLockingSourceCount$okhttp() > 0) {
                BufferedSink bufferedSink0 = this.j;
                if(bufferedSink0 != null) {
                    bufferedSink0.writeUtf8("DIRTY");
                    bufferedSink0.writeByte(0x20);
                    bufferedSink0.writeUtf8(diskLruCache$Entry0.getKey$okhttp());
                    bufferedSink0.writeByte(10);
                    bufferedSink0.flush();
                }
            }
            if(diskLruCache$Entry0.getLockingSourceCount$okhttp() > 0 || diskLruCache$Entry0.getCurrentEditor$okhttp() != null) {
                diskLruCache$Entry0.setZombie$okhttp(true);
                return true;
            }
        }
        Editor diskLruCache$Editor0 = diskLruCache$Entry0.getCurrentEditor$okhttp();
        if(diskLruCache$Editor0 != null) {
            diskLruCache$Editor0.detach$okhttp();
        }
        for(int v = 0; v < this.d; ++v) {
            File file0 = (File)diskLruCache$Entry0.getCleanFiles$okhttp().get(v);
            this.a.delete(file0);
            this.i -= diskLruCache$Entry0.getLengths$okhttp()[v];
            diskLruCache$Entry0.getLengths$okhttp()[v] = 0L;
        }
        ++this.l;
        BufferedSink bufferedSink1 = this.j;
        if(bufferedSink1 != null) {
            bufferedSink1.writeUtf8("REMOVE");
            bufferedSink1.writeByte(0x20);
            bufferedSink1.writeUtf8(diskLruCache$Entry0.getKey$okhttp());
            bufferedSink1.writeByte(10);
        }
        this.k.remove(diskLruCache$Entry0.getKey$okhttp());
        if(this.b()) {
            TaskQueue.schedule$default(this.t, this.u, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.p = z;
    }

    public final void setMaxSize(long v) {
        synchronized(this) {
            this.e = v;
            if(this.o) {
                TaskQueue.schedule$default(this.t, this.u, 0L, 2, null);
            }
        }
    }

    public final long size() throws IOException {
        synchronized(this) {
            this.initialize();
            return this.i;
        }
    }

    @NotNull
    public final Iterator snapshots() throws IOException {
        synchronized(this) {
            this.initialize();
            return new Object() {
                public final Iterator a;
                public Snapshot b;
                public Snapshot c;
                public final DiskLruCache d;

                {
                    this.d = diskLruCache0;
                    Iterator iterator0 = new ArrayList(diskLruCache0.getLruEntries$okhttp().values()).iterator();
                    Intrinsics.checkNotNullExpressionValue(iterator0, "ArrayList(lruEntries.values).iterator()");
                    this.a = iterator0;
                }

                @Override
                public boolean hasNext() {
                    if(this.b != null) {
                        return true;
                    }
                    DiskLruCache diskLruCache0 = this.d;
                    synchronized(diskLruCache0) {
                        if(diskLruCache0.getClosed$okhttp()) {
                            return false;
                        }
                        while(this.a.hasNext()) {
                            Object object0 = this.a.next();
                            Entry diskLruCache$Entry0 = (Entry)object0;
                            if(diskLruCache$Entry0 != null) {
                                Snapshot diskLruCache$Snapshot0 = diskLruCache$Entry0.snapshot$okhttp();
                                if(diskLruCache$Snapshot0 != null) {
                                    this.b = diskLruCache$Snapshot0;
                                    return true;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                        return false;
                    }
                }

                @Override
                public Object next() {
                    return this.next();
                }

                @NotNull
                public Snapshot next() {
                    if(!this.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Snapshot diskLruCache$Snapshot0 = this.b;
                    this.c = diskLruCache$Snapshot0;
                    this.b = null;
                    Intrinsics.checkNotNull(diskLruCache$Snapshot0);
                    return diskLruCache$Snapshot0;
                }

                @Override
                public void remove() {
                    Snapshot diskLruCache$Snapshot0 = this.c;
                    if(diskLruCache$Snapshot0 == null) {
                        throw new IllegalStateException("remove() before next()");
                    }
                    try {
                        this.d.remove(diskLruCache$Snapshot0.key());
                    }
                    catch(IOException unused_ex) {
                    }
                    finally {
                        this.c = null;
                    }
                }
            };
        }
    }

    public final void trimToSize() throws IOException {
        while(this.i > this.e) {
            Iterator iterator0 = this.k.values().iterator();
        label_2:
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Entry diskLruCache$Entry0 = (Entry)object0;
                if(!diskLruCache$Entry0.getZombie$okhttp()) {
                    Intrinsics.checkNotNullExpressionValue(diskLruCache$Entry0, "toEvict");
                    this.removeEntry$okhttp(diskLruCache$Entry0);
                    continue;
                }
                goto label_2;
            }
            return;
        }
        this.q = false;
    }
}

