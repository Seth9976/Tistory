package com.kakao.android.base.exception;

import android.view.ViewGroup;
import c9.a;
import com.kakao.android.base.model.ErrorModel;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\bH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EH\u0096\u0001¢\u0006\u0004\b\u000F\u0010\u0010J(\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u00112\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0016\u001A\u00020\u00042\b\b\u0002\u0010\u0015\u001A\u00020\u000EH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\rJ\u0015\u0010\u0019\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0019\u0010\u000BJ\u0015\u0010\u0018\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u001A¨\u0006\u001B"}, d2 = {"Lcom/kakao/android/base/exception/BaseExceptionView;", "Lcom/kakao/android/base/exception/IBaseExceptionView;", "impl", "Lkotlin/Function0;", "", "refreshCallback", "<init>", "(Lcom/kakao/android/base/exception/IBaseExceptionView;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "addView", "(Landroid/view/ViewGroup;)V", "hide", "()V", "", "isShown", "()Z", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "setContent", "(Lcom/kakao/android/base/model/ErrorModel;Lkotlin/jvm/functions/Function0;)V", "enabled", "setPaddingTopEnabled", "(Z)V", "show", "init", "(Lcom/kakao/android/base/model/ErrorModel;)V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BaseExceptionView implements IBaseExceptionView {
    public final Function0 a;
    public final IBaseExceptionView b;

    public BaseExceptionView(@NotNull IBaseExceptionView iBaseExceptionView0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(iBaseExceptionView0, "impl");
        Intrinsics.checkNotNullParameter(function00, "refreshCallback");
        super();
        this.a = function00;
        this.b = iBaseExceptionView0;
    }

    public BaseExceptionView(IBaseExceptionView iBaseExceptionView0, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function00 = a.w;
        }
        this(iBaseExceptionView0, function00);
    }

    @Override  // com.kakao.android.base.exception.IBaseExceptionView
    public void addView(@NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        this.b.addView(viewGroup0);
    }

    @Override  // com.kakao.android.base.exception.IBaseExceptionView
    public void hide() {
        this.b.hide();
    }

    public final void init(@NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        this.addView(viewGroup0);
    }

    @Override  // com.kakao.android.base.exception.IBaseExceptionView
    public boolean isShown() {
        return this.b.isShown();
    }

    @Override  // com.kakao.android.base.exception.IBaseExceptionView
    public void setContent(@NotNull ErrorModel errorModel0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        Intrinsics.checkNotNullParameter(function00, "refreshCallback");
        this.b.setContent(errorModel0, function00);
    }

    @Override  // com.kakao.android.base.exception.IBaseExceptionView
    public void setPaddingTopEnabled(boolean z) {
        this.b.setPaddingTopEnabled(z);
    }

    @Override  // com.kakao.android.base.exception.IBaseExceptionView
    public void show() {
        this.b.show();
    }

    public final void show(@NotNull ErrorModel errorModel0) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        this.setContent(errorModel0, this.a);
        if(!this.isShown()) {
            this.show();
        }
    }
}

