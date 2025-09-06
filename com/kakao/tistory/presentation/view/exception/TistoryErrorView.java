package com.kakao.tistory.presentation.view.exception;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.core.content.ContextCompat;
import com.kakao.android.base.exception.IBaseExceptionView;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.model.common.EmojiErrorModel.Emoji;
import com.kakao.tistory.data.model.common.EmojiErrorModel;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.ScaleUtilsKt;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.databinding.ViewCommonExceptionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import lc.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001B\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0019\u0010\u0010\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u0017\u001A\u00020\u00162\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0018H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001E\u001A\u00020\u000F2\u0006\u0010\u001D\u001A\u00020\u001CH\u0016¢\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010 \u001A\u00020\u000FH\u0016¢\u0006\u0004\b \u0010!J\u000F\u0010\"\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\"\u0010!J\u000F\u0010#\u001A\u00020\u001CH\u0016¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/kakao/tistory/presentation/view/exception/TistoryErrorView;", "Landroid/widget/FrameLayout;", "Lcom/kakao/android/base/exception/IBaseExceptionView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;", "emoji", "", "setEmoji", "(Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;)V", "Landroid/view/ViewGroup;", "parent", "addView", "(Landroid/view/ViewGroup;)V", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "Lkotlin/Function0;", "refreshCallback", "setContent", "(Lcom/kakao/android/base/model/ErrorModel;Lkotlin/jvm/functions/Function0;)V", "", "enabled", "setPaddingTopEnabled", "(Z)V", "show", "()V", "hide", "isShown", "()Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryErrorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryErrorView.kt\ncom/kakao/tistory/presentation/view/exception/TistoryErrorView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class TistoryErrorView extends FrameLayout implements IBaseExceptionView {
    public static final int $stable = 8;
    public final ViewCommonExceptionBinding a;

    public TistoryErrorView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        ViewCommonExceptionBinding viewCommonExceptionBinding0 = ViewCommonExceptionBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(viewCommonExceptionBinding0, "inflate(...)");
        this.a = viewCommonExceptionBinding0;
    }

    public TistoryErrorView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0);
        ViewCommonExceptionBinding viewCommonExceptionBinding0 = ViewCommonExceptionBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(viewCommonExceptionBinding0, "inflate(...)");
        this.a = viewCommonExceptionBinding0;
    }

    public TistoryErrorView(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        ViewCommonExceptionBinding viewCommonExceptionBinding0 = ViewCommonExceptionBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(viewCommonExceptionBinding0, "inflate(...)");
        this.a = viewCommonExceptionBinding0;
    }

    public static final void a(Function0 function00, View view0) {
        Intrinsics.checkNotNullParameter(function00, "$refreshCallback");
        function00.invoke();
    }

    @Override  // com.kakao.android.base.exception.IBaseExceptionView
    public void addView(@NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        viewGroup0.addView(this);
    }

    @Override  // com.kakao.android.base.exception.IBaseExceptionView
    public void hide() {
        this.a.getRoot().setVisibility(8);
    }

    @Override  // com.kakao.android.base.exception.IBaseExceptionView, android.view.View
    public boolean isShown() {
        return this.a.getRoot().getVisibility() == 0;
    }

    @Override  // com.kakao.android.base.exception.IBaseExceptionView
    public void setContent(@NotNull ErrorModel errorModel0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        Intrinsics.checkNotNullParameter(function00, "refreshCallback");
        this.a.setTitle(errorModel0.getTitle());
        ViewCommonExceptionBinding viewCommonExceptionBinding0 = this.a;
        CharSequence charSequence0 = errorModel0.getMessage();
        int v = 8;
        Emoji emojiErrorModel$Emoji0 = null;
        boolean z = false;
        if(charSequence0 == null) {
        label_14:
            AppCompatButton appCompatButton0 = this.a.commonExceptionRefreshButton;
            if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "EXCEPTION_UNKNOWN_STATUS")) {
                c c0 = new c(function00, 3);
                this.a.commonExceptionRefreshButton.setOnClickListener(c0);
                v = 0;
            }
            appCompatButton0.setVisibility(v);
            CharSequence charSequence1 = errorModel0.getSpannedMessage();
            if(charSequence1 == null) {
            label_24:
                String s = this.getContext().getResources().getString(string.label_exception_common_message);
                Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
                String s1 = this.getContext().getResources().getString(string.label_exception_common_message_linked_text);
                Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
                int v1 = ContextCompat.getColor(this.getContext(), color.gray5);
                b b0 = new b(this);
                charSequence0 = StringUtils.getStringWithClickableSpan$default(StringUtils.INSTANCE, s, s1, v1, true, false, b0, 16, null);
                z = true;
            }
            else {
                charSequence0 = p.isBlank(charSequence1) ? null : charSequence1;
                if(charSequence0 == null) {
                    goto label_24;
                }
            }
        }
        else {
            if(p.isBlank(charSequence0)) {
                charSequence0 = null;
            }
            if(charSequence0 != null) {
                this.a.commonExceptionRefreshButton.setVisibility(8);
                goto label_32;
            }
            goto label_14;
        }
    label_32:
        viewCommonExceptionBinding0.setMessage(charSequence0);
        MovementMethod movementMethod0 = LinkMovementMethod.getInstance();
        this.a.commonExceptionMessageText.setMovementMethod(movementMethod0);
        if(z) {
            emojiErrorModel$Emoji0 = Emoji.Screaming;
        }
        else {
            EmojiErrorModel emojiErrorModel0 = errorModel0 instanceof EmojiErrorModel ? ((EmojiErrorModel)errorModel0) : null;
            if(emojiErrorModel0 != null) {
                emojiErrorModel$Emoji0 = emojiErrorModel0.getEmoji();
            }
        }
        this.setEmoji(emojiErrorModel$Emoji0);
    }

    private final void setEmoji(Emoji emojiErrorModel$Emoji0) {
        int v;
        TextView textView0 = this.a.commonExceptionEmojiText;
        if(emojiErrorModel$Emoji0 == null) {
            v = 8;
        }
        else {
            textView0.setText(emojiErrorModel$Emoji0.getEmoticon());
            textView0.setGravity(emojiErrorModel$Emoji0.getGravity());
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = textView0.getLayoutParams();
            LayoutParams constraintLayout$LayoutParams0 = null;
            LayoutParams constraintLayout$LayoutParams1 = viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0) : null;
            if(constraintLayout$LayoutParams1 != null) {
                Context context0 = textView0.getContext();
                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                constraintLayout$LayoutParams1.bottomMargin = ScaleUtilsKt.dp2px(context0, emojiErrorModel$Emoji0.getBottomMargin());
                constraintLayout$LayoutParams0 = constraintLayout$LayoutParams1;
            }
            textView0.setLayoutParams(constraintLayout$LayoutParams0);
            v = 0;
        }
        textView0.setVisibility(v);
    }

    @Override  // com.kakao.android.base.exception.IBaseExceptionView
    public void setPaddingTopEnabled(boolean z) {
        this.a.commonExceptionPaddingTop.setVisibility((z ? 0 : 8));
    }

    @Override  // com.kakao.android.base.exception.IBaseExceptionView
    public void show() {
        this.a.getRoot().setVisibility(0);
    }
}

