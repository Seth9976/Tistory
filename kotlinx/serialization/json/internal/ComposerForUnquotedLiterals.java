package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnquotedLiterals;", "Lkotlinx/serialization/json/internal/Composer;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "", "forceQuoting", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "", "value", "", "printQuoted", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SuppressAnimalSniffer
public final class ComposerForUnquotedLiterals extends Composer {
    public final boolean b;

    public ComposerForUnquotedLiterals(@NotNull InternalJsonWriter internalJsonWriter0, boolean z) {
        Intrinsics.checkNotNullParameter(internalJsonWriter0, "writer");
        super(internalJsonWriter0);
        this.b = z;
    }

    @Override  // kotlinx.serialization.json.internal.Composer
    public void printQuoted(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        if(this.b) {
            super.printQuoted(s);
            return;
        }
        this.print(s);
    }
}

