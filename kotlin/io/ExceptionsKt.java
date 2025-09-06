package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ExceptionsKt {
    public static final String access$constructMessage(File file0, File file1, String s) {
        StringBuilder stringBuilder0 = new StringBuilder(file0.toString());
        if(file1 != null) {
            stringBuilder0.append(" -> " + file1);
        }
        if(s != null) {
            stringBuilder0.append(": " + s);
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
        return s1;
    }
}

