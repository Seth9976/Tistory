package com.kakao.kandinsky.mosaic;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0003\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0004\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0005\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0006\u001A\u00020\u0001*\u00020\u0001¨\u0006\u0007"}, d2 = {"getDeleteTrackerLayer", "", "Lcom/kakao/kandinsky/mosaic/ViewType;", "getDragTrackerLayer", "getMainTrackerLayer", "getSlideTrackerLayer", "getTypeTrackerLayer", "mosaic_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ViewTypeTrackerKt {
    @NotNull
    public static final String getDeleteTrackerLayer(@NotNull ViewType viewType0) {
        Intrinsics.checkNotNullParameter(viewType0, "<this>");
        String s = viewType0.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
        return "delete" + s;
    }

    @NotNull
    public static final String getDragTrackerLayer(@NotNull ViewType viewType0) {
        Intrinsics.checkNotNullParameter(viewType0, "<this>");
        String s = viewType0.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
        return s + "-resize";
    }

    @NotNull
    public static final String getMainTrackerLayer(@NotNull ViewType viewType0) {
        Intrinsics.checkNotNullParameter(viewType0, "<this>");
        return viewType0 == ViewType.Mosaic ? "mosaic-tab" : "blur-tab";
    }

    @NotNull
    public static final String getSlideTrackerLayer(@NotNull ViewType viewType0) {
        Intrinsics.checkNotNullParameter(viewType0, "<this>");
        String s = viewType0.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
        return s + "-degree";
    }

    @NotNull
    public static final String getTypeTrackerLayer(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return Intrinsics.areEqual(s, "Circle") ? "circle" : "square";
    }
}

