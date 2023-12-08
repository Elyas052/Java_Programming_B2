package day44_map_and_functions.functional_interface;

@FunctionalInterface // SAM
public interface DynamicInterface <T> {
    void test(T t); // // T is a generic type (It can accept any data type), t parameter name

}