package androidx.room.util;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"copy", "", "input", "Ljava/nio/channels/ReadableByteChannel;", "output", "Ljava/nio/channels/FileChannel;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "FileUtil")
@SourceDebugExtension({"SMAP\nFileUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtil.kt\nandroidx/room/util/FileUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
public final class FileUtil {
    @SuppressLint({"LambdaLast"})
    public static final void copy(@NotNull ReadableByteChannel readableByteChannel0, @NotNull FileChannel fileChannel0) throws IOException {
        Intrinsics.checkNotNullParameter(readableByteChannel0, "input");
        Intrinsics.checkNotNullParameter(fileChannel0, "output");
        try {
            fileChannel0.transferFrom(readableByteChannel0, 0L, 0x7FFFFFFFFFFFFFFFL);
            fileChannel0.force(false);
        }
        finally {
            readableByteChannel0.close();
            fileChannel0.close();
        }
    }
}

