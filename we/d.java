package we;

public final class d extends a {
    public final e b;

    public d(e e0) {
        this.b = e0;
        super();
    }

    @Override  // we.a
    public final void b(String[] arr_s) {
        if(arr_s == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'result\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
        }
        this.b.a.i = arr_s;
    }
}

