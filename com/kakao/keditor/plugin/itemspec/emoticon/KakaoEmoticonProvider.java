package com.kakao.keditor.plugin.itemspec.emoticon;

import a5.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\u0016J7\u0010\b\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\b\u0010\n\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\f\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u0007H\u0016¢\u0006\u0002\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/emoticon/KakaoEmoticonProvider;", "Lcom/kakao/keditor/plugin/itemspec/emoticon/KeditorEmoticonProvider;", "()V", "getEmoticonTabIconUri", "", "name", "isActive", "", "getEmoticonUri", "id", "size", "", "hasAnimation", "isThumbnail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZ)Ljava/lang/String;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KakaoEmoticonProvider implements KeditorEmoticonProvider {
    @NotNull
    public static final KakaoEmoticonProvider INSTANCE;

    static {
        KakaoEmoticonProvider.INSTANCE = new KakaoEmoticonProvider();
    }

    @Override  // com.kakao.keditor.plugin.itemspec.emoticon.KeditorEmoticonProvider
    @NotNull
    public String getEmoticonTabIconUri(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "name");
        return z ? "file:///android_asset/emoticons/" + s + "/icon_" + "on" + ".png" : "file:///android_asset/emoticons/" + s + "/icon_" + "off" + ".png";
    }

    @Override  // com.kakao.keditor.plugin.itemspec.emoticon.KeditorEmoticonProvider
    @NotNull
    public String getEmoticonUri(@NotNull String s, @NotNull String s1, @Nullable Integer integer0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "id");
        String s2 = z1 ? "small" : "large";
        return z ? b.q(b.w("https://t1.daumcdn.net/keditor/emoticon/", s, "/", s2, "/"), s1, ".", "gif") : b.q(b.w("https://t1.daumcdn.net/keditor/emoticon/", s, "/", s2, "/"), s1, ".", "png");
    }
}

