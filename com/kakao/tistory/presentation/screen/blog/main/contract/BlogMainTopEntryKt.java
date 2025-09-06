package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.common.Thumbnail;
import com.kakao.tistory.domain.statistics.entity.TopEntry;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A \u0001\u0010\u0012\u001A\u0004\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022w\u0010\u0010\u001As\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000B\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000E\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000F\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "Lcom/kakao/tistory/domain/statistics/entity/TopEntry;", "Lkotlin/Function0;", "", "onClickMore", "Lkotlin/Function5;", "", "Lkotlin/ParameterName;", "name", "id", "", "title", "image", "", "orderNum", "url", "onClickEntry", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntry;", "toBlogTopEntry", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function5;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntry;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainTopEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainTopEntry.kt\ncom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1559#2:59\n1590#2,4:60\n*S KotlinDebug\n*F\n+ 1 BlogMainTopEntry.kt\ncom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntryKt\n*L\n45#1:59\n45#1:60,4\n*E\n"})
public final class BlogMainTopEntryKt {
    @Nullable
    public static final BlogMainTopEntry toBlogTopEntry(@NotNull List list0, @NotNull Function0 function00, @NotNull Function5 function50) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onClickMore");
        Intrinsics.checkNotNullParameter(function50, "onClickEntry");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        Iterator iterator0 = list0.iterator();
        for(int v = 0; true; ++v) {
            BlogMainTopEntry blogMainTopEntry0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            long v1 = ((TopEntry)object0).getId();
            String s = ((TopEntry)object0).getTitle();
            Thumbnail thumbnail0 = ((TopEntry)object0).getThumbnail();
            if(thumbnail0 != null) {
                blogMainTopEntry0 = ThumbnailUiStateKt.toItem(thumbnail0);
            }
            arrayList0.add(new BlogMainTopEntryItem(v1, s, ((ThumbnailUiState)blogMainTopEntry0), new q0(function50, ((TopEntry)object0), v), ((TopEntry)object0).getPermalink(), ((TopEntry)object0).getLikeCount(), ((TopEntry)object0).getCommentCount(), ((TopEntry)object0).getCount()));
        }
        return arrayList0.isEmpty() ? null : new BlogMainTopEntry(function00, arrayList0);
    }
}

