package a4;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okio.Path.Companion;
import okio.Path;
import wd.l;

public final class b extends Lambda implements Function0 {
    public final Function0 w;

    public b(Function0 function00) {
        this.w = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        File file0 = (File)this.w.invoke();
        if(!Intrinsics.areEqual(l.getExtension(file0), "preferences_pb")) {
            throw new IllegalStateException(("File extension for file: " + file0 + " does not match required extension for Preferences file: preferences_pb").toString());
        }
        File file1 = file0.getAbsoluteFile();
        Intrinsics.checkNotNullExpressionValue(file1, "file.absoluteFile");
        return Companion.get$default(Path.Companion, file1, false, 1, null);
    }
}

