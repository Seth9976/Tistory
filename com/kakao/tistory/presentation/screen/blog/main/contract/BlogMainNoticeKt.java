package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.Notice;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0084\u0001\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022b\u0010\u0004\u001A^\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u000F0\u00052\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0011¨\u0006\u0012"}, d2 = {"toBlogMainNotice", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainNotice;", "", "Lcom/kakao/tistory/domain/blog/entity/Notice;", "onClick", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "id", "", "title", "pLink", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;", "restrictType", "", "onClickMore", "Lkotlin/Function0;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainNoticeKt {
    @Nullable
    public static final BlogMainNotice toBlogMainNotice(@NotNull List list0, @NotNull Function4 function40, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function40, "onClick");
        Intrinsics.checkNotNullParameter(function00, "onClickMore");
        Notice notice0 = (Notice)CollectionsKt___CollectionsKt.firstOrNull(list0);
        return notice0 == null ? null : new BlogMainNotice(notice0.getTitle(), new n0(function40, notice0), list0.size() > 1, function00);
    }
}

