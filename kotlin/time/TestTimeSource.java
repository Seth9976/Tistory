package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.SourceDebugExtension;
import mf.b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000B¨\u0006\r"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "<init>", "()V", "", "read", "()J", "Lkotlin/time/Duration;", "duration", "", "plusAssign-LRDsOJo", "(J)V", "plusAssign", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
public final class TestTimeSource extends AbstractLongTimeSource {
    public long c;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        this.markNow();
    }

    public final void a(long v) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.c + b.shortName(this.getUnit()) + " is advanced by " + Duration.toString-impl(v) + '.');
    }

    public final void plusAssign-LRDsOJo(long v) {
        long v3;
        long v1 = Duration.toLong-impl(v, this.getUnit());
        if(Long.compare(v1 - 1L | 1L, 0x7FFFFFFFFFFFFFFFL) == 0) {
            long v2 = Duration.div-UwyO8pc(v, 2);
            if((1L | Duration.toLong-impl(v2, this.getUnit()) - 1L) != 0x7FFFFFFFFFFFFFFFL) {
                try {
                    v3 = this.c;
                    this.plusAssign-LRDsOJo(v2);
                    this.plusAssign-LRDsOJo(Duration.minus-LRDsOJo(v, v2));
                    return;
                }
                catch(IllegalStateException illegalStateException0) {
                    this.c = v3;
                    throw illegalStateException0;
                }
            }
            this.a(v);
            throw null;
        }
        long v4 = this.c + v1;
        if((v1 ^ this.c) >= 0L && (this.c ^ v4) < 0L) {
            this.a(v);
            throw null;
        }
        this.c = v4;
    }

    @Override  // kotlin.time.AbstractLongTimeSource
    public long read() {
        return this.c;
    }
}

