package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\n"}, d2 = {"com/kakao/tistory/presentation/view/entry/widget/CommentEditFieldKt$TextFieldWithMention$3", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommentEditFieldKt.TextFieldWithMention.3 implements NestedScrollConnection {
    public final z1 a;

    public CommentEditFieldKt.TextFieldWithMention.3(z1 z10) {
        this.a = z10;
        super();
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        Float float0 = (float)(((Number)this.a.a.getValue()).floatValue() - Offset.getY-impl(v));
        this.a.a.setValue(float0);
        return NestedScrollConnection.super.onPostScroll-DzOQY0M(v, v1, v2);
    }
}

