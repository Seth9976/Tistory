package com.kakao.tistory.presentation.viewmodel;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.h;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.messaging.FirebaseMessaging;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.sdk.auth.AuthCodeClient;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.user.UserApiClient;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.usecase.CheckSingUpUseCase;
import com.kakao.tistory.data.usecase.LoginByKakaoUseCase;
import com.kakao.tistory.data.usecase.PushTokenUseCase;
import com.kakao.tistory.domain.entity.appinfo.Step1;
import com.kakao.tistory.domain.repository.AppInfoRepository;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import hc.d;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sc.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00011B1\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001A\u00020\u00102\u0006\u0010\u0014\u001A\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001A\u00020\u00102\u0006\u0010\u0014\u001A\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001C\u001A\u00020\u00102\b\b\u0002\u0010\u001B\u001A\u00020\u001A¢\u0006\u0004\b\u001C\u0010\u001DR\u001D\u0010!\u001A\b\u0012\u0004\u0012\u00020\u001A0\u001E8\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u001D\u0010&\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u001E8F¢\u0006\u0006\u001A\u0004\b%\u0010\"R+\u0010*\u001A\u001C\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020(\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\'0#0\u001E8F¢\u0006\u0006\u001A\u0004\b)\u0010\"R#\u0010-\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0+0#0\u001E8F¢\u0006\u0006\u001A\u0004\b,\u0010\"R\u001D\u00100\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0#0\u001E8F¢\u0006\u0006\u001A\u0004\b/\u0010\"¨\u00062"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/data/usecase/LoginByKakaoUseCase;", "loginByKakaoUseCase", "Lcom/kakao/tistory/data/usecase/CheckSingUpUseCase;", "checkSingUpUseCase", "Lcom/kakao/tistory/data/usecase/PushTokenUseCase;", "pushTokenUseCase", "Lcom/kakao/tistory/domain/repository/AppInfoRepository;", "appInfoRepository", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "deviceInfoPreference", "<init>", "(Lcom/kakao/tistory/data/usecase/LoginByKakaoUseCase;Lcom/kakao/tistory/data/usecase/CheckSingUpUseCase;Lcom/kakao/tistory/data/usecase/PushTokenUseCase;Lcom/kakao/tistory/domain/repository/AppInfoRepository;Lcom/kakao/tistory/data/preference/DeviceInfoPreference;)V", "", "redirectUrl", "", "setRedirectUrl", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "onClickKakaoLogin", "(Landroid/content/Context;)V", "onClickTistoryLogin", "()V", "onClickKakaoDirectlyEnterLogin", "", "needForceTransfer", "goTistoryLogin", "(Z)V", "Landroidx/lifecycle/LiveData;", "o", "Landroidx/lifecycle/LiveData;", "isHideTistoryLoginButton", "()Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator;", "getLoginNavigator", "loginNavigator", "Lkotlin/Pair;", "Lcom/kakao/sdk/auth/model/OAuthToken;", "getGoToSignUp", "goToSignUp", "", "getGoToDuplicateEmail", "goToDuplicateEmail", "Lcom/kakao/tistory/domain/entity/common/RegulationLink;", "getShowRegulationErrorEvent", "showRegulationErrorEvent", "LoginNavigator", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKakaoLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KakaoLoginViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
public final class KakaoLoginViewModel extends TistoryViewModel {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator;", "", "Guide", "Main", "OldAccountDeprecatedDialog", "OldAccountForceTransferDialog", "TistoryLogin", "Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$Guide;", "Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$Main;", "Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$OldAccountDeprecatedDialog;", "Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$OldAccountForceTransferDialog;", "Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$TistoryLogin;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class LoginNavigator {
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$Guide;", "Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator;", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideType;", "guideType", "<init>", "(Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideType;)V", "component1", "()Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideType;", "copy", "(Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideType;)Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$Guide;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideType;", "getGuideType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Guide extends LoginNavigator {
            public static final int $stable;
            public final GuideType a;

            public Guide(@NotNull GuideType tistoryGuideViewModel$GuideType0) {
                Intrinsics.checkNotNullParameter(tistoryGuideViewModel$GuideType0, "guideType");
                super(null);
                this.a = tistoryGuideViewModel$GuideType0;
            }

            @NotNull
            public final GuideType component1() {
                return this.a;
            }

            @NotNull
            public final Guide copy(@NotNull GuideType tistoryGuideViewModel$GuideType0) {
                Intrinsics.checkNotNullParameter(tistoryGuideViewModel$GuideType0, "guideType");
                return new Guide(tistoryGuideViewModel$GuideType0);
            }

