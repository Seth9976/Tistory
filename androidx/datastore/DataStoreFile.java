package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004¨\u0006\u0005"}, d2 = {"dataStoreFile", "Ljava/io/File;", "Landroid/content/Context;", "fileName", "", "datastore_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "DataStoreFile")
public final class DataStoreFile {
    @NotNull
    public static final File dataStoreFile(@NotNull Context context0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "fileName");
        return new File(context0.getApplicationContext().getFilesDir(), "datastore/" + s);
    }
}

