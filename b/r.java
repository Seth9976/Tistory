package b;

import com.kakao.kandinsky.home.contract.HomeMenu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class r {
    public static s a(HomeMenu homeMenu0) {
        Intrinsics.checkNotNullParameter(homeMenu0, "menu");
        switch(q.a[homeMenu0.ordinal()]) {
            case 1: {
                return s.e;
            }
            case 2: {
                return s.f;
            }
            case 3: {
                return s.g;
            }
            case 4: {
                return s.h;
            }
            case 5: {
                return s.i;
            }
            case 6: {
                return s.j;
            }
            case 7: {
                return s.k;
            }
            case 8: {
                return s.l;
            }
            case 9: {
                return null;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

