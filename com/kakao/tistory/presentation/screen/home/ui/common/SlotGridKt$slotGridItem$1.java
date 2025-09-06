package com.kakao.tistory.presentation.screen.home.ui.common;

import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Blog;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Entry;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u000E*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u001A\u0010\b\u001A\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R \u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u001A\u0010\u0015\u001A\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0018\u001A\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0005\u001A\u0004\b\u0017\u0010\u0007R \u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\f\u001A\u0004\b\u001A\u0010\u000ER\u001A\u0010\u001C\u001A\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u001C\u0010\u0012\u001A\u0004\b\u001D\u0010\u0014¨\u0006\u001E"}, d2 = {"com/kakao/tistory/presentation/screen/home/ui/common/SlotGridKt$slotGridItem$1", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Blog;", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "a", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getThumbnail", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "thumbnail", "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function0;", "getOnClickEntry", "()Lkotlin/jvm/functions/Function0;", "onClickEntry", "", "c", "Ljava/lang/String;", "getBlogTitle", "()Ljava/lang/String;", "blogTitle", "d", "getBlogImage", "blogImage", "e", "getOnClickBlog", "onClickBlog", "title", "getTitle", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SlotGridKt.slotGridItem.1 implements Blog, Entry {
    public final ThumbnailUiState a;
    public final z0 b;
    public final String c;
    public final ThumbnailUiState d;
    public final y0 e;

    public SlotGridKt.slotGridItem.1() {
        this.a = ThumbnailUiStateKt.toThumbnailItem("http://t1.daumcdn.net/brunch/service/user/2xr/image/6-d1CBljJhw2mnAT69vMQfDoNyM.png");
        this.b = z0.a;
        this.c = "청량리프123456711111111111111";
        this.d = ThumbnailUiStateKt.toThumbnailItem("http://t1.daumcdn.net/brunch/service/user/2xr/image/6-d1CBljJhw2mnAT69vMQfDoNyM.png");
        this.e = y0.a;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
    @NotNull
    public ThumbnailUiState getBlogImage() {
        return this.d;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
    @NotNull
    public String getBlogTitle() {
        return this.c;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
    @NotNull
    public Function0 getOnClickBlog() {
        return this.e;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
    @NotNull
    public Function0 getOnClickEntry() {
        return this.b;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
    @Nullable
    public Function0 getOnLongClickEntry() {
        return null;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
    @Nullable
    public String getSummary() {
        return null;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
    @NotNull
    public ThumbnailUiState getThumbnail() {
        return this.a;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
    @NotNull
    public String getTitle() {
        return "미술관에서 즐기는 봄의 정취 한국 청자 도자기의 아름다움";
    }
}

