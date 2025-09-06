package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

public class JvmDescriptorTypeWriter {
    public int a;
    public Object b;

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if(this.b == null) {
            ++this.a;
        }
    }

    public void writeClass(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "objectType");
        this.writeJvmTypeAsIs(object0);
    }

    public final void writeJvmTypeAsIs(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "type");
        if(this.b == null) {
            if(this.a <= 0) {
                this.b = object0;
                return;
            }
            new StringBuilder().append(p.repeat("[", this.a));
            throw null;
        }
    }

    public void writeTypeVariable(@NotNull Name name0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(object0, "type");
        this.writeJvmTypeAsIs(object0);
    }
}

