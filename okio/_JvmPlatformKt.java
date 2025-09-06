package okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\f\u0010\u0000\u001A\u00060\u0001j\u0002`\u0002H\u0000\u001A\f\u0010\u0003\u001A\u00020\u0004*\u00020\u0005H\u0000\u001A\f\u0010\u0006\u001A\u00020\u0005*\u00020\u0004H\u0000\u001A-\u0010\u0007\u001A\u0002H\b\"\u0004\b\u0000\u0010\b*\u00060\u0001j\u0002`\u00022\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\b0\nH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000B*\n\u0010\f\"\u00020\r2\u00020\r*\n\u0010\u000E\"\u00020\u000F2\u00020\u000F*\n\u0010\u0010\"\u00020\u00112\u00020\u0011*\n\u0010\u0012\"\u00020\u00132\u00020\u0013*\n\u0010\u0014\"\u00020\u00152\u00020\u0015*\n\u0010\u0016\"\u00020\u00012\u00020\u0001*\n\u0010\u0017\"\u00020\u00182\u00020\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"newLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "asUtf8ToByteArray", "", "", "toUtf8String", "withLock", "T", "action", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ArrayIndexOutOfBoundsException", "Ljava/lang/ArrayIndexOutOfBoundsException;", "Closeable", "Ljava/io/Closeable;", "EOFException", "Ljava/io/EOFException;", "FileNotFoundException", "Ljava/io/FileNotFoundException;", "IOException", "Ljava/io/IOException;", "Lock", "ProtocolException", "Ljava/net/ProtocolException;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class _JvmPlatformKt {
    @NotNull
    public static final byte[] asUtf8ToByteArray(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        byte[] arr_b = s.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(arr_b, "getBytes(...)");
        return arr_b;
    }

    @NotNull
    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    @NotNull
    public static final String toUtf8String(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return new String(arr_b, Charsets.UTF_8);
    }

    public static final Object withLock(@NotNull ReentrantLock reentrantLock0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(reentrantLock0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "action");
        reentrantLock0.lock();
        try {
            return function00.invoke();
        }
        finally {
            reentrantLock0.unlock();
        }
    }
}

