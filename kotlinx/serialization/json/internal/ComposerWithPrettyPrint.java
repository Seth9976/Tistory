package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\nJ\u000F\u0010\f\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000F\u0010\r\u001A\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u000F\u0010\u000E\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000E\u0010\n¨\u0006\u000F"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerWithPrettyPrint;", "Lkotlinx/serialization/json/internal/Composer;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/json/Json;)V", "", "indent", "()V", "unIndent", "nextItem", "nextItemIfNotFirst", "space", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composers.kt\nkotlinx/serialization/json/internal/ComposerWithPrettyPrint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
public final class ComposerWithPrettyPrint extends Composer {
    public final Json b;
    public int c;

    public ComposerWithPrettyPrint(@NotNull InternalJsonWriter internalJsonWriter0, @NotNull Json json0) {
        Intrinsics.checkNotNullParameter(internalJsonWriter0, "writer");
        Intrinsics.checkNotNullParameter(json0, "json");
        super(internalJsonWriter0);
        this.b = json0;
    }

    @Override  // kotlinx.serialization.json.internal.Composer
    public void indent() {
        this.setWritingFirst(true);
        ++this.c;
    }

    @Override  // kotlinx.serialization.json.internal.Composer
    public void nextItem() {
        this.setWritingFirst(false);
        this.print("\n");
        int v1 = this.c;
        for(int v = 0; v < v1; ++v) {
            this.print(this.b.getConfiguration().getPrettyPrintIndent());
        }
    }

    @Override  // kotlinx.serialization.json.internal.Composer
    public void nextItemIfNotFirst() {
        if(this.getWritingFirst()) {
            this.setWritingFirst(false);
            return;
        }
        this.nextItem();
    }

    @Override  // kotlinx.serialization.json.internal.Composer
    public void space() {
        this.print(' ');
    }

    @Override  // kotlinx.serialization.json.internal.Composer
    public void unIndent() {
        --this.c;
    }
}

