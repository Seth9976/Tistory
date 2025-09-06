package sc;

import com.kakao.tistory.presentation.viewmodel.BlogCategoryViewModel;
import com.kakao.tistory.presentation.viewmodel.DaumCategoryViewModel;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel;
import com.kakao.tistory.presentation.viewmodel.c2;
import com.kakao.tistory.presentation.viewmodel.d2;
import com.kakao.tistory.presentation.viewmodel.d;
import com.kakao.tistory.presentation.viewmodel.s;
import io.reactivex.functions.Function;
import kotlin.jvm.internal.Lambda;

public final class a implements Function {
    public final int a;
    public final Lambda b;

    public a(Lambda lambda0, int v) {
        this.a = v;
        this.b = lambda0;
        super();
    }

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        switch(this.a) {
            case 0: {
                return BlogCategoryViewModel.a(((d)this.b), object0);
            }
            case 1: {
                return DaumCategoryViewModel.a(((s)this.b), object0);
            }
            case 2: {
                return KakaoLoginViewModel.a(((c2)this.b), object0);
            }
            default: {
                return KakaoLoginViewModel.b(((d2)this.b), object0);
            }
        }
    }
}

