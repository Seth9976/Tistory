package com.kakao.keditor.plugin.itemspec.video;

import androidx.room.a;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.media.MediaItem;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Ready;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.attrs.Style.Center;
import com.kakao.keditor.plugin.attrs.Style;
import com.kakao.keditor.plugin.attrs.item.Location;
import com.kakao.keditor.plugin.attrs.item.MobileStyle.Companion;
import com.kakao.keditor.plugin.attrs.item.MobileStyle;
import com.kakao.keditor.plugin.attrs.item.Styled.DefaultImpls;
import com.kakao.keditor.plugin.attrs.item.Styled;
import com.kakao.keditor.plugin.attrs.item.VideoUploadable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "video")
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u0006\u0010H\u001A\u00020IJ\b\u0010J\u001A\u00020\u0006H\u0016J\u0010\u0010K\u001A\u00020L2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0006J\u0010\u0010M\u001A\u00020L2\u0006\u0010N\u001A\u00020\u0006H\u0016R\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001E\u0010\u000B\u001A\u0004\u0018\u00010\fX\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0011\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R(\u0010\u0013\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u0006@@X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR\u001A\u0010\u0016\u001A\u00020\u0017X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\u001A\u0010\u001C\u001A\u00020\u001DX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R$\u0010$\u001A\u00020#2\u0006\u0010\"\u001A\u00020#@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001A\u0010)\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001A\u0010.\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b/\u0010+\"\u0004\b0\u0010-R\u0014\u00101\u001A\u00020\u00068VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b2\u0010\bR(\u00103\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u0006@@X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b4\u0010\b\"\u0004\b5\u0010\nR$\u00107\u001A\u0002062\u0006\u0010\"\u001A\u000206@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b8\u00109\"\u0004\b:\u0010;R\u001A\u0010<\u001A\u00020\u0006X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b=\u0010\b\"\u0004\b>\u0010\nR\u001C\u0010?\u001A\u0004\u0018\u00010\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b@\u0010\b\"\u0004\bA\u0010\nR$\u0010B\u001A\u00020\u00062\u0006\u0010\"\u001A\u00020\u0006@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bC\u0010\b\"\u0004\bD\u0010\nR\u001E\u0010E\u001A\u0004\u0018\u00010\fX\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0011\u001A\u0004\bF\u0010\u000E\"\u0004\bG\u0010\u0010\u00A8\u0006O"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/video/VideoItem;", "Lcom/kakao/keditor/media/MediaItem;", "Lcom/kakao/keditor/plugin/attrs/item/VideoUploadable;", "Lcom/kakao/keditor/plugin/attrs/item/Styled;", "()V", "caption", "", "getCaption", "()Ljava/lang/String;", "setCaption", "(Ljava/lang/String;)V", "height", "", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "<set-?>", "host", "getHost", "setHost$keditor_release", "loadingStatus", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "getLoadingStatus", "()Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "setLoadingStatus", "(Lcom/kakao/keditor/plugin/attrs/LoadingStatus;)V", "location", "Lcom/kakao/keditor/plugin/attrs/item/Location;", "getLocation", "()Lcom/kakao/keditor/plugin/attrs/item/Location;", "setLocation", "(Lcom/kakao/keditor/plugin/attrs/item/Location;)V", "value", "Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "mobileStyle", "getMobileStyle", "()Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "setMobileStyle", "(Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;)V", "originHeight", "getOriginHeight", "()I", "setOriginHeight", "(I)V", "originWidth", "getOriginWidth", "setOriginWidth", "path", "getPath", "service", "getService", "setService$keditor_release", "Lcom/kakao/keditor/plugin/attrs/Style;", "style", "getStyle", "()Lcom/kakao/keditor/plugin/attrs/Style;", "setStyle", "(Lcom/kakao/keditor/plugin/attrs/Style;)V", "thumbnail", "getThumbnail", "setThumbnail", "title", "getTitle", "setTitle", "url", "getUrl", "setUrl", "width", "getWidth", "setWidth", "isYoutubeHost", "", "toString", "updateHostInfo", "", "uploadSucceed", "src", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVideoItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoItem.kt\ncom/kakao/keditor/plugin/itemspec/video/VideoItem\n+ 2 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,70:1\n136#2,12:71\n136#2,12:83\n*S KotlinDebug\n*F\n+ 1 VideoItem.kt\ncom/kakao/keditor/plugin/itemspec/video/VideoItem\n*L\n35#1:71,12\n58#1:83,12\n*E\n"})
public final class VideoItem extends MediaItem implements Styled, VideoUploadable {
    @Nullable
    private String caption;
    @Nullable
    private Integer height;
    @Nullable
    private String host;
    @NotNull
    private LoadingStatus loadingStatus;
    @NotNull
    private Location location;
    @NotNull
    private MobileStyle mobileStyle;
    private int originHeight;
    private int originWidth;
    @Nullable
    private String service;
    @NotNull
    private Style style;
    @NotNull
    private String thumbnail;
    @Nullable
    private String title;
    @NotNull
    private String url;
    @Nullable
    private Integer width;

    public VideoItem() {
        this.url = "";
        this.style = Center.INSTANCE;
        Companion mobileStyle$Companion0 = MobileStyle.Companion;
        Object object0 = Keditor.INSTANCE.getConfig().get("video_style");
        String s = null;
        if(!(object0 instanceof List)) {
            object0 = null;
        }
        List list0 = (List)object0;
        if(list0 == null) {
            list0 = null;
        }
        if(list0 != null) {
            s = (String)CollectionsKt___CollectionsKt.first(list0);
        }
        this.mobileStyle = mobileStyle$Companion0.byName("width" + s);
        this.thumbnail = "";
        this.location = Location.LOCAL;
        this.loadingStatus = Ready.INSTANCE;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Styled
    @NotNull
    public Alignment getAlignment() {
        return DefaultImpls.getAlignment(this);
    }

    @Nullable
    public final String getCaption() {
        return this.caption;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    @Nullable
    public Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final String getHost() {
        return this.host;
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

    @Override  // com.kakao.keditor.plugin.attrs.item.Styled
    @NotNull
    public MobileStyle getMobileStyle() {
        return this.mobileStyle;
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
    @NotNull
    public String getPath() {
        return this.getUrl();
    }

    @Nullable
    public final String getService() {
        return this.service;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Styled
    @NotNull
    public Style getStyle() {
        return this.style;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.VideoUploadable
    @NotNull
    public String getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.VideoUploadable
    @NotNull
    public String getUrl() {
        return this.url;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    @Nullable
    public Integer getWidth() {
        return this.width;
    }

    public final boolean isYoutubeHost() {
        String s = this.host;
        if(s != null) {
            String s1 = s.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(s1, "toLowerCase(...)");
            return Intrinsics.areEqual(s1, "youtube");
        }
        return Intrinsics.areEqual(null, "youtube");
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Styled
    public void setAlignment(@NotNull Alignment alignment0) {
        DefaultImpls.setAlignment(this, alignment0);
    }

    public final void setCaption(@Nullable String s) {
        this.caption = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setHeight(@Nullable Integer integer0) {
        this.height = integer0;
    }

    public final void setHost$keditor_release(@Nullable String s) {
        this.host = s;
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

    @Override  // com.kakao.keditor.plugin.attrs.item.Styled
    public void setMobileStyle(@NotNull MobileStyle mobileStyle0) {
        Intrinsics.checkNotNullParameter(mobileStyle0, "value");
        this.removeBypass("mobileStyle");
        this.mobileStyle = mobileStyle0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setOriginHeight(int v) {
        this.originHeight = v;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setOriginWidth(int v) {
        this.originWidth = v;
    }

    public final void setService$keditor_release(@Nullable String s) {
        this.service = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Styled
    public void setStyle(@NotNull Style style0) {
        Intrinsics.checkNotNullParameter(style0, "value");
        this.removeBypass("style");
        this.style = style0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.VideoUploadable
    public void setThumbnail(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.thumbnail = s;
    }

    public final void setTitle(@Nullable String s) {
        this.title = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.VideoUploadable
    public void setUrl(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.url = s;
        this.setLocation((new Regex("https?://").containsMatchIn(s) ? Location.UPLOADED : Location.LOCAL));
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setWidth(@Nullable Integer integer0) {
        this.width = integer0;
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.service;
        String s1 = this.host;
        String s2 = this.caption;
        String s3 = this.title;
        StringBuilder stringBuilder0 = new StringBuilder("VideoItem(url=\'");
        stringBuilder0.append(this.getUrl());
        stringBuilder0.append("\', width=");
        stringBuilder0.append(this.getWidth());
        stringBuilder0.append(", height=");
        stringBuilder0.append(this.getHeight());
        stringBuilder0.append(", originWidth=");
        stringBuilder0.append(this.getOriginWidth());
        stringBuilder0.append(", originHeight=");
        stringBuilder0.append(this.getOriginHeight());
        stringBuilder0.append(", style=");
        stringBuilder0.append(this.getStyle());
        stringBuilder0.append(", mobileStyle=");
        stringBuilder0.append(this.getMobileStyle());
        stringBuilder0.append(", thumbnail=\'");
        stringBuilder0.append(this.getThumbnail());
        stringBuilder0.append("\', service=");
        a.w(stringBuilder0, s, ", host=", s1, ", caption=");
        a.w(stringBuilder0, s2, ", title=", s3, ", location=");
        stringBuilder0.append(this.getLocation());
        stringBuilder0.append(", loadingStatus=");
        stringBuilder0.append(this.getLoadingStatus());
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    public final void updateHostInfo(@Nullable String s) {
        this.host = s;
        if(Intrinsics.areEqual(s, "kakaotv") && (this.service == null || this.service.length() == 0)) {
            Object object0 = Keditor.INSTANCE.getConfig().get("kakao_tv_service_name");
            String s1 = null;
            if(!(object0 instanceof String)) {
                object0 = null;
            }
            if(((String)object0) != null) {
                s1 = (String)object0;
            }
            if(s1 == null) {
                s1 = "kakao_tv";
            }
            this.service = s1;
        }
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void uploadFailed(@Nullable String s) {
        com.kakao.keditor.plugin.attrs.item.VideoUploadable.DefaultImpls.uploadFailed(this, s);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void uploadSucceed(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "src");
        com.kakao.keditor.plugin.attrs.item.VideoUploadable.DefaultImpls.uploadSucceed(this, s);
        this.setUrl(s);
    }
}

