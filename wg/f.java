package wg;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.LongRef;
import okio.BufferedSource;

public final class f extends Lambda implements Function2 {
    public final LongRef A;
    public final LongRef B;
    public final BooleanRef w;
    public final long x;
    public final LongRef y;
    public final BufferedSource z;

    public f(BooleanRef ref$BooleanRef0, long v, LongRef ref$LongRef0, BufferedSource bufferedSource0, LongRef ref$LongRef1, LongRef ref$LongRef2) {
        this.w = ref$BooleanRef0;
        this.x = v;
        this.y = ref$LongRef0;
        this.z = bufferedSource0;
        this.A = ref$LongRef1;
        this.B = ref$LongRef2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((Number)object1).longValue();
        if(((Number)object0).intValue() == 1) {
            BooleanRef ref$BooleanRef0 = this.w;
            if(ref$BooleanRef0.element) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            ref$BooleanRef0.element = true;
            if(v < this.x) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            LongRef ref$LongRef0 = this.y;
            long v1 = ref$LongRef0.element;
            BufferedSource bufferedSource0 = this.z;
            if(Long.compare(v1, 0xFFFFFFFFL) == 0) {
                v1 = bufferedSource0.readLongLe();
            }
            ref$LongRef0.element = v1;
            long v2 = 0L;
            this.A.element = Long.compare(this.A.element, 0xFFFFFFFFL) == 0 ? bufferedSource0.readLongLe() : 0L;
            LongRef ref$LongRef1 = this.B;
            if(ref$LongRef1.element == 0xFFFFFFFFL) {
                v2 = bufferedSource0.readLongLe();
            }
            ref$LongRef1.element = v2;
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}

