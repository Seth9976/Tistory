package com.kakao.keditor.plugin.itemspec.emoticon;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&J9\u0010\u0007\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\b\u0010\t\u001A\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006H&¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/emoticon/KeditorEmoticonProvider;", "", "getEmoticonTabIconUri", "", "name", "isActive", "", "getEmoticonUri", "id", "size", "", "hasAnimation", "isThumbnail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZ)Ljava/lang/String;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface KeditorEmoticonProvider {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static String getEmoticonUri$default(KeditorEmoticonProvider keditorEmoticonProvider0, String s, String s1, Integer integer0, boolean z, boolean z1, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEmoticonUri");
            }
            if((v & 8) != 0) {
                z = false;
            }
            return keditorEmoticonProvider0.getEmoticonUri(s, s1, integer0, z, z1);
        }
    }

    @NotNull
    String getEmoticonTabIconUri(@NotNull String arg1, boolean arg2);

    @NotNull
    String getEmoticonUri(@NotNull String arg1, @NotNull String arg2, @Nullable Integer arg3, boolean arg4, boolean arg5);
}

