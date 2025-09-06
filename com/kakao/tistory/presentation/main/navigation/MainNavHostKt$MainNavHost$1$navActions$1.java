package com.kakao.tistory.presentation.main.navigation;

import com.kakao.tistory.presentation.main.MainAppState;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\n\u0018\u00002\u00020\u0001R \u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R \u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001A\u0004\b\n\u0010\u0007¨\u0006\f"}, d2 = {"com/kakao/tistory/presentation/main/navigation/MainNavHostKt$MainNavHost$1$navActions$1", "Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;", "Lkotlin/Function0;", "", "p", "Lkotlin/jvm/functions/Function0;", "getShowBlogSwitchBottomSheet", "()Lkotlin/jvm/functions/Function0;", "showBlogSwitchBottomSheet", "q", "getFinish", "finish", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MainNavHostKt.MainNavHost.1.navActions.1 extends NavActions {
    public final n p;
    public final m q;

    public MainNavHostKt.MainNavHost.1.navActions.1(MainAppState mainAppState0) {
        super(mainAppState0);
        this.p = new n(mainAppState0);
        this.q = new m(mainAppState0);
    }

    @Override  // com.kakao.tistory.presentation.screen.blog.navigation.NavActions
    @NotNull
    public Function0 getFinish() {
        return this.q;
    }

    @Override  // com.kakao.tistory.presentation.screen.blog.navigation.NavActions
    @NotNull
    public Function0 getShowBlogSwitchBottomSheet() {
        return this.p;
    }
}

