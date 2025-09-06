package com.kakao.tistory.presentation.viewmodel;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.h;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.messaging.FirebaseMessaging;
import com.kakao.android.base.BaseKt;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.usecase.LoginByKakaoUseCase;
import com.kakao.tistory.data.usecase.PushTokenUseCase;
import com.kakao.tistory.domain.usecase.CheckVerifyBlogNameUseCase;
import com.kakao.tistory.domain.usecase.GetInitRecommendedBlogNameUseCase;
import com.kakao.tistory.domain.usecase.PostMemberJoinUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.view.signup.contract.BlogNameState;
import com.kakao.tistory.presentation.view.signup.contract.SignUpEvent.Finish;
import com.kakao.tistory.presentation.view.signup.contract.SignUpEvent.GoAgreeTermsDetail;
import com.kakao.tistory.presentation.view.signup.contract.SignUpEvent.GoNotice;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.ChangeBlogName;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.ChangeBlogNameValidation;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.ChangePage;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.DuplicateEmails;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.Init;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.RequestRecommendation;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.ToggleAgreeTalkChannel;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent;
import com.kakao.tistory.presentation.view.signup.contract.SignUpPageType;
import com.kakao.tistory.presentation.view.signup.contract.SignUpUiState;
import com.kakao.tistory.presentation.view.signup.contract.SignUpVerificationState;
import com.kakao.tistory.presentation.viewmodel.base.BaseMviViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00011B9\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001A\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u00042\u0006\u0010\u0019\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u001A\u0010\u001BR$\u0010#\u001A\u0004\u0018\u00010\u001C8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001A\u00020$8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001D\u00100\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0-0,8F¢\u0006\u0006\u001A\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SignUpViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/BaseMviViewModel;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpEvent;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpUiState;", "Lcom/kakao/tistory/domain/usecase/GetInitRecommendedBlogNameUseCase;", "getInitRecommendedBlogNameUseCase", "Lcom/kakao/tistory/domain/usecase/CheckVerifyBlogNameUseCase;", "checkVerifyBlogNameUseCase", "Lcom/kakao/tistory/domain/usecase/PostMemberJoinUseCase;", "postMemberJoinUseCase", "Lcom/kakao/tistory/data/usecase/LoginByKakaoUseCase;", "loginByKakaoUseCase", "Lcom/kakao/tistory/data/usecase/PushTokenUseCase;", "pushTokenUseCase", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "deviceInfoPreference", "<init>", "(Lcom/kakao/tistory/domain/usecase/GetInitRecommendedBlogNameUseCase;Lcom/kakao/tistory/domain/usecase/CheckVerifyBlogNameUseCase;Lcom/kakao/tistory/domain/usecase/PostMemberJoinUseCase;Lcom/kakao/tistory/data/usecase/LoginByKakaoUseCase;Lcom/kakao/tistory/data/usecase/PushTokenUseCase;Lcom/kakao/tistory/data/preference/DeviceInfoPreference;)V", "Landroid/os/Bundle;", "bundle", "", "initBundle", "(Landroid/os/Bundle;)V", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/view/signup/contract/SignUpUiState;Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/sdk/auth/model/OAuthToken;", "s", "Lcom/kakao/sdk/auth/model/OAuthToken;", "getToken", "()Lcom/kakao/sdk/auth/model/OAuthToken;", "setToken", "(Lcom/kakao/sdk/auth/model/OAuthToken;)V", "token", "", "t", "Ljava/lang/String;", "getKakaoEmail", "()Ljava/lang/String;", "setKakaoEmail", "(Ljava/lang/String;)V", "kakaoEmail", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getCompleteSignUp", "()Landroidx/lifecycle/LiveData;", "completeSignUp", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSignUpViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/SignUpViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,413:1\n1#2:414\n*E\n"})
public final class SignUpViewModel extends BaseMviViewModel {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SignUpViewModel$Companion;", "", "", "BLOG_NAME_MAX_LENGTH", "I", "BLOG_NAME_MIN_LENGTH", "", "USER_INPUT_TYPE", "Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[SignUpPageType.values().length];
            try {
                arr_v[SignUpPageType.SIGNUP.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SignUpPageType.USED_EMAIL.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 0;
    public static final int BLOG_NAME_MAX_LENGTH = 0x20;
    public static final int BLOG_NAME_MIN_LENGTH = 4;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String USER_INPUT_TYPE = "user";
    public final GetInitRecommendedBlogNameUseCase k;
    public final CheckVerifyBlogNameUseCase l;
    public final PostMemberJoinUseCase m;
    public final LoginByKakaoUseCase n;
    public final PushTokenUseCase o;
    public final DeviceInfoPreference p;
    public final MutableSharedFlow q;
    public final MutableLiveData r;
    public OAuthToken s;
    public String t;
    public final Lazy u;
    public final Lazy v;
    public final Lazy w;

    static {
        SignUpViewModel.Companion = new Companion(null);
        SignUpViewModel.$stable = 8;
    }

    @Inject
    public SignUpViewModel(@NotNull GetInitRecommendedBlogNameUseCase getInitRecommendedBlogNameUseCase0, @NotNull CheckVerifyBlogNameUseCase checkVerifyBlogNameUseCase0, @NotNull PostMemberJoinUseCase postMemberJoinUseCase0, @NotNull LoginByKakaoUseCase loginByKakaoUseCase0, @NotNull PushTokenUseCase pushTokenUseCase0, @NotNull DeviceInfoPreference deviceInfoPreference0) {
        Intrinsics.checkNotNullParameter(getInitRecommendedBlogNameUseCase0, "getInitRecommendedBlogNameUseCase");
        Intrinsics.checkNotNullParameter(checkVerifyBlogNameUseCase0, "checkVerifyBlogNameUseCase");
        Intrinsics.checkNotNullParameter(postMemberJoinUseCase0, "postMemberJoinUseCase");
        Intrinsics.checkNotNullParameter(loginByKakaoUseCase0, "loginByKakaoUseCase");
        Intrinsics.checkNotNullParameter(pushTokenUseCase0, "pushTokenUseCase");
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        super(new SignUpUiState(null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 0x3FFFF, null));
        this.k = getInitRecommendedBlogNameUseCase0;
        this.l = checkVerifyBlogNameUseCase0;
        this.m = postMemberJoinUseCase0;
        this.n = loginByKakaoUseCase0;
        this.o = pushTokenUseCase0;
        this.p = deviceInfoPreference0;
        this.q = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.r = new MutableLiveData();
        this.t = "";
        this.u = c.lazy(x4.a);
        this.v = c.lazy(w4.a);
        this.w = c.lazy(y4.a);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new v4(this, null), 3, null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e5(this, null), 3, null);
    }

    public static final void a(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        function10.invoke(object0);
    }

    public final void a(String s) {
        Integer integer0;
        if(s.length() == 0) {
            this.sendIntent(new ChangeBlogNameValidation(false, false, null, null, 8, null));
            return;
        }
        if(Regex.find$default(((Regex)this.u.getValue()), s, 0, 2, null) != null) {
            integer0 = string.label_sign_up_straight_hyphen_error;
        }
        else if(Regex.find$default(((Regex)this.v.getValue()), s, 0, 2, null) != null) {
            integer0 = string.label_sign_up_start_or_end_with_hyphen_error;
        }
        else if(((Regex)this.w.getValue()).matches(s)) {
            integer0 = s.length() >= 4 ? null : string.label_sign_up_too_short_error;
        }
        else {
            integer0 = string.label_sign_up_invalid_char_error;
        }
        if(integer0 != null) {
            this.sendIntent(new ChangeBlogNameValidation(false, false, BaseKt.getAppContext().getString(((int)integer0)), null, 8, null));
            return;
        }
        String s1 = CollectionsKt___CollectionsKt.joinToString$default(((SignUpUiState)this.getUiState().getValue()).getRecommendedBlogNameList(), ",", null, null, 0, null, d5.a, 30, null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c5(this, s, s1, null), 3, null);
    }

    public final void a(Function0 function00) {
        String s = this.p.getFcmToken();
        Logger.INSTANCE.log("checkFcmToken() " + (s == null ? "null" : s));
        if(s == null || ((s.length() <= 0 ? null : s) == null || BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new z4(this, s, function00, null), 3, null) == null)) {
            Intrinsics.checkNotNullExpressionValue(FirebaseMessaging.getInstance().getToken().addOnSuccessListener(new h(new b5(this, function00), 28)), "addOnSuccessListener(...)");
        }
    }

