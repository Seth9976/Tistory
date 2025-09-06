package androidx.core.net;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\r\u0010\u0003\u001A\u00020\u0002*\u00020\u0001H\u0086\b\u001A\r\u0010\u0003\u001A\u00020\u0002*\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"toFile", "Ljava/io/File;", "Landroid/net/Uri;", "toUri", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uri.kt\nandroidx/core/net/UriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class UriKt {
    @NotNull
    public static final File toFile(@NotNull Uri uri0) {
        if(!Intrinsics.areEqual(uri0.getScheme(), "file")) {
            throw new IllegalArgumentException(("Uri lacks \'file\' scheme: " + uri0).toString());
        }
        String s = uri0.getPath();
        if(s == null) {
            throw new IllegalArgumentException(("Uri path is null: " + uri0).toString());
        }
        return new File(s);
    }

    @NotNull
    public static final Uri toUri(@NotNull File file0) {
        return Uri.fromFile(file0);
    }

    @NotNull
    public static final Uri toUri(@NotNull String s) {
        return Uri.parse(s);
    }
}

