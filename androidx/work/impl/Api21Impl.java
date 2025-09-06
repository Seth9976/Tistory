package androidx.work.impl;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(21)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/Api21Impl;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "getNoBackupFilesDir", "(Landroid/content/Context;)Ljava/io/File;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Api21Impl {
    @NotNull
    public static final Api21Impl INSTANCE;

    static {
        Api21Impl.INSTANCE = new Api21Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @NotNull
    public final File getNoBackupFilesDir(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        File file0 = context0.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(file0, "context.noBackupFilesDir");
        return file0;
    }
}

