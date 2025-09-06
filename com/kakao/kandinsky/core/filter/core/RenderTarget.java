package com.kakao.kandinsky.core.filter.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001A\u00020\tH&J\b\u0010\n\u001A\u00020\tH&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\u0005¨\u0006\u000B"}, d2 = {"Lcom/kakao/kandinsky/core/filter/core/RenderTarget;", "", "height", "", "getHeight", "()I", "width", "getWidth", "bind", "", "unBind", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface RenderTarget {
    void bind();

    int getHeight();

    int getWidth();

    void unBind();
}

