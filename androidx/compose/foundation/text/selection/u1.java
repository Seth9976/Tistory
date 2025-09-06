package androidx.compose.foundation.text.selection;

public final class u1 implements OffsetProvider {
    public final TextFieldSelectionManager a;
    public final boolean b;

    public u1(TextFieldSelectionManager textFieldSelectionManager0, boolean z) {
        this.a = textFieldSelectionManager0;
        this.b = z;
    }

    @Override  // androidx.compose.foundation.text.selection.OffsetProvider
    public final long provide-F1C5BW0() {
        return this.a.getHandlePosition-tuRUvjQ$foundation_release(this.b);
    }
}

