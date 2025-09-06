package coil.decode;

import coil.annotation.ExperimentalCoilApi;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@ExperimentalCoilApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\tR\u001A\u0010\r\u001A\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000B\u0010\f\u001A\u0004\b\n\u0010\t¨\u0006\u000E"}, d2 = {"Lcoil/decode/AssetMetadata;", "Lcoil/decode/ImageSource$Metadata;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getFilePath", "()Ljava/lang/String;", "getFileName", "getFileName$annotations", "()V", "fileName", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AssetMetadata extends coil.decode.ImageSource.Metadata {
    public final String a;

    public AssetMetadata(@NotNull String s) {
        this.a = s;
    }

    @NotNull
    public final String getFileName() {
        return StringsKt__StringsKt.substringAfterLast$default(this.a, '/', null, 2, null);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to filePath as it supports assets inside subfolders.")
    public static void getFileName$annotations() {
    }

    @NotNull
    public final String getFilePath() {
        return this.a;
    }
}

