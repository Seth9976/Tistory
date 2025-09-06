package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.kakao.keditor.databinding.KeViewGrammarEditBottomAreaBinding;
import com.kakao.keditor.plugin.itemspec.grammarcheck.SingleGrammarCheck;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\u000E\u0010\u0013\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u0015J\u0014\u0010\u0016\u001A\u00020\u00112\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0014\u0010\u0017\u001A\u00020\u00112\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010R\u000E\u0010\t\u001A\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000B\u001A\u00020\f8F¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u0016\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000E¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarEditBottomView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kakao/keditor/databinding/KeViewGrammarEditBottomAreaBinding;", "editTextString", "", "getEditTextString", "()Ljava/lang/String;", "onEditClick", "Lkotlin/Function0;", "", "onPassClick", "setGrammarError", "error", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/SingleGrammarCheck;", "setOnEditClickListener", "setOnPassClickListener", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GrammarEditBottomView extends FrameLayout {
    @NotNull
    private final KeViewGrammarEditBottomAreaBinding binding;
    @Nullable
    private Function0 onEditClick;
    @Nullable
    private Function0 onPassClick;

    @JvmOverloads
    public GrammarEditBottomView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @JvmOverloads
    public GrammarEditBottomView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @JvmOverloads
    public GrammarEditBottomView(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        KeViewGrammarEditBottomAreaBinding keViewGrammarEditBottomAreaBinding0 = KeViewGrammarEditBottomAreaBinding.inflate(LayoutInflater.from(context0), this, true);
        Intrinsics.checkNotNullExpressionValue(keViewGrammarEditBottomAreaBinding0, "inflate(...)");
        this.binding = keViewGrammarEditBottomAreaBinding0;
        b b0 = new b(this, 0);
        keViewGrammarEditBottomAreaBinding0.keGrammarBtnPass.setOnClickListener(b0);
        b b1 = new b(this, 1);
        keViewGrammarEditBottomAreaBinding0.keGrammarBtnEdit.setOnClickListener(b1);
    }

    public GrammarEditBottomView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private static final void _init_$lambda$0(GrammarEditBottomView grammarEditBottomView0, View view0) {
        Intrinsics.checkNotNullParameter(grammarEditBottomView0, "this$0");
        Function0 function00 = grammarEditBottomView0.onPassClick;
        if(function00 != null) {
            function00.invoke();
        }
    }

    private static final void _init_$lambda$1(GrammarEditBottomView grammarEditBottomView0, View view0) {
        Intrinsics.checkNotNullParameter(grammarEditBottomView0, "this$0");
        Function0 function00 = grammarEditBottomView0.onEditClick;
        if(function00 != null) {
            function00.invoke();
        }
    }

    @NotNull
    public final String getEditTextString() {
        return this.binding.keGrammarEditText.getText().toString();
    }

    public final void setGrammarError(@NotNull SingleGrammarCheck singleGrammarCheck0) {
        Intrinsics.checkNotNullParameter(singleGrammarCheck0, "error");
        this.binding.setCurrentGrammarError(singleGrammarCheck0);
    }

    public final void setOnEditClickListener(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "onEditClick");
        this.onEditClick = function00;
    }

    public final void setOnPassClickListener(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "onPassClick");
        this.onPassClick = function00;
    }
}

