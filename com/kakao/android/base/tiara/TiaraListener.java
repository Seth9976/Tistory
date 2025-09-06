package com.kakao.android.base.tiara;

import com.kakao.tiara.data.ActionKind;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0000H\u0016J\u0010\u0010\u0017\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0000H\u0016R\u0018\u0010\u0002\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001A\u0010\b\u001A\u0004\u0018\u00010\tX¦\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u0018\u0010\u000E\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u000F\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u001A\u0010\u0011\u001A\u0004\u0018\u00010\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/android/base/tiara/TiaraListener;", "", "action", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "actionKind", "Lcom/kakao/tiara/data/ActionKind;", "getActionKind", "()Lcom/kakao/tiara/data/ActionKind;", "setActionKind", "(Lcom/kakao/tiara/data/ActionKind;)V", "page", "getPage", "setPage", "section", "getSection", "setSection", "trackPage", "", "tiaraListener", "updatePageInfo", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface TiaraListener {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void trackPage(@NotNull TiaraListener tiaraListener0, @NotNull TiaraListener tiaraListener1) {
            Intrinsics.checkNotNullParameter(tiaraListener1, "tiaraListener");
        }

        public static void updatePageInfo(@NotNull TiaraListener tiaraListener0, @NotNull TiaraListener tiaraListener1) {
            Intrinsics.checkNotNullParameter(tiaraListener1, "tiaraListener");
        }
    }

    @NotNull
    String getAction();

    @Nullable
    ActionKind getActionKind();

    @NotNull
    String getPage();

    @Nullable
    String getSection();

    void setAction(@NotNull String arg1);

    void setActionKind(@Nullable ActionKind arg1);

    void setPage(@NotNull String arg1);

    void setSection(@Nullable String arg1);

    void trackPage(@NotNull TiaraListener arg1);

    void updatePageInfo(@NotNull TiaraListener arg1);
}

