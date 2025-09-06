package com.kakao.keditor.plugin.itemspec.poll;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.item.ImageUploadable.DefaultImpls;
import com.kakao.keditor.plugin.attrs.item.ImageUploadable;
import com.kakao.keditor.plugin.attrs.item.Location;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "pollItem")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u00106\u001A\u0002072\u0006\u0010-\u001A\u00020\u0007H\u0016R&\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0094\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u001E\u0010\r\u001A\u0004\u0018\u00010\u000EX\u0096\u000E¢\u0006\u0010\n\u0002\u0010\u0013\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0014\u001A\u00020\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001A\u0010\u0019\u001A\u00020\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001A\u0010\u0016\"\u0004\b\u001B\u0010\u0018R\u001A\u0010\u001C\u001A\u00020\u001DX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R\u001A\u0010\"\u001A\u00020\u000EX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001A\u0010\'\u001A\u00020\u000EX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b(\u0010$\"\u0004\b)\u0010&R\u0016\u0010*\u001A\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b+\u0010\u0016R&\u0010-\u001A\u00020\u00072\u0006\u0010,\u001A\u00020\u00078V@VX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b.\u0010\u0016\"\u0004\b/\u0010\u0018R\u001A\u00100\u001A\u00020\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R\u001E\u00103\u001A\u0004\u0018\u00010\u000EX\u0096\u000E¢\u0006\u0010\n\u0002\u0010\u0013\u001A\u0004\b4\u0010\u0010\"\u0004\b5\u0010\u0012¨\u00068"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/poll/PollSubItem;", "Lcom/kakao/keditor/KeditorItem;", "Ljava/io/Serializable;", "Lcom/kakao/keditor/plugin/attrs/item/ImageUploadable;", "()V", "bypassStored", "", "", "", "getBypassStored", "()Ljava/util/Map;", "setBypassStored", "(Ljava/util/Map;)V", "height", "", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "id", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "image", "getImage", "setImage", "location", "Lcom/kakao/keditor/plugin/attrs/item/Location;", "getLocation", "()Lcom/kakao/keditor/plugin/attrs/item/Location;", "setLocation", "(Lcom/kakao/keditor/plugin/attrs/item/Location;)V", "originHeight", "getOriginHeight", "()I", "setOriginHeight", "(I)V", "originWidth", "getOriginWidth", "setOriginWidth", "path", "getPath", "value", "src", "getSrc", "setSrc", "title", "getTitle", "setTitle", "width", "getWidth", "setWidth", "uploadSucceed", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PollSubItem extends KeditorItem implements ImageUploadable, Serializable {
    @NotNull
    private Map bypassStored;
    @Nullable
    private Integer height;
    @NotNull
    private String id;
    @NotNull
    private String image;
    @NotNull
    private Location location;
    private int originHeight;
    private int originWidth;
    @NotNull
    private String src;
    @NotNull
    private String title;
    @Nullable
    private Integer width;

    public PollSubItem() {
        this.bypassStored = new LinkedHashMap();
        this.src = "";
        this.id = "";
        this.title = "";
        this.image = "";
        this.location = Location.LOCAL;
    }

    @Override  // com.kakao.keditor.KeditorItem
    @NotNull
    public Map getBypassStored() {
        return this.bypassStored;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    @Nullable
    public Integer getHeight() {
        return this.height;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    @NotNull
    public Location getLocation() {
        return this.location;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public int getOriginHeight() {
        return this.originHeight;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public int getOriginWidth() {
        return this.originWidth;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    @Nullable
    public String getPath() {
        return this.image;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.ImageUploadable
    @NotNull
    public String getSrc() {
        return this.image;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    @Nullable
    public Integer getWidth() {
        return this.width;
    }

    @Override  // com.kakao.keditor.KeditorItem
    public void setBypassStored(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<set-?>");
        this.bypassStored = map0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setHeight(@Nullable Integer integer0) {
        this.height = integer0;
    }

    public final void setId(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.id = s;
    }

    public final void setImage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.image = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void setLocation(@NotNull Location location0) {
        Intrinsics.checkNotNullParameter(location0, "<set-?>");
        this.location = location0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setOriginHeight(int v) {
        this.originHeight = v;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setOriginWidth(int v) {
        this.originWidth = v;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.ImageUploadable
    public void setSrc(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.src = s;
        this.image = this.getSrc();
    }

    public final void setTitle(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.title = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setWidth(@Nullable Integer integer0) {
        this.width = integer0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void uploadFailed(@Nullable String s) {
        DefaultImpls.uploadFailed(this, s);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void uploadSucceed(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "src");
        DefaultImpls.uploadSucceed(this, s);
        this.image = s;
    }
}

