package u8;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.proto.c;

public final class b implements ValueEncoderContext {
    public boolean a;
    public boolean b;
    public FieldDescriptor c;
    public final c d;

    public b(c c0) {
        this.a = false;
        this.b = false;
        this.d = c0;
    }

    public final void a() {
        if(this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(double f) {
        this.a();
        this.d.b(this.c, f, this.b);
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(float f) {
        this.a();
        this.d.c(this.c, f, this.b);
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(int v) {
        this.a();
        this.d.d(this.c, v, this.b);
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(long v) {
        this.a();
        this.d.e(this.c, v, this.b);
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String s) {
        this.a();
        this.d.a(this.c, s, this.b);
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        this.a();
        this.d.d(this.c, ((int)z), this.b);
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(byte[] arr_b) {
        this.a();
        this.d.a(this.c, arr_b, this.b);
        return this;
    }
}

