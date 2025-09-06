package com.kakao.keditor.plugin.itemspec.table;

import com.kakao.keditor.cdm.ImageAttribute;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Ready;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.attrs.item.ImageUploadable;
import com.kakao.keditor.plugin.attrs.item.Linkable;
import com.kakao.keditor.plugin.attrs.item.Loadable.DefaultImpls;
import com.kakao.keditor.plugin.attrs.item.Loadable;
import com.kakao.keditor.plugin.attrs.item.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001C\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\u0002\u0010\u0006J\b\u0010C\u001A\u00020\bH\u0016R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u001E\u0010\r\u001A\u0004\u0018\u00010\u000EX\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0013\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001E\u0010\u0014\u001A\u0004\u0018\u00010\u0015X\u0086\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0019\u001A\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001A\u0010\u001A\u001A\u00020\u0015X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR\u001C\u0010\u001E\u001A\u0004\u0018\u00010\bX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010\n\"\u0004\b \u0010\fR\u001A\u0010!\u001A\u00020\"X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001A\u0010\'\u001A\u00020(X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001C\u0010-\u001A\u0004\u0018\u00010\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b.\u0010\n\"\u0004\b/\u0010\fR\u001A\u00100\u001A\u00020\u000EX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b1\u00102\"\u0004\b3\u00104R\u001A\u00105\u001A\u00020\u000EX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b6\u00102\"\u0004\b7\u00104R\u0016\u00108\u001A\u0004\u0018\u00010\b8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b9\u0010\nR\u001A\u0010:\u001A\u00020\bX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b;\u0010\n\"\u0004\b<\u0010\fR\u001C\u0010=\u001A\u0004\u0018\u00010\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b>\u0010\n\"\u0004\b?\u0010\fR\u001E\u0010@\u001A\u0004\u0018\u00010\u000EX\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0013\u001A\u0004\bA\u0010\u0010\"\u0004\bB\u0010\u0012\u00A8\u0006D"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/TableImage;", "Lcom/kakao/keditor/plugin/attrs/item/ImageUploadable;", "Lcom/kakao/keditor/plugin/attrs/item/Loadable;", "Lcom/kakao/keditor/plugin/attrs/item/Linkable;", "attribute", "Lcom/kakao/keditor/cdm/ImageAttribute;", "(Lcom/kakao/keditor/cdm/ImageAttribute;)V", "alt", "", "getAlt", "()Ljava/lang/String;", "setAlt", "(Ljava/lang/String;)V", "height", "", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isLinkNewWindow", "", "()Ljava/lang/Boolean;", "setLinkNewWindow", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isRepresent", "()Z", "setRepresent", "(Z)V", "link", "getLink", "setLink", "loadingStatus", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "getLoadingStatus", "()Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "setLoadingStatus", "(Lcom/kakao/keditor/plugin/attrs/LoadingStatus;)V", "location", "Lcom/kakao/keditor/plugin/attrs/item/Location;", "getLocation", "()Lcom/kakao/keditor/plugin/attrs/item/Location;", "setLocation", "(Lcom/kakao/keditor/plugin/attrs/item/Location;)V", "mimeType", "getMimeType", "setMimeType", "originHeight", "getOriginHeight", "()I", "setOriginHeight", "(I)V", "originWidth", "getOriginWidth", "setOriginWidth", "path", "getPath", "src", "getSrc", "setSrc", "title", "getTitle", "setTitle", "width", "getWidth", "setWidth", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TableImage implements ImageUploadable, Linkable, Loadable {
    @Nullable
    private String alt;
    @Nullable
    private Integer height;
    @Nullable
    private Boolean isLinkNewWindow;
    private boolean isRepresent;
    @Nullable
    private String link;
    @NotNull
    private LoadingStatus loadingStatus;
    @NotNull
    private Location location;
    @Nullable
    private String mimeType;
    private int originHeight;
    private int originWidth;
    @NotNull
    private String src;
    @Nullable
    private String title;
    @Nullable
    private Integer width;

    public TableImage(@NotNull ImageAttribute imageAttribute0) {
        Intrinsics.checkNotNullParameter(imageAttribute0, "attribute");
        super();
        String s = imageAttribute0.getSrc();
        if(s == null) {
            s = "";
        }
        this.src = s;
        this.width = imageAttribute0.getWidth();
        this.height = imageAttribute0.getHeight();
        this.originWidth = imageAttribute0.getOriginWidth();
        this.originHeight = imageAttribute0.getOriginHeight();
        this.link = imageAttribute0.getLink();
        this.mimeType = imageAttribute0.getMimeType();
        this.isLinkNewWindow = imageAttribute0.isLinkNewWindow();
        this.title = imageAttribute0.getTitle();
        this.alt = imageAttribute0.getAlt();
        this.location = Location.UPLOADED;
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

    @Nullable
    public final String getAlt() {
        return this.alt;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    @Nullable
    public Integer getHeight() {
        return this.height;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Linkable
    @Nullable
    public String getLink() {
        return this.link;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    @NotNull
    public LoadingStatus getLoadingStatus() {
        return this.loadingStatus;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    @NotNull
    public Location getLocation() {
        return this.location;
    }

    @Nullable
    public final String getMimeType() {
        return this.mimeType;
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
        return this.getSrc();
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.ImageUploadable
    @NotNull
    public String getSrc() {
        return this.src;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    @Nullable
    public Integer getWidth() {
        return this.width;
    }

    @Nullable
    public final Boolean isLinkNewWindow() {
        return this.isLinkNewWindow;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public boolean isNowLoading() {
        return DefaultImpls.isNowLoading(this);
    }

    public final boolean isRepresent() {
        return this.isRepresent;
    }

    public final void setAlt(@Nullable String s) {
        this.alt = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setHeight(@Nullable Integer integer0) {
        this.height = integer0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Linkable
    public void setLink(@Nullable String s) {
        this.link = s;
    }

    public final void setLinkNewWindow(@Nullable Boolean boolean0) {
        this.isLinkNewWindow = boolean0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void setLoadingStatus(@NotNull LoadingStatus loadingStatus0) {
        Intrinsics.checkNotNullParameter(loadingStatus0, "<set-?>");
        this.loadingStatus = loadingStatus0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void setLocation(@NotNull Location location0) {
        Intrinsics.checkNotNullParameter(location0, "<set-?>");
        this.location = location0;
    }

    public final void setMimeType(@Nullable String s) {
        this.mimeType = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setOriginHeight(int v) {
        this.originHeight = v;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setOriginWidth(int v) {
        this.originWidth = v;
    }

    public final void setRepresent(boolean z) {
        this.isRepresent = z;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.ImageUploadable
    public void setSrc(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.src = s;
    }

    public final void setTitle(@Nullable String s) {
        this.title = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setWidth(@Nullable Integer integer0) {
        this.width = integer0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void startedLoading() {
        DefaultImpls.startedLoading(this);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void succeedLoading() {
        DefaultImpls.succeedLoading(this);
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.mimeType;
        Boolean boolean0 = this.isLinkNewWindow;
        String s1 = this.title;
        String s2 = this.alt;
        StringBuilder stringBuilder0 = new StringBuilder("TableImage(src=");
        stringBuilder0.append(this.getSrc());
        stringBuilder0.append(", width=");
        stringBuilder0.append(this.getWidth());
        stringBuilder0.append(", height=");
        stringBuilder0.append(this.getHeight());
        stringBuilder0.append(", originWidth=");
        stringBuilder0.append(this.getOriginWidth());
        stringBuilder0.append(", originHeight=");
        a.j(stringBuilder0, this.getOriginHeight(), ", link=", this.getLink(), ", mimeType=");
        stringBuilder0.append(s);
        stringBuilder0.append(", isLinkNewWindow=");
        stringBuilder0.append(boolean0);
        stringBuilder0.append(", title=");
        androidx.room.a.w(stringBuilder0, s1, ", alt= ", s2, ", location=");
        stringBuilder0.append(this.getLocation());
        stringBuilder0.append(", loadingStatus=");
        stringBuilder0.append(this.getLoadingStatus());
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void uploadFailed(@Nullable String s) {
        com.kakao.keditor.plugin.attrs.item.ImageUploadable.DefaultImpls.uploadFailed(this, s);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void uploadSucceed(@NotNull String s) {
        com.kakao.keditor.plugin.attrs.item.ImageUploadable.DefaultImpls.uploadSucceed(this, s);
    }
}

