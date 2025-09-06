package com.kakao.tistory.presentation.viewmodel;

import com.kakao.android.base.tiara.TiaraListener.DefaultImpls;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.tiara.data.ActionKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001R$\u0010\t\u001A\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001A\u00020\u00028\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001A\u0004\b\u000B\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001A\u00020\u00028\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0019\u001A\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"com/kakao/tistory/presentation/viewmodel/SignUpViewModel$signUp$1$1$2$1$1", "Lcom/kakao/android/base/tiara/TiaraListener;", "", "a", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "setSection", "(Ljava/lang/String;)V", "section", "b", "getPage", "setPage", "page", "c", "getAction", "setAction", "action", "Lcom/kakao/tiara/data/ActionKind;", "d", "Lcom/kakao/tiara/data/ActionKind;", "getActionKind", "()Lcom/kakao/tiara/data/ActionKind;", "setActionKind", "(Lcom/kakao/tiara/data/ActionKind;)V", "actionKind", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SignUpViewModel.signUp.1.1.2.1.1 implements TiaraListener {
    public String a;
    public String b;
    public String c;
    public ActionKind d;

    public SignUpViewModel.signUp.1.1.2.1.1() {
        this.a = "가입하기";
        this.b = "가입하기";
        this.c = "가입오류문구_보기";
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @NotNull
    public String getAction() {
        return this.c;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @Nullable
    public ActionKind getActionKind() {
        return this.d;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @NotNull
    public String getPage() {
        return this.b;
    }

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
        DefaultImpls.trackPage(this, tiaraListener0);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void updatePageInfo(@NotNull TiaraListener tiaraListener0) {
        DefaultImpls.updatePageInfo(this, tiaraListener0);
    }
}

