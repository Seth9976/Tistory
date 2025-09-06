package q5;

import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Source;
import retrofit2.q;

public final class a extends ForwardingSource {
    public final int b;
    public Object c;

    public a(Source source0) {
        this.b = 0;
        super(source0);
    }

    public a(q q0, BufferedSource bufferedSource0) {
        this.b = 1;
        this.c = q0;
        super(bufferedSource0);
    }

    @Override  // okio.ForwardingSource
    public final long read(Buffer buffer0, long v) {
        if(this.b != 0) {
            try {
                return super.read(buffer0, v);
            }
            catch(IOException iOException0) {
                ((q)this.c).d = iOException0;
                throw iOException0;
            }
        }
        try {
            return super.read(buffer0, v);
        }
        catch(Exception exception0) {
            this.c = exception0;
            throw exception0;
        }
    }
}

