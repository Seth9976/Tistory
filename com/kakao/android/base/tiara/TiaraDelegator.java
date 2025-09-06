package com.kakao.android.base.tiara;

import com.kakao.tiara.data.ActionKind;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0001H\u0016¢\u0006\u0004\b\b\u0010\u0007R$\u0010\u0010\u001A\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\"\u0010\u0014\u001A\u00020\t8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u0011\u0010\u000B\u001A\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000FR\"\u0010\u0018\u001A\u00020\t8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u000B\u001A\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000FR$\u0010 \u001A\u0004\u0018\u00010\u00198\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001F¨\u0006!"}, d2 = {"Lcom/kakao/android/base/tiara/TiaraDelegator;", "Lcom/kakao/android/base/tiara/TiaraListener;", "<init>", "()V", "tiaraListener", "", "updatePageInfo", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "trackPage", "", "a", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "setSection", "(Ljava/lang/String;)V", "section", "b", "getPage", "setPage", "page", "c", "getAction", "setAction", "action", "Lcom/kakao/tiara/data/ActionKind;", "d", "Lcom/kakao/tiara/data/ActionKind;", "getActionKind", "()Lcom/kakao/tiara/data/ActionKind;", "setActionKind", "(Lcom/kakao/tiara/data/ActionKind;)V", "actionKind", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TiaraDelegator implements TiaraListener {
    public String a;
    public String b;
    public String c;
    public ActionKind d;

    public TiaraDelegator() {
        this.b = "";
        this.c = "";
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @NotNull
    public String getAction() [...] // 潜在的解密器

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @Nullable
    public ActionKind getActionKind() {
        return this.d;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @NotNull
    public String getPage() [...] // 潜在的解密器

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @Nullable
    public String getSection() {
        return this.a;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setAction(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.c = s;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setActionKind(@Nullable ActionKind actionKind0) {
        this.d = actionKind0;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setPage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.b = s;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setSection(@Nullable String s) {
        this.a = s;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        TiaraUtils.trackPage$default(TiaraUtils.INSTANCE, tiaraListener0, null, null, null, 14, null);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void updatePageInfo(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        TiaraUtils.INSTANCE.updatePageInfo(tiaraListener0);
    }
}

