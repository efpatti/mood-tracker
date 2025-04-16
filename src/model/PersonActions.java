package model;

public abstract class PersonActions {
    public void applyActionByCode(int code) {
        Mood mood = Mood.fromCode(code);
        mood.apply(getThis());
    }

    protected abstract Person getThis(); 
}
