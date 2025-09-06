package com.kakao.keditor.plugin.itemspec.opengraph;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment.Center;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Ready;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.attrs.item.Aligned;
import com.kakao.keditor.plugin.attrs.item.Loadable.DefaultImpls;
import com.kakao.keditor.plugin.attrs.item.Loadable;
import com.kakao.keditor.plugin.attrs.item.NoUpdateWhenAlignmentChanged;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "opengraph")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005R$\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0007@VX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u001C\u0010\r\u001A\u0004\u0018\u00010\u000EX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001C\u0010\u0013\u001A\u0004\u0018\u00010\u000EX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001C\u0010\u0016\u001A\u0004\u0018\u00010\u000EX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001A\u0010\u0019\u001A\u00020\u001AX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\u001C\u0010\u001F\u001A\u0004\u0018\u00010\u000EX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001A\u0010\"\u001A\u00020\u000EX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001C\u0010%\u001A\u0004\u0018\u00010\u000EX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b&\u0010\u0010\"\u0004\b\'\u0010\u0012R\u001A\u0010(\u001A\u00020\u000EX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R\u001E\u0010+\u001A\u0004\u0018\u00010,X\u0086\u000E¢\u0006\u0010\n\u0002\u00101\u001A\u0004\b-\u0010.\"\u0004\b/\u00100R\u001E\u00102\u001A\u0004\u0018\u00010,X\u0086\u000E¢\u0006\u0010\n\u0002\u00101\u001A\u0004\b3\u0010.\"\u0004\b4\u00100¨\u00065"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/opengraph/OpenGraphItem;", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/attrs/item/Loadable;", "Lcom/kakao/keditor/plugin/attrs/item/Aligned;", "Lcom/kakao/keditor/plugin/attrs/item/NoUpdateWhenAlignmentChanged;", "()V", "value", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "alignment", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "setAlignment", "(Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "desc", "", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "host", "getHost", "setHost", "image", "getImage", "setImage", "loadingStatus", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "getLoadingStatus", "()Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "setLoadingStatus", "(Lcom/kakao/keditor/plugin/attrs/LoadingStatus;)V", "resourceType", "getResourceType", "setResourceType", "sourceUrl", "getSourceUrl", "setSourceUrl", "title", "getTitle", "setTitle", "url", "getUrl", "setUrl", "videoHeight", "", "getVideoHeight", "()Ljava/lang/Float;", "setVideoHeight", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "videoWidth", "getVideoWidth", "setVideoWidth", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OpenGraphItem extends KeditorItem implements Aligned, Loadable, NoUpdateWhenAlignmentChanged {
    @NotNull
    private Alignment alignment;
    @Nullable
    private String desc;
    @Nullable
    private String host;
    @Nullable
    private String image;
    @NotNull
    private LoadingStatus loadingStatus;
    @Nullable
    private String resourceType;
    @NotNull
    private String sourceUrl;
    @Nullable
    private String title;
    @NotNull
    private String url;
    @Nullable
    private Float videoHeight;
    @Nullable
    private Float videoWidth;

    public OpenGraphItem() {
        this.sourceUrl = "";
        this.url = "";
        this.alignment = Center.INSTANCE;
        this.loadingStatus = Ready.INSTANCE;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void completedLoading() {
        DefaultImpls.completedLoading(this);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void failedLoading() {
        DefaultImpls.failedLoading(this);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    @NotNull
    public Alignment getAlignment() {
        return this.alignment;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getHost() {
        return this.host;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    @NotNull
    public LoadingStatus getLoadingStatus() {
        return this.loadingStatus;
    }

    @Nullable
    public final String getResourceType() {
        return this.resourceType;
    }

    @NotNull
    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Float getVideoHeight() {
        return this.videoHeight;
    }

    @Nullable
    public final Float getVideoWidth() {
        return this.videoWidth;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public boolean isNowLoading() {
        return DefaultImpls.isNowLoading(this);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    public void setAlignment(@NotNull Alignment alignment0) {
        Intrinsics.checkNotNullParameter(alignment0, "value");
        this.removeBypass("align");
        this.alignment = alignment0;
    }

    public final void setDesc(@Nullable String s) {
        this.desc = s;
    }

    public final void setHost(@Nullable String s) {
        this.host = s;
    }

    public final void setImage(@Nullable String s) {
        this.image = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void setLoadingStatus(@NotNull LoadingStatus loadingStatus0) {
        Intrinsics.checkNotNullParameter(loadingStatus0, "<set-?>");
        this.loadingStatus = loadingStatus0;
    }

    public final void setResourceType(@Nullable String s) {
        this.resourceType = s;
    }

    public final void setSourceUrl(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.sourceUrl = s;
    }

    public final void setTitle(@Nullable String s) {
        this.title = s;
    }

    public final void setUrl(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.url = s;
    }

    public final void setVideoHeight(@Nullable Float float0) {
        this.videoHeight = float0;
    }

    public final void setVideoWidth(@Nullable Float float0) {
        this.videoWidth = float0;
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

