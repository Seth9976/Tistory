package kotlin.io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yd.d;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib-jdk7"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class PathTreeWalkKt {
    public static final boolean access$createsCycle(d d0) {
        d d1 = d0.c;
        while(d1 != null) {
            Object object0 = d1.b;
            if(object0 == null) {
                try {
                label_8:
                    if(!Files.isSameFile(d1.a, d0.a)) {
                        goto label_9;
                    }
                    return true;
                }
                catch(IOException | SecurityException unused_ex) {
                }
            }
            else {
                Object object1 = d0.b;
                if(object1 == null) {
                    goto label_8;
                }
                else if(Intrinsics.areEqual(object0, object1)) {
                    return true;
                }
            }
        label_9:
            d1 = d1.c;
        }
        return false;
    }

    public static final Object access$keyOf(Path path0, LinkOption[] arr_linkOption) {
        try {
            LinkOption[] arr_linkOption1 = (LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length);
            LinkOption[] arr_linkOption2 = (LinkOption[])Arrays.copyOf(arr_linkOption1, arr_linkOption1.length);
            BasicFileAttributes basicFileAttributes0 = Files.readAttributes(path0, BasicFileAttributes.class, arr_linkOption2);
            Intrinsics.checkNotNullExpressionValue(basicFileAttributes0, "readAttributes(...)");
            return basicFileAttributes0.fileKey();
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }
}

