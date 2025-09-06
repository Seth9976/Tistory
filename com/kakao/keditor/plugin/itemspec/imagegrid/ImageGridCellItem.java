package com.kakao.keditor.plugin.itemspec.imagegrid;

import com.kakao.keditor.plugin.attrs.LoadingStatus.Ready;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.attrs.item.ImageUploadable;
import com.kakao.keditor.plugin.attrs.item.Loadable.DefaultImpls;
import com.kakao.keditor.plugin.attrs.item.Loadable;
import com.kakao.keditor.plugin.attrs.item.Location;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Be\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\t\u001A\u00020\n\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000E\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0002\u0010\u0011J\u0006\u0010B\u001A\u00020\u0005J\u0014\u0010C\u001A\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017J\b\u0010D\u001A\u00020\u0005H\u0016J\u0010\u0010E\u001A\u00020F2\u0006\u0010\u0004\u001A\u00020\u0005H\u0016R\u001C\u0010\r\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\u001E\u0010\f\u001A\u0004\u0018\u00010\u0007X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010!\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R\u001A\u0010\u0010\u001A\u00020\u000FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\"\"\u0004\b#\u0010$R\u001A\u0010\u000E\u001A\u00020\u000FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\"\"\u0004\b%\u0010$R\u001A\u0010&\u001A\u00020\'X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001C\u0010,\u001A\u00020-8VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b.\u0010/\"\u0004\b0\u00101R\u001A\u0010\b\u001A\u00020\u0007X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b2\u00103\"\u0004\b4\u00105R\u001A\u0010\u0006\u001A\u00020\u0007X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b6\u00103\"\u0004\b7\u00105R\u0014\u00108\u001A\u00020\u00058VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b9\u0010\u0013R\u001A\u0010\u0004\u001A\u00020\u0005X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b:\u0010\u0013\"\u0004\b;\u0010\u0015R\u001E\u0010\u000B\u001A\u0004\u0018\u00010\u0007X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010!\u001A\u0004\b<\u0010\u001E\"\u0004\b=\u0010 R\u001A\u0010\t\u001A\u00020\nX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b>\u0010?\"\u0004\b@\u0010A\u00A8\u0006G"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "Lcom/kakao/keditor/plugin/attrs/item/Loadable;", "Lcom/kakao/keditor/plugin/attrs/item/ImageUploadable;", "Ljava/io/Serializable;", "src", "", "originWidth", "", "originHeight", "widthPercent", "", "width", "height", "alt", "isRepresent", "", "isFocused", "(Ljava/lang/String;IIDLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZZ)V", "getAlt", "()Ljava/lang/String;", "setAlt", "(Ljava/lang/String;)V", "bypassStored", "", "", "getBypassStored", "()Ljava/util/Map;", "setBypassStored", "(Ljava/util/Map;)V", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Z", "setFocused", "(Z)V", "setRepresent", "loadingStatus", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "getLoadingStatus", "()Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "setLoadingStatus", "(Lcom/kakao/keditor/plugin/attrs/LoadingStatus;)V", "location", "Lcom/kakao/keditor/plugin/attrs/item/Location;", "getLocation", "()Lcom/kakao/keditor/plugin/attrs/item/Location;", "setLocation", "(Lcom/kakao/keditor/plugin/attrs/item/Location;)V", "getOriginHeight", "()I", "setOriginHeight", "(I)V", "getOriginWidth", "setOriginWidth", "path", "getPath", "getSrc", "setSrc", "getWidth", "setWidth", "getWidthPercent", "()D", "setWidthPercent", "(D)V", "toComparableJsonString", "toMap", "toString", "uploadSucceed", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageGridCellItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageGridCellItem.kt\ncom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class ImageGridCellItem implements ImageUploadable, Loadable, Serializable {
    @Nullable
    private String alt;
    @NotNull
    private Map bypassStored;
    @Nullable
    private Integer height;
    private boolean isFocused;
    private boolean isRepresent;
    @NotNull
    private LoadingStatus loadingStatus;
    @NotNull
    private Location location;
    private int originHeight;
    private int originWidth;
    @NotNull
    private String src;
    @Nullable
    private Integer width;
    private double widthPercent;

    public ImageGridCellItem() {
        this(null, 0, 0, 0.0, null, null, null, false, false, 0x1FF, null);
    }

    public ImageGridCellItem(@NotNull String s, int v, int v1, double f, @Nullable Integer integer0, @Nullable Integer integer1, @Nullable String s1, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(s, "src");
        super();
        this.src = s;
        this.originWidth = v;
        this.originHeight = v1;
        this.widthPercent = f;
        this.width = integer0;
        this.height = integer1;
        this.alt = s1;
        this.isRepresent = z;
        this.isFocused = z1;
        this.bypassStored = new LinkedHashMap();
        this.location = Location.LOCAL;
        this.loadingStatus = Ready.INSTANCE;
    }

    public ImageGridCellItem(String s, int v, int v1, double f, Integer integer0, Integer integer1, String s1, boolean z, boolean z1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v2 & 1) == 0 ? s : ""), ((v2 & 2) == 0 ? v : 0), ((v2 & 4) == 0 ? v1 : 0), ((v2 & 8) == 0 ? f : 0.0), ((v2 & 16) == 0 ? integer0 : null), ((v2 & 0x20) == 0 ? integer1 : null), ((v2 & 0x40) == 0 ? s1 : null), ((v2 & 0x80) == 0 ? z : false), ((v2 & 0x100) == 0 ? z1 : false));
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

    @NotNull
    public final Map getBypassStored() {
        return this.bypassStored;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    @Nullable
    public Integer getHeight() {
        return this.height;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    @NotNull
    public LoadingStatus getLoadingStatus() {
        return this.loadingStatus;
    }

    // 去混淆评级： 低(40)
    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    @NotNull
    public Location getLocation() {
        return new Regex("https?://").containsMatchIn("") ? Location.UPLOADED : Location.LOCAL;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public int getOriginHeight() {
        return this.originHeight;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public int getOriginWidth() {
        return this.originWidth;
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    @NotNull
    public String getPath() {
        return "";
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.ImageUploadable
    @NotNull
    public String getSrc() [...] // 潜在的解密器

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    @Nullable
    public Integer getWidth() {
        return this.width;
    }

    public final double getWidthPercent() {
        return this.widthPercent;
    }

    public final boolean isFocused() {
        return this.isFocused;
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

    public final void setBypassStored(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<set-?>");
        this.bypassStored = map0;
    }

    public final void setFocused(boolean z) {
        this.isFocused = z;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setHeight(@Nullable Integer integer0) {
        this.height = integer0;
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

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setWidth(@Nullable Integer integer0) {
        this.width = integer0;
    }

    public final void setWidthPercent(double f) {
        this.widthPercent = f;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void startedLoading() {
        DefaultImpls.startedLoading(this);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void succeedLoading() {
        DefaultImpls.succeedLoading(this);
    }

    // 去混淆评级： 中等(60)
    @NotNull
    public final String toComparableJsonString() [...] // 潜在的解密器

    @NotNull
    public final Map toMap() {
        Map map0 = x.mutableMapOf(new Pair[]{TuplesKt.to("src", ""), TuplesKt.to("originWidth", this.getOriginWidth()), TuplesKt.to("originHeight", this.getOriginHeight()), TuplesKt.to("widthPercent", this.widthPercent)});
        String s = this.alt;
        if(s != null) {
            map0.put("alt", s);
        }
        return map0;
    }

    // 去混淆评级： 中等(60)
    @Override
    @NotNull
    public String toString() {
        return "ImageGridCellItem(src=\'\', originWidth=" + this.getOriginWidth() + ", originHeight=" + this.getOriginHeight() + ", isRepresent=" + this.isRepresent + ", widthPercent=" + this.widthPercent + ", alt=" + this.alt + ")";
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void uploadFailed(@Nullable String s) {
        com.kakao.keditor.plugin.attrs.item.ImageUploadable.DefaultImpls.uploadFailed(this, s);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void uploadSucceed(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "src");
        com.kakao.keditor.plugin.attrs.item.ImageUploadable.DefaultImpls.uploadSucceed(this, s);
        this.setSrc(s);
    }
}

