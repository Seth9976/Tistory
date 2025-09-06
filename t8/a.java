package t8;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.c;
import java.util.Map.Entry;

public final class a implements ObjectEncoder {
    public final int a;

    public a(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        switch(this.a) {
            case 0: {
                ObjectEncoderContext objectEncoderContext1 = (ObjectEncoderContext)object1;
                throw new EncodingException("Couldn\'t find encoder for type " + object0.getClass().getCanonicalName());
            }
            case 1: {
                Object object2 = ((Map.Entry)object0).getKey();
                ((ObjectEncoderContext)object1).add(c.g, object2);
                Object object3 = ((Map.Entry)object0).getValue();
                ((ObjectEncoderContext)object1).add(c.h, object3);
                return;
            }
            default: {
                ObjectEncoderContext objectEncoderContext0 = (ObjectEncoderContext)object1;
                throw new EncodingException("Couldn\'t find encoder for type " + object0.getClass().getCanonicalName());
            }
        }
    }
}

