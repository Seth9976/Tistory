package com.kakao.keditor.plugin.itemspec.file;

import a5.b;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment.Center;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Ready;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.attrs.item.Aligned;
import com.kakao.keditor.plugin.attrs.item.FileUploadable;
import com.kakao.keditor.plugin.attrs.item.Loadable.DefaultImpls;
import com.kakao.keditor.plugin.attrs.item.Loadable;
import com.kakao.keditor.plugin.attrs.item.Location;
import com.kakao.keditor.plugin.attrs.item.NoUpdateWhenAlignmentChanged;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "file")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010.\u001A\u00020\u001BH\u0016J\u0010\u0010/\u001A\u0002002\u0006\u0010+\u001A\u00020\u001BH\u0016R$\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\b@VX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u001A\u0010\u000E\u001A\u00020\u000FX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0014\u001A\u00020\u0015X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001C\u0010\u001A\u001A\u0004\u0018\u00010\u001BX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u001A\u0010 \u001A\u00020\u001BX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b!\u0010\u001D\"\u0004\b\"\u0010\u001FR\u0016\u0010#\u001A\u0004\u0018\u00010\u001B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b$\u0010\u001DR\u001A\u0010%\u001A\u00020&X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001A\u0010+\u001A\u00020\u001BX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b,\u0010\u001D\"\u0004\b-\u0010\u001F¨\u00061"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/file/FileItem;", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/attrs/item/Aligned;", "Lcom/kakao/keditor/plugin/attrs/item/Loadable;", "Lcom/kakao/keditor/plugin/attrs/item/FileUploadable;", "Lcom/kakao/keditor/plugin/attrs/item/NoUpdateWhenAlignmentChanged;", "()V", "value", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "alignment", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "setAlignment", "(Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "loadingStatus", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "getLoadingStatus", "()Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "setLoadingStatus", "(Lcom/kakao/keditor/plugin/attrs/LoadingStatus;)V", "location", "Lcom/kakao/keditor/plugin/attrs/item/Location;", "getLocation", "()Lcom/kakao/keditor/plugin/attrs/item/Location;", "setLocation", "(Lcom/kakao/keditor/plugin/attrs/item/Location;)V", "mimeType", "", "getMimeType", "()Ljava/lang/String;", "setMimeType", "(Ljava/lang/String;)V", "name", "getName", "setName", "path", "getPath", "size", "", "getSize", "()J", "setSize", "(J)V", "src", "getSrc", "setSrc", "toString", "uploadSucceed", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FileItem extends KeditorItem implements Aligned, FileUploadable, Loadable, NoUpdateWhenAlignmentChanged {
    @NotNull
    private Alignment alignment;
    @NotNull
    private LoadingStatus loadingStatus;
    @NotNull
    private Location location;
    @Nullable
    private String mimeType;
    @NotNull
    private String name;
    private long size;
    @NotNull
    private String src;

    public FileItem() {
        this.src = "";
        this.name = "";
        this.alignment = Center.INSTANCE;
        this.loadingStatus = Ready.INSTANCE;
        this.location = Location.LOCAL;
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

    @Override  // com.kakao.keditor.plugin.attrs.item.FileUploadable
    @Nullable
    public String getMimeType() {
        return this.mimeType;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.FileUploadable
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    @Nullable
    public String getPath() {
        return this.getSrc();
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.FileUploadable
    public long getSize() {
        return this.size;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.FileUploadable
    @NotNull
    public String getSrc() {
        return this.src;
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

    @Override  // com.kakao.keditor.plugin.attrs.item.FileUploadable
    public void setMimeType(@Nullable String s) {
        this.mimeType = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.FileUploadable
    public void setName(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.name = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.FileUploadable
    public void setSize(long v) {
        this.size = v;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.FileUploadable
    public void setSrc(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.src = s;
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
        StringBuilder stringBuilder0 = b.w("FileItem(src=\'", this.getSrc(), "\', name=\'", this.getName(), "\', size=");
        stringBuilder0.append(this.getSize());
        stringBuilder0.append(", mimeType=");
        stringBuilder0.append(this.getMimeType());
        stringBuilder0.append(", align=");
        stringBuilder0.append(this.getAlignment());
        stringBuilder0.append(", loadingStatus=");
        stringBuilder0.append(this.getLoadingStatus());
        stringBuilder0.append(", location=");
        stringBuilder0.append(this.getLocation());
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void uploadFailed(@Nullable String s) {
        com.kakao.keditor.plugin.attrs.item.FileUploadable.DefaultImpls.uploadFailed(this, s);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void uploadSucceed(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "src");
        com.kakao.keditor.plugin.attrs.item.FileUploadable.DefaultImpls.uploadSucceed(this, s);
        this.setSrc(s);
    }
}

