package we;

public final class b extends a {
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a b;

    public b(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a0) {
        this.b = a0;
        super();
    }

    @Override  // we.a
    public final void b(String[] arr_s) {
        if(arr_s == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'result\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
        }
        this.b.a.e = arr_s;
    }
}

