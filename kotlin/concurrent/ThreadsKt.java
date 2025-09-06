package kotlin.concurrent;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AQ\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00002\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"", "start", "isDaemon", "Ljava/lang/ClassLoader;", "contextClassLoader", "", "name", "", "priority", "Lkotlin/Function0;", "", "block", "Ljava/lang/Thread;", "thread", "(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;)Ljava/lang/Thread;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "ThreadsKt")
@SourceDebugExtension({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class ThreadsKt {
    @NotNull
    public static final Thread thread(boolean z, boolean z1, @Nullable ClassLoader classLoader0, @Nullable String s, int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        Thread thread0 = new Thread() {
            @Override
            public void run() {
                function00.invoke();
            }
        };
        if(z1) {
            thread0.setDaemon(true);
        }
        if(v > 0) {
            thread0.setPriority(v);
        }
        if(s != null) {
            thread0.setName(s);
        }
        if(classLoader0 != null) {
            thread0.setContextClassLoader(classLoader0);
        }
        if(z) {
            thread0.start();
        }
        return thread0;
    }

    public static Thread thread$default(boolean z, boolean z1, ClassLoader classLoader0, String s, int v, Function0 function00, int v1, Object object0) {
        if((v1 & 1) != 0) {
            z = true;
        }
        if((v1 & 2) != 0) {
            z1 = false;
        }
        if((v1 & 16) != 0) {
            v = -1;
        }
        return ThreadsKt.thread(z, z1, ((v1 & 4) == 0 ? classLoader0 : null), ((v1 & 8) == 0 ? s : null), v, function00);
    }
}

