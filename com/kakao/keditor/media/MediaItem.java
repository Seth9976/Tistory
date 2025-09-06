package com.kakao.keditor.media;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.attrs.item.Loadable.DefaultImpls;
import com.kakao.keditor.plugin.attrs.item.Loadable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/keditor/media/MediaItem;", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/attrs/item/Loadable;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class MediaItem extends KeditorItem implements Loadable {
    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void completedLoading() {
        DefaultImpls.completedLoading(this);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void failedLoading() {
        DefaultImpls.failedLoading(this);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public boolean isNowLoading() {
        return DefaultImpls.isNowLoading(this);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void startedLoading() {
        DefaultImpls.startedLoading(this);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void succeedLoading() {
        DefaultImpls.succeedLoading(this);
    }
}

