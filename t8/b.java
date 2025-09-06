package t8;

import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;

public final class b implements ValueEncoder {
    public final int a;

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        if(this.a != 0) {
            ((ValueEncoderContext)object1).add(((Boolean)object0).booleanValue());
            return;
        }
        ((ValueEncoderContext)object1).add(((String)object0));
    }
}

