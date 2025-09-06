package yd;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.io.path.CopyActionContext;
import kotlin.io.path.CopyActionResult;
import kotlin.io.path.LinkFollowing;
import kotlin.jvm.internal.Intrinsics;

public final class a implements CopyActionContext {
    public static final a a;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.io.path.CopyActionContext
    public final CopyActionResult copyToIgnoringExistingDirectory(Path path0, Path path1, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(path1, "target");
        LinkOption[] arr_linkOption = LinkFollowing.INSTANCE.toLinkOptions(z);
        LinkOption[] arr_linkOption1 = (LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length);
        if(!Files.isDirectory(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption1, arr_linkOption1.length))) || !Files.isDirectory(path1, ((LinkOption[])Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1)))) {
            CopyOption[] arr_copyOption = (CopyOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length);
            Intrinsics.checkNotNullExpressionValue(Files.copy(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length))), "copy(...)");
        }
        return CopyActionResult.CONTINUE;
    }
}

