package wg;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import okio.BufferedSource;

public final class g extends Lambda implements Function2 {
    public final BufferedSource w;
    public final ObjectRef x;
    public final ObjectRef y;
    public final ObjectRef z;

    public g(BufferedSource bufferedSource0, ObjectRef ref$ObjectRef0, ObjectRef ref$ObjectRef1, ObjectRef ref$ObjectRef2) {
        this.w = bufferedSource0;
        this.x = ref$ObjectRef0;
        this.y = ref$ObjectRef1;
        this.z = ref$ObjectRef2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = 1L;
        long v1 = ((Number)object1).longValue();
        if(((Number)object0).intValue() == 0x5455) {
            if(Long.compare(v1, 1L) < 0) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            BufferedSource bufferedSource0 = this.w;
            int v2 = bufferedSource0.readByte();
            boolean z = true;
            boolean z1 = (v2 & 1) == 1;
            boolean z2 = (v2 & 2) == 2;
            if((v2 & 4) != 4) {
                z = false;
            }
            if(z1) {
                v = 5L;
            }
            if(z2) {
                v += 4L;
            }
            if(z) {
                v += 4L;
            }
            if(v1 < v) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if(z1) {
                this.x.element = (long)(((long)bufferedSource0.readIntLe()) * 1000L);
            }
            if(z2) {
                this.y.element = (long)(((long)bufferedSource0.readIntLe()) * 1000L);
            }
            if(z) {
                this.z.element = (long)(((long)bufferedSource0.readIntLe()) * 1000L);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}

