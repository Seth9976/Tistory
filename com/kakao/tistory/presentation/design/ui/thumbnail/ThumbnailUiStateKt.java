package com.kakao.tistory.presentation.design.ui.thumbnail;

import com.kakao.tistory.domain.common.Thumbnail;
import com.kakao.tistory.presentation.common.utils.UrlUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0003\u001A\n\u0010\u0004\u001A\u00020\u0001*\u00020\u0002\u001A\f\u0010\u0004\u001A\u0004\u0018\u00010\u0001*\u00020\u0005\u001A\n\u0010\u0006\u001A\u00020\u0001*\u00020\u0003¨\u0006\u0007"}, d2 = {"toBlogThumbnailItem", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "Lcom/kakao/tistory/domain/common/Thumbnail;", "", "toItem", "Lcom/kakao/tistory/domain/entity/Thumbnail;", "toThumbnailItem", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ThumbnailUiStateKt {
    @NotNull
    public static final ThumbnailUiState toBlogThumbnailItem(@NotNull Thumbnail thumbnail0) {
        Intrinsics.checkNotNullParameter(thumbnail0, "<this>");
        return ThumbnailUiStateKt.toBlogThumbnailItem(thumbnail0.getOrigin());
    }

    // 去混淆评级： 低(45)
    @NotNull
    public static final ThumbnailUiState toBlogThumbnailItem(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return UrlUtils.INSTANCE.isGif(s) || UrlUtils.INSTANCE.isThumbnailUrl(s) || !UrlUtils.INSTANCE.isUrl(s) ? ThumbnailUiStateKt.toThumbnailItem(s) : new ThumbnailUiState(s, UrlUtils.INSTANCE.toThumbnailUrl(s, "R700x0"), UrlUtils.INSTANCE.toThumbnailUrl(s, "R300x0"), UrlUtils.INSTANCE.toThumbnailUrl(s, "R100x0"));
    }

    @NotNull
    public static final ThumbnailUiState toItem(@NotNull Thumbnail thumbnail0) {
        Intrinsics.checkNotNullParameter(thumbnail0, "<this>");
        return new ThumbnailUiState(thumbnail0.getOrigin(), thumbnail0.getLarge(), thumbnail0.getMedium(), thumbnail0.getSmall());
    }

    // 去混淆评级： 低(30)
    @Nullable
    public static final ThumbnailUiState toItem(@NotNull com.kakao.tistory.domain.entity.Thumbnail thumbnail0) {
        Intrinsics.checkNotNullParameter(thumbnail0, "<this>");
        String s = thumbnail0.getOrigin();
        return s == null ? null : new ThumbnailUiState(s, (thumbnail0.getLarge() == null ? UrlUtils.INSTANCE.toThumbnailUrl(s, "R700x0") : thumbnail0.getLarge()), (thumbnail0.getMedium() == null ? UrlUtils.INSTANCE.toThumbnailUrl(s, "R300x0") : thumbnail0.getMedium()), (thumbnail0.getSmall() == null ? UrlUtils.INSTANCE.toThumbnailUrl(s, "R100x0") : thumbnail0.getSmall()));
    }

    @NotNull
    public static final ThumbnailUiState toThumbnailItem(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return new ThumbnailUiState(s, s, s, s);
    }
}