            public static Guide copy$default(Guide kakaoLoginViewModel$LoginNavigator$Guide0, GuideType tistoryGuideViewModel$GuideType0, int v, Object object0) {
                if((v & 1) != 0) {
                    tistoryGuideViewModel$GuideType0 = kakaoLoginViewModel$LoginNavigator$Guide0.a;
                }
                return kakaoLoginViewModel$LoginNavigator$Guide0.copy(tistoryGuideViewModel$GuideType0);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof Guide ? this.a == ((Guide)object0).a : false;
            }

            @NotNull
            public final GuideType getGuideType() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.a.hashCode();
            }

            @Override
            @NotNull
            public String toString() {
                return "Guide(guideType=" + this.a + ")";
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$Main;", "Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator;", "", "redirectUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$Main;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRedirectUrl", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Main extends LoginNavigator {
            public static final int $stable;
            public final String a;

            public Main(@Nullable String s) {
                super(null);
                this.a = s;
            }

            @Nullable
            public final String component1() {
                return this.a;
            }

            @NotNull
            public final Main copy(@Nullable String s) {
                return new Main(s);
            }

            public static Main copy$default(Main kakaoLoginViewModel$LoginNavigator$Main0, String s, int v, Object object0) {
                if((v & 1) != 0) {
                    s = kakaoLoginViewModel$LoginNavigator$Main0.a;
                }
                return kakaoLoginViewModel$LoginNavigator$Main0.copy(s);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof Main ? Intrinsics.areEqual(this.a, ((Main)object0).a) : false;
            }

            @Nullable
            public final String getRedirectUrl() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.a == null ? 0 : this.a.hashCode();
            }

            @Override
            @NotNull
            public String toString() {
                return "Main(redirectUrl=" + this.a + ")";
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\bR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001A\u0004\b\u0019\u0010\b¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$OldAccountDeprecatedDialog;", "Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator;", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$OldAccountDeprecatedDialog;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "getMessage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class OldAccountDeprecatedDialog extends LoginNavigator {
            public static final int $stable;
            public final String a;
            public final String b;

            public OldAccountDeprecatedDialog(@NotNull String s, @Nullable String s1) {
                Intrinsics.checkNotNullParameter(s, "title");
                super(null);
                this.a = s;
                this.b = s1;
            }

            @NotNull
            public final String component1() {
                return this.a;
            }

            @Nullable
            public final String component2() {
                return this.b;
            }

            @NotNull
            public final OldAccountDeprecatedDialog copy(@NotNull String s, @Nullable String s1) {
                Intrinsics.checkNotNullParameter(s, "title");
                return new OldAccountDeprecatedDialog(s, s1);
            }

            public static OldAccountDeprecatedDialog copy$default(OldAccountDeprecatedDialog kakaoLoginViewModel$LoginNavigator$OldAccountDeprecatedDialog0, String s, String s1, int v, Object object0) {
                if((v & 1) != 0) {
                    s = kakaoLoginViewModel$LoginNavigator$OldAccountDeprecatedDialog0.a;
                }
                if((v & 2) != 0) {
                    s1 = kakaoLoginViewModel$LoginNavigator$OldAccountDeprecatedDialog0.b;
                }
                return kakaoLoginViewModel$LoginNavigator$OldAccountDeprecatedDialog0.copy(s, s1);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof OldAccountDeprecatedDialog)) {
                    return false;
                }
                return Intrinsics.areEqual(this.a, ((OldAccountDeprecatedDialog)object0).a) ? Intrinsics.areEqual(this.b, ((OldAccountDeprecatedDialog)object0).b) : false;
            }

            @Nullable
            public final String getMessage() {
                return this.b;
            }

            @NotNull
            public final String getTitle() {
                return this.a;
            }

            @Override
            public int hashCode() {
                int v = this.a.hashCode();
                return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
            }

