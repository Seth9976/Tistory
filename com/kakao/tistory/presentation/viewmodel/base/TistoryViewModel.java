package com.kakao.tistory.presentation.viewmodel.base;

import a5.b;
import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.a;
import com.kakao.android.base.BaseKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.android.base.viewmodel.BaseViewModel;
import com.kakao.tistory.data.model.common.EmojiErrorModel.Emoji;
import com.kakao.tistory.data.model.common.EmojiErrorModel;
import com.kakao.tistory.domain.ErrorStatus;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.BlogRoleType;
import com.kakao.tistory.presentation.common.EnumConstsKt;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.widget.dialog.DialogController;
import com.kakao.tistory.presentation.widget.dialog.DialogEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0004¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0004¢\u0006\u0004\b\r\u0010\u000EJ\u0019\u0010\u0011\u001A\u00020\f2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0006H\u0004¢\u0006\u0004\b\u0013\u0010\u0003J!\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0015\u001A\u00020\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017R%\u0010\u001E\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u001D\u0010%\u001A\b\u0012\u0004\u0012\u00020 0\u001F8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u001D\u0010\u0007\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00190\u00188F¢\u0006\u0006\u001A\u0004\b&\u0010\u001DR\u001D\u0010(\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00190\u00188F¢\u0006\u0006\u001A\u0004\b\'\u0010\u001D¨\u0006*"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/android/base/viewmodel/BaseViewModel;", "<init>", "()V", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "", "showErrorDialog", "(Lcom/kakao/android/base/model/ErrorModel;)V", "clearErrorEvent", "", "blogName", "", "isBlogLess", "(Ljava/lang/String;)Z", "Lcom/kakao/tistory/domain/entity/Blog;", "blog", "isBlogRestricted", "(Lcom/kakao/tistory/domain/entity/Blog;)Z", "showBlogLessEmptyView", "Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;", "emoji", "showBlogRestrictedView", "(Lcom/kakao/tistory/domain/entity/Blog;Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;)V", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "b", "Landroidx/lifecycle/LiveData;", "getErrorEvent", "()Landroidx/lifecycle/LiveData;", "errorEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel$ErrorDialogEvent;", "f", "Lkotlinx/coroutines/flow/Flow;", "getErrorDialogEvent", "()Lkotlinx/coroutines/flow/Flow;", "errorDialogEvent", "getShowErrorDialog", "getGoToWebView", "goToWebView", "ErrorDialogEvent", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class TistoryViewModel extends BaseViewModel {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel$ErrorDialogEvent;", "Lcom/kakao/tistory/presentation/widget/dialog/DialogEvent;", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "<init>", "(Lcom/kakao/android/base/model/ErrorModel;)V", "component1", "()Lcom/kakao/android/base/model/ErrorModel;", "copy", "(Lcom/kakao/android/base/model/ErrorModel;)Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel$ErrorDialogEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/android/base/model/ErrorModel;", "getErrorModel", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ErrorDialogEvent implements DialogEvent {
        public static final int $stable = 8;
        public final ErrorModel a;

        public ErrorDialogEvent(@NotNull ErrorModel errorModel0) {
            Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
            super();
            this.a = errorModel0;
        }

        @NotNull
        public final ErrorModel component1() {
            return this.a;
        }

        @NotNull
        public final ErrorDialogEvent copy(@NotNull ErrorModel errorModel0) {
            Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
            return new ErrorDialogEvent(errorModel0);
        }

        public static ErrorDialogEvent copy$default(ErrorDialogEvent tistoryViewModel$ErrorDialogEvent0, ErrorModel errorModel0, int v, Object object0) {
            if((v & 1) != 0) {
                errorModel0 = tistoryViewModel$ErrorDialogEvent0.a;
            }
            return tistoryViewModel$ErrorDialogEvent0.copy(errorModel0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ErrorDialogEvent ? Intrinsics.areEqual(this.a, ((ErrorDialogEvent)object0).a) : false;
        }

        @NotNull
        public final ErrorModel getErrorModel() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ErrorDialogEvent(errorModel=" + this.a + ")";
        }
    }

    public static final int $stable = 8;
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final DialogController e;
    public final Flow f;

    public TistoryViewModel() {
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.a = mutableLiveData0;
        this.b = mutableLiveData0;
        this.c = new MutableLiveData();
        this.d = new MutableLiveData();
        DialogController dialogController0 = new DialogController();
        this.e = dialogController0;
        this.f = dialogController0.getEventFlow();
    }

    public final void clearErrorEvent() {
        Event event0 = (Event)this.a.getValue();
        if((event0 == null ? null : ((ErrorModel)event0.getContent())) != null) {
            Event event1 = new Event(null);
            this.a.setValue(event1);
        }
    }

    @NotNull
    public final Flow getErrorDialogEvent() {
        return this.f;
    }

    @NotNull
    public final LiveData getErrorEvent() {
        return this.b;
    }

    @NotNull
    public final LiveData getGoToWebView() {
        return this.d;
    }

    @NotNull
    public final LiveData getShowErrorDialog() {
        return this.c;
    }

    public final boolean isBlogLess(@Nullable String s) {
        return s == null || p.isBlank(s);
    }

    // 去混淆评级： 低(40)
    public final boolean isBlogRestricted(@Nullable Blog blog0) {
        return blog0 == null ? !Intrinsics.areEqual(null, "open") : !Intrinsics.areEqual(blog0.getStatus(), "open");
    }

    public final void showBlogLessEmptyView() {
        EmojiErrorModel emojiErrorModel0 = new EmojiErrorModel();
        emojiErrorModel0.setCode(ErrorStatus.EXCEPTION_BLOG_LESS.getCode());
        emojiErrorModel0.setStatus("EXCEPTION_BLOG_LESS");
        String s = BaseKt.getAppContext().getResources().getString(string.label_exception_blog_less_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        emojiErrorModel0.setTitle(s);
        emojiErrorModel0.setMessage(BaseKt.getAppContext().getResources().getString(string.label_exception_blog_less_message));
        emojiErrorModel0.setEmoji(Emoji.Persevering);
        Event event0 = new Event(emojiErrorModel0);
        this.a.setValue(event0);
    }

    public final void showBlogRestrictedView(@NotNull Blog blog0, @NotNull Emoji emojiErrorModel$Emoji0) {
        Unit unit0;
        Intrinsics.checkNotNullParameter(blog0, "blog");
        Intrinsics.checkNotNullParameter(emojiErrorModel$Emoji0, "emoji");
        BlogRoleType blogRoleType0 = EnumConstsKt.getBlogRoleType(blog0.getRole());
        boolean z = blogRoleType0 == BlogRoleType.GUEST || blogRoleType0 == BlogRoleType.USER;
        MutableLiveData mutableLiveData0 = this.a;
        EmojiErrorModel emojiErrorModel0 = new EmojiErrorModel();
        emojiErrorModel0.setCode(ErrorStatus.EXCEPTION_RESTRICTED_BLOG.getCode());
        emojiErrorModel0.setStatus("EXCEPTION_RESTRICTED_BLOG");
        String s = blog0.getStatus();
        if(s == null) {
            unit0 = null;
        }
        else {
            Resources resources0 = BaseKt.getAppContext().getResources();
            Integer integer0 = EnumConstsKt.getBlogStatusType(s).getExceptionTitleStringId();
            String s1 = resources0.getString((integer0 == null ? 0x7F1203E9 : ((int)integer0)));  // string:label_exception_blog_restricted_title "접근이 제한된\n블로그입니다"
            Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
            emojiErrorModel0.setTitle(s1);
            Integer integer1 = EnumConstsKt.getBlogStatusType(s).getExceptionMessageStringId();
            String s2 = integer1 == null ? "" : a.z(BaseKt.getAppContext().getResources().getString(((int)integer1)), "\n");
            if(!z) {
                s2 = b.m(s2, BaseKt.getAppContext().getResources().getString(string.label_exception_common_message_guide_email), "\n");
            }
            String s3 = a.z(s2, BaseKt.getAppContext().getResources().getString(string.label_exception_common_message_qna));
            String s4 = BaseKt.getAppContext().getResources().getString(string.label_exception_common_message_linked_text);
            Intrinsics.checkNotNullExpressionValue(s4, "getString(...)");
            int v = ContextCompat.getColor(BaseKt.getAppContext(), color.gray5);
            d d0 = new d(this);
            emojiErrorModel0.setSpannedMessage(StringUtils.getStringWithClickableSpan$default(StringUtils.INSTANCE, s3, s4, v, true, false, d0, 16, null));
            emojiErrorModel0.setEmoji(emojiErrorModel$Emoji0);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            return;
        }
        mutableLiveData0.setValue(new Event(emojiErrorModel0));
    }

    public static void showBlogRestrictedView$default(TistoryViewModel tistoryViewModel0, Blog blog0, Emoji emojiErrorModel$Emoji0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showBlogRestrictedView");
        }
        if((v & 2) != 0) {
            emojiErrorModel$Emoji0 = Emoji.Cloud;
        }
        tistoryViewModel0.showBlogRestrictedView(blog0, emojiErrorModel$Emoji0);
    }

    public void showErrorDialog(@NotNull ErrorModel errorModel0) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        Event event0 = new Event(errorModel0);
        this.c.postValue(event0);
        ErrorDialogEvent tistoryViewModel$ErrorDialogEvent0 = new ErrorDialogEvent(errorModel0);
        this.e.sendDialogEvent(tistoryViewModel$ErrorDialogEvent0);
    }
}

