package com.kakao.tistory.presentation.screen.blog.setting;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.android.base.utils.ImageUtils;
import com.kakao.android.base.viewmodel.CoroutineThrottle;
import com.kakao.android.base.viewmodel.CoroutineThrottleInterface;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.AppInfoRepository;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import com.kakao.tistory.domain.usecase.CheckVerifyBlogNicknameUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.TistoryMVIViewmodel;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingEvent.ShowToast;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeBlogDescription;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeBlogInfo;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeBlogTitle;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeImageFileUrl;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeImageMaxSize;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeNickname;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeNicknameValidation;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.Complete;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.HideBottomSheet;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.HideDialog;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ShowBottomSheet;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ShowDialog;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ShowErrorDialog;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingUiState;
import com.kakao.tistory.presentation.screen.blog.setting.contract.DialogType.Alert;
import com.kakao.tistory.presentation.screen.blog.setting.contract.DialogType.ImageMaxOver;
import com.kakao.tistory.presentation.screen.blog.setting.tiara.BlogSettingTiara;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001&B)\b\u0007\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FJ(\u0010\u0015\u001A\u00020\u00132\b\b\u0002\u0010\u0011\u001A\u00020\u00102\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0018\u001A\u00020\u00132\b\b\u0002\u0010\u0017\u001A\u00020\u00102\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0016J(\u0010\u0019\u001A\u00020\u00132\b\b\u0002\u0010\u0017\u001A\u00020\u00102\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u000F\u0010\u001A\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ \u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u00042\u0006\u0010\u001D\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u001E\u0010\u001FR\u001C\u0010%\u001A\u00020 8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006\'"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/BlogSettingViewModel;", "Lcom/kakao/tistory/presentation/common/TistoryMVIViewmodel;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingEvent;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingUiState;", "Lcom/kakao/android/base/viewmodel/CoroutineThrottleInterface;", "Lcom/kakao/tistory/domain/repository/AppInfoRepository;", "appInfoRepository", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "oldBlogRepository", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/usecase/CheckVerifyBlogNicknameUseCase;", "checkVerifyBlogNicknameUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/AppInfoRepository;Lcom/kakao/tistory/domain/repository/OldBlogRepository;Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/usecase/CheckVerifyBlogNicknameUseCase;)V", "", "waitTime", "Lkotlin/Function0;", "", "function", "debounce", "(ILkotlin/jvm/functions/Function0;)V", "delayTime", "throttleFirst", "throttleLast", "createInitState", "()Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingUiState;", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingUiState;Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineThrottleScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineThrottleScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "coroutineThrottleScope", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogSettingViewModel extends TistoryMVIViewmodel implements CoroutineThrottleInterface {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/BlogSettingViewModel$Companion;", "", "", "CHECK_NICKNAME_DEBOUNCE_TIME", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final OldBlogRepository f;
    public final AccountRepository g;
    public final CheckVerifyBlogNicknameUseCase h;
    public final CoroutineThrottle i;

    static {
        BlogSettingViewModel.Companion = new Companion(null);
        BlogSettingViewModel.$stable = 8;
    }

    @Inject
    public BlogSettingViewModel(@NotNull AppInfoRepository appInfoRepository0, @NotNull OldBlogRepository oldBlogRepository0, @NotNull AccountRepository accountRepository0, @NotNull CheckVerifyBlogNicknameUseCase checkVerifyBlogNicknameUseCase0) {
        Intrinsics.checkNotNullParameter(appInfoRepository0, "appInfoRepository");
        Intrinsics.checkNotNullParameter(oldBlogRepository0, "oldBlogRepository");
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(checkVerifyBlogNicknameUseCase0, "checkVerifyBlogNicknameUseCase");
        super();
        this.f = oldBlogRepository0;
        this.g = accountRepository0;
        this.h = checkVerifyBlogNicknameUseCase0;
        this.i = new CoroutineThrottle();
        this.setCoroutineThrottleScope(ViewModelKt.getViewModelScope(this));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new k(appInfoRepository0, this, null), 3, null);
    }

    @NotNull
    public BlogSettingUiState createInitState() {
        return new BlogSettingUiState(new p(this), null, null, new q(this), false, null, new r(this), null, false, null, new s(this), new t(this), null, 0L, new u(this), new v(this), new w(this), new x(this), new l(this), null, new m(this), null, new n(this), new o(this), 0x2833B6, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object createInitState() {
        return this.createInitState();
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    public void debounce(int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "function");
        this.i.debounce(v, function00);
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    @NotNull
    public CoroutineScope getCoroutineThrottleScope() {
        return this.i.getCoroutineThrottleScope();
    }

    @Nullable
    public Object handleIntent(@NotNull BlogSettingUiState blogSettingUiState0, @NotNull BlogSettingIntent blogSettingIntent0, @NotNull Continuation continuation0) {
        String s = "";
        String s1 = null;
        if(blogSettingIntent0 instanceof ChangeBlogInfo) {
            BlogInfo blogInfo0 = ((ChangeBlogInfo)blogSettingIntent0).getBlog();
            String s2 = blogInfo0 == null ? null : blogInfo0.getTitle();
            if(s2 == null) {
                s2 = "";
            }
            if(s2.length() > 40) {
                this.sendEvent(new ShowToast(null, Boxing.boxInt(string.label_blog_setting_blog_title_exceed_limited_count), 1, null));
            }
            String s3 = blogInfo0 == null ? null : blogInfo0.getTitle();
            TextFieldValue textFieldValue0 = new TextFieldValue((s3 == null ? "" : s3), 0L, null, 6, null);
            String s4 = blogInfo0 == null ? null : blogInfo0.getDescription();
            TextFieldValue textFieldValue1 = new TextFieldValue((s4 == null ? "" : s4), 0L, null, 6, null);
            String s5 = blogInfo0 == null ? null : blogInfo0.getNickname();
            TextFieldValue textFieldValue2 = new TextFieldValue((s5 == null ? "" : s5), 0L, null, 6, null);
            if(blogInfo0 != null) {
                s1 = blogInfo0.getLogoImageUrl();
            }
            return BlogSettingUiState.copy$default(blogSettingUiState0, null, blogInfo0, textFieldValue0, null, true, textFieldValue1, null, textFieldValue2, true, null, null, null, s1, 0L, null, null, null, null, null, null, null, null, null, null, 0xFFEE49, null);
        }
        if(blogSettingIntent0 instanceof ChangeImageMaxSize) {
            return BlogSettingUiState.copy$default(blogSettingUiState0, null, null, null, null, false, null, null, null, false, null, null, null, null, ((ChangeImageMaxSize)blogSettingIntent0).getImageMaxSize(), null, null, null, null, null, null, null, null, null, null, 0xFFDFFF, null);
        }
        if(blogSettingIntent0 instanceof ChangeBlogTitle) {
            return ((ChangeBlogTitle)blogSettingIntent0).getBlogTitle().getText().length() > blogSettingUiState0.getBlogTitleMaxLength() ? blogSettingUiState0 : BlogSettingUiState.copy$default(blogSettingUiState0, null, null, ((ChangeBlogTitle)blogSettingIntent0).getBlogTitle(), null, !kotlin.text.p.isBlank(((ChangeBlogTitle)blogSettingIntent0).getBlogTitle().getText()), null, null, null, false, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, 0xFFFFEB, null);
        }
        if(blogSettingIntent0 instanceof ChangeBlogDescription) {
            return ((ChangeBlogDescription)blogSettingIntent0).getBlogDescription().getText().length() > blogSettingUiState0.getBlogDescriptionMaxLength() ? blogSettingUiState0 : BlogSettingUiState.copy$default(blogSettingUiState0, null, null, null, null, false, ((ChangeBlogDescription)blogSettingIntent0).getBlogDescription(), null, null, false, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, 0xFFFFDF, null);
        }
        if(blogSettingIntent0 instanceof ChangeNickname) {
            if(((ChangeNickname)blogSettingIntent0).getNickname().getText().length() > blogSettingUiState0.getNicknameMaxLength()) {
                return blogSettingUiState0;
            }
            TextFieldValue textFieldValue3 = ((ChangeNickname)blogSettingIntent0).getNickname();
            BlogInfo blogInfo1 = blogSettingUiState0.getOriginBlogInfo();
            if(blogInfo1 != null) {
                s1 = blogInfo1.getNickname();
            }
            if(s1 != null) {
                s = s1;
            }
            this.debounce(700, new a0(s, textFieldValue3.getText(), this));
            return BlogSettingUiState.copy$default(blogSettingUiState0, null, null, null, null, false, null, null, textFieldValue3, false, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, 0xFFFC7F, null);
        }
        if(blogSettingIntent0 instanceof ChangeImageFileUrl) {
            String s6 = ((ChangeImageFileUrl)blogSettingIntent0).getImageFileUrl();
            if(s6 != null && !kotlin.text.p.isBlank(s6)) {
                return ImageUtils.INSTANCE.checkImageSize(s6, blogSettingUiState0.getImageMaxSize()) ? BlogSettingUiState.copy$default(blogSettingUiState0, null, null, null, null, false, null, null, null, false, null, null, null, s6, 0L, null, null, null, null, null, null, null, null, null, null, 0xFFEFFF, null) : BlogSettingUiState.copy$default(blogSettingUiState0, null, null, null, null, false, null, null, null, false, null, null, null, null, 0L, null, null, null, null, null, null, null, ImageMaxOver.INSTANCE, null, null, 0xDFFFFF, null);
            }
            return BlogSettingUiState.copy$default(blogSettingUiState0, null, null, null, null, false, null, null, null, false, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, 0xFFEFFF, null);
        }
        if(Intrinsics.areEqual(blogSettingIntent0, Complete.INSTANCE)) {
            BlogInfo blogInfo2 = blogSettingUiState0.getOriginBlogInfo();
            String s7 = blogSettingUiState0.getBlogTitle().getText();
            String s8 = blogSettingUiState0.getBlogDescription().getText();
            String s9 = blogSettingUiState0.getNickname().getText();
            String s10 = blogSettingUiState0.getImageUrl();
            BlogSettingTiara.INSTANCE.trackClickComplete();
            if(blogInfo2 != null && !kotlin.text.p.isBlank(blogInfo2.getName())) {
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new y(blogInfo2, s10, this, s7, s8, s9, null), 3, null);
            }
            return blogSettingUiState0;
        }
        if(blogSettingIntent0 instanceof ChangeNicknameValidation) {
            return BlogSettingUiState.copy$default(blogSettingUiState0, null, null, null, null, false, null, null, null, ((ChangeNicknameValidation)blogSettingIntent0).isValid(), ((ChangeNicknameValidation)blogSettingIntent0).getErrorMessage(), null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, 0xFFFCFF, null);
        }
        if(blogSettingIntent0 instanceof ShowBottomSheet) {
            return BlogSettingUiState.copy$default(blogSettingUiState0, null, null, null, null, false, null, null, null, false, null, null, null, null, 0L, null, null, null, null, null, ((ShowBottomSheet)blogSettingIntent0).getType(), null, null, null, null, 0xF7FFFF, null);
        }
        if(Intrinsics.areEqual(blogSettingIntent0, HideBottomSheet.INSTANCE)) {
            return BlogSettingUiState.copy$default(blogSettingUiState0, null, null, null, null, false, null, null, null, false, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, 0xF7FFFF, null);
        }
        if(blogSettingIntent0 instanceof ShowDialog) {
            return BlogSettingUiState.copy$default(blogSettingUiState0, null, null, null, null, false, null, null, null, false, null, null, null, null, 0L, null, null, null, null, null, null, null, ((ShowDialog)blogSettingIntent0).getType(), null, null, 0xDFFFFF, null);
        }
        if(Intrinsics.areEqual(blogSettingIntent0, HideDialog.INSTANCE)) {
            return BlogSettingUiState.copy$default(blogSettingUiState0, null, null, null, null, false, null, null, null, false, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, 0xDFFFFF, null);
        }
        if(!(blogSettingIntent0 instanceof ShowErrorDialog)) {
            throw new NoWhenBranchMatchedException();
        }
        ErrorModel errorModel0 = ((ShowErrorDialog)blogSettingIntent0).getErrorModel();
        return BlogSettingUiState.copy$default(blogSettingUiState0, null, null, null, null, false, null, null, null, false, null, null, null, null, 0L, null, null, null, null, null, null, null, new Alert(errorModel0.getTitle(), null, errorModel0.getMessage(), null, null, false, 58, null), null, null, 0xDFFFFF, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((BlogSettingUiState)object0), ((BlogSettingIntent)object1), continuation0);
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    public void setCoroutineThrottleScope(@NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "<set-?>");
        this.i.setCoroutineThrottleScope(coroutineScope0);
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    public void throttleFirst(int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "function");
        this.i.throttleFirst(v, function00);
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    public void throttleLast(int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "function");
        this.i.throttleLast(v, function00);
    }
}

