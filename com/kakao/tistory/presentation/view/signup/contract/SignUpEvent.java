package com.kakao.tistory.presentation.view.signup.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpEvent;", "", "Finish", "GoAgreeTermsDetail", "GoNotice", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpEvent$Finish;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpEvent$GoAgreeTermsDetail;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpEvent$GoNotice;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class SignUpEvent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpEvent$Finish;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpEvent;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Finish extends SignUpEvent {
        public static final int $stable;
        @NotNull
        public static final Finish INSTANCE;

        static {
            Finish.INSTANCE = new Finish();
        }

        public Finish() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpEvent$GoAgreeTermsDetail;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpEvent;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoAgreeTermsDetail extends SignUpEvent {
        public static final int $stable;
        @NotNull
        public static final GoAgreeTermsDetail INSTANCE;

        static {
            GoAgreeTermsDetail.INSTANCE = new GoAgreeTermsDetail();
        }

        public GoAgreeTermsDetail() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpEvent$GoNotice;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpEvent;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoNotice extends SignUpEvent {
        public static final int $stable;
        @NotNull
        public static final GoNotice INSTANCE;

        static {
            GoNotice.INSTANCE = new GoNotice();
        }

        public GoNotice() {
            super(null);
        }
    }

    public static final int $stable;

    public SignUpEvent(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

