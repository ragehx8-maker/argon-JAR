package dev.lvstrng.argon.setting;

public class Setting<T> {
    private final String name;
    private T value;
    private final T defaultValue;
    private final T min;
    private final T max;
    private java.util.function.Predicate<T> visibility;

    public Setting(String name, T defaultValue) {
        this.name = name;
        this.value = defaultValue;
        this.defaultValue = defaultValue;
        this.min = null;
        this.max = null;
    }

    public Setting(String name, T defaultValue, T min, T max) {
        this.name = name;
        this.value = defaultValue;
        this.defaultValue = defaultValue;
        this.min = min;
        this.max = max;
    }

    public Setting(String name, T defaultValue, java.util.function.Predicate<T> visibility) {
        this.name = name;
        this.value = defaultValue;
        this.defaultValue = defaultValue;
        this.min = null;
        this.max = null;
        this.visibility = visibility;
    }

    public Setting(String name, T defaultValue, T min, T max, java.util.function.Predicate<T> visibility) {
        this.name = name;
        this.value = defaultValue;
        this.defaultValue = defaultValue;
        this.min = min;
        this.max = max;
        this.visibility = visibility;
    }

    public String getName() {
        return name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getMin() {
        return min;
    }

    public T getMax() {
        return max;
    }

    public Setting<T> addToGroup(Object group) {
        return this;
    }

    public boolean is(T val) {
        return this.value.equals(val);
    }

    public boolean not(T val) {
        return !this.value.equals(val);
    }
}
