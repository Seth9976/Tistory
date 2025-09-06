package com.kakao.keditor.plugin.attrs.item;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\u000E\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\n\u0010\u0007\u001A\u0004\u0018\u00010\u0006H&J\u0010\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0006H&J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0006H&¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/item/RepresentativeImageProvider;", "", "containsRepresentativeImage", "", "getImageSrcList", "", "", "getRepresentativeImage", "hasImage", "representativeImageSrc", "setRepresentativeImage", "", "representativeImage", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface RepresentativeImageProvider {
    boolean containsRepresentativeImage();

    @NotNull
    List getImageSrcList();

    @Nullable
    String getRepresentativeImage();

    boolean hasImage(@NotNull String arg1);

    void setRepresentativeImage(@NotNull String arg1);
}

