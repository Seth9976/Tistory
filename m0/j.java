package m0;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class j {
    public static final j a;

    static {
        j.a = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final boolean a(@NotNull InputConnection inputConnection0, @NotNull InputContentInfo inputContentInfo0, int v, @Nullable Bundle bundle0) {
        return inputConnection0.commitContent(inputContentInfo0, v, bundle0);
    }
}

