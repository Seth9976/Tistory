package com.google.firebase.crashlytics.internal.model;

public final class a1 extends Thread {
    public final String a;
    public final int b;
    public final ImmutableList c;

    public a1(String s, int v, ImmutableList immutableList0) {
        this.a = s;
        this.b = v;
        this.c = immutableList0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Thread) {
            String s = ((Thread)object0).getName();
            if(this.a.equals(s)) {
                int v = ((Thread)object0).getImportance();
                if(this.b == v) {
                    ImmutableList immutableList0 = ((Thread)object0).getFrames();
                    return this.c.equals(immutableList0);
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread
    public final ImmutableList getFrames() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread
    public final int getImportance() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread
    public final String getName() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}

