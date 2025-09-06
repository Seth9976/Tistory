package we;

public final class g extends a {
    public final h b;

    public g(h h0) {
        this.b = h0;
        super();
    }

    @Override  // we.a
    public final void b(String[] arr_s) {
        if(arr_s == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'data\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
        }
        this.b.a.f = arr_s;
    }
}

