package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextStyle;
import com.kakao.tistory.presentation.theme.TTextStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/design/ui/list/EntryStyle;", "", "Landroidx/compose/ui/text/TextStyle;", "a", "Landroidx/compose/ui/text/TextStyle;", "getTitleTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "TitleTextStyle", "b", "getSummaryTextStyle", "SummaryTextStyle", "c", "getGridTitleTextStyle", "GridTitleTextStyle", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EntryStyle {
    public static final int $stable;
    @NotNull
    public static final EntryStyle INSTANCE;
    public static final TextStyle a;
    public static final TextStyle b;
    public static final TextStyle c;

    static {
        EntryStyle.INSTANCE = new EntryStyle();
        EntryStyle.a = TextStyle.copy-p1EtxEg$default(TTextStyle.INSTANCE.getSize16Weight600(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
        EntryStyle.b = TextStyle.copy-p1EtxEg$default(TTextStyle.INSTANCE.getSize13Weight400(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
        EntryStyle.c = TextStyle.copy-p1EtxEg$default(TTextStyle.INSTANCE.getSize15Weight600(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
    }

    @NotNull
    public final TextStyle getGridTitleTextStyle() {
        return EntryStyle.c;
    }

    @NotNull
    public final TextStyle getSummaryTextStyle() {
        return EntryStyle.b;
    }

    @NotNull
    public final TextStyle getTitleTextStyle() {
        return EntryStyle.a;
    }
}

