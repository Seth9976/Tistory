package hc;

import com.kakao.tistory.presentation.view.bottomsheet.DaumCategoryDialogFragment;
import com.kakao.tistory.presentation.view.bottomsheet.r;
import com.kakao.tistory.presentation.view.common.bottomsheet.AccessibilityBottomDialogFragment;
import com.kakao.tistory.presentation.view.common.bottomsheet.CommonBottomDialogFragment;
import com.kakao.tistory.presentation.view.common.bottomsheet.h;
import com.kakao.tistory.presentation.viewmodel.BlogCategoryViewModel;
import com.kakao.tistory.presentation.viewmodel.DaumCategoryViewModel;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel;
import com.kakao.tistory.presentation.viewmodel.e2;
import com.kakao.tistory.presentation.viewmodel.e;
import com.kakao.tistory.presentation.viewmodel.f2;
import com.kakao.tistory.presentation.viewmodel.f;
import com.kakao.tistory.presentation.viewmodel.u;
import io.reactivex.functions.Consumer;
import j0.b2;
import jb.t;
import jb.w;
import jb.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d implements Consumer {
    public final int a;
    public final Lambda b;

    public d(Lambda lambda0, int v) {
        this.a = v;
        this.b = lambda0;
        super();
    }

    @Override  // io.reactivex.functions.Consumer
    public final void accept(Object object0) {
        Lambda lambda0 = this.b;
        switch(this.a) {
            case 0: {
                DaumCategoryDialogFragment.a(((r)lambda0), object0);
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((y)lambda0), "$tmp0");
                ((y)lambda0).invoke(object0);
                return;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((w)lambda0), "$tmp0");
                ((w)lambda0).invoke(object0);
                return;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((t)lambda0), "$tmp0");
                ((t)lambda0).invoke(object0);
                return;
            }
            case 4: {
                AccessibilityBottomDialogFragment.a(((com.kakao.tistory.presentation.view.common.bottomsheet.d)lambda0), object0);
                return;
            }
            case 5: {
                CommonBottomDialogFragment.a(((h)lambda0), object0);
                return;
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((b2)lambda0), "$tmp0");
                ((b2)lambda0).invoke(object0);
                return;
            }
            case 7: {
                BlogCategoryViewModel.b(((e)lambda0), object0);
                return;
            }
            case 8: {
                BlogCategoryViewModel.c(((f)lambda0), object0);
                return;
            }
            case 9: {
                DaumCategoryViewModel.b(((com.kakao.tistory.presentation.viewmodel.t)lambda0), object0);
                return;
            }
            case 10: {
                DaumCategoryViewModel.c(((u)lambda0), object0);
                return;
            }
            case 11: {
                KakaoLoginViewModel.c(((e2)lambda0), object0);
                return;
            }
            default: {
                KakaoLoginViewModel.d(((f2)lambda0), object0);
            }
        }
    }
}

