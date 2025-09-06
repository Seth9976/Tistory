package we;

public final class c extends a {
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a b;

    public c(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a0) {
        this.b = a0;
        super();
    }

    @Override  // we.a
    public final void b(String[] arr_s) {
        if(arr_s == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'result\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
        }
        this.b.a.f = arr_s;
    }
}

