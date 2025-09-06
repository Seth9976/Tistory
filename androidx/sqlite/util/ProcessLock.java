package androidx.sqlite.util;

import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FB!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u000B\u0010\fJ\r\u0010\r\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Landroidx/sqlite/util/ProcessLock;", "", "", "name", "Ljava/io/File;", "lockDir", "", "processLock", "<init>", "(Ljava/lang/String;Ljava/io/File;Z)V", "", "lock", "(Z)V", "unlock", "()V", "Companion", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nProcessLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class ProcessLock {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R \u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/sqlite/util/ProcessLock$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "Ljava/util/concurrent/locks/Lock;", "threadLocksMap", "Ljava/util/Map;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nProcessLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,103:1\n361#2,7:104\n*S KotlinDebug\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock$Companion\n*L\n99#1:104,7\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final Lock access$getThreadLock(Companion processLock$Companion0, String s) {
            processLock$Companion0.getClass();
            synchronized(ProcessLock.e) {
                Map map1 = ProcessLock.e;
                ReentrantLock reentrantLock0 = map1.get(s);
                if(reentrantLock0 == null) {
                    reentrantLock0 = new ReentrantLock();
                    map1.put(s, reentrantLock0);
                }
                return reentrantLock0;
            }
        }
    }

    @NotNull
    public static final Companion Companion;
    public final boolean a;
    public final File b;
    public final Lock c;
    public FileChannel d;
    public static final HashMap e;

    static {
        ProcessLock.Companion = new Companion(null);
        ProcessLock.e = new HashMap();
    }

    public ProcessLock(@NotNull String s, @Nullable File file0, boolean z) {
        Intrinsics.checkNotNullParameter(s, "name");
        super();
        this.a = z;
        this.b = file0 == null ? null : new File(file0, s + ".lck");
        this.c = Companion.access$getThreadLock(ProcessLock.Companion, s);
    }

    public final void lock(boolean z) {
        this.c.lock();
        if(z) {
            try {
                File file0 = this.b;
                if(file0 == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File file1 = file0.getParentFile();
                if(file1 != null) {
                    file1.mkdirs();
                }
                FileChannel fileChannel0 = new FileOutputStream(file0).getChannel();
                fileChannel0.lock();
                this.d = fileChannel0;
                return;
            }
            catch(IOException iOException0) {
            }
            this.d = null;
            Log.w("SupportSQLiteLock", "Unable to grab file lock.", iOException0);
        }
    }

    public static void lock$default(ProcessLock processLock0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = processLock0.a;
        }
        processLock0.lock(z);
    }

    public final void unlock() {
        FileChannel fileChannel0 = this.d;
        if(fileChannel0 != null) {
            try {
                fileChannel0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        this.c.unlock();
    }
}

