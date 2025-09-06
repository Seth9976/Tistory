package com.kakao.keditor.plugin.attrs.item;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\f\u001A\u00020\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\tH\u0016R\u0018\u0010\u0002\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/item/Uploadable;", "", "location", "Lcom/kakao/keditor/plugin/attrs/item/Location;", "getLocation", "()Lcom/kakao/keditor/plugin/attrs/item/Location;", "setLocation", "(Lcom/kakao/keditor/plugin/attrs/item/Location;)V", "path", "", "getPath", "()Ljava/lang/String;", "uploadFailed", "", "reason", "uploadSucceed", "src", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Uploadable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void uploadFailed(@NotNull Uploadable uploadable0, @Nullable String s) {
            uploadable0.setLocation(Location.FAILED);
        }

        public static void uploadFailed$default(Uploadable uploadable0, String s, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadFailed");
            }
            if((v & 1) != 0) {
                s = null;
            }
            uploadable0.uploadFailed(s);
        }

        public static void uploadSucceed(@NotNull Uploadable uploadable0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "src");
            uploadable0.setLocation(Location.UPLOADED);
        }
    }

    @NotNull
    Location getLocation();

    @Nullable
    String getPath();

    void setLocation(@NotNull Location arg1);

    void uploadFailed(@Nullable String arg1);

    void uploadSucceed(@NotNull String arg1);
}

