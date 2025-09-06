package t8;

import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class c implements ValueEncoder {
    public static final SimpleDateFormat a;

    static {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'", Locale.US);
        c.a = simpleDateFormat0;
        simpleDateFormat0.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        ((ValueEncoderContext)object1).add(c.a.format(((Date)object0)));
    }
}

