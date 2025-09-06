package com.kakao.keditor.plugin.itemspec.grammarcheck;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000F\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BB\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012!\u0010\b\u001A\u001D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\t¢\u0006\u0002\u0010\u000FJ\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0007HÆ\u0003J$\u0010\u001A\u001A\u001D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\tHÆ\u0003JL\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072#\b\u0002\u0010\b\u001A\u001D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\tHÆ\u0001J\u0013\u0010\u001C\u001A\u00020\u00052\b\u0010\u001D\u001A\u0004\u0018\u00010\u001EHÖ\u0003J\t\u0010\u001F\u001A\u00020 HÖ\u0001J\t\u0010!\u001A\u00020\"HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0004\u0010\u0014R,\u0010\b\u001A\u001D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\t¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/grammarcheck/HighlightGrammarError;", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/GrammarViewRequest;", "grammarError", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;", "isFocused", "", "context", "Landroid/content/Context;", "onClickAction", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "(Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;ZLandroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "getGrammarError", "()Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;", "()Z", "getOnClickAction", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HighlightGrammarError extends GrammarViewRequest {
    @NotNull
    private final Context context;
    @NotNull
    private final KeditorGrammarError grammarError;
    private final boolean isFocused;
    @NotNull
    private final Function1 onClickAction;

    public HighlightGrammarError(@NotNull KeditorGrammarError keditorGrammarError0, boolean z, @NotNull Context context0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(keditorGrammarError0, "grammarError");
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(function10, "onClickAction");
        super(keditorGrammarError0.getItem());
        this.grammarError = keditorGrammarError0;
        this.isFocused = z;
        this.context = context0;
        this.onClickAction = function10;
    }

    public HighlightGrammarError(KeditorGrammarError keditorGrammarError0, boolean z, Context context0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(keditorGrammarError0, z, context0, function10);
    }

    @NotNull
    public final KeditorGrammarError component1() {
        return this.grammarError;
    }

    public final boolean component2() {
        return this.isFocused;
    }

    @NotNull
    public final Context component3() {
        return this.context;
    }

    @NotNull
    public final Function1 component4() {
        return this.onClickAction;
    }

    @NotNull
    public final HighlightGrammarError copy(@NotNull KeditorGrammarError keditorGrammarError0, boolean z, @NotNull Context context0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(keditorGrammarError0, "grammarError");
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(function10, "onClickAction");
        return new HighlightGrammarError(keditorGrammarError0, z, context0, function10);
    }

    public static HighlightGrammarError copy$default(HighlightGrammarError highlightGrammarError0, KeditorGrammarError keditorGrammarError0, boolean z, Context context0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            keditorGrammarError0 = highlightGrammarError0.grammarError;
        }
        if((v & 2) != 0) {
            z = highlightGrammarError0.isFocused;
        }
        if((v & 4) != 0) {
            context0 = highlightGrammarError0.context;
        }
        if((v & 8) != 0) {
            function10 = highlightGrammarError0.onClickAction;
        }
        return highlightGrammarError0.copy(keditorGrammarError0, z, context0, function10);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof HighlightGrammarError)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.grammarError, ((HighlightGrammarError)object0).grammarError)) {
            return false;
        }
        if(this.isFocused != ((HighlightGrammarError)object0).isFocused) {
            return false;
        }
        return Intrinsics.areEqual(this.context, ((HighlightGrammarError)object0).context) ? Intrinsics.areEqual(this.onClickAction, ((HighlightGrammarError)object0).onClickAction) : false;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final KeditorGrammarError getGrammarError() {
        return this.grammarError;
    }

    @NotNull
    public final Function1 getOnClickAction() {
        return this.onClickAction;
    }

    @Override
    public int hashCode() {
        return this.onClickAction.hashCode() + (this.context.hashCode() + a.e(this.grammarError.hashCode() * 0x1F, 0x1F, this.isFocused)) * 0x1F;
    }

    public final boolean isFocused() {
        return this.isFocused;
    }

    @Override
    @NotNull
    public String toString() {
        return "HighlightGrammarError(grammarError=" + this.grammarError + ", isFocused=" + this.isFocused + ", context=" + this.context + ", onClickAction=" + this.onClickAction + ")";
    }
}

