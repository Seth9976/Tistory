package yd;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import kotlin.io.path.CopyActionContext;
import kotlin.io.path.CopyActionResult;
import kotlin.io.path.LinkFollowing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SpreadBuilder;

public final class j extends Lambda implements Function3 {
    public final int w;
    public final boolean x;

    public j(boolean z, int v) {
        this.w = v;
        this.x = z;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((CopyActionContext)object0), "$this$null");
            Intrinsics.checkNotNullParameter(((Path)object1), "src");
            Intrinsics.checkNotNullParameter(((Path)object2), "dst");
            return ((CopyActionContext)object0).copyToIgnoringExistingDirectory(((Path)object1), ((Path)object2), this.x);
        }
        Intrinsics.checkNotNullParameter(((CopyActionContext)object0), "$this$copyToRecursively");
        Intrinsics.checkNotNullParameter(((Path)object1), "src");
        Intrinsics.checkNotNullParameter(((Path)object2), "dst");
        LinkOption[] arr_linkOption = LinkFollowing.INSTANCE.toLinkOptions(this.x);
        boolean z = Files.isDirectory(((Path)object2), ((LinkOption[])Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1)));
        LinkOption[] arr_linkOption1 = (LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length);
        if(!Files.isDirectory(((Path)object1), ((LinkOption[])Arrays.copyOf(arr_linkOption1, arr_linkOption1.length))) || !z) {
            if(z) {
                n.deleteRecursively(((Path)object2));
            }
            SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
            spreadBuilder0.addSpread(arr_linkOption);
            spreadBuilder0.add(StandardCopyOption.REPLACE_EXISTING);
            CopyOption[] arr_copyOption = (CopyOption[])spreadBuilder0.toArray(new CopyOption[spreadBuilder0.size()]);
            Intrinsics.checkNotNullExpressionValue(Files.copy(((Path)object1), ((Path)object2), ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length))), "copy(...)");
        }
        return CopyActionResult.CONTINUE;
    }
}

