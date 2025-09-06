package q6;

import com.google.android.datatransport.Event;
import com.google.android.datatransport.Priority;

public final class a extends Event {
    public final Integer a;
    public final Object b;
    public final Priority c;

    public a(Integer integer0, Object object0, Priority priority0) {
        this.a = integer0;
        if(object0 == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = object0;
        if(priority0 == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = priority0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Event) {
            Integer integer0 = this.a;
            if(integer0 != null) {
                if(integer0.equals(((Event)object0).getCode())) {
                label_8:
                    Object object1 = ((Event)object0).getPayload();
                    if(this.b.equals(object1)) {
                        Priority priority0 = ((Event)object0).getPriority();
                        return this.c.equals(priority0);
                    }
                }
            }
            else if(((Event)object0).getCode() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.Event
    public final Integer getCode() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.Event
    public final Object getPayload() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.Event
    public final Priority getPriority() {
        return this.c;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? (0xD5009D89 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode() : ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + "}";
    }
}

