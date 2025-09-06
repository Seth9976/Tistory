package com.kakao.android.base.exception;

import android.view.ViewGroup;
import com.kakao.android.base.model.ErrorModel;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\b\u0010\u0006\u001A\u00020\u0003H&J\b\u0010\u0007\u001A\u00020\bH&J \u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u000B2\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00030\rH&J\u0012\u0010\u000E\u001A\u00020\u00032\b\b\u0002\u0010\u000F\u001A\u00020\bH&J\b\u0010\u0010\u001A\u00020\u0003H&¨\u0006\u0011"}, d2 = {"Lcom/kakao/android/base/exception/IBaseExceptionView;", "", "addView", "", "parent", "Landroid/view/ViewGroup;", "hide", "isShown", "", "setContent", "errorModel", "Lcom/kakao/android/base/model/ErrorModel;", "refreshCallback", "Lkotlin/Function0;", "setPaddingTopEnabled", "enabled", "show", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface IBaseExceptionView {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void setContent$default(IBaseExceptionView iBaseExceptionView0, ErrorModel errorModel0, Function0 function00, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setContent");
            }
            if((v & 2) != 0) {
                function00 = a.w;
            }
            iBaseExceptionView0.setContent(errorModel0, function00);
        }

        public static void setPaddingTopEnabled$default(IBaseExceptionView iBaseExceptionView0, boolean z, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPaddingTopEnabled");
            }
            if((v & 1) != 0) {
                z = false;
            }
            iBaseExceptionView0.setPaddingTopEnabled(z);
        }
    }

    void addView(@NotNull ViewGroup arg1);

    void hide();

    boolean isShown();

    void setContent(@NotNull ErrorModel arg1, @NotNull Function0 arg2);

    void setPaddingTopEnabled(boolean arg1);

    void show();
}

