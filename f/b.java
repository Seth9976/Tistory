package f;

import android.net.Uri;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public final class b {
    public static Uri a(File file0, String s) {
        Intrinsics.checkNotNullParameter("edited_by_kandinsky", "suffix");
        Intrinsics.checkNotNullParameter(file0, "cacheDir");
        Intrinsics.checkNotNullParameter(s, "extension");
        Uri uri0 = Uri.fromFile(File.createTempFile(("temp_" + UUID.randomUUID() + "_edited_by_kandinsky"), "." + s, file0));
        Intrinsics.checkNotNullExpressionValue(uri0, "fromFile(...)");
        return uri0;
    }
}

