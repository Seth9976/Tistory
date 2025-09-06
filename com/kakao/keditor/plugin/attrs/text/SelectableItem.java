package com.kakao.keditor.plugin.attrs.text;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016J\b\u0010\u0007\u001A\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/SelectableItem;", "", "getDescription", "", "context", "Landroid/content/Context;", "getHintText", "getImage", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface SelectableItem {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Nullable
        public static String getHintText(@NotNull SelectableItem selectableItem0, @NotNull Context context0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            return null;
        }
    }

    @NotNull
    String getDescription(@NotNull Context arg1);

    @Nullable
    String getHintText(@NotNull Context arg1);

    int getImage();
}

