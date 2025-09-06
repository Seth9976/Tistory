package com.kakao.tistory.presentation.screen.blog.navigation;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u0006¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/navigation/BlogNestedNavActions;", "", "goNoticeList", "Lkotlin/Function0;", "", "getGoNoticeList", "()Lkotlin/jvm/functions/Function0;", "goRevenue", "getGoRevenue", "goSetting", "getGoSetting", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogNestedNavActions {
    @NotNull
    Function0 getGoNoticeList();

    @NotNull
    Function0 getGoRevenue();

    @NotNull
    Function0 getGoSetting();
}