    public static final void access$onClickBack(SignUpViewModel signUpViewModel0) {
        switch(WhenMappings.$EnumSwitchMapping$0[((SignUpUiState)signUpViewModel0.getUiState().getValue()).getPageType().ordinal()]) {
            case 1: {
                Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "back", null, null, null, null, null, null, null, null, null, 0x3FE, null);
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, "가입하기", "가입하기", TiaraActionType.CLICK_BACK, null, click0, null, null, null, 0xE8, null);
                signUpViewModel0.sendEvent(Finish.INSTANCE);
                return;
            }
            case 2: {
                signUpViewModel0.sendEvent(Finish.INSTANCE);
            }
        }
    }

    public static final void access$onClickConfirm(SignUpViewModel signUpViewModel0) {
        String s = ((SignUpUiState)signUpViewModel0.getUiState().getValue()).isAgreedTalkChannel() ? "check" : "uncheck";
        switch(WhenMappings.$EnumSwitchMapping$0[((SignUpUiState)signUpViewModel0.getUiState().getValue()).getPageType().ordinal()]) {
            case 1: {
                Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "join_complete", null, null, null, null, null, null, null, null, null, 0x3FE, null);
                Map map0 = x.mapOf(new Pair[]{TuplesKt.to("address_source", ((SignUpUiState)signUpViewModel0.getUiState().getValue()).getBlogName().getRecommendedBy()), TuplesKt.to("storypf_agree", s)});
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, "가입하기", "가입하기", TiaraActionType.CLICK_OK, null, click0, null, map0, null, 0xA8, null);
                signUpViewModel0.isShowProgress().postValue(Boolean.TRUE);
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(signUpViewModel0), null, null, new s5(signUpViewModel0, null), 3, null);
                return;
            }
            case 2: {
                signUpViewModel0.sendEvent(Finish.INSTANCE);
            }
        }
    }

    public static final void access$onClickDetailTermsAgree(SignUpViewModel signUpViewModel0) {
        signUpViewModel0.getClass();
        signUpViewModel0.sendEvent(GoAgreeTermsDetail.INSTANCE);
    }

    public static final void access$onClickNotice(SignUpViewModel signUpViewModel0) {
        signUpViewModel0.getClass();
        signUpViewModel0.sendEvent(GoNotice.INSTANCE);
    }

    public static final void access$postLoginByKakao(SignUpViewModel signUpViewModel0, String s) {
        signUpViewModel0.getClass();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(signUpViewModel0), null, null, new r5(signUpViewModel0, s, null), 3, null);
    }

    @NotNull
    public final LiveData getCompleteSignUp() {
        return this.r;
    }

    @NotNull
    public final String getKakaoEmail() {
        return this.t;
    }

    @Nullable
    public final OAuthToken getToken() {
        return this.s;
    }

    @Nullable
    public Object handleIntent(@NotNull SignUpUiState signUpUiState0, @NotNull SignUpIntent signUpIntent0, @NotNull Continuation continuation0) {
        g5 g50;
        if(continuation0 instanceof g5) {
            g50 = (g5)continuation0;
            int v = g50.e;
            if((v & 0x80000000) == 0) {
                g50 = new g5(this, continuation0);
            }
            else {
                g50.e = v ^ 0x80000000;
            }
        }
        else {
            g50 = new g5(this, continuation0);
        }
        Object object0 = g50.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g50.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(signUpIntent0 instanceof Init) {
                    return SignUpUiState.copy$default(signUpUiState0, null, this.t, null, new h5(this), new i5(this), false, null, false, new j5(this), new k5(this), null, null, new l5(this), new m5(this), null, new n5(this), new o5(this), new f5(this), 0x4CE5, null);
                }
                if(signUpIntent0 instanceof ChangeBlogName) {
                    String s = ((ChangeBlogName)signUpIntent0).getBlogName().getText();
                    boolean z = Intrinsics.areEqual(s, signUpUiState0.getBlogName().getText().getText());
                    if(((ChangeBlogName)signUpIntent0).getBlogName().getText().length() > 0x20) {
                        return signUpUiState0;
                    }
                    if(!z) {
                        g50.a = signUpUiState0;
                        g50.b = signUpIntent0;
                        g50.e = 1;
                        return this.q.emit(s, g50) == object1 ? object1 : SignUpUiState.copy$default(signUpUiState0, null, null, new BlogNameState(((ChangeBlogName)signUpIntent0).getBlogName(), ((ChangeBlogName)signUpIntent0).getRecommendedBy(), SignUpVerificationState.VERIFYING, null, 8, null), null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 0x3FFFB, null);
                    }
                    return SignUpUiState.copy$default(signUpUiState0, null, null, BlogNameState.copy$default(signUpUiState0.getBlogName(), ((ChangeBlogName)signUpIntent0).getBlogName(), ((ChangeBlogName)signUpIntent0).getRecommendedBy(), null, null, 12, null), null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 0x3FFFB, null);
                }
                if(signUpIntent0 instanceof ChangeBlogNameValidation) {
                    BlogNameState blogNameState0 = signUpUiState0.getBlogName();
                    return ((ChangeBlogNameValidation)signUpIntent0).isValid() ? SignUpUiState.copy$default(signUpUiState0, null, null, BlogNameState.copy$default(blogNameState0, null, null, SignUpVerificationState.VERIFIED, ((ChangeBlogNameValidation)signUpIntent0).getStatusMessage(), 3, null), null, null, ((ChangeBlogNameValidation)signUpIntent0).getShowRecommendation(), ((ChangeBlogNameValidation)signUpIntent0).getRecommendedBlogNames(), false, null, null, null, null, null, null, null, null, null, null, 0x3FF9B, null) : SignUpUiState.copy$default(signUpUiState0, null, null, BlogNameState.copy$default(blogNameState0, null, null, SignUpVerificationState.ERROR, ((ChangeBlogNameValidation)signUpIntent0).getStatusMessage(), 3, null), null, null, ((ChangeBlogNameValidation)signUpIntent0).getShowRecommendation(), ((ChangeBlogNameValidation)signUpIntent0).getRecommendedBlogNames(), false, null, null, null, null, null, null, null, null, null, null, 0x3FF9B, null);
                }
                if(Intrinsics.areEqual(signUpIntent0, ToggleAgreeTalkChannel.INSTANCE)) {
                    boolean z1 = signUpUiState0.isAgreedTalkChannel();
                    if(!z1) {
                        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "check_storypf_agree", null, null, null, null, null, null, null, null, null, 0x3FE, null);
                        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, "가입하기", "가입하기", TiaraActionType.CLICK_SIGN_UP_TALK_CHANEL_AGREE, null, click0, null, null, null, 0xE8, null);
                    }
                    return SignUpUiState.copy$default(signUpUiState0, null, null, null, null, null, false, null, !z1, null, null, null, null, null, null, null, null, null, null, 0x3FF7F, null);
                }
                if(signUpIntent0 instanceof DuplicateEmails) {
                    return SignUpUiState.copy$default(signUpUiState0, null, null, null, null, null, false, null, false, null, null, null, null, null, null, ((DuplicateEmails)signUpIntent0).getEmails(), null, null, null, 0x3BFFF, null);
                }
                if(signUpIntent0 instanceof ChangePage) {
                    return SignUpUiState.copy$default(signUpUiState0, ((ChangePage)signUpIntent0).getPageType(), null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 0x3FFFE, null);
                }
                if(!(signUpIntent0 instanceof RequestRecommendation)) {
                    throw new NoWhenBranchMatchedException();
                }
                Click click1 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "address_suggestion", "refresh", null, null, null, null, null, null, null, null, 1020, null);
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, "가입하기", "가입하기", TiaraActionType.CLICK_SIGN_UP_REFRESH_RECOMMENDATION, null, click1, null, null, null, 0xE8, null);
                this.a(signUpUiState0.getBlogName().getText().getText());
                return signUpUiState0;
            }
            case 1: {
                signUpIntent0 = g50.b;
                SignUpUiState signUpUiState1 = g50.a;
                ResultKt.throwOnFailure(object0);
                return SignUpUiState.copy$default(signUpUiState1, null, null, new BlogNameState(((ChangeBlogName)signUpIntent0).getBlogName(), ((ChangeBlogName)signUpIntent0).getRecommendedBy(), SignUpVerificationState.VERIFYING, null, 8, null), null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 0x3FFFB, null);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.BaseMviViewModel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((SignUpUiState)object0), ((SignUpIntent)object1), continuation0);
    }

    public final void initBundle(@Nullable Bundle bundle0) {
        if(bundle0 != null) {
            this.s = (OAuthToken)bundle0.getParcelable("EXTAR_TOKEN");
            boolean z = bundle0.getBoolean("EXTAR_SIGN_UP_ABLE");
            Serializable serializable0 = bundle0.getSerializable("EXTRA_DUPLICATED_EMAILS");
            List list0 = serializable0 instanceof List ? ((List)serializable0) : null;
            if(this.s == null && z) {
                this.sendEvent(Finish.INSTANCE);
            }
            if(!z) {
                if(list0 == null) {
                    list0 = CollectionsKt__CollectionsKt.emptyList();
                }
                this.sendIntent(new DuplicateEmails(list0));
                this.sendIntent(new ChangePage(SignUpPageType.USED_EMAIL));
            }
            String s = bundle0.getString("EXTRA_EMAIL", "");
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            this.t = s;
        }
        this.sendIntent(Init.INSTANCE);
    }

    public final void setKakaoEmail(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.t = s;
    }

    public final void setToken(@Nullable OAuthToken oAuthToken0) {
        this.s = oAuthToken0;
    }
}

