package com.kakao.keditor.plugin.extension;

import android.content.Intent;
import android.os.Build.VERSION;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A3\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0000¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"getSerializableExtraCompat", "T", "Ljava/io/Serializable;", "Landroid/content/Intent;", "name", "", "clazz", "Ljava/lang/Class;", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class IntentKt {
    @Nullable
    public static final Serializable getSerializableExtraCompat(@NotNull Intent intent0, @NotNull String s, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(intent0, "<this>");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(class0, "clazz");
        if(Build.VERSION.SDK_INT >= 33) {
            return intent0.getSerializableExtra(s, class0);
        }
        Serializable serializable0 = intent0.getSerializableExtra(s);
        return serializable0 == null ? null : serializable0;
    }
}

