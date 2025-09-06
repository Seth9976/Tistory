package com.kakao.kandinsky.base.contract;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.kandinsky.core.designsystem.R.string;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q9.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0003\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001A\u00020\u0002\u0012\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0016\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ4\u0010\u000F\u001A\u00020\u00002\b\b\u0003\u0010\u0003\u001A\u00020\u00022\b\b\u0003\u0010\u0004\u001A\u00020\u00022\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000BJ\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001A\u001A\u0004\b\u001D\u0010\u000BR\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000E¨\u0006!"}, d2 = {"Lcom/kakao/kandinsky/base/contract/DialogUiState;", "", "", "titleResId", "messageResId", "Lkotlin/Function0;", "", "onConfirm", "<init>", "(IILkotlin/jvm/functions/Function0;)V", "component1", "()I", "component2", "component3", "()Lkotlin/jvm/functions/Function0;", "copy", "(IILkotlin/jvm/functions/Function0;)Lcom/kakao/kandinsky/base/contract/DialogUiState;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getTitleResId", "b", "getMessageResId", "c", "Lkotlin/jvm/functions/Function0;", "getOnConfirm", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DialogUiState {
    public static final int $stable;
    public final int a;
    public final int b;
    public final Function0 c;

    public DialogUiState() {
        this(0, 0, null, 7, null);
    }

    public DialogUiState(@StringRes int v, @StringRes int v1, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "onConfirm");
        super();
        this.a = v;
        this.b = v1;
        this.c = function00;
    }

    public DialogUiState(int v, int v1, Function0 function00, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = string.cancel_dialog_title;
        }
        if((v2 & 2) != 0) {
            v1 = string.cancel_dialog_message;
        }
        if((v2 & 4) != 0) {
            function00 = a.w;
        }
        this(v, v1, function00);
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    @NotNull
    public final Function0 component3() {
        return this.c;
    }

    @NotNull
    public final DialogUiState copy(@StringRes int v, @StringRes int v1, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "onConfirm");
        return new DialogUiState(v, v1, function00);
    }

    public static DialogUiState copy$default(DialogUiState dialogUiState0, int v, int v1, Function0 function00, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = dialogUiState0.a;
        }
        if((v2 & 2) != 0) {
            v1 = dialogUiState0.b;
        }
        if((v2 & 4) != 0) {
            function00 = dialogUiState0.c;
        }
        return dialogUiState0.copy(v, v1, function00);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DialogUiState)) {
            return false;
        }
        if(this.a != ((DialogUiState)object0).a) {
            return false;
        }
        return this.b == ((DialogUiState)object0).b ? Intrinsics.areEqual(this.c, ((DialogUiState)object0).c) : false;
    }

    public final int getMessageResId() {
        return this.b;
    }

    @NotNull
    public final Function0 getOnConfirm() {
        return this.c;
    }

    public final int getTitleResId() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + r0.a.c(this.b, this.a * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DialogUiState(titleResId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", messageResId=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", onConfirm=");
        return q.q(stringBuilder0, this.c, ")");
    }
}