            @Override
            @NotNull
            public String toString() {
                return "OldAccountDeprecatedDialog(title=" + this.a + ", message=" + this.b + ")";
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$OldAccountForceTransferDialog;", "Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class OldAccountForceTransferDialog extends LoginNavigator {
            public static final int $stable;
            @NotNull
            public static final OldAccountForceTransferDialog INSTANCE;

            static {
                OldAccountForceTransferDialog.INSTANCE = new OldAccountForceTransferDialog();
            }

            public OldAccountForceTransferDialog() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ&\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000BJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00022\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$TistoryLogin;", "Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator;", "", "forceTransfer", "", "redirectUrl", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/kakao/tistory/presentation/viewmodel/KakaoLoginViewModel$LoginNavigator$TistoryLogin;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getForceTransfer", "b", "Ljava/lang/String;", "getRedirectUrl", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class TistoryLogin extends LoginNavigator {
            public static final int $stable;
            public final boolean a;
            public final String b;

            public TistoryLogin(boolean z, @Nullable String s) {
                super(null);
                this.a = z;
                this.b = s;
            }

            public TistoryLogin(boolean z, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
                if((v & 1) != 0) {
                    z = false;
                }
                this(z, s);
            }

            public final boolean component1() {
                return this.a;
            }

            @Nullable
            public final String component2() {
                return this.b;
            }

            @NotNull
            public final TistoryLogin copy(boolean z, @Nullable String s) {
                return new TistoryLogin(z, s);
            }

            public static TistoryLogin copy$default(TistoryLogin kakaoLoginViewModel$LoginNavigator$TistoryLogin0, boolean z, String s, int v, Object object0) {
                if((v & 1) != 0) {
                    z = kakaoLoginViewModel$LoginNavigator$TistoryLogin0.a;
                }
                if((v & 2) != 0) {
                    s = kakaoLoginViewModel$LoginNavigator$TistoryLogin0.b;
                }
                return kakaoLoginViewModel$LoginNavigator$TistoryLogin0.copy(z, s);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof TistoryLogin)) {
                    return false;
                }
                return this.a == ((TistoryLogin)object0).a ? Intrinsics.areEqual(this.b, ((TistoryLogin)object0).b) : false;
            }

            public final boolean getForceTransfer() {
                return this.a;
            }

            @Nullable
            public final String getRedirectUrl() {
                return this.b;
            }

            @Override
            public int hashCode() {
                int v = Boolean.hashCode(this.a);
                return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
            }

            @Override
            @NotNull
            public String toString() {
                return "TistoryLogin(forceTransfer=" + this.a + ", redirectUrl=" + this.b + ")";
            }
        }

        public static final int $stable;

