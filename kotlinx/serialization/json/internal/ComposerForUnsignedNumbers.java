package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000B\u0010\u000EJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u000B\u0010\u0010J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u000B\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "", "forceQuoting", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "", "v", "", "print", "(I)V", "", "(J)V", "", "(B)V", "", "(S)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SuppressAnimalSniffer
public final class ComposerForUnsignedNumbers extends Composer {
    public final boolean b;

    public ComposerForUnsignedNumbers(@NotNull InternalJsonWriter internalJsonWriter0, boolean z) {
        Intrinsics.checkNotNullParameter(internalJsonWriter0, "writer");
        super(internalJsonWriter0);
        this.b = z;
    }

    @Override  // kotlinx.serialization.json.internal.Composer
    public void print(byte b) {
        String s = UByte.toString-impl(b);
        if(this.b) {
            this.printQuoted(s);
            return;
        }
        this.print(s);
    }

    @Override  // kotlinx.serialization.json.internal.Composer
    public void print(int v) {
        String s = Integer.toUnsignedString(v);
        if(this.b) {
            this.printQuoted(s);
            return;
        }
        this.print(s);
    }

    @Override  // kotlinx.serialization.json.internal.Composer
    public void print(long v) {
        String s = Long.toUnsignedString(v);
        if(this.b) {
            this.printQuoted(s);
            return;
        }
        this.print(s);
    }

    @Override  // kotlinx.serialization.json.internal.Composer
    public void print(short v) {
        String s = UShort.toString-impl(v);
        if(this.b) {
            this.printQuoted(s);
            return;
        }
        this.print(s);
    }
}

