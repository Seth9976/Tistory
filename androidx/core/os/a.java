package androidx.core.os;

import android.os.ext.SdkExtensions;
import androidx.annotation.DoNotInline;

public final class a {
    public static final a a;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final int a(int v) {
        return SdkExtensions.getExtensionVersion(v);
    }
}