        public LoginNavigator(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 8;
    public final LoginByKakaoUseCase g;
    public final CheckSingUpUseCase h;
    public final PushTokenUseCase i;
    public final AppInfoRepository j;
    public final DeviceInfoPreference k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final LiveData o;
    public final MutableLiveData p;
    public final MutableLiveData q;

    @Inject
    public KakaoLoginViewModel(@NotNull LoginByKakaoUseCase loginByKakaoUseCase0, @NotNull CheckSingUpUseCase checkSingUpUseCase0, @NotNull PushTokenUseCase pushTokenUseCase0, @NotNull AppInfoRepository appInfoRepository0, @NotNull DeviceInfoPreference deviceInfoPreference0) {
        Intrinsics.checkNotNullParameter(loginByKakaoUseCase0, "loginByKakaoUseCase");
        Intrinsics.checkNotNullParameter(checkSingUpUseCase0, "checkSingUpUseCase");
        Intrinsics.checkNotNullParameter(pushTokenUseCase0, "pushTokenUseCase");
        Intrinsics.checkNotNullParameter(appInfoRepository0, "appInfoRepository");
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        super();
        this.g = loginByKakaoUseCase0;
        this.h = checkSingUpUseCase0;
        this.i = pushTokenUseCase0;
        this.j = appInfoRepository0;
        this.k = deviceInfoPreference0;
        this.l = new MutableLiveData();
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        this.o = Transformations.map(appInfoRepository0.getStep1(), m2.a);
        this.p = new MutableLiveData();
        this.q = new MutableLiveData();
    }

    public static final SingleSource a(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        Intrinsics.checkNotNullParameter(object0, "p0");
        return (SingleSource)function10.invoke(object0);
    }

    public final void a(Context context0, boolean z) {
        Disposable disposable0 = Single.just(Boolean.valueOf((z ? AuthCodeClient.Companion.getInstance().isKakaoTalkLoginAvailable(context0) : false))).flatMap(new a(new c2(context0), 2)).observeOn(Schedulers.io()).flatMap(new a(d2.a, 3)).subscribe(new d(new e2(this), 11), new d(f2.a, 12));
        Intrinsics.checkNotNullExpressionValue(disposable0, "subscribe(...)");
        DisposableKt.addTo(disposable0, this.getDisposable());
    }

    public final void a(TiaraActionType tiaraActionType0, String s) {
        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, s, null, null, null, null, null, null, null, null, null, 0x3FE, null);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), tiaraActionType0, ActionKind.Login, click0, null, null, null, 0xE0, null);
    }

    public final void a(Function0 function00) {
        String s = this.k.getFcmToken();
        Logger.INSTANCE.log("checkFcmToken() " + (s == null ? "null" : s));
        if(s == null || ((s.length() <= 0 ? null : s) == null || BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g2(this, s, function00, null), 3, null) == null)) {
            Intrinsics.checkNotNullExpressionValue(FirebaseMessaging.getInstance().getToken().addOnSuccessListener(new h(new i2(this, function00), 27)), "addOnSuccessListener(...)");
        }
    }

    public static final void access$checkSignUpEnable(KakaoLoginViewModel kakaoLoginViewModel0, OAuthToken oAuthToken0, String s) {
        kakaoLoginViewModel0.getClass();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(kakaoLoginViewModel0), null, null, new k2(kakaoLoginViewModel0, oAuthToken0, s, null), 3, null);
    }

    public static final void access$getKakaoEmail(KakaoLoginViewModel kakaoLoginViewModel0, OAuthToken oAuthToken0) {
        kakaoLoginViewModel0.getClass();
        UserApiClient.me$default(UserApiClient.Companion.getInstance(), false, new l2(kakaoLoginViewModel0, oAuthToken0), 1, null);
    }

    public static final void access$goToDestination(KakaoLoginViewModel kakaoLoginViewModel0, LoginNavigator kakaoLoginViewModel$LoginNavigator0) {
        Event event0 = new Event(kakaoLoginViewModel$LoginNavigator0);
        kakaoLoginViewModel0.l.postValue(event0);
    }

    public static final void access$postLoginByKakao(KakaoLoginViewModel kakaoLoginViewModel0, OAuthToken oAuthToken0) {
        kakaoLoginViewModel0.getClass();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(kakaoLoginViewModel0), null, null, new p2(kakaoLoginViewModel0, oAuthToken0, null), 3, null);
    }

    public static final SingleSource b(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        Intrinsics.checkNotNullParameter(object0, "p0");
        return (SingleSource)function10.invoke(object0);
    }

    public static final void c(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        function10.invoke(object0);
    }

    public static final void d(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        function10.invoke(object0);
    }

    public static final void e(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        function10.invoke(object0);
    }

    @NotNull
    public final LiveData getGoToDuplicateEmail() {
        return this.n;
    }

    @NotNull
    public final LiveData getGoToSignUp() {
        return this.m;
    }

    @NotNull
    public final LiveData getLoginNavigator() {
        return this.l;
    }

    @NotNull
    public final LiveData getShowRegulationErrorEvent() {
        return this.q;
    }

    public final void goTistoryLogin(boolean z) {
        Event event0 = new Event(new TistoryLogin(z, ((String)this.p.getValue())));
        this.l.postValue(event0);
    }

    public static void goTistoryLogin$default(KakaoLoginViewModel kakaoLoginViewModel0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        kakaoLoginViewModel0.goTistoryLogin(z);
    }

    @NotNull
    public final LiveData isHideTistoryLoginButton() {
        return this.o;
    }

    public final void onClickKakaoDirectlyEnterLogin(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this.a(TiaraActionType.CLICK_LOGIN_KAKAO_DIRECTLY, "login_kakao");
        this.a(context0, false);
    }

    public final void onClickKakaoLogin(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this.a(TiaraActionType.CLICK_LOGIN_KAKAO, "login_kakaotalk");
        this.a(context0, true);
    }

    public final void onClickTistoryLogin() {
        Unit unit0;
        Event event1;
        this.a(TiaraActionType.CLICK_LOGIN_OLD_ACCOUNT_REDIRECTION, "login_email");
        Step1 step10 = (Step1)this.j.getStep1().getValue();
        if(step10 == null) {
            unit0 = null;
        }
        else {
            if(step10.getShowOldAccountDeprecatedAlert()) {
                String s = step10.getOldAccountDeprecatedAlertTitle();
                if(s == null || !p.isBlank(s) != 1) {
                    event1 = new Event(OldAccountForceTransferDialog.INSTANCE);
                    this.l.postValue(event1);
                }
                else {
                    String s1 = step10.getOldAccountDeprecatedAlertTitle();
                    Intrinsics.checkNotNull(s1);
                    Event event0 = new Event(new OldAccountDeprecatedDialog(s1, step10.getOldAccountDeprecatedAlertMessage()));
                    this.l.postValue(event0);
                }
            }
            else {
                event1 = new Event(OldAccountForceTransferDialog.INSTANCE);
                this.l.postValue(event1);
            }
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            KakaoLoginViewModel.goTistoryLogin$default(this, false, 1, null);
        }
    }

    public final void setRedirectUrl(@Nullable String s) {
        this.p.setValue(s);
    }
}

