package com.kakao.tistory.presentation.view.signup.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.common.graph.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0012\u0010\u0011\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000EJ:\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000EJ\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0010R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001A\u0004\b&\u0010\u000E¨\u0006\'"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/BlogNameState;", "", "Landroidx/compose/ui/text/input/TextFieldValue;", "text", "", "recommendedBy", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpVerificationState;", "inputState", "stateMessage", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;Lcom/kakao/tistory/presentation/view/signup/contract/SignUpVerificationState;Ljava/lang/String;)V", "component1", "()Landroidx/compose/ui/text/input/TextFieldValue;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/kakao/tistory/presentation/view/signup/contract/SignUpVerificationState;", "component4", "copy", "(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;Lcom/kakao/tistory/presentation/view/signup/contract/SignUpVerificationState;Ljava/lang/String;)Lcom/kakao/tistory/presentation/view/signup/contract/BlogNameState;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/input/TextFieldValue;", "getText", "b", "Ljava/lang/String;", "getRecommendedBy", "c", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpVerificationState;", "getInputState", "d", "getStateMessage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogNameState {
    public static final int $stable;
    public final TextFieldValue a;
    public final String b;
    public final SignUpVerificationState c;
    public final String d;

    public BlogNameState() {
        this(null, null, null, null, 15, null);
    }

    public BlogNameState(@NotNull TextFieldValue textFieldValue0, @NotNull String s, @NotNull SignUpVerificationState signUpVerificationState0, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(textFieldValue0, "text");
        Intrinsics.checkNotNullParameter(s, "recommendedBy");
        Intrinsics.checkNotNullParameter(signUpVerificationState0, "inputState");
        super();
        this.a = textFieldValue0;
        this.b = s;
        this.c = signUpVerificationState0;
        this.d = s1;
    }

    public BlogNameState(TextFieldValue textFieldValue0, String s, SignUpVerificationState signUpVerificationState0, String s1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            textFieldValue0 = new TextFieldValue(null, 0L, null, 7, null);
        }
        if((v & 2) != 0) {
            s = "";
        }
        if((v & 4) != 0) {
            signUpVerificationState0 = SignUpVerificationState.INIT;
        }
        if((v & 8) != 0) {
            s1 = null;
        }
        this(textFieldValue0, s, signUpVerificationState0, s1);
    }

    @NotNull
    public final TextFieldValue component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final SignUpVerificationState component3() {
        return this.c;
    }

    @Nullable
    public final String component4() {
        return this.d;
    }

    @NotNull
    public final BlogNameState copy(@NotNull TextFieldValue textFieldValue0, @NotNull String s, @NotNull SignUpVerificationState signUpVerificationState0, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(textFieldValue0, "text");
        Intrinsics.checkNotNullParameter(s, "recommendedBy");
        Intrinsics.checkNotNullParameter(signUpVerificationState0, "inputState");
        return new BlogNameState(textFieldValue0, s, signUpVerificationState0, s1);
    }

    public static BlogNameState copy$default(BlogNameState blogNameState0, TextFieldValue textFieldValue0, String s, SignUpVerificationState signUpVerificationState0, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            textFieldValue0 = blogNameState0.a;
        }
        if((v & 2) != 0) {
            s = blogNameState0.b;
        }
        if((v & 4) != 0) {
            signUpVerificationState0 = blogNameState0.c;
        }
        if((v & 8) != 0) {
            s1 = blogNameState0.d;
        }
        return blogNameState0.copy(textFieldValue0, s, signUpVerificationState0, s1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogNameState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((BlogNameState)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((BlogNameState)object0).b)) {
            return false;
        }
        return this.c == ((BlogNameState)object0).c ? Intrinsics.areEqual(this.d, ((BlogNameState)object0).d) : false;
    }

    @NotNull
    public final SignUpVerificationState getInputState() {
        return this.c;
    }

    @NotNull
    public final String getRecommendedBy() {
        return this.b;
    }

    @Nullable
    public final String getStateMessage() {
        return this.d;
    }

    @NotNull
    public final TextFieldValue getText() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = a.a(this.b, this.a.hashCode() * 0x1F, 0x1F);
        int v1 = this.c.hashCode();
        return this.d == null ? (v1 + v) * 0x1F : (v1 + v) * 0x1F + this.d.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "BlogNameState(text=" + this.a + ", recommendedBy=" + this.b + ", inputState=" + this.c + ", stateMessage=" + this.d + ")";
    }
}

